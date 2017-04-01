testType=orig
experiment=jodatime
experimentCP=impact-tools/*:bin/:resources/:lib/*
numTimesToRun=9999
crossReferenceClass=edu.washington.cs.dt.impact.tools.CrossReferencer

function clearEnv() {
  :
}

source ../config.sh

ant

j=0
k=0
while [ $k -le $numTimesToRun ] 
do
  echo '======================= Start ' $k ' ======================='
  clearEnv
  java -cp $experimentCP edu.washington.cs.dt.main.ImpactMain -inputTests deterministic-order > $experiment-$testType-order-results.txt
  clearEnv
  java -cp $experimentCP edu.washington.cs.dt.main.ImpactMain -inputTests deterministic-order > $experiment-$testType-rerun-results.txt

  java -cp $experimentCP $crossReferenceClass -origOrder $experiment-$testType-order-results.txt -testOrder $experiment-$testType-rerun-results.txt > cross-referencer-file

  if [ $(($k % 100)) = 0 ] ; then
    j=$(($j+1))
    echo "" > debug.log$j
  fi

  echo '======================= Start ' $k ' =======================' >> debug.log$j
  cat cross-referencer-file >> debug.log$j
  echo "" >> debug.log$j

  java -cp $experimentCP edu.washington.cs.dt.impact.tools.UndeterministicTestFinder -undeterministicTestFile undeterminisitic-order -deterministicTestFile deterministic-order -crossReferenceFile cross-referencer-file -randomizeDeterministicTests
  k=$(($k+1))
done

clearEnv

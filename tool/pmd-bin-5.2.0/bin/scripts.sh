#!/bin/bash

echo "Starting script..."

PROJECTSDIR='./../../../data'

function runCrystal() {
	echo "Starting Crystal..."

	rm -rf crystalResults
	mkdir crystalResults

	./run.sh pmd -d ${PROJECTSDIR}/crystalvc/ -R tmd-testsCall 		> crystalResults/crystalTestsCallingTests.txt
	./run.sh pmd -d ${PROJECTSDIR}/crystalvc/ -R tmd-sf 			> crystalResults/crystalSharedStaticFields.txt
	./run.sh pmd -d ${PROJECTSDIR}/crystalvc/ -R tmd-file 			> crystalResults/crystalSharedStream.txt
	./run.sh pmd -d ${PROJECTSDIR}/crystalvc/ -R tmd-sleep 			> crystalResults/crystalTimingDependency.txt
	./run.sh pmd -d ${PROJECTSDIR}/crystalvc/ -R tmd-systemCalls 	> crystalResults/crystalSystemDependency.txt
	./run.sh pmd -d ${PROJECTSDIR}/crystalvc/ -R tmd-url 			> crystalResults/crystalNetworkDependency.txt

	echo "Crystal is done."
}

function runSynoptic() {
	echo "Starting Synoptic..."

	rm -rf synopticResults
	mkdir synopticResults

	./run.sh pmd -d ${PROJECTSDIR}/dynoptic/ -R tmd-testsCall 		> synopticResults/synopticTestsCallingTests.txt
	./run.sh pmd -d ${PROJECTSDIR}/dynoptic/ -R tmd-sf 				> synopticResults/synopticSharedStaticFields.txt
	./run.sh pmd -d ${PROJECTSDIR}/dynoptic/ -R tmd-file 			> synopticResults/synopticSharedStream.txt
	./run.sh pmd -d ${PROJECTSDIR}/dynoptic/ -R tmd-sleep 			> synopticResults/synopticTimingDependency.txt
	./run.sh pmd -d ${PROJECTSDIR}/dynoptic/ -R tmd-systemCalls 	> synopticResults/synopticSystemDependency.txt
	./run.sh pmd -d ${PROJECTSDIR}/dynoptic/ -R tmd-url 			> synopticResults/synopticNetworkDependency.txt

	echo "Synoptic is done."
}

function runJFree() {
	echo "Starting JFreechart..."

	rm -rf jfreechartResults
	mkdir jfreechartResults

	./run.sh pmd -d ${PROJECTSDIR}/jfreechart-1.0.15/ -R tmd-testsCall 		> jfreechartResults/jfreechartTestsCallingTests.txt
	./run.sh pmd -d ${PROJECTSDIR}/jfreechart-1.0.15/ -R tmd-sf 			> jfreechartResults/jfreechartSharedStaticFields.txt
	./run.sh pmd -d ${PROJECTSDIR}/jfreechart-1.0.15/ -R tmd-file 			> jfreechartResults/jfreechartSharedStream.txt
	./run.sh pmd -d ${PROJECTSDIR}/jfreechart-1.0.15/ -R tmd-sleep 			> jfreechartResults/jfreechartTimingDependency.txt
	./run.sh pmd -d ${PROJECTSDIR}/jfreechart-1.0.15/ -R tmd-systemCalls 	> jfreechartResults/jfreechartSystemDependency.txt
	./run.sh pmd -d ${PROJECTSDIR}/jfreechart-1.0.15/ -R tmd-url 			> jfreechartResults/jfreechartNetworkDependency.txt

	echo "JFreechart is done."
}

function runJodaTime() {
	echo "Starting Joda-Time..."

	rm -rf jodatimeResults
	mkdir jodatimeResults

	./run.sh pmd -d ${PROJECTSDIR}/jodatime-b609d7d66d/ -R tmd-testsCall 	> jodatimeResults/jodatimeTestsCallingTests.txt
	./run.sh pmd -d ${PROJECTSDIR}/jodatime-b609d7d66d/ -R tmd-sf 			> jodatimeResults/jodatimeSharedStaticFields.txt
	./run.sh pmd -d ${PROJECTSDIR}/jodatime-b609d7d66d/ -R tmd-file 		> jodatimeResults/jodatimeSharedStream.txt
	./run.sh pmd -d ${PROJECTSDIR}/jodatime-b609d7d66d/ -R tmd-sleep 		> jodatimeResults/jodatimeTimingDependency.txt
	./run.sh pmd -d ${PROJECTSDIR}/jodatime-b609d7d66d/ -R tmd-systemCalls 	> jodatimeResults/jodatimeSystemDependency.txt
	./run.sh pmd -d ${PROJECTSDIR}/jodatime-b609d7d66d/ -R tmd-url 			> jodatimeResults/jodatimeNetworkDependency.txt

	echo "Joda-Time is done."
}

function runXML() {
	echo "Starting XML Security..."

	rm -rf xmlsecurityResults
	mkdir xmlsecurityResults

	./run.sh pmd -d ${PROJECTSDIR}/xml-security-orig-v1/ -R tmd-testsCall 	> xmlsecurityResults/xmlsecurityTestsCallingTests.txt
	./run.sh pmd -d ${PROJECTSDIR}/xml-security-orig-v1/ -R tmd-sf 			> xmlsecurityResults/xmlsecuritySharedStaticFields.txt
	./run.sh pmd -d ${PROJECTSDIR}/xml-security-orig-v1/ -R tmd-file 		> xmlsecurityResults/xmlsecuritySharedStream.txt
	./run.sh pmd -d ${PROJECTSDIR}/xml-security-orig-v1/ -R tmd-sleep 		> xmlsecurityResults/xmlsecurityTimingDependency.txt
	./run.sh pmd -d ${PROJECTSDIR}/xml-security-orig-v1/ -R tmd-systemCalls > xmlsecurityResults/xmlsecuritySystemDependency.txt
	./run.sh pmd -d ${PROJECTSDIR}/xml-security-orig-v1/ -R tmd-url 		> xmlsecurityResults/xmlsecurityNetworkDependency.txt

	echo "XML Security is done."
}


runCrystal
runSynoptic
runJFree
runJodaTime
runXML

echo "Script finished."
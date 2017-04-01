package randoop.xmlsecurity;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    boolean var0 = org.apache.xml.security.Init.isInitialized();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = org.apache.xml.security.utils.ElementProxy.getDefaultPrefix("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.stringToHexString("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "68 69 21 "+ "'", var1.equals("68 69 21 "));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toBinaryString((short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00000000 00000000"+ "'", var1.equals("00000000 00000000"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var1 = org.apache.xml.security.utils.ElementProxy.getDefaultPrefix("68 69 21 ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String var1 = org.apache.xml.security.utils.I18n.translate("68 69 21 ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "No message with ID \"68 69 21 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var1.equals("No message with ID \"68 69 21 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    org.apache.xml.security.utils.HexDump.setDebug(false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String var0 = org.apache.xml.security.utils.XMLUtils.getXercesVersion();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "Xerces-J 2.0.0"+ "'", var0.equals("Xerces-J 2.0.0"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String var1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeAttr("68 69 21 ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "68 69 21 "+ "'", var1.equals("68 69 21 "));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.String var1 = org.apache.xml.security.utils.RFC2253Parser.xmldsigtoRFC2253("No message with ID \"68 69 21 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "No message with ID \"68 69 21 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var1.equals("No message with ID \"68 69 21 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    org.apache.xml.security.algorithms.JCEMapper.ProviderIdClass var1 = org.apache.xml.security.algorithms.JCEMapper.translateURItoJCEID("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    org.apache.xml.security.c14n.helper.AlwaysAcceptNodeFilter var0 = new org.apache.xml.security.c14n.helper.AlwaysAcceptNodeFilter();

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    int var1 = org.apache.xml.security.algorithms.JCEMapper.getKeyLengthFromURI("No message with ID \"68 69 21 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    org.apache.xml.security.keys.keyresolver.KeyResolver.register("hi!");

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    org.apache.xml.security.utils.HexDump.setByteSeparator('a');

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.String var1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeAttr("00 34 00 20 00 00");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00 34 00 20 00 00"+ "'", var1.equals("00 34 00 20 00 00"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    org.apache.xml.security.utils.ElementProxy.setDefaultPrefix("00 34 00 20 00 00", "00000000 00000000");

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    org.apache.xml.security.utils.I18n.init("00 34 00 20 00 00", "hi!");

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    int var2 = org.apache.xml.security.encryption.EncryptedData.min(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.String var2 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.expandSystemId("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    org.apache.xml.security.Init var0 = new org.apache.xml.security.Init();

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toString((byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\u00FF"+ "'", var1.equals("\u00FF"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    org.apache.xml.security.keys.keyresolver.KeyResolver.init();

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    boolean var1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsAbsolute("00000000 00000000");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.String var1 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.makeFilesystemToURI("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    org.apache.xml.security.utils.EncryptionConstants.setEncryptionSpecNSprefix("Xerces-J 2.0.0");

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.String var1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeAttr("Xerces-J 2.0.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Xerces-J 2.0.0"+ "'", var1.equals("Xerces-J 2.0.0"));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toHexString((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "FFaFFaFFaFFa"+ "'", var1.equals("FFaFFaFFaFFa"));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    org.apache.xml.security.utils.resolver.ResourceResolver.register("No message with ID \"68 69 21 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.Object[] var2 = new java.lang.Object[] { 0.0f};
    java.lang.Object[] var8 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var9 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var8);
    org.apache.xml.security.transforms.TransformationException var11 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var12 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var8, (java.lang.Exception)var11);
    org.apache.xml.security.signature.ReferenceNotInitializedException var13 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00000000 00000000", var8);
    org.apache.xml.security.c14n.CanonicalizationException var14 = new org.apache.xml.security.c14n.CanonicalizationException("68 69 21 ", var8);
    org.apache.xml.security.exceptions.XMLSecurityException var15 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2001/04/xmlenc#kw-aes192", var2, (java.lang.Exception)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.lang.Object[] var4 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var5 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var4);
    org.apache.xml.security.transforms.TransformationException var7 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var8 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var4, (java.lang.Exception)var7);
    org.apache.xml.security.signature.XMLSignatureException var9 = new org.apache.xml.security.signature.XMLSignatureException("00000000 00000000", (java.lang.Exception)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.lang.String var1 = org.apache.xml.security.utils.XMLUtils.getNodeTypeString((short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    boolean var1 = org.apache.xml.security.algorithms.JCEMapper.getProviderIsInClassPath("0000: 01                                                 .\r\n");

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    org.apache.xml.security.signature.InvalidDigestValueException var0 = new org.apache.xml.security.signature.InvalidDigestValueException();

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toBinaryString((byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00001010"+ "'", var1.equals("00001010"));

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    org.apache.xml.security.utils.XPathFuncHereAPI var0 = new org.apache.xml.security.utils.XPathFuncHereAPI();

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toBinaryString(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00000000a00000000a00000000a00000000a00000000a00000000a00000000a00001010"+ "'", var1.equals("00000000a00000000a00000000a00000000a00000000a00000000a00000000a00001010"));

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    org.apache.xml.security.c14n.helper.C14nNodeFilter var1 = new org.apache.xml.security.c14n.helper.C14nNodeFilter(true);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    java.lang.String var1 = org.apache.xml.security.utils.RFC2253Parser.rfc2253toXMLdsig("FFaFFaFFaFFa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "FFaFFaFFaFFa"+ "'", var1.equals("FFaFFaFFaFFa"));

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    org.apache.xml.security.utils.HexDump.setWithByteSeparator(false);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toHexString(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0000000000000000"+ "'", var1.equals("0000000000000000"));

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    org.apache.xml.security.transforms.TransformationException var1 = new org.apache.xml.security.transforms.TransformationException("");

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    java.lang.String var2 = org.apache.xml.security.algorithms.JCEMapper.getJCEIVAlgorithmFromURI("0000000000000000", "0000: 01                                                 .\r\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    org.apache.xml.security.keys.keyresolver.KeyResolver.registerAtStart("");

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toBinaryString((short)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0000000000000001"+ "'", var1.equals("0000000000000001"));

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }


    org.apache.xml.security.utils.HexDump.setDebug(true);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


    java.lang.String var1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeProcessingInstruction("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }


    java.lang.String var1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeProcessingInstruction("0000000000000000");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0000000000000000"+ "'", var1.equals("0000000000000000"));

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }


    org.apache.xml.security.transforms.Transform.init();

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.signature.XMLSignatureInput var2 = new org.apache.xml.security.signature.XMLSignatureInput("0000: 01                                                 .\r\n", "0000000000000001");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    org.apache.xml.security.algorithms.JCEMapper.ProviderIdClass var1 = org.apache.xml.security.algorithms.JCEMapper.translateURItoJCEID("0000: 00 34 00 20 00 00                                  .4. ..\r\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    org.apache.xml.security.utils.JavaUtils.runGC();

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    java.lang.String var1 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.makeFilesystemToURI("00001010");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }


    java.lang.Object[] var6 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var7 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var6);
    org.apache.xml.security.transforms.TransformationException var9 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var10 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var6, (java.lang.Exception)var9);
    org.apache.xml.security.transforms.TransformationException var11 = new org.apache.xml.security.transforms.TransformationException("\u00FF", var6);
    org.apache.xml.security.keys.storage.StorageResolverException var12 = new org.apache.xml.security.keys.storage.StorageResolverException("Xerces-J 2.0.0", var6);
    org.apache.xml.security.exceptions.Base64DecodingException var13 = new org.apache.xml.security.exceptions.Base64DecodingException("", (java.lang.Exception)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    org.apache.xml.security.keys.KeyInfo.init();

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toString((byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\u0000"+ "'", var1.equals("\u0000"));

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.prettyPrintHex("0000000000000000");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0000: 30 30 30 30 30 30 30 30   30 30 30 30 30 30 30 30  0000000000000000\r\n"+ "'", var1.equals("0000: 30 30 30 30 30 30 30 30   30 30 30 30 30 30 30 30  0000000000000000\r\n"));

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }


    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException var0 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException();

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }


    java.lang.String var1 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.fixURI("0000: 01                                                 .\r\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0000: 01                                                 .\r\n"+ "'", var1.equals("0000: 01                                                 .\r\n"));

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("Xerces-J 2.0.0");

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.utils.Constants.setSignatureSpecNSprefix("Xerces-J 2.0.0");
      fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    int var1 = var0.engineSize();

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.stringToHexString("ADQA\nIAAA\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "414451410A494141410A"+ "'", var1.equals("414451410A494141410A"));

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }


    java.lang.String var1 = org.apache.xml.security.utils.RFC2253Parser.rfc2253toXMLdsig("FFFFFFFFFFFFFFFF");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "FFFFFFFFFFFFFFFF"+ "'", var1.equals("FFFFFFFFFFFFFFFF"));

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    int var3 = org.apache.xml.security.encryption.EncryptedData.min(100, (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    java.lang.String var0 = org.apache.xml.security.utils.Constants.getSignatureSpecNSprefix();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "ds"+ "'", var0.equals("ds"));

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    org.apache.xml.security.utils.I18n.init("00 34 00 20 00 00", "0000: 01                                                 .\r\n");

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }


    boolean var2 = org.apache.xml.security.utils.JavaUtils.implementsInterface((java.lang.Object)10.0d, "0000000000000000");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    org.apache.xml.security.signature.InvalidDigestValueException var1 = new org.apache.xml.security.signature.InvalidDigestValueException("003400200000");

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    org.apache.xml.security.algorithms.encryption.EncryptionMethod.providerInit();

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.prettyPrintHex("68 69 21 ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n"+ "'", var1.equals("0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n"));

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    char[] var4 = new char[] { ' ', ' '};
    org.apache.xml.security.utils.HexDump.setBitDigits(var4);
    java.security.Key var6 = var0.engineGetKey("0000000000000000", var4);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toHexString((byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00"+ "'", var1.equals("00"));

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }


    java.lang.String var1 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.fixURI("00000000a00000000a00000000a00000000a00000000a00000000a00000000a00001010");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00000000a00000000a00000000a00000000a00000000a00000000a00000000a00001010"+ "'", var1.equals("00000000a00000000a00000000a00000000a00000000a00000000a00000000a00001010"));

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments var0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments();
    org.apache.xml.security.utils.HelperNodeList var1 = new org.apache.xml.security.utils.HelperNodeList();
    int var2 = var1.getLength();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var4 = var0.engineCanonicalizeXPathNodeSet((org.w3c.dom.NodeList)var1, "BC");
      fail("Expected exception of type org.apache.xml.security.c14n.CanonicalizationException");
    } catch (org.apache.xml.security.c14n.CanonicalizationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    org.apache.xml.security.transforms.InvalidTransformException var1 = new org.apache.xml.security.transforms.InvalidTransformException("00 34 00 20 00 00");

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }


    org.apache.xml.security.utils.resolver.ResourceResolver.registerAtStart("");

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    byte[] var1 = new byte[] { (byte)1};
    java.lang.String var2 = org.apache.xml.security.utils.HexDump.prettyPrintHex(var1);
    java.lang.String var3 = org.apache.xml.security.utils.HexDump.toBinaryString(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0000: 01                                                 .\r\n"+ "'", var2.equals("0000: 01                                                 .\r\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "        "+ "'", var3.equals("        "));

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    java.lang.String var1 = org.apache.xml.security.utils.I18n.translate("00000000 00000000");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var1.equals("No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }


    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC var0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC();
    java.lang.String var1 = var0.getImplementedAlgorithmURI();
    int var2 = var0.engineGetBlockSize();

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }


    java.lang.String var1 = org.apache.xml.security.utils.I18n.getExceptionMessage("0000000000000000");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "No message with ID \"0000000000000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var1.equals("No message with ID \"0000000000000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }


    org.apache.xml.security.signature.InvalidDigestValueException var1 = new org.apache.xml.security.signature.InvalidDigestValueException("FFFFFFFFFFFFFFFF");

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    org.apache.xml.security.signature.InvalidSignatureValueException var1 = new org.apache.xml.security.signature.InvalidSignatureValueException("0000: 01                                                 .\r\n");
    java.lang.String var2 = var1.getMsgID();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0000: 01                                                 .\r\n"+ "'", var2.equals("0000: 01                                                 .\r\n"));

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    org.apache.xml.security.c14n.helper.NonNSAttrCompare var0 = new org.apache.xml.security.c14n.helper.NonNSAttrCompare();
    char[] var3 = new char[] { '4', ' '};
    byte[] var4 = org.apache.xml.security.keys.provider.KeyElement.PKCS12PasswordToBytes(var3);
    java.lang.String var5 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(var4);
    java.lang.String var8 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(var4, (-1), (-1));
    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES128_BC var9 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES128_BC();
    int var10 = var9.getImplementedAlgorithmType();
    int var11 = var9.engineGetBlockSize();
    int var12 = var9.engineGetBlockSize();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var13 = var0.compare((java.lang.Object)(-1), (java.lang.Object)var12);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "003400200000"+ "'", var5.equals("003400200000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 16);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    char[] var2 = new char[] { '4', ' '};
    byte[] var3 = org.apache.xml.security.keys.provider.KeyElement.PKCS12PasswordToBytes(var2);
    java.lang.String var4 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(var3);
    java.lang.String var7 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(var3, (-1), (-1));
    java.lang.String var8 = org.apache.xml.security.utils.HexDump.toHexString(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var9 = org.apache.xml.security.utils.Base64.decode(var3);
      fail("Expected exception of type org.apache.xml.security.exceptions.Base64DecodingException");
    } catch (org.apache.xml.security.exceptions.Base64DecodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "003400200000"+ "'", var4.equals("003400200000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "003400200000"+ "'", var8.equals("003400200000"));

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }


    java.lang.String var0 = org.apache.xml.security.utils.Version.getVersion();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "@@VERSION@@"+ "'", var0.equals("@@VERSION@@"));

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }


    org.apache.xml.security.utils.resolver.ResourceResolver.init();

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }


    java.lang.Object[] var4 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var5 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var4);
    org.apache.xml.security.transforms.TransformationException var7 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var8 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var4, (java.lang.Exception)var7);
    org.apache.xml.security.signature.ReferenceNotInitializedException var9 = new org.apache.xml.security.signature.ReferenceNotInitializedException("414451410A494141410A", (java.lang.Exception)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    java.lang.Object[] var5 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var6 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var5);
    org.apache.xml.security.transforms.TransformationException var8 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var9 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var5, (java.lang.Exception)var8);
    org.apache.xml.security.signature.ReferenceNotInitializedException var10 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00000000 00000000", var5);
    java.lang.Object[] var14 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var15 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var14);
    org.apache.xml.security.transforms.TransformationException var17 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var18 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var14, (java.lang.Exception)var17);
    org.apache.xml.security.keys.keyresolver.KeyResolverException var19 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("FFaFFaFFaFFa", var5, (java.lang.Exception)var17);
    java.lang.String var20 = var19.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "org.apache.xml.security.keys.keyresolver.KeyResolverException: No message with ID \"FFaFFaFFaFFa\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.transforms.TransformationException: No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var20.equals("org.apache.xml.security.keys.keyresolver.KeyResolverException: No message with ID \"FFaFFaFFaFFa\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.transforms.TransformationException: No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }


    org.apache.xml.security.exceptions.XMLSecurityException var1 = new org.apache.xml.security.exceptions.XMLSecurityException("68 69 21 ");

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }


    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC var0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC();
    java.lang.String var1 = var0.getImplementedAlgorithmURI();
    java.lang.String var2 = var0.getRequiredProviderName();
    int var3 = var0.engineGetBlockSize();

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }


    java.lang.Object[] var5 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var6 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var5);
    org.apache.xml.security.transforms.TransformationException var8 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var9 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var5, (java.lang.Exception)var8);
    org.apache.xml.security.transforms.TransformationException var10 = new org.apache.xml.security.transforms.TransformationException("\u00FF", var5);
    java.lang.Object[] var16 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var17 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var16);
    org.apache.xml.security.transforms.TransformationException var19 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var20 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var16, (java.lang.Exception)var19);
    org.apache.xml.security.signature.ReferenceNotInitializedException var21 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00000000 00000000", var16);
    org.apache.xml.security.keys.storage.StorageResolverException var22 = new org.apache.xml.security.keys.storage.StorageResolverException("0000: 01                                                 .\r\n", var16);
    org.apache.xml.security.signature.XMLSignatureException var23 = new org.apache.xml.security.signature.XMLSignatureException("BC", var5, (java.lang.Exception)var22);
    java.lang.String var24 = var23.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "org.apache.xml.security.signature.XMLSignatureException: No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.keys.storage.StorageResolverException: No message with ID \"0000: 01                                                 .\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var24.equals("org.apache.xml.security.signature.XMLSignatureException: No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.keys.storage.StorageResolverException: No message with ID \"0000: 01                                                 .\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }


    boolean var1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsAbsolute("org.apache.xml.security.keys.keyresolver.KeyResolverException: No message with ID \"FFaFFaFFaFFa\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.transforms.TransformationException: No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }


    java.lang.String var1 = org.apache.xml.security.utils.ElementProxy.getDefaultPrefix("org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException: No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var1 = org.apache.xml.security.utils.HexDump.hexStringToByteArray("00000000a00000000a00000000a00000000a00000000a00000000a00000000a00001010");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }


    java.lang.String var1 = org.apache.xml.security.utils.I18n.translate("No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "No message with ID \"No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var1.equals("No message with ID \"No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }


    java.lang.String var1 = org.apache.xml.security.utils.RFC2253Parser.rfc2253toXMLdsig("68 69 21 ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "68 69 21"+ "'", var1.equals("68 69 21"));

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }


    org.apache.xml.security.exceptions.Base64DecodingException var0 = new org.apache.xml.security.exceptions.Base64DecodingException();

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }


    org.apache.xml.security.keys.keyresolver.KeyResolverException var1 = new org.apache.xml.security.keys.keyresolver.KeyResolverException();
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var2 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("        ", (java.lang.Exception)var1);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var1 = org.apache.xml.security.utils.JavaUtils.getBytesFromFile("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    org.apache.xml.security.utils.ElementProxy.setDefaultPrefix("\u0000", "No message with ID \"68 69 21 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }


    org.apache.xml.security.algorithms.JCEMapper.ProviderIdClass var2 = org.apache.xml.security.algorithms.JCEMapper.translateURItoJCEID("//////////8=", "00001010");

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }


    org.apache.xml.security.algorithms.JCEMapper.ProviderIdClass var2 = org.apache.xml.security.algorithms.JCEMapper.translateURItoJCEID("0000000000000000", "00000000 00000000");

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }


    java.lang.String var0 = org.apache.xml.security.utils.EncryptionConstants.getEncryptionSpecNSprefix();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "Xerces-J 2.0.0"+ "'", var0.equals("Xerces-J 2.0.0"));

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    org.apache.xml.security.Init.registerKeyInfoContentHandler("BC", "0000: 30 30 30 30 30 30 30 30   30 30 30 30 30 30 30 30  0000000000000000\r\n", "0000: 01                                                 .\r\n");

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }


    org.apache.xml.security.utils.X509CertificateValidator var0 = new org.apache.xml.security.utils.X509CertificateValidator();

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }


    java.lang.String var1 = org.apache.xml.security.utils.I18n.translate("0000: 01                                                 .\r\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "No message with ID \"0000: 01                                                 .\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var1.equals("No message with ID \"0000: 01                                                 .\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }


    char[] var3 = new char[] { '4', '4', 'a'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.utils.HexDump.setBitDigits(var3);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = org.apache.xml.security.algorithms.encryption.EncryptionMethod.register("68 69 21 ", "org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver");
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toBinaryString(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "                                                                "+ "'", var1.equals("                                                                "));

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.stringToHexString("No message with ID \"No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4E6F206D657373616765207769746820494420224E6F206D6573736167652077697468204944202230303030303030302030303030303030302220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C7365637572697479222220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922"+ "'", var1.equals("4E6F206D657373616765207769746820494420224E6F206D6573736167652077697468204944202230303030303030302030303030303030302220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C7365637572697479222220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922"));

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }


    sun.security.x509.X500Name var4 = org.apache.xml.security.keys.content.x509.XMLX509SubjectName.createX500Name("org.apache.xml.security.keys.keyresolver.KeyResolverException: No message with ID \"FFaFFaFFaFFa\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.transforms.TransformationException: No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "BC", "No message with ID \"0000: 01                                                 .\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "00000000 00000000");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }


    org.apache.xml.security.utils.RFC2253Parser var0 = new org.apache.xml.security.utils.RFC2253Parser();

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    var0.engineDeleteEntry("0000: 30 30 30 30 30 30 30 30   30 30 30 30 30 30 30 30  0000000000000000\r\n");

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }


    org.apache.xml.security.keys.provider.ApacheKeyStoreConstants var0 = new org.apache.xml.security.keys.provider.ApacheKeyStoreConstants();

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }


    org.apache.xml.security.utils.HexDump.setByteSeparator('#');

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }


    org.apache.xml.security.c14n.Canonicalizer.register("0000: 30 30 30 30 30 30 30 30   30 30 30 30 30 30 30 30  0000000000000000\r\n", "\u0000");

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }


    org.apache.xml.security.utils.HelperNodeList var1 = new org.apache.xml.security.utils.HelperNodeList(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.w3c.dom.Node var3 = var1.item(3);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }


    java.lang.String var1 = org.apache.xml.security.utils.ElementProxy.getDefaultPrefix("org.apache.xml.security.keys.keyresolver.KeyResolverException: No message with ID \"FFaFFaFFaFFa\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.transforms.TransformationException: No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }


    org.apache.xml.security.utils.I18n.initLocale("0000: 30 30 30 30 30 30 30 30   30 30 30 30 30 30 30 30  0000000000000000\r\n", "org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver");

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }


    java.lang.String var1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeText("/////w==");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "/////w=="+ "'", var1.equals("/////w=="));

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments var0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments();
    java.util.Set var2 = org.apache.xml.security.transforms.params.InclusiveNamespaces.prefixStr2Set("00001010");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var4 = var0.engineCanonicalizeXPathNodeSet(var2, "http://www.w3.org/2001/04/xmlenc#aes128-cbc");
      fail("Expected exception of type org.apache.xml.security.c14n.CanonicalizationException");
    } catch (org.apache.xml.security.c14n.CanonicalizationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }


    java.lang.String var1 = org.apache.xml.security.utils.I18n.getExceptionMessage("0000: FF FF FF FF                                        ....\r\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "No message with ID \"0000: FF FF FF FF                                        ....\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var1.equals("No message with ID \"0000: FF FF FF FF                                        ....\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }


    org.apache.xml.security.signature.ReferenceNotInitializedException var1 = new org.apache.xml.security.signature.ReferenceNotInitializedException("AAAABA==");

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }


    byte[] var1 = org.apache.xml.security.utils.HexDump.toByteArray((-1L));
    java.lang.String var2 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(var1, (-1), 4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "FFFFFFFFFFFFFFFF"+ "'", var2.equals("FFFFFFFFFFFFFFFF"));

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }


    java.lang.String var2 = org.apache.xml.security.Init.getKeyInfoContentHandler("0000: 01                                                 .\r\n", "org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException: No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }


    java.lang.String var1 = org.apache.xml.security.utils.RFC2253Parser.normalize("@@VERSION@@");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "@@VERSION@@"+ "'", var1.equals("@@VERSION@@"));

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    char[] var4 = new char[] { '4', ' '};
    byte[] var5 = org.apache.xml.security.keys.provider.KeyElement.PKCS12PasswordToBytes(var4);
    java.lang.String var6 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(var5);
    java.lang.String var9 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(var5, (-1), (-1));
    java.security.cert.Certificate[] var10 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException: No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", var5, var10);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("No message with ID \"68 69 21 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }


    java.util.Set var1 = org.apache.xml.security.transforms.params.InclusiveNamespaces.prefixStr2Set("00001010");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.w3c.dom.NodeList var2 = org.apache.xml.security.utils.XMLUtils.convertSetToNodelist(var1);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }


    org.apache.xml.security.utils.IgnoreAllErrorHandler var0 = new org.apache.xml.security.utils.IgnoreAllErrorHandler();

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    org.apache.xml.security.c14n.Canonicalizer.init();

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }


    org.apache.xml.security.c14n.InvalidCanonicalizerException var0 = new org.apache.xml.security.c14n.InvalidCanonicalizerException();

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }


    char[] var2 = new char[] { '4', ' '};
    byte[] var3 = org.apache.xml.security.keys.provider.KeyElement.PKCS12PasswordToBytes(var2);
    java.lang.String var4 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var5 = org.apache.xml.security.utils.Base64.decode(var3);
      fail("Expected exception of type org.apache.xml.security.exceptions.Base64DecodingException");
    } catch (org.apache.xml.security.exceptions.Base64DecodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "003400200000"+ "'", var4.equals("003400200000"));

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }


    org.apache.xml.security.utils.Base64.setBase64WrapLength((-1));

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    boolean var2 = var0.engineContainsAlias("http://www.w3.org/2001/04/xmlenc#kw-aes192");

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var1 = org.apache.xml.security.utils.HexDump.hexStringToByteArray("0000: 00 34 00 20 00 00                                  .4. ..\r\n");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toHexString(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0000000000000001"+ "'", var1.equals("0000000000000001"));

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }


    org.apache.xml.security.utils.HexDump.setBitDigits('4', ' ');

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }


    java.lang.String var1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeAttr("ds");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "ds"+ "'", var1.equals("ds"));

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous var1 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous("No message with ID \"0000: FF FF FF FF                                        ....\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.Init.readUserConfiguration();
      fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }


    org.apache.xml.security.keys.KeyInfo.registerKeyInfoContentHandler("0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n", "003400200000", "ADQA\nIAAA\n");

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toHexString(16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00000010"+ "'", var1.equals("00000010"));

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }


    java.lang.String var1 = org.apache.xml.security.utils.RFC2253Parser.normalize("\u0000");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }


    int var3 = org.apache.xml.security.encryption.EncryptedData.min(4, 0, 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.util.Date var2 = var0.engineGetCreationDate("        ");

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }


    java.lang.String var1 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.makeFilesystemToURI("org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException: No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.stringToHexString("No message with ID \"68 69 21 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4E6F206D657373616765207769746820494420223638203639203231202220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922"+ "'", var1.equals("4E6F206D657373616765207769746820494420223638203639203231202220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922"));

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }


    org.apache.xml.security.keys.keyresolver.KeyResolver.register("0000: 30 30 30 30 30 30 30 30   30 30 30 30 30 30 30 30  0000000000000000\r\n");

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }


    java.lang.String var1 = org.apache.xml.security.utils.I18n.getExceptionMessage("00000010");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "No message with ID \"00000010\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var1.equals("No message with ID \"00000010\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }


    int var3 = org.apache.xml.security.encryption.EncryptedData.min((-1), 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }


    org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver var1 = new org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver("68 69 21");

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }


    java.lang.String var1 = org.apache.xml.security.algorithms.JCEMapper.getAlgorithmClassFromURI("hi!");

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }


    org.apache.xml.security.algorithms.implementations.SignatureDSA var0 = new org.apache.xml.security.algorithms.implementations.SignatureDSA();

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }


    java.lang.String var0 = org.apache.xml.security.utils.XMLUtils.getRandomNamespacePrefix();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "xmlsecurityOrgPrefsJbGzQBZSDvfRMokD5jmlgqidZuO"+ "'", var0.equals("xmlsecurityOrgPrefsJbGzQBZSDvfRMokD5jmlgqidZuO"));

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }


    org.apache.xml.security.utils.I18n.init("0000000000000000", "00000010");

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toHexString((short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0000"+ "'", var1.equals("0000"));

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }


    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException var1 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("414451410A494141410A");

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toHexString((byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0A"+ "'", var1.equals("0A"));

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }


    org.apache.xml.security.algorithms.SignatureAlgorithm.register("        ", "http://www.w3.org/2001/04/xmlenc#kw-aes192");

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }


    org.apache.xml.security.utils.I18n.initLocale("68 69 21 ", "No message with ID \"0000000000000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }


    org.apache.xml.security.Init.registerKeyInfoContentHandler("No message with ID \"0000: 30 30 30 30 30 30 30 30   30 30 30 30 30 30 30 30  0000000000000000\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.exceptions.XMLSecurityException and message No message with ID \"0000: 01                                                 .\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "414451410A494141410A", "                                                                ");

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }


    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC var0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    int var1 = var0.getImplementedAlgorithmType();
    int var2 = var0.engineGetBlockSize();

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }


    int var1 = org.apache.xml.security.algorithms.JCEMapper.getKeyTypeFromURI("003400200000");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toString((byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "d"+ "'", var1.equals("d"));

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }


    org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments var0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments();
    org.apache.xml.security.utils.HelperNodeList var1 = new org.apache.xml.security.utils.HelperNodeList();
    byte[] var2 = var0.engineCanonicalizeXPathNodeSet((org.w3c.dom.NodeList)var1);
    java.lang.String var3 = var0.engineGetURI();
    org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments var4 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments();
    org.apache.xml.security.utils.HelperNodeList var5 = new org.apache.xml.security.utils.HelperNodeList();
    byte[] var6 = var4.engineCanonicalizeXPathNodeSet((org.w3c.dom.NodeList)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var8 = var0.engineCanonicalizeXPathNodeSet((org.w3c.dom.NodeList)var5, "FFFFFFFFFFFFFFFF");
      fail("Expected exception of type org.apache.xml.security.c14n.CanonicalizationException");
    } catch (org.apache.xml.security.c14n.CanonicalizationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315"+ "'", var3.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }


    org.apache.xml.security.algorithms.SignatureAlgorithm.register("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", "00");

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }


    org.apache.xml.security.keys.keyresolver.KeyResolver.register("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.cert.Certificate[] var2 = var0.engineGetCertificateChain("0000000000000001");

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }


    java.lang.String var1 = org.apache.xml.security.utils.I18n.getExceptionMessage("                                                                ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var1.equals("No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }


    org.apache.xml.security.algorithms.SignatureAlgorithm.register("0000: 00 34 00 20 00 00                                  .4. ..\r\n", "0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n");

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    boolean var2 = var0.engineIsKeyEntry("FFaFFaFFaFFa");

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }


    java.lang.String var1 = org.apache.xml.security.utils.RFC2253Parser.xmldsigtoRFC2253("0A");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0A"+ "'", var1.equals("0A"));

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }


    java.lang.String var1 = org.apache.xml.security.utils.I18n.translate("414451410A494141410A");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "No message with ID \"414451410A494141410A\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var1.equals("No message with ID \"414451410A494141410A\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }


    org.apache.xml.security.utils.Base64.setBase64WrapLength(3);

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }


    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException var1 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("d");

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }


    byte[] var3 = new byte[] { (byte)0, (byte)0, (byte)(-1)};
    org.apache.xml.security.signature.XMLSignatureInput var4 = new org.apache.xml.security.signature.XMLSignatureInput(var3);
    org.apache.xpath.CachedXPathAPI var5 = var4.getCachedXPathAPI();
    boolean var6 = var4.isInitialized();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }


    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver var0 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toString((byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\u0001"+ "'", var1.equals("\u0001"));

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }


    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES128_BC var0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES128_BC();
    int var1 = var0.engineGetBlockSize();
    java.lang.String var2 = var0.getRequiredProviderName();
    java.lang.String var3 = var0.getImplementedAlgorithmURI();
    java.lang.String var4 = var0.getImplementedAlgorithmURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "BC"+ "'", var2.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "http://www.w3.org/2001/04/xmlenc#aes128-cbc"+ "'", var3.equals("http://www.w3.org/2001/04/xmlenc#aes128-cbc"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "http://www.w3.org/2001/04/xmlenc#aes128-cbc"+ "'", var4.equals("http://www.w3.org/2001/04/xmlenc#aes128-cbc"));

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }


    org.apache.xml.security.transforms.InvalidTransformException var2 = new org.apache.xml.security.transforms.InvalidTransformException("414451410A494141410A");
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException var3 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("00000010", (java.lang.Exception)var2);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var1 = org.apache.xml.security.utils.JavaUtils.getBytesFromFile("4444444444  4 444444444444 444444444444444444444");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }


    boolean var2 = org.apache.xml.security.algorithms.encryption.EncryptionMethod.register("0A", "00001010");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }


    java.lang.String var0 = org.apache.xml.security.utils.XMLUtils.getXalanVersion();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "Xalan Java 2.5.1"+ "'", var0.equals("Xalan Java 2.5.1"));

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }


    org.apache.xml.security.utils.Constants.setSignatureSpecNSprefix("4444444444  4 444444444444 444444444444444444444");

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    org.apache.xml.security.exceptions.Base64DecodingException var1 = new org.apache.xml.security.exceptions.Base64DecodingException("");

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }


    org.apache.xml.security.c14n.Canonicalizer.register("No message with ID \"No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "No message with ID \"0000: FF FF FF FF                                        ....\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }


    java.lang.String var2 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.expandSystemId("0000000000000000", "ApacheXML version 1.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0000000000000000"+ "'", var2.equals("0000000000000000"));

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }


    org.apache.xml.security.algorithms.JCEMapper.ProviderIdClass var2 = org.apache.xml.security.algorithms.JCEMapper.translateURItoJCEID("xmlsecurityOrgPrefsJbGzQBZSDvfRMokD5jmlgqidZuO", "FFFFFFFFFFFFFFFF");

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toBinaryString((byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "        "+ "'", var1.equals("        "));

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.c14n.Canonicalizer var1 = org.apache.xml.security.c14n.Canonicalizer.getInstance("4E6F206D657373616765207769746820494420223638203639203231202220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922");
      fail("Expected exception of type org.apache.xml.security.c14n.InvalidCanonicalizerException");
    } catch (org.apache.xml.security.c14n.InvalidCanonicalizerException e) {
      // Expected exception.
    }

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toBinaryString((short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "444444444444 4 4"+ "'", var1.equals("444444444444 4 4"));

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var1 = org.apache.xml.security.utils.Base64.decode("0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n");
      fail("Expected exception of type org.apache.xml.security.exceptions.Base64DecodingException");
    } catch (org.apache.xml.security.exceptions.Base64DecodingException e) {
      // Expected exception.
    }

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }


    org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments var0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments();
    org.apache.xml.security.utils.HelperNodeList var1 = new org.apache.xml.security.utils.HelperNodeList();
    byte[] var2 = var0.engineCanonicalizeXPathNodeSet((org.w3c.dom.NodeList)var1);
    java.lang.String var3 = var0.engineGetURI();
    org.apache.xml.security.utils.HelperNodeList var4 = new org.apache.xml.security.utils.HelperNodeList();
    org.w3c.dom.Document var5 = var4.getOwnerDocument();
    java.util.Set var6 = org.apache.xml.security.utils.XMLUtils.convertNodelistToSet((org.w3c.dom.NodeList)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var8 = var0.engineCanonicalizeXPathNodeSet(var6, "00000000 00000000");
      fail("Expected exception of type org.apache.xml.security.c14n.CanonicalizationException");
    } catch (org.apache.xml.security.c14n.CanonicalizationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315"+ "'", var3.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }


    org.apache.xml.security.utils.resolver.ResourceResolver.registerAtStart("No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    char[] var5 = new char[] { '#', '4', ' '};
    java.security.Key var6 = var0.engineGetKey("ds", var5);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }


    java.lang.String var2 = org.apache.xml.security.Init.getKeyInfoContentHandler("@@VERSION@@", "4E6F206D657373616765207769746820494420223638203639203231202220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }


    org.apache.xml.security.algorithms.SignatureAlgorithm.providerInit();

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }


    sun.security.x509.X500Name var4 = org.apache.xml.security.keys.content.x509.XMLX509SubjectName.createX500Name("", "        ", "\u0001", "XMLSignatureInput/OctetStream/3 octets/null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }


    boolean var1 = org.apache.xml.security.algorithms.JCEMapper.addProvider("ds");

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }


    byte[] var1 = org.apache.xml.security.utils.PRNG.createBytes(0);
    java.lang.String var2 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(var1);
    byte[] var3 = org.apache.xml.security.utils.Base64.decode(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }


    byte[] var1 = org.apache.xml.security.utils.HexDump.toByteArray((-1L));
    java.lang.String var2 = org.apache.xml.security.utils.Base64.encode(var1);
    java.lang.String var3 = org.apache.xml.security.utils.HexDump.toBinaryString(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "//////////8="+ "'", var2.equals("//////////8="));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "                                                                "+ "'", var3.equals("                                                                "));

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }


    org.apache.xml.security.utils.Constants.setSignatureSpecNSprefix("0000: 01                                                 .\r\n");

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }


    int var1 = org.apache.xml.security.algorithms.JCEMapper.getKeyLengthFromURI("No message with ID \"0000: 30 30 30 30 30 30 30 30   30 30 30 30 30 30 30 30  0000000000000000\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.exceptions.XMLSecurityException and message No message with ID \"0000: 01                                                 .\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }


    java.lang.String var1 = org.apache.xml.security.utils.ElementProxy.getDefaultPrefix("Xalan Java 2.5.1");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.signature.XMLSignatureInput var2 = new org.apache.xml.security.signature.XMLSignatureInput("        ", "FFaFFaFFaFFa");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }


    int var1 = org.apache.xml.security.algorithms.JCEMapper.getKeyTypeFromURI("http://www.w3.org/2001/04/xmlenc#kw-aes192");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }


    org.apache.xml.security.utils.I18n.initLocale("No message with ID \"0000: FF FF FF FF                                        ....\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "\u0001");

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }


    org.apache.xml.security.utils.Constants.setSignatureSpecNSprefix("00000010");

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }


    org.apache.xml.security.Init.init();

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }


    java.lang.String var1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeText("FFFFFFFFFFFFFFFF");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "FFFFFFFFFFFFFFFF"+ "'", var1.equals("FFFFFFFFFFFFFFFF"));

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }


    org.apache.xml.security.utils.HexDump.setBitDigits(' ', 'a');

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }


    java.lang.String var1 = org.apache.xml.security.utils.XMLUtils.getNodeTypeString((short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }


    java.lang.String var1 = org.apache.xml.security.utils.RFC2253Parser.rfc2253toXMLdsig("0000000000000000");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0000000000000000"+ "'", var1.equals("0000000000000000"));

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }


    org.apache.xml.security.Init.registerKeyInfoContentHandler("0000: 00 34 00 20 00 00                                  .4. ..\r\n", "Xalan Java 2.5.1", "No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }


    boolean var1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsRelative("Xerces-J 2.0.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }


    boolean var1 = org.apache.xml.security.algorithms.JCEMapper.addProvider("\u0001");

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }


    java.lang.Object[] var4 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var5 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var4);
    org.apache.xml.security.transforms.TransformationException var7 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var8 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var4, (java.lang.Exception)var7);
    org.apache.xml.security.transforms.TransformationException var9 = new org.apache.xml.security.transforms.TransformationException("\u00FF", var4);
    java.lang.String var10 = var9.getMsgID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "\u00FF"+ "'", var10.equals("\u00FF"));

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }


    org.apache.xml.security.utils.resolver.ResourceResolver.registerAtStart("0000000000000000");

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }


    org.apache.xml.security.algorithms.JCEMapper.ProviderIdClass var1 = org.apache.xml.security.algorithms.JCEMapper.translateURItoJCEID("No message with ID \"0000: 30 30 30 30 30 30 30 30   30 30 30 30 30 30 30 30  0000000000000000\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.exceptions.XMLSecurityException and message No message with ID \"0000: 01                                                 .\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    boolean var2 = var0.engineIsKeyEntry("//////////8=");

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    var0.engineDeleteEntry("                                ");

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }


    java.lang.String var1 = org.apache.xml.security.utils.RFC2253Parser.xmldsigtoRFC2253("http://www.w3.org/2001/04/xmlenc#aes192-cbc");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#aes192-cbc"+ "'", var1.equals("http://www.w3.org/2001/04/xmlenc#aes192-cbc"));

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.prettyPrintHex("        ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0000: 20 20 20 20 20 20 20 20                                    \r\n"+ "'", var1.equals("0000: 20 20 20 20 20 20 20 20                                    \r\n"));

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }


    org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver var0 = new org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver();
    java.lang.String var2 = var0.engineGetProperty("0A");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.prettyPrintHex("http://www.w3.org/2001/04/xmlenc#aes192-cbc");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0000: 68 74 74 70 3A 2F 2F 77   77 77 2E 77 33 2E 6F 72  http://www.w3.or\r\n0010: 67 2F 32 30 30 31 2F 30   34 2F 78 6D 6C 65 6E 63  g/2001/04/xmlenc\r\n0020: 23 61 65 73 31 39 32 2D   63 62 63                 #aes192-cbc\r\n"+ "'", var1.equals("0000: 68 74 74 70 3A 2F 2F 77   77 77 2E 77 33 2E 6F 72  http://www.w3.or\r\n0010: 67 2F 32 30 30 31 2F 30   34 2F 78 6D 6C 65 6E 63  g/2001/04/xmlenc\r\n0020: 23 61 65 73 31 39 32 2D   63 62 63                 #aes192-cbc\r\n"));

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }


    org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments var0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments();
    org.apache.xml.security.utils.HelperNodeList var1 = new org.apache.xml.security.utils.HelperNodeList();
    byte[] var2 = var0.engineCanonicalizeXPathNodeSet((org.w3c.dom.NodeList)var1);
    java.lang.String var3 = var0.engineGetURI();
    org.apache.xml.security.utils.HelperNodeList var4 = new org.apache.xml.security.utils.HelperNodeList();
    int var5 = var4.getLength();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var7 = var0.engineCanonicalizeXPathNodeSet((org.w3c.dom.NodeList)var4, "0000: FF FF FF FF                                        ....\r\n");
      fail("Expected exception of type org.apache.xml.security.c14n.CanonicalizationException");
    } catch (org.apache.xml.security.c14n.CanonicalizationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315"+ "'", var3.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toBinaryString((byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + " aa  a  "+ "'", var1.equals(" aa  a  "));

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }


    int var0 = org.apache.xml.security.utils.Base64.getBase64WrapLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 3);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }


    boolean var2 = org.apache.xml.security.utils.JavaUtils.implementsInterface((java.lang.Object)8, "0000: 30 30 30 30 30 30 30 30   30 30 30 30 30 30 30 30  0000000000000000\r\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }


    org.apache.xml.security.algorithms.JCEMapper var0 = new org.apache.xml.security.algorithms.JCEMapper();

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }


    org.apache.xml.security.algorithms.JCEMapper.ProviderIdClass var1 = org.apache.xml.security.algorithms.JCEMapper.translateURItoJCEID("http://www.w3.org/2001/04/xmlenc#kw-aes192");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }


    byte[] var1 = org.apache.xml.security.utils.HexDump.toByteArray(4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = org.apache.xml.security.utils.HexDump.toHexString(var1, 4, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }


    org.apache.xml.security.keys.keyresolver.KeyResolver.register("00000000 00000000");

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }


    org.apache.xml.security.algorithms.JCEMapper.ProviderIdClass var1 = org.apache.xml.security.algorithms.JCEMapper.translateURItoJCEID("/////w==");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }


    java.lang.Object[] var3 = new java.lang.Object[] { (byte)0};
    java.lang.Object[] var7 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var8 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var7);
    org.apache.xml.security.transforms.TransformationException var10 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var11 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var7, (java.lang.Exception)var10);
    org.apache.xml.security.exceptions.Base64DecodingException var12 = new org.apache.xml.security.exceptions.Base64DecodingException("0000000000000000", var3, (java.lang.Exception)var10);
    org.apache.xml.security.signature.InvalidSignatureValueException var13 = new org.apache.xml.security.signature.InvalidSignatureValueException("http://www.w3.org/2001/04/xmlenc#aes128-cbc", (java.lang.Exception)var10);
    java.lang.Exception var14 = var10.getOriginalException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }


    byte[] var3 = new byte[] { (byte)0, (byte)0, (byte)(-1)};
    org.apache.xml.security.signature.XMLSignatureInput var4 = new org.apache.xml.security.signature.XMLSignatureInput(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var5 = var4.getNodeSet();
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    boolean var2 = var0.engineIsKeyEntry("Xalan Java 2.5.1");

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }


    byte[] var1 = new byte[] { (byte)1};
    java.lang.String var2 = org.apache.xml.security.utils.HexDump.prettyPrintHex(var1);
    byte[] var4 = org.apache.xml.security.utils.HexDump.toByteArray((-1));
    java.lang.String var5 = org.apache.xml.security.utils.HexDump.prettyPrintHex(var4);
    boolean var6 = org.apache.xml.security.algorithms.MessageDigestAlgorithm.isEqual(var1, var4);
    java.lang.String var7 = org.apache.xml.security.utils.HexDump.byteArrayToBinaryString(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var10 = org.apache.xml.security.utils.HexDump.toHexString(var4, 4, 4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0000: 01                                                 .\r\n"+ "'", var2.equals("0000: 01                                                 .\r\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "0000: FF FF FF FF                                        ....\r\n"+ "'", var5.equals("0000: FF FF FF FF                                        ....\r\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'", var7.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.cert.Certificate[] var2 = var0.engineGetCertificateChain("00 34 00 20 00 00");

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    char[] var4 = new char[] { '#', '4'};
    java.security.Key var5 = var0.engineGetKey("org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException: No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", var4);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }


    java.lang.String var1 = org.apache.xml.security.utils.I18n.translate("00001010");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "No message with ID \"00001010\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var1.equals("No message with ID \"00001010\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.Init.readUserConfiguration("No message with ID \"/////w==\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
      fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }


    int var3 = org.apache.xml.security.encryption.EncryptedData.min(3, 16, 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 3);

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }


    org.apache.xml.security.utils.EncryptionConstants.setEncryptionSpecNSprefix("hi!");

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }


    boolean var1 = org.apache.xml.security.algorithms.JCEMapper.addProvider("No message with ID \"414451410A494141410A\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toHexString((short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "000A"+ "'", var1.equals("000A"));

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }


    byte[] var3 = new byte[] { (byte)0, (byte)0, (byte)(-1)};
    org.apache.xml.security.signature.XMLSignatureInput var4 = new org.apache.xml.security.signature.XMLSignatureInput(var3);
    java.lang.String var5 = var4.getSourceURI();
    org.apache.xpath.CachedXPathAPI var6 = var4.getCachedXPathAPI();
    org.apache.xml.security.utils.CachedXPathFuncHereAPI var7 = new org.apache.xml.security.utils.CachedXPathFuncHereAPI(var6);
    org.apache.xml.security.utils.CachedXPathFuncHereAPI var8 = new org.apache.xml.security.utils.CachedXPathFuncHereAPI(var6);
    org.apache.xml.security.transforms.implementations.FuncHereContext var9 = var8.getFuncHereContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }


    java.lang.String var1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeComment("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }


    java.lang.String var1 = org.apache.xml.security.utils.I18n.getExceptionMessage("0000: 20 20 20 20 20 20 20 20                                    \r\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "No message with ID \"0000: 20 20 20 20 20 20 20 20                                    \r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var1.equals("No message with ID \"0000: 20 20 20 20 20 20 20 20                                    \r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }


    org.apache.xml.security.utils.I18n.init("4E6F206D657373616765207769746820494420224E6F206D6573736167652077697468204944202230303030303030302030303030303030302220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C7365637572697479222220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922", "\u0001");

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }


    org.apache.xml.security.keys.provider.ApacheXMLProvider var0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Collection var1 = var0.values();
    var0.clear();
    java.util.Enumeration var3 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toBinaryString((short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "         aa  a  "+ "'", var1.equals("         aa  a  "));

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }


    org.apache.xml.security.keys.KeyInfo.registerKeyInfoContentHandler("00 34 00 20 00 00", "http://www.w3.org/2001/04/xmlenc#kw-tripledes", "00001010");

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    boolean var2 = var0.engineIsKeyEntry("org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver");

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }


    java.util.Set var1 = org.apache.xml.security.transforms.params.InclusiveNamespaces.prefixStr2Set("org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException: No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.w3c.dom.NodeList var2 = org.apache.xml.security.utils.XMLUtils.convertSetToNodelist(var1);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    boolean var2 = var0.engineContainsAlias("AAAABA==");

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }


    org.apache.xml.security.utils.resolver.ResourceResolver.register("\u0001");

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }


    java.lang.String var1 = org.apache.xml.security.utils.RFC2253Parser.normalize("4444444444  4 444444444444 444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4444444444  4 444444444444 444444444444444444444"+ "'", var1.equals("4444444444  4 444444444444 444444444444444444444"));

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }


    org.apache.xml.security.utils.I18n.init("No message with ID \"00001010\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "http://www.w3.org/2001/04/xmlenc#kw-aes192");

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }


    org.apache.xml.security.keys.keyresolver.KeyResolver.registerAtStart("\u0000");

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }


    org.apache.xml.security.utils.resolver.implementations.ResolverXPointer var0 = new org.apache.xml.security.utils.resolver.implementations.ResolverXPointer();
    var0.engineSetProperty("Xerces-J 2.0.0", "BC");
    java.lang.String var5 = var0.engineGetProperty("ds");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }


    java.lang.String var1 = org.apache.xml.security.utils.RFC2253Parser.normalize("ds");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "ds"+ "'", var1.equals("ds"));

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }


    boolean var1 = org.apache.xml.security.algorithms.JCEMapper.getProviderIsRegisteredAtSecurity("                                ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    boolean var2 = var0.engineContainsAlias("@@VERSION@@");

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }


    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var2 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("");
    org.apache.xml.security.c14n.CanonicalizationException var3 = new org.apache.xml.security.c14n.CanonicalizationException("\u00FF", (java.lang.Exception)var2);

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.signature.XMLSignatureInput var2 = new org.apache.xml.security.signature.XMLSignatureInput("00000000a00000000a00000000a00000000a00000000a00000000a00000000a00001010", "444444444444 4 4");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("@@VERSION@@");

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }


    org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments var0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments();
    org.apache.xml.security.utils.HelperNodeList var1 = new org.apache.xml.security.utils.HelperNodeList();
    byte[] var2 = var0.engineCanonicalizeXPathNodeSet((org.w3c.dom.NodeList)var1);
    org.apache.xml.security.keys.provider.ApacheXMLProvider var3 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Collection var4 = var3.values();
    java.lang.Object var7 = var3.setProperty("ADQA\nIAAA\n", "\u00FF");
    java.util.Set var8 = var3.getServices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var9 = var0.engineCanonicalizeXPathNodeSet(var8);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }


    int var1 = org.apache.xml.security.algorithms.JCEMapper.getKeyTypeFromURI("0000");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }


    org.apache.xml.security.keys.provider.ApacheXMLProvider var0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Collection var1 = var0.values();
    java.lang.Object var4 = var0.setProperty("ADQA\nIAAA\n", "\u00FF");
    java.util.Set var5 = var0.getServices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.w3c.dom.NodeList var6 = org.apache.xml.security.utils.XMLUtils.convertSetToNodelist(var5);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }


    org.apache.xml.security.algorithms.JCEMapper.ProviderIdClass var2 = org.apache.xml.security.algorithms.JCEMapper.translateURItoJCEID("ADQA\nIAAA\n", "XMLSignatureInput/OctetStream/3 octets/null");

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.c14n.Canonicalizer var1 = org.apache.xml.security.c14n.Canonicalizer.getInstance("http://www.w3.org/2001/04/xmlenc#kw-aes192");
      fail("Expected exception of type org.apache.xml.security.c14n.InvalidCanonicalizerException");
    } catch (org.apache.xml.security.c14n.InvalidCanonicalizerException e) {
      // Expected exception.
    }

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }


    char[] var3 = new char[] { ' ', 'a', '#'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.utils.HexDump.setBitDigits(var3);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }


    int var1 = org.apache.xml.security.algorithms.JCEMapper.getKeyLengthFromURI("No message with ID \"414451410A494141410A\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }


    boolean var1 = org.apache.xml.security.algorithms.JCEMapper.getProviderIsRegisteredAtSecurity("org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("");

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }


    org.apache.xml.security.utils.ElementProxy.setDefaultPrefix("org.apache.xml.security.signature.XMLSignatureException: No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.keys.storage.StorageResolverException: No message with ID \"0000: 01                                                 .\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", " aa  a  ");

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }


    java.lang.String var1 = org.apache.xml.security.utils.RFC2253Parser.rfc2253toXMLdsig("4E6F206D657373616765207769746820494420224E6F206D6573736167652077697468204944202230303030303030302030303030303030302220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C7365637572697479222220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4E6F206D657373616765207769746820494420224E6F206D6573736167652077697468204944202230303030303030302030303030303030302220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C7365637572697479222220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922"+ "'", var1.equals("4E6F206D657373616765207769746820494420224E6F206D6573736167652077697468204944202230303030303030302030303030303030302220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C7365637572697479222220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922"));

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test282"); }


    org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments var0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments();
    org.apache.xml.security.utils.HelperNodeList var1 = new org.apache.xml.security.utils.HelperNodeList();
    byte[] var2 = var0.engineCanonicalizeXPathNodeSet((org.w3c.dom.NodeList)var1);
    java.lang.String var3 = var0.engineGetURI();
    org.apache.xml.security.keys.provider.ApacheXMLProvider var4 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Collection var5 = var4.values();
    java.lang.Object var8 = var4.setProperty("ADQA\nIAAA\n", "\u00FF");
    java.util.Set var9 = var4.getServices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var11 = var0.engineCanonicalizeXPathNodeSet(var9, "Xerces-J 2.0.0");
      fail("Expected exception of type org.apache.xml.security.c14n.CanonicalizationException");
    } catch (org.apache.xml.security.c14n.CanonicalizationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315"+ "'", var3.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test283"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.c14n.Canonicalizer var1 = org.apache.xml.security.c14n.Canonicalizer.getInstance("Xerces-J 2.0.0");
      fail("Expected exception of type org.apache.xml.security.c14n.InvalidCanonicalizerException");
    } catch (org.apache.xml.security.c14n.InvalidCanonicalizerException e) {
      // Expected exception.
    }

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test284"); }


    java.lang.String var1 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.fixURI("00 34 00 20 00 00");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00 34 00 20 00 00"+ "'", var1.equals("00 34 00 20 00 00"));

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test285"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.stringToHexString("AAAABA==");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4141414142413D3D"+ "'", var1.equals("4141414142413D3D"));

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test286"); }


    org.apache.xml.security.transforms.TransformationException var1 = new org.apache.xml.security.transforms.TransformationException("003400200000");

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test287"); }


    sun.security.x509.X500Name var4 = org.apache.xml.security.keys.content.x509.XMLX509SubjectName.createX500Name("hi!", "00", "68 69 21 ", "No message with ID \"0000000000000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test288"); }


    org.apache.xml.security.transforms.TransformationException var3 = new org.apache.xml.security.transforms.TransformationException("Xerces-J 2.0.0");
    org.apache.xml.security.signature.ReferenceNotInitializedException var4 = new org.apache.xml.security.signature.ReferenceNotInitializedException("", (java.lang.Exception)var3);
    org.apache.xml.security.transforms.TransformationException var5 = new org.apache.xml.security.transforms.TransformationException("org.apache.xml.security.keys.keyresolver.KeyResolverException: No message with ID \"FFaFFaFFaFFa\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.transforms.TransformationException: No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", (java.lang.Exception)var3);

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test289"); }


    boolean var1 = org.apache.xml.security.algorithms.JCEMapper.getProviderIsRegisteredAtSecurity("http://www.w3.org/2001/04/xmlenc#aes192-cbc");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test290"); }


    org.apache.xml.security.transforms.TransformationException var1 = new org.apache.xml.security.transforms.TransformationException("ApacheXML version 1.0");

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test291"); }


    org.apache.xml.security.algorithms.JCEMapper.ProviderIdClass var1 = org.apache.xml.security.algorithms.JCEMapper.translateURItoJCEID("Apache XML Security Provider");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test292"); }


    org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments var0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments();
    org.apache.xml.security.keys.provider.ApacheXMLProvider var1 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.security.Provider.Service var4 = var1.getService("No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "org.apache.xml.security.keys.keyresolver.KeyResolverException: No message with ID \"FFaFFaFFaFFa\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.transforms.TransformationException: No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    java.lang.Object var5 = var1.clone();
    java.util.Set var6 = var1.getServices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var7 = var0.engineCanonicalizeXPathNodeSet(var6);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test293"); }


    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException var1 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("No message with ID \"00000010\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test294"); }


    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC var0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC();
    java.lang.String var1 = var0.getImplementedAlgorithmURI();
    java.lang.String var2 = var0.getRequiredProviderName();
    java.lang.String var3 = var0.getImplementedAlgorithmURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes192"+ "'", var1.equals("http://www.w3.org/2001/04/xmlenc#kw-aes192"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "BC"+ "'", var2.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes192"+ "'", var3.equals("http://www.w3.org/2001/04/xmlenc#kw-aes192"));

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test295"); }


    int var1 = org.apache.xml.security.algorithms.JCEMapper.getKeyLengthFromURI("org.apache.xml.security.signature.XMLSignatureException: No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.keys.storage.StorageResolverException: No message with ID \"0000: 01                                                 .\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test296"); }


    java.lang.String var2 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.expandSystemId("d", "68 69 21");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "d"+ "'", var2.equals("d"));

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test297"); }


    org.apache.xml.security.Init.registerKeyInfoContentHandler("        ", "0000000000000001", "No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test298"); }


    org.apache.xml.security.utils.I18n.init(" aa  a  ", "00000000 00000000");

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test299"); }


    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var1 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("/////w==");

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test300"); }


    org.apache.xml.security.keys.provider.ApacheXMLProvider var0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    double var1 = var0.getVersion();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test301"); }


    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC var0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC();
    int var1 = var0.engineGetBlockSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test302"); }


    int var1 = org.apache.xml.security.algorithms.JCEMapper.getKeyTypeFromURI("ADQA\nIAAA\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test303"); }


    int var1 = org.apache.xml.security.algorithms.JCEMapper.getKeyLengthFromURI("\u00FF\u00FF\u00FF\u00FF\u00FF\u00FF\u00FF\u00FF");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test304"); }


    java.lang.String var1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeText("4141414142413D3D");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4141414142413D3D"+ "'", var1.equals("4141414142413D3D"));

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test305"); }


    byte[] var3 = new byte[] { (byte)0, (byte)0, (byte)(-1)};
    org.apache.xml.security.signature.XMLSignatureInput var4 = new org.apache.xml.security.signature.XMLSignatureInput(var3);
    org.apache.xpath.CachedXPathAPI var5 = var4.getCachedXPathAPI();
    java.io.InputStream var6 = var4.getOctetStream();
    org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous var7 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.Init.readUserConfiguration(var6);
      fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test306"); }


    java.lang.String var1 = org.apache.xml.security.utils.RFC2253Parser.rfc2253toXMLdsig("\u0001");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test307"); }


    java.lang.Object[] var4 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var5 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var4);
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var6 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("No message with ID \"0000000000000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", (java.lang.Exception)var5);
    org.apache.xml.security.signature.ReferenceNotInitializedException var7 = new org.apache.xml.security.signature.ReferenceNotInitializedException("http://www.w3.org/2001/04/xmlenc#aes192-cbc", (java.lang.Exception)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test308"); }


    org.apache.xml.security.keys.storage.StorageResolver var0 = new org.apache.xml.security.keys.storage.StorageResolver();
    java.security.cert.X509Certificate var1 = var0.next();

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test309"); }


    int var0 = org.apache.xml.security.keys.keyresolver.KeyResolver.length();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 13);

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test310"); }


    byte[] var1 = org.apache.xml.security.utils.HexDump.toByteArray((-1L));
    java.lang.String var2 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(var1);
    org.apache.xml.security.signature.XMLSignatureInput var3 = new org.apache.xml.security.signature.XMLSignatureInput(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = org.apache.xml.security.utils.HexDump.toHexString(var1, 10, 3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "FFFFFFFFFFFFFFFF"+ "'", var2.equals("FFFFFFFFFFFFFFFF"));

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test311"); }


    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC var0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    java.lang.String var1 = var0.getRequiredProviderName();
    int var2 = var0.getImplementedAlgorithmType();
    int var3 = var0.engineGetBlockSize();

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test312"); }


    org.apache.xml.security.exceptions.Base64DecodingException var1 = new org.apache.xml.security.exceptions.Base64DecodingException("ApacheXML version 1.0");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.apache.xml.security.exceptions.Base64DecodingException: No message with ID \"ApacheXML version 1.0\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var2.equals("org.apache.xml.security.exceptions.Base64DecodingException: No message with ID \"ApacheXML version 1.0\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test313"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    byte[] var4 = org.apache.xml.security.utils.HexDump.toByteArray((-1L));
    java.lang.String var5 = org.apache.xml.security.utils.HexDump.toHexString(var4);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams var6 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("ADQA\nIAAA\n", var4);
    java.security.cert.Certificate[] var7 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("/////w==", var4, var7);

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test314"); }


    java.lang.String var1 = org.apache.xml.security.utils.RFC2253Parser.normalize("org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver"+ "'", var1.equals("org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver"));

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test315"); }


    org.apache.xml.security.utils.I18n.initLocale("0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n", "org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver");

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test316"); }


    org.apache.xml.security.signature.InvalidDigestValueException var1 = new org.apache.xml.security.signature.InvalidDigestValueException("ApacheXML");

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test317"); }


    boolean var1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsRelative("No message with ID \"00000010\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test318"); }


    org.apache.xml.security.keys.provider.ProviderTest var0 = new org.apache.xml.security.keys.provider.ProviderTest();

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test319"); }


    int var1 = org.apache.xml.security.algorithms.JCEMapper.getKeyTypeFromURI("No message with ID \"No message with ID \"68 69 21 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test320"); }


    boolean var1 = org.apache.xml.security.algorithms.JCEMapper.addProvider("0000: FF FF FF FF                                        ....\r\n");

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test321"); }


    org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments var0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments();
    org.apache.xml.security.keys.provider.ApacheXMLProvider var1 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Collection var2 = var1.values();
    java.lang.Object var5 = var1.setProperty("ADQA\nIAAA\n", "\u00FF");
    java.util.Set var6 = var1.getServices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var7 = var0.engineCanonicalizeXPathNodeSet(var6);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test322"); }


    org.apache.xml.security.transforms.implementations.TransformC14N var0 = new org.apache.xml.security.transforms.implementations.TransformC14N();
    boolean var1 = var0.returnsNodeSet();
    boolean var2 = var0.returnsOctetStream();
    boolean var3 = var0.returnsNodeSet();
    boolean var4 = var0.returnsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test323"); }


    boolean var1 = org.apache.xml.security.algorithms.JCEMapper.getProviderIsInClassPath("No message with ID \"0000: 20 20 20 20 20 20 20 20                                    \r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test324"); }


    byte[] var3 = new byte[] { (byte)0, (byte)0, (byte)(-1)};
    org.apache.xml.security.signature.XMLSignatureInput var4 = new org.apache.xml.security.signature.XMLSignatureInput(var3);
    org.apache.xpath.CachedXPathAPI var5 = var4.getCachedXPathAPI();
    java.io.InputStream var6 = var4.getOctetStream();
    var4.setSourceURI("org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException: No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var9 = var4.getNodeSet();
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test325"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("0000: 00 34 00 20 00 00                                  .4. ..\r\n");

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test326"); }


    org.apache.xml.security.c14n.CanonicalizationException var1 = new org.apache.xml.security.c14n.CanonicalizationException("No message with ID \"0000: 30 30 30 30 30 30 30 30   30 30 30 30 30 30 30 30  0000000000000000\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.exceptions.XMLSecurityException and message No message with ID \"0000: 01                                                 .\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test327"); }


    org.apache.xml.security.transforms.Transform.register("No message with ID \"0000: 20 20 20 20 20 20 20 20                                    \r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "AAAABA==");

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test328"); }


    org.apache.xml.security.keys.provider.ApacheXMLProvider var0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.security.Provider.Service var3 = var0.getService("No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "org.apache.xml.security.keys.keyresolver.KeyResolverException: No message with ID \"FFaFFaFFaFFa\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.transforms.TransformationException: No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    java.lang.Object var4 = var0.clone();
    byte[] var8 = new byte[] { (byte)0, (byte)0, (byte)(-1)};
    org.apache.xml.security.signature.XMLSignatureInput var9 = new org.apache.xml.security.signature.XMLSignatureInput(var8);
    org.apache.xpath.CachedXPathAPI var10 = var9.getCachedXPathAPI();
    java.io.InputStream var11 = var9.getOctetStream();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.loadFromXML(var11);
      fail("Expected exception of type java.util.InvalidPropertiesFormatException");
    } catch (java.util.InvalidPropertiesFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test329"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    boolean var2 = var0.engineContainsAlias("No message with ID \"68 69 21 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test330"); }


    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP var2 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    java.lang.String[] var3 = var2.engineGetPropertyKeys();
    org.apache.xml.security.transforms.TransformationException var4 = new org.apache.xml.security.transforms.TransformationException("", (java.lang.Object[])var3);
    java.lang.String var5 = org.apache.xml.security.utils.I18n.getExceptionMessage(" aa  a  ", (java.lang.Exception)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "No message with ID \" aa  a  \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.transforms.TransformationException and message No message with ID \"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var5.equals("No message with ID \" aa  a  \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.transforms.TransformationException and message No message with ID \"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test331"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.keys.keyresolver.KeyResolver var1 = org.apache.xml.security.keys.keyresolver.KeyResolver.item(10);
      fail("Expected exception of type org.apache.xml.security.keys.keyresolver.KeyResolverException");
    } catch (org.apache.xml.security.keys.keyresolver.KeyResolverException e) {
      // Expected exception.
    }

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test332"); }


    java.lang.String var1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeProcessingInstruction("No message with ID \"0000: 20 20 20 20 20 20 20 20                                    \r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "No message with ID \"0000: 20 20 20 20 20 20 20 20                                    &#xD;\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var1.equals("No message with ID \"0000: 20 20 20 20 20 20 20 20                                    &#xD;\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test333"); }


    org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver var1 = new org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver("0000");

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test334"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    var0.engineDeleteEntry("No message with ID \"/////w==\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test335"); }


    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var1 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!");

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test336"); }


    byte[] var1 = org.apache.xml.security.utils.HexDump.toByteArray(100L);
    java.lang.String var2 = org.apache.xml.security.utils.Base64.encode(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "AAAAAAAAAGQ="+ "'", var2.equals("AAAAAAAAAGQ="));

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test337"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.cert.Certificate[] var2 = var0.engineGetCertificateChain("                                ");

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test338"); }


    org.apache.xml.security.c14n.helper.NSAttrCompare var0 = new org.apache.xml.security.c14n.helper.NSAttrCompare();
    java.lang.Object[] var4 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var5 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var4);
    org.apache.xml.security.transforms.TransformationException var7 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var8 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var4, (java.lang.Exception)var7);
    byte[] var10 = org.apache.xml.security.utils.HexDump.toByteArray((-1L));
    java.lang.String var11 = org.apache.xml.security.utils.Base64.encode(var10);
    java.lang.String var12 = org.apache.xml.security.utils.HexDump.toString(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var13 = var0.compare((java.lang.Object)var4, (java.lang.Object)var12);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "//////////8="+ "'", var11.equals("//////////8="));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "\u00FF\u00FF\u00FF\u00FF\u00FF\u00FF\u00FF\u00FF"+ "'", var12.equals("\u00FF\u00FF\u00FF\u00FF\u00FF\u00FF\u00FF\u00FF"));

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test339"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.prettyPrintHex("AAAAAAAAAGQ=");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0000: 41 41 41 41 41 41 41 41   41 47 51 3D              AAAAAAAAAGQ=\r\n"+ "'", var1.equals("0000: 41 41 41 41 41 41 41 41   41 47 51 3D              AAAAAAAAAGQ=\r\n"));

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test340"); }


    org.apache.xml.security.signature.XMLSignatureInput var1 = new org.apache.xml.security.signature.XMLSignatureInput("00000000a00000000a00000000a00000000a00000000a00000000a00000000a00001010");
    boolean var2 = var1.isOctetStream();
    boolean var3 = var1.isInitialized();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test341"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    boolean var2 = var0.engineIsKeyEntry("http://www.w3.org/2001/04/xmlenc#rsa-1_5");

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test342"); }


    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES256_BC var0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES256_BC();
    int var1 = var0.engineGetIvLength();
    boolean var2 = var0.getRequiredProviderAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test343"); }


    byte[] var1 = org.apache.xml.security.utils.HexDump.toByteArray((-1));
    java.lang.String var2 = org.apache.xml.security.utils.Base64.encode(var1);
    java.lang.String var3 = org.apache.xml.security.utils.Base64.encode(var1);
    java.lang.String var4 = org.apache.xml.security.utils.HexDump.toHexString(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "/////w=="+ "'", var2.equals("/////w=="));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "/////w=="+ "'", var3.equals("/////w=="));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "FFFFFFFF"+ "'", var4.equals("FFFFFFFF"));

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test344"); }


    org.apache.xml.security.utils.ElementProxy.setDefaultPrefix("/////w==", "4141414142413D3D");

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test345"); }


    boolean var1 = org.apache.xml.security.algorithms.JCEMapper.getProviderIsInClassPath("ApacheXML version 1.0");

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test346"); }


    boolean var1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsRelative("0000000000000000");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test347"); }


    boolean var1 = org.apache.xml.security.algorithms.JCEMapper.addProvider("444444444444 4 4");

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test348"); }


    java.lang.String var2 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.expandSystemId("Xerces-J 2.0.0", "00001010");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Xerces-J 2.0.0"+ "'", var2.equals("Xerces-J 2.0.0"));

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test349"); }


    sun.security.x509.X500Name var6 = org.apache.xml.security.keys.content.x509.XMLX509SubjectName.createX500Name("414451410A494141410A", "FFFFFFFFFFFFFFFF", "                                ", "http://www.w3.org/2001/04/xmlenc#aes128-cbc", "No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.c14n.CanonicalizationException and message No message with ID \"00000000a00000000a00000000a00000000a00000000a00000000a00000000a00001010\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test350"); }


    org.apache.xml.security.transforms.InvalidTransformException var1 = new org.apache.xml.security.transforms.InvalidTransformException("AAAAAAAAAGQ=");

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test351"); }


    java.lang.String var1 = org.apache.xml.security.utils.RFC2253Parser.xmldsigtoRFC2253("4444444444  4 444444444444 444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4444444444  4 444444444444 444444444444444444444"+ "'", var1.equals("4444444444  4 444444444444 444444444444444444444"));

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test352"); }


    java.lang.String var1 = org.apache.xml.security.utils.I18n.translate("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "No message with ID \"http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var1.equals("No message with ID \"http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test353"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.prettyPrintHex("No message with ID \"414451410A494141410A\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0000: 4E 6F 20 6D 65 73 73 61   67 65 20 77 69 74 68 20  No message with \r\n0010: 49 44 20 22 34 31 34 34   35 31 34 31 30 41 34 39  ID \"414451410A49\r\n0020: 34 31 34 31 34 31 30 41   22 20 66 6F 75 6E 64 20  4141410A\" found \r\n0030: 69 6E 20 72 65 73 6F 75   72 63 65 20 62 75 6E 64  in resource bund\r\n0040: 6C 65 20 22 6F 72 67 2F   61 70 61 63 68 65 2F 78  le \"org/apache/x\r\n0050: 6D 6C 2F 73 65 63 75 72   69 74 79 2F 72 65 73 6F  ml/security/reso\r\n0060: 75 72 63 65 2F 78 6D 6C   73 65 63 75 72 69 74 79  urce/xmlsecurity\r\n0070: 22                                                 \"\r\n"+ "'", var1.equals("0000: 4E 6F 20 6D 65 73 73 61   67 65 20 77 69 74 68 20  No message with \r\n0010: 49 44 20 22 34 31 34 34   35 31 34 31 30 41 34 39  ID \"414451410A49\r\n0020: 34 31 34 31 34 31 30 41   22 20 66 6F 75 6E 64 20  4141410A\" found \r\n0030: 69 6E 20 72 65 73 6F 75   72 63 65 20 62 75 6E 64  in resource bund\r\n0040: 6C 65 20 22 6F 72 67 2F   61 70 61 63 68 65 2F 78  le \"org/apache/x\r\n0050: 6D 6C 2F 73 65 63 75 72   69 74 79 2F 72 65 73 6F  ml/security/reso\r\n0060: 75 72 63 65 2F 78 6D 6C   73 65 63 75 72 69 74 79  urce/xmlsecurity\r\n0070: 22                                                 \"\r\n"));

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test354"); }


    org.apache.xml.security.c14n.Canonicalizer.register("ADQA\nIAAA\n", "00 34 00 20 00 00");

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test355"); }


    java.util.Set var1 = org.apache.xml.security.transforms.params.InclusiveNamespaces.prefixStr2Set("BC");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.w3c.dom.NodeList var2 = org.apache.xml.security.utils.XMLUtils.convertSetToNodelist(var1);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test356"); }


    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC var0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    int var1 = var0.engineGetIvLength();
    int var2 = var0.engineGetBlockSize();

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test357"); }


    org.apache.xml.security.transforms.implementations.TransformC14NWithComments var0 = new org.apache.xml.security.transforms.implementations.TransformC14NWithComments();
    boolean var1 = var0.wantsOctetStream();
    boolean var2 = var0.wantsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test358"); }


    org.apache.xml.security.transforms.implementations.TransformC14NExclusiveWithComments var0 = new org.apache.xml.security.transforms.implementations.TransformC14NExclusiveWithComments();
    boolean var1 = var0.returnsNodeSet();
    boolean var2 = var0.wantsNodeSet();
    boolean var3 = var0.wantsNodeSet();
    boolean var4 = var0.wantsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test359"); }


    org.apache.xml.security.utils.Constants.setSignatureSpecNSprefix("444444444444 4 4");

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test360"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.util.Date var2 = var0.engineGetCreationDate("No message with ID \"00000010\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test361"); }


    org.apache.xml.security.transforms.TransformationException var1 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var2 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException();
    var1.addSuppressed((java.lang.Throwable)var2);

  }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test362"); }


    org.apache.xml.security.utils.HexDump.setByteSeparator('4');

  }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test363"); }


    int var1 = org.apache.xml.security.algorithms.JCEMapper.getKeyLengthFromURI("No message with ID \"0000: 01                                                 .\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test364"); }


    org.apache.xml.security.signature.InvalidDigestValueException var1 = new org.apache.xml.security.signature.InvalidDigestValueException("444444444444 4 4");

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test365"); }


    org.apache.xml.security.signature.InvalidSignatureValueException var1 = new org.apache.xml.security.signature.InvalidSignatureValueException("org.apache.xml.security.signature.XMLSignatureException: No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.keys.storage.StorageResolverException: No message with ID \"0000: 01                                                 .\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test366"); }


    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC var0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    java.lang.String var1 = var0.getRequiredProviderName();
    java.lang.String var2 = var0.getImplementedAlgorithmURI();
    int var3 = var0.getImplementedAlgorithmType();
    int var4 = var0.engineGetBlockSize();

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test367"); }


    java.lang.String var2 = org.apache.xml.security.Init.getKeyInfoContentHandler("ADQA\nIAAA\n", "0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test368"); }


    int var1 = org.apache.xml.security.algorithms.JCEMapper.getKeyTypeFromURI("//////////8=");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test369"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("         aa  a  ");

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test370"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.signature.XMLSignatureInput var2 = new org.apache.xml.security.signature.XMLSignatureInput("Xalan Java 2.5.1", "\u0001");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test371"); }


    org.apache.xml.security.algorithms.JCEMapper.ProviderIdClass var1 = org.apache.xml.security.algorithms.JCEMapper.translateURItoJCEID("0000: 68 74 74 70 3A 2F 2F 77   77 77 2E 77 33 2E 6F 72  http://www.w3.or\r\n0010: 67 2F 32 30 30 31 2F 30   34 2F 78 6D 6C 65 6E 63  g/2001/04/xmlenc\r\n0020: 23 61 65 73 31 39 32 2D   63 62 63                 #aes192-cbc\r\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test372"); }


    java.lang.String var1 = org.apache.xml.security.utils.RFC2253Parser.rfc2253toXMLdsig("ADQA\nIAAA\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "ADQA\\aIAAA"+ "'", var1.equals("ADQA\\aIAAA"));

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test373"); }


    org.apache.xml.security.keys.provider.ApacheXMLProvider var0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.security.Provider.Service var3 = var0.getService("No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "org.apache.xml.security.keys.keyresolver.KeyResolverException: No message with ID \"FFaFFaFFaFFa\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.transforms.TransformationException: No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    java.lang.Object var4 = var0.clone();
    java.lang.String var5 = var0.getInfo();
    java.lang.Object var8 = var0.setProperty("                                                                ", "XMLSignatureInput/OctetStream/3 octets/null");
    java.util.Collection var9 = var0.values();
    java.util.Collection var10 = var0.values();
    java.lang.String var11 = var0.getName();
    java.util.Collection var12 = var0.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Apache XML Security Provider"+ "'", var5.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "ApacheXML"+ "'", var11.equals("ApacheXML"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test374"); }


    org.apache.xml.security.keys.provider.ApacheXMLProvider var0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.security.Provider.Service var3 = var0.getService("No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "org.apache.xml.security.keys.keyresolver.KeyResolverException: No message with ID \"FFaFFaFFaFFa\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.transforms.TransformationException: No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    java.lang.Object var4 = var0.clone();
    java.lang.String var5 = var0.getInfo();
    java.lang.Object var8 = var0.setProperty("                                                                ", "XMLSignatureInput/OctetStream/3 octets/null");
    java.util.Collection var9 = var0.values();
    java.util.Collection var10 = var0.values();
    java.lang.String var11 = var0.getName();
    byte[] var15 = new byte[] { (byte)0, (byte)0, (byte)(-1)};
    org.apache.xml.security.signature.XMLSignatureInput var16 = new org.apache.xml.security.signature.XMLSignatureInput(var15);
    org.apache.xpath.CachedXPathAPI var17 = var16.getCachedXPathAPI();
    java.io.InputStream var18 = var16.getOctetStream();
    org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous var19 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous(var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.loadFromXML(var18);
      fail("Expected exception of type java.util.InvalidPropertiesFormatException");
    } catch (java.util.InvalidPropertiesFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Apache XML Security Provider"+ "'", var5.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "ApacheXML"+ "'", var11.equals("ApacheXML"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test375"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    boolean var2 = var0.engineIsCertificateEntry("                                                                ");

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test376"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.util.Date var2 = var0.engineGetCreationDate("http://www.w3.org/2001/04/xmlenc#kw-tripledes");

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test377"); }


    int var1 = org.apache.xml.security.algorithms.JCEMapper.getKeyLengthFromURI("No message with ID \"http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test378"); }


    org.apache.xml.security.keys.storage.StorageResolverException var3 = new org.apache.xml.security.keys.storage.StorageResolverException("http://www.w3.org/2001/04/xmlenc#kw-aes192");
    org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException var4 = new org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException("ds", (java.lang.Exception)var3);
    org.apache.xml.security.exceptions.XMLSecurityException var5 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2001/04/xmlenc#kw-aes192", (java.lang.Exception)var3);

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test379"); }


    org.apache.xml.security.keys.provider.ApacheXMLProvider var0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Collection var1 = var0.values();
    var0.clear();
    java.lang.String var3 = var0.toString();
    var0.clear();
    byte[] var8 = new byte[] { (byte)0, (byte)0, (byte)(-1)};
    org.apache.xml.security.signature.XMLSignatureInput var9 = new org.apache.xml.security.signature.XMLSignatureInput(var8);
    org.apache.xpath.CachedXPathAPI var10 = var9.getCachedXPathAPI();
    java.io.InputStream var11 = var9.getOctetStream();
    org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous var12 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous(var11);
    org.apache.xml.security.signature.XMLSignatureInput var13 = new org.apache.xml.security.signature.XMLSignatureInput(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.loadFromXML(var11);
      fail("Expected exception of type java.util.InvalidPropertiesFormatException");
    } catch (java.util.InvalidPropertiesFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "ApacheXML version 1.0"+ "'", var3.equals("ApacheXML version 1.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test380"); }


    org.apache.xml.security.c14n.CanonicalizationException var1 = new org.apache.xml.security.c14n.CanonicalizationException("http://www.w3.org/2001/04/xmlenc#kw-tripledes");

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test381"); }


    org.apache.xml.security.c14n.Canonicalizer.register("XMLSignatureInput/OctetStream/3 octets/null", "4E6F206D657373616765207769746820494420223638203639203231202220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922");

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test382"); }


    byte[] var1 = org.apache.xml.security.utils.HexDump.toByteArray((-1L));
    java.lang.String var2 = org.apache.xml.security.utils.HexDump.toHexString(var1);
    java.lang.String var3 = org.apache.xml.security.utils.HexDump.toBinaryString(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "FFFFFFFFFFFFFFFF"+ "'", var2.equals("FFFFFFFFFFFFFFFF"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "                                                                "+ "'", var3.equals("                                                                "));

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test383"); }


    org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver var1 = new org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver("http://www.w3.org/2001/04/xmlenc#aes192-cbc");

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test384"); }


    byte[] var1 = org.apache.xml.security.utils.HexDump.toByteArray((-1L));
    java.lang.String var2 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(var1);
    java.lang.String var5 = org.apache.xml.security.utils.HexDump.toHexString(var1, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "FFFFFFFFFFFFFFFF"+ "'", var2.equals("FFFFFFFFFFFFFFFF"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test385"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("BC");

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test386"); }


    org.apache.xml.security.algorithms.JCEMapper.ProviderIdClass var1 = org.apache.xml.security.algorithms.JCEMapper.translateURItoJCEID("0000: FF FF FF FF                                        ....\r\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test387"); }


    org.apache.xml.security.keys.keyresolver.KeyResolver.registerAtStart("414451410A494141410A");

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test388"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.keys.keyresolver.KeyResolver var1 = org.apache.xml.security.keys.keyresolver.KeyResolver.item(16);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test389"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous var1 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous("00 34 00 20 00 00");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test390"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.cert.Certificate[] var2 = var0.engineGetCertificateChain("4E6F206D657373616765207769746820494420223638203639203231202220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922");

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test391"); }


    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES128_BC var0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES128_BC();
    int var1 = var0.getImplementedAlgorithmType();
    java.lang.String var2 = var0.getImplementedAlgorithmURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "http://www.w3.org/2001/04/xmlenc#aes128-cbc"+ "'", var2.equals("http://www.w3.org/2001/04/xmlenc#aes128-cbc"));

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test392"); }


    org.apache.xml.security.keys.KeyInfo.registerKeyInfoContentHandler("http://www.w3.org/2001/04/xmlenc#aes128-cbc", "Xerces-J 2.0.0", "         aa  a  ");

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test393"); }


    org.apache.xml.security.keys.provider.ApacheXMLProvider var0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.security.Provider.Service var3 = var0.getService("No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "org.apache.xml.security.keys.keyresolver.KeyResolverException: No message with ID \"FFaFFaFFaFFa\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.transforms.TransformationException: No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    java.lang.Object var4 = var0.clone();
    java.lang.String var5 = var0.getInfo();
    java.lang.Object var8 = var0.setProperty("                                                                ", "XMLSignatureInput/OctetStream/3 octets/null");
    java.util.Collection var9 = var0.values();
    java.util.Enumeration var10 = var0.elements();
    java.lang.Object var12 = var0.get((java.lang.Object)"0000: 36 89 9E B2 C6 A0 7B 08   AD 84 80 BF 36 89 9E B2  6...........6...\r\n0010: C6 A0 7B 08 AD 84 80 BF   D3 4D 34 D3 4D 34 D3 4D  .........M4.M4.M\r\n0020: 34 D3 4D 34 FD FA 2E 9D   D8 A7 AD EB 28 BA B7 1E  4.M4........(...\r\n0030: 6E E9 DD 95 DF E8 AE 0F   DA A5 A7 21 7B FC 66 97  n..........!..f.\r\n0040: FB 1E 72 EA E2 B7 2F EB   7A CA 2E AD C7 BF C6 69  ..r.../.z......i\r\n0050: 6C 79 CB AB 8A DC 7F FD   FA 2E 9D D8 A7 AD EB 28  ly.............(\r\n0060: BA B7 1E 6E E9 DD 95 DF   E8 AE 0F DA A5 A7 21 7B  ...n..........!.\r\n0070: FC 66 97 FB 1E 72 EA E2   B7 2F EB 7A CA 2E AD C7  .f...r.../.z....\r\n0080: BF C6 69 6C 79 CB AB 8A   DC 7F                    ..ily.....\r\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Apache XML Security Provider"+ "'", var5.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test394"); }


    org.apache.xml.security.utils.EncryptionConstants.setEncryptionSpecNSprefix("http://www.w3.org/2001/04/xmlenc#aes128-cbc");

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test395"); }


    org.apache.xml.security.utils.I18n.initLocale("444444444444 4 4", "        ");

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test396"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test397"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.stringToHexString("org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "6F72672E6170616368652E786D6C2E73656375726974792E6B6579732E6B65797265736F6C7665722E696D706C656D656E746174696F6E732E5253414B657956616C75655265736F6C766572"+ "'", var1.equals("6F72672E6170616368652E786D6C2E73656375726974792E6B6579732E6B65797265736F6C7665722E696D706C656D656E746174696F6E732E5253414B657956616C75655265736F6C766572"));

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test398"); }


    boolean var1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsRelative("No message with ID \"FFFFFFFFFFFFFFFF\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.transforms.InvalidTransformException and message No message with ID \"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test399"); }


    byte[] var1 = org.apache.xml.security.utils.HexDump.toByteArray((-1));
    java.lang.String var2 = org.apache.xml.security.utils.HexDump.prettyPrintHex(var1);
    org.apache.xml.security.signature.XMLSignatureInput var3 = new org.apache.xml.security.signature.XMLSignatureInput(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var4 = var3.getNodeSet();
      fail("Expected exception of type java.io.UTFDataFormatException");
    } catch (java.io.UTFDataFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0000: FF FF FF FF                                        ....\r\n"+ "'", var2.equals("0000: FF FF FF FF                                        ....\r\n"));

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test400"); }


    byte[] var2 = org.apache.xml.security.utils.PRNG.createBytes(0);
    java.lang.String var3 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(var2);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams var4 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("0000: FF FF FF FF                                        ....\r\n", var2);
    byte[] var5 = var4.getOAEPParamBytes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test401"); }


    java.lang.String var2 = org.apache.xml.security.Init.getKeyInfoContentHandler("No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "4E6F206D657373616765207769746820494420223638203639203231202220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test402"); }


    java.lang.String var1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeProcessingInstruction("No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var1.equals("No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test403"); }


    org.apache.xml.security.c14n.helper.AttrCompare var0 = new org.apache.xml.security.c14n.helper.AttrCompare();
    org.apache.xml.security.keys.keyresolver.KeyResolverException var2 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("4141414142413D3D");
    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC var3 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC();
    java.lang.String var4 = var3.getRequiredProviderName();
    int var5 = var3.engineGetIvLength();
    java.lang.String var6 = var3.getRequiredProviderName();
    java.lang.String var7 = var3.getImplementedAlgorithmURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var0.compare((java.lang.Object)"4141414142413D3D", (java.lang.Object)var3);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "BC"+ "'", var4.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "BC"+ "'", var6.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-1_5"+ "'", var7.equals("http://www.w3.org/2001/04/xmlenc#rsa-1_5"));

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test404"); }


    java.lang.Object[] var6 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var7 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var6);
    org.apache.xml.security.exceptions.Base64DecodingException var8 = new org.apache.xml.security.exceptions.Base64DecodingException("hi!", var6);
    java.lang.Object[] var15 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var16 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var15);
    org.apache.xml.security.transforms.TransformationException var18 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var19 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var15, (java.lang.Exception)var18);
    org.apache.xml.security.signature.ReferenceNotInitializedException var20 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00000000 00000000", var15);
    org.apache.xml.security.c14n.CanonicalizationException var21 = new org.apache.xml.security.c14n.CanonicalizationException("68 69 21 ", var15);
    java.lang.Object[] var25 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var26 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var25);
    org.apache.xml.security.transforms.TransformationException var28 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var29 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var25, (java.lang.Exception)var28);
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException var30 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("0000: 01                                                 .\r\n", var15, (java.lang.Exception)var28);
    org.apache.xml.security.c14n.CanonicalizationException var31 = new org.apache.xml.security.c14n.CanonicalizationException("00001010", var6, (java.lang.Exception)var28);
    java.lang.Object[] var38 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var39 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var38);
    org.apache.xml.security.transforms.TransformationException var41 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var42 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var38, (java.lang.Exception)var41);
    org.apache.xml.security.signature.ReferenceNotInitializedException var43 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00000000 00000000", var38);
    org.apache.xml.security.c14n.CanonicalizationException var44 = new org.apache.xml.security.c14n.CanonicalizationException("68 69 21 ", var38);
    java.lang.Object[] var48 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var49 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var48);
    org.apache.xml.security.transforms.TransformationException var51 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var52 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var48, (java.lang.Exception)var51);
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException var53 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("0000: 01                                                 .\r\n", var38, (java.lang.Exception)var51);
    org.apache.xml.security.signature.XMLSignatureException var54 = new org.apache.xml.security.signature.XMLSignatureException("003400200000", var6, (java.lang.Exception)var51);
    org.apache.xml.security.exceptions.XMLSecurityException var55 = new org.apache.xml.security.exceptions.XMLSecurityException("/////w==", (java.lang.Exception)var51);
    java.lang.Throwable[] var56 = var51.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test405"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    byte[] var4 = new byte[] { (byte)0, (byte)0, (byte)(-1)};
    org.apache.xml.security.signature.XMLSignatureInput var5 = new org.apache.xml.security.signature.XMLSignatureInput(var4);
    org.apache.xpath.CachedXPathAPI var6 = var5.getCachedXPathAPI();
    java.io.InputStream var7 = var5.getOctetStream();
    org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous var8 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous(var7);
    char[] var11 = new char[] { '4', ' '};
    byte[] var12 = org.apache.xml.security.keys.provider.KeyElement.PKCS12PasswordToBytes(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.engineLoad(var7, var11);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test406"); }


    org.apache.xml.security.utils.HelperNodeList var0 = new org.apache.xml.security.utils.HelperNodeList();
    org.w3c.dom.Document var1 = var0.getOwnerDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.w3c.dom.Node var3 = var0.item(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test407"); }


    byte[] var1 = org.apache.xml.security.utils.HexDump.toByteArray((-1));
    java.lang.String var2 = org.apache.xml.security.utils.HexDump.prettyPrintHex(var1);
    org.apache.xml.security.signature.XMLSignatureInput var3 = new org.apache.xml.security.signature.XMLSignatureInput(var1);
    boolean var4 = var3.isNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0000: FF FF FF FF                                        ....\r\n"+ "'", var2.equals("0000: FF FF FF FF                                        ....\r\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test408"); }


    org.apache.xml.security.algorithms.SignatureAlgorithm.register("xmlsecurityOrgPrefsJbGzQBZSDvfRMokD5jmlgqidZuO", "ADQA\\aIAAA");

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test409"); }


    java.lang.String var1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeProcessingInstruction("4E6F206D657373616765207769746820494420223638203639203231202220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4E6F206D657373616765207769746820494420223638203639203231202220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922"+ "'", var1.equals("4E6F206D657373616765207769746820494420223638203639203231202220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922"));

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test410"); }


    java.lang.String var1 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.fixURI("org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver"+ "'", var1.equals("org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver"));

  }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test411"); }


    org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver var1 = new org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver("4444444444  4 444444444444 444444444444444444444");

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test412"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous var1 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous("Apache XML Security Provider");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test413"); }


    org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments var0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments();
    java.lang.String var1 = var0.engineGetURI();
    java.util.Set var3 = org.apache.xml.security.transforms.params.InclusiveNamespaces.prefixStr2Set("BC");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var5 = var0.engineCanonicalizeXPathNodeSet(var3, "ADQA\nIAAA\n");
      fail("Expected exception of type org.apache.xml.security.c14n.CanonicalizationException");
    } catch (org.apache.xml.security.c14n.CanonicalizationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"+ "'", var1.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test414"); }


    org.apache.xml.security.utils.resolver.ResourceResolver.register("444444444444 4 4");

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test415"); }


    org.apache.xml.security.c14n.helper.AttrCompare var0 = new org.apache.xml.security.c14n.helper.AttrCompare();
    org.apache.xml.security.signature.ReferenceNotInitializedException var3 = new org.apache.xml.security.signature.ReferenceNotInitializedException("                                ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var0.compare((java.lang.Object)100, (java.lang.Object)"                                ");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test416"); }


    org.apache.xml.security.exceptions.XMLSecurityException var1 = new org.apache.xml.security.exceptions.XMLSecurityException("0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n");

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test417"); }


    org.apache.xml.security.signature.XMLSignatureInput var1 = new org.apache.xml.security.signature.XMLSignatureInput("No message with ID \"/////w==\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test418"); }


    org.apache.xml.security.utils.resolver.ResourceResolver.register("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test419"); }


    org.apache.xml.security.keys.provider.ApacheXMLProvider var0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.security.Provider.Service var3 = var0.getService("No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "org.apache.xml.security.keys.keyresolver.KeyResolverException: No message with ID \"FFaFFaFFaFFa\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.transforms.TransformationException: No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    java.lang.Object var4 = var0.clone();
    boolean var6 = var0.containsValue((java.lang.Object)"0000000000000001");
    java.lang.String var7 = var0.toString();
    byte[] var10 = org.apache.xml.security.utils.PRNG.createBytes(0);
    java.lang.String var11 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(var10);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams var12 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("0000: FF FF FF FF                                        ....\r\n", var10);
    java.lang.Object var13 = var0.remove((java.lang.Object)var12);
    java.lang.String var14 = var12.getAlgorithmURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "ApacheXML version 1.0"+ "'", var7.equals("ApacheXML version 1.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"+ "'", var14.equals("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"));

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test420"); }


    sun.security.x509.X500Name var4 = org.apache.xml.security.keys.content.x509.XMLX509SubjectName.createX500Name("No message with ID \"0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "0000: 36 89 9E B2 C6 A0 7B 08   AD 84 80 BF 36 89 9E B2  6...........6...\r\n0010: C6 A0 7B 08 AD 84 80 BF   D3 4D 34 D3 4D 34 D3 4D  .........M4.M4.M\r\n0020: 34 D3 4D 34 FD FA 2E 9D   D8 A7 AD EB 28 BA B7 1E  4.M4........(...\r\n0030: 6E E9 DD 95 DF E8 AE 0F   DA A5 A7 21 7B FC 66 97  n..........!..f.\r\n0040: FB 1E 72 EA E2 B7 2F EB   7A CA 2E AD C7 BF C6 69  ..r.../.z......i\r\n0050: 6C 79 CB AB 8A DC 7F FD   FA 2E 9D D8 A7 AD EB 28  ly.............(\r\n0060: BA B7 1E 6E E9 DD 95 DF   E8 AE 0F DA A5 A7 21 7B  ...n..........!.\r\n0070: FC 66 97 FB 1E 72 EA E2   B7 2F EB 7A CA 2E AD C7  .f...r.../.z....\r\n0080: BF C6 69 6C 79 CB AB 8A   DC 7F                    ..ily.....\r\n", "http://www.w3.org/2001/10/xml-exc-c14n#", "org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException: No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test421"); }


    java.lang.String var1 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.fixURI("00000010");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00000010"+ "'", var1.equals("00000010"));

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test422"); }


    org.apache.xml.security.keys.keyresolver.KeyResolver.registerAtStart("00000000 00000000");

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test423"); }


    boolean var2 = org.apache.xml.security.utils.JavaUtils.implementsInterface((java.lang.Object)"                                ", "0000");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test424"); }


    org.apache.xml.security.utils.EncryptionConstants.setEncryptionSpecNSprefix("ds");

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test425"); }


    org.apache.xml.security.utils.HelperNodeList var0 = new org.apache.xml.security.utils.HelperNodeList();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.w3c.dom.Node var2 = var0.item(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test426"); }


    org.apache.xml.security.transforms.implementations.TransformBase64Decode var0 = new org.apache.xml.security.transforms.implementations.TransformBase64Decode();
    boolean var1 = var0.returnsNodeSet();
    boolean var2 = var0.wantsOctetStream();
    boolean var3 = var0.returnsNodeSet();
    boolean var4 = var0.returnsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test427"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.Init.readUserConfiguration("AAAABA==");
      fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test428"); }


    sun.security.x509.X500Name var6 = org.apache.xml.security.keys.content.x509.XMLX509SubjectName.createX500Name("No message with ID \"http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "No message with ID \"0000: 20 20 20 20 20 20 20 20                                    &#xD;\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "4444444444  4 444444444444 444444444444444444444", "0000: 01                                                 .\r\n", "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p", "0000: 68 74 74 70 3A 2F 2F 77   77 77 2E 77 33 2E 6F 72  http://www.w3.or\r\n0010: 67 2F 32 30 30 31 2F 30   34 2F 78 6D 6C 65 6E 63  g/2001/04/xmlenc\r\n0020: 23 61 65 73 31 39 32 2D   63 62 63                 #aes192-cbc\r\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test429"); }


    boolean var1 = org.apache.xml.security.algorithms.JCEMapper.getProviderIsInClassPath("");

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test430"); }


    org.apache.xml.security.transforms.implementations.TransformC14N var0 = new org.apache.xml.security.transforms.implementations.TransformC14N();
    boolean var1 = var0.returnsNodeSet();
    boolean var2 = var0.wantsOctetStream();
    boolean var3 = var0.returnsOctetStream();
    boolean var4 = var0.returnsNodeSet();
    boolean var5 = var0.returnsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test431"); }


    org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments var0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments();
    boolean var1 = var0.engineGetIncludeComments();
    org.apache.xml.security.keys.provider.ApacheXMLProvider var2 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.lang.Object[] var9 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var10 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var9);
    org.apache.xml.security.exceptions.Base64DecodingException var11 = new org.apache.xml.security.exceptions.Base64DecodingException("hi!", var9);
    java.lang.Object[] var18 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var19 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var18);
    org.apache.xml.security.transforms.TransformationException var21 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var22 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var18, (java.lang.Exception)var21);
    org.apache.xml.security.signature.ReferenceNotInitializedException var23 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00000000 00000000", var18);
    org.apache.xml.security.c14n.CanonicalizationException var24 = new org.apache.xml.security.c14n.CanonicalizationException("68 69 21 ", var18);
    java.lang.Object[] var28 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var29 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var28);
    org.apache.xml.security.transforms.TransformationException var31 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var32 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var28, (java.lang.Exception)var31);
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException var33 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("0000: 01                                                 .\r\n", var18, (java.lang.Exception)var31);
    org.apache.xml.security.c14n.CanonicalizationException var34 = new org.apache.xml.security.c14n.CanonicalizationException("00001010", var9, (java.lang.Exception)var31);
    java.lang.Object[] var38 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var39 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var38);
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException var40 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("hi!", (java.lang.Exception)var39);
    org.apache.xml.security.exceptions.Base64DecodingException var41 = new org.apache.xml.security.exceptions.Base64DecodingException("00000000a00000000a00000000a00000000a00000000a00000000a00000000a00001010", var9, (java.lang.Exception)var40);
    org.apache.xml.security.transforms.InvalidTransformException var44 = new org.apache.xml.security.transforms.InvalidTransformException();
    org.apache.xml.security.keys.keyresolver.KeyResolverException var45 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("00000000 00000000", (java.lang.Exception)var44);
    org.apache.xml.security.signature.XMLSignatureException var46 = new org.apache.xml.security.signature.XMLSignatureException("BC", (java.lang.Exception)var45);
    org.apache.xml.security.transforms.InvalidTransformException var47 = new org.apache.xml.security.transforms.InvalidTransformException("No message with ID \"0000000000000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", var9, (java.lang.Exception)var45);
    java.lang.Object var48 = var2.remove((java.lang.Object)var9);
    byte[] var52 = new byte[] { (byte)0, (byte)0, (byte)(-1)};
    org.apache.xml.security.signature.XMLSignatureInput var53 = new org.apache.xml.security.signature.XMLSignatureInput(var52);
    org.apache.xpath.CachedXPathAPI var54 = var53.getCachedXPathAPI();
    java.io.InputStream var55 = var53.getOctetStream();
    org.apache.xml.security.signature.XMLSignatureInput var56 = new org.apache.xml.security.signature.XMLSignatureInput(var55);
    boolean var57 = var2.containsValue((java.lang.Object)var56);
    java.util.Set var58 = var2.stringPropertyNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var59 = var0.engineCanonicalizeXPathNodeSet(var58);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test432"); }


    boolean var1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsRelative("No message with ID \"/////w==\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test433"); }


    int var3 = org.apache.xml.security.encryption.EncryptedData.min(3, 16, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test434"); }


    org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver var1 = new org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver("//////////8=");

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test435"); }


    org.apache.xml.security.algorithms.encryption.params.StreamParams var1 = new org.apache.xml.security.algorithms.encryption.params.StreamParams(5);
    java.lang.String var2 = var1.getAlgorithmURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test436"); }


    org.apache.xml.security.keys.KeyInfo.registerKeyInfoContentHandler("0000: 4E 6F 20 6D 65 73 73 61   67 65 20 77 69 74 68 20  No message with \r\n0010: 49 44 20 22 34 31 34 34   35 31 34 31 30 41 34 39  ID \"414451410A49\r\n0020: 34 31 34 31 34 31 30 41   22 20 66 6F 75 6E 64 20  4141410A\" found \r\n0030: 69 6E 20 72 65 73 6F 75   72 63 65 20 62 75 6E 64  in resource bund\r\n0040: 6C 65 20 22 6F 72 67 2F   61 70 61 63 68 65 2F 78  le \"org/apache/x\r\n0050: 6D 6C 2F 73 65 63 75 72   69 74 79 2F 72 65 73 6F  ml/security/reso\r\n0060: 75 72 63 65 2F 78 6D 6C   73 65 63 75 72 69 74 79  urce/xmlsecurity\r\n0070: 22                                                 \"\r\n", "xmlsecurityOrgPrefsJbGzQBZSDvfRMokD5jmlgqidZuO", "0000: 20 20 20 20 20 20 20 20                                    \r\n");

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test437"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    byte[] var3 = org.apache.xml.security.utils.HexDump.toByteArray(10L);
    java.security.cert.Certificate[] var4 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("68 69 21 ", var3, var4);

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test438"); }


    java.lang.String var2 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.expandSystemId("FFFFFFFF", "0000: 36 89 9E B2 C6 A0 7B 08   AD 84 80 BF 36 89 9E B2  6...........6...\r\n0010: C6 A0 7B 08 AD 84 80 BF   D3 4D 34 D3 4D 34 D3 4D  .........M4.M4.M\r\n0020: 34 D3 4D 34 FD FA 2E 9D   D8 A7 AD EB 28 BA B7 1E  4.M4........(...\r\n0030: 6E E9 DD 95 DF E8 AE 0F   DA A5 A7 21 7B FC 66 97  n..........!..f.\r\n0040: FB 1E 72 EA E2 B7 2F EB   7A CA 2E AD C7 BF C6 69  ..r.../.z......i\r\n0050: 6C 79 CB AB 8A DC 7F FD   FA 2E 9D D8 A7 AD EB 28  ly.............(\r\n0060: BA B7 1E 6E E9 DD 95 DF   E8 AE 0F DA A5 A7 21 7B  ...n..........!.\r\n0070: FC 66 97 FB 1E 72 EA E2   B7 2F EB 7A CA 2E AD C7  .f...r.../.z....\r\n0080: BF C6 69 6C 79 CB AB 8A   DC 7F                    ..ily.....\r\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "FFFFFFFF"+ "'", var2.equals("FFFFFFFF"));

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test439"); }


    java.lang.Object[] var7 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var8 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var7);
    org.apache.xml.security.exceptions.Base64DecodingException var9 = new org.apache.xml.security.exceptions.Base64DecodingException("hi!", var7);
    java.lang.Object[] var16 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var17 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var16);
    org.apache.xml.security.transforms.TransformationException var19 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var20 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var16, (java.lang.Exception)var19);
    org.apache.xml.security.signature.ReferenceNotInitializedException var21 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00000000 00000000", var16);
    org.apache.xml.security.c14n.CanonicalizationException var22 = new org.apache.xml.security.c14n.CanonicalizationException("68 69 21 ", var16);
    java.lang.Object[] var26 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var27 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var26);
    org.apache.xml.security.transforms.TransformationException var29 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var30 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var26, (java.lang.Exception)var29);
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException var31 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("0000: 01                                                 .\r\n", var16, (java.lang.Exception)var29);
    org.apache.xml.security.c14n.CanonicalizationException var32 = new org.apache.xml.security.c14n.CanonicalizationException("00001010", var7, (java.lang.Exception)var29);
    java.lang.Object[] var39 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var40 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var39);
    org.apache.xml.security.transforms.TransformationException var42 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var43 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var39, (java.lang.Exception)var42);
    org.apache.xml.security.signature.ReferenceNotInitializedException var44 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00000000 00000000", var39);
    org.apache.xml.security.c14n.CanonicalizationException var45 = new org.apache.xml.security.c14n.CanonicalizationException("68 69 21 ", var39);
    java.lang.Object[] var49 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var50 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var49);
    org.apache.xml.security.transforms.TransformationException var52 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var53 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var49, (java.lang.Exception)var52);
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException var54 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("0000: 01                                                 .\r\n", var39, (java.lang.Exception)var52);
    org.apache.xml.security.signature.XMLSignatureException var55 = new org.apache.xml.security.signature.XMLSignatureException("003400200000", var7, (java.lang.Exception)var52);
    org.apache.xml.security.exceptions.XMLSecurityException var56 = new org.apache.xml.security.exceptions.XMLSecurityException("/////w==", (java.lang.Exception)var52);
    org.apache.xml.security.signature.XMLSignatureException var57 = new org.apache.xml.security.signature.XMLSignatureException("No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.c14n.CanonicalizationException and message No message with ID \"00000000a00000000a00000000a00000000a00000000a00000000a00000000a00001010\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", (java.lang.Exception)var56);
    java.lang.String var58 = var57.getMsgID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.c14n.CanonicalizationException and message No message with ID \"00000000a00000000a00000000a00000000a00000000a00000000a00000000a00001010\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var58.equals("No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.c14n.CanonicalizationException and message No message with ID \"00000000a00000000a00000000a00000000a00000000a00000000a00000000a00001010\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test440"); }


    boolean var1 = org.apache.xml.security.algorithms.JCEMapper.addProvider("4E6F206D657373616765207769746820494420223638203639203231202220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922");

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test441"); }


    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException var2 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException();
    org.apache.xml.security.signature.InvalidDigestValueException var3 = new org.apache.xml.security.signature.InvalidDigestValueException("        ", (java.lang.Exception)var2);
    org.apache.xml.security.signature.InvalidDigestValueException var4 = new org.apache.xml.security.signature.InvalidDigestValueException("Xerces-J 2.0.0", (java.lang.Exception)var2);

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test442"); }


    byte[] var3 = new byte[] { (byte)0, (byte)0, (byte)(-1)};
    org.apache.xml.security.signature.XMLSignatureInput var4 = new org.apache.xml.security.signature.XMLSignatureInput(var3);
    java.lang.String var5 = var4.getSourceURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var6 = var4.getNodeSet();
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test443"); }


    byte[] var3 = new byte[] { (byte)0, (byte)0, (byte)(-1)};
    org.apache.xml.security.signature.XMLSignatureInput var4 = new org.apache.xml.security.signature.XMLSignatureInput(var3);
    org.apache.xpath.CachedXPathAPI var5 = var4.getCachedXPathAPI();
    java.io.InputStream var6 = var4.getOctetStream();
    org.apache.xml.security.signature.XMLSignatureInput var7 = new org.apache.xml.security.signature.XMLSignatureInput(var6);
    java.lang.String var8 = var7.getSourceURI();
    java.lang.String var9 = var7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "XMLSignatureInput/OctetStream/3 octets/null"+ "'", var9.equals("XMLSignatureInput/OctetStream/3 octets/null"));

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test444"); }


    org.apache.xml.security.utils.EncryptionConstants.setEncryptionSpecNSprefix("No message with ID \"0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test445"); }


    org.apache.xml.security.c14n.helper.C14nNodeFilter var1 = new org.apache.xml.security.c14n.helper.C14nNodeFilter(false);

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test446"); }


    byte[] var3 = new byte[] { (byte)0, (byte)0, (byte)(-1)};
    org.apache.xml.security.signature.XMLSignatureInput var4 = new org.apache.xml.security.signature.XMLSignatureInput(var3);
    java.lang.String var5 = var4.getSourceURI();
    var4.setSourceURI("0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n");
    org.apache.xpath.CachedXPathAPI var8 = var4.getCachedXPathAPI();
    java.lang.String var9 = var4.getSourceURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n"+ "'", var9.equals("0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n"));

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test447"); }


    org.apache.xml.security.utils.ElementProxy.setDefaultPrefix("Apache XML Security Provider", "No message with ID \"http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test448"); }


    org.apache.xml.security.utils.Base64.setBase64WrapLength(1);

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test449"); }


    org.apache.xml.security.transforms.implementations.TransformXPath var0 = new org.apache.xml.security.transforms.implementations.TransformXPath();
    boolean var1 = var0.returnsOctetStream();
    boolean var2 = var0.returnsOctetStream();
    boolean var3 = var0.returnsNodeSet();
    boolean var4 = var0.returnsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test450"); }


    org.apache.xml.security.keys.KeyInfo.registerKeyInfoContentHandler("No message with ID \"68 69 21 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "00 34 00 20 00 00", "No message with ID \"0000: 20 20 20 20 20 20 20 20                                    \r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test451"); }


    org.apache.xml.security.keys.keyresolver.KeyResolver.registerAtStart("http://www.w3.org/2001/04/xmlenc#kw-aes128");

  }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test452"); }


    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException var1 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("AAAAAQ==");

  }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test453"); }


    org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments var0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments();
    java.lang.String var1 = var0.engineGetURI();
    boolean var2 = var0.engineGetIncludeComments();
    org.apache.xml.security.utils.HelperNodeList var3 = new org.apache.xml.security.utils.HelperNodeList();
    org.w3c.dom.Document var4 = var3.getOwnerDocument();
    java.util.Set var5 = org.apache.xml.security.utils.XMLUtils.convertNodelistToSet((org.w3c.dom.NodeList)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var7 = var0.engineCanonicalizeXPathNodeSet((org.w3c.dom.NodeList)var3, "00 34 00 20 00 00");
      fail("Expected exception of type org.apache.xml.security.c14n.CanonicalizationException");
    } catch (org.apache.xml.security.c14n.CanonicalizationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"+ "'", var1.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test454"); }


    byte[] var3 = new byte[] { (byte)0, (byte)0, (byte)(-1)};
    org.apache.xml.security.signature.XMLSignatureInput var4 = new org.apache.xml.security.signature.XMLSignatureInput(var3);
    java.lang.String var5 = var4.getSourceURI();
    var4.setSourceURI("0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n");
    org.apache.xpath.CachedXPathAPI var8 = var4.getCachedXPathAPI();
    org.apache.xpath.CachedXPathAPI var9 = var4.getCachedXPathAPI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test455"); }


    org.apache.xml.security.transforms.implementations.TransformBase64Decode var0 = new org.apache.xml.security.transforms.implementations.TransformBase64Decode();
    boolean var1 = var0.returnsNodeSet();
    boolean var2 = var0.wantsNodeSet();
    boolean var3 = var0.wantsNodeSet();
    boolean var4 = var0.returnsNodeSet();
    boolean var5 = var0.returnsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test456"); }


    org.apache.xml.security.transforms.implementations.TransformXPointer var0 = new org.apache.xml.security.transforms.implementations.TransformXPointer();
    boolean var1 = var0.wantsNodeSet();
    boolean var2 = var0.returnsNodeSet();
    boolean var3 = var0.wantsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test457"); }


    org.apache.xml.security.utils.resolver.implementations.ResolverXPointer var0 = new org.apache.xml.security.utils.resolver.implementations.ResolverXPointer();
    java.lang.String[] var1 = var0.engineGetPropertyKeys();
    java.lang.String var3 = var0.engineGetProperty("/////w==");
    org.apache.xml.security.keys.provider.ApacheXMLProvider var4 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.security.Provider.Service var7 = var4.getService("No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "org.apache.xml.security.keys.keyresolver.KeyResolverException: No message with ID \"FFaFFaFFaFFa\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.transforms.TransformationException: No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    java.lang.Object var8 = var4.clone();
    org.apache.xml.security.keys.provider.ApacheXMLProvider var9 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Collection var10 = var9.values();
    var4.putAll((java.util.Map)var9);
    java.lang.String var12 = var4.toString();
    java.lang.String var13 = var4.toString();
    var0.engineAddProperies((java.util.Map)var4);
    org.apache.xml.security.transforms.implementations.TransformBase64Decode var15 = new org.apache.xml.security.transforms.implementations.TransformBase64Decode();
    boolean var16 = var15.returnsNodeSet();
    boolean var17 = var15.wantsOctetStream();
    boolean var18 = var15.wantsNodeSet();
    java.lang.Object var20 = var4.put((java.lang.Object)var18, (java.lang.Object)"http://www.w3.org/2001/04/xmlenc#rsa-1_5");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "ApacheXML version 1.0"+ "'", var12.equals("ApacheXML version 1.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "ApacheXML version 1.0"+ "'", var13.equals("ApacheXML version 1.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test458"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toBinaryString(13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "                                "+ "'", var1.equals("                                "));

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test459"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.Init.readUserConfiguration("ApacheXML");
      fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test460"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.utils.Constants.setSignatureSpecNSprefix("4141414142413D3D");
      fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test461"); }


    org.apache.xml.security.keys.provider.ApacheXMLProvider var0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.security.Provider.Service var3 = var0.getService("No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "org.apache.xml.security.keys.keyresolver.KeyResolverException: No message with ID \"FFaFFaFFaFFa\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.transforms.TransformationException: No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    java.lang.Object var5 = var0.remove((java.lang.Object)(short)100);
    java.util.Enumeration var6 = var0.keys();
    byte[] var10 = new byte[] { (byte)0, (byte)0, (byte)(-1)};
    org.apache.xml.security.signature.XMLSignatureInput var11 = new org.apache.xml.security.signature.XMLSignatureInput(var10);
    org.apache.xpath.CachedXPathAPI var12 = var11.getCachedXPathAPI();
    java.io.InputStream var13 = var11.getOctetStream();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.loadFromXML(var13);
      fail("Expected exception of type java.util.InvalidPropertiesFormatException");
    } catch (java.util.InvalidPropertiesFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test462"); }


    java.lang.String var1 = org.apache.xml.security.utils.RFC2253Parser.xmldsigtoRFC2253("0000: 41 41 41 41 41 41 41 41   41 47 51 3D              AAAAAAAAAGQ=\r\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0000: 41 41 41 41 41 41 41 41   41 47 51 3D              AAAAAAAAAGQ="+ "'", var1.equals("0000: 41 41 41 41 41 41 41 41   41 47 51 3D              AAAAAAAAAGQ="));

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test463"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toBinaryString(16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "                                "+ "'", var1.equals("                                "));

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test464"); }


    boolean var1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsAbsolute("\u00FF\u00FF\u00FF\u00FF\u00FF\u00FF\u00FF\u00FF");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test465"); }


    org.apache.xml.security.utils.resolver.ResourceResolver.register("00000000 00000000");

  }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test466"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.c14n.Canonicalizer var1 = org.apache.xml.security.c14n.Canonicalizer.getInstance("414451410A494141410A");
      fail("Expected exception of type org.apache.xml.security.c14n.InvalidCanonicalizerException");
    } catch (org.apache.xml.security.c14n.InvalidCanonicalizerException e) {
      // Expected exception.
    }

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test467"); }


    java.lang.String var1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeComment("\u0000");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\u0000"+ "'", var1.equals("\u0000"));

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test468"); }


    org.apache.xml.security.utils.resolver.ResourceResolver.register("XMLSignatureInput/OctetStream/3 octets/null");

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test469"); }


    org.apache.xml.security.keys.provider.ApacheXMLProvider var0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.security.Provider.Service var3 = var0.getService("No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "org.apache.xml.security.keys.keyresolver.KeyResolverException: No message with ID \"FFaFFaFFaFFa\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.transforms.TransformationException: No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    java.lang.Object var4 = var0.clone();
    double var5 = var0.getVersion();
    java.security.Provider.Service var8 = var0.getService("http://www.w3.org/2001/04/xmlenc#rsa-1_5", "ApacheXML version 1.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test470"); }


    org.apache.xml.security.keys.provider.ApacheXMLProvider var0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.security.Provider.Service var3 = var0.getService("No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "org.apache.xml.security.keys.keyresolver.KeyResolverException: No message with ID \"FFaFFaFFaFFa\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.transforms.TransformationException: No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    java.lang.Object var4 = var0.clone();
    boolean var6 = var0.containsValue((java.lang.Object)"0000000000000001");
    java.lang.String var7 = var0.toString();
    var0.clear();
    double var9 = var0.getVersion();
    org.apache.xml.security.transforms.implementations.TransformC14NExclusiveWithComments var10 = new org.apache.xml.security.transforms.implementations.TransformC14NExclusiveWithComments();
    boolean var11 = var10.returnsNodeSet();
    boolean var12 = var10.wantsNodeSet();
    boolean var13 = var10.wantsOctetStream();
    boolean var14 = var0.contains((java.lang.Object)var10);
    boolean var15 = var10.returnsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "ApacheXML version 1.0"+ "'", var7.equals("ApacheXML version 1.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test471"); }


    java.lang.String var1 = org.apache.xml.security.utils.I18n.getExceptionMessage("0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "No message with ID \"0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var1.equals("No message with ID \"0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test472"); }


    java.lang.Object[] var9 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var10 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var9);
    org.apache.xml.security.transforms.TransformationException var12 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var13 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var9, (java.lang.Exception)var12);
    org.apache.xml.security.signature.ReferenceNotInitializedException var14 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00000000 00000000", var9);
    org.apache.xml.security.c14n.CanonicalizationException var15 = new org.apache.xml.security.c14n.CanonicalizationException("68 69 21 ", var9);
    java.lang.Object[] var19 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var20 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var19);
    org.apache.xml.security.transforms.TransformationException var22 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var23 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var19, (java.lang.Exception)var22);
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException var24 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("0000: 01                                                 .\r\n", var9, (java.lang.Exception)var22);
    org.apache.xml.security.exceptions.XMLSecurityException var25 = new org.apache.xml.security.exceptions.XMLSecurityException("003400200000", var9);
    java.lang.Object[] var32 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var33 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var32);
    org.apache.xml.security.transforms.TransformationException var35 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var36 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var32, (java.lang.Exception)var35);
    org.apache.xml.security.signature.ReferenceNotInitializedException var37 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00000000 00000000", var32);
    org.apache.xml.security.c14n.CanonicalizationException var38 = new org.apache.xml.security.c14n.CanonicalizationException("68 69 21 ", var32);
    org.apache.xml.security.keys.keyresolver.KeyResolverException var39 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("\u0000", (java.lang.Exception)var38);
    org.apache.xml.security.keys.keyresolver.KeyResolverException var40 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("No message with ID \"FFFFFFFFFFFFFFFF\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.transforms.InvalidTransformException and message No message with ID \"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", var9, (java.lang.Exception)var39);
    java.lang.Object[] var48 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var49 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var48);
    org.apache.xml.security.transforms.TransformationException var51 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var52 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var48, (java.lang.Exception)var51);
    org.apache.xml.security.transforms.TransformationException var53 = new org.apache.xml.security.transforms.TransformationException("\u00FF", var48);
    org.apache.xml.security.keys.storage.StorageResolverException var54 = new org.apache.xml.security.keys.storage.StorageResolverException("Xerces-J 2.0.0", var48);
    org.apache.xml.security.exceptions.Base64DecodingException var55 = new org.apache.xml.security.exceptions.Base64DecodingException("ds", (java.lang.Exception)var54);
    org.apache.xml.security.exceptions.Base64DecodingException var56 = new org.apache.xml.security.exceptions.Base64DecodingException("00000010", (java.lang.Exception)var54);
    org.apache.xml.security.transforms.InvalidTransformException var57 = new org.apache.xml.security.transforms.InvalidTransformException("000A", var9, (java.lang.Exception)var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test473"); }


    org.apache.xml.security.utils.Constants.setSignatureSpecNSprefix("0000: FF FF FF FF                                        ....\r\n");

  }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test474"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.signature.XMLSignatureInput var2 = new org.apache.xml.security.signature.XMLSignatureInput("00", "4444444444  4 444444444444 444444444444444444444");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test475"); }


    boolean var1 = org.apache.xml.security.algorithms.JCEMapper.addProvider("ApacheXML");

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test476"); }


    org.apache.xml.security.utils.Base64.setBase64WrapLength(100);

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test477"); }


    boolean var1 = org.apache.xml.security.algorithms.JCEMapper.getProviderIsInClassPath("No message with ID \"0000: 30 30 30 30 30 30 30 30   30 30 30 30 30 30 30 30  0000000000000000\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.exceptions.XMLSecurityException and message No message with ID \"0000: 01                                                 .\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test478"); }


    java.lang.Object[] var9 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var10 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var9);
    org.apache.xml.security.transforms.TransformationException var12 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var13 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var9, (java.lang.Exception)var12);
    org.apache.xml.security.transforms.TransformationException var14 = new org.apache.xml.security.transforms.TransformationException("\u00FF", var9);
    java.lang.Object[] var20 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var21 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var20);
    org.apache.xml.security.transforms.TransformationException var23 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var24 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var20, (java.lang.Exception)var23);
    org.apache.xml.security.signature.ReferenceNotInitializedException var25 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00000000 00000000", var20);
    org.apache.xml.security.keys.storage.StorageResolverException var26 = new org.apache.xml.security.keys.storage.StorageResolverException("0000: 01                                                 .\r\n", var20);
    org.apache.xml.security.signature.XMLSignatureException var27 = new org.apache.xml.security.signature.XMLSignatureException("BC", var9, (java.lang.Exception)var26);
    org.apache.xml.security.exceptions.XMLSecurityException var31 = new org.apache.xml.security.exceptions.XMLSecurityException("No message with ID \"68 69 21 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    java.lang.Throwable[] var32 = var31.getSuppressed();
    org.apache.xml.security.exceptions.XMLSecurityException var34 = new org.apache.xml.security.exceptions.XMLSecurityException("No message with ID \"68 69 21 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    org.apache.xml.security.exceptions.XMLSecurityException var35 = new org.apache.xml.security.exceptions.XMLSecurityException("0000: 01                                                 .\r\n", (java.lang.Object[])var32, (java.lang.Exception)var34);
    org.apache.xml.security.signature.InvalidSignatureValueException var36 = new org.apache.xml.security.signature.InvalidSignatureValueException("org.apache.xml.security.signature.XMLSignatureException: No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.keys.storage.StorageResolverException: No message with ID \"0000: 01                                                 .\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", (java.lang.Exception)var34);
    org.apache.xml.security.exceptions.Base64DecodingException var37 = new org.apache.xml.security.exceptions.Base64DecodingException("0000: FF FF FF FF                                        ....\r\n", var9, (java.lang.Exception)var34);
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException var38 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("414451410A494141410A", var9);
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException var40 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("FFaFFaFFaFFa");
    org.apache.xml.security.signature.XMLSignatureException var41 = new org.apache.xml.security.signature.XMLSignatureException("4E6F206D657373616765207769746820494420224E6F206D6573736167652077697468204944202230303030303030302030303030303030302220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C7365637572697479222220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922", var9, (java.lang.Exception)var40);
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException var42 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("ADQA\\aIAAA", (java.lang.Exception)var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test479"); }


    int var2 = org.apache.xml.security.encryption.EncryptedData.min(8, 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3);

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test480"); }


    java.lang.Object[] var6 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var7 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var6);
    org.apache.xml.security.transforms.TransformationException var9 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var10 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var6, (java.lang.Exception)var9);
    org.apache.xml.security.signature.ReferenceNotInitializedException var11 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00000000 00000000", var6);
    org.apache.xml.security.c14n.CanonicalizationException var12 = new org.apache.xml.security.c14n.CanonicalizationException("68 69 21 ", var6);
    java.lang.Object[] var16 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var17 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var16);
    org.apache.xml.security.transforms.TransformationException var19 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var20 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var16, (java.lang.Exception)var19);
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException var21 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("0000: 01                                                 .\r\n", var6, (java.lang.Exception)var19);
    java.lang.String var22 = var21.getMsgID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "0000: 01                                                 .\r\n"+ "'", var22.equals("0000: 01                                                 .\r\n"));

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test481"); }


    java.lang.Object[] var4 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var5 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var4);
    org.apache.xml.security.exceptions.Base64DecodingException var6 = new org.apache.xml.security.exceptions.Base64DecodingException("hi!", var4);
    org.apache.xml.security.c14n.InvalidCanonicalizerException var7 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/10/xml-exc-c14n#", var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test482"); }


    org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments var0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments();
    java.lang.String var1 = var0.engineGetURI();
    java.lang.String var2 = var0.engineGetURI();
    boolean var3 = var0.engineGetIncludeComments();
    org.apache.xml.security.utils.HelperNodeList var4 = new org.apache.xml.security.utils.HelperNodeList();
    int var5 = var4.getLength();
    java.util.Set var6 = org.apache.xml.security.utils.XMLUtils.convertNodelistToSet((org.w3c.dom.NodeList)var4);
    byte[] var8 = var0.engineCanonicalizeXPathNodeSet(var6, "00000010");
    org.apache.xml.security.signature.XMLSignatureInput var9 = new org.apache.xml.security.signature.XMLSignatureInput(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#"+ "'", var1.equals("http://www.w3.org/2001/10/xml-exc-c14n#"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#"+ "'", var2.equals("http://www.w3.org/2001/10/xml-exc-c14n#"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test483"); }


    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException var1 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("00000001");

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test484"); }


    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC var0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    int var1 = var0.engineGetIvLength();
    java.lang.String var2 = var0.getImplementedAlgorithmURI();
    java.lang.String var3 = var0.getImplementedAlgorithmURI();
    int var4 = var0.engineGetBlockSize();

  }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test485"); }


    org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver var1 = new org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver("003400200000");

  }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test486"); }


    boolean var1 = org.apache.xml.security.algorithms.JCEMapper.getProviderIsInClassPath("BC");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test487"); }


    java.lang.String var1 = org.apache.xml.security.utils.RFC2253Parser.rfc2253toXMLdsig("No message with ID \"0000: 30 30 30 30 30 30 30 30   30 30 30 30 30 30 30 30  0000000000000000\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.exceptions.XMLSecurityException and message No message with ID \"0000: 01                                                 .\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "No message with ID \"0000: 30 30 30 30 30 30 30 30   30 30 30 30 30 30 30 30  0000000000000000\\d\\a\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.exceptions.XMLSecurityException and message No message with ID \"0000: 01                                                 .\\d\\a\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var1.equals("No message with ID \"0000: 30 30 30 30 30 30 30 30   30 30 30 30 30 30 30 30  0000000000000000\\d\\a\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.exceptions.XMLSecurityException and message No message with ID \"0000: 01                                                 .\\d\\a\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test488"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.stringToHexString(" aa  a  ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "2061612020612020"+ "'", var1.equals("2061612020612020"));

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test489"); }


    org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver var1 = new org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver("0000000000000000");

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test490"); }


    byte[] var1 = org.apache.xml.security.utils.Base64.decode("No message with ID \"No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    java.lang.String var2 = org.apache.xml.security.utils.HexDump.prettyPrintHex(var1);
    java.lang.String var3 = org.apache.xml.security.utils.Base64.encode(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0000: 36 89 9E B2 C6 A0 7B 08   AD 84 80 BF 36 89 9E B2  6...........6...\r\n0010: C6 A0 7B 08 AD 84 80 BF   D3 4D 34 D3 4D 34 D3 4D  .........M4.M4.M\r\n0020: 34 D3 4D 34 FD FA 2E 9D   D8 A7 AD EB 28 BA B7 1E  4.M4........(...\r\n0030: 6E E9 DD 95 DF E8 AE 0F   DA A5 A7 21 7B FC 66 97  n..........!..f.\r\n0040: FB 1E 72 EA E2 B7 2F EB   7A CA 2E AD C7 BF C6 69  ..r.../.z......i\r\n0050: 6C 79 CB AB 8A DC 7F FD   FA 2E 9D D8 A7 AD EB 28  ly.............(\r\n0060: BA B7 1E 6E E9 DD 95 DF   E8 AE 0F DA A5 A7 21 7B  ...n..........!.\r\n0070: FC 66 97 FB 1E 72 EA E2   B7 2F EB 7A CA 2E AD C7  .f...r.../.z....\r\n0080: BF C6 69 6C 79 CB AB 8A   DC 7F                    ..ily.....\r\n"+ "'", var2.equals("0000: 36 89 9E B2 C6 A0 7B 08   AD 84 80 BF 36 89 9E B2  6...........6...\r\n0010: C6 A0 7B 08 AD 84 80 BF   D3 4D 34 D3 4D 34 D3 4D  .........M4.M4.M\r\n0020: 34 D3 4D 34 FD FA 2E 9D   D8 A7 AD EB 28 BA B7 1E  4.M4........(...\r\n0030: 6E E9 DD 95 DF E8 AE 0F   DA A5 A7 21 7B FC 66 97  n..........!..f.\r\n0040: FB 1E 72 EA E2 B7 2F EB   7A CA 2E AD C7 BF C6 69  ..r.../.z......i\r\n0050: 6C 79 CB AB 8A DC 7F FD   FA 2E 9D D8 A7 AD EB 28  ly.............(\r\n0060: BA B7 1E 6E E9 DD 95 DF   E8 AE 0F DA A5 A7 21 7B  ...n..........!.\r\n0070: FC 66 97 FB 1E 72 EA E2   B7 2F EB 7A CA 2E AD C7  .f...r.../.z....\r\n0080: BF C6 69 6C 79 CB AB 8A   DC 7F                    ..ily.....\r\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NomessagewithIC/NomessagewithIC/0000000000000000/foundinresourcebundld/org/apache/xml/security/resou\nrce/xmlsecuritx//foundinresourcebundld/org/apache/xml/security/resource/xmlsecuritx/"+ "'", var3.equals("NomessagewithIC/NomessagewithIC/0000000000000000/foundinresourcebundld/org/apache/xml/security/resou\nrce/xmlsecuritx//foundinresourcebundld/org/apache/xml/security/resource/xmlsecuritx/"));

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test491"); }


    boolean var1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsRelative("BC");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test492"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    boolean var2 = var0.engineIsCertificateEntry("hi!");

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test493"); }


    org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments var0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments();
    org.apache.xml.security.keys.provider.ApacheXMLProvider var1 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.lang.Object[] var8 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var9 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var8);
    org.apache.xml.security.exceptions.Base64DecodingException var10 = new org.apache.xml.security.exceptions.Base64DecodingException("hi!", var8);
    java.lang.Object[] var17 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var18 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var17);
    org.apache.xml.security.transforms.TransformationException var20 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var21 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var17, (java.lang.Exception)var20);
    org.apache.xml.security.signature.ReferenceNotInitializedException var22 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00000000 00000000", var17);
    org.apache.xml.security.c14n.CanonicalizationException var23 = new org.apache.xml.security.c14n.CanonicalizationException("68 69 21 ", var17);
    java.lang.Object[] var27 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var28 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var27);
    org.apache.xml.security.transforms.TransformationException var30 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var31 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var27, (java.lang.Exception)var30);
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException var32 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("0000: 01                                                 .\r\n", var17, (java.lang.Exception)var30);
    org.apache.xml.security.c14n.CanonicalizationException var33 = new org.apache.xml.security.c14n.CanonicalizationException("00001010", var8, (java.lang.Exception)var30);
    java.lang.Object[] var37 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var38 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var37);
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException var39 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("hi!", (java.lang.Exception)var38);
    org.apache.xml.security.exceptions.Base64DecodingException var40 = new org.apache.xml.security.exceptions.Base64DecodingException("00000000a00000000a00000000a00000000a00000000a00000000a00000000a00001010", var8, (java.lang.Exception)var39);
    org.apache.xml.security.transforms.InvalidTransformException var43 = new org.apache.xml.security.transforms.InvalidTransformException();
    org.apache.xml.security.keys.keyresolver.KeyResolverException var44 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("00000000 00000000", (java.lang.Exception)var43);
    org.apache.xml.security.signature.XMLSignatureException var45 = new org.apache.xml.security.signature.XMLSignatureException("BC", (java.lang.Exception)var44);
    org.apache.xml.security.transforms.InvalidTransformException var46 = new org.apache.xml.security.transforms.InvalidTransformException("No message with ID \"0000000000000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", var8, (java.lang.Exception)var44);
    java.lang.Object var47 = var1.remove((java.lang.Object)var8);
    byte[] var51 = new byte[] { (byte)0, (byte)0, (byte)(-1)};
    org.apache.xml.security.signature.XMLSignatureInput var52 = new org.apache.xml.security.signature.XMLSignatureInput(var51);
    org.apache.xpath.CachedXPathAPI var53 = var52.getCachedXPathAPI();
    java.io.InputStream var54 = var52.getOctetStream();
    org.apache.xml.security.signature.XMLSignatureInput var55 = new org.apache.xml.security.signature.XMLSignatureInput(var54);
    boolean var56 = var1.containsValue((java.lang.Object)var55);
    java.util.Set var57 = var1.stringPropertyNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var59 = var0.engineCanonicalizeXPathNodeSet(var57, "         aa  a  ");
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test494"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    var0.engineDeleteEntry("6F72672E6170616368652E786D6C2E73656375726974792E6B6579732E6B65797265736F6C7665722E696D706C656D656E746174696F6E732E5253414B657956616C75655265736F6C766572");

  }

  public void test495() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test495"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    byte[] var4 = new byte[] { (byte)0, (byte)0, (byte)(-1)};
    org.apache.xml.security.signature.XMLSignatureInput var5 = new org.apache.xml.security.signature.XMLSignatureInput(var4);
    org.apache.xpath.CachedXPathAPI var6 = var5.getCachedXPathAPI();
    java.io.InputStream var7 = var5.getOctetStream();
    org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous var8 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous(var7);
    char[] var11 = new char[] { ' ', ' '};
    org.apache.xml.security.utils.HexDump.setBitDigits(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.engineLoad(var7, var11);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test496"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.Init.readUserConfiguration("2061612020612020");
      fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test497"); }


    org.apache.xml.security.transforms.Transform.register("00000010", "hi!");

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test498"); }


    java.lang.String var1 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.makeFilesystemToURI("414451410A494141410A");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test499"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous var1 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous("414451410A494141410A");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test500"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toBinaryString(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "                                                                "+ "'", var1.equals("                                                                "));

  }

}

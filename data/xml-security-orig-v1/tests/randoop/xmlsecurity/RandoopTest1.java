package randoop.xmlsecurity;

import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous var1 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous("http://www.w3.org/2001/04/xmlenc#kw-aes128");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test2"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toHexString((byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "01"+ "'", var1.equals("01"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test3"); }


    java.lang.Object[] var7 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var8 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var7);
    org.apache.xml.security.transforms.TransformationException var10 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var11 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var7, (java.lang.Exception)var10);
    org.apache.xml.security.transforms.TransformationException var12 = new org.apache.xml.security.transforms.TransformationException("\u00FF", var7);
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException var13 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("4141414142413D3D", var7);
    java.lang.Object[] var19 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var20 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var19);
    org.apache.xml.security.transforms.TransformationException var22 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var23 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var19, (java.lang.Exception)var22);
    org.apache.xml.security.transforms.TransformationException var24 = new org.apache.xml.security.transforms.TransformationException("\u00FF", var19);
    org.apache.xml.security.c14n.InvalidCanonicalizerException var25 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("00 34 00 20 00 00", (java.lang.Exception)var24);
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var26 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("FFFFFFFF", var7, (java.lang.Exception)var24);
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var27 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("xmlsecurityOrgPrefsJbGzQBZSDvfRMokD5jmlgqidZuO", var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test4"); }


    java.lang.String var2 = org.apache.xml.security.Init.getKeyInfoContentHandler("No message with ID \"68 69 21 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "4141414142413D3D");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test5"); }


    org.apache.xml.security.utils.EncryptionConstants.setEncryptionSpecNSprefix("                ");

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test6"); }


    java.lang.String var1 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.fixURI("         aa  a  ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "         aa  a  "+ "'", var1.equals("         aa  a  "));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test7"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toBinaryString(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "                                "+ "'", var1.equals("                                "));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test8"); }


    java.lang.String var1 = org.apache.xml.security.algorithms.JCEMapper.getAlgorithmClassFromURI("00001010");

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test9"); }


    java.lang.String var2 = org.apache.xml.security.algorithms.JCEMapper.getJCEKeyAlgorithmFromURI("org.apache.xml.security.keys.keyresolver.KeyResolverException: No message with ID \"FFaFFaFFaFFa\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.transforms.TransformationException: No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "d");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test10"); }


    java.lang.String var1 = org.apache.xml.security.utils.RFC2253Parser.rfc2253toXMLdsig("FF:FF:FF:FF:FF:FF:FF");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "FF:FF:FF:FF:FF:FF:FF"+ "'", var1.equals("FF:FF:FF:FF:FF:FF:FF"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test11"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    char[] var4 = new char[] { '4', ' '};
    byte[] var5 = org.apache.xml.security.keys.provider.KeyElement.PKCS12PasswordToBytes(var4);
    java.lang.String var7 = org.apache.xml.security.utils.Base64.encode(var5, 4);
    java.security.cert.Certificate[] var8 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p", var5, var8);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test12"); }


    org.apache.xml.security.exceptions.XMLSecurityException var1 = new org.apache.xml.security.exceptions.XMLSecurityException("00001010");

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test13"); }


    byte[] var1 = org.apache.xml.security.utils.HexDump.hexStringToByteArray("0000: 01                                                 .\r\n");
    java.lang.String var2 = org.apache.xml.security.utils.HexDump.toHexString(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "000001"+ "'", var2.equals("000001"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test14"); }


    java.lang.String var1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeProcessingInstruction("2061612020612020");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "2061612020612020"+ "'", var1.equals("2061612020612020"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test15"); }


    org.apache.xml.security.algorithms.JCEMapper.ProviderIdClass var1 = org.apache.xml.security.algorithms.JCEMapper.translateURItoJCEID("FF:FF:FF:FF:FF:FF:FF");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test16"); }


    org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments var0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments();
    java.lang.String var1 = var0.engineGetURI();
    java.lang.String var2 = var0.engineGetURI();
    boolean var3 = var0.engineGetIncludeComments();
    org.apache.xml.security.utils.HelperNodeList var4 = new org.apache.xml.security.utils.HelperNodeList();
    int var5 = var4.getLength();
    java.util.Set var6 = org.apache.xml.security.utils.XMLUtils.convertNodelistToSet((org.w3c.dom.NodeList)var4);
    byte[] var8 = var0.engineCanonicalizeXPathNodeSet(var6, "00000010");
    org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments var9 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments();
    java.lang.String var10 = var9.engineGetURI();
    java.lang.String var11 = var9.engineGetURI();
    boolean var12 = var9.engineGetIncludeComments();
    org.apache.xml.security.utils.HelperNodeList var13 = new org.apache.xml.security.utils.HelperNodeList();
    int var14 = var13.getLength();
    java.util.Set var15 = org.apache.xml.security.utils.XMLUtils.convertNodelistToSet((org.w3c.dom.NodeList)var13);
    byte[] var17 = var9.engineCanonicalizeXPathNodeSet(var15, "00000010");
    byte[] var18 = var0.engineCanonicalizeXPathNodeSet(var15);
    byte[] var20 = new byte[] { (byte)1};
    java.lang.String var21 = org.apache.xml.security.utils.HexDump.prettyPrintHex(var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var22 = var0.engineCanonicalize(var20);
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#"+ "'", var10.equals("http://www.w3.org/2001/10/xml-exc-c14n#"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#"+ "'", var11.equals("http://www.w3.org/2001/10/xml-exc-c14n#"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "0000: 01                                                 .\r\n"+ "'", var21.equals("0000: 01                                                 .\r\n"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test17"); }


    org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException var2 = new org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException("BC");
    java.lang.String var3 = org.apache.xml.security.utils.I18n.getExceptionMessage("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p", (java.lang.Exception)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "No message with ID \"http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException and message No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var3.equals("No message with ID \"http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException and message No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test18"); }


    org.apache.xml.security.utils.resolver.ResourceResolver.registerAtStart("org.apache.xml.security.exceptions.Base64DecodingException: No message with ID \"ApacheXML version 1.0\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test19"); }


    org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments var0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments();
    java.util.Set var2 = org.apache.xml.security.transforms.params.InclusiveNamespaces.prefixStr2Set("BC");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var4 = var0.engineCanonicalizeXPathNodeSet(var2, "No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
      fail("Expected exception of type org.apache.xml.security.c14n.CanonicalizationException");
    } catch (org.apache.xml.security.c14n.CanonicalizationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous var1 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous("FFFFFFFF");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test21"); }


    org.apache.xml.security.algorithms.JCEMapper.ProviderIdClass var2 = org.apache.xml.security.algorithms.JCEMapper.translateURItoJCEID("http://www.w3.org/2001/04/xmlenc#kw-aes128", "FFaFFaFFaFFa");

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test22"); }


    java.lang.Object[] var10 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var11 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var10);
    org.apache.xml.security.transforms.TransformationException var13 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var14 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var10, (java.lang.Exception)var13);
    org.apache.xml.security.transforms.TransformationException var15 = new org.apache.xml.security.transforms.TransformationException("\u00FF", var10);
    java.lang.Object[] var21 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var22 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var21);
    org.apache.xml.security.transforms.TransformationException var24 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var25 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var21, (java.lang.Exception)var24);
    org.apache.xml.security.signature.ReferenceNotInitializedException var26 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00000000 00000000", var21);
    org.apache.xml.security.keys.storage.StorageResolverException var27 = new org.apache.xml.security.keys.storage.StorageResolverException("0000: 01                                                 .\r\n", var21);
    org.apache.xml.security.signature.XMLSignatureException var28 = new org.apache.xml.security.signature.XMLSignatureException("BC", var10, (java.lang.Exception)var27);
    org.apache.xml.security.exceptions.XMLSecurityException var32 = new org.apache.xml.security.exceptions.XMLSecurityException("No message with ID \"68 69 21 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    java.lang.Throwable[] var33 = var32.getSuppressed();
    org.apache.xml.security.exceptions.XMLSecurityException var35 = new org.apache.xml.security.exceptions.XMLSecurityException("No message with ID \"68 69 21 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    org.apache.xml.security.exceptions.XMLSecurityException var36 = new org.apache.xml.security.exceptions.XMLSecurityException("0000: 01                                                 .\r\n", (java.lang.Object[])var33, (java.lang.Exception)var35);
    org.apache.xml.security.signature.InvalidSignatureValueException var37 = new org.apache.xml.security.signature.InvalidSignatureValueException("org.apache.xml.security.signature.XMLSignatureException: No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.keys.storage.StorageResolverException: No message with ID \"0000: 01                                                 .\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", (java.lang.Exception)var35);
    org.apache.xml.security.exceptions.Base64DecodingException var38 = new org.apache.xml.security.exceptions.Base64DecodingException("0000: FF FF FF FF                                        ....\r\n", var10, (java.lang.Exception)var35);
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException var39 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("414451410A494141410A", var10);
    org.apache.xml.security.signature.XMLSignatureException var40 = new org.apache.xml.security.signature.XMLSignatureException("No message with ID \"0000: 01                                                 .\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", var10);
    java.lang.Object[] var47 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var48 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var47);
    org.apache.xml.security.exceptions.Base64DecodingException var49 = new org.apache.xml.security.exceptions.Base64DecodingException("hi!", var47);
    java.lang.Object[] var56 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var57 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var56);
    org.apache.xml.security.transforms.TransformationException var59 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var60 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var56, (java.lang.Exception)var59);
    org.apache.xml.security.signature.ReferenceNotInitializedException var61 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00000000 00000000", var56);
    org.apache.xml.security.c14n.CanonicalizationException var62 = new org.apache.xml.security.c14n.CanonicalizationException("68 69 21 ", var56);
    java.lang.Object[] var66 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var67 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var66);
    org.apache.xml.security.transforms.TransformationException var69 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var70 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var66, (java.lang.Exception)var69);
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException var71 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("0000: 01                                                 .\r\n", var56, (java.lang.Exception)var69);
    org.apache.xml.security.c14n.CanonicalizationException var72 = new org.apache.xml.security.c14n.CanonicalizationException("00001010", var47, (java.lang.Exception)var69);
    java.lang.Object[] var79 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var80 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var79);
    org.apache.xml.security.transforms.TransformationException var82 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var83 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var79, (java.lang.Exception)var82);
    org.apache.xml.security.signature.ReferenceNotInitializedException var84 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00000000 00000000", var79);
    org.apache.xml.security.c14n.CanonicalizationException var85 = new org.apache.xml.security.c14n.CanonicalizationException("68 69 21 ", var79);
    java.lang.Object[] var89 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var90 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var89);
    org.apache.xml.security.transforms.TransformationException var92 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var93 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var89, (java.lang.Exception)var92);
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException var94 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("0000: 01                                                 .\r\n", var79, (java.lang.Exception)var92);
    org.apache.xml.security.signature.XMLSignatureException var95 = new org.apache.xml.security.signature.XMLSignatureException("003400200000", var47, (java.lang.Exception)var92);
    org.apache.xml.security.signature.InvalidDigestValueException var96 = new org.apache.xml.security.signature.InvalidDigestValueException("BC", (java.lang.Exception)var95);
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var97 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("                                ", var10, (java.lang.Exception)var96);
    org.apache.xml.security.signature.InvalidSignatureValueException var98 = new org.apache.xml.security.signature.InvalidSignatureValueException("NomessagewithIC/NomessagewithIC/0000000000000000/foundinresourcebundld/org/apache/xml/security/resou\nrce/xmlsecuritx//foundinresourcebundld/org/apache/xml/security/resource/xmlsecuritx/", var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test23"); }


    java.lang.String var2 = org.apache.xml.security.algorithms.JCEMapper.getJCEKeyAlgorithmFromURI("org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver", "003400200000");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test24"); }


    boolean var2 = org.apache.xml.security.algorithms.encryption.EncryptionMethod.register("\u0001", "AAAAAQ==");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test25"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toHexString((byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "FF"+ "'", var1.equals("FF"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test26"); }


    org.apache.xml.security.keys.provider.ApacheXMLProvider var0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Enumeration var1 = var0.elements();
    org.apache.xml.security.c14n.helper.NSAttrCompare var2 = new org.apache.xml.security.c14n.helper.NSAttrCompare();
    boolean var3 = var0.containsValue((java.lang.Object)var2);
    java.lang.Object[] var9 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var10 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var9);
    org.apache.xml.security.transforms.TransformationException var12 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var13 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var9, (java.lang.Exception)var12);
    org.apache.xml.security.signature.ReferenceNotInitializedException var14 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00000000 00000000", var9);
    java.lang.Object[] var18 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var19 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var18);
    org.apache.xml.security.transforms.TransformationException var21 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var22 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var18, (java.lang.Exception)var21);
    org.apache.xml.security.keys.keyresolver.KeyResolverException var23 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("FFaFFaFFaFFa", var9, (java.lang.Exception)var21);
    org.apache.xml.security.transforms.TransformationException var24 = new org.apache.xml.security.transforms.TransformationException();
    var23.addSuppressed((java.lang.Throwable)var24);
    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES128_BC var26 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES128_BC();
    int var27 = var26.engineGetBlockSize();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var28 = var2.compare((java.lang.Object)var23, (java.lang.Object)var27);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 16);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test27"); }


    byte[] var1 = org.apache.xml.security.utils.HexDump.toByteArray((-1L));
    java.lang.String var2 = org.apache.xml.security.utils.Base64.encode(var1);
    java.lang.String var3 = org.apache.xml.security.utils.HexDump.toString(var1);
    byte[] var5 = org.apache.xml.security.utils.PRNG.createBytes(1);
    boolean var6 = org.apache.xml.security.utils.JavaUtils.binaryCompare(var1, var5);
    java.lang.String var8 = org.apache.xml.security.utils.Base64.encode(var1, 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "//////////8="+ "'", var2.equals("//////////8="));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\u00FF\u00FF\u00FF\u00FF\u00FF\u00FF\u00FF\u00FF"+ "'", var3.equals("\u00FF\u00FF\u00FF\u00FF\u00FF\u00FF\u00FF\u00FF"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "//////////8="+ "'", var8.equals("//////////8="));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test28"); }


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
    org.apache.xml.security.transforms.implementations.TransformC14NWithComments var15 = new org.apache.xml.security.transforms.implementations.TransformC14NWithComments();
    boolean var16 = var15.wantsNodeSet();
    boolean var17 = var15.returnsOctetStream();
    boolean var18 = var0.equals((java.lang.Object)var17);
    byte[] var22 = new byte[] { (byte)0, (byte)0, (byte)(-1)};
    org.apache.xml.security.signature.XMLSignatureInput var23 = new org.apache.xml.security.signature.XMLSignatureInput(var22);
    org.apache.xpath.CachedXPathAPI var24 = var23.getCachedXPathAPI();
    java.io.InputStream var25 = var23.getOctetStream();
    org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous var26 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous(var25);
    org.apache.xml.security.signature.XMLSignatureInput var27 = new org.apache.xml.security.signature.XMLSignatureInput(var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.loadFromXML(var25);
      fail("Expected exception of type java.util.InvalidPropertiesFormatException");
    } catch (java.util.InvalidPropertiesFormatException e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test29"); }


    org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments var0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments();
    java.lang.String var1 = var0.engineGetURI();
    java.lang.String var2 = var0.engineGetURI();
    byte[] var4 = org.apache.xml.security.utils.HexDump.toByteArray((-1L));
    java.lang.String var7 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(var4, 1, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var8 = var0.engineCanonicalize(var4);
      fail("Expected exception of type java.io.UTFDataFormatException");
    } catch (java.io.UTFDataFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#"+ "'", var1.equals("http://www.w3.org/2001/10/xml-exc-c14n#"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#"+ "'", var2.equals("http://www.w3.org/2001/10/xml-exc-c14n#"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "FF:FF:FF:FF:FF:FF:FF"+ "'", var7.equals("FF:FF:FF:FF:FF:FF:FF"));

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test30"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("http://www.w3.org/2001/10/xml-exc-c14n#");

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test31"); }


    int var1 = org.apache.xml.security.algorithms.JCEMapper.getKeyLengthFromURI("FF");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test32"); }


    org.apache.xml.security.utils.I18n.initLocale("00001010", "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p");

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test33"); }


    org.apache.xml.security.utils.Constants.setSignatureSpecNSprefix("No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test34"); }


    sun.security.x509.X500Name var4 = org.apache.xml.security.keys.content.x509.XMLX509SubjectName.createX500Name("http://www.w3.org/2001/04/xmlenc#kw-tripledes", "No message with ID \"00001010\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p", "No message with ID \"0000: 30 30 30 30 30 30 30 30   30 30 30 30 30 30 30 30  0000000000000000\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.exceptions.XMLSecurityException and message No message with ID \"0000: 01                                                 .\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test35"); }


    java.lang.String var1 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.makeFilesystemToURI("36899EB2C6A07B08AD8480BF36899EB2C6A07B08AD8480BFD34D34D34D34D34D34D34D34FDFA2E9DD8A7ADEB28BAB71E6EE9DD95DFE8AE0FDAA5A7217BFC6697FB1E72EAE2B72FEB7ACA2EADC7BFC6696C79CBAB8ADC7FFDFA2E9DD8A7ADEB28BAB71E6EE9DD95DFE8AE0FDAA5A7217BFC6697FB1E72EAE2B72FEB7ACA2EADC7BFC6696C79CBAB8ADC7F");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test36"); }


    java.lang.String var1 = org.apache.xml.security.utils.ElementProxy.getDefaultPrefix("0000");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test37"); }


    java.lang.String var2 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.expandSystemId("0000000000000001", "No message with ID \"http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0000000000000001"+ "'", var2.equals("0000000000000001"));

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test38"); }


    org.apache.xml.security.keys.keyresolver.implementations.DSAKeyValueResolver var0 = new org.apache.xml.security.keys.keyresolver.implementations.DSAKeyValueResolver();
    boolean var2 = var0.understandsProperty("http://www.w3.org/2001/04/xmlenc#kw-aes192");
    java.lang.String var4 = var0.engineGetProperty("00000010");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test39"); }


    org.apache.xml.security.utils.HexDump.setByteSeparator(' ');

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test40"); }


    org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments var0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments();
    boolean var1 = var0.engineGetIncludeComments();
    boolean var2 = var0.engineGetIncludeComments();
    java.util.Set var4 = org.apache.xml.security.transforms.params.InclusiveNamespaces.prefixStr2Set("No message with ID \"0000: FF FF FF FF                                        ....\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    byte[] var8 = new byte[] { (byte)0, (byte)0, (byte)(-1)};
    org.apache.xml.security.signature.XMLSignatureInput var9 = new org.apache.xml.security.signature.XMLSignatureInput(var8);
    java.lang.String var10 = var9.getSourceURI();
    var9.setSourceURI("0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n");
    org.apache.xpath.CachedXPathAPI var13 = var9.getCachedXPathAPI();
    org.apache.xml.security.utils.CachedXPathFuncHereAPI var14 = new org.apache.xml.security.utils.CachedXPathFuncHereAPI(var13);
    org.apache.xml.security.signature.XMLSignatureInput var15 = new org.apache.xml.security.signature.XMLSignatureInput(var4, var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var16 = var0.engineCanonicalizeXPathNodeSet(var4);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test41"); }


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
    org.apache.xml.security.exceptions.XMLSecurityException var58 = new org.apache.xml.security.exceptions.XMLSecurityException((java.lang.Exception)var56);
    
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

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test42"); }


    org.apache.xml.security.keys.provider.ApacheXMLProvider var0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Enumeration var1 = var0.elements();
    java.util.Enumeration var2 = var0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test43"); }


    java.lang.Object[] var5 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var6 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var5);
    org.apache.xml.security.transforms.TransformationException var8 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var9 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var5, (java.lang.Exception)var8);
    java.lang.Object[] var16 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var17 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var16);
    org.apache.xml.security.transforms.TransformationException var19 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var20 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var16, (java.lang.Exception)var19);
    org.apache.xml.security.signature.ReferenceNotInitializedException var21 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00000000 00000000", var16);
    org.apache.xml.security.c14n.CanonicalizationException var22 = new org.apache.xml.security.c14n.CanonicalizationException("68 69 21 ", var16);
    org.apache.xml.security.c14n.InvalidCanonicalizerException var23 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("0000: 01                                                 .\r\n", var16);
    org.apache.xml.security.keys.storage.StorageResolverException var24 = new org.apache.xml.security.keys.storage.StorageResolverException("00000000a00000000a00000000a00000000a00000000a00000000a00000000a00001010", var5, (java.lang.Exception)var23);
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var25 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", (java.lang.Exception)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test44"); }


    org.apache.xml.security.utils.resolver.ResourceResolver.registerAtStart("NomessagewithIC/NomessagewithIC/0000000000000000/foundinresourcebundld/org/apache/xml/security/resou\nrce/xmlsecuritx//foundinresourcebundld/org/apache/xml/security/resource/xmlsecuritx/");

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test45"); }


    org.apache.xml.security.transforms.Transform.register("No message with ID \"FFFFFFFFFFFFFFFF\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.transforms.InvalidTransformException and message No message with ID \"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "0000000000000000");

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test46"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.prettyPrintHex("0000: 68 74 74 70 3A 2F 2F 77   77 77 2E 77 33 2E 6F 72  http://www.w3.or\r\n0010: 67 2F 32 30 30 31 2F 30   34 2F 78 6D 6C 65 6E 63  g/2001/04/xmlenc\r\n0020: 23 61 65 73 31 39 32 2D   63 62 63                 #aes192-cbc\r\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0000: 30 30 30 30 3A 20 36 38   20 37 34 20 37 34 20 37  0000: 68 74 74 7\r\n0010: 30 20 33 41 20 32 46 20   32 46 20 37 37 20 20 20  0 3A 2F 2F 77   \r\n0020: 37 37 20 37 37 20 32 45   20 37 37 20 33 33 20 32  77 77 2E 77 33 2\r\n0030: 45 20 36 46 20 37 32 20   20 68 74 74 70 3A 2F 2F  E 6F 72  http://\r\n0040: 77 77 77 2E 77 33 2E 6F   72 0D 0A 30 30 31 30 3A  www.w3.or..0010:\r\n0050: 20 36 37 20 32 46 20 33   32 20 33 30 20 33 30 20   67 2F 32 30 30 \r\n0060: 33 31 20 32 46 20 33 30   20 20 20 33 34 20 32 46  31 2F 30   34 2F\r\n0070: 20 37 38 20 36 44 20 36   43 20 36 35 20 36 45 20   78 6D 6C 65 6E \r\n0080: 36 33 20 20 67 2F 32 30   30 31 2F 30 34 2F 78 6D  63  g/2001/04/xm\r\n0090: 6C 65 6E 63 0D 0A 30 30   32 30 3A 20 32 33 20 36  lenc..0020: 23 6\r\n00A0: 31 20 36 35 20 37 33 20   33 31 20 33 39 20 33 32  1 65 73 31 39 32\r\n00B0: 20 32 44 20 20 20 36 33   20 36 32 20 36 33 20 20   2D   63 62 63  \r\n00C0: 20 20 20 20 20 20 20 20   20 20 20 20 20 20 20 23                 #\r\n00D0: 61 65 73 31 39 32 2D 63   62 63 0D 0A              aes192-cbc..\r\n"+ "'", var1.equals("0000: 30 30 30 30 3A 20 36 38   20 37 34 20 37 34 20 37  0000: 68 74 74 7\r\n0010: 30 20 33 41 20 32 46 20   32 46 20 37 37 20 20 20  0 3A 2F 2F 77   \r\n0020: 37 37 20 37 37 20 32 45   20 37 37 20 33 33 20 32  77 77 2E 77 33 2\r\n0030: 45 20 36 46 20 37 32 20   20 68 74 74 70 3A 2F 2F  E 6F 72  http://\r\n0040: 77 77 77 2E 77 33 2E 6F   72 0D 0A 30 30 31 30 3A  www.w3.or..0010:\r\n0050: 20 36 37 20 32 46 20 33   32 20 33 30 20 33 30 20   67 2F 32 30 30 \r\n0060: 33 31 20 32 46 20 33 30   20 20 20 33 34 20 32 46  31 2F 30   34 2F\r\n0070: 20 37 38 20 36 44 20 36   43 20 36 35 20 36 45 20   78 6D 6C 65 6E \r\n0080: 36 33 20 20 67 2F 32 30   30 31 2F 30 34 2F 78 6D  63  g/2001/04/xm\r\n0090: 6C 65 6E 63 0D 0A 30 30   32 30 3A 20 32 33 20 36  lenc..0020: 23 6\r\n00A0: 31 20 36 35 20 37 33 20   33 31 20 33 39 20 33 32  1 65 73 31 39 32\r\n00B0: 20 32 44 20 20 20 36 33   20 36 32 20 36 33 20 20   2D   63 62 63  \r\n00C0: 20 20 20 20 20 20 20 20   20 20 20 20 20 20 20 23                 #\r\n00D0: 61 65 73 31 39 32 2D 63   62 63 0D 0A              aes192-cbc..\r\n"));

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test47"); }


    org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver var1 = new org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver("ApacheXML version 1.0");

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test48"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    boolean var2 = var0.engineContainsAlias("                ");

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test49"); }


    boolean var1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsRelative("0000: 20 20 20 20 20 20 20 20                                    \r\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test50"); }


    org.apache.xml.security.keys.keyresolver.KeyResolver.registerAtStart("0000: FF FF FF FF                                        ....\r\n");

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test51"); }


    boolean var2 = org.apache.xml.security.algorithms.encryption.EncryptionMethod.register("//////////8=", "68 69 21");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test52"); }


    java.lang.String var1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeAttr("0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0000: 36 38 20 36 39 20 32 31   20                       68 69 21 &#xD;&#xA;"+ "'", var1.equals("0000: 36 38 20 36 39 20 32 31   20                       68 69 21 &#xD;&#xA;"));

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test53"); }


    byte[] var3 = new byte[] { (byte)0, (byte)0, (byte)(-1)};
    org.apache.xml.security.signature.XMLSignatureInput var4 = new org.apache.xml.security.signature.XMLSignatureInput(var3);
    java.lang.String var5 = var4.getSourceURI();
    org.apache.xpath.CachedXPathAPI var6 = var4.getCachedXPathAPI();
    java.lang.String var7 = var4.toString();
    boolean var8 = var4.isInitialized();
    boolean var9 = var4.isNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "XMLSignatureInput/OctetStream/3 octets/null"+ "'", var7.equals("XMLSignatureInput/OctetStream/3 octets/null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test54"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.Init.readUserConfiguration("No message with ID \"http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
      fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test55"); }


    byte[] var1 = org.apache.xml.security.utils.HexDump.toByteArray((short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test56"); }


    java.lang.String var1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeComment("org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException: No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException: No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var1.equals("org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException: No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test57"); }


    boolean var2 = org.apache.xml.security.utils.JavaUtils.implementsInterface((java.lang.Object)"http://www.w3.org/2001/04/xmlenc#tripledes-cbc", "         aa  a  ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test58"); }


    java.lang.String var1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeProcessingInstruction("No message with ID \"4E6F206D657373616765207769746820494420223638203639203231202220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "No message with ID \"4E6F206D657373616765207769746820494420223638203639203231202220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var1.equals("No message with ID \"4E6F206D657373616765207769746820494420223638203639203231202220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test59"); }


    org.apache.xml.security.keys.provider.ApacheXMLProvider var0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Enumeration var1 = var0.elements();
    org.apache.xml.security.c14n.helper.NSAttrCompare var2 = new org.apache.xml.security.c14n.helper.NSAttrCompare();
    boolean var3 = var0.containsValue((java.lang.Object)var2);
    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC var4 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC();
    int var5 = var4.engineGetIvLength();
    org.apache.xml.security.keys.storage.StorageResolverException var8 = new org.apache.xml.security.keys.storage.StorageResolverException("http://www.w3.org/2001/04/xmlenc#kw-aes192");
    org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException var9 = new org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException("00000010", (java.lang.Exception)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var10 = var2.compare((java.lang.Object)var5, (java.lang.Object)var8);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test60"); }


    org.apache.xml.security.algorithms.JCEMapper.ProviderIdClass var2 = org.apache.xml.security.algorithms.JCEMapper.translateURItoJCEID("http://www.w3.org/2001/04/xmlenc#aes192-cbc", "FFFFFFFF");

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test61"); }


    boolean var1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsRelative("0000: 30 30 30 30 30 30 30 30   30 30 30 30 30 30 30 30  0000000000000000\r\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test62"); }


    org.apache.xml.security.signature.InvalidSignatureValueException var1 = new org.apache.xml.security.signature.InvalidSignatureValueException("00001010");

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test63"); }


    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC var0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC();
    java.lang.String var1 = var0.getImplementedAlgorithmURI();
    java.lang.String var2 = var0.getRequiredProviderName();
    int var3 = var0.getImplementedAlgorithmType();
    int var4 = var0.getImplementedAlgorithmType();
    int var5 = var0.engineGetIvLength();
    int var6 = var0.engineGetBlockSize();

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test64"); }


    org.apache.xml.security.transforms.implementations.TransformXPath2Filter04 var0 = new org.apache.xml.security.transforms.implementations.TransformXPath2Filter04();
    boolean var1 = var0.wantsNodeSet();
    boolean var2 = var0.wantsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test65"); }


    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC var0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC();
    java.lang.String var1 = var0.getRequiredProviderName();
    int var2 = var0.engineGetIvLength();
    java.lang.String var3 = var0.getRequiredProviderName();
    int var4 = var0.engineGetIvLength();
    int var5 = var0.engineGetIvLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "BC"+ "'", var1.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "BC"+ "'", var3.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test66"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.prettyPrintHex("0000: 41 41 41 41 41 41 41 41   41 47 51 3D              AAAAAAAAAGQ=");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0000: 30 30 30 30 3A 20 34 31   20 34 31 20 34 31 20 34  0000: 41 41 41 4\r\n0010: 31 20 34 31 20 34 31 20   34 31 20 34 31 20 20 20  1 41 41 41 41   \r\n0020: 34 31 20 34 37 20 35 31   20 33 44 20 20 20 20 20  41 47 51 3D     \r\n0030: 20 20 20 20 20 20 20 20   20 41 41 41 41 41 41 41           AAAAAAA\r\n0040: 41 41 47 51 3D                                     AAGQ=\r\n"+ "'", var1.equals("0000: 30 30 30 30 3A 20 34 31   20 34 31 20 34 31 20 34  0000: 41 41 41 4\r\n0010: 31 20 34 31 20 34 31 20   34 31 20 34 31 20 20 20  1 41 41 41 41   \r\n0020: 34 31 20 34 37 20 35 31   20 33 44 20 20 20 20 20  41 47 51 3D     \r\n0030: 20 20 20 20 20 20 20 20   20 41 41 41 41 41 41 41           AAAAAAA\r\n0040: 41 41 47 51 3D                                     AAGQ=\r\n"));

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test67"); }


    boolean var1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsAbsolute("No message with ID \" aa  a  \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.transforms.TransformationException and message No message with ID \"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test68"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    char[] var4 = new char[] { '4', ' '};
    byte[] var5 = org.apache.xml.security.keys.provider.KeyElement.PKCS12PasswordToBytes(var4);
    java.security.Key var6 = var0.engineGetKey("0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n", var4);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test69"); }


    org.apache.xml.security.algorithms.JCEMapper.ProviderIdClass var2 = org.apache.xml.security.algorithms.JCEMapper.translateURItoJCEID("No message with ID \"0000: 30 30 30 30 30 30 30 30   30 30 30 30 30 30 30 30  0000000000000000\\d\\a\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.exceptions.XMLSecurityException and message No message with ID \"0000: 01                                                 .\\d\\a\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p");

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test70"); }


    org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments var0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments();
    boolean var1 = var0.engineGetIncludeComments();
    char[] var4 = new char[] { '4', ' '};
    byte[] var5 = org.apache.xml.security.keys.provider.KeyElement.PKCS12PasswordToBytes(var4);
    java.lang.String var7 = org.apache.xml.security.utils.Base64.encode(var5, 4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var8 = var0.engineCanonicalize(var5);
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "ADQA\nIAAA\n"+ "'", var7.equals("ADQA\nIAAA\n"));

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test71"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("2061612020612020");

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test72"); }


    org.apache.xml.security.signature.InvalidDigestValueException var1 = new org.apache.xml.security.signature.InvalidDigestValueException("/////w==");

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test73"); }


    boolean var1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsAbsolute("No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test74"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toBinaryString(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "                                "+ "'", var1.equals("                                "));

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test75"); }


    org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException var1 = new org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException("\u00FF");

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test76"); }


    java.lang.String var2 = org.apache.xml.security.algorithms.JCEMapper.getJCEIVAlgorithmFromURI("0000", "org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test77"); }


    org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments var0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments();
    java.lang.String var1 = var0.engineGetURI();
    org.apache.xml.security.keys.provider.ApacheXMLProvider var2 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.security.Provider.Service var5 = var2.getService("No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "org.apache.xml.security.keys.keyresolver.KeyResolverException: No message with ID \"FFaFFaFFaFFa\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.transforms.TransformationException: No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    java.lang.Object var6 = var2.clone();
    double var7 = var2.getVersion();
    java.lang.String var8 = var2.getInfo();
    boolean var10 = var2.contains((java.lang.Object)"org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException: No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    java.util.Set var11 = var2.stringPropertyNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var13 = var0.engineCanonicalizeXPathNodeSet(var11, "4444444444  4 444444444444 444444444444444444444");
      fail("Expected exception of type org.apache.xml.security.c14n.CanonicalizationException");
    } catch (org.apache.xml.security.c14n.CanonicalizationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"+ "'", var1.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Apache XML Security Provider"+ "'", var8.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test78"); }


    org.apache.xml.security.transforms.implementations.TransformXSLT var0 = new org.apache.xml.security.transforms.implementations.TransformXSLT();
    boolean var1 = var0.wantsOctetStream();
    boolean var2 = var0.wantsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test79"); }


    org.apache.xml.security.transforms.implementations.TransformC14N var0 = new org.apache.xml.security.transforms.implementations.TransformC14N();
    boolean var1 = var0.returnsNodeSet();
    boolean var2 = var0.returnsOctetStream();
    boolean var3 = var0.wantsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test80"); }


    byte[] var1 = org.apache.xml.security.utils.HexDump.toByteArray((-1));
    java.lang.String var2 = org.apache.xml.security.utils.Base64.encode(var1);
    byte[] var4 = org.apache.xml.security.utils.HexDump.toByteArray((-1L));
    java.lang.String var5 = org.apache.xml.security.utils.HexDump.toHexString(var4);
    boolean var6 = org.apache.xml.security.utils.JavaUtils.binaryCompare(var1, var4);
    java.lang.String var7 = org.apache.xml.security.utils.Base64.encode(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "/////w=="+ "'", var2.equals("/////w=="));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "FFFFFFFFFFFFFFFF"+ "'", var5.equals("FFFFFFFFFFFFFFFF"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "/////w=="+ "'", var7.equals("/////w=="));

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test81"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toBinaryString((-949787074));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "                                "+ "'", var1.equals("                                "));

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test82"); }


    org.apache.xml.security.c14n.helper.NonNSAttrCompare var0 = new org.apache.xml.security.c14n.helper.NonNSAttrCompare();
    java.lang.Object[] var7 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var8 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var7);
    org.apache.xml.security.transforms.TransformationException var10 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var11 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var7, (java.lang.Exception)var10);
    org.apache.xml.security.signature.ReferenceNotInitializedException var12 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00000000 00000000", var7);
    java.lang.Object[] var16 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var17 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var16);
    org.apache.xml.security.transforms.TransformationException var19 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var20 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var16, (java.lang.Exception)var19);
    org.apache.xml.security.keys.keyresolver.KeyResolverException var21 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("FFaFFaFFaFFa", var7, (java.lang.Exception)var19);
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException var22 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("No message with ID \"0000: FF FF FF FF                                        ....\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", (java.lang.Exception)var19);
    byte[] var26 = new byte[] { (byte)0, (byte)0, (byte)(-1)};
    org.apache.xml.security.signature.XMLSignatureInput var27 = new org.apache.xml.security.signature.XMLSignatureInput(var26);
    org.apache.xpath.CachedXPathAPI var28 = var27.getCachedXPathAPI();
    java.io.InputStream var29 = var27.getOctetStream();
    org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous var30 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous(var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var31 = var0.compare((java.lang.Object)var22, (java.lang.Object)var29);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test83"); }


    org.apache.xml.security.utils.I18n.init("0000: 01                                                 .\r\n", "0000: FF FF FF FF                                        ....\r\n");

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test84"); }


    java.lang.String var1 = org.apache.xml.security.utils.I18n.getExceptionMessage("No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "No message with ID \"No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var1.equals("No message with ID \"No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test85"); }


    org.apache.xml.security.signature.XMLSignatureInput var1 = new org.apache.xml.security.signature.XMLSignatureInput("00000000a00000000a00000000a00000000a00000000a00000000a00000000a00001010");
    var1.setMIMEType("d");
    boolean var4 = var1.isNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test86"); }


    org.apache.xml.security.signature.XMLSignatureInput var1 = new org.apache.xml.security.signature.XMLSignatureInput("                                ");

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test87"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    var0.engineDeleteEntry("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test88"); }


    java.lang.String var1 = org.apache.xml.security.utils.ElementProxy.getDefaultPrefix("No message with ID \" aa  a  \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.transforms.TransformationException and message No message with ID \"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test89"); }


    org.apache.xml.security.transforms.implementations.TransformXPath var0 = new org.apache.xml.security.transforms.implementations.TransformXPath();
    boolean var1 = var0.returnsOctetStream();
    boolean var2 = var0.returnsOctetStream();
    boolean var3 = var0.returnsOctetStream();
    boolean var4 = var0.wantsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test90"); }


    org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments var0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments();
    boolean var1 = var0.engineGetIncludeComments();
    org.apache.xml.security.utils.HelperNodeList var2 = new org.apache.xml.security.utils.HelperNodeList();
    org.w3c.dom.Document var3 = var2.getOwnerDocument();
    org.w3c.dom.Document var4 = var2.getOwnerDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var6 = var0.engineCanonicalizeXPathNodeSet((org.w3c.dom.NodeList)var2, "01");
      fail("Expected exception of type org.apache.xml.security.c14n.CanonicalizationException");
    } catch (org.apache.xml.security.c14n.CanonicalizationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test91"); }


    java.lang.String var1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeAttr("http://www.w3.org/2001/04/xmlenc#rsa-1_5");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-1_5"+ "'", var1.equals("http://www.w3.org/2001/04/xmlenc#rsa-1_5"));

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test92"); }


    org.apache.xml.security.utils.EncryptionConstants.setEncryptionSpecNSprefix("                                                                ");

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test93"); }


    org.apache.xml.security.transforms.implementations.TransformC14NExclusive var0 = new org.apache.xml.security.transforms.implementations.TransformC14NExclusive();
    boolean var1 = var0.wantsNodeSet();
    boolean var2 = var0.returnsNodeSet();
    boolean var3 = var0.returnsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test94"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.c14n.Canonicalizer var1 = org.apache.xml.security.c14n.Canonicalizer.getInstance("00");
      fail("Expected exception of type org.apache.xml.security.c14n.InvalidCanonicalizerException");
    } catch (org.apache.xml.security.c14n.InvalidCanonicalizerException e) {
      // Expected exception.
    }

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test95"); }


    org.apache.xml.security.utils.resolver.implementations.ResolverXPointer var0 = new org.apache.xml.security.utils.resolver.implementations.ResolverXPointer();
    var0.engineSetProperty("Xerces-J 2.0.0", "BC");
    org.apache.xml.security.utils.resolver.ResourceResolver var4 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)var0);
    var0.engineSetProperty("No message with ID \"00001010\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "4444444444  4 444444444444 444444444444444444444");

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test96"); }


    boolean var1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsAbsolute("http://www.w3.org/2001/04/xmlenc#tripledes-cbc");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test97"); }


    byte[] var1 = org.apache.xml.security.utils.HexDump.toByteArray((-1));
    byte[] var3 = org.apache.xml.security.utils.HexDump.toByteArray((short)0);
    java.lang.String var4 = org.apache.xml.security.utils.HexDump.byteArrayToBinaryString(var3);
    boolean var5 = org.apache.xml.security.algorithms.MessageDigestAlgorithm.isEqual(var1, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "                "+ "'", var4.equals("                "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test98"); }


    sun.security.x509.X500Name var6 = org.apache.xml.security.keys.content.x509.XMLX509SubjectName.createX500Name("http://www.w3.org/2001/04/xmlenc#aes128-cbc", "0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n", "414451410A494141410A", "0000: FF FF FF FF                                        ....\r\n", "000A", "ADQA\\aIAAA");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test99"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.prettyPrintHex("0000: 4E 6F 20 6D 65 73 73 61   67 65 20 77 69 74 68 20  No message with \r\n0010: 49 44 20 22 34 31 34 34   35 31 34 31 30 41 34 39  ID \"414451410A49\r\n0020: 34 31 34 31 34 31 30 41   22 20 66 6F 75 6E 64 20  4141410A\" found \r\n0030: 69 6E 20 72 65 73 6F 75   72 63 65 20 62 75 6E 64  in resource bund\r\n0040: 6C 65 20 22 6F 72 67 2F   61 70 61 63 68 65 2F 78  le \"org/apache/x\r\n0050: 6D 6C 2F 73 65 63 75 72   69 74 79 2F 72 65 73 6F  ml/security/reso\r\n0060: 75 72 63 65 2F 78 6D 6C   73 65 63 75 72 69 74 79  urce/xmlsecurity\r\n0070: 22                                                 \"\r\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0000: 30 30 30 30 3A 20 34 45   20 36 46 20 32 30 20 36  0000: 4E 6F 20 6\r\n0010: 44 20 36 35 20 37 33 20   37 33 20 36 31 20 20 20  D 65 73 73 61   \r\n0020: 36 37 20 36 35 20 32 30   20 37 37 20 36 39 20 37  67 65 20 77 69 7\r\n0030: 34 20 36 38 20 32 30 20   20 4E 6F 20 6D 65 73 73  4 68 20  No mess\r\n0040: 61 67 65 20 77 69 74 68   20 0D 0A 30 30 31 30 3A  age with ..0010:\r\n0050: 20 34 39 20 34 34 20 32   30 20 32 32 20 33 34 20   49 44 20 22 34 \r\n0060: 33 31 20 33 34 20 33 34   20 20 20 33 35 20 33 31  31 34 34   35 31\r\n0070: 20 33 34 20 33 31 20 33   30 20 34 31 20 33 34 20   34 31 30 41 34 \r\n0080: 33 39 20 20 49 44 20 22   34 31 34 34 35 31 34 31  39  ID \"41445141\r\n0090: 30 41 34 39 0D 0A 30 30   32 30 3A 20 33 34 20 33  0A49..0020: 34 3\r\n00A0: 31 20 33 34 20 33 31 20   33 34 20 33 31 20 33 30  1 34 31 34 31 30\r\n00B0: 20 34 31 20 20 20 32 32   20 32 30 20 36 36 20 36   41   22 20 66 6\r\n00C0: 46 20 37 35 20 36 45 20   36 34 20 32 30 20 20 34  F 75 6E 64 20  4\r\n00D0: 31 34 31 34 31 30 41 22   20 66 6F 75 6E 64 20 0D  141410A\" found .\r\n00E0: 0A 30 30 33 30 3A 20 36   39 20 36 45 20 32 30 20  .0030: 69 6E 20 \r\n00F0: 37 32 20 36 35 20 37 33   20 36 46 20 37 35 20 20  72 65 73 6F 75  \r\n0100: 20 37 32 20 36 33 20 36   35 20 32 30 20 36 32 20   72 63 65 20 62 \r\n0110: 37 35 20 36 45 20 36 34   20 20 69 6E 20 72 65 73  75 6E 64  in res\r\n0120: 6F 75 72 63 65 20 62 75   6E 64 0D 0A 30 30 34 30  ource bund..0040\r\n0130: 3A 20 36 43 20 36 35 20   32 30 20 32 32 20 36 46  : 6C 65 20 22 6F\r\n0140: 20 37 32 20 36 37 20 32   46 20 20 20 36 31 20 37   72 67 2F   61 7\r\n0150: 30 20 36 31 20 36 33 20   36 38 20 36 35 20 32 46  0 61 63 68 65 2F\r\n0160: 20 37 38 20 20 6C 65 20   22 6F 72 67 2F 61 70 61   78  le \"org/apa\r\n0170: 63 68 65 2F 78 0D 0A 30   30 35 30 3A 20 36 44 20  che/x..0050: 6D \r\n0180: 36 43 20 32 46 20 37 33   20 36 35 20 36 33 20 37  6C 2F 73 65 63 7\r\n0190: 35 20 37 32 20 20 20 36   39 20 37 34 20 37 39 20  5 72   69 74 79 \r\n01A0: 32 46 20 37 32 20 36 35   20 37 33 20 36 46 20 20  2F 72 65 73 6F  \r\n01B0: 6D 6C 2F 73 65 63 75 72   69 74 79 2F 72 65 73 6F  ml/security/reso\r\n01C0: 0D 0A 30 30 36 30 3A 20   37 35 20 37 32 20 36 33  ..0060: 75 72 63\r\n01D0: 20 36 35 20 32 46 20 37   38 20 36 44 20 36 43 20   65 2F 78 6D 6C \r\n01E0: 20 20 37 33 20 36 35 20   36 33 20 37 35 20 37 32    73 65 63 75 72\r\n01F0: 20 36 39 20 37 34 20 37   39 20 20 75 72 63 65 2F   69 74 79  urce/\r\n0200: 78 6D 6C 73 65 63 75 72   69 74 79 0D 0A 30 30 37  xmlsecurity..007\r\n0210: 30 3A 20 32 32 20 20 20   20 20 20 20 20 20 20 20  0: 22           \r\n0220: 20 20 20 20 20 20 20 20   20 20 20 20 20 20 20 20                  \r\n0230: 20 20 20 20 20 20 20 20   20 20 20 20 20 20 20 20                  \r\n0240: 20 20 20 20 20 20 22 0D   0A                             \"..\r\n"+ "'", var1.equals("0000: 30 30 30 30 3A 20 34 45   20 36 46 20 32 30 20 36  0000: 4E 6F 20 6\r\n0010: 44 20 36 35 20 37 33 20   37 33 20 36 31 20 20 20  D 65 73 73 61   \r\n0020: 36 37 20 36 35 20 32 30   20 37 37 20 36 39 20 37  67 65 20 77 69 7\r\n0030: 34 20 36 38 20 32 30 20   20 4E 6F 20 6D 65 73 73  4 68 20  No mess\r\n0040: 61 67 65 20 77 69 74 68   20 0D 0A 30 30 31 30 3A  age with ..0010:\r\n0050: 20 34 39 20 34 34 20 32   30 20 32 32 20 33 34 20   49 44 20 22 34 \r\n0060: 33 31 20 33 34 20 33 34   20 20 20 33 35 20 33 31  31 34 34   35 31\r\n0070: 20 33 34 20 33 31 20 33   30 20 34 31 20 33 34 20   34 31 30 41 34 \r\n0080: 33 39 20 20 49 44 20 22   34 31 34 34 35 31 34 31  39  ID \"41445141\r\n0090: 30 41 34 39 0D 0A 30 30   32 30 3A 20 33 34 20 33  0A49..0020: 34 3\r\n00A0: 31 20 33 34 20 33 31 20   33 34 20 33 31 20 33 30  1 34 31 34 31 30\r\n00B0: 20 34 31 20 20 20 32 32   20 32 30 20 36 36 20 36   41   22 20 66 6\r\n00C0: 46 20 37 35 20 36 45 20   36 34 20 32 30 20 20 34  F 75 6E 64 20  4\r\n00D0: 31 34 31 34 31 30 41 22   20 66 6F 75 6E 64 20 0D  141410A\" found .\r\n00E0: 0A 30 30 33 30 3A 20 36   39 20 36 45 20 32 30 20  .0030: 69 6E 20 \r\n00F0: 37 32 20 36 35 20 37 33   20 36 46 20 37 35 20 20  72 65 73 6F 75  \r\n0100: 20 37 32 20 36 33 20 36   35 20 32 30 20 36 32 20   72 63 65 20 62 \r\n0110: 37 35 20 36 45 20 36 34   20 20 69 6E 20 72 65 73  75 6E 64  in res\r\n0120: 6F 75 72 63 65 20 62 75   6E 64 0D 0A 30 30 34 30  ource bund..0040\r\n0130: 3A 20 36 43 20 36 35 20   32 30 20 32 32 20 36 46  : 6C 65 20 22 6F\r\n0140: 20 37 32 20 36 37 20 32   46 20 20 20 36 31 20 37   72 67 2F   61 7\r\n0150: 30 20 36 31 20 36 33 20   36 38 20 36 35 20 32 46  0 61 63 68 65 2F\r\n0160: 20 37 38 20 20 6C 65 20   22 6F 72 67 2F 61 70 61   78  le \"org/apa\r\n0170: 63 68 65 2F 78 0D 0A 30   30 35 30 3A 20 36 44 20  che/x..0050: 6D \r\n0180: 36 43 20 32 46 20 37 33   20 36 35 20 36 33 20 37  6C 2F 73 65 63 7\r\n0190: 35 20 37 32 20 20 20 36   39 20 37 34 20 37 39 20  5 72   69 74 79 \r\n01A0: 32 46 20 37 32 20 36 35   20 37 33 20 36 46 20 20  2F 72 65 73 6F  \r\n01B0: 6D 6C 2F 73 65 63 75 72   69 74 79 2F 72 65 73 6F  ml/security/reso\r\n01C0: 0D 0A 30 30 36 30 3A 20   37 35 20 37 32 20 36 33  ..0060: 75 72 63\r\n01D0: 20 36 35 20 32 46 20 37   38 20 36 44 20 36 43 20   65 2F 78 6D 6C \r\n01E0: 20 20 37 33 20 36 35 20   36 33 20 37 35 20 37 32    73 65 63 75 72\r\n01F0: 20 36 39 20 37 34 20 37   39 20 20 75 72 63 65 2F   69 74 79  urce/\r\n0200: 78 6D 6C 73 65 63 75 72   69 74 79 0D 0A 30 30 37  xmlsecurity..007\r\n0210: 30 3A 20 32 32 20 20 20   20 20 20 20 20 20 20 20  0: 22           \r\n0220: 20 20 20 20 20 20 20 20   20 20 20 20 20 20 20 20                  \r\n0230: 20 20 20 20 20 20 20 20   20 20 20 20 20 20 20 20                  \r\n0240: 20 20 20 20 20 20 22 0D   0A                             \"..\r\n"));

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test100"); }


    org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments var0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments();
    byte[] var2 = org.apache.xml.security.utils.HexDump.toByteArray((-1));
    java.lang.String var4 = org.apache.xml.security.utils.Base64.encode(var2, 16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var5 = var0.engineCanonicalize(var2);
      fail("Expected exception of type java.io.UTFDataFormatException");
    } catch (java.io.UTFDataFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "/////w=="+ "'", var4.equals("/////w=="));

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test101"); }


    org.apache.xml.security.utils.resolver.implementations.ResolverXPointer var1 = new org.apache.xml.security.utils.resolver.implementations.ResolverXPointer();
    var1.engineSetProperty("Xerces-J 2.0.0", "BC");
    org.apache.xml.security.utils.resolver.ResourceResolver var5 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)var1);
    org.apache.xml.security.utils.resolver.ResourceResolver var6 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)var1);
    java.lang.String[] var7 = var6.getPropertyKeys();
    java.lang.Object[] var12 = new java.lang.Object[] { (short)10};
    org.apache.xml.security.signature.InvalidDigestValueException var13 = new org.apache.xml.security.signature.InvalidDigestValueException("\u00FF", var12);
    org.apache.xml.security.c14n.CanonicalizationException var14 = new org.apache.xml.security.c14n.CanonicalizationException("Xalan Java 2.5.1", var12);
    org.apache.xml.security.signature.InvalidSignatureValueException var15 = new org.apache.xml.security.signature.InvalidSignatureValueException("/////w==", var12);
    org.apache.xml.security.transforms.InvalidTransformException var16 = new org.apache.xml.security.transforms.InvalidTransformException("0000: 41 41 41 41 41 41 41 41   41 47 51 3D              AAAAAAAAAGQ=\r\n", (java.lang.Object[])var7, (java.lang.Exception)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test102"); }


    org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver var0 = new org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver();
    java.lang.String var2 = var0.engineGetProperty("");
    java.lang.String[] var3 = var0.engineGetPropertyKeys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test103"); }


    org.apache.xml.security.exceptions.XMLSecurityException var0 = new org.apache.xml.security.exceptions.XMLSecurityException();
    java.lang.Throwable[] var1 = var0.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test104"); }


    org.apache.xml.security.utils.resolver.implementations.ResolverXPointer var0 = new org.apache.xml.security.utils.resolver.implementations.ResolverXPointer();
    var0.engineSetProperty("Xerces-J 2.0.0", "BC");
    org.apache.xml.security.utils.resolver.ResourceResolver var4 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)var0);
    org.apache.xml.security.utils.resolver.ResourceResolver var5 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)var0);
    boolean var7 = var5.understandsProperty("http://www.w3.org/2001/04/xmlenc#rsa-1_5");
    boolean var9 = var5.understandsProperty("\u00FF");
    java.lang.String var11 = var5.getProperty("No message with ID \"No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test105"); }


    org.apache.xml.security.utils.resolver.implementations.ResolverXPointer var0 = new org.apache.xml.security.utils.resolver.implementations.ResolverXPointer();
    var0.engineSetProperty("Xerces-J 2.0.0", "BC");
    org.apache.xml.security.keys.provider.ApacheXMLProvider var4 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.security.Provider.Service var7 = var4.getService("No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "org.apache.xml.security.keys.keyresolver.KeyResolverException: No message with ID \"FFaFFaFFaFFa\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.transforms.TransformationException: No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    java.lang.Object var8 = var4.clone();
    double var9 = var4.getVersion();
    java.lang.String var10 = var4.getInfo();
    boolean var12 = var4.contains((java.lang.Object)"org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException: No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    java.util.Set var13 = var4.stringPropertyNames();
    var0.engineAddProperies((java.util.Map)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Apache XML Security Provider"+ "'", var10.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test106"); }


    org.apache.xml.security.signature.ReferenceNotInitializedException var1 = new org.apache.xml.security.signature.ReferenceNotInitializedException("4E6F206D657373616765207769746820494420224E6F206D6573736167652077697468204944202230303030303030302030303030303030302220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C7365637572697479222220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922");

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test107"); }


    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var1 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException: No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
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
    org.apache.xml.security.exceptions.XMLSecurityException var25 = new org.apache.xml.security.exceptions.XMLSecurityException("ADQA\nIAAA\n", (java.lang.Exception)var24);
    var1.addSuppressed((java.lang.Throwable)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test108"); }


    org.apache.xml.security.c14n.InvalidCanonicalizerException var1 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("No message with ID \"0000: 20 20 20 20 20 20 20 20                                    \r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test109"); }


    byte[] var3 = new byte[] { (byte)0, (byte)0, (byte)(-1)};
    org.apache.xml.security.signature.XMLSignatureInput var4 = new org.apache.xml.security.signature.XMLSignatureInput(var3);
    java.lang.String var5 = var4.getSourceURI();
    org.apache.xpath.CachedXPathAPI var6 = var4.getCachedXPathAPI();
    java.lang.String var7 = var4.getSourceURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test110"); }


    java.lang.Object[] var10 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var11 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var10);
    org.apache.xml.security.transforms.TransformationException var13 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var14 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var10, (java.lang.Exception)var13);
    org.apache.xml.security.transforms.TransformationException var15 = new org.apache.xml.security.transforms.TransformationException("\u00FF", var10);
    java.lang.Object[] var21 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var22 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var21);
    org.apache.xml.security.transforms.TransformationException var24 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var25 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var21, (java.lang.Exception)var24);
    org.apache.xml.security.signature.ReferenceNotInitializedException var26 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00000000 00000000", var21);
    org.apache.xml.security.keys.storage.StorageResolverException var27 = new org.apache.xml.security.keys.storage.StorageResolverException("0000: 01                                                 .\r\n", var21);
    org.apache.xml.security.signature.XMLSignatureException var28 = new org.apache.xml.security.signature.XMLSignatureException("BC", var10, (java.lang.Exception)var27);
    org.apache.xml.security.exceptions.XMLSecurityException var32 = new org.apache.xml.security.exceptions.XMLSecurityException("No message with ID \"68 69 21 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    java.lang.Throwable[] var33 = var32.getSuppressed();
    org.apache.xml.security.exceptions.XMLSecurityException var35 = new org.apache.xml.security.exceptions.XMLSecurityException("No message with ID \"68 69 21 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    org.apache.xml.security.exceptions.XMLSecurityException var36 = new org.apache.xml.security.exceptions.XMLSecurityException("0000: 01                                                 .\r\n", (java.lang.Object[])var33, (java.lang.Exception)var35);
    org.apache.xml.security.signature.InvalidSignatureValueException var37 = new org.apache.xml.security.signature.InvalidSignatureValueException("org.apache.xml.security.signature.XMLSignatureException: No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.keys.storage.StorageResolverException: No message with ID \"0000: 01                                                 .\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", (java.lang.Exception)var35);
    org.apache.xml.security.exceptions.Base64DecodingException var38 = new org.apache.xml.security.exceptions.Base64DecodingException("0000: FF FF FF FF                                        ....\r\n", var10, (java.lang.Exception)var35);
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException var39 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("414451410A494141410A", var10);
    java.lang.Object[] var43 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var44 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var43);
    org.apache.xml.security.transforms.TransformationException var46 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var47 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var43, (java.lang.Exception)var46);
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var48 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("No message with ID \"4E6F206D657373616765207769746820494420224E6F206D6573736167652077697468204944202230303030303030302030303030303030302220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C7365637572697479222220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.keys.keyresolver.KeyResolverException and message No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.transforms.InvalidTransformException and message Missing message string", var10, (java.lang.Exception)var47);
    java.lang.String var49 = org.apache.xml.security.utils.I18n.getExceptionMessage("0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n", var10);
    org.apache.xml.security.signature.ReferenceNotInitializedException var50 = new org.apache.xml.security.signature.ReferenceNotInitializedException("0000: 36 38 20 36 39 20 32 31   20                       68 69 21 &#xD;&#xA;", var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "No message with ID \"0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var49.equals("No message with ID \"0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test111"); }


    org.apache.xml.security.utils.resolver.implementations.ResolverXPointer var0 = new org.apache.xml.security.utils.resolver.implementations.ResolverXPointer();
    var0.engineSetProperty("Xerces-J 2.0.0", "BC");
    org.apache.xml.security.utils.resolver.ResourceResolver var4 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)var0);
    org.apache.xml.security.utils.resolver.ResourceResolver var5 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)var0);
    boolean var7 = var5.understandsProperty("http://www.w3.org/2001/04/xmlenc#rsa-1_5");
    java.lang.String var9 = var5.getProperty("0000");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test112"); }


    java.lang.String var2 = org.apache.xml.security.algorithms.JCEMapper.getJCEIVAlgorithmFromURI("0000: 30 30 30 30 3A 20 34 45   20 36 46 20 32 30 20 36  0000: 4E 6F 20 6\r\n0010: 44 20 36 35 20 37 33 20   37 33 20 36 31 20 20 20  D 65 73 73 61   \r\n0020: 36 37 20 36 35 20 32 30   20 37 37 20 36 39 20 37  67 65 20 77 69 7\r\n0030: 34 20 36 38 20 32 30 20   20 4E 6F 20 6D 65 73 73  4 68 20  No mess\r\n0040: 61 67 65 20 77 69 74 68   20 0D 0A 30 30 31 30 3A  age with ..0010:\r\n0050: 20 34 39 20 34 34 20 32   30 20 32 32 20 33 34 20   49 44 20 22 34 \r\n0060: 33 31 20 33 34 20 33 34   20 20 20 33 35 20 33 31  31 34 34   35 31\r\n0070: 20 33 34 20 33 31 20 33   30 20 34 31 20 33 34 20   34 31 30 41 34 \r\n0080: 33 39 20 20 49 44 20 22   34 31 34 34 35 31 34 31  39  ID \"41445141\r\n0090: 30 41 34 39 0D 0A 30 30   32 30 3A 20 33 34 20 33  0A49..0020: 34 3\r\n00A0: 31 20 33 34 20 33 31 20   33 34 20 33 31 20 33 30  1 34 31 34 31 30\r\n00B0: 20 34 31 20 20 20 32 32   20 32 30 20 36 36 20 36   41   22 20 66 6\r\n00C0: 46 20 37 35 20 36 45 20   36 34 20 32 30 20 20 34  F 75 6E 64 20  4\r\n00D0: 31 34 31 34 31 30 41 22   20 66 6F 75 6E 64 20 0D  141410A\" found .\r\n00E0: 0A 30 30 33 30 3A 20 36   39 20 36 45 20 32 30 20  .0030: 69 6E 20 \r\n00F0: 37 32 20 36 35 20 37 33   20 36 46 20 37 35 20 20  72 65 73 6F 75  \r\n0100: 20 37 32 20 36 33 20 36   35 20 32 30 20 36 32 20   72 63 65 20 62 \r\n0110: 37 35 20 36 45 20 36 34   20 20 69 6E 20 72 65 73  75 6E 64  in res\r\n0120: 6F 75 72 63 65 20 62 75   6E 64 0D 0A 30 30 34 30  ource bund..0040\r\n0130: 3A 20 36 43 20 36 35 20   32 30 20 32 32 20 36 46  : 6C 65 20 22 6F\r\n0140: 20 37 32 20 36 37 20 32   46 20 20 20 36 31 20 37   72 67 2F   61 7\r\n0150: 30 20 36 31 20 36 33 20   36 38 20 36 35 20 32 46  0 61 63 68 65 2F\r\n0160: 20 37 38 20 20 6C 65 20   22 6F 72 67 2F 61 70 61   78  le \"org/apa\r\n0170: 63 68 65 2F 78 0D 0A 30   30 35 30 3A 20 36 44 20  che/x..0050: 6D \r\n0180: 36 43 20 32 46 20 37 33   20 36 35 20 36 33 20 37  6C 2F 73 65 63 7\r\n0190: 35 20 37 32 20 20 20 36   39 20 37 34 20 37 39 20  5 72   69 74 79 \r\n01A0: 32 46 20 37 32 20 36 35   20 37 33 20 36 46 20 20  2F 72 65 73 6F  \r\n01B0: 6D 6C 2F 73 65 63 75 72   69 74 79 2F 72 65 73 6F  ml/security/reso\r\n01C0: 0D 0A 30 30 36 30 3A 20   37 35 20 37 32 20 36 33  ..0060: 75 72 63\r\n01D0: 20 36 35 20 32 46 20 37   38 20 36 44 20 36 43 20   65 2F 78 6D 6C \r\n01E0: 20 20 37 33 20 36 35 20   36 33 20 37 35 20 37 32    73 65 63 75 72\r\n01F0: 20 36 39 20 37 34 20 37   39 20 20 75 72 63 65 2F   69 74 79  urce/\r\n0200: 78 6D 6C 73 65 63 75 72   69 74 79 0D 0A 30 30 37  xmlsecurity..007\r\n0210: 30 3A 20 32 32 20 20 20   20 20 20 20 20 20 20 20  0: 22           \r\n0220: 20 20 20 20 20 20 20 20   20 20 20 20 20 20 20 20                  \r\n0230: 20 20 20 20 20 20 20 20   20 20 20 20 20 20 20 20                  \r\n0240: 20 20 20 20 20 20 22 0D   0A                             \"..\r\n", "NomessagewithIC/NomessagewithIC/0000000000000000/foundinresourcebundld/org/apache/xml/security/resou\nrce/xmlsecuritx//foundinresourcebundld/org/apache/xml/security/resource/xmlsecuritx/");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test113"); }


    org.apache.xml.security.algorithms.SignatureAlgorithm.register("//////////8=", "No message with ID \"68 69 21 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test114"); }


    org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments var0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments();
    java.lang.String var1 = var0.engineGetURI();
    boolean var2 = var0.engineGetIncludeComments();
    org.apache.xml.security.keys.provider.ApacheXMLProvider var3 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.security.Provider.Service var6 = var3.getService("No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "org.apache.xml.security.keys.keyresolver.KeyResolverException: No message with ID \"FFaFFaFFaFFa\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.transforms.TransformationException: No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    java.lang.Object var7 = var3.clone();
    java.lang.String var8 = var3.getInfo();
    java.lang.Object var11 = var3.setProperty("                                                                ", "XMLSignatureInput/OctetStream/3 octets/null");
    java.util.Collection var12 = var3.values();
    java.util.Collection var13 = var3.values();
    java.util.Set var15 = org.apache.xml.security.transforms.params.InclusiveNamespaces.prefixStr2Set("00001010");
    boolean var16 = var3.containsValue((java.lang.Object)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var17 = var0.engineCanonicalizeXPathNodeSet(var15);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"+ "'", var1.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Apache XML Security Provider"+ "'", var8.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test115"); }


    org.apache.xml.security.signature.InvalidDigestValueException var1 = new org.apache.xml.security.signature.InvalidDigestValueException("01");

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test116"); }


    java.lang.String var1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeAttr("0000: 30 30 30 30 3A 20 34 31   20 34 31 20 34 31 20 34  0000: 41 41 41 4\r\n0010: 31 20 34 31 20 34 31 20   34 31 20 34 31 20 20 20  1 41 41 41 41   \r\n0020: 34 31 20 34 37 20 35 31   20 33 44 20 20 20 20 20  41 47 51 3D     \r\n0030: 20 20 20 20 20 20 20 20   20 41 41 41 41 41 41 41           AAAAAAA\r\n0040: 41 41 47 51 3D                                     AAGQ=\r\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0000: 30 30 30 30 3A 20 34 31   20 34 31 20 34 31 20 34  0000: 41 41 41 4&#xD;&#xA;0010: 31 20 34 31 20 34 31 20   34 31 20 34 31 20 20 20  1 41 41 41 41   &#xD;&#xA;0020: 34 31 20 34 37 20 35 31   20 33 44 20 20 20 20 20  41 47 51 3D     &#xD;&#xA;0030: 20 20 20 20 20 20 20 20   20 41 41 41 41 41 41 41           AAAAAAA&#xD;&#xA;0040: 41 41 47 51 3D                                     AAGQ=&#xD;&#xA;"+ "'", var1.equals("0000: 30 30 30 30 3A 20 34 31   20 34 31 20 34 31 20 34  0000: 41 41 41 4&#xD;&#xA;0010: 31 20 34 31 20 34 31 20   34 31 20 34 31 20 20 20  1 41 41 41 41   &#xD;&#xA;0020: 34 31 20 34 37 20 35 31   20 33 44 20 20 20 20 20  41 47 51 3D     &#xD;&#xA;0030: 20 20 20 20 20 20 20 20   20 41 41 41 41 41 41 41           AAAAAAA&#xD;&#xA;0040: 41 41 47 51 3D                                     AAGQ=&#xD;&#xA;"));

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test117"); }


    byte[] var3 = new byte[] { (byte)0, (byte)0, (byte)(-1)};
    org.apache.xml.security.signature.XMLSignatureInput var4 = new org.apache.xml.security.signature.XMLSignatureInput(var3);
    boolean var5 = var4.isNodeSet();
    java.lang.String var6 = var4.getSourceURI();
    boolean var7 = var4.isOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test118"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous var1 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous("d");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test119"); }


    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC var0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC();
    int var1 = var0.getImplementedAlgorithmType();
    int var2 = var0.engineGetIvLength();
    int var3 = var0.getImplementedAlgorithmType();
    int var4 = var0.engineGetBlockSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test120"); }


    java.lang.String var2 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.expandSystemId("00000000 00000000", "BC");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "00000000 00000000"+ "'", var2.equals("00000000 00000000"));

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test121"); }


    org.apache.xml.security.utils.PRNG var0 = org.apache.xml.security.utils.PRNG.getInstance();
    int var1 = var0.nextInt();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.nextInt((-949787074));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1387429288);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test122"); }


    int var1 = org.apache.xml.security.algorithms.JCEMapper.getKeyTypeFromURI("\u0000");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test123"); }


    org.apache.xml.security.keys.provider.ApacheXMLProvider var0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.security.Provider.Service var3 = var0.getService("No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "org.apache.xml.security.keys.keyresolver.KeyResolverException: No message with ID \"FFaFFaFFaFFa\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.transforms.TransformationException: No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    java.lang.Object var4 = var0.clone();
    java.lang.String var5 = var0.getInfo();
    java.lang.Object var8 = var0.setProperty("                                                                ", "XMLSignatureInput/OctetStream/3 octets/null");
    java.util.Collection var9 = var0.values();
    java.util.Enumeration var10 = var0.elements();
    org.apache.xml.security.keys.provider.ApacheXMLProvider var11 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.security.Provider.Service var14 = var11.getService("No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "org.apache.xml.security.keys.keyresolver.KeyResolverException: No message with ID \"FFaFFaFFaFFa\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.transforms.TransformationException: No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    java.lang.Object var15 = var11.clone();
    boolean var17 = var11.containsValue((java.lang.Object)"0000000000000001");
    java.lang.String var18 = var11.toString();
    var11.clear();
    java.lang.Object var20 = var11.clone();
    org.apache.xml.security.signature.XMLSignatureInput var22 = new org.apache.xml.security.signature.XMLSignatureInput("00000000a00000000a00000000a00000000a00000000a00000000a00000000a00001010");
    java.io.InputStream var23 = var22.getOctetStream();
    var11.load(var23);
    var0.load(var23);
    org.apache.xml.security.signature.XMLSignatureInput var26 = new org.apache.xml.security.signature.XMLSignatureInput(var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.Init.readUserConfiguration(var23);
      fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
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
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "ApacheXML version 1.0"+ "'", var18.equals("ApacheXML version 1.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test124"); }


    byte[] var1 = org.apache.xml.security.utils.HexDump.toByteArray((short)0);
    java.lang.String var2 = org.apache.xml.security.utils.HexDump.byteArrayToBinaryString(var1);
    java.lang.String var5 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(var1, 8, 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "                "+ "'", var2.equals("                "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test125"); }


    org.apache.xml.security.signature.InvalidDigestValueException var1 = new org.apache.xml.security.signature.InvalidDigestValueException("                                                                ");

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test126"); }


    int var3 = org.apache.xml.security.encryption.EncryptedData.min(1, (-949787074), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-949787074));

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test127"); }


    org.apache.xml.security.transforms.implementations.TransformC14N var0 = new org.apache.xml.security.transforms.implementations.TransformC14N();
    boolean var1 = var0.returnsNodeSet();
    boolean var2 = var0.wantsOctetStream();
    boolean var3 = var0.returnsOctetStream();
    boolean var4 = var0.returnsNodeSet();
    boolean var5 = var0.wantsNodeSet();
    boolean var6 = var0.returnsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test128"); }


    boolean var1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsRelative("36899EB2C6A07B08AD8480BF36899EB2C6A07B08AD8480BFD34D34D34D34D34D34D34D34FDFA2E9DD8A7ADEB28BAB71E6EE9DD95DFE8AE0FDAA5A7217BFC6697FB1E72EAE2B72FEB7ACA2EADC7BFC6696C79CBAB8ADC7FFDFA2E9DD8A7ADEB28BAB71E6EE9DD95DFE8AE0FDAA5A7217BFC6697FB1E72EAE2B72FEB7ACA2EADC7BFC6696C79CBAB8ADC7F");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test129"); }


    java.lang.String var2 = org.apache.xml.security.algorithms.JCEMapper.getJCEIVAlgorithmFromURI("No message with ID \"00000010\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "No message with ID \"No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test130"); }


    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC var0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    int var1 = var0.engineGetBlockSize();

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test131"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous var1 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous("http://www.w3.org/2001/04/xmlenc#aes128-cbc");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test132"); }


    java.lang.String var2 = org.apache.xml.security.algorithms.JCEMapper.getJCEIVAlgorithmFromURI("No message with ID \"0000000000000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "No message with ID \"No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test133"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.keys.keyresolver.KeyResolver var1 = org.apache.xml.security.keys.keyresolver.KeyResolver.item((-949787074));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test134"); }


    boolean var1 = org.apache.xml.security.algorithms.JCEMapper.getProviderIsInClassPath("00000001");

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test135"); }


    org.apache.xml.security.transforms.Transform.register("http://www.w3.org/2001/04/xmlenc#kw-aes128", "0000: 20 20 20 20 20 20 20 20                                    \r\n");

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test136"); }


    org.apache.xml.security.transforms.InvalidTransformException var4 = new org.apache.xml.security.transforms.InvalidTransformException();
    org.apache.xml.security.keys.keyresolver.KeyResolverException var5 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("00000000 00000000", (java.lang.Exception)var4);
    org.apache.xml.security.signature.XMLSignatureException var6 = new org.apache.xml.security.signature.XMLSignatureException("BC", (java.lang.Exception)var5);
    org.apache.xml.security.transforms.TransformationException var7 = new org.apache.xml.security.transforms.TransformationException("\u00FF", (java.lang.Exception)var6);
    org.apache.xml.security.exceptions.XMLSecurityException var8 = new org.apache.xml.security.exceptions.XMLSecurityException("No message with ID \"4E6F206D657373616765207769746820494420223638203639203231202220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", (java.lang.Exception)var7);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test137"); }


    java.lang.Object[] var11 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var12 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var11);
    org.apache.xml.security.transforms.TransformationException var14 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var15 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var11, (java.lang.Exception)var14);
    org.apache.xml.security.signature.ReferenceNotInitializedException var16 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00000000 00000000", var11);
    org.apache.xml.security.c14n.CanonicalizationException var17 = new org.apache.xml.security.c14n.CanonicalizationException("68 69 21 ", var11);
    java.lang.Object[] var21 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var22 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var21);
    org.apache.xml.security.transforms.TransformationException var24 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var25 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var21, (java.lang.Exception)var24);
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException var26 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("0000: 01                                                 .\r\n", var11, (java.lang.Exception)var24);
    org.apache.xml.security.exceptions.XMLSecurityException var27 = new org.apache.xml.security.exceptions.XMLSecurityException("003400200000", var11);
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var28 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("d", var11);
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException var29 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("No message with ID \"0000000000000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", var11);
    org.apache.xml.security.signature.InvalidSignatureValueException var31 = new org.apache.xml.security.signature.InvalidSignatureValueException("0000: 01                                                 .\r\n");
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var32 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("AAAAAAAAAGQ=", var11, (java.lang.Exception)var31);
    org.apache.xml.security.c14n.InvalidCanonicalizerException var33 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("No message with ID \"00001010\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test138"); }


    java.lang.Object[] var7 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var8 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var7);
    org.apache.xml.security.transforms.TransformationException var10 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var11 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var7, (java.lang.Exception)var10);
    org.apache.xml.security.transforms.TransformationException var12 = new org.apache.xml.security.transforms.TransformationException("\u00FF", var7);
    org.apache.xml.security.c14n.InvalidCanonicalizerException var13 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("00 34 00 20 00 00", (java.lang.Exception)var12);
    org.apache.xml.security.signature.ReferenceNotInitializedException var14 = new org.apache.xml.security.signature.ReferenceNotInitializedException("000A", (java.lang.Exception)var12);
    org.apache.xml.security.transforms.TransformationException var15 = new org.apache.xml.security.transforms.TransformationException("0000: 4E 6F 20 6D 65 73 73 61   67 65 20 77 69 74 68 20  No message with \r\n0010: 49 44 20 22 34 31 34 34   35 31 34 31 30 41 34 39  ID \"414451410A49\r\n0020: 34 31 34 31 34 31 30 41   22 20 66 6F 75 6E 64 20  4141410A\" found \r\n0030: 69 6E 20 72 65 73 6F 75   72 63 65 20 62 75 6E 64  in resource bund\r\n0040: 6C 65 20 22 6F 72 67 2F   61 70 61 63 68 65 2F 78  le \"org/apache/x\r\n0050: 6D 6C 2F 73 65 63 75 72   69 74 79 2F 72 65 73 6F  ml/security/reso\r\n0060: 75 72 63 65 2F 78 6D 6C   73 65 63 75 72 69 74 79  urce/xmlsecurity\r\n0070: 22                                                 \"\r\n", (java.lang.Exception)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test139"); }


    int var2 = org.apache.xml.security.encryption.EncryptedData.min(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test140"); }


    java.lang.String var1 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.makeFilesystemToURI("No message with ID \"0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test141"); }


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
    org.apache.xml.security.transforms.InvalidTransformException var25 = new org.apache.xml.security.transforms.InvalidTransformException("No message with ID \"No message with ID \"68 69 21 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", var9);
    org.apache.xml.security.utils.resolver.implementations.ResolverXPointer var27 = new org.apache.xml.security.utils.resolver.implementations.ResolverXPointer();
    java.lang.String[] var28 = var27.engineGetPropertyKeys();
    java.lang.String[] var29 = var27.engineGetPropertyKeys();
    org.apache.xml.security.signature.InvalidDigestValueException var30 = new org.apache.xml.security.signature.InvalidDigestValueException("No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", (java.lang.Object[])var29);
    org.apache.xml.security.keys.storage.StorageResolverException var31 = new org.apache.xml.security.keys.storage.StorageResolverException("No message with ID \"No message with ID \" aa  a  \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.transforms.TransformationException and message No message with ID \"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", var9, (java.lang.Exception)var30);
    java.lang.Object[] var38 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var39 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var38);
    org.apache.xml.security.exceptions.Base64DecodingException var40 = new org.apache.xml.security.exceptions.Base64DecodingException("hi!", var38);
    java.lang.Object[] var47 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var48 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var47);
    org.apache.xml.security.transforms.TransformationException var50 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var51 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var47, (java.lang.Exception)var50);
    org.apache.xml.security.signature.ReferenceNotInitializedException var52 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00000000 00000000", var47);
    org.apache.xml.security.c14n.CanonicalizationException var53 = new org.apache.xml.security.c14n.CanonicalizationException("68 69 21 ", var47);
    java.lang.Object[] var57 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var58 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var57);
    org.apache.xml.security.transforms.TransformationException var60 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var61 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var57, (java.lang.Exception)var60);
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException var62 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("0000: 01                                                 .\r\n", var47, (java.lang.Exception)var60);
    org.apache.xml.security.c14n.CanonicalizationException var63 = new org.apache.xml.security.c14n.CanonicalizationException("00001010", var38, (java.lang.Exception)var60);
    org.apache.xml.security.keys.storage.StorageResolverException var66 = new org.apache.xml.security.keys.storage.StorageResolverException("68 69 21 ");
    org.apache.xml.security.signature.XMLSignatureException var67 = new org.apache.xml.security.signature.XMLSignatureException("68 69 21 ", (java.lang.Exception)var66);
    org.apache.xml.security.exceptions.XMLSecurityException var68 = new org.apache.xml.security.exceptions.XMLSecurityException("0000: 01                                                 .\r\n", var38, (java.lang.Exception)var67);
    java.lang.String var69 = org.apache.xml.security.utils.I18n.getExceptionMessage("0000: 30 30 30 30 30 30 30 30   30 30 30 30 30 30 30 30  0000000000000000\r\n", (java.lang.Exception)var68);
    org.apache.xml.security.keys.storage.StorageResolverException var70 = new org.apache.xml.security.keys.storage.StorageResolverException("org.apache.xml.security.c14n.CanonicalizationException: No message with ID \"FFaFFaFFaFFa\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", var9, (java.lang.Exception)var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "No message with ID \"0000: 30 30 30 30 30 30 30 30   30 30 30 30 30 30 30 30  0000000000000000\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.exceptions.XMLSecurityException and message No message with ID \"0000: 01                                                 .\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var69.equals("No message with ID \"0000: 30 30 30 30 30 30 30 30   30 30 30 30 30 30 30 30  0000000000000000\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.exceptions.XMLSecurityException and message No message with ID \"0000: 01                                                 .\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test142"); }


    byte[] var3 = new byte[] { (byte)0, (byte)0, (byte)(-1)};
    org.apache.xml.security.signature.XMLSignatureInput var4 = new org.apache.xml.security.signature.XMLSignatureInput(var3);
    boolean var5 = var4.isNodeSet();
    boolean var6 = var4.isInitialized();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test143"); }


    org.apache.xml.security.utils.EncryptionConstants.setEncryptionSpecNSprefix("No message with ID \"0000: 20 20 20 20 20 20 20 20                                    \r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test144"); }


    org.apache.xml.security.utils.resolver.ResourceResolver.registerAtStart("4E6F206D657373616765207769746820494420223638203639203231202220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922");

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test145"); }


    byte[] var2 = org.apache.xml.security.utils.HexDump.toByteArray((-1));
    java.lang.String var3 = org.apache.xml.security.utils.HexDump.prettyPrintHex(var2);
    byte[] var5 = org.apache.xml.security.utils.HexDump.toByteArray((-1));
    java.lang.String var6 = org.apache.xml.security.utils.Base64.encode(var5);
    byte[] var8 = org.apache.xml.security.utils.HexDump.toByteArray((-1L));
    java.lang.String var9 = org.apache.xml.security.utils.HexDump.toHexString(var8);
    boolean var10 = org.apache.xml.security.utils.JavaUtils.binaryCompare(var5, var8);
    boolean var11 = org.apache.xml.security.algorithms.MessageDigestAlgorithm.isEqual(var2, var5);
    org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments var12 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments();
    org.apache.xml.security.utils.HelperNodeList var13 = new org.apache.xml.security.utils.HelperNodeList();
    int var14 = var13.getLength();
    java.util.Set var15 = org.apache.xml.security.utils.XMLUtils.convertNodelistToSet((org.w3c.dom.NodeList)var13);
    byte[] var16 = var12.engineCanonicalizeXPathNodeSet(var15);
    boolean var17 = org.apache.xml.security.utils.JavaUtils.binaryCompare(var2, var16);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("4444444444  4 444444444444 444444444444444444444", var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "0000: FF FF FF FF                                        ....\r\n"+ "'", var3.equals("0000: FF FF FF FF                                        ....\r\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "/////w=="+ "'", var6.equals("/////w=="));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "FFFFFFFFFFFFFFFF"+ "'", var9.equals("FFFFFFFFFFFFFFFF"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test146"); }


    org.apache.xml.security.signature.XMLSignatureException var1 = new org.apache.xml.security.signature.XMLSignatureException("000001");

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test147"); }


    java.lang.String var1 = org.apache.xml.security.utils.HexDump.toBinaryString((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "                                                                "+ "'", var1.equals("                                                                "));

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test148"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous var1 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous("\u00FF\u00FF\u00FF\u00FF\u00FF\u00FF\u00FF\u00FF");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test149"); }


    org.apache.xml.security.utils.HelperNodeList var1 = new org.apache.xml.security.utils.HelperNodeList(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.w3c.dom.Node var3 = var1.item((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test150"); }


    java.util.Set var1 = org.apache.xml.security.transforms.params.InclusiveNamespaces.prefixStr2Set("0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n");
    org.apache.xml.security.signature.XMLSignatureInput var2 = new org.apache.xml.security.signature.XMLSignatureInput(var1);
    org.apache.xml.security.signature.XMLSignatureInput var3 = new org.apache.xml.security.signature.XMLSignatureInput(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test151"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var1 = org.apache.xml.security.utils.JavaUtils.getBytesFromFile("No message with ID \"No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test152"); }


    org.apache.xml.security.exceptions.XMLSecurityException var4 = new org.apache.xml.security.exceptions.XMLSecurityException("No message with ID \"68 69 21 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    java.lang.Throwable[] var5 = var4.getSuppressed();
    org.apache.xml.security.transforms.TransformationException var8 = new org.apache.xml.security.transforms.TransformationException("Xerces-J 2.0.0");
    org.apache.xml.security.signature.ReferenceNotInitializedException var9 = new org.apache.xml.security.signature.ReferenceNotInitializedException("", (java.lang.Exception)var8);
    org.apache.xml.security.exceptions.XMLSecurityException var10 = new org.apache.xml.security.exceptions.XMLSecurityException("FFaFFaFFaFFa", (java.lang.Object[])var5, (java.lang.Exception)var8);
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException var11 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("0000000000000000", (java.lang.Exception)var10);
    org.apache.xml.security.signature.XMLSignatureException var12 = new org.apache.xml.security.signature.XMLSignatureException("0000: 30 30 30 30 30 30 30 30   30 30 30 30 30 30 30 30  0000000000000000\r\n", (java.lang.Exception)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test153"); }


    org.apache.xml.security.keys.provider.ApacheXMLProvider var0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.security.Provider.Service var3 = var0.getService("No message with ID \"                                                                \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "org.apache.xml.security.keys.keyresolver.KeyResolverException: No message with ID \"FFaFFaFFaFFa\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.transforms.TransformationException: No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    java.lang.Object var4 = var0.clone();
    boolean var6 = var0.containsValue((java.lang.Object)"0000000000000001");
    java.lang.String var7 = var0.toString();
    var0.clear();
    java.lang.Object var9 = var0.clone();
    org.apache.xml.security.signature.XMLSignatureInput var11 = new org.apache.xml.security.signature.XMLSignatureInput("00000000a00000000a00000000a00000000a00000000a00000000a00000000a00001010");
    java.io.InputStream var12 = var11.getOctetStream();
    var0.load(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.Init.readUserConfiguration(var12);
      fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "ApacheXML version 1.0"+ "'", var7.equals("ApacheXML version 1.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test154"); }


    org.apache.xml.security.exceptions.XMLSecurityException var3 = new org.apache.xml.security.exceptions.XMLSecurityException("0000");
    org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException var4 = new org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException("003400200000", (java.lang.Exception)var3);
    org.apache.xml.security.c14n.InvalidCanonicalizerException var5 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("AAAAAAAAAGQ=", (java.lang.Exception)var4);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test155"); }


    org.apache.xml.security.keys.provider.ApacheKeyStore var0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("No message with ID \"0000: FF FF FF FF                                        ....\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test156"); }


    org.apache.xml.security.transforms.implementations.TransformXPath var0 = new org.apache.xml.security.transforms.implementations.TransformXPath();
    boolean var1 = var0.wantsNodeSet();
    boolean var2 = var0.returnsOctetStream();
    boolean var3 = var0.wantsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test157"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.c14n.Canonicalizer var1 = org.apache.xml.security.c14n.Canonicalizer.getInstance("No message with ID \"414451410A494141410A\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
      fail("Expected exception of type org.apache.xml.security.c14n.InvalidCanonicalizerException");
    } catch (org.apache.xml.security.c14n.InvalidCanonicalizerException e) {
      // Expected exception.
    }

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test158"); }


    org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments var0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments();
    boolean var1 = var0.engineGetIncludeComments();
    org.apache.xml.security.utils.HelperNodeList var3 = new org.apache.xml.security.utils.HelperNodeList(false);
    int var4 = var3.getLength();
    byte[] var5 = var0.engineCanonicalizeXPathNodeSet((org.w3c.dom.NodeList)var3);
    org.apache.xml.security.utils.HelperNodeList var6 = new org.apache.xml.security.utils.HelperNodeList();
    org.w3c.dom.Document var7 = var6.getOwnerDocument();
    int var8 = var6.getLength();
    byte[] var10 = var0.engineCanonicalizeXPathNodeSet((org.w3c.dom.NodeList)var6, "No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    java.util.Set var12 = org.apache.xml.security.transforms.params.InclusiveNamespaces.prefixStr2Set("0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var13 = var0.engineCanonicalizeXPathNodeSet(var12);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test159"); }


    char[] var0 = new char[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.xml.security.utils.HexDump.setBitDigits(var0);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test160"); }


    org.apache.xml.security.transforms.implementations.TransformC14NExclusive var0 = new org.apache.xml.security.transforms.implementations.TransformC14NExclusive();
    boolean var1 = var0.wantsNodeSet();
    boolean var2 = var0.wantsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test161"); }


    java.lang.Object[] var8 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var9 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var8);
    org.apache.xml.security.transforms.TransformationException var11 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var12 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var8, (java.lang.Exception)var11);
    org.apache.xml.security.transforms.TransformationException var13 = new org.apache.xml.security.transforms.TransformationException("\u00FF", var8);
    java.lang.Object[] var19 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var20 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var19);
    org.apache.xml.security.transforms.TransformationException var22 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var23 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var19, (java.lang.Exception)var22);
    org.apache.xml.security.signature.ReferenceNotInitializedException var24 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00000000 00000000", var19);
    org.apache.xml.security.keys.storage.StorageResolverException var25 = new org.apache.xml.security.keys.storage.StorageResolverException("0000: 01                                                 .\r\n", var19);
    org.apache.xml.security.signature.XMLSignatureException var26 = new org.apache.xml.security.signature.XMLSignatureException("BC", var8, (java.lang.Exception)var25);
    org.apache.xml.security.exceptions.XMLSecurityException var30 = new org.apache.xml.security.exceptions.XMLSecurityException("No message with ID \"68 69 21 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    java.lang.Throwable[] var31 = var30.getSuppressed();
    org.apache.xml.security.exceptions.XMLSecurityException var33 = new org.apache.xml.security.exceptions.XMLSecurityException("No message with ID \"68 69 21 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    org.apache.xml.security.exceptions.XMLSecurityException var34 = new org.apache.xml.security.exceptions.XMLSecurityException("0000: 01                                                 .\r\n", (java.lang.Object[])var31, (java.lang.Exception)var33);
    org.apache.xml.security.signature.InvalidSignatureValueException var35 = new org.apache.xml.security.signature.InvalidSignatureValueException("org.apache.xml.security.signature.XMLSignatureException: No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.keys.storage.StorageResolverException: No message with ID \"0000: 01                                                 .\r\n\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", (java.lang.Exception)var33);
    org.apache.xml.security.exceptions.Base64DecodingException var36 = new org.apache.xml.security.exceptions.Base64DecodingException("0000: FF FF FF FF                                        ....\r\n", var8, (java.lang.Exception)var33);
    org.apache.xml.security.signature.InvalidDigestValueException var38 = new org.apache.xml.security.signature.InvalidDigestValueException("");
    org.apache.xml.security.exceptions.XMLSecurityException var39 = new org.apache.xml.security.exceptions.XMLSecurityException("No message with ID \"4E6F206D657373616765207769746820494420224E6F206D6573736167652077697468204944202230303030303030302030303030303030302220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C7365637572697479222220666F756E6420696E207265736F757263652062756E646C6520226F72672F6170616368652F786D6C2F73656375726974792F7265736F757263652F786D6C736563757269747922\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.keys.keyresolver.KeyResolverException and message No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.transforms.InvalidTransformException and message Missing message string", var8, (java.lang.Exception)var38);
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var40 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("FFaFFaFFaFFa", (java.lang.Exception)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test162"); }


    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES128_BC var0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES128_BC();
    int var1 = var0.engineGetBlockSize();
    java.lang.String var2 = var0.getRequiredProviderName();
    java.lang.String var3 = var0.getImplementedAlgorithmURI();
    boolean var4 = var0.getRequiredProviderAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "BC"+ "'", var2.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "http://www.w3.org/2001/04/xmlenc#aes128-cbc"+ "'", var3.equals("http://www.w3.org/2001/04/xmlenc#aes128-cbc"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test163"); }


    org.apache.xml.security.utils.resolver.implementations.ResolverXPointer var3 = new org.apache.xml.security.utils.resolver.implementations.ResolverXPointer();
    var3.engineSetProperty("Xerces-J 2.0.0", "BC");
    org.apache.xml.security.utils.resolver.ResourceResolver var7 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)var3);
    org.apache.xml.security.utils.resolver.ResourceResolver var8 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)var3);
    java.lang.String[] var9 = var8.getPropertyKeys();
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var10 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", (java.lang.Object[])var9);
    java.lang.Object[] var22 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var23 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var22);
    org.apache.xml.security.transforms.TransformationException var25 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var26 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var22, (java.lang.Exception)var25);
    org.apache.xml.security.transforms.TransformationException var27 = new org.apache.xml.security.transforms.TransformationException("\u00FF", var22);
    java.lang.Object[] var33 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var34 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var33);
    org.apache.xml.security.transforms.TransformationException var36 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var37 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var33, (java.lang.Exception)var36);
    org.apache.xml.security.signature.ReferenceNotInitializedException var38 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00000000 00000000", var33);
    org.apache.xml.security.keys.storage.StorageResolverException var39 = new org.apache.xml.security.keys.storage.StorageResolverException("0000: 01                                                 .\r\n", var33);
    org.apache.xml.security.signature.XMLSignatureException var40 = new org.apache.xml.security.signature.XMLSignatureException("BC", var22, (java.lang.Exception)var39);
    java.lang.Object[] var46 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var47 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var46);
    org.apache.xml.security.transforms.TransformationException var49 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var50 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var46, (java.lang.Exception)var49);
    org.apache.xml.security.signature.ReferenceNotInitializedException var51 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00000000 00000000", var46);
    java.lang.Object[] var55 = new java.lang.Object[] { (-1L)};
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException var56 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("hi!", var55);
    org.apache.xml.security.transforms.TransformationException var58 = new org.apache.xml.security.transforms.TransformationException("00000000 00000000");
    org.apache.xml.security.exceptions.Base64DecodingException var59 = new org.apache.xml.security.exceptions.Base64DecodingException("Xerces-J 2.0.0", var55, (java.lang.Exception)var58);
    org.apache.xml.security.keys.keyresolver.KeyResolverException var60 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("FFaFFaFFaFFa", var46, (java.lang.Exception)var58);
    org.apache.xml.security.transforms.TransformationException var61 = new org.apache.xml.security.transforms.TransformationException("0000: 01                                                 .\r\n", var22, (java.lang.Exception)var58);
    org.apache.xml.security.transforms.TransformationException var62 = new org.apache.xml.security.transforms.TransformationException("00001010", var22);
    org.apache.xml.security.transforms.InvalidTransformException var63 = new org.apache.xml.security.transforms.InvalidTransformException("No message with ID \"0000000000000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", var22);
    java.lang.String var64 = org.apache.xml.security.utils.I18n.translate("/////w==", var22);
    org.apache.xml.security.transforms.TransformationException var65 = new org.apache.xml.security.transforms.TransformationException("org.apache.xml.security.keys.keyresolver.KeyResolverException: No message with ID \"FFaFFaFFaFFa\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.transforms.TransformationException: No message with ID \"00000000 00000000\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", var22);
    org.apache.xml.security.keys.keyresolver.KeyResolverException var66 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("000A", (java.lang.Exception)var65);
    org.apache.xml.security.signature.XMLSignatureException var67 = new org.apache.xml.security.signature.XMLSignatureException("No message with ID \"0000: 30 30 30 30 30 30 30 30   30 30 30 30 30 30 30 30  0000000000000000\\d\\a\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.exceptions.XMLSecurityException and message No message with ID \"0000: 01                                                 .\\d\\a\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", (java.lang.Object[])var9, (java.lang.Exception)var65);
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException var68 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("0000: 00 34 00 20 00 00                                  .4. ..\r\n", (java.lang.Object[])var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "No message with ID \"/////w==\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var64.equals("No message with ID \"/////w==\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test164"); }


    java.lang.Object[] var5 = new java.lang.Object[] { (short)10};
    org.apache.xml.security.signature.InvalidDigestValueException var6 = new org.apache.xml.security.signature.InvalidDigestValueException("\u00FF", var5);
    org.apache.xml.security.c14n.CanonicalizationException var7 = new org.apache.xml.security.c14n.CanonicalizationException("0000: 36 38 20 36 39 20 32 31   20                       68 69 21 \r\n", var5);
    org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException var8 = new org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException("ds", var5);
    java.lang.String var9 = org.apache.xml.security.utils.I18n.getExceptionMessage("No message with ID \"http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "No message with ID \"No message with ID \"http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", var9.equals("No message with ID \"No message with ID \"http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test165"); }


    boolean var1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsRelative("         aa  a  ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

}

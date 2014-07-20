/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.security;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.corefoundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Security")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SecKey/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SecKeyPtr extends Ptr<SecKey, SecKeyPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(SecKey.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SecKey() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalValue(symbol="kSecPrivateKeyAttrs", optional=true)
    public static native CFType PrivateKeyAttrs();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalValue(symbol="kSecPublicKeyAttrs", optional=true)
    public static native CFType PublicKeyAttrs();
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Bridge(symbol="SecKeyGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Bridge(symbol="SecKeyGeneratePair", optional=true)
    public static native int generatePair(CFDictionary parameters, SecKey.SecKeyPtr publicKey, SecKey.SecKeyPtr privateKey);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Bridge(symbol="SecKeyRawSign", optional=true)
    public native int rawSign(SecPadding padding, BytePtr dataToSign, @MachineSizedUInt long dataToSignLen, BytePtr sig, MachineSizedUIntPtr sigLen);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Bridge(symbol="SecKeyRawVerify", optional=true)
    public native int rawVerify(SecPadding padding, BytePtr signedData, @MachineSizedUInt long signedDataLen, BytePtr sig, @MachineSizedUInt long sigLen);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Bridge(symbol="SecKeyEncrypt", optional=true)
    public native int encrypt(SecPadding padding, BytePtr plainText, @MachineSizedUInt long plainTextLen, BytePtr cipherText, MachineSizedUIntPtr cipherTextLen);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Bridge(symbol="SecKeyDecrypt", optional=true)
    public native int decrypt(SecPadding padding, BytePtr cipherText, @MachineSizedUInt long cipherTextLen, BytePtr plainText, MachineSizedUIntPtr plainTextLen);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Bridge(symbol="SecKeyGetBlockSize", optional=true)
    public native @MachineSizedUInt long getBlockSize();
    /*</methods>*/
}

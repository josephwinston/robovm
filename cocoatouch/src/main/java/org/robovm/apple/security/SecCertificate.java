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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SecCertificate/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SecCertificatePtr extends Ptr<SecCertificate, SecCertificatePtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(SecCertificate.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SecCertificate() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="kSecPropertyTypeTitle", optional=true)
    public static native CFType PropertyTypeTitle();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="kSecPropertyTypeError", optional=true)
    public static native CFType PropertyTypeError();
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Bridge(symbol="SecCertificateGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Bridge(symbol="SecCertificateCreateWithData", optional=true)
    public static native SecCertificate createWithData(CFAllocator allocator, CFData data);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Bridge(symbol="SecCertificateCopyData", optional=true)
    public native CFData copyData();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Bridge(symbol="SecCertificateCopySubjectSummary", optional=true)
    public native CFString copySubjectSummary();
    /*</methods>*/
}

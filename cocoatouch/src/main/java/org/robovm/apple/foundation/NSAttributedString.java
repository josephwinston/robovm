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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 3.2 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSAttributedString/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class NSAttributedStringPtr extends Ptr<NSAttributedString, NSAttributedStringPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSAttributedString.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSAttributedString() {}
    protected NSAttributedString(SkipInit skipInit) { super(skipInit); }
    public NSAttributedString(String str) { super((SkipInit) null); initObject(initWithString$(str)); }
    public NSAttributedString(String str, NSDictionary<NSString, ?> attrs) { super((SkipInit) null); initObject(initWithString$attributes$(str, attrs)); }
    public NSAttributedString(NSAttributedString attrStr) { super((SkipInit) null); initObject(initWithAttributedString$(attrStr)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof NSAttributedString)) {
            return false;
        }
        return isEqualToAttributedString$((NSAttributedString) obj);
    }
    
    /*<methods>*/
    @Method(selector = "string")
    public native String getString();
    @Method(selector = "attributesAtIndex:effectiveRange:")
    public native NSDictionary<?, ?> getAttributes(@MachineSizedUInt long location, NSRange range);
    @Method(selector = "length")
    public native @MachineSizedUInt long getLength();
    @Method(selector = "attribute:atIndex:effectiveRange:")
    public native NSObject getAttribute(NSString attrName, @MachineSizedUInt long location, NSRange range);
    @Method(selector = "attributedSubstringFromRange:")
    public native NSAttributedString substring(@ByVal NSRange range);
    @Method(selector = "attributesAtIndex:longestEffectiveRange:inRange:")
    public native NSDictionary<?, ?> getAttributes(@MachineSizedUInt long location, NSRange range, @ByVal NSRange rangeLimit);
    @Method(selector = "attribute:atIndex:longestEffectiveRange:inRange:")
    public native NSObject getAttribute(NSString attrName, @MachineSizedUInt long location, NSRange range, @ByVal NSRange rangeLimit);
    @Method(selector = "isEqualToAttributedString:")
    protected native boolean isEqualToAttributedString$(NSAttributedString other);
    @Method(selector = "initWithString:")
    protected native @Pointer long initWithString$(String str);
    @Method(selector = "initWithString:attributes:")
    protected native @Pointer long initWithString$attributes$(String str, NSDictionary<NSString, ?> attrs);
    @Method(selector = "initWithAttributedString:")
    protected native @Pointer long initWithAttributedString$(NSAttributedString attrStr);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Method(selector = "enumerateAttributesInRange:options:usingBlock:")
    public native void enumerateAttributes(@ByVal NSRange enumerationRange, NSAttributedStringEnumerationOptions opts, @Block("(,@ByVal,)") VoidBlock3<NSDictionary<NSString, ?>, NSRange, BytePtr> block);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Method(selector = "enumerateAttribute:inRange:options:usingBlock:")
    public native void enumerateAttribute(NSString attrName, @ByVal NSRange enumerationRange, NSAttributedStringEnumerationOptions opts, @Block("(,@ByVal,)") VoidBlock3<NSObject, NSRange, BytePtr> block);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    /*</methods>*/
}

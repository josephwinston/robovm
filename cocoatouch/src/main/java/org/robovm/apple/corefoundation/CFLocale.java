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
package org.robovm.apple.corefoundation;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreFoundation")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFLocale/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CFLocalePtr extends Ptr<CFLocale, CFLocalePtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CFLocale.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CFLocale() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="CFLocaleGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    @Bridge(symbol="CFLocaleGetSystem", optional=true)
    public static native CFLocale getSystem();
    @Bridge(symbol="CFLocaleCopyCurrent", optional=true)
    public static native CFLocale copyCurrent();
    @Bridge(symbol="CFLocaleCopyAvailableLocaleIdentifiers", optional=true)
    public static native CFArray copyAvailableLocaleIdentifiers();
    @Bridge(symbol="CFLocaleCopyISOLanguageCodes", optional=true)
    public static native CFArray copyISOLanguageCodes();
    @Bridge(symbol="CFLocaleCopyISOCountryCodes", optional=true)
    public static native CFArray copyISOCountryCodes();
    @Bridge(symbol="CFLocaleCopyISOCurrencyCodes", optional=true)
    public static native CFArray copyISOCurrencyCodes();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Bridge(symbol="CFLocaleCopyCommonISOCurrencyCodes", optional=true)
    public static native CFArray copyCommonISOCurrencyCodes();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Bridge(symbol="CFLocaleCopyPreferredLanguages", optional=true)
    public static native CFArray copyPreferredLanguages();
    @Bridge(symbol="CFLocaleCreateCanonicalLanguageIdentifierFromString", optional=true)
    public static native CFString createCanonicalLanguageIdentifierFromString(CFAllocator allocator, CFString localeIdentifier);
    @Bridge(symbol="CFLocaleCreateCanonicalLocaleIdentifierFromString", optional=true)
    public static native CFString createCanonicalLocaleIdentifierFromString(CFAllocator allocator, CFString localeIdentifier);
    @Bridge(symbol="CFLocaleCreateCanonicalLocaleIdentifierFromScriptManagerCodes", optional=true)
    public static native CFString createCanonicalLocaleIdentifierFromScriptManagerCodes(CFAllocator allocator, short lcode, short rcode);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="CFLocaleCreateLocaleIdentifierFromWindowsLocaleCode", optional=true)
    public static native CFString createLocaleIdentifierFromWindowsLocaleCode(CFAllocator allocator, int lcid);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="CFLocaleGetWindowsLocaleCodeFromLocaleIdentifier", optional=true)
    public static native int getWindowsLocaleCodeFromLocaleIdentifier(CFString localeIdentifier);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="CFLocaleGetLanguageCharacterDirection", optional=true)
    public static native CFLocaleLanguageDirection getLanguageCharacterDirection(CFString isoLangCode);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="CFLocaleGetLanguageLineDirection", optional=true)
    public static native CFLocaleLanguageDirection getLanguageLineDirection(CFString isoLangCode);
    @Bridge(symbol="CFLocaleCreateComponentsFromLocaleIdentifier", optional=true)
    public static native CFDictionary createComponentsFromLocaleIdentifier(CFAllocator allocator, CFString localeID);
    @Bridge(symbol="CFLocaleCreateLocaleIdentifierFromComponents", optional=true)
    public static native CFString createLocaleIdentifierFromComponents(CFAllocator allocator, CFDictionary dictionary);
    @Bridge(symbol="CFLocaleCreate", optional=true)
    public static native CFLocale create(CFAllocator allocator, CFString localeIdentifier);
    @Bridge(symbol="CFLocaleCreateCopy", optional=true)
    public static native CFLocale createCopy(CFAllocator allocator, CFLocale locale);
    @Bridge(symbol="CFLocaleGetIdentifier", optional=true)
    public native CFString getIdentifier();
    @Bridge(symbol="CFLocaleGetValue", optional=true)
    public native CFType getValue(CFString key);
    @Bridge(symbol="CFLocaleCopyDisplayNameForPropertyValue", optional=true)
    public native CFString copyDisplayNameForPropertyValue(CFString key, CFString value);
    /*</methods>*/
}

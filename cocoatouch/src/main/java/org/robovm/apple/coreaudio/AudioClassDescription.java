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
package org.robovm.apple.coreaudio;

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
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AudioClassDescription/*</name>*/ 
    extends /*<extends>*/Struct<AudioClassDescription>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AudioClassDescriptionPtr extends Ptr<AudioClassDescription, AudioClassDescriptionPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AudioClassDescription() {}
    public AudioClassDescription(int mType, int mSubType, int mManufacturer) {
        this.mType(mType);
        this.mSubType(mSubType);
        this.mManufacturer(mManufacturer);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int mType();
    @StructMember(0) public native AudioClassDescription mType(int mType);
    @StructMember(1) public native int mSubType();
    @StructMember(1) public native AudioClassDescription mSubType(int mSubType);
    @StructMember(2) public native int mManufacturer();
    @StructMember(2) public native AudioClassDescription mManufacturer(int mManufacturer);
    /*</members>*/
    /*<methods>*//*</methods>*/
}

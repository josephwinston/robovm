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
package org.robovm.apple.mapkit;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 3.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MapKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKPlacemark/*</name>*/ 
    extends /*<extends>*/CLPlacemark/*</extends>*/ 
    /*<implements>*/implements MKAnnotation/*</implements>*/ {

    /*<ptr>*/public static class MKPlacemarkPtr extends Ptr<MKPlacemark, MKPlacemarkPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MKPlacemark.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MKPlacemark() {}
    protected MKPlacemark(SkipInit skipInit) { super(skipInit); }
    public MKPlacemark(@ByVal CLLocationCoordinate2D coordinate, NSDictionary<NSString, ?> addressDictionary) { super((SkipInit) null); initObject(init(coordinate, addressDictionary)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "countryCode")
    public native String getCountryCode();
    @Property(selector = "coordinate")
    public native @ByVal CLLocationCoordinate2D getCoordinate();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "subtitle")
    public native String getSubtitle();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCoordinate:addressDictionary:")
    protected native @Pointer long init(@ByVal CLLocationCoordinate2D coordinate, NSDictionary<NSString, ?> addressDictionary);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Method(selector = "setCoordinate:")
    public native void setCoordinate(@ByVal CLLocationCoordinate2D newCoordinate);
    /*</methods>*/
}

/*
 * Copyright (c) 2015, RoboVM AB. All Rights Reserved.
 *
 * Redistribution and use is subject to the RoboVM Software License terms
 * available at (http://robovm.com)
 *
 * This notice and attribution to RoboVM AB may not be removed.
 */
package org.robovm.pods.twitter;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.accounts.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.social.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/TWTRUserSessionStore/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "saveSession:completion:")
    void saveSession(TWTRAuthSession session, @Block VoidBlock2<TWTRAuthSession, NSError> completion);
    @Method(selector = "saveSessionWithAuthToken:authTokenSecret:completion:")
    void saveSession(String authToken, String authTokenSecret, @Block VoidBlock2<TWTRAuthSession, NSError> completion);
    @Method(selector = "sessionForUserID:")
    TWTRAuthSession getSessionForUserID(String userID);
    @Method(selector = "existingUserSessions")
    @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<TWTRAuthSession> getExistingUserSessions();
    @Method(selector = "session")
    TWTRAuthSession getSession();
    @Method(selector = "logOutUserID:")
    void logOutUserID(String userID);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
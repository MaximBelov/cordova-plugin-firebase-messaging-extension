# cordova-plugin-firebase-messaging-extension
This plugin solves the problem for a Cordova application that has multiple FCM push providers.  In KOHO's case specifically, this plugin extends a Firebase messaging service for routing tokens and messages to Urban Airship and Intercom.  It can be easily modified to provide the same service for other push providers. 


# Notes

## Intercom, Urbanairship, Firebasex
 
- cordova-plugin-intercom "^8.0.0"
- urbanairship-cordova "^10.0.0"
- cordova-plugin-firebasex "7.0.1"

### Extra plugins
- cordova-android "8.1.0"
- cordova-ios": "5.1.1"
- cordova-plugin-androidx "1.0.2",
- cordova-plugin-androidx-adapter "1.1.0"
- cordova-android-firebase-gradle-release 4.0.0"
- cordova-android-play-services-gradle-release "4.0.0"
- cordova-android-support-gradle-release "3.0.1"

#### Building for Android:

#####  Urbanairship
- uaSkipApplyGoogleServicesPlugin
https://github.com/urbanairship/urbanairship-cordova/blob/master/src/android/build-extras.gradle#L41

`ionic cordova build android --verbose --buildConfig=build.json -- -- --gradleArg=-PuaSkipApplyGoogleServicesPlugin=false`

##### Intercom 
<preference name="intercom-android-push-type" value="FCM-WITHOUT-BUILD-PLUGIN"/>

# Solution for cordova-plugin-intercom 7.1 and urbanairship-cordova 7.6
[Original plugin](https://github.com/kohofinancial/cordova-plugin-firebase-messaging-extension)

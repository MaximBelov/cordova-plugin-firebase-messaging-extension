# cordova-plugin-firebase-messaging-extension

## Why this fork exists

Forked from [kohofinancial/cordova-plugin-firebase-messaging-extension](https://github.com/kohofinancial/cordova-plugin-firebase-messaging-extension)
(now archived/unmaintained). npm: [cordova-plugin-firebase-messaging-extension](https://www.npmjs.com/package/cordova-plugin-firebase-messaging-extension).

Diff summary vs upstream:
- Migrated off the deprecated Airship `AirshipFirebaseInstanceIdService`/`AirshipFirebaseMessagingService`
  classes to `AirshipFirebaseIntegration`, including calling its `isAirshipPush`/`processMessageSync`
  correctly as instance methods (`AirshipFirebaseIntegration.INSTANCE.*`) against newer Airship SDK
  versions, where they're Kotlin `object` members rather than `@JvmStatic`.
- Dropped the hard-pinned `FIREBASE_CORE_VERSION`/`FIREBASE_MESSAGING_VERSION` preferences and the
  `cordova-support-google-services`/`cordova-plugin-intercom`/`urbanairship-cordova` plugin
  dependency declarations, so this plugin doesn't fight the consuming app's own version management.
- Added `android:exported="false"` and an explicit intent-filter priority to the FCM service
  declaration (required by newer Android targetSdk versions).
- Publishes via npm Trusted Publishers (OIDC), no long-lived token.

This plugin solves the problem for a Cordova application with multiple FCM push providers.  

This plugin extends a Firebase messaging service for routing tokens and messages to Urban Airship and Intercom. 

It can be easily modified to provide the same service for other push providers. 

## Installation

```bash
cordova plugin add cordova-plugin-firebase-messaging-extension
```

## Required companion plugins

- cordova-plugin-intercom
- @ua/cordova-airship
- cordova-plugin-firebasex

## Update config.xml 
`<preference name="intercom-android-push-type" value="FCM-WITHOUT-BUILD-PLUGIN"/>`

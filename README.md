# cordova-plugin-firebase-messaging-extension
This plugin solves the problem for a Cordova application that has multiple FCM push providers.  

This plugin extends a Firebase messaging service for routing tokens and messages to Urban Airship and Intercom. 

It can be easily modified to provide the same service for other push providers. 

# You can use it with c Intercom, Urbanairship, Firebasex
 
Plugins: 
- cordova-plugin-intercom
- @ua/cordova-airship
- cordova-plugin-firebasex

## Update config.xml 
`<preference name="intercom-android-push-type" value="FCM-WITHOUT-BUILD-PLUGIN"/>`

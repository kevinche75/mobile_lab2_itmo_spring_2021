package com.example.lab2_belyakov.data

import com.example.lab2_belyakov.R

object DataStorage {

    fun getVersionsList(): List<Android> {
        return listOf(
                Android(
                        "Cupcake",
                        R.drawable.cupcake,
                        "27-04-2009",
                        "Support for third-party virtual keyboards with text prediction and a user dictionary for custom words.\n" +
                                "Support for Widgets – miniature application views that can be embedded in other applications (such as the Home screen) and receive periodic updates.[52]\n" +
                                "Video recording and playback in MPEG-4 and 3GP formats.\n" +
                                "Auto-pairing and stereo support for Bluetooth (A2DP and AVRCP profiles).\n" +
                                "Copy and paste features in web browser.\n" +
                                "User pictures shown for Favorites in Contacts.\n" +
                                "Specific date/time stamp shown for events in call log, and one-touch access to a contact card from a call log event.\n" +
                                "Animated screen transitions.\n" +
                                "Auto-rotation option.\n" +
                                "New stock boot animation.\n" +
                                "Ability to upload videos to YouTube.\n" +
                                "Ability to upload photos to Picasa.\n" +
                                "Ability to check phone usage history."
                ),

                Android(
                        "Donut",
                        R.drawable.donut,
                        "15-09-2009",
                        "Voice and text entry search enhanced to include bookmark history, contacts, and the web.\n" +
                                "Ability for developers to include their content in search results.\n" +
                                "Multi-lingual speech synthesis engine to allow any Android application to \"speak\" a string of text.\n" +
                                "Easier searching and the ability to view app screenshots in Android Market.\n" +
                                "Gallery, Camera and camcorder more fully integrated, with faster camera access.\n" +
                                "Ability for users to select multiple photos for deletion.\n" +
                                "Updated technology support for CDMA/EVDO, 802.1x, VPNs, and a text-to-speech engine.\n" +
                                "Support for WVGA screen resolutions.\n" +
                                "Speed improvements in searching and camera applications.\n" +
                                "Expanded Gesture framework and a new GestureBuilder development tool."
                ),

                Android(
                        "Eclair",
                        R.drawable.eclair,
                        "26-10-2009",
                        "Expanded Account sync, allowing users to add multiple accounts to a device for synchronization of an email and contacts.\n" +
                                "Microsoft Exchange email support, with a combined inbox to browse an email from multiple accounts in one page.\n" +
                                "Bluetooth 2.1 support.\n" +
                                "Ability to tap a Contacts photo and select to call, SMS, or email the person.\n" +
                                "Ability to search all saved SMS and MMS messages, with the added ability to delete the oldest messages in a conversation automatically deleted when a defined limit is reached.\n" +
                                "Numerous new camera features, including flash support, digital zoom, scene mode, white balance, color effect and macro focus.\n" +
                                "Improved typing speed on a virtual keyboard, with a smarter dictionary that learns from word usage and includes contact names as suggestions.\n" +
                                "Refreshed browser UI with bookmark thumbnails, double-tap zoom and support for HTML5.\n" +
                                "Calendar agenda view enhanced, showing attending status for each invitee, and the ability to invite new guests to events.\n" +
                                "Optimized hardware speed and revamped UI.\n" +
                                "Support for more screen sizes and resolutions, with better contrast ratio.\n" +
                                "Improved Google Maps 3.1.2.\n" +
                                "MotionEvent class enhanced to track multi-touch events.\n" +
                                "Addition of live wallpapers, allowing the animation of home-screen background images to show movement"
                ),

                Android(
                        "Froyo",
                        R.drawable.froyo,
                        "20-05-2010",
                        "Speed, memory, and performance optimizations.[64]\n" +
                                "Additional application speed improvements, implemented through JIT compilation.[65]\n" +
                                "Integration of Chrome's V8 JavaScript engine into the Browser application.\n" +
                                "Support for the Android Cloud to Device Messaging (C2DM) service, enabling push notifications.\n" +
                                "Improved Microsoft Exchange support, including security policies, auto-discovery, GAL look-up, calendar synchronization and remote wipe.[66]\n" +
                                "Improved application launcher with shortcuts to Phone and Browser applications.\n" +
                                "USB tethering and Wi-Fi hotspot functionality[67]\n" +
                                "Option to disable data access over a mobile network.\n" +
                                "Updated Market application with batch and automatic update features.[64]\n" +
                                "Quick switching between multiple keyboard languages and their dictionaries.\n" +
                                "Support for Bluetooth-enabled car and desk docks.\n" +
                                "Support for numeric and alphanumeric passwords.\n" +
                                "Support for file upload fields in the Browser application.[68]\n" +
                                "The browser now shows all frames of animated GIFs instead of just the first frame only.\n" +
                                "Support for installing applications to expandable memory.\n" +
                                "Adobe Flash support.[69]\n" +
                                "Support for high-PPI displays (up to 320 ppi), such as four-inch 720p screens.[70]\n" +
                                "Gallery allows users to view picture stacks using a zoom gesture."
                ),

                Android(
                        "Gingerbread",
                        R.drawable.gingerbread,
                        "06-12-2010",
                        "Updated user interface design with increased simplicity and speed.\n" +
                                "Support for extra-large screen sizes and resolutions (WXGA and higher).[70]\n" +
                                "Native support for SIP VoIP internet telephones.\n" +
                                "Faster, more intuitive text input on a virtual keyboard, with improved accuracy, better suggested text and voice input mode.\n" +
                                "Enhanced copy/paste functionality, allowing users to select a word by press-holding, copying, and pasting.\n" +
                                "Support for Near Field Communication (NFC), allowing the user to read an NFC tag embedded in a poster, sticker, or advertisement.\n" +
                                "New audio effects such as reverb, equalization, headphone virtualization, and bass boost.\n" +
                                "New Download Manager, giving users easy access to any file downloaded from the browser, email, or another application.\n" +
                                "Support for multiple cameras on the device, including a front-facing camera, if available.\n" +
                                "Support for WebM/VP8 video playback, and AAC audio encoding.\n" +
                                "Improved power management with a more active role in managing applications that are keeping the device awake for too long.\n" +
                                "Enhanced support for native code development.\n" +
                                "Switched from YAFFS to ext4 on newer devices.[75][76]\n" +
                                "Audio, graphical, and input enhancements for game developers.\n" +
                                "Concurrent garbage collection for increased performance.\n" +
                                "Native support for more sensors (such as gyroscopes and barometers).\n" +
                                "First Android version to feature an Easter egg. It was an image of the Bugdroid standing next to a zombie gingerbread man, with many more zombies in the background."
                ),

                Android(
                        "Honeycomb",
                        R.drawable.honeycomb,
                        "22-02-2011",
                        "Optimized tablet support with a new “holographic” user interface (removed again the following year with version 4.2).[92]\n" +
                                "New Easter egg, an image of a Tron-themed bumblebee.\n" +
                                "Added System Bar, featuring quick access to notifications, status, and soft navigation buttons, available at the bottom of the screen.\n" +
                                "Added the Action Bar, giving access to contextual options, navigation, widgets, or other types of content at the top of the screen.\n" +
                                "Simplified multitasking – tapping Recent Applications in the System Bar allows users to see snapshots of the tasks underway and quickly jump from one application to another.\n" +
                                "Redesigned the keyboard, making typing fast, efficient and accurate on larger screen sizes\n" +
                                "Simplified, more intuitive copy/paste interface.\n" +
                                "Multiple browser tabs replacing browser windows, plus form auto-fill and a new “incognito” mode allowing somewhat anonymous browsing.\n" +
                                "Quick access to camera exposure, focus, flash, zoom, front-facing camera, time-lapse, and other camera features.\n" +
                                "Ability to view albums and other collections in full-screen mode in Gallery, with easy access to thumbnails for other photos.\n" +
                                "New two-pane Contacts UI and Fast Scroll to let users easily organize and locate contacts.\n" +
                                "New two-pane Email UI to make viewing and organizing messages more efficient, allowing users to select one or more messages.\n" +
                                "Hardware acceleration.\n" +
                                "Support for multi-core processors.\n" +
                                "Ability to encrypt all user data.\n" +
                                "HTTPS stack improved with Server Name Indication (SNI).\n" +
                                "Filesystem in Userspace (FUSE; kernel module).\n"
                ),

                Android(
                        "Jelly Bean",
                        R.drawable.jelly,
                        "09-07-2012",
                        "Vsync timing across all drawing and animation done by the Android framework, including application rendering, touch events, screen composition and display refresh.\n" +
                                "Triple buffering in the graphics pipeline.\n" +
                                "CPU input boost.\n" +
                                "Synchronizing touch to vsync timing.\n" +
                                "Enhanced accessibility.\n" +
                                "Bi-directional text and other language support.\n" +
                                "User-installable keyboard maps.\n" +
                                "Expandable notifications.\n" +
                                "TLS v1.1 and v1.2 support added.\n" +
                                "Ability to turn off notifications on an application-specific basis.\n" +
                                "Shortcuts and widgets can automatically be re-arranged or re-sized to allow new items to fit on home screens.\n" +
                                "Bluetooth data transfer for Android Beam.\n" +
                                "Tablets with smaller screens now use an expanded version of the interface layout and home screen used by phones.[119]\n" +
                                "Improved camera application.\n" +
                                "Multichannel audio.[117]\n" +
                                "The Fraunhofer FDK AAC codec becomes standard in Android, adding AAC 5.1 channel encoding/decoding.\n" +
                                "USB audio (for external sound DACs).[117]\n" +
                                "Audio chaining (also known as gapless playback).[117][120][121]\n" +
                                "Ability for other launchers to add widgets from the application drawer without requiring root access."
                ),

                Android(
                        "Kitkat",
                        R.drawable.kitkat,
                        "31-10-2013",
                        "Refreshed interface with white elements instead of blue.\n" +
                                "Clock no longer shows bold hours; all digits are thin. The H, M, and S markings for the stopwatch and timer have been removed, leaving just the numbers.\n" +
                                "Ability for applications to trigger translucency in the navigation and status bars.[157]\n" +
                                "Ability for applications to use \"immersive mode\" to keep the navigation and status bars hidden while maintaining user interaction.[158]\n" +
                                "Action overflow menu buttons are always visible, even on devices with a \"Menu\" key, which was officially deprecated by Android 4.0.[159]\n" +
                                "Write access disabled for user-installed applications on external storage (i.e. MicroSD), except for their own directories inside Android/data.[160][161]\n" +
                                "Purging of app data directories in user storage (internal user storage and MicroSD) upon uninstallation[161]\n" +
                                "Optimizations for performance on devices with lower specifications, including zRAM support and \"low RAM\" device API.[153]\n" +
                                "Wireless printing capability.[153]\n" +
                                "NFC host card emulation, enabling a device to replace smart cards.[153]\n" +
                                "WebViews are now based on the Chromium engine (feature parity with Chrome for Android 30).\n" +
                                "Expanded functionality for notification listener services.[153]\n" +
                                "Public API for developing and managing text messaging clients.[162]\n" +
                                "Storage Access Framework, an API allowing apps to retrieve files in a consistent manner. As part of the framework, a new system file picker allows users to access files from various sources (including those exposed by apps, such as online storage services).[93]\n" +
                                "New framework for UI transitions.\n" +
                                "Sensor batching, step detector and counter APIs.[153]\n" +
                                "Settings application now makes it possible to select default text messaging and the home (launcher) application.\n" +
                                "Audio tunneling, audio monitoring and loudness enhancer.[163]\n" +
                                "Built-in screen recording feature (primarily for developers, as usage of ADB is required).[164]\n" +
                                "Native infrared blaster API.\n" +
                                "Verified boot.\n" +
                                "Enforcing SELinux.\n" +
                                "Expanded accessibility APIs and system-level closed captioning settings.\n" +
                                "Android Runtime (ART) introduced as a new experimental application runtime environment, not enabled by default, as a replacement for the Dalvik virtual machine.[165]\n" +
                                "Bluetooth Message Access Profile (MAP) support.[166]\n" +
                                "Disabled access to battery statistics by third-party applications.[167]\n" +
                                "Settings application no longer uses a multi-pane layout on devices with larger screens.\n" +
                                "Wi-Fi and mobile data activity (TX/RX) indicators are moved to quick settings.[168]\n" +
                                "Disables text wrapping in the WebView browser component."
                ),

                Android(
                        "Lollipop",
                        R.drawable.lollipop,
                        "12-12-2014",
                        "Android Runtime (ART) with ahead-of-time (AOT) compilation and improved garbage collection (GC), replacing Dalvik that combines bytecode interpretation with trace-based just-in-time (JIT) compilation.[188][190]\n" +
                                "Support for 64-bit CPUs.\n" +
                                "OpenGL ES 3.1 and Android Extension Pack (AEP) on supported GPU configurations.\n" +
                                "Recent activities screen with tasks instead of applications, up to a configured maximum of tasks per application.\n" +
                                "Vector drawables, which scale without losing definition.\n" +
                                "Support for print previews.\n" +
                                "Material design, bringing a restyled user interface and “ripple effect” for buttons.\n" +
                                "Refreshed lock screen, no longer supporting widgets.[191]\n" +
                                "Refreshed notification tray and quick settings pull-down.\n" +
                                "Project Volta, for battery life improvements.\n" +
                                "Searches can be performed within the system settings for quicker access to particular settings.\n" +
                                "Lock screen provides shortcuts to application and notification settings.[192]\n" +
                                "Guest logins and multiple user accounts are available on more devices, such as phones.[193]\n" +
                                "Audio input and output through USB devices.\n" +
                                "Third-party applications regain the ability to read and modify data located anywhere on external storage, such as on SD cards. However, those must be adapted to the storage access framework of Android API level 21 or higher.[194][195]\n" +
                                "Pinning of an application's screen for restricted user activity.[192]\n" +
                                "Recently used applications are remembered even after restarting the device.[192]\n" +
                                "WebViews receive updates independently through Google Play for security reasons, instead of relying on system-wide vendor updates.[196]\n" +
                                "Addition of 15 new languages: Basque, Bengali, Burmese, Chinese (Hong Kong), Galician, Icelandic, Kannada, Kyrgyz, Macedonian, Malayalam, Marathi, Nepali, Sinhala, Tamil and Telugu.[197]\n" +
                                "Tap and Go allows users to quickly migrate to a new Android device, using NFC and Bluetooth to transfer Google Account details, configuration settings, user data and installed applications.[192]\n" +
                                "A flashlight-style application is included, working on supported devices with a camera flash.[192]\n" +
                                "User-customizable priorities for application notifications.[198]\n" +
                                "Smart lock feature.[199]\n" +
                                "SELinux in enforcing mode for all domains.\n" +
                                "Updated emoji.[200]\n" +
                                "Improved accessibility support (e.g. switch access support).[201]\n" +
                                "Block-based over-the-air (OTA) updates for new devices.[202]\n" +
                                "Task listing access disabled for third-party applications"
                ),

                Android(
                        "Marshmallow",
                        R.drawable.marshmallow,
                        "15-10-2015",
                        "Android Runtime (ART) with ahead-of-time (AOT) compilation and improved garbage collection (GC), replacing Dalvik that combines bytecode interpretation with trace-based just-in-time (JIT) compilation.[188][190]\n" +
                                "Support for 64-bit CPUs.\n" +
                                "OpenGL ES 3.1 and Android Extension Pack (AEP) on supported GPU configurations.\n" +
                                "Recent activities screen with tasks instead of applications, up to a configured maximum of tasks per application.\n" +
                                "Vector drawables, which scale without losing definition.\n" +
                                "Support for print previews.\n" +
                                "Material design, bringing a restyled user interface and “ripple effect” for buttons.\n" +
                                "Refreshed lock screen, no longer supporting widgets.[191]\n" +
                                "Refreshed notification tray and quick settings pull-down.\n" +
                                "Project Volta, for battery life improvements.\n" +
                                "Searches can be performed within the system settings for quicker access to particular settings.\n" +
                                "Lock screen provides shortcuts to application and notification settings.[192]\n" +
                                "Guest logins and multiple user accounts are available on more devices, such as phones.[193]\n" +
                                "Audio input and output through USB devices.\n" +
                                "Third-party applications regain the ability to read and modify data located anywhere on external storage, such as on SD cards. However, those must be adapted to the storage access framework of Android API level 21 or higher.[194][195]\n" +
                                "Pinning of an application's screen for restricted user activity.[192]\n" +
                                "Recently used applications are remembered even after restarting the device.[192]\n" +
                                "WebViews receive updates independently through Google Play for security reasons, instead of relying on system-wide vendor updates.[196]\n" +
                                "Addition of 15 new languages: Basque, Bengali, Burmese, Chinese (Hong Kong), Galician, Icelandic, Kannada, Kyrgyz, Macedonian, Malayalam, Marathi, Nepali, Sinhala, Tamil and Telugu.[197]\n" +
                                "Tap and Go allows users to quickly migrate to a new Android device, using NFC and Bluetooth to transfer Google Account details, configuration settings, user data and installed applications.[192]\n" +
                                "A flashlight-style application is included, working on supported devices with a camera flash.[192]\n" +
                                "User-customizable priorities for application notifications.[198]\n" +
                                "Smart lock feature.[199]\n" +
                                "SELinux in enforcing mode for all domains.\n" +
                                "Updated emoji.[200]\n" +
                                "Improved accessibility support (e.g. switch access support).[201]\n" +
                                "Block-based over-the-air (OTA) updates for new devices.[202]\n" +
                                "Task listing access disabled for third-party applications"
                ),

                Android(
                        "Nougat",
                        R.drawable.nougat,
                        "22-08-2016",
                        "Android Runtime (ART) with ahead-of-time (AOT) compilation and improved garbage collection (GC), replacing Dalvik that combines bytecode interpretation with trace-based just-in-time (JIT) compilation.[188][190]\n" +
                                "Support for 64-bit CPUs.\n" +
                                "OpenGL ES 3.1 and Android Extension Pack (AEP) on supported GPU configurations.\n" +
                                "Recent activities screen with tasks instead of applications, up to a configured maximum of tasks per application.\n" +
                                "Vector drawables, which scale without losing definition.\n" +
                                "Support for print previews.\n" +
                                "Material design, bringing a restyled user interface and “ripple effect” for buttons.\n" +
                                "Refreshed lock screen, no longer supporting widgets.[191]\n" +
                                "Refreshed notification tray and quick settings pull-down.\n" +
                                "Project Volta, for battery life improvements.\n" +
                                "Searches can be performed within the system settings for quicker access to particular settings.\n" +
                                "Lock screen provides shortcuts to application and notification settings.[192]\n" +
                                "Guest logins and multiple user accounts are available on more devices, such as phones.[193]\n" +
                                "Audio input and output through USB devices.\n" +
                                "Third-party applications regain the ability to read and modify data located anywhere on external storage, such as on SD cards. However, those must be adapted to the storage access framework of Android API level 21 or higher.[194][195]\n" +
                                "Pinning of an application's screen for restricted user activity.[192]\n" +
                                "Recently used applications are remembered even after restarting the device.[192]\n" +
                                "WebViews receive updates independently through Google Play for security reasons, instead of relying on system-wide vendor updates.[196]\n" +
                                "Addition of 15 new languages: Basque, Bengali, Burmese, Chinese (Hong Kong), Galician, Icelandic, Kannada, Kyrgyz, Macedonian, Malayalam, Marathi, Nepali, Sinhala, Tamil and Telugu.[197]\n" +
                                "Tap and Go allows users to quickly migrate to a new Android device, using NFC and Bluetooth to transfer Google Account details, configuration settings, user data and installed applications.[192]\n" +
                                "A flashlight-style application is included, working on supported devices with a camera flash.[192]\n" +
                                "User-customizable priorities for application notifications.[198]\n" +
                                "Smart lock feature.[199]\n" +
                                "SELinux in enforcing mode for all domains.\n" +
                                "Updated emoji.[200]\n" +
                                "Improved accessibility support (e.g. switch access support).[201]\n" +
                                "Block-based over-the-air (OTA) updates for new devices.[202]\n" +
                                "Task listing access disabled for third-party applications"
                ),

                Android(
                        "Oreo",
                        R.drawable.oreo,
                        "21-08-2017",
                        "Project Treble, the biggest change to the foundations of Android to date: a modular architecture that makes it easier and faster for hardware makers to deliver Android updates.\n" +
                                "Picture-in-picture support.\n" +
                                "Support for Unicode 10.0 emoji (5.0) and replacement of all blob-shaped emojis by round ones with gradients and outlines.\n" +
                                "Redesigned Quick Settings and Settings with a white background and respectively black and Accent font colors.\n" +
                                "Restructured Settings by regrouping sections into similar entries.\n" +
                                "Adaptive icons\n" +
                                "Notification improvements.\n" +
                                "Notification channels.\n" +
                                "Notification dots (badges).\n" +
                                "Notification snoozing.\n" +
                                "Notification shade multi-colors (for music album art, messengers, etc.).\n" +
                                "System-wide Autofill framework.\n" +
                                "Support for AAC, Sony's LDAC and Qualcomm's aptX and aptX HD codecs.[247]\n" +
                                "App-specific unknown sources.\n" +
                                "Multi-display support.\n" +
                                "2 times faster boot time compared to Nougat according to Google, testing on their Pixel devices.[246]\n" +
                                "Apps background execution and location limits.\n" +
                                "Google Play Protect.\n" +
                                "Downloadable fonts.\n" +
                                "Integrated printing support.\n" +
                                "Color management (deep color and wide color gamut).\n" +
                                "Wi-Fi Assistant."
                ),

                Android(
                        "Pie",
                        R.drawable.pie,
                        "06-08-2018",
                        "New user interface for the quick settings menu.[254]\n" +
                                "The clock has moved to the left of the notification bar.[255]\n" +
                                "The \"dock\" now has a semi-transparent background.[255]\n" +
                                "Battery Saver no longer shows an orange overlay on the notification and status bars.[254]\n" +
                                "A \"screenshot\" button has been added to the power options.[255]\n" +
                                "A new \"Lockdown\" mode which disables biometric authentication once activated.\n" +
                                "Rounded corners across the UI.\n" +
                                "New transitions for switching between apps, or activities within apps.\n" +
                                "Richer messaging notifications, where a full conversation can be seen within a notification, full-scale images, and smart replies akin to Google's new app, Reply.\n" +
                                "Support for display cutouts.\n" +
                                "Redesigned volume slider.\n" +
                                "Battery percentage now shown in Always-On Display.\n" +
                                "Lock screen security changes include the possible return of an improved NFC Unlock.\n" +
                                "Experimental features (which are currently hidden within a menu called Feature Flags) such as a redesigned About Phone page in settings, and automatic Bluetooth enabling while driving.\n" +
                                "DNS over TLS.[256]\n" +
                                "A new optional gesture-based system interface, allowing users to navigate the OS using swipes more often than the traditional UI.\n" +
                                "Redesigned multitask app switcher with the Google search bar and app drawer built-in.\n" +
                                "Android Dashboard, which tells the user how much time they are spending on their device and in apps, and allows the user to set time limits on apps.\n" +
                                "\"Shush\", an enhanced version of Do Not Disturb mode activated by placing the phone face down, which mutes standard notifications.\n" +
                                "\"Adaptive Battery\" prediction, which makes use of Doze to hibernate user apps the OS determines the user will not use.\n" +
                                "Auto-Brightness feature modifies screen brightness based on user habits.\n" +
                                "Wind Down option lets Android users set a specific bedtime that enables Do Not Disturb and turns the entire phone's interface gray to discourage further use at night.\n" +
                                "Vulkan 1.1 support.\n" +
                                "Call recording options fully disabled"
                ),

                Android(
                        "Android 10",
                        R.drawable.android_ten,
                        "03-09-2019",
                        "Revamped full-screen gesture system with new app open/close animations.[258][259]\n" +
                                "Scoped storage restrictions[260]\n" +
                                "New permissions required to access location in background and to access photo, video and audio files.[261]\n" +
                                "Background apps can no longer jump into the foreground.[261]\n" +
                                "Limited access to non-resettable device identifiers.[261]\n" +
                                "Background (idle) access to camera, microphone and sensors disabled for more privacy protection with the side effect of disabling antitheft software.[262][263][264]\n" +
                                "Sharing shortcuts, which allow sharing content with a contact directly.[261]\n" +
                                "Floating settings panel, that allows changing system settings directly from apps.[261]\n" +
                                "Dynamic depth format for photos, which allow changing background blur after taking a photo.[261]\n" +
                                "Support for the AV1 video codec, the HDR10+ video format and the Opus audio codec.[261]\n" +
                                "Support for aptX Adaptive, LHDC, LLAC, CELT and AAC LATM codecs[265][266]\n" +
                                "A native MIDI API, allowing interaction with music controllers.[261]\n" +
                                "Better support for biometric authentication in apps.[261]\n" +
                                "Support for the WPA3 Wi-Fi security protocol.[261]\n" +
                                "Support for foldable phones.[261]\n" +
                                "Support for Notification Bubbles.[267][268]\n" +
                                "New system-wide dark theme/mode[269][270]\n" +
                                "TLS v1.3 support added.\n" +
                                "Project Mainline, allows core OS components to be updated via the Google Play Store, without requiring a complete system update"
                ),

                Android(
                        "Android 11",
                        R.drawable.android_el,
                        "08-09-2020",
                        "Chat bubbles.\n" +
                                "Screen recorder.\n" +
                                "Notification history.\n" +
                                "New permissions controls.\n" +
                                "API distinction between standalone 5G NR and non-standalone 5G.\n" +
                                "One-time permission[275]\n" +
                                "Permissions auto-reset.[275]\n" +
                                "Wireless Android Auto on devices with 5GHz Wi-Fi.[276]\n" +
                                "Increased number of updatable core OS components in Google Play from 12 to 21.[275][277]\n" +
                                "Enterprise work profile privacy protections now apply on company-owned devices."
                )
        )
    }
}

Voice Calling App

Overview

This is a voice calling application built using Kotlin and Jetpack Compose, leveraging Room Database for contact management. The app enables seamless peer-to-peer voice calls using the phone's native calling interface.

Features

Display a list of contacts on the first screen

Navigate to a detail page showing contact information

Initiate a call using the phone's native calling interface

CRUD operations (Create, Read, Update, Delete) for managing contacts

Simple and clean UI with Jetpack Compose

Tech Stack

Language: Kotlin

Architecture: Clean Architecture (MVVM)

UI Framework: Jetpack Compose

Data Storage: Room Database

Dependency Injection: Hilt (if used)

State Management: ViewModel & LiveData/StateFlow

Prerequisites

Android Studio: Ensure you have the latest version installed.

Kotlin and Jetpack Compose Setup: Enable Compose in your build.gradle file.

Installation

Clone this repository:

git clone https://github.com/yourusername/VoiceCallApp.git
cd VoiceCallApp

Open the project in Android Studio.

Sync the project and run it on an Android device.

Usage

Open the app and view the list of contacts.

Select a contact to view details.

Tap the "Call" button to initiate a phone call.

Use CRUD operations to manage contacts.

Dependencies

Add the following dependencies to your build.gradle:

implementation "androidx.room:room-runtime:2.5.0"
kapt "androidx.room:room-compiler:2.5.0"
implementation "androidx.lifecycle:lifecycle-viewmodel-compose:2.6.0"
implementation "androidx.compose.ui:ui:1.5.0"

Contributing

Feel free to contribute by submitting a pull request or reporting issues.

License

This project is licensed under the MIT License.

Contact

For any inquiries, reach out to masoomsingh0801@gmail.com or visit LinkedIn.

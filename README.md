# RealEstateApp

An Android real estate UI application built in Java, focused on presenting property listings through a clean mobile experience with intro, listing, and property detail screens.

## Overview

RealEstateApp is a native Android project that demonstrates mobile UI development for a property discovery experience. The app is organized around reusable domain models, adapters, and activities for browsing and viewing real estate information.

## Features

- Intro / onboarding screen
- Property listing interface
- Property detail screen
- RecyclerView-style adapter architecture
- Image loading with Glide
- Material Design components
- Responsive Android layouts
- Structured domain and activity layers

## Tech Stack

- **Java**
- **Android SDK**
- **AndroidX AppCompat**
- **Material Components**
- **ConstraintLayout**
- **Glide**
- **Gradle**

The project targets Android SDK 33 with a minimum SDK of 24 and uses Java 8 compatibility.

## Project Structure

```text
RealEstateApp/
└── Reth/
    ├── app/
    │   └── src/main/java/com/example/reth/
    │       ├── Adapters/
    │       ├── Domain/
    │       └── activities/
    │           ├── IntroActivity.java
    │           ├── MainActivity.java
    │           └── DetailActivity.java
    ├── build.gradle
    └── settings.gradle
```

## Getting Started

1. Clone the repository:

```bash
git clone https://github.com/Kyomuhendo-Isihaka/RealEstateApp.git
```

2. Open the `Reth` directory in Android Studio.
3. Allow Gradle to sync the dependencies.
4. Run the application on an Android emulator or device running Android 7.0+.

## What This Project Demonstrates

This project showcases native Android UI development, activity navigation, adapter-driven data presentation, image rendering, and mobile interface organization using Java and AndroidX.

## Developer

**Isihaka Kyomuhendo**  
Software Developer • Backend Engineer • Mobile App Developer

GitHub: [@Kyomuhendo-Isihaka](https://github.com/Kyomuhendo-Isihaka)

---

> Building practical software for web, mobile and backend systems.
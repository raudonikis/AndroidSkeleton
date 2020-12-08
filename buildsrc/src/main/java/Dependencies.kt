object Versions {
    // AndroidX
    const val constraintLayout = "2.0.4"

    // DI
    const val hilt = "2.30.1-alpha"
    const val hiltAndroidx = "1.0.0-alpha02"

    // Logging
    const val timber = "4.7.1"

    // Retrofit - networking
    const val retrofit = "2.9.0"

    // Room database
    const val room = "2.2.5"

    // Navigation
    const val navigation = "2.3.1"

    // Support
    const val appCompat = "1.2.0"

    // Kotlin
    const val ktxCore = "1.3.2"
    const val kotlin = "1.4.20"
    const val coroutines = "1.4.2"

    // Testing
    const val jUnit = "4.13.1"
    const val jUnitTest = "1.1.2"
    const val espresso = "3.3.0"

    // Sdk
    const val compileSdk = 30
    const val minSdk = 23
    const val targetSdk = 30
    const val buildTools = "30.0.2"
}

object Releases {
    const val applicationId = "com.raudonikis.androidskeleton"
    const val versionCode = 1
    const val versionName = "1.0"
}

object Modules {
    object Libraries {
        const val network = ":libraries:network"
        const val common = ":libraries:common"
        const val data = ":libraries:data"
        const val navigation = ":libraries:navigation"
    }
    object Features {
        const val home = ":features:home"
        const val dashboard = ":features:dashboard"
    }
}

object Dependencies {
    // AndroidX
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    // DI
    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    const val hiltLifecycle = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltAndroidx}"
    const val hiltLifecycleCompiler = "androidx.hilt:hilt-compiler:${Versions.hiltAndroidx}"

    //Logging
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    // Retrofit - networking
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val moshi = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"

    // Room database
    const val room = "androidx.room:room-runtime:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val roomExtensions = "androidx.room:room-ktx:${Versions.room}"

    // Navigation
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

    // Support
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"

    // Kotlin
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktxCore}"
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val kotlinCoroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

    // Testing
    const val jUnit = "junit:junit:${Versions.jUnit}"
    const val jUnitTest = "androidx.test.ext:junit:${Versions.jUnitTest}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}
plugins {
    id("com.android.library")
    id("dagger.hilt.android.plugin")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(30)
    buildToolsVersion("30.0.2")

    defaultConfig {
        minSdkVersion(23)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    // Networking
    api(Dependencies.retrofit)
    api(Dependencies.moshi)
    // DI
    implementation(Dependencies.hilt)
    kapt(Dependencies.hiltCompiler)
    implementation (Dependencies.hiltLifecycle)
    kapt(Dependencies.hiltAndroidXCompiler)
    // Kotlin
    implementation(Dependencies.kotlinStdLib)
    implementation(Dependencies.ktxCore)
    // Support
    implementation(Dependencies.appCompat)
    implementation(Dependencies.constraintLayout)
}
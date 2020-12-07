plugins {
    id("com.android.library")
    id("dagger.hilt.android.plugin")
    kotlin("android")
    kotlin("kapt")
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
plugins {
    id("com.android.library")
    kotlin("android")
}

dependencies {
    api(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    // Kotlin
    api(Dependencies.kotlinStdLib)
    api(Dependencies.ktxCore)
    api(Dependencies.kotlinCoroutines)
    // Support
    api(Dependencies.appCompat)
    api(Dependencies.constraintLayout)
    // Logging
    api(Dependencies.timber)
}
plugins {
    id("com.android.library")
}

dependencies {
    api(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    // Kotlin
    api(Dependencies.kotlinStdLib)
    api(Dependencies.ktxCore)
    // Support
    api(Dependencies.appCompat)
    api(Dependencies.constraintLayout)
    // Testing
    testApi(Dependencies.jUnit)
    androidTestApi(Dependencies.jUnitTest)
    androidTestApi(Dependencies.espresso)
}
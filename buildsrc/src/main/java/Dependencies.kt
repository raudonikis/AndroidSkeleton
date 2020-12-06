object Versions {
    // AndroidX
    const val constraintLayout = "2.0.4"
    // Support
    const val appCompat = "1.2.0"
    // Kotlin
    const val ktxCore = "1.3.2"
    const val kotlin = "1.4.20"
    // Testing
    const val jUnit = "4.13.1"
    const val jUnitTest = "1.1.2"
    const val espresso = "3.3.0"
}

object Dependencies {
    // AndroidX
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    // Support
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    // Kotlin
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktxCore}"
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    // Testing
    const val jUnit = "junit:junit:${Versions.jUnit}"
    const val jUnitTest = "androidx.test.ext:junit:${Versions.jUnitTest}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}
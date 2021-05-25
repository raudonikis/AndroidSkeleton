plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
}

dependencies {
    implementation(project(Modules.Libraries.common))
    // Navigation
    api(Dependencies.navigationFragment)
    api(Dependencies.navigationUi)
    // Hilt
    implementation(Dependencies.daggerHilt)
    kapt(Dependencies.daggerCompiler)
}
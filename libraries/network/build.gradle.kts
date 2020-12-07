plugins {
    id("com.android.library")
    id("dagger.hilt.android.plugin")
    kotlin("android")
    kotlin("kapt")
}

dependencies {
    implementation(project(Modules.Libraries.common))
    // Networking
    api(Dependencies.retrofit)
    api(Dependencies.moshi)
    // DI
    implementation(Dependencies.hilt)
    kapt(Dependencies.hiltCompiler)
}
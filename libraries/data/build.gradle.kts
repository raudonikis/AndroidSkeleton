plugins {
    id("com.android.library")
    id("dagger.hilt.android.plugin")
    kotlin("android")
    kotlin("kapt")
}

dependencies {
    implementation(project(Modules.Libraries.common))
    // DI
    implementation(Dependencies.daggerHilt)
    kapt(Dependencies.daggerCompiler)
    // Room database
    api(Dependencies.room)
    api(Dependencies.roomExtensions)
    kapt(Dependencies.roomCompiler)
}
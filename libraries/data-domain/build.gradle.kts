plugins {
    id("com.android.library")
    id("dagger.hilt.android.plugin")
    kotlin("android")
    kotlin("kapt")
}

dependencies {
    implementation(project(Modules.Libraries.common))
    implementation(project(Modules.Libraries.data))
    implementation(project(Modules.Libraries.network))
    // DI
    implementation(Dependencies.hilt)
    kapt(Dependencies.hiltCompiler)
}
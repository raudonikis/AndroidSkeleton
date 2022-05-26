plugins {
    id("com.android.library")
    id("dagger.hilt.android.plugin")
    id("androidx.navigation.safeargs")
    kotlin("android")
    kotlin("kapt")
}

android {
    buildFeatures.viewBinding = true
    namespace = "com.raudonikis.home"
}

dependencies {
    implementation(project(Modules.Libraries.common))
    implementation(project(Modules.Libraries.navigation))
    implementation(project(Modules.Libraries.dataDomain))
    // Hilt
    implementation(Dependencies.daggerHilt)
    kapt(Dependencies.daggerCompiler)
}

plugins {
    id("com.android.library")
    id("dagger.hilt.android.plugin")
    id("androidx.navigation.safeargs")
    kotlin("android")
    kotlin("kapt")
}

android {
    buildFeatures.viewBinding = true
}

dependencies {
    implementation(project(Modules.Libraries.common))
    implementation(project(Modules.Libraries.navigation))
    implementation(project(Modules.Libraries.dataDomain))
    // Hilt
    implementation(Dependencies.hilt)
    implementation(Dependencies.hiltLifecycle)
    kapt(Dependencies.hiltCompiler)
    kapt(Dependencies.hiltLifecycleCompiler)
}
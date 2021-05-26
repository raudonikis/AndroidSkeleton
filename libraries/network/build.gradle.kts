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
    implementation(Dependencies.moshi)
    implementation(Dependencies.moshiConverter)
    implementation(Dependencies.moshiAdapters)
    implementation(Dependencies.okHttpInterceptor)
    // DI
    implementation(Dependencies.daggerHilt)
    kapt(Dependencies.daggerCompiler)
}
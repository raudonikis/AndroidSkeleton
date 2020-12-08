plugins {
    id("com.android.library")
    kotlin("android")
}

dependencies {
    implementation(project(Modules.Libraries.common))
    implementation(project(Modules.Libraries.navigation))
}
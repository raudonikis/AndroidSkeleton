plugins {
    id("com.android.application")
    id("dagger.hilt.android.plugin")
    kotlin("android")
    kotlin("kapt")
}

apply {
    from("https://raw.githubusercontent.com/JakeWharton/SdkSearch/master/gradle/projectDependencyGraph.gradle")
}
android {

    defaultConfig {
        applicationId = Releases.applicationId
        versionCode = Releases.versionCode
        versionName = Releases.versionName
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(project(Modules.Libraries.common))
    implementation(project(Modules.Libraries.network))
    // Hilt
    implementation(Dependencies.hilt)
    kapt(Dependencies.hiltCompiler)
    implementation (Dependencies.hiltLifecycle)
    kapt(Dependencies.hiltLifecycleCompiler)
}
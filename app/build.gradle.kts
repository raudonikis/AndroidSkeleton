plugins {
    id("com.android.application")
    id("dagger.hilt.android.plugin")
    kotlin("android")
    kotlin("kapt")
}

apply {
    from("../projectDependencyGraph.gradle")
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
    hilt {
        enableExperimentalClasspathAggregation = true
    }
    lintOptions {
        isCheckReleaseBuilds = false
    }

}

dependencies {
    implementation(project(Modules.Libraries.common))
    implementation(project(Modules.Libraries.navigation))
    implementation(project(Modules.Features.home))
    implementation(project(Modules.Features.dashboard))
    // Hilt
    implementation(Dependencies.daggerHilt)
    kapt(Dependencies.daggerCompiler)
    // Testing
    testImplementation(Dependencies.jUnit)
    androidTestImplementation(Dependencies.jUnitTest)
    androidTestImplementation(Dependencies.espresso)
    // Quality
    debugImplementation(Dependencies.leakCanary)
}
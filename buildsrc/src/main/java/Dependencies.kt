object Versions {
    // AndroidX
    const val constraintLayout = "2.1.4"
    const val recyclerView = "1.2.1"

    // DI
    const val dagger = "2.42"

    // Logging
    const val timber = "5.0.1"

    // Networking
    const val retrofit = "2.9.0"
    const val moshi = "1.13.0"
    const val okHttp = "4.9.0"
    const val networkResponseAdapter = "5.0.0"

    // Room database
    const val room = "2.4.2"

    // Navigation
    const val navigation = "2.4.2"

    // Support
    const val appCompat = "1.4.1"

    // UI
    const val fastAdapter = "5.6.0"

    // Kotlin
    const val ktxCore = "1.7.0"
    const val kotlin = "1.6.21"
    const val coroutines = "1.6.1"
    const val kotlinGradlePlugin = "1.6.21"

    // Testing
    const val jUnit = "4.13.2"
    const val jUnitTest = "1.1.3"
    const val espresso = "3.4.0"

    // Quality
    const val leakCanary = "2.9.1"
}

object Dependencies {
    // AndroidX
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"

    // DI
    const val daggerHilt = "com.google.dagger:hilt-android:${Versions.dagger}"
    const val daggerCompiler = "com.google.dagger:hilt-android-compiler:${Versions.dagger}"
    const val daggerHiltPlugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.dagger}"

    // Logging
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    // Networking
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val moshi = "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"
    const val moshiConverter = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    const val moshiAdapters = "com.squareup.moshi:moshi-adapters:${Versions.moshi}"
    const val okHttpInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    const val networkResponseAdapter =
        "com.github.haroldadmin:NetworkResponseAdapter:${Versions.networkResponseAdapter}"

    // Room database
    const val room = "androidx.room:room-runtime:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val roomExtensions = "androidx.room:room-ktx:${Versions.room}"

    // Navigation
    const val navigationFragment =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    const val navigationSafeArgsPlugin =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"

    // Support
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"

    // UI
    const val fastAdapter = "com.mikepenz:fastadapter:${Versions.fastAdapter}"

    // Kotlin
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktxCore}"
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val kotlinCoroutines =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val kotlinGradlePlugin =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinGradlePlugin}"

    // Testing
    const val jUnit = "junit:junit:${Versions.jUnit}"
    const val jUnitTest = "androidx.test.ext:junit:${Versions.jUnitTest}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"

    // Quality
    const val leakCanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakCanary}"
}

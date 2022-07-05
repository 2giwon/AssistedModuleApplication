object Version {
    const val KOTLIN_VER = "1.5.31"
    const val DAGGER2_VER = "2.27"
    const val ASSISTED_INJECT_VER = "0.5.2"
}

object ProjectConfig {
    const val GRADLE = "com.android.tools.build:gradle:7.0.3"
    const val KOTLIN_GRADLE_PLUGIN =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.KOTLIN_VER}"
}

object AndroidConfig {
    const val COMPILE_SDK = 31
    const val APP_ID = "com.egiwon.assistedmoduleapplication"
    const val MIN_SDK = 23
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0.0"
    const val TEST_INSTRUMENTATION_RUNNER = "androidx.test.runner.AndroidJUnitRunner"
}

object Dependencies {

    const val KOTLIN_STDLIB = "org.jetbrains.kotlin:kotlin-stdlib:${Version.KOTLIN_VER}"
    const val CORE_KTX = "androidx.core:core-ktx:1.7.0"
    const val MATERIAL = "com.google.android.material:material:1.6.0"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.1.4"

    const val COROUTINE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2"

    const val ACTIVITY_EXT = "androidx.activity:activity-ktx:1.3.1"
    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:1.3.6"

    const val DAGGER2 = "com.google.dagger:dagger:${Version.DAGGER2_VER}"
    const val DAGGER2_ANDROID = "com.google.dagger:dagger-android:${Version.DAGGER2_VER}"
    const val DAGGER2_ANDROID_SUPPORT = "com.google.dagger:dagger-android-support:${Version.DAGGER2_VER}"

    const val DAGGER2_COMPILER_KAPT = "com.google.dagger:dagger-compiler:${Version.DAGGER2_VER}"
    const val DAGGER2_ANDROID_PROCESSOR_KAPT = "com.google.dagger:dagger-android-processor:${Version.DAGGER2_VER}"

    const val DAGGER2_ASSISTED_INJECT_ANNOTATION = "com.squareup.inject:assisted-inject-annotations-dagger2:${Version.ASSISTED_INJECT_VER}"
    const val DAGGER2_ASSISTED_INJECT_PROCESSOR_KAPT = "com.squareup.inject:assisted-inject-processor-dagger2:${Version.ASSISTED_INJECT_VER}"
}

object TestConfig {
    private const val JUNIT_VERSION = "5.7.0"

    const val JUNIT_JUPITER_API = "org.junit.jupiter:junit-jupiter-api:$JUNIT_VERSION"
    const val JUNIT_JUPITER_ENGINE = "org.junit.jupiter:junit-jupiter-engine:$JUNIT_VERSION"
    const val JUNIT_JUPITER_PARAMS = "org.junit.jupiter:junit-jupiter-params:$JUNIT_VERSION"

    const val ASSERTJ_CORE = "org.assertj:assertj-core:3.18.0"
}

plugins {
    id("com.android.application")
}



android {
    namespace = "com.example.myapplication"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.myapplication"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }


}

tasks.withType<Test> {
    useJUnitPlatform() // Enables JUnit Platform (JUnit 5 + JUnit 4)
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    //testImplementation("junit:junit:4.13.2")
    //testImplementation ("org.junit.jupiter:junit-jupiter:5.6.0")
   // testImplementation ("org.powermock:powermock-api-mockito2:2.0.2")
    //testImplementation("org.powermock:powermock-module-junit4:2.0.2")
    //testImplementation("org.mockito:mockito-core:2.23.0")
    //testImplementation("org.powermock:powermock-api-support:2.0.2")
    testImplementation("org.powermock:powermock-module-junit4:1.6.4")
    testImplementation("org.powermock:powermock-api-mockito2:2.0.9")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
    // testImplementation("androidx.test:core:1.5.0")
    //androidTestImplementation("androidx.test.ext:junit:1.1.5")
   // androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}


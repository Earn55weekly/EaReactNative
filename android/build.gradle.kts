// Top-level build file for configuring Gradle settings

plugins {
    id("com.android.application") version "8.1.0" apply false
    id("com.android.library") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.24" apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("$rootDir/../node_modules/react-native-gradle-plugin") }
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.0")
        classpath("com.facebook.react:react-native-gradle-plugin")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("$rootDir/../node_modules/react-native-gradle-plugin") }
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

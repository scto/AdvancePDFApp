// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.0.2" apply false
    id("com.android.library") version "8.0.2" apply false
    id("org.jetbrains.kotlin.android") version "1.8.22" apply false
    id("org.jetbrains.kotlin.jvm") version "1.8.22" apply false
    id("org.jetbrains.kotlin.plugin.allopen") version "1.8.22" apply false
    id("com.diffplug.gradle.spotless") version:"6.15.0" apply false
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
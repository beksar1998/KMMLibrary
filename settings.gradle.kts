pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "KMMLibrary"
includeBuild("convention-plugins")
include(":androidApp")
include(":shared")
include(":library")

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()

        maven {
            setUrl("https://jitpack.io")
            // setUrl("https://www.jitpack.io")
        }

        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()

        maven {
            setUrl("https://jitpack.io")
            // setUrl("https://www.jitpack.io")
        }

        mavenCentral()
    }
}

rootProject.name = "MovieApp"
include(":app")

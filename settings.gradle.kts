rootProject.name = "test"

include("a")
include("b")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven(url = "https://libraries.minecraft.net")
    }
}

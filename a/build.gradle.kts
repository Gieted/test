plugins {
    kotlin("jvm")
}

group = "org.example.a"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url = "https://libraries.minecraft.net")
}

dependencies {
    implementation("com.mojang:brigadier:1.0.18")
}

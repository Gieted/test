plugins {
    kotlin("jvm")
}

group = "org.example.b"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(project(":a"))
}

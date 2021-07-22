plugins {
    kotlin("jvm")
}

group = "org.example.b"
version = "1.0-SNAPSHOT"

repositories { 
    mavenCentral()
}

dependencies {
    implementation(project(":a"))
}

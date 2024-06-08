plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.testng:testng:7.10.2")
    implementation("org.seleniumhq.selenium:selenium-java:4.21.0")
    implementation("org.seleniumhq.selenium:selenium-chrome-driver:4.9.1")
}

tasks.test {
    useJUnitPlatform()
}
plugins {
    id("java")
    `maven-publish`
}

group = "com.arch.commons"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            groupId = "com.arch.commons"
            artifactId = "commons"
            version = "1.0.0-SNAPSHOT"
        }
    }
    repositories {
        mavenLocal()
    }
}

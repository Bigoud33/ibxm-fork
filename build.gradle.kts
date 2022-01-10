plugins {
    java
    `maven-publish`
}

group = "ibxm"
version = "a75"

val sourcesJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    from(sourceSets["main"].allSource)
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            artifactId = "ibxm"
            artifact(sourcesJar)
        }
    }
}
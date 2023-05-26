@Suppress("DSL_SCOPE_VIOLATION") // https://youtrack.jetbrains.com/issue/IDEA-262280

plugins {
    id("java-library")
    id("maven-publish")
    id("signing")
    alias(libs.plugins.lombok)
}

tasks.jar {
    enabled = false
}

subprojects {

    apply {
        plugin("java-library")
        plugin("maven-publish")
        plugin("signing")
        plugin(rootProject.libs.plugins.lombok.get().pluginId)
    }

    group = "org.cloudburstmc.protocol"

    tasks {
        compileJava {
            options.encoding = Charsets.UTF_8.name();
        }
        test {
            useJUnitPlatform()
        }
    }

    dependencies {
        compileOnly(rootProject.libs.checker.qual)
    }

    java {
        withJavadocJar()
        withSourcesJar()
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(8))
        }
    }
}

plugins {
    application
    kotlin("jvm", "1.1.51")
}

application {
    mainClassName = "am.alite.ga.MainKt"
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
}

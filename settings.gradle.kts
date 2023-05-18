
rootProject.name = "ok-marketplace-practice"

include("m1l1-hello")

pluginManagement    {
    val kotlinVersion: String = "1.8.20"

    plugins {
        kotlin("jvm") version kotlinVersion apply false
    }
}

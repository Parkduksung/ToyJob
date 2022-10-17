plugins {
    id("toyjob.android.library")
    id("toyjob.android.library.compose")
}


dependencies {
    api(libs.androidx.compose.ui.util)
    api(libs.androidx.compose.ui.tooling.preview)
    api(libs.androidx.compose.material)
    api(libs.androidx.compose.foundation)
    api(libs.androidx.compose.runtime)
}
plugins {
  id("skydoves.pokedex.android.library")
  id("skydoves.pokedex.android.library.compose")
  id("skydoves.pokedex.spotless")
}

android {
  namespace = "com.skydoves.pokedex.compose.designsystem"
}

dependencies {
  // image loading
  api(libs.glide.compose)

  api(libs.androidx.compose.runtime)
  api(libs.androidx.compose.ui)
  api(libs.androidx.compose.ui.tooling)
  api(libs.androidx.compose.ui.tooling.preview)
  api(libs.androidx.compose.animation)
  api(libs.androidx.compose.material3)
  api(libs.androidx.compose.foundation)
  api(libs.androidx.compose.foundation.layout)
}

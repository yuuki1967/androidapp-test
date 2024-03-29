/*
 * Copyright 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

plugins {
    id("com.example.platform.sample")
}

android {
    namespace = "com.example.platform.media.video"
    viewBinding.isEnabled = true
}

dependencies {
    // Media3 Common
    implementation(libs.androidx.media3.common)

    // Media3 Transformer
    implementation(libs.androidx.media3.transformer)

    // Media3 ExoPlayer
    implementation(libs.androidx.media3.exoplayer)

    // Media3 Ui
    implementation(libs.androidx.media3.ui)
    implementation(libs.androidx.media3.effect)
    implementation(libs.material)
}
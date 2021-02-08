package com.example.accompanistcrashglide

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.bumptech.glide.request.RequestOptions
import com.example.accompanistcrashglide.ui.theme.AccompanistCrashGlideTheme
import dev.chrisbanes.accompanist.glide.GlideImage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AccompanistCrashGlideTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    GlideImage(
                            data = "",
                            contentDescription = "",
                            loading = {
                                Box(Modifier.matchParentSize()) {
                                    CircularProgressIndicator(Modifier.align(Alignment.Center))
                                }
                            },
                            error = {
                                Image(
                                        imageVector = vectorResource(R.drawable.ic_gray_user),
                                        contentDescription = ""
                                )
                            },
                            requestBuilder = {
                                val options = RequestOptions()
                                options.circleCrop()
                                apply(options)
                            },
                    )
                }
            }
        }
    }
}



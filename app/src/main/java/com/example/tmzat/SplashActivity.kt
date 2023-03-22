package com.example.tmzat

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_splash.*


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        // To display image
        /*withDelay(2000) {
            navigateToMain()
        }*/
        // To display video

            withDelay(2000) {
                navigateToMain()
            }

    }

    private fun navigateToMain() {
        if (isFinishing) return
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}
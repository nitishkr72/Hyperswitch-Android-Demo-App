package com.nitishkr.hyperswitchdemoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import io.hyperswitch.PaymentConfiguration

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        PaymentConfiguration.init(
            applicationContext,
            "pk_snd_3b33cd9404234113804aa1accaabe22f"
        )

        findViewById<Button>(R.id.checkout).setOnClickListener {
            val intent = Intent(this, CheckoutActivity::class.java)
            startActivity(intent)
        }



    }
}
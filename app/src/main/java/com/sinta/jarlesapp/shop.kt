package com.sinta.jarlesapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class shop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_shop)

        // Menangani window insets untuk padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Inisialisasi ImageView untuk checkout dan dot
        val checkoutImageView: ImageView = findViewById(R.id.checkout)
        val dotImageView: ImageView = findViewById(R.id.dot)

        // Inisialisasi ImageView untuk chart, home, dan account
        val chartImageView: ImageView = findViewById(R.id.keranjang)
        val homeImageView: ImageView = findViewById(R.id.homee)
        val accountImageView: ImageView = findViewById(R.id.acc)

        // Menetapkan OnClickListener untuk checkoutImageView
        checkoutImageView.setOnClickListener {
            val intent = Intent(this, Acount::class.java)  // Pindah ke Account Activity
            startActivity(intent)
        }

        // Menetapkan OnClickListener untuk dotImageView
        dotImageView.setOnClickListener {
            val intent = Intent(this, overflow::class.java)  // Pindah ke Overflow Activity
            startActivity(intent)
        }

        // Menetapkan OnClickListener untuk chartImageView
        chartImageView.setOnClickListener {
            val intent = Intent(this, shop::class.java)  // Pindah ke Shop Activity
            startActivity(intent)
        }

        // Menetapkan OnClickListener untuk homeImageView
        homeImageView.setOnClickListener {
            val intent = Intent(this, HOME::class.java)  // Pindah ke Home Activity
            startActivity(intent)
        }

        // Menetapkan OnClickListener untuk accountImageView
        accountImageView.setOnClickListener {
            val intent = Intent(this, Acount::class.java)  // Pindah ke Account Activity
            startActivity(intent)
        }
    }
}

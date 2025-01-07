package com.sinta.jarlesapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Acount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_acount)

        // Menangani window insets untuk padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Inisialisasi ImageButton untuk keranjang, homee, acc, dan ImageView untuk dot
        val keranjangButton: ImageButton = findViewById(R.id.keranjang)
        val homeButton: ImageButton = findViewById(R.id.homee)
        val accountButton: ImageButton = findViewById(R.id.acc)
        val dotButton: ImageView = findViewById(R.id.dot)

        // Menetapkan OnClickListener untuk keranjangButton
        keranjangButton.setOnClickListener {
            val intent = Intent(this, shop::class.java) // Pindah ke aktivitas shop
            startActivity(intent)
        }

        // Menetapkan OnClickListener untuk homeButton
        homeButton.setOnClickListener {
            val intent = Intent(this, HOME::class.java) // Pindah ke aktivitas HOME
            startActivity(intent)
        }

        // Menetapkan OnClickListener untuk accountButton
        accountButton.setOnClickListener {
            val intent = Intent(this, Acount::class.java) // Tetap di aktivitas Acount
            startActivity(intent)
        }

        // Menetapkan OnClickListener untuk dotButton
        dotButton.setOnClickListener {
            val intent = Intent(this, overflow::class.java) // Pindah ke aktivitas Overflow Page
            startActivity(intent)
        }
    }
}

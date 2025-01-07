package com.sinta.jarlesapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class productlurik : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_productlurik)

        // Menangani window insets untuk padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Inisialisasi ImageButton untuk keranjang, homee, acc, dan ImageView untuk addtochart
        val keranjangButton: ImageButton = findViewById(R.id.keranjang)
        val homeButton: ImageButton = findViewById(R.id.homee)
        val accountButton: ImageButton = findViewById(R.id.acc)
        val addToChartButton: ImageView = findViewById(R.id.addtochart)

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
            val intent = Intent(this, Acount::class.java) // Pindah ke aktivitas Acount
            startActivity(intent)
        }

        // Menetapkan OnClickListener untuk addToChartButton
        addToChartButton.setOnClickListener {
            val intent = Intent(this, shop::class.java) // Pindah ke aktivitas shop
            startActivity(intent)
        }
    }
}

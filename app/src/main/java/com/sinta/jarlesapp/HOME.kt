package com.sinta.jarlesapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HOME : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        // Menangani window insets untuk padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Inisialisasi ImageButton untuk chartbutton, homee, dan acc
        val chartButton: ImageButton = findViewById(R.id.chartbutton)
        val homeButton: ImageButton = findViewById(R.id.homee)
        val accountButton: ImageButton = findViewById(R.id.acc)
        val produkSerutButton: ImageView = findViewById(R.id.produkserut)
        val lurikButton: ImageView = findViewById(R.id.lurik)
        val dotButton: ImageView = findViewById(R.id.dot)

        // Menetapkan OnClickListener untuk chartButton
        chartButton.setOnClickListener {
            val intent = Intent(this, shop::class.java)
            startActivity(intent)
        }

        // Menetapkan OnClickListener untuk homeButton
        homeButton.setOnClickListener {
            val intent = Intent(this, HOME::class.java)
            startActivity(intent)
        }

        // Menetapkan OnClickListener untuk accountButton
        accountButton.setOnClickListener {
            val intent = Intent(this, Acount::class.java)
            startActivity(intent)
        }

        // Menetapkan OnClickListener untuk produkSerutButton
        produkSerutButton.setOnClickListener {
            val intent = Intent(this, productpouch::class.java)  // Activity untuk pouch serut
            startActivity(intent)
        }

        // Menetapkan OnClickListener untuk lurikButton
        lurikButton.setOnClickListener {
            val intent = Intent(this, productlurik::class.java)  // Activity untuk kain lurik
            startActivity(intent)
        }

        // Menetapkan OnClickListener untuk dotButton
        dotButton.setOnClickListener {
            val intent = Intent(this, overflow::class.java)  // Activity untuk Overflow Page
            startActivity(intent)
        }
    }
}

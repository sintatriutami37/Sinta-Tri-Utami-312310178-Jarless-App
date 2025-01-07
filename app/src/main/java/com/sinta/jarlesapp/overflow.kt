package com.sinta.jarlesapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class overflow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_overflow)

        // Menangani window insets untuk padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Inisialisasi ImageView untuk overflow1
        val overflow1Button: ImageView = findViewById(R.id.overflow1)

        // Menetapkan OnClickListener untuk overflow1Button
        overflow1Button.setOnClickListener {
            val intent = Intent(this, HOME::class.java) // Pindah ke aktivitas HOME
            startActivity(intent)
        }
    }
}

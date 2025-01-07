package com.sinta.jarlesapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        // Inisialisasi ImageView loginbutton
        val loginButton: ImageView = findViewById(R.id.loginbutton)

        // Menetapkan OnClickListener untuk loginButton
        loginButton.setOnClickListener {
            // Membuat Intent untuk berpindah ke HomeActivity
            val intent = Intent(this, HOME::class.java)
            startActivity(intent)
            finish() // Menutup LoginActivity agar tidak kembali ke halaman login saat menekan tombol back
        }

        // Inisialisasi TextView daftar
        val daftarTextView: TextView = findViewById(R.id.daftar)

        // Menetapkan OnClickListener untuk TextView daftar
        daftarTextView.setOnClickListener {
            // Membuat Intent untuk berpindah ke SignUpActivity
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }

        // Menangani window insets untuk padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

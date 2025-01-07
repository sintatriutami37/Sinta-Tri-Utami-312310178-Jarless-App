package com.sinta.jarlesapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class productpouch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_productpouch)

        // Menangani window insets untuk padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Inisialisasi ImageButton untuk keranjang, homee, acc, dan back
        val keranjangButton: ImageButton = findViewById(R.id.keranjang)
        val homeButton: ImageButton = findViewById(R.id.homee)
        val accountButton: ImageButton = findViewById(R.id.acc)
        val backButton: ImageButton = findViewById(R.id.back)  // ImageButton dengan ID back

        // Inisialisasi ImageView untuk adtochart
        val adtoChartImageView: ImageView = findViewById(R.id.addtochart)

        // Menetapkan OnClickListener untuk adtoChartImageView
        adtoChartImageView.setOnClickListener {
            val intent = Intent(this, shop::class.java)  // Pindah ke Shop Activity
            startActivity(intent)
        }

        // Menetapkan OnClickListener untuk keranjangButton
        keranjangButton.setOnClickListener {
            val intent = Intent(this, shop::class.java)  // Ganti dengan activity yang sesuai
            startActivity(intent)
        }

        // Menetapkan OnClickListener untuk homeButton
        homeButton.setOnClickListener {
            val intent = Intent(this, HOME::class.java)  // Ganti dengan activity yang sesuai
            startActivity(intent)
        }

        // Menetapkan OnClickListener untuk accountButton
        accountButton.setOnClickListener {
            val intent = Intent(this, Acount::class.java)  // AcountActivity
            startActivity(intent)
        }

        // Menetapkan OnClickListener untuk backButton
        backButton.setOnClickListener {
            val intent = Intent(this, HOME::class.java)  // Pindah ke Home Activity
            startActivity(intent)
        }
    }
}

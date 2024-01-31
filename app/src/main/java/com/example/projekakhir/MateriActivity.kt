package com.example.projekakhir

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MateriActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi)

        val back_Dashboard = findViewById<ImageView>(R.id.backDashboard)
        back_Dashboard.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }

        val detail_Materi = findViewById<TextView>(R.id.detail)
        detail_Materi.setOnClickListener {
            val intent = Intent(this, BabActivity::class.java)
            startActivity(intent)
        }
    }
}
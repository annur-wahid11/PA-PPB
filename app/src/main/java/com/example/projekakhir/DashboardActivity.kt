package com.example.projekakhir

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val buttonLogout = findViewById<Button>(R.id.btnLogout)
        buttonLogout.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val profil = findViewById<ImageView>(R.id.btnProfil)
        profil.setOnClickListener {
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }

        val materi = findViewById<CardView>(R.id.cvTeori)
        materi.setOnClickListener {
            val intent = Intent(this, MateriActivity::class.java)
            startActivity(intent)
        }

        val alat = findViewById<CardView>(R.id.cvAlat)
        alat.setOnClickListener {
            val intent = Intent(this, AlatActivity::class.java)
            startActivity(intent)
        }

        val tugas = findViewById<CardView>(R.id.cvTugas)
        tugas.setOnClickListener {
            val intent = Intent(this, TugasActivity::class.java)
            startActivity(intent)
        }
    }
}
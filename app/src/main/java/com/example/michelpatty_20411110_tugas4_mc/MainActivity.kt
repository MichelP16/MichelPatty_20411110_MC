package com.example.michelpatty_20411110_tugas4_mc

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.halaman_login)

        val btn_login = findViewById<Button>(R.id.btn_login)

        btn_login.setOnClickListener {
            Intent(this, hal_konten::class.java).also {
                startActivity(it)
            }
        }

        val btn_register = findViewById<Button>(R.id.btn_register)

        btn_register.setOnClickListener {
            Intent(this, hal_register::class.java).also {
                startActivity(it)
            }
        }

        val btn_home = findViewById<Button>(R.id.btn_home)

        btn_home.setOnClickListener {
            Intent(this, hal_konten::class.java).also {
                startActivity(it)
            }
        }
    }
}



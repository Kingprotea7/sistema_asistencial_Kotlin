package com.example.sistema_asistencial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button = findViewById<Button>(R.id.btn_ingresar)

        button.setOnClickListener{

            val intent:Intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }
    }
}
package com.gmxandres.androidmaster.firstApp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.gmxandres.androidmater.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first_app)
        //editado
        val btnPulsame=findViewById<AppCompatButton>(R.id.btnPulsame)
        val etname = findViewById<AppCompatEditText>(R.id.etName)
            btnPulsame.setOnClickListener {
                val name=etname.text.toString()
                if(name.isNotEmpty()){
                val intent = Intent(this, ResultActivity::class.java)
                    intent.putExtra("Extra_Name",name)
                    startActivity(intent)
            } }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
    }
}
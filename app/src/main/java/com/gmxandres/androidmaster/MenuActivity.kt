package com.gmxandres.androidmaster

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.gmxandres.androidmaster.firstApp.FirstAppActivity
import com.gmxandres.androidmaster.imccalculator.ImcCalculatorActivity
import com.gmxandres.androidmater.R

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val btnSaludApp=findViewById<Button>(R.id.btnSaludApp)
        val btnIMCApp=findViewById<Button>(R.id.btnIMCApp)
        btnSaludApp.setOnClickListener { navigateToSaludApp() }
        btnIMCApp.setOnClickListener { navigateToIMCaPP() }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    private fun navigateToSaludApp(){
        val intent=Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToIMCaPP(){
        val intent=Intent(this,ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

}
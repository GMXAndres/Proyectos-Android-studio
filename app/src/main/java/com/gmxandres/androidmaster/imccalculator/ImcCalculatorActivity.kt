package com.gmxandres.androidmaster.imccalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.gmxandres.androidmater.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import java.text.DecimalFormat

class ImcCalculatorActivity : AppCompatActivity() {
    private var isMaleSelected: Boolean = true
    private var isFemaleSelected: Boolean = false
    private var currentWeight: Int = 60
    private var currentAge: Int = 25
    private var currentHeight:Int=150


    private lateinit var viewMale: CardView
    private lateinit var viewFemale: CardView
    private lateinit var tvHeight: TextView
    private lateinit var rsHeight: RangeSlider
    private lateinit var btnSubstractWeight: FloatingActionButton
    private lateinit var btnAditionWeight: FloatingActionButton
    private lateinit var tvWeight: TextView
    private lateinit var btnSubstractAge: FloatingActionButton
    private lateinit var btnAditionAge: FloatingActionButton
    private lateinit var tvAge: TextView
    private lateinit var btnCalculate: Button
    companion object{
        const val IMC_KEY="IMC_Result"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_imc_calculator)
        initcomponents()
        initListeners()
        initUI()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun initcomponents() {
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
        tvHeight = findViewById(R.id.tvHeight)
        rsHeight = findViewById(R.id.rsHeight)
        btnSubstractWeight = findViewById(R.id.btnSubstractWeight)
        btnAditionWeight = findViewById(R.id.btnAditionWeight)
        btnSubstractAge = findViewById(R.id.btnSubstractAge)
        btnAditionAge = findViewById(R.id.btnAditionAge)
        tvWeight = findViewById(R.id.tvWeight)
        tvAge = findViewById(R.id.tvAge)
        btnCalculate=findViewById(R.id.btnCalculate)
    }

    private fun initListeners() {
        viewMale.setOnClickListener {
            changeGender()
            setGenderColor()
        }
        viewFemale.setOnClickListener {
            changeGender()
            setGenderColor()
        }
        rsHeight.addOnChangeListener { _, value, _ ->
            val df = DecimalFormat("#.##")
            currentHeight = df.format(value).toInt()
            tvHeight.text = "$currentHeight cm"
        }
        btnAditionWeight.setOnClickListener {
            if (currentWeight < 150) {
                currentWeight ++
                setWeight()
            }
        }
        btnSubstractWeight.setOnClickListener {
            if (currentWeight > 30) {
                currentWeight --
                setWeight()
            }
        }
        btnAditionAge.setOnClickListener {
            if (currentAge < 100) {
                currentAge += 1
                setAge()
            }
        }
        btnSubstractAge.setOnClickListener {
            if (currentAge > 15) {
                currentAge -= 1
                setAge()
            }
        }
        btnCalculate.setOnClickListener{
            val result=calculateIMC()
            navigateToResult(result)
        }
    }

    private fun navigateToResult(result: Double) {
        val intent= Intent(this, ResultIMCActivity::class.java)
        intent.putExtra(IMC_KEY,result)
        startActivity(intent)
    }

    private fun calculateIMC():Double {
        val df=DecimalFormat("#.##")
        val imc =currentWeight/((currentHeight.toDouble()/100)*(currentHeight.toDouble()/100))
        return df.format(imc).toDouble()
    }

    private fun setAge() {
        tvAge.text = currentAge.toString()
    }

    private fun setWeight() {
        tvWeight.text = currentWeight.toString()
    }

    private fun changeGender() {
        isMaleSelected = !isMaleSelected
        isFemaleSelected = !isFemaleSelected
    }

    private fun setGenderColor() {
        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSelected))
    }

    private fun getBackgroundColor(isSelectedComponent: Boolean): Int {
        val colorReference = if (isSelectedComponent) {
            R.color.background_component_selected
        } else {
            R.color.background_component
        }
        return ContextCompat.getColor(this, colorReference)
    }

    private fun initUI() {
        setGenderColor()
        setAge()
        setWeight()
    }
}
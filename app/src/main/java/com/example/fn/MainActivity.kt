
package com.example.fn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun opera(view: View)
    {
        var result: Double = 0.0
        var i: Int = 0
            if (Numerotxt.text.isEmpty()) {
                Toast.makeText(this, "El campo tiene que contener un numero", Toast.LENGTH_SHORT).show()
                //Numerotxt.setError("El campo tiene que contener un numero")
                Numerotxt.requestFocus()
            } else
            {
                var numero = Numerotxt.text.toString().toInt()

                for (i in 1 .. numero)
                {

                    if (i % 2 == 0)
                    {
                        result = result - (1 / i.toDouble())
                    } else
                    {
                        result = result + (1 / i.toDouble())
                    }

                }
                txtResult.text = result.toString()
                //print(result)
            }
    }
}
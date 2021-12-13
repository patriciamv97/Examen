package com.dam2a.examen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var boton : Button = findViewById(R.id.button)

        boton.setOnClickListener{
            Toast.makeText(this, "Nota enviada",Toast.LENGTH_SHORT).show()
        }
        mostrarLogs()
    }


        private fun mostrarLogs(){
            var  cuenta :Int =100
            for(i in 0..100){
                Log.d("Cuenta",""+ cuenta--)
            }
        }
    }



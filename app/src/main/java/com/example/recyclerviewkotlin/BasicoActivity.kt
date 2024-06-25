package com.example.recyclerviewkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class BasicoActivity : AppCompatActivity() {
    //atributos
    lateinit var listaDatos:ArrayList<String>
    lateinit var recycler: RecyclerView
    lateinit var basicoAdapter:BasicoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_basico)
        //aqui empieza la acción
        //llenar listados
        listaDatos.add("Hola")
        listaDatos.add("mundo")
        listaDatos.add("feliz")
        recycler = findViewById(R.id.recyclerId)
        recycler.adapter = BasicoAdapter(listaDatos)
        //recycler.setLayoutManager
        recycler.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,
            false)





        }
    }

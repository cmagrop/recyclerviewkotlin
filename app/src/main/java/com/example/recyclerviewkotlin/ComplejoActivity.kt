package com.example.recyclerviewkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ComplejoActivity : AppCompatActivity() {

    lateinit  var smartphoneList:ArrayList<SmartphoneModel>
    lateinit var recyclerView: RecyclerView
    lateinit var complejoAdapter: ComplejoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_complejo)
        //inicializar ArrayList
        smartphoneList = ArrayList<SmartphoneModel>()

        //llenar smartphoneList

        llenarSmartphones()

        //vincular recycler con la vista
        recyclerView = findViewById(R.id.recyclerId2)
        //establecer el adapter al recyclerView
        recyclerView.adapter = ComplejoAdapter(smartphoneList,this)
        //establecer el tipo de layout
        recyclerView.layoutManager =
            LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)


    }

    private fun llenarSmartphones() {
        smartphoneList.add(SmartphoneModel("Samsung","A31S","4'","2020"))
        smartphoneList.add(SmartphoneModel("Xiaomi","10 Pro","6'", "2022"))
        smartphoneList.add(SmartphoneModel("LG","P34","8'","2020"))
        smartphoneList.add(SmartphoneModel("Huawei","P40","5'","2022"))



    }
}
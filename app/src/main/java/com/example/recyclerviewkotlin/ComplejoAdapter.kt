package com.example.recyclerviewkotlin

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ComplejoAdapter(var smartphoneList: List<SmartphoneModel>,val context: Context):
    RecyclerView.Adapter<ComplejoAdapter.ViewHolder>()
{

    public class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {

        //Conjunto de TextView para el item
        lateinit var marca:TextView
        lateinit var modelo:TextView
        lateinit var dimension: TextView
        lateinit var anio: TextView


        init {
            marca = itemView.findViewById(R.id.marca)
            modelo = itemView.findViewById(R.id.modelo)
            dimension = itemView.findViewById(R.id.dimension)
            anio = itemView.findViewById(R.id.anio)

        }


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return  ViewHolder(LayoutInflater.from(context).inflate(R.layout.listcomplejo,parent,false))
    }

    override fun getItemCount(): Int {
        return  smartphoneList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var smartphoneModel = smartphoneList.get(position)
        holder.marca.text = smartphoneModel.marca
        holder.modelo.text = smartphoneModel.modelo
        holder.dimension.text = smartphoneModel.dimension
        holder.anio.text = smartphoneModel.anio


    }

}
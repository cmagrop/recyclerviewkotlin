package com.example.recyclerviewkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BasicoAdapter: RecyclerView.Adapter<BasicoAdapter.ViewHolder> {

    lateinit var listaDatos:ArrayList<String>

    constructor(listaDatos: ArrayList<String>) : super() {
        this.listaDatos = listaDatos
    }


    /*
    *
    *
    * public class ViewHolder extends RecyclerView.ViewHolder
    * {
    * public ViewHolder(View itemLayoutView)
    * {
    * super(itemLayoutView);
    * }
    *
    * }
    *
    * */


    public class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {

        //TextView item;
        lateinit var item: TextView
        lateinit var intent: Intent
        init {

            //item=itemView.findViewById(R.id.itemId);

            item = itemView.findViewById(R.id.itemId)
            /*
            item.setOnClickListener {
                intent = Intent(itemView.context,DetalleActivity::class.java)
                itemView.context.startActivity(intent)

            }
              */

        }

        fun asignarDatos(itemDato: String)
        {
            item.setText(itemDato)

        }





    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view:View = LayoutInflater.from(parent.context).
        inflate(R.layout.listbasico,null,false)
        //return new ViewHolder(view);
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return listaDatos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.asignarDatos(listaDatos.get(position))
    }
}
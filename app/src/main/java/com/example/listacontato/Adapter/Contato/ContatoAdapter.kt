package com.example.listacontato.Adapter.Contato

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listacontato.Data.Contato
import com.example.listacontato.R

class ContatoAdapter: RecyclerView.Adapter<ContatoAdapter.ContatoAdapterViewHolder>() {

    private val list: MutableList<Contato> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContatoAdapterViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.contato_item,parent,false)
        return ContatoAdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContatoAdapterViewHolder, position: Int) {
      holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ContatoAdapterViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bind(Contato : Contato){

        }

    }
}
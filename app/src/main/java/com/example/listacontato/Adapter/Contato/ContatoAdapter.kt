package com.example.listacontato.Adapter.Contato

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
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

    fun updateList(list: List<Contato>){
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()

    }


    class ContatoAdapterViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
       private val tvName: TextView = itemView.findViewById(R.id.nome_contato)
       private val tvNumero: TextView = itemView.findViewById(R.id.numero_contato)
       private val imagemView : ImageView = itemView.findViewById(R.id.iamgem_view)

        fun bind(Contato : Contato){
            tvName.text = Contato.nome
            tvNumero.text = Contato.numero.toString()
        }

    }
}
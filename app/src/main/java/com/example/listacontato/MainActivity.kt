package com.example.listacontato

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listacontato.Adapter.Contato.ContatoAdapter
import com.example.listacontato.Data.Contato

class MainActivity : AppCompatActivity() {
    private val rvList : RecyclerView by lazy {
        findViewById<RecyclerView>(R.id.rv_list)
    }

    private val adapter =  ContatoAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindView()
        updateList()
    }
    private fun bindView() {
        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
    }
    private fun updateList(){
        adapter.updateList(
            arrayListOf(
                Contato(
                    "Teste",
                    859999999,
                    "img.png"
                ),
                Contato(
                    "Teste2",
                    859999999,
                    "img.png"
                )

            )
        )
    }
}
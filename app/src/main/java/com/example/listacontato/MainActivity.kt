package com.example.listacontato

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listacontato.Adapter.Contato.ContatoAdapter
import com.example.listacontato.Data.Contato
import java.util.zip.Inflater

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }
    private fun toast(message: String){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.item_menu1 ->{
                toast("menu 1")
                return true
            }
            R.id.item_menu2 ->{
                toast("menu 2")
                return true
            }
            R.id.item_menu3 ->{
                toast("menu 3")
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
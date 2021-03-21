package com.example.listacontato

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.drawerlayout.widget.DrawerLayout
import com.example.listacontato.Data.Contato

class ContatoDetalhe : AppCompatActivity() {
    private var contato : Contato? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contato_detalhe)
        getExtras()
        bindViews()
        initToobar()
    }
    private fun initToobar(){
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar_home)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    private fun getExtras(){
        contato = intent.getParcelableExtra(EXTRA_CONTATO)
    }
    private fun bindViews(){
        findViewById<TextView>(R.id.nome_contato).text = contato?.nome
        findViewById<TextView>(R.id.numero_contato).text = contato?.numero.toString()

    }
    companion object{
        const val EXTRA_CONTATO :String = "EXTRA_CONTATO"
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
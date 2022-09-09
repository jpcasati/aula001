package br.com.empresa.aula001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto = findViewById<TextView>(R.id.txtHorario)
        val botao = findViewById<Button>(R.id.btnAtualizar)

        botao.setOnClickListener {

            val dataAtual = Date()
            val formato = SimpleDateFormat("dd/MM/YYYY HH:mm:ss")
            val dataExibida = formato.format(dataAtual)

            texto.text = dataExibida

        }

    }
}
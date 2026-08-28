package com.exemplo.aquecimento

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.SeekBar
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var cliques = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Exercício 2: ponte XML -> código
        val btn = findViewById<Button>(R.id.btnTeste)
        val checkBox = findViewById<CheckBox>(R.id.checkTeste)
        val switchTeste = findViewById<Switch>(R.id.switchTeste)
        val seekBar = findViewById<SeekBar>(R.id.seekTeste)
        val txtStatus = findViewById<TextView>(R.id.txtStatus)

        // Exercício 3: Toast ao clicar (agora contando os cliques)
        btn.setOnClickListener {
            cliques++
            Toast.makeText(this, "Clicado $cliques vez(es)!", Toast.LENGTH_SHORT).show()
            txtStatus.text = "Status: botão clicado $cliques vez(es)"
        }

        // Exercício 5: CheckBox atualiza o status
        checkBox.setOnCheckedChangeListener { _, isChecked ->
            txtStatus.text = if (isChecked) {
                "Status: opção marcada"
            } else {
                "Status: opção desmarcada"
            }
        }

        // Exercício 5: Switch atualiza o status
        switchTeste.setOnCheckedChangeListener { _, isChecked ->
            txtStatus.text = if (isChecked) {
                "Status: switch ativado"
            } else {
                "Status: switch desativado"
            }
        }

        // Exercício 6: SeekBar mostra o valor selecionado
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                txtStatus.text = "Status: valor do seekbar = $progress"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
    }
}

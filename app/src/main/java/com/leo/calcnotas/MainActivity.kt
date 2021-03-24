package com.leo.calcnotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.leo.calcnotas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calcular.setOnClickListener{

            val num1= binding.nota1
            val num2= binding.nota2
            val num3= binding.nota3
            val num4= binding.nota4
            val faltas=binding.faltas
            val resultado=binding.txtaprov

            val nota1= Integer.parseInt(num1.text.toString())
            val nota2= Integer.parseInt(num2.text.toString())
            val nota3= Integer.parseInt(num3.text.toString())
            val nota4= Integer.parseInt(num4.text.toString())
            val nmrFaltas= Integer.parseInt(faltas.text.toString())

            val media= (nota1 + nota2 + nota3 +nota4)/4

            if (media>=5 && nmrFaltas <=20){
                resultado.setText("Aluno foi aprovado \n Média final $media")
                resultado.setTextColor(getColor(R.color.green))
            } else if(nmrFaltas>20){
                resultado.setText("Aluno foi Reprovados por faltas \n Média final $media")
                resultado.setTextColor(getColor(R.color.red))
            }else if (media<5){
                resultado.setText("Aluno foi Reprovados por Nota \n Média final $media")
                resultado.setTextColor(getColor(R.color.red))
            }
        }
    }
}
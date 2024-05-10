package com.example.restaurante

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurante.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //Recupera o valor da string “username” dos extras do Intent
        val username = intent.extras?.getString("username")

        //Se a string não estiver vazia ou nula, o texto da TextView textOla é definido como “Olá” seguido do valor do nome de usuário.
        if(!username.isNullOrEmpty()){
            binding.textOla.setText("Olá $username")
        }

        //A atividade é encerrada após o botão Fechar ser clicado
        binding.buttonFechar.setOnClickListener {
            finishAffinity()
        }

        binding.buttonPedir.setOnClickListener {

            //Um Intent é criado, apontando para a classe SplashActivity
            val i = Intent(this, SplashActivity::class.java)

            //Adiciona os valores das quantidades de pizza, salada e hambúrguer como extras na Intent
            i.putExtra("quantidadePizza", binding.editQuantidadePizza.text.toString())
            i.putExtra("quantidadeSalada", binding.editQuantidadeSalada.text.toString())
            i.putExtra("quantidadeHamburguer", binding.editQuantidadeHamburguer.text.toString())

            //A atividade especificada pelo Intent é iniciada
            startActivity(i)

            //A atividade atual é encerrada
            finish()
        }


        binding.checkPizza.setOnClickListener {
            if(binding.checkPizza.isChecked()){

                //Se a opção de pizza estiver marcada, defina a quantidade como 1
                binding.editQuantidadePizza.setText("1")

                //Torna o preço da pizza visível
                binding.textPrecoPizza.visibility = View.VISIBLE
                
            }else{

                //Caso contrário, defina a quantidade como 0
                binding.editQuantidadePizza.setText("0")

                //Oculta o preço da pizza
                binding.textPrecoPizza.visibility = View.GONE
            }
        }

        binding.checkSalada.setOnClickListener {
            if(binding.checkSalada.isChecked()){

                //Se a opção de salada estiver marcada, defina a quantidade como 1
                binding.editQuantidadeSalada.setText("1")

                //Torna o preço da salada visível
                binding.textPrecoSalada.visibility = View.VISIBLE
            }else{

                //Caso contrário, defina a quantidade como 0
                binding.editQuantidadeSalada.setText("0")

                //Oculta o preço da salada
                binding.textPrecoSalada.visibility = View.GONE
            }
        }

        binding.checkHamburger.setOnClickListener {
            if(binding.checkHamburger.isChecked()){

                //Se a opção de hambúrguer estiver marcada, defina a quantidade como 1
                binding.editQuantidadeHamburguer.setText("1")

                //Torna o preço do hambúrguer visível
                binding.textPrecoHamburguer.visibility = View.VISIBLE
                
            }else{

                //Caso contrário, defina a quantidade como 0
                binding.editQuantidadeHamburguer.setText("0")

                //Oculta o preço do hambúrguer
                binding.textPrecoHamburguer.visibility = View.GONE
            }
        }

    }
}

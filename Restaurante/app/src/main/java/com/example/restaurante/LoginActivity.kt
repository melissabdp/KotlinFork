package com.example.restaurante

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurante.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    
    //Criação da variável binding que servirá para manipular a tela.
    private lateinit var binding:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Infla o layout da atividade usando o binding
        binding = ActivityLoginBinding.inflate(layoutInflater)

        //Define o conteúdo da tela da atividade
        setContentView(binding.root)

        //Executa um bloco de código específico quando o botão “Entrar” for clicado.
        binding.buttonEntrar.setOnClickListener {

            //Obtém o texto do campo de usuário e remove espaços em branco
            val username = binding.editUsername.text.toString().trim()

            //Obtém o texto do campo de senha e remove espaços em branco
            val password = binding.editPassword.text.toString().trim()

            //Se o nome de usuário for "abc" e a senha for "123"
            if (username.equals("abc") && password.equals("123")) {

                //Cria uma intenção para iniciar a MainActivity
                val i = Intent(this, MainActivity::class.java)

                //Adiciona o nome de usuário como um extra na intenção
                i.putExtra("username", username)

                //Inicia a MainActivity
                startActivity(i)

                //Finaliza a atividade atual
                finish()

                //Caso contrário, exibe uma mensagem de erro
            } else {
                Toast.makeText(applicationContext, "Errou", Toast.LENGTH_LONG).show()
            }
        }

    }
}

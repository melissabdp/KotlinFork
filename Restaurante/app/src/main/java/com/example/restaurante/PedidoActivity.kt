package com.example.restaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.restaurante.databinding.ActivityPedidoBinding

class PedidoActivity : AppCompatActivity() {

    //Criação da variável binding
    private lateinit var binding: ActivityPedidoBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {

        //Infla o layout da atividade usando o binding
        binding = ActivityPedidoBinding.inflate(layoutInflater)
        
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //Obtém o Intent da atividade atual
        val i = intent

        //Obtém o valor da string extra "quantidadePizza" e converte para inteiro
        val quantidadePizza = i.getStringExtra("quantidadePizza").toString().toInt()

        //Obtém o valor da string extra "quantidadeSalada" e converte para inteiro
        val quantidadeSalada = i.getStringExtra("quantidadeSalada").toString().toInt()
        
        //Obtém o valor da string extra "quantidadeHamburguer" e converte para inteiro
        val quantidadeHamburguer = i.getStringExtra("quantidadeHamburguer").toString().toInt()

        //Cria a string texto que contém "Resumo do Pedido"
        val texto = "Resumo do Pedido\n" +

                //Multiplica a quantidade de pizza por 8
                "Pizza: $quantidadePizza Preço: ${quantidadePizza*8}\n" +

                //Multiplica a quantidade de salada por 10
                "Salada: $quantidadeSalada Preço: ${quantidadeSalada*10}\n" +

                //Multiplica a quantidade de hambúrguer por 12
                "Hamburguer: $quantidadeHamburguer Preço: ${quantidadeHamburguer*12}\n"

        //Atribui o conteúdo da string texto ao textResumo
        binding.textResumo.text = texto

    }
}

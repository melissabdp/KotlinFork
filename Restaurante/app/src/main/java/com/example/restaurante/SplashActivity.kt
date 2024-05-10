package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            
            //Cria um Intent
            val i = intent           
            
            //Cria um Intent para iniciar a atividade PedidoActivity
            val j = Intent(this,PedidoActivity::class.java)
            
            //Adiciona os extras do Intent original ao novo Intent
            j.putExtras(i)
            
            //Inicia a atividade
            startActivity(j)
            
            //O código será executado após um atraso de 2000 milissegundos
        },2000)
        
    }
}

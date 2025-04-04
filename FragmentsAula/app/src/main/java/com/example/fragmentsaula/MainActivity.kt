package com.example.fragmentsaula

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView
import com.example.fragmentsaula.fragments.ChamadasFragment
import com.example.fragmentsaula.fragments.ConversasFragment

class MainActivity : AppCompatActivity() {


    // botao de chamadas e  botao de converasa
    private lateinit var conversasButton : Button;
    private lateinit var chamdasButton : Button;


    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // adcionando nome da action bar
        supportActionBar?.title = "Voce me ama?"

        conversasButton = findViewById(R.id.converas_button)
        chamdasButton = findViewById(R.id.chamadas_button)

        val conversasFragment = ConversasFragment()
            conversasButton.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace( R.id.fragmentContainerView2,  conversasFragment )
                .commit()
        }

        chamdasButton.setOnClickListener {
            supportFragmentManager
                .beginTransaction()  // inicia a transicao
                .replace( R.id.fragmentContainerView2, ChamadasFragment()  )
                //.remove( conversasFragment )
                .commit()
        }
    }
}
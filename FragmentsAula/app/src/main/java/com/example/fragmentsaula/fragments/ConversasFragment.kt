package com.example.fragmentsaula.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentsaula.R
import android.widget.VideoView

//
class ConversasFragment : Fragment() {

    // metodo para construir a visualizacao do fragment
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(
            R.layout.fragment_conversas,
            container,
            false
        )

        //Processamento da visulização

        return view
        }
    }

    /*
        val view  =   inflater.inflate(

            R.layout.fragment_converas,
            container,
            false


        )
        // view.findViewById<>()
        // adcionando o findviewby id aqui eu poderia fazer o processamento


        //tem que retornar um inflate
       return inflater.inflate(
            //tem que importar o R antes de comecar
           //aqui estou acessando o pacote de layout, dos arquivos do layout vou usar o fragment conversas

            R.layout.fragment_converas,  // layout que quero utilizar
            container, // onde irei colocar o item
            false
        )

        return view;*/



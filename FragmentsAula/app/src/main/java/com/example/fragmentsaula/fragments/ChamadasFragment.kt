package com.example.fragmentsaula.fragments

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.VideoView
import androidx.fragment.app.Fragment
import com.example.fragmentsaula.R


class ChamadasFragment : Fragment() {



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val videoView: VideoView = view.findViewById(R.id.videoView2)

        val videoPath = "android.resource://" + requireContext().packageName + "/" + R.raw.bundiavideo
        val url = Uri.parse(videoPath)
        videoView.setVideoURI(Uri.parse(videoPath))
        videoView.start()
        videoView.setVideoURI(url)

        val midiacontroler = MediaController(this.activity)
        videoView.setMediaController(midiacontroler)
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //tem que importar o R antes de comecar
        //aqui estou acessando o pacote de layout, dos arquivos do layout vou usar o fragment conversas
        return inflater.inflate(
            R.layout.fragment_chamadas,  // layout eescoldoido
            container, // onde irei colocar o fragment
            false // anexo auutomatica
        )


    }
}
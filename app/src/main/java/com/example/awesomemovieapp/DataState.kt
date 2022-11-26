package com.example.awesomemovieapp

import android.view.View
import android.widget.Toast.LENGTH_SHORT
import com.google.android.material.snackbar.Snackbar

enum class DataState{
    LOADING,
    SUCCESS,
    ERROR
}

fun liveData(state: DataState, view: View){
    return when(state){
        DataState.LOADING -> {
            //tornar visible o progressbar
            println("Carregando...")
        }
        DataState.SUCCESS -> {
            //Ir para a tela
            println("Sucesso!")
        }
        DataState.ERROR -> {
            Snackbar.make(view,"Erro ao carregar este filme", LENGTH_SHORT).show()
            println("Erro!")
        }
    }
}



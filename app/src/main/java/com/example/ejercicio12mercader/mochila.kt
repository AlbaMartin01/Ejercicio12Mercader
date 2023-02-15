package com.example.ejercicio12mercader

import android.content.Context
import android.widget.Toast

class Mochila(private var pesoMochila: Int) {

    private var contenido = ArrayList<Objeto>()

    fun addObjeto(objeto: Objeto, context: Context){
        if (objeto.getPeso() <= pesoMochila){
            contenido.add(objeto)
            this.pesoMochila -= objeto.getPeso()
        } else{
            Toast.makeText(context, "La mochila está llena, debes vender artículos", Toast.LENGTH_LONG).show()
        }
        Toast.makeText(context, "Peso restante de la mochila: " + pesoMochila, Toast.LENGTH_LONG).show()
    }

    fun getPeso():Int{
        return pesoMochila
    }

}
package com.example.alerus_ejerciciosplayground.ejercicios.songapp

class Song(private var titulo: String, private var artista: String, private var anyoLanzamiento: Int) {

    private fun getTitulo (): String {

        return titulo

    }

    private fun getArtista (): String {

        return artista

    }

    private fun getAnyoLanzamiento (): Int {

        return anyoLanzamiento

    }

    fun esPopular(producciones:Int) {

        if (producciones < 1000) {

            println("La canción es poco popular")

        } else {

            println("La canción es popular")

        }

    }

    fun datos() {

        println("[" + this.getTitulo() + "], interpretada por [" + this.getArtista() + "], se lanzó en [" + this.getAnyoLanzamiento() + "].")

    }

}
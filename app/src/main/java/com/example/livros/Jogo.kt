package com.example.livros

import android.content.ContentValues
import java.util.Date

data class Jogo(
    var titulo: String,
    var idCategoria: Long,
    var isbn: String? = null,
    var dataLancamento: Date?,
    var id: Long = -1
) {
    fun toContentValues() : ContentValues {
        val valores = ContentValues()

        valores.put(TabelaJogos.CAMPO_TITULO, titulo)
        valores.put(TabelaJogos.CAMPO_ISBN, isbn)
        valores.put(TabelaJogos.CAMPO_DATA_LANC, dataLancamento?.timeInMillis)
        valores.put(TabelaJogos.CAMPO_FK_CATEGORIA, idCategoria)

        return valores
    }



}
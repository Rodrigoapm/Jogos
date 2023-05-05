package com.example.livros

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

private const val NOME_TABELA = "categorias"

class TabelaCategorias(db: SQLiteDatabase?) : TabelaBD(db, NOME_TABELA) {
    override fun cria() {
        TODO("Not yet implemented")
    db.execSQL("CREATE TABLE $NOME_TABELA (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, descricao TEXT NOT NULL)")
    }
}
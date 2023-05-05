package com.example.livros

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns


class TabelaJogos(db: SQLiteDatabase) : TabelaBD(db, NOME_TABELA) {

    override fun cria() {
        db.execSQL("CREATE TABLE $NOME_TABELA($CHAVE_TABELA, titulo TEXT NOT NULL, isbn TEXT, id_categoria INTERGER NOT NULL), FOREIGN KEY(id_categoria) REFERENCES ${TabelaCategorias.NOME_TABELA}(${BaseColumns._ID)} ON DELETE RESTRICT")
    }



    companion object{
        private const val NOME_TABELA = "jogos"

    }


}


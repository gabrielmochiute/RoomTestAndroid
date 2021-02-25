package com.example.roomtest.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

// () - construtor da classe

@Entity
data class Contato(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,

    @ColumnInfo(name = "nome")
    var nomeContato: String,

    @ColumnInfo(name = "telefone")
    var telefoneContato: String?
)
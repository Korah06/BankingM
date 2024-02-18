package com.example.bankingm.data

import androidx.compose.ui.graphics.Brush

data class Card(
    val cardType: CardType,
    val cardNumber: String,
    val cardName: String,
    val balance: Double,
    val cardColor: Brush
)

enum class CardType {
    VISA, MASTERCARD
}

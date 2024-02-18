package com.example.bankingm.ui.theme.widgets

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.StarHalf
import androidx.compose.material.icons.rounded.MonetizationOn
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.bankingm.data.Finance
import com.example.bankingm.ui.theme.BlueStart
import com.example.bankingm.ui.theme.GreenStart
import com.example.bankingm.ui.theme.OrangeStart
import com.example.bankingm.ui.theme.PurpleStart

@Composable
fun FinanceGrid() {
    Column {
        Text(text = "")
    }
}


val finance = listOf<Finance>(
    Finance(
        icon = Icons.Rounded.MonetizationOn,
        name = "Savings",
        iconBackground = OrangeStart
    ),
    Finance(
        icon = Icons.Rounded.Wallet,
        name = "My\nWallet",
        iconBackground = BlueStart
    ),
    Finance(
        icon = Icons.AutoMirrored.Rounded.StarHalf,
        name = "My\nBusiness",
        iconBackground = GreenStart
    ),
    Finance(
        icon = Icons.AutoMirrored.Rounded.StarHalf,
        name = "Finance",
        iconBackground = PurpleStart
    ),
)
package com.example.bankingm.ui.theme.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.StarHalf
import androidx.compose.material.icons.rounded.MonetizationOn
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankingm.data.Finance
import com.example.bankingm.ui.theme.BlueStart
import com.example.bankingm.ui.theme.GreenStart
import com.example.bankingm.ui.theme.OrangeStart
import com.example.bankingm.ui.theme.PurpleStart

@Composable
fun FinanceGrid() {
    Column {
        Text(
            text = "Finance",
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.onBackground,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )
        LazyRow {
            items(finances.size) {
                FinanceCard(it)
            }
        }
    }
}

@Composable
fun FinanceCard(index: Int) {
    val finance = finances[index]
    Box(modifier = Modifier.padding(4.dp))
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(25.dp))
            .background(MaterialTheme.colorScheme.secondary)
            .size(120.dp)
            .clickable {}
            .padding(13.dp),
        verticalArrangement = Arrangement.SpaceBetween,

    ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
                .background(finance.iconBackground)
                .padding(6.dp)
        ) {
            Icon(imageVector = finance.icon, contentDescription = finance.name, tint = Color.White)
        }
        Text(
            text = finance.name,
            fontSize = 15.sp,
            color = MaterialTheme.colorScheme.onSecondary,
            fontWeight = FontWeight.SemiBold,
        )
    }
    Box(modifier = Modifier.padding(4   .dp))


}

val finances = listOf<Finance>(
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
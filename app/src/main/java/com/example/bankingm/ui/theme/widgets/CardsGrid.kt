package com.example.bankingm.ui.theme.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankingm.R
import com.example.bankingm.data.Card
import com.example.bankingm.data.CardType
import com.example.bankingm.ui.theme.BlueStart
import com.example.bankingm.ui.theme.GreenStart
import com.example.bankingm.ui.theme.OrangeEnd
import com.example.bankingm.ui.theme.PurpleEnd


@Composable
fun CardsGrid() {
    LazyRow {
        items(cards.size) {
            CardItem(it)
        }
    }
}

@Composable
fun CardItem(index: Int) {
    val card = cards[index]
    val image = if (card.cardType == CardType.VISA)
        painterResource(id = R.drawable.ic_visa) else
        painterResource(id = R.drawable.ic_mastercard)

    Box(modifier = Modifier.padding(horizontal = 8.dp)) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(card.cardColor)
                .width(250.dp)
                .height(160.dp)
                .clickable {}
                .padding(vertical = 12.dp, horizontal = 16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = image,
                contentDescription = card.cardName,
                modifier = Modifier.width(60.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = card.cardName,
                color = Color.White,
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "${card.balance}€",
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = card.cardNumber,
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

val cards = listOf<Card>(
    Card(
        cardType = CardType.VISA,
        cardNumber = "1564 1628 9012 3215",
        cardName = "John Doe",
        balance = 13000.00,
        cardColor = getGradient(startColor = BlueStart, endColor = OrangeEnd)
    ),
    Card(
        cardType = CardType.MASTERCARD,
        cardNumber = "3827 3671 8462 4219",
        cardName = "John Doe",
        balance = 461.00,
        cardColor = getGradient(startColor = GreenStart, endColor = PurpleEnd)
    ),
)


fun getGradient(startColor: Color, endColor: Color): Brush {
    return Brush.horizontalGradient(
        colors = listOf(startColor, endColor)
    )
}
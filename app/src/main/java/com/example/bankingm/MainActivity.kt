package com.example.bankingm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ahmedapps.bankningappui.CurrenciesSection
import com.example.bankingm.ui.theme.BankingMTheme
import com.example.bankingm.ui.theme.widgets.BottomNavigationBar
import com.example.bankingm.ui.theme.widgets.CardsGrid
import com.example.bankingm.ui.theme.widgets.FinanceGrid
import com.example.bankingm.ui.theme.widgets.TopBar
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BankingMTheme {
                // A surface container using the 'background' color from the theme
                SetBarColor(color = MaterialTheme.colorScheme.background)
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    HomeScreen()

                }
            }
        }
    }

    @Composable
    private fun SetBarColor(color: Color) {
        val systemUiController = rememberSystemUiController()
        SideEffect {
            systemUiController.setStatusBarColor(color = color)
        }
    }
}

@Composable
fun HomeScreen() {
    Scaffold(
        bottomBar = { BottomNavigationBar() },
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            TopBar()
            CardsGrid()
            Spacer(modifier = Modifier.height(16.dp))
            FinanceGrid()
            CurrenciesSection()
        }

    }

}


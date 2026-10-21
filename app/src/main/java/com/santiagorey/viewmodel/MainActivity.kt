package com.santiagorey.viewmodel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.santiagorey.viewmodel.ui.theme.ViewModelTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            ViewModelTheme {

                val counterViewModel: CounterViewModel = viewModel()

                CounterScreen(
                    viewModel = counterViewModel
                )
            }
        }
    }
}
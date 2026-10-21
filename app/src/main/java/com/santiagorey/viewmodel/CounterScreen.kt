package com.santiagorey.viewmodel

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CounterScreen(
    viewModel: CounterViewModel
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Contador con ViewModel",
            fontSize = 28.sp
        )

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Text(
            text = "Estado actual:",
            fontSize = 18.sp
        )

        Spacer(
            modifier = Modifier.height(10.dp)
        )

        Text(
            text = "${viewModel.count}",
            fontSize = 50.sp
        )

        Spacer(
            modifier = Modifier.height(25.dp)
        )

        Row {

            Button(
                onClick = {
                    viewModel.decrease()
                }
            ) {
                Text("-")
            }

            Spacer(
                modifier = Modifier.width(15.dp)
            )

            Button(
                onClick = {
                    viewModel.increase()
                }
            ) {
                Text("+")
            }
        }

        Spacer(
            modifier = Modifier.height(15.dp)
        )

        Button(
            onClick = {
                viewModel.reset()
            }
        ) {
            Text("Reiniciar")
        }
    }
}
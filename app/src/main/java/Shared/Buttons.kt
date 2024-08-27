package Shared

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun Buttons() {
    var name by remember { mutableStateOf("") }
    var displayedName by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(10.dp)) {

        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text(text = "Ingrese el Nombre") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Button(
            onClick = { displayedName = name },
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text("Mostrar Nombre")
        }

        Button(
            onClick = { name = ""; displayedName = "" },
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text("Limpiar")
        }

        Text(
            text = "Nombre ingresado: $displayedName",
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}
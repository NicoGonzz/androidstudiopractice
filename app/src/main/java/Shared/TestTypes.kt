package Shared

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(showBackground = true)

fun EjemploText(){

    Column(modifier = Modifier.padding(10.dp)) {
        Text(
            text= "Texto simple"
        )
        HorizontalDivider(thickness = 2.dp)
        Buttons()
    }


}
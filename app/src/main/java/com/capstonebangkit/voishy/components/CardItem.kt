package com.capstonebangkit.voishy.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import com.capstonebangkit.voishy.R
import com.capstonebangkit.voishy.ui.theme.VoishyTheme

@Composable
fun CardItem(materialTitle : String) {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),

    ) {
        Column {
            Image(
                painter = painterResource(R.drawable.profile),
                contentDescription = "Banner Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.requiredHeight(200.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = materialTitle,
                    style = MaterialTheme.typography.titleMedium
                )
                OutlinedButton(
                    onClick = { /* Do something when the button is clicked */ }
                ) {
                    Text("Read")
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardItemPreview() {
    VoishyTheme {
        CardItem(materialTitle = "Test")
    }
}
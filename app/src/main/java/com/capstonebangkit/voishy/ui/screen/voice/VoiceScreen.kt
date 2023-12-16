package com.capstonebangkit.voishy.ui.screen.voice

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.RecordVoiceOver
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.capstonebangkit.voishy.components.SectionText

@Composable
fun VoiceScreen() {
    val Iris100 = Color(0xFF9179F2)
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 24.dp, vertical = 16.dp)
    ) {
        SectionText(
            title = "Practice Your Speaking!",
            description = "Let’s tame the shyness with speaking the following text and see the results",
            color = Color.Black,
            type = "medium"
        )

        Button(
            onClick = { /* TODO: Handle recording action */ },
            colors = ButtonDefaults.buttonColors(containerColor = Iris100),
            contentPadding = PaddingValues(horizontal = 24.dp, vertical = 12.dp),
            // Modify this to set the button's width and height if necessary
            modifier = Modifier.height(48.dp).fillMaxWidth() // Height can be adjusted as needed
        ) {
            Icon(
                imageVector = Icons.Default.RecordVoiceOver,
                contentDescription = "Record",
                tint = Color.White
            )
            Spacer(modifier = Modifier.width(8.dp)) // Space between icon and text
            Text(
                text = "Tap to Record",
                color = Color.White,
                fontSize = 16.sp // Set the font size to match your design
            )
        }
    }
}

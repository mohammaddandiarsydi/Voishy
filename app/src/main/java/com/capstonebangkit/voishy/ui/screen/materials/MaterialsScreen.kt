package com.capstonebangkit.voishy.ui.screen.materials

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.capstonebangkit.voishy.components.CardItem
import com.capstonebangkit.voishy.components.SectionText

@Composable
fun MaterialsScreen(){
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Column(modifier = Modifier.padding(horizontal = 24.dp, vertical = 16.dp)) {
            SectionText(
                title = "Let's Learn!",
                description = "Read our helpful material regarding speaking and more!",
                color = Color.Black,
                type = "large"
            )
            CardItem(materialTitle = "Material One")
        }

        Column(modifier = Modifier.padding(horizontal = 24.dp, vertical = 16.dp)) {
            SectionText(
                title = "Movie Recommendation",
                description = "Here are some movie recommendation for you to watch and learn",
                color = Color.Black,
                type = "medium"
            )
            CardItem(materialTitle = "Material One")
        }
    }
}
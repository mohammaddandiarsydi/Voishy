package com.capstonebangkit.voishy.ui.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.capstonebangkit.voishy.R
import com.capstonebangkit.voishy.components.CardItem
import com.capstonebangkit.voishy.components.SectionText
import com.capstonebangkit.voishy.ui.theme.VoishyTheme

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Banner()
        Column(modifier = Modifier.padding(horizontal = 24.dp, vertical = 16.dp)) {
            SectionText(
                title = "Let's Learn!",
                description = "Read our helpful material regarding speaking and more!",
                color = Color.Black,
                type = "large"
            )
            CardItem(materialTitle = "Material One")
        }
    }
}

@Composable
fun Banner(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        Image(
            painter = painterResource(R.drawable.profile),
            contentDescription = "Banner Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.requiredHeight(300.dp)
        )
        Column(
            modifier = Modifier
                .matchParentSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Bottom
        ) {
            SectionText(
                title = stringResource(R.string.welcome_to_voishy),
                description = stringResource(R.string.taming_your_shyness_with_speaking),
                color = Color.White,
                type = "medium"
            )
        }
    }
}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun ScreenPreview() {
    VoishyTheme {
        HomeScreen()
    }
}
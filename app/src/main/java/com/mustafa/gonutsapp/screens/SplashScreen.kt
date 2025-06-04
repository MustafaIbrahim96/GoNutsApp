package com.mustafa.gonutsapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mustafa.gonutsapp.R
import com.mustafa.gonutsapp.ui.theme.BackGroundScreenColor
import com.mustafa.gonutsapp.ui.theme.Inter_Font
import com.mustafa.gonutsapp.ui.theme.SubTitleColor
import com.mustafa.gonutsapp.ui.theme.TitleColor

@Composable
fun SplashScreen() {
    /* val systemUiController = rememberSystemUiController()

     SideEffect {
         systemUiController.setStatusBarColor(
             color = BackGroundScreenColor,
             darkIcons = true
         )
     }*/

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundScreenColor)
    ) {
        Box(
            modifier = Modifier.height(579.dp)
        ) {
            Image(painter = painterResource(R.drawable.img_all_donuts),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillBounds)
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column(Modifier.align(Alignment.BottomCenter).padding(horizontal = 40.dp)) {
                Text(
                    modifier = Modifier.width(193.dp),
                    fontWeight = FontWeight.Bold,
                    fontFamily = Inter_Font,
                    text = "Gonuts with Donuts",
                    color = TitleColor,
                    fontSize = 54.sp,
                    letterSpacing = 0.sp,
                    lineHeight = 60.sp
                )
                Text(
                    modifier = Modifier.fillMaxWidth().padding(top = 19.dp),
                    fontWeight = FontWeight.Medium,
                    text = "Gonuts with Donuts is a Sri Lanka dedicated food outlets for specialize manufacturing of Donuts in Colombo, Sri Lanka.",
                    color = SubTitleColor,
                    fontSize = 18.sp,
                    letterSpacing = 0.sp,
                    fontFamily = Inter_Font,
                    lineHeight = TextUnit.Unspecified
                )
                Spacer(modifier = Modifier.padding(top = 60.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 40.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .background(Color.White),
                ) {
                    Text(
                        modifier = Modifier.padding(vertical = 22.dp).height(24.dp).fillMaxWidth(),
                        text = "Get Started",
                        fontSize = 20.sp,
                        letterSpacing = 0.sp,
                        fontFamily = Inter_Font,
                        lineHeight = TextUnit.Unspecified,
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun SplashScreenPreview() {
    SplashScreen()
}
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mustafa.gonutsapp.R
import com.mustafa.gonutsapp.ui.theme.BackGroundScreenColor
import com.mustafa.gonutsapp.ui.theme.SubTitleColor
import com.mustafa.gonutsapp.ui.theme.TitleColor

@Composable
fun SplashScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundScreenColor)
    ) {
        Box(
            modifier = Modifier
                .height(147.dp)
                .width(167.dp)
        ) {
            Image(painter = painterResource(R.drawable.img_first_dount), contentDescription = null)
        }
        Box(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(top = 40.dp, end = 33.dp)
                .height(155.dp)
                .width(210.dp)
        ) {
            Image(painter = painterResource(R.drawable.img_second_dount), contentDescription = null)
        }
        Box {
            Image(painter = painterResource(R.drawable.img_all_dount), contentDescription = null)
        }
        Box(
            modifier = Modifier
                .padding(top = 284.dp, end = 33.dp)
                .height(155.dp)
                .width(210.dp)
        ) {
            Image(painter = painterResource(R.drawable.img_third_dount), contentDescription = null)
        }
        Box(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(top = 388.dp)
                .height(155.dp)

        ) {
            Image(painter = painterResource(R.drawable.img_forth_dount), contentDescription = null)
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    top = 451.dp,
                    start = 40.dp,
                    end = 40.dp,
                    bottom = 46.dp
                )
        ) {
            Column(Modifier.fillMaxSize()) {
                Text(
                    modifier = Modifier.width(193.dp),
                    fontWeight = FontWeight.Bold,
                    text = "Gonuts with Donuts",
                    color = TitleColor,
                    fontSize = 54.sp,
                    lineHeight = 54.sp
                )
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    fontWeight = FontWeight.Medium,
                    text = "Gonuts with Donuts is a Sri Lanka dedicated food outlets for specialize manufacturing of Donuts in Colombo, Sri Lanka.",
                    color = SubTitleColor,
                    fontSize = 18.sp,
                    lineHeight = 18.sp
                )
                Spacer(modifier = Modifier.weight(1f))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(50.dp))
                        .background(Color.White),
                ) {
                    Text(
                        modifier = Modifier.padding(vertical = 22.dp).fillMaxWidth(),
                        text = "Get Started",
                        fontSize = 20.sp,
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
package com.mustafa.gonutsapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mustafa.gonutsapp.R
import com.mustafa.gonutsapp.ui.theme.BackGroundScreenColor
import com.mustafa.gonutsapp.ui.theme.Black60Color
import com.mustafa.gonutsapp.ui.theme.ChocolateGlazeColor
import com.mustafa.gonutsapp.ui.theme.StrawberryWhellColor
import com.mustafa.gonutsapp.ui.theme.TitleColor

@Composable
fun LetsDountsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .padding(start = 38.dp, top = 81.dp)
                .weight(1f)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 40.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Column {
                    Text(
                        text = "Let’s Gonuts!",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = TitleColor,
                        lineHeight = 30.sp
                    )
                    Text(
                        text = "Order your favourite donuts from here",
                        color = Black60Color,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium,
                        lineHeight = 14.sp
                    )
                }

                Box(
                    modifier = Modifier
                        .padding(top = 3.dp)
                        .size(45.dp)
                        .clip(RoundedCornerShape(15.dp))
                        .background(BackGroundScreenColor)
                ) {
                    Icon(
                        modifier = Modifier
                            .size(24.dp)
                            .align(Alignment.Center),
                        painter = painterResource(R.drawable.ic_search),
                        contentDescription = "search icon",
                        tint = TitleColor
                    )
                }
            }
            Text(
                modifier = Modifier.padding(top = 54.dp),
                text = "Today Offers",
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                lineHeight = 20.sp
            )
            Row(
                modifier = Modifier
                    .padding(top = 25.dp)
                    .fillMaxWidth().horizontalScroll(rememberScrollState())
            ) {

                Box(modifier = Modifier.width(229.dp)) {

                    Box(modifier = Modifier.width(193.dp)) {
                        Column(
                            modifier = Modifier
                                .clip(RoundedCornerShape(20.dp))
                                .background(StrawberryWhellColor)
                                .fillMaxWidth()
                        ) {
                            Box(
                                modifier = Modifier
                                    .padding(top = 15.dp, start = 15.dp)
                                    .clip(CircleShape)
                                    .size(35.dp)
                                    .background(Color.White)
                            ) {
                                Icon(
                                    modifier = Modifier.align(Alignment.Center),
                                    painter = painterResource(R.drawable.ic_fav),
                                    contentDescription = "fav ic",
                                    tint = TitleColor
                                )
                            }
                            Text(
                                modifier = Modifier.padding(top = 162.dp, start = 20.dp),
                                text = "Strawberry Wheel",
                                color = Color.Black,
                                fontWeight = FontWeight.Medium,
                                fontSize = 16.sp
                            )
                            Text(
                                modifier = Modifier.padding(top = 9.dp, start = 20.dp, end = 16.dp).width(156.dp),
                                text = "These Baked Strawberry Donuts are filled with fresh strawberries...",
                                color = Black60Color,
                                fontWeight = FontWeight.Normal,
                                fontSize = 12.sp,
                                lineHeight = 16.sp,
                                letterSpacing = 0.7.sp
                            )
                            Row(
                                modifier = Modifier
                                    .align(Alignment.End)
                                    .padding(end = 20.dp, top = 5.dp, bottom = 15.dp),
                                verticalAlignment = Alignment.Bottom
                            ) {
                                Text(
                                    text = "$20",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    lineHeight = 22.sp,
                                    color = Black60Color
                                )
                                Text(modifier = Modifier.padding(start = 5.dp),
                                    text = "$16",
                                    fontSize = 22.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    lineHeight = 22.sp,
                                    color = Color.Black
                                )
                            }

                        }
                    }
                    Image(
                        modifier = Modifier
                            .padding(top = 50.dp)
                            .align(Alignment.TopEnd),
                        painter = painterResource(R.drawable.img_donut_card_1),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds
                    )

                }
                Box(modifier = Modifier.padding(start = 10.dp, end = 10.dp).width(246.dp)) {

                    Box(modifier = Modifier.width(210.dp)) {
                        Column(
                            modifier = Modifier
                                .clip(RoundedCornerShape(20.dp))
                                .background(ChocolateGlazeColor)
                                .fillMaxWidth()
                        ) {
                            Box(
                                modifier = Modifier
                                    .padding(top = 15.dp, start = 15.dp)
                                    .clip(CircleShape)
                                    .size(35.dp)
                                    .background(Color.White)
                            ) {
                                Icon(
                                    modifier = Modifier.align(Alignment.Center),
                                    painter = painterResource(R.drawable.ic_fav),
                                    contentDescription = "fav ic",
                                    tint = TitleColor
                                )
                            }
                            Text(
                                modifier = Modifier.padding(top = 162.dp, start = 20.dp),
                                text = "Chocolate Glaze",
                                color = Color.Black,
                                fontWeight = FontWeight.Medium,
                                fontSize = 16.sp
                            )
                            Text(
                                modifier = Modifier.padding(top = 9.dp, start = 20.dp, end = 16.dp),
                                text = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                                color = Black60Color,
                                fontWeight = FontWeight.Normal,
                                fontSize = 12.sp,
                                lineHeight = 16.sp,
                                letterSpacing = 0.5.sp
                            )
                            Row(
                                modifier = Modifier
                                    .align(Alignment.End)
                                    .padding(end = 20.dp, top = 5.dp, bottom = 15.dp),
                                verticalAlignment = Alignment.Bottom
                            ) {
                                Text(
                                    text = "$20",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    lineHeight = 22.sp,
                                    color = Black60Color
                                )
                                Text(modifier = Modifier.padding(start = 5.dp),
                                    text = "$16",
                                    fontSize = 22.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    lineHeight = 22.sp,
                                    color = Color.Black
                                )
                            }

                        }
                    }
                    Image(
                        modifier = Modifier
                            .padding(top = 50.dp)
                            .align(Alignment.TopEnd),
                        painter = painterResource(R.drawable.img_donut_card_2),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds
                    )

                }

            }
            Text(modifier = Modifier.padding(top = 46.dp), text = "Donuts", color = Color.Black)
        }

    }
}

@Preview
@Composable
fun LetsDountsScreenPreview() {
    LetsDountsScreen()
}
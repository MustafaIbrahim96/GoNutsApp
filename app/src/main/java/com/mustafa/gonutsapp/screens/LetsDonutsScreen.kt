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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mustafa.gonutsapp.R
import com.mustafa.gonutsapp.ui.theme.BackGroundScreenColor
import com.mustafa.gonutsapp.ui.theme.Black60Color
import com.mustafa.gonutsapp.ui.theme.ChocolateGlazeColor
import com.mustafa.gonutsapp.ui.theme.Inter_Font
import com.mustafa.gonutsapp.ui.theme.LightOfWhiteColor
import com.mustafa.gonutsapp.ui.theme.LightOfWhiteColor1
import com.mustafa.gonutsapp.ui.theme.StrawberryWhellColor
import com.mustafa.gonutsapp.ui.theme.TitleColor

@Composable
fun LetsDonutsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color.White, LightOfWhiteColor)
                )
            )
    ) {
        Column(
            modifier = Modifier
                .padding(start = 38.dp, top = 74.dp)
                .weight(1f)
                .verticalScroll(rememberScrollState())
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
                        fontFamily = Inter_Font,
                        lineHeight = TextUnit.Unspecified,
                        letterSpacing = 0.sp
                    )
                    Text(
                        text = "Order your favourite donuts from here",
                        color = Black60Color,
                        fontSize = 14.sp,
                        fontFamily = Inter_Font,
                        fontWeight = FontWeight.Medium,
                        lineHeight = TextUnit.Unspecified,
                        letterSpacing = 0.sp
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
                modifier = Modifier.padding(top = 46.dp),
                text = "Today Offers",
                color = Color.Black,
                fontSize = 20.sp,
                fontFamily = Inter_Font,
                fontWeight = FontWeight.SemiBold,
                lineHeight = TextUnit.Unspecified
            )
            Row(
                modifier = Modifier
                    .padding(top = 22.dp)
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState())
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
                                modifier = Modifier.padding(top = 144.dp, start = 20.dp),
                                text = "Strawberry Wheel",
                                color = Color.Black,
                                fontWeight = FontWeight.Medium,
                                fontFamily = Inter_Font,
                                fontSize = 16.sp,
                                letterSpacing = 0.sp
                            )
                            Text(
                                modifier = Modifier
                                    .padding(top = 9.dp, start = 20.dp, end = 16.dp)
                                    .width(156.dp),
                                text = "These Baked Strawberry Donuts are filled with fresh strawberries...",
                                color = Black60Color,
                                fontWeight = FontWeight.Normal,
                                fontFamily = Inter_Font,
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
                                    lineHeight = TextUnit.Unspecified,
                                    fontFamily = Inter_Font,
                                    color = Black60Color
                                )
                                Text(
                                    modifier = Modifier.padding(start = 5.dp),
                                    text = "$16",
                                    fontSize = 22.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    lineHeight = TextUnit.Unspecified,
                                    fontFamily = Inter_Font,
                                    color = Color.Black
                                )
                            }

                        }
                    }
                    Image(
                        modifier = Modifier
                            .padding(top = 36.dp)
                            .align(Alignment.TopEnd),
                        painter = painterResource(R.drawable.img_donut_card_1),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds
                    )

                }
                Box(
                    modifier = Modifier
                        .padding(start = 10.dp, end = 10.dp)
                        .width(246.dp)
                ) {

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
                                modifier = Modifier.padding(top = 152.dp, start = 20.dp),
                                text = "Chocolate Glaze",
                                color = Color.Black,
                                fontWeight = FontWeight.Medium,
                                fontFamily = Inter_Font,
                                letterSpacing = 0.sp,
                                fontSize = 16.sp
                            )
                            Text(
                                modifier = Modifier.padding(top = 9.dp, start = 20.dp, end = 16.dp),
                                text = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                                color = Black60Color,
                                fontWeight = FontWeight.Normal,
                                fontFamily = Inter_Font,
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
                                    lineHeight = TextUnit.Unspecified,
                                    fontFamily = Inter_Font,
                                    letterSpacing = 0.sp,
                                    color = Black60Color
                                )
                                Text(
                                    modifier = Modifier.padding(start = 5.dp),
                                    text = "$16",
                                    fontSize = 22.sp,
                                    lineHeight = TextUnit.Unspecified,
                                    fontFamily = Inter_Font,
                                    letterSpacing = 0.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color.Black
                                )
                            }

                        }
                    }
                    Image(
                        modifier = Modifier
                            .padding(top = 40.dp)
                            .align(Alignment.TopEnd),
                        painter = painterResource(R.drawable.img_donut_card_2),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds
                    )

                }

            }
            Text(
                modifier = Modifier.padding(top = 42.dp),
                text = "Donuts",
                color = Color.Black,
                letterSpacing = 0.sp,
                fontSize = 20.sp,
                fontFamily = Inter_Font,
                fontWeight = FontWeight.SemiBold,
                lineHeight = TextUnit.Unspecified
            )

            Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                CardDonuts(
                    modifier = Modifier.padding(top = 17.dp, end = 10.dp),
                    imageDonuts = painterResource(R.drawable.img_donuts_one),
                    title = "Chocolate Cherry",
                    subTitle = "$22"
                )
                CardDonuts(
                    modifier = Modifier.padding(top = 17.dp, start = 10.dp, end = 10.dp),
                    imageDonuts = painterResource(R.drawable.img_donuts_two),
                    title = "Strawberry Rain",
                    subTitle = "$22"
                )
                CardDonuts(
                    modifier = Modifier.padding(top = 17.dp, start = 10.dp,end = 40.dp),
                    imageDonuts = painterResource(R.drawable.img_donuts_three),
                    title = "Strawberry ",
                    subTitle = "$22"
                )
            }

        }
        Row(
            modifier = Modifier
                .padding(
                    start = 46.dp,
                    end = 46.dp,
                    bottom = 22.dp
                )
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_home),
                contentDescription = null,
                tint = TitleColor
            )
            Icon(
                painter = painterResource(R.drawable.ic_heart_navigation),
                contentDescription = null,
                tint = TitleColor
            )
            Icon(
                painter = painterResource(R.drawable.ic_notification),
                contentDescription = null,
                tint = TitleColor
            )
            Icon(
                painter = painterResource(R.drawable.ic_buy),
                contentDescription = null,
                tint = TitleColor
            )
            Icon(
                painter = painterResource(R.drawable.ic_profile),
                contentDescription = null,
                tint = TitleColor
            )
        }
    }
}

@Composable
fun CardDonuts(modifier: Modifier, imageDonuts: Painter, title: String, subTitle: String) {

    Box(modifier = modifier.width(136.dp)) {
        Box(
            modifier = Modifier
                .padding(top = 56.dp)
                .height(111.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 20.dp,
                        topEnd = 20.dp,
                        bottomStart = 10.dp,
                        bottomEnd = 10.dp
                    )
                ).fillMaxWidth()
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(top = 40.dp, bottom = 20.dp)

                    .padding(start = 11.dp, end = 9.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = title,
                    color = Black60Color,
                    fontSize = 14.sp,
                    lineHeight = TextUnit.Unspecified,
                    letterSpacing = 0.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = Inter_Font,
                )
                Text(
                    modifier = Modifier.padding(top = 10.dp),
                    text = subTitle,
                    color = TitleColor,
                    fontSize = 14.sp,
                    lineHeight = TextUnit.Unspecified,
                    letterSpacing = 0.sp,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = Inter_Font,
                )
            }
        }
        Image(
            modifier = Modifier
                .padding(start = 22.dp)
                .height(112.dp),
            painter = imageDonuts,
            contentDescription = null
        )
    }

}

@Preview
@Composable
fun LetsDountsScreenPreview() {
    LetsDonutsScreen()
}
package com.example.namecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.namecard.ui.theme.NameCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NameCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NameCardApp()
                }
            }
        }
    }
}

@Composable
fun NameCardApp() {
    Surface(color = Color(0xff89cff0)) {
        Column (
            modifier = Modifier
                //fillMaxWidth()
                //fillMaxHeight()
                .fillMaxSize()
                .padding(top = 100.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column (
                modifier = Modifier,
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val image = painterResource(id = R.drawable.pasphoto)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier
                        .size(260.dp)
                )
                Text(
                    text = stringResource(id = R.string.FullName),
                    modifier = Modifier.padding(bottom = 8.dp),
                    fontSize = 27.sp,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = stringResource(id = R.string.Title),
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }
            Column (
                modifier = Modifier
                    .padding(top =100.dp),
            ) {
                Row {
                    val PhoneIcon = painterResource(id = R.drawable.phone)
                    Icon(
                        painter = PhoneIcon,
                        contentDescription = "Phone",
                        modifier = Modifier,
                        tint = Color.Black
                    )
                    Text(
                        text = stringResource(R.string.Telp),
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 8.dp, bottom = 8.dp),
                        textAlign = TextAlign.Justify,
                    )
                }
                Row {
                    val IgIcon = painterResource(id = R.drawable.ig)
                    Icon(
                        painter = IgIcon ,
                        contentDescription = "Social Media",
                        modifier = Modifier,
                        tint = Color.Black
                    )
                    Text(
                        text = stringResource(R.string.Ig),
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 8.dp,bottom= 8.dp),
                        textAlign = TextAlign.Justify,
                    )
                }
                Row {
                    val EmailIcon = painterResource(id = R.drawable.email)
                    Icon(
                        painter = EmailIcon,
                        contentDescription = "Email",
                        modifier = Modifier,
                        tint = Color.Black
                    )
                    Text(
                        text = stringResource(id = R.string.Email),
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 8.dp, bottom = 8.dp),
                        textAlign = TextAlign.Justify,
                    )
                    }
                }
            }
        }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NameCardTheme {
        NameCardApp()
    }
}
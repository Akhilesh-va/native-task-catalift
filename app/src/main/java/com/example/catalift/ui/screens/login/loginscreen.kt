package com.example.catalift.ui.screens.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.catalift.R
import com.example.catalift.ui.screens.personal_details.personal_details_componentss.FormTextfield


@Composable
fun LoginScreen( onSignInClick: () -> Unit) {
    var phoneNumber by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AsyncImage(
            model = R.drawable.login, contentDescription = "login",
            modifier = Modifier.size(300.dp)
        )
        Column(
            horizontalAlignment = Alignment.End
        ) {
            HorizontalDivider(
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(start = 200.dp, end = 51 .dp)
                    .width(170.dp), color = colorResource(R.color.text_color), thickness = 5.dp
            )

        }
        Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append("CATA")
                }
                withStyle(style = SpanStyle(fontWeight = FontWeight.Normal)) {
                    append("LIFT")
                }
            }, color = colorResource(R.color.text_color), fontSize = 48.sp, letterSpacing = 6.sp
        )
        Spacer(modifier = Modifier.height(32.dp))
        Text(
            text = "Give your career an EXTRA boost",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.text_color)
        )
        Spacer(modifier = Modifier.height(32.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Sign-In",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(R.color.text_color)
            )
            Text(
                text = "Privacy Policy",
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                color = colorResource(R.color.text_color),
                style = TextStyle(textDecoration = TextDecoration.Underline)
            )
        }
        FormTextfield(
            value = phoneNumber,
            label = "Phone number",
            placeholder = "Phone number",
            required = false,
            onValueChange = { phoneNumber = it },
            modifier = Modifier,
            shape = RoundedCornerShape(20.dp)

        )
        FormTextfield(
            value = password,
            label = "Password",
            placeholder = "Password",
            required = false,
            onValueChange = { password = it},
            modifier = Modifier,
            shape = RoundedCornerShape(20.dp)

        )
        Spacer(modifier = Modifier.height(16.dp))
        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {

            Row() {
                Text(
                    text = "Google Sign-In",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Gray,


                    )
                Spacer(modifier = Modifier.width(10.dp))
                AsyncImage(
                    model = R.drawable.google_icon,
                    "",
                    modifier = Modifier.size(24.dp)


                )

            }
            Text(
                text = "Forgot Password?",
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                color = Color.Gray,
                style = TextStyle(textDecoration = TextDecoration.Underline),

            )

        }

        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = onSignInClick,
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.text_color))
        ) {
            Text(text = "Sign-In", color = Color.White)
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(fontWeight = FontWeight.Normal)) {
                    append("Don't An Account?  ")
                }
                withStyle(
                    style = SpanStyle(
                        fontWeight = FontWeight.Normal,
                        color = colorResource(R.color.text_color),
                        textDecoration = TextDecoration.Underline

                    ),
                ) {
                    append("Sign-Up")
                }
            }, color = Color.Gray, fontSize = 16.sp
        )


    }

}


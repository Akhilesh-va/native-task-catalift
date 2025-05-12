package com.example.catalift.ui.screens.personal_details.personal_details_componentss

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.example.catalift.R

@Composable

fun FormLabel(
    text: String,
    required: Boolean = false,
    modifier: Modifier = Modifier
) {
    Text(
        buildAnnotatedString {
            append(text)
            if (required) {
                withStyle(style = SpanStyle(color = Color.Red)) {
                    append(" *")
                }
            }
        },
        color = colorResource(id = R.color.text_color),
        modifier = modifier
    )
}

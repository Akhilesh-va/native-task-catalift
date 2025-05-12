package com.example.catalift.ui.screens.personal_details.personal_details_componentss

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.unit.dp
import com.example.catalift.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormTextfield(shape: RoundedCornerShape,modifier: Modifier,value: String, label: String, placeholder: String, required:Boolean, onValueChange: (String) -> Unit) {


    Column(modifier = Modifier.padding(bottom = 8.dp)) {
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            placeholder = { Text(placeholder) },
            label = {
                if(required) {
                    Text(
                        buildAnnotatedString {
                            append(label )
                            withStyle(style = SpanStyle(color = Color.Red)) {
                                append(" *")
                            }
                        }
                        , color = colorResource(id =R.color.text_color)
                    )
                }
                else{
                    Text(label , color = colorResource(id =R.color.text_color))
                }
            },

            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = colorResource(R.color.text_color),
                unfocusedBorderColor = colorResource(R.color.text_color),
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black
            ),
            modifier = Modifier.fillMaxWidth(),
            shape = shape
        )
    }
}


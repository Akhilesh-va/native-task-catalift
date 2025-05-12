package com.example.catalift.ui.screens.personal_details

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.catalift.R
import com.example.catalift.ui.screens.personal_details.personal_details_componentss.DateOfBirthPicker
import com.example.catalift.ui.screens.personal_details.personal_details_componentss.Dropdown
import com.example.catalift.ui.screens.personal_details.personal_details_componentss.FormLabel
import com.example.catalift.ui.screens.personal_details.personal_details_componentss.FormTextfield

@Composable
fun PersonalDetailScreen() {
    val scrollState = rememberScrollState()
    var fullname by remember { mutableStateOf("") }
    var studentId by remember { mutableStateOf("") }
    var motherTongue by remember { mutableStateOf("") }
    var phoneNumber by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var linkedin by remember { mutableStateOf("") }

    var motherTongueExpanded by remember { mutableStateOf(false) }
    var genderExpanded by remember { mutableStateOf(false) }

    val languageOptions = listOf("English", "Hindi", "Spanish", "French", "Mandarin", "Arabic", "Other")
    val genderOptions = listOf("Male", "Female", "Other", "Prefer not to say")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 8.dp , end = 8.dp , top = 32.dp).
        verticalScroll(scrollState),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Text(
            text = "Your Personal Details",
            fontSize = 28.sp,
            fontWeight = FontWeight.Medium,
            color = colorResource(id = R.color.text_color),
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Column {
            FormLabel("Full name", true, modifier = Modifier)
            FormTextfield(
                value = fullname,
                label = "",
                placeholder = "Enter Full Name",
                onValueChange = { fullname = it },
                required = false,
                modifier = Modifier,
                shape = RoundedCornerShape(10.dp)
            )
        }

        Column {
            FormLabel("Student ID", false, modifier = Modifier)
            FormTextfield(
                value = studentId,
                label = "",
                placeholder = "Enter Student ID",
                onValueChange = { studentId = it },
                required = false,
                modifier = Modifier,
                shape = RoundedCornerShape(10.dp)
            )
        }

        DateOfBirthPicker()

        Column(modifier = Modifier.padding(bottom = 8.dp)) {
            FormLabel("Mother Tongue", true, modifier = Modifier.padding(bottom = 8.dp))
            Dropdown(
                items = languageOptions,
                expanded = motherTongueExpanded,
                onExpandedChange = { motherTongueExpanded = it },
                selectedItem = motherTongue,
                onItemSelected = { motherTongue = it }
            )
        }

        Column(modifier = Modifier.padding(bottom = 8.dp)) {
            FormLabel("Gender", true, modifier = Modifier.padding(bottom = 8.dp))
            Dropdown(
                items = genderOptions,
                expanded = genderExpanded,
                onExpandedChange = { genderExpanded = it },
                selectedItem = gender,
                onItemSelected = { gender = it }
            )
        }

        Column {
            FormLabel("Phone Number", true, modifier = Modifier.padding(bottom = 8.dp))
            FormTextfield(
                value = phoneNumber,
                label = "",
                placeholder = "Enter Phone Number",
                onValueChange = { phoneNumber = it },
                required = false,
                modifier = Modifier,
                shape = RoundedCornerShape(10.dp)
            )
        }

        Column {
            FormLabel("Email", true, modifier = Modifier.padding(bottom = 8.dp))
            FormTextfield(
                value = email,
                label = "",
                placeholder = "Enter Email",
                onValueChange = { email = it },
                required = false,
                modifier = Modifier,
                shape = RoundedCornerShape(10.dp)
            )
        }

        Column {
            FormLabel("Linkedin", false, modifier = Modifier.padding(bottom = 8.dp))
            FormTextfield(
                value = linkedin,
                label = "",
                placeholder = "Enter Linkedin",
                onValueChange = { linkedin = it },
                required = false,
                modifier = Modifier ,
                shape = RoundedCornerShape(10.dp)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PersonalDetailScreenPreview() {
    PersonalDetailScreen()
}

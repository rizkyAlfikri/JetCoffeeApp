package com.alfikri.rizky.jetcoffee.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

/**
 * @author Rizky Alfikri Rachmat (rizkyalfikri@gmail.com)
 * @version SectionText, v 0.1 11/18/2022 9:48 PM by Rizky Alfikri Rachmat
 */
@Composable
fun SectionText(
    title: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = title,
        style = MaterialTheme.typography.h5.copy(
            fontWeight = FontWeight.ExtraBold
        ),
        modifier = modifier.padding(horizontal = 16.dp, vertical = 8.dp)
    )
}
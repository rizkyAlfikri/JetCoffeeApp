package com.alfikri.rizky.jetcoffee.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * @author Rizky Alfikri Rachmat (rizkyalfikri@gmail.com)
 * @version HomeSection, v 0.1 11/19/2022 8:48 PM by Rizky Alfikri Rachmat
 */
@Composable
fun HomeSection(
    title: String,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Column(modifier = modifier) {
        SectionText(title = title)
        content()
    }

}
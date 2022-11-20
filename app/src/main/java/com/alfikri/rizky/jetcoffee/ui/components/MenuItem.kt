package com.alfikri.rizky.jetcoffee.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alfikri.rizky.jetcoffee.R
import com.alfikri.rizky.jetcoffee.model.Menu

/**
 * @author Rizky Alfikri Rachmat (rizkyalfikri@gmail.com)
 * @version MenuItem, v 0.1 11/19/2022 8:08 PM by Rizky Alfikri Rachmat
 */
@Composable
fun MenuItem(menu: Menu, modifier: Modifier = Modifier) {
    Card(modifier = modifier.width(140.dp), shape = RoundedCornerShape(8.dp)) {
        Column {
            Image(
                painter = painterResource(id = menu.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(120.dp)
                    .fillMaxWidth()
                    .clip(
                        RoundedCornerShape(8.dp)
                    )
            )
            Column(modifier = modifier.padding(8.dp)) {
                Text(
                    text = menu.title,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.subtitle1.copy(fontWeight = FontWeight.ExtraBold),
                )
                Text(
                    text = menu.price,
                    style = MaterialTheme.typography.subtitle2
                )
            }

        }
    }
}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun MenuItemPreview() {
    MenuItem(
        menu = Menu(R.drawable.menu2, "Hot Pumpkin Spice Latte Premium", "Rp 18.000"),
        modifier = Modifier.padding(8.dp)
    )
}
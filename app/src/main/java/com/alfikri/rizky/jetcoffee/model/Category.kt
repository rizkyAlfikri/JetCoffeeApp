package com.alfikri.rizky.jetcoffee.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.alfikri.rizky.jetcoffee.R

/**
 * @author Rizky Alfikri Rachmat (rizkyalfikri@gmail.com)
 * @version Category, v 0.1 11/17/2022 9:55 PM by Rizky Alfikri Rachmat
 */

data class Category(
    @DrawableRes val imageCategory: Int,
    @StringRes val textCategory: Int
)

val dummyCategory = listOf(
    R.drawable.icon_category_all to R.string.category_all,
    R.drawable.icon_category_americano to R.string.category_americano,
    R.drawable.icon_category_cappuccino to R.string.category_cappuccino,
    R.drawable.icon_category_espresso to R.string.category_espresso,
    R.drawable.icon_category_frappe to R.string.category_frappe,
    R.drawable.icon_category_latte to R.string.category_latte,
    R.drawable.icon_category_macchiato to R.string.category_macchiato,
    R.drawable.icon_category_mocha to R.string.category_mocha,
).map { Category(it.first, it.second) }
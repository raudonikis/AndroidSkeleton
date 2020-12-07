package com.raudonikis.common.extensions

import android.view.View

fun View.show() {
    visibility = View.VISIBLE
}

fun View.hide() {
    visibility = View.GONE
}

fun View.showIf(condition: () -> Boolean) {
    when (condition()) {
        true -> show()
        false -> hide()
    }
}
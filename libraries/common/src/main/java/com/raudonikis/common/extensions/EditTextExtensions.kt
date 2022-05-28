package com.raudonikis.common.extensions

import android.widget.EditText
import androidx.core.widget.doOnTextChanged
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.callbackFlow

fun EditText?.asFlow() = callbackFlow {
    this@asFlow?.doOnTextChanged { text, _, _, _ ->
        trySend(text.toString())
    }
    awaitClose()
}

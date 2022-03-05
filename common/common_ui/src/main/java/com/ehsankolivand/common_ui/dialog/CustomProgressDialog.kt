package com.ehsankolivand.common_ui.dialog

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import androidx.annotation.StringRes
import com.ehsankolivand.common_ui.R
import com.ehsankolivand.common_ui.databinding.ProgressBarBinding

class CustomProgressDialog(context: Context):AlertDialog(context, R.style.CustomProgressDialog) {

    lateinit var viewBinding: ProgressBarBinding

    override fun show() {
        show(null)
    }


    fun show(@StringRes messageRes: Int?) {
        super.show()
        viewBinding = ProgressBarBinding.inflate(LayoutInflater.from(context))
        setContentView(viewBinding.root)
        setCanceledOnTouchOutside(false)
        setCancelable(false)
    }


    fun dismissWithErrorMessage(@StringRes messageRes: Int) {
        setCanceledOnTouchOutside(true)
        setCancelable(true)

    }


}
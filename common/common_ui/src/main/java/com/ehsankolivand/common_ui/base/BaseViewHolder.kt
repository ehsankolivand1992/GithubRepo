package com.ehsankolivand.common_ui.base

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseViewHolder<T>(open val binding: ViewBinding, open val context: Context)
    : RecyclerView.ViewHolder(binding.root) {
    abstract fun bind(task: T, clicked: (task: T) -> Unit)
}

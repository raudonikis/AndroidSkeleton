package com.raudonikis.common

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

class RecyclerAdapter<ITEM, BINDING : ViewBinding>(
    //TODO: look for a way to remove the onInflate lambda in favor of generics
    private val onInflate: (inflater: LayoutInflater, parent: ViewGroup) -> BINDING,
    private val onBind: BINDING.(item: ITEM) -> Unit,
    private val onClick: ITEM.() -> Unit = {},
    compareItems: (oldItem: ITEM, newItem: ITEM) -> Boolean = { oldItem, newItem -> oldItem == newItem },
    compareContents: (oldItem: ITEM, newItem: ITEM) -> Boolean = { oldItem, newItem -> oldItem == newItem }
) : ListAdapter<ITEM, RecyclerAdapter<ITEM, BINDING>.ItemViewHolder>(
    DiffCallback(
        compareItems,
        compareContents
    )
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = onInflate(LayoutInflater.from(parent.context), parent)
        return ItemViewHolder(binding).apply {
            binding.root.setOnClickListener {
                onClick(getItem(adapterPosition))
            }
        }
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val currentItem = getItem(position)
        holder.binding.onBind(currentItem)
    }

    inner class ItemViewHolder(val binding: BINDING) : RecyclerView.ViewHolder(binding.root)

    class DiffCallback<ITEM>(
        private val compareItems: (ITEM, ITEM) -> Boolean,
        private val compareContents: (oldItem: ITEM, newItem: ITEM) -> Boolean
    ) : DiffUtil.ItemCallback<ITEM>() {

        override fun areItemsTheSame(oldItem: ITEM, newItem: ITEM): Boolean {
            return compareItems(oldItem, newItem)
        }

        override fun areContentsTheSame(oldItem: ITEM, newItem: ITEM): Boolean {
            return compareContents(oldItem, newItem)
        }
    }
}
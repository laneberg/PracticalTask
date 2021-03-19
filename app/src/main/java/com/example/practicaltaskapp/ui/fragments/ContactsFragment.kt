package com.example.practicaltaskapp.ui.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.practicaltaskapp.R
import com.example.practicaltaskapp.models.CommonModel
import com.firebase.ui.database.FirebaseRecyclerAdapter
import com.firebase.ui.database.paging.FirebaseRecyclerPagingAdapter


class ContactsFragment : ParentFragment(R.layout.fragment_contacts) {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter:FirebaseRecyclerAdapter<CommonModel,ContactsHolder>

    override fun onResume() {
        super.onResume()
    }

    class ContactsHolder(view: View):RecyclerView.ViewHolder(view)
}
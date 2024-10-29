package com.example.gmailclone

import EmailAdapter
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val emails = listOf(
            Email(R.drawable.ic_person, "Edurila.com", "Bestselling online courses", "12:34 PM"),
            Email(R.drawable.ic_person, "Facebook", "New notification", "10:15 AM"),
            Email(R.drawable.ic_person, "Edurila.com", "Bestselling online courses", "12:34 PM"),
            Email(R.drawable.ic_person, "Facebook", "New notification", "10:15 AM"),Email(R.drawable.ic_person, "Edurila.com", "Bestselling online courses", "12:34 PM"),
            Email(R.drawable.ic_person, "Facebook", "New notification", "10:15 AM"),
            Email(R.drawable.ic_person, "Edurila.com", "Bestselling online courses", "12:34 PM"),
            Email(R.drawable.ic_person, "Facebook", "New notification", "10:15 AM"),
            // Thêm các email mẫu khác
        )

        val adapter = EmailAdapter(emails)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
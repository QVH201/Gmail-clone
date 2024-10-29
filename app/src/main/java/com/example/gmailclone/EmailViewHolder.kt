package com.example.gmailclone

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val senderImage: ImageView = itemView.findViewById(R.id.senderImage)
    val senderName: TextView = itemView.findViewById(R.id.senderName)
    val subject: TextView = itemView.findViewById(R.id.subject)
    val time: TextView = itemView.findViewById(R.id.time)
    val starIcon: ImageView = itemView.findViewById(R.id.starIcon)

    fun bind(email: Email) {
        senderImage.setImageResource(email.senderImage)
        senderName.text = email.senderName
        subject.text = email.subject
        time.text = email.time
        starIcon.setImageResource(
            if (email.isStarred) R.drawable.ic_star_filled else R.drawable.ic_star_border
        )

        starIcon.setOnClickListener {
            email.isStarred = !email.isStarred
            starIcon.setImageResource(
                if (email.isStarred) R.drawable.ic_star_filled else R.drawable.ic_star_border
            )
        }
    }
}

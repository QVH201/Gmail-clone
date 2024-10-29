import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gmailclone.Email
import com.example.gmailclone.EmailViewHolder
import com.example.gmailclone.R

class EmailAdapter(private val emails: List<Email>) : RecyclerView.Adapter<EmailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_email, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emails[position]
        holder.bind(email)
    }

    override fun getItemCount(): Int = emails.size
}


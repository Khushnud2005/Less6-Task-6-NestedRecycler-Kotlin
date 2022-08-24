package uz.exemple.less6_task_6_nestedrecycler_kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import uz.exemple.less6_task_6_nestedrecycler_kotlin.R
import uz.exemple.less6_task_6_nestedrecycler_kotlin.model.ChildModel

class ChildAdapter(var childModellist:ArrayList<ChildModel>,var context:Context):RecyclerView.Adapter<ChildAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View
        view = LayoutInflater.from(parent.context).inflate(R.layout.child_rv_layout, parent, false)
        return ChildAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image!!.setImageResource(childModellist.get(position).image)
    }

    override fun getItemCount(): Int {
        return childModellist.size
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var image: ImageView? = null
        init {
            image = itemView.findViewById(R.id.iv_child_item)

        }
    }
}
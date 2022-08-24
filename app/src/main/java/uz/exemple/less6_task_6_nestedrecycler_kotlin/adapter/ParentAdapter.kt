package uz.exemple.less6_task_6_nestedrecycler_kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.exemple.less6_task_6_nestedrecycler_kotlin.R
import uz.exemple.less6_task_6_nestedrecycler_kotlin.model.ChildModel
import uz.exemple.less6_task_6_nestedrecycler_kotlin.model.ParentModel

class ParentAdapter(var parentModelList:ArrayList<ParentModel>,val context:Context):RecyclerView.Adapter<ParentAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View
        view = LayoutInflater.from(parent.context).inflate(R.layout.parent_rv_layout, parent, false)
        return ParentAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tv_parent_title!!.text = parentModelList[position].title

        val childAdapter: ChildAdapter
        childAdapter = ChildAdapter(parentModelList[position].childModelList as ArrayList<ChildModel>, context)
        holder.rv_child!!.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        holder.rv_child!!.adapter = childAdapter
        childAdapter.notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return parentModelList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var rv_child: RecyclerView? = null
        var tv_parent_title: TextView? = null
        init {
            rv_child = itemView.findViewById(R.id.rv_child)
            tv_parent_title = itemView.findViewById(R.id.tv_parent_title)
        }
    }
}
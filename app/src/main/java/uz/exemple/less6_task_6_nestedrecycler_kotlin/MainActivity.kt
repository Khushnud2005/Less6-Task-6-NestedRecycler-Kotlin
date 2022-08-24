package uz.exemple.less6_task_6_nestedrecycler_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.exemple.less6_task_6_nestedrecycler_kotlin.adapter.ParentAdapter
import uz.exemple.less6_task_6_nestedrecycler_kotlin.model.ChildModel
import uz.exemple.less6_task_6_nestedrecycler_kotlin.model.ParentModel

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var parentModelArrayList: ArrayList<ParentModel>
    lateinit var childModelArrayList: ArrayList<ChildModel>
    lateinit var favoriteList: ArrayList<ChildModel>
    lateinit var justWatchedList: ArrayList<ChildModel>
    lateinit var latestList: ArrayList<ChildModel>
    lateinit var fantasticList: ArrayList<ChildModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        recyclerView = findViewById(R.id.rv_parent)
        childModelArrayList = ArrayList()
        favoriteList = ArrayList()
        justWatchedList = ArrayList()
        latestList = ArrayList()
        parentModelArrayList = ArrayList()
        fantasticList = ArrayList()

        latestList.add(ChildModel(R.drawable.poster1))
        latestList.add(ChildModel(R.drawable.poster2))
        latestList.add(ChildModel(R.drawable.poster3))
        latestList.add(ChildModel(R.drawable.poster4))

        parentModelArrayList.add(ParentModel("Latest Movies", latestList))

        favoriteList.add(ChildModel(R.drawable.poster5))
        favoriteList.add(ChildModel(R.drawable.poster6))
        favoriteList.add(ChildModel(R.drawable.poster7))
        favoriteList.add(ChildModel(R.drawable.poster8))
        favoriteList.add(ChildModel(R.drawable.poster5))

        parentModelArrayList.add(ParentModel("Favorite Movies", favoriteList))

        justWatchedList.add(ChildModel(R.drawable.poster8))
        justWatchedList.add(ChildModel(R.drawable.poster2))
        justWatchedList.add(ChildModel(R.drawable.poster3))
        justWatchedList.add(ChildModel(R.drawable.poster4))
        justWatchedList.add(ChildModel(R.drawable.poster5))

        parentModelArrayList.add(ParentModel("Just Watched Movies", justWatchedList))

        fantasticList.add(ChildModel(R.drawable.poster5))
        fantasticList.add(ChildModel(R.drawable.poster6))
        fantasticList.add(ChildModel(R.drawable.poster7))
        fantasticList.add(ChildModel(R.drawable.poster8))
        fantasticList.add(ChildModel(R.drawable.poster5))

        parentModelArrayList.add(ParentModel("Fantastic Movies", fantasticList))

        val parentAdapter = ParentAdapter(parentModelArrayList, this@MainActivity)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = parentAdapter
        parentAdapter.notifyDataSetChanged()
    }
}
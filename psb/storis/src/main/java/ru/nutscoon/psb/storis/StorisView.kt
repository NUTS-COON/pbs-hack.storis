package ru.nutscoon.psb.storis

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StorisView : LinearLayout {
    constructor(context: Context, attrs: AttributeSet, defStyle: Int)
            : super(context, attrs, defStyle) {}

    constructor(context: Context, attrs: AttributeSet)
            : this(context, attrs, 0) {}

    private val storis: List<StorisData> = listOf(
        StorisData("Как защититься от мошшенников", R.drawable.s1),
        StorisData("Заработай на кредитной карте", R.drawable.s2),
        StorisData("Новые налоги с 1 июня", R.drawable.s3),
        StorisData("Купи душу у дьявола", R.drawable.s4),
    )

    val storisCount: Int
        get() = storis.size

    fun init() {
        orientation = VERTICAL
        layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)

        val storisContainer = LayoutInflater.from(context)
            .inflate(R.layout.storis_cards, this, false)

        val recyclerView: RecyclerView = storisContainer.findViewById(R.id.rv_storis)
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = StorisRecyclerAdapter(storis)

        addView(storisContainer)
    }
}
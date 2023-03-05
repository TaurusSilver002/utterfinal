package com.example.techstormxml

import java.util.*

object ParentDataFactory {

    fun getParents() : List<parentItemCard>{
        val parents = mutableListOf<parentItemCard>()

        parents.add(parentItemCard("BRAIN TEASER", ChildDataFactory.getChildrenBrainTesasers()))
            parents.add(parentItemCard("ROVERS", ChildDataFactory.rovers()))
            parents.add(parentItemCard("GAMES", ChildDataFactory.games()))
            parents.add(parentItemCard("CREATIVE EVENTS", ChildDataFactory.creativeevents()))

        return parents
    }
}
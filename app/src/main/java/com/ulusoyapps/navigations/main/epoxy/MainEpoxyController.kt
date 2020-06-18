package com.ulusoyapps.navigations.main.epoxy

import com.airbnb.epoxy.EpoxyController
import com.ulusoyapps.navigations.main.Topic
import com.ulusoyapps.navigations.topicCard

class MainEpoxyController(
    private val topics: List<Topic>
) : EpoxyController() {

    init {
        requestModelBuild()
    }

    override fun buildModels() {
        for ((index, topicName) in topics.withIndex()) {
            topicCard {
                id(index)
                topic(topicName)
            }
        }
    }
}

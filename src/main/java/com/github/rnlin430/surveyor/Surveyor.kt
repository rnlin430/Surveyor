package com.github.rnlin430.surveyor

class Surveyor {
    var nextId: Int = 0

    fun createWorldSection(worldName: String): WorldSection {
        val v = WorldSection(worldName, nextId)
        nextId++
        return v
    }

    fun incrementID() {
       nextId++
    }
}
package com.max.builderpattern.part1

import java.lang.StringBuilder

/** Product */
class Beverage {

    private var tea: String = ""
    private var hasBubble: Boolean = false
    private var hasPudding: Boolean = false

    fun setTea(tea: String) {
        this.tea = tea
    }

    fun setIsHasBubble(boolean: Boolean) {
        this.hasBubble = boolean
    }

    fun setIsHasPudding(boolean: Boolean) {
        this.hasPudding = boolean
    }

    fun getDescription(): String {
        val stringBuilder = StringBuilder()

        stringBuilder.append(tea)

        if (hasBubble) {
            stringBuilder.append(" + Bubble")
        }
        if (hasPudding) {
            stringBuilder.append(" + Pudding")
        }

        return stringBuilder.toString()
    }
}
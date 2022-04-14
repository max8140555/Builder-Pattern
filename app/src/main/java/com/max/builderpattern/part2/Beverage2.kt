package com.max.builderpattern.part2

class Beverage2(private val beverageData2: BeverageData2) {

    data class BeverageData2(
        val tea: String,
        val hasBubble: Boolean,
        val hasPudding: Boolean
    )

    class BeverageBuilder2 {
        private var tea: String = ""
        private var hasBubble: Boolean = false
        private var hasPudding: Boolean = false

        fun setTea(tea: String): BeverageBuilder2 {
            this.tea = tea
            return this
        }

        fun setIsHasBubble(boolean: Boolean): BeverageBuilder2 {
            this.hasBubble = boolean
            return this
        }

        fun setIsHasPudding(boolean: Boolean): BeverageBuilder2 {
            this.hasPudding = boolean
            return this
        }

        fun create(): Beverage2 {
            return Beverage2(BeverageData2(tea, hasBubble, hasPudding))
        }
    }

    fun getDescription(): String {
        val stringBuilder = StringBuilder()

        stringBuilder.append(beverageData2.tea)

        if (beverageData2.hasBubble) {
            stringBuilder.append(" + Bubble")
        }
        if (beverageData2.hasPudding) {
            stringBuilder.append(" + Pudding")
        }

        return stringBuilder.toString()
    }
}
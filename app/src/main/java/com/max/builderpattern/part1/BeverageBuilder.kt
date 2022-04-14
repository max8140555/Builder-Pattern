package com.max.builderpattern.part1

/** Builder */
abstract class BeverageBuilder {

    var beverage = Beverage()

    abstract fun buildTea()
    abstract fun buildIsHasBubble()
    abstract fun buildIsHasPudding()

    fun createNewBeverage() {
        beverage = Beverage()
    }
}
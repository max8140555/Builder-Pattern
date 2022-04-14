package com.max.builderpattern.part1

/** Director */
class Cashier {
    private var beverageBuilder: BeverageBuilder? = null

    val beverage: Beverage?
        get() = beverageBuilder?.beverage

    fun setBeverageBuilder(builder: BeverageBuilder?) {
        beverageBuilder = builder
    }

    fun constructBeverage() {
        beverageBuilder?.createNewBeverage()
        beverageBuilder?.buildTea()
        beverageBuilder?.buildIsHasBubble()
        beverageBuilder?.buildIsHasPudding()
    }
}
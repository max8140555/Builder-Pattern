package com.max.builderpattern.part1.concretebuilder

import com.max.builderpattern.part1.BeverageBuilder

/** ConcreteBuilder */
class BubbleMilkTeaBuilder: BeverageBuilder() {
    override fun buildTea() {
        beverage.setTea("MilkTea")
    }

    override fun buildIsHasBubble() {
        beverage.setIsHasBubble(true)
    }

    override fun buildIsHasPudding() {
        beverage.setIsHasPudding(false)
    }
}
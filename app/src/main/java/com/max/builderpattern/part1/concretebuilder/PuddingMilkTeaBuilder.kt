package com.max.builderpattern.part1.concretebuilder

import com.max.builderpattern.part1.BeverageBuilder

/** ConcreteBuilder */
class PuddingMilkTeaBuilder: BeverageBuilder() {
    override fun buildTea() {
        beverage.setTea("MilkTea")
    }

    override fun buildIsHasBubble() {
        beverage.setIsHasBubble(false)
    }

    override fun buildIsHasPudding() {
        beverage.setIsHasPudding(true)
    }
}
package com.max.builderpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.max.builderpattern.part1.Cashier
import com.max.builderpattern.part1.concretebuilder.BubbleMilkTeaBuilder
import com.max.builderpattern.part1.concretebuilder.MilkTeaBuilder
import com.max.builderpattern.part1.concretebuilder.PuddingMilkTeaBuilder
import com.max.builderpattern.part2.Beverage2
import com.max.builderpattern.part3.UrlBuilder

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        part1()
        part2()
        part3()
    }

    private fun part1() {
        val cashier = Cashier()

        val milkTeaBuilder = MilkTeaBuilder()
        cashier.setBeverageBuilder(milkTeaBuilder)
        cashier.constructBeverage()
        println(cashier.beverage?.getDescription())

        val bubbleMilkTeaBuilder = BubbleMilkTeaBuilder()
        cashier.setBeverageBuilder(bubbleMilkTeaBuilder)
        cashier.constructBeverage()
        println(cashier.beverage?.getDescription())

        val puddingMilkTeaBuilder = PuddingMilkTeaBuilder()
        cashier.setBeverageBuilder(puddingMilkTeaBuilder)
        cashier.constructBeverage()
        println(cashier.beverage?.getDescription())
    }

    private fun part2() {
        val beverage2 = Beverage2.BeverageBuilder2()
            .setTea("blackTea")
            .setIsHasBubble(true)
            .setIsHasPudding(true)
            .create()

        println(beverage2.getDescription())
    }

    private fun part3() {
        val url = UrlBuilder()
            .setDomain("https://www.youtube.com/")
            .setRoute("watch")
            .setArg("v", "bgQIzPnPI88")
            .build()

        println(url)
    }
}
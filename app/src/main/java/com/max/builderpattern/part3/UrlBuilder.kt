package com.max.builderpattern.part3

import java.lang.StringBuilder

class UrlBuilder {

    private var domain: String = ""
    private var route: String = ""
    private val argMap = mutableMapOf<String, String>()

    fun setDomain(domain: String): UrlBuilder {
        return apply {
            this.domain = domain
        }
    }

    fun setRoute(route: String): UrlBuilder {
        return apply {
            this.route = route
        }
    }

    fun setArg(key: String, value: String): UrlBuilder {
        return apply {
            this.argMap[key] = value
        }
    }

    fun build(): String {
        return getUrl()
    }

    private fun getUrl(): String {
        val stringBuilder = StringBuilder()
        stringBuilder.append("$domain$route?")
        argMap.keys.forEachIndexed { index, key ->
            val value = argMap[key]

            if (index == 0) {
                stringBuilder.append("$key=$value")
            } else {
                stringBuilder.append("&$key=$value")
            }

        }
        return stringBuilder.toString()
    }
}
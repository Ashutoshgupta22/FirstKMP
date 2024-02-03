package com.aspark.firstkmp

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): List<String> = buildList {
        add("Hello, ${platform.name}!")
        add("This is an ios App")
        add(daysPhrase())
    }
}
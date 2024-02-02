package com.aspark.firstkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

expect val num: Int
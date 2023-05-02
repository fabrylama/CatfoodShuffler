package com.example.catfoodshuffler

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
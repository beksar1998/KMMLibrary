package com.beksat.kmmlibrary

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
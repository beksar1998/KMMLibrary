package com.beksat.kotlinmultiplatformsharedmodule

import com.beksat.kmmlibrary.KmmLibraryTest

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}
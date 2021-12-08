package kz.beksar.library

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
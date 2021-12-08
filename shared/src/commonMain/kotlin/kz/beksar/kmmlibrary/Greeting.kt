package kz.beksar.kmmlibrary

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
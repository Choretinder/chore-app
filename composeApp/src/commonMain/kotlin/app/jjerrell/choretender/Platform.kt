package app.jjerrell.choretender

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
package java.server

class Server {
    fun test (name: String): String {
        return "Hello $name"
    }
}

fun main(){
    val server = Server()
    server.test("World")
}
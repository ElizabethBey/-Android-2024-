interface Subscriber {
    fun update(s: String)
}

class NewsPoster {
    var subscribers = mutableListOf<Subscriber>()

    fun notification(s: String) {
        for(sub in subscribers) sub.update(s)
    }

    fun addSubscriber(sub : Subscriber) {
        subscribers.add(sub)
    }

    fun delSubscriber(sub : Subscriber) {
        subscribers.remove(sub)
    }
}

fun main() {
    val newsPoster = NewsPoster()
    val sub1 = object : Subscriber {
        override fun update(s: String) {
            println("Subscriber 1 has received: $s")
        }
    }

    val sub2 = object : Subscriber {
        override fun update(s: String) {
            println("Subscriber 2 has received: $s")
        }
    }
    newsPoster.addSubscriber(sub1)
    newsPoster.addSubscriber(sub2)

    newsPoster.notification("New post")
}
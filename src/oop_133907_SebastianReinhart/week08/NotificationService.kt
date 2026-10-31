package oop_133907_SebastianReinhart.week08

class NotificationService {

    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile) {
        // sendEmail(user.email) // ERROR: Type mismatch

        if (user.email != null) {
            // SUCCESS via Smart Cast
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}

package chap06.section3.K

class KCustomer {
    companion object {
        const val LEVEL = "INTERMEDIATE"
        @JvmStatic
        fun login() = println("Login")
        @JvmField
        val JOB = KJob()
    }
}

class KJob {
    var title: String = "Programmer"
}
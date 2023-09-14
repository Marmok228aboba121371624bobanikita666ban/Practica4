fun main(args: Array<String>) {
    //Задание 1
    fun printFullName() {
        val firsName: String = "Никита"
        val lastName: String = "Щебланов"
        println("$firsName  $lastName")

    }
    //--------------

    //Задание 2
    printFullName()

    //--------------

    //Задание 3
    fun calculateFullName(firsName: String): String {
        return firsName
    }
    //-------------

    //Задание 4
    fun calculateFullName2(firstName: String, ): Pair<String, Int> {
        val fullName = firstName
        return Pair(fullName, fullName.length)
    }
    //-------------

    //Задание 5
    fun SimpleNum (num : Int): Boolean {
        if (num < 2)
            return false
        for (i in 2..num - 1) {
            if (num % i == 0)
                return false
        }
        return  true
    }
    //-------------
}
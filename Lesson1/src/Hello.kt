import com.sun.jdi.connect.Connector

fun main(args: Array<String>){
    println("Hello Kotlin")
    firstTask()
    secondTask()
    thirdTask()
    fourthTask()
    fifthTask()
    sixthTask()
}

fun firstTask() {
//   1) Создайте переменную со значением null типа Any?
//   2) Переопределите значение ранее созданной переменной на любую цифру
//   3) Создайте переменную, не указывая её тип и присвойте ей значение из ранее созданной переменной деленную на 2,5
//   4) Напишите в комментарии какого типа последняя переменная

    var a: Any? = null
    a = 10
    val b = a/2.5
    println(b)
    println(b is Double) //It is Double, because Int/Double = Double
}

fun secondTask()  {
// Создайте две переменные типа String, содержащие "hello" и "aplana"
// И выведите их в консоль так что бы получилось: hello aplana
    val firstText = "Hello "
    val secondText = "Aplana"
    val newString = firstText+secondText
    println(newString)
}

fun thirdTask() {
// Преобразуйте  var five: Char = '5' в String, Byte, Short, Int, Double, FLoat и Long
    var five: Char = '5'
    val stringFive = five.toString()
    val byteFive = stringFive.toByte()
    val shortFive = stringFive.toShort()
    val intFive = stringFive.toInt()
    val doubleFive = stringFive.toDouble()
    val floatFive = stringFive.toFloat()
    val longFive = stringFive.toLong()
    println(stringFive)
    println(byteFive)
    println(shortFive)
    println(intFive)
    println(doubleFive)
    println(floatFive)
    println(longFive)
}

fun fourthTask() {
// Напишите программу, запрашивающую имя пользователя и выводящую приветствие пользователя в консоль, после ввода имени.
    println("Напишите свое имя и нажмите Enter:")
    var userText: String? = readLine()
    var textString = userText.toString()
    print("Привет, $textString!")
}

fun fifthTask() {
// Создайте переменную, содержащую последовательность английского алфавита наоборот – начиная с последней буквы алфавита
// и заканчивая первой буквой.

    val alphabet = 'z' downTo 'a'
    val isInAlphabet = 'c' in alphabet
    println(isInAlphabet)
}

fun sixthTask() {
// Напишите программу, которая запрашивает у пользователя два числа в переменные “a” и “b”.
// Проверьте больше ли "a" чем "b" и получите результат в виде переменой типа boolean.
    println("Введите первое число и нажмите Enter:")
    var firstText: String? = readLine()
    val fistString = firstText.toString()
    val firstInt = fistString.toInt()
    //Здесь не добавлена проверка на является ли введенное значение числом,
    // но в рамках текущего задания этого достаточно

    println("Введите второе число и нажмите Enter:")
    var secondText: String? = readLine()
    val secondString = secondText.toString()
    val secondInt = secondString.toInt()

    val isFirstBiggest = firstInt > secondInt
    println(isFirstBiggest)
}


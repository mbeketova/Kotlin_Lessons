class EightTask {
//    Задание 8: Проценты по вкладу

//    Напишите программу для расчета дохода по вкладу. Пользователь вводит сумму вклада,
//    длительность вклада (количество месяцев) и ежемесячный процент по вкладу.
//    Программа выводит в консоль информацию по каждому месяцу отдельно. Информация отображает:
//    на сколько будет увеличиваться вклад в этом месяце и итоговую сумму вклада в данном месяце.

    fun calculateIncome() {
        var amount: Double = getAmount().toDouble()
        val duration: Int = getDuration()
        val percent: Int = getPercent()
        println("Месяц: \tПрибыль: \tСумма вклада:")

        for (index: Int in 1..duration) {
            val profit: Double = amount/100.0*percent
            amount += profit
            println("$index\t\t${String.format("%.2f", profit)}\t\t${String.format("%.2f", amount)}")
        }
    }

}

private fun readToInt(): Int {
    var text: String? = readLine()
    val textResult: String = text.toString()
    val resultInt: Int? = textResult.toIntOrNull()
    if (resultInt is Int) {
        if (resultInt > 10000000000) {
            println("Введенное значение слишком большое, попробуйте еще раз. ")
            return readToInt()
        } else {
            if (resultInt == 0) {
                println("Введенное значение равно 0. Попробуйте еще раз")
                return readToInt()
            } else {
                return resultInt
            }
        }
    } else {
        println("Ввденное значение некорректно. Необходимо ввести цифру")
        return readToInt()
    }
}

private fun getAmount(): Int {
    println("Введите сумму вклада и нажмите Enter")
    return readToInt()
}

private fun getDuration() : Int {
    println("Введите длительность вклада и нажмите Enter")
    return readToInt()
}

private fun getPercent() : Int {
    println("Введите ежемесячный процент по вкладу и нажмите Enter")
    return readToInt()
}
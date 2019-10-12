class SeventhTask {
    //    Задание 7: Тест
    fun checkKnowledgeKotlin() {
//    Напишите тест на любую тему. Пользователь должен вводить номер варианта из предложенных ответов.
//    Придумайте минимум 5 вопросов. Вывод результата тестирования должен происходить через оператор when,
//    в виде текстового комментария (прим: «Ваши знания истории на крепкую четверку»).

        println("Тест на основы языка Kotlin")
        var result: Int = 0
        when (firstQuestion()) {
            1 -> result += 1
        }

        when (secondQuestion()) {
            3 -> result += 1
        }

        when (thirdQuestion()) {
            5 -> result += 1
        }

        when(fourthQuestion()) {
            2 -> result += 1
        }

        when (fifthQuestion()) {
            4 -> result += 1
        }

        when (result) {
            0 -> println("Вы на все вопросы ответили неправильно. Не отчаивайтесь, попробуйте прочитать тему еще раз!")
            1 -> println("Вы правильно ответили на 1 вопрос. Не отчаивайтесь, попробуйте прочитать тему еще раз!")
            2 -> println("Вы правильно ответили на 2 вопроса. Не отчаивайтесь, попробуйте прочитать тему еще раз!")
            3 -> println("Вы правильно ответили на 3 вопроса. Неплохо, но можно и лучше.")
            4 -> print("Ваши знания на крепкую четверку")
            5 -> print("Ваши знания на отлично! Пора приступать к следующей теме!")
        }
    }

    private fun readToInt(): Int {
        println("Введите номер правильного ответа и нажмите Enter")
        var text: String? = readLine()
        val textResult: String = text.toString()
        val resultInt: Int? = textResult.toIntOrNull()
        if (resultInt is Int) {
            return resultInt
        } else {
            println("Ввденное значение некорректно")
            return readToInt()
        }
    }

    private fun firstQuestion(): Int {
        println("Где правильно создана переменная?")
        println("1. var x: Float = 2.56f")
        println("2. var x: 2.56")
        println("3. var Float x = 2.56")
        println("4. float x = 2.56")
        println("5. x = 2.56f")
        return readToInt() //==1
    }

    private fun secondQuestion(): Int {
        println("Каким будет тип переменной: var x = 10/2.5?")
        println("1. Целое")
        println("2. Int")
        println("3. Double")
        println("4. 4")
        println("5. 4.0")
        return  readToInt() //== 3
    }

    private fun thirdQuestion(): Int {
        println("Что произойдет в результате выполнения следующей программы: \n val text = \"Any text\" \n val a = text.toBoolean() \n println(a)")
        println("1. Ничего не произойдет")
        println("2. Программа не запустится")
        println("3. Программа упадет")
        println("4. Программа выведет в консоль: true")
        println("5. Программа выведет в консоль: false")
        return readToInt() // == 5
    }

    private fun fourthQuestion(): Int {
        println("В какой из строк закралась ошибка?")
        println("1. val string = \"String\" ")
        println("2. val string: String = 'String'")
        println("3. val string = \"'String'\"")
        println("4. val string = \"\"")
        println("5. var string = \"Var\"")
        return readToInt() //==2
    }

    private fun fifthQuestion(): Int {
        println("С помощью какого оператора можно проверить тип переменной?")
        println("1. to")
        println("2. when")
        println("3. else")
        println("4. is")
        println("5. if")
        return readToInt() //==4
    }
}
class NinthTask {
 //   Задание 9: Массив Стран

//    Создайте многомерный массив, где в первом массиве хранится названия каких-либо стран,
//    в следующем столицы данных стран и в последнем массиве используемая денежная единица.
//    Сохраните информацию минимум по 3 странам и выведите в консоль в виде:
//
//    Страна          Столица        Валюта
    fun makeCountryArray() {
        println(" Страна: \t Столица: \t Валюта:")
        val country: Array<Array<String>> = arrayOf(getCountryArray(), getCapitalArray(), getCurrencyArray())
        val newCountry:  Array<Array<String>> = addObjects(country,
            "Казахстан",
            "Астана",
            "Теньге")
        for (index: Int in 0..(newCountry[0].count()-1)) {
            val countryName: String = newCountry[0][index]
            val countryCapital: String = newCountry[1][index]
            val countryCurrency: String = newCountry[2][index]
            println("$countryName \t $countryCapital \t $countryCurrency")
        }

    }
}

private fun getCountryArray(): Array<String> {
    return  arrayOf("Белоруссия", "Россия", "Украина")
}

private  fun  getCapitalArray(): Array<String> {
    return arrayOf("Минск", "Москва", "Киев")
}

private  fun getCurrencyArray(): Array<String> {
    return arrayOf("Рубль", "Рубль", "Гривна")
}

private fun addObjects(country: Array<Array<String>>,
                        countryName: String,
                        countryCapital: String,
                        countryCurrency: String): Array<Array<String>> {
    var newCountry: Array<Array<String>> = country
    newCountry[0] = newCountry[0] + arrayOf(countryName)
    newCountry[1] = newCountry[1] + arrayOf(countryCapital)
    newCountry[2] = newCountry[2] + arrayOf(countryCurrency)
    return  newCountry
}
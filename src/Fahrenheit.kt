class Fahrenheit(temp: Double = 0.0) : Temperature(Unit.F, temp) {

    override fun getTemp(): Double {
        return getTemp(Unit.F)
    }

    override fun getTempIn(unit: Unit): Double {
        return getTemp(unit)
    }
}
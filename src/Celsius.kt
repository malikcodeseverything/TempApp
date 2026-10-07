class Celsius(temp: Double = 0.0) : Temperature(Unit.C, temp) {

    override fun getTemp(): Double {
        return getTemp(Unit.C)
    }

    override fun getTempIn(unit: Unit): Double {
        return getTemp(unit)
    }
}
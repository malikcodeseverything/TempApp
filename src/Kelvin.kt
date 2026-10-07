class Kelvin(temp: Double = 0.0) : Temperature(Unit.K, temp) {

    override fun getTemp(): Double {
        return getTemp(Unit.K)
    }

    override fun getTempIn(unit: Unit): Double {
        return getTemp(unit)
    }
}
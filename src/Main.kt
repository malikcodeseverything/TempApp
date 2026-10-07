fun main() {

    val celsius = Celsius(0.0)
    println("Celsius: ${celsius.getTemp()}")
    println("In Fahrenheit: ${celsius.getTempIn(Temperature.Unit.F)}")
    println("In Kelvin: ${celsius.getTempIn(Temperature.Unit.K)}")

    val fahrenheit = Fahrenheit(32.0)
    println("Fahrenheit: ${fahrenheit.getTemp()}")
    println("In Celsius: ${fahrenheit.getTempIn(Temperature.Unit.C)}")
    println("In Kelvin: ${fahrenheit.getTempIn(Temperature.Unit.K)}")

    val kelvin = Kelvin(273.15)
    println("Kelvin: ${kelvin.getTemp()}")
    println("In Celsius: ${kelvin.getTempIn(Temperature.Unit.C)}")
    println("In Fahrenheit: ${kelvin.getTempIn(Temperature.Unit.F)}")
}
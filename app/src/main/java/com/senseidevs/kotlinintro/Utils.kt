package com.senseidevs.kotlinintro

import android.content.Context
import android.support.annotation.IntegerRes
import android.view.View
import android.widget.Toast
import java.math.BigDecimal
import java.util.*

fun main(args: Array<String>) {

    // Variables

    // Mutable
    var name: String = "Charles"
    var firstName = "Charles"


    // TODO Must initialize variable

















    var height = 1.4
    height = 1.6543





















    // Immutable
    val livesInKampala: Boolean = true

    // Can't modify a constant
    livesInKampala = false





















    val temperature = 22.5 // Double inferred



















    // TODO Convert to float
    val firstValue: Float = 234
    val secondValue = 123L
    var total = firstValue + secondValue





















    // Null types
    // TODO Make it nullable
    var code: String = "Not null"

    // Generally avoid nulls unless when interoperating with Java.




















    var amount: BigDecimal? = null

    // TODO Null safety operator ? or bang (non-null asserted) !!
    val sente: Double = amount.toDouble()


    // TODO Use 'Let' library function

}




















// Functions: They are FUN
fun letsCode() {}






















// Function with body
fun helloWorld() {
    println("Hello Kampala")
}





















// Specify an explicit return type
fun greetings(name: String): Unit {
    println(name)
}






















// Function with return value
fun hasGeekNightStarted(): Boolean {
    return true
}





























// Function with parameters and return value
fun complicatedFunction(amount: Double, name: String, dob: Date): String {

    return "I love developing in Kotlin :D"
}






















// TODO Simplify to an expression
fun sum(x: Float, y: Float): Float {
    return x + y
}
























// Function with default parameters
fun work(units: String = "Joules"): Unit {
    println("${2.squared()} " + units)
}





fun usingWorkFunction() {

    // Uses default value
    work()


    // Uses supplied value
    work("Newton/Meter")
}
















// TODO Named parameters
// TODO Overload for Java
fun showDialog(title: String, message: String = "Loading...", style: Int = -1) {}



fun usingShowDialog() {

    // Supply only required parameters
    showDialog("The Great Title")

    // Use named parameter functionality
    showDialog(style = 0, title = "Geeks in the house")
}














// Classes

class HumanBeing




















// TODO Add primary constructor for make and doors and print from init
class Car()



















// TODO Add type parameter as property
class Laptop constructor(os: String) {

    init {
        print("The laptop runs on $os")
    }

}




















abstract class Animal


class Dog : Animal()

















class Shape


// Shape is final by default // TODO Open shape class
class Rectangle : Shape()

























interface NameDelegate


class Persona : NameDelegate





















// TODO Show java equivalent
data class Person(val name: String, val age: Int)

























// Singletons
object OnlyOneInstance



















// Extension Functions
// TODO Convert to single expression function
fun Int.squared(): Int {
    return this * this
}


fun usage() {

    val squared = 17.squared()

}


















fun View.findById(@IntegerRes id: Int): View {
    return findViewById(id)
}















fun View.visible() {
    visibility = View.VISIBLE
}


fun View.gone() {
    visibility = View.GONE
}


fun View.invisible() {
    visibility = View.INVISIBLE
}




















fun Context.showToast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}














// Utils functions
val cities = listOf("Kampala, Nairobi, Accra")


val citiesMap = mapOf(
        "Kampala" to "Uganda",
        "Nairobi" to "Kenya",
        "Accra" to "Ghana"
)

















// Custom implementation
infix fun String.loves(another: String) = "$this loves $another"


val exampleString = "Charles" loves "Kotlin" // "Charles loves Kotlin"






















val anotherExample = "Android" loves "Kotlin" loves "Unix" loves "CLI" loves "Git"



















// TODO Show mutability and some utility functions
var listing = mutableListOf(3, 5, 6, 9, 2)

fun exampleUsage() {

    listing.add(8)

    listing = listing.map {
        it.squared()
    }.toMutableList()

    // 9, 25, 36, 81, 4, 64

    val anotherListing = 5..20

    val sum = anotherListing.reduce { accumulated, current -> accumulated + current }

    // TODO You can use in-built sum function for the above.
}





// Extras
// 1. Lambdas
// 2. Higher Order Functions





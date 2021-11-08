package bootdevelopent.boot

/**
 * @author bootdevelopment.oreo
 */

import kotlin.random.Random

fun main() {
    println("BOOT: number to random from?")

    val randrangefrom = readLine()

    println("BOOT: number to random to?")

    val randrangeto = readLine()
    if (randrangefrom != null) {
        if (randrangeto != null) {
            println(Random.nextInt(randrangefrom.toInt(), randrangeto.toInt()))
        }
    }

}
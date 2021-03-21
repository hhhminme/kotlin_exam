import java.awt.Color

open class Car{
    var color : String ="기본 색상 검정"
    var speed : Int = 0

    constructor(color: String, speed : Int){
        this.color = color
        this.speed = speed
        carCount++
    }
    constructor(speed: Int){
        this.speed = speed
        carCount++
    }
    constructor(){
        carCount++
    }

    companion object{
        var carCount : Int = 0
        const val MAXSPEED : Int = 200
        const val MINSPEED : Int = 0
        fun currentCarCount() : Int {
            return carCount
        }
    }
    open fun upSpeed(value : Int){
        if (speed + value >= 200){
            speed = 200
        }
        else
            speed = speed + value
    }
    fun downSpeed(value : Int) {
        if (speed - value <= 0)
            speed = 0
        else
            speed = speed - value
    }
}

class Automobile : Car{
    var seatNum : Int = 0

    constructor(){}
    fun countSeatNum() : Int{
        return seatNum
    }

    override fun upSpeed(value: Int) {
        if(speed + value >= 300){
            speed = 300
        }
        else
            speed = speed + value
    }
}
fun main(){
    var auto : Automobile = Automobile()
    auto.upSpeed(250)
    println("승용차의 속도는" + auto.speed + "km입니다.")
}
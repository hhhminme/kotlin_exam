import java.text.SimpleDateFormat
import java.util.*

fun main(){
    var now = Date()
    var sFormat:SimpleDateFormat

    sFormat = SimpleDateFormat("yyyy-MM-dd")
    println(sFormat.format(now))

    sFormat = SimpleDateFormat("HH:mm:ss")
    println(sFormat.format(now))
}
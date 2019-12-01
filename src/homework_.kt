fun String.forEachWord(function:(String)->Unit){
    var strArr = this.split(" ")
    for(i in strArr)
        function(i)
}

fun Int.bitIsOneAtPosition(num:Int):Boolean{
    var array = mutableListOf<Int>()
    var n = this
    while(n != 0){
        array.add(n%2)
        n /= 2
    }

    if(num > array.size)
        return false

    if(array.elementAt(array.size - num) == 1)
        return true
    return false
}

fun Int.toColor():Int{
    var a = this.shr(24) and 0xFF
    var r = this.shr(16) and 0xFF
    var g = this.shr(8) and 0xFF
    var b = this and 0xFF

    return a
}


fun main(args: Array<String>) {
     //Create forEachWord function
    "please print each word".forEachWord { word ->
        println(word)
    }

     //create toColor function
     val c = (-0x775FB34F).toColor()
     println(c) // Color(a=136, r=160, g=76, b=177)


    // create bitIsOneAtPosition
    print(4.bitIsOneAtPosition(3))

}


fun main() {
    var array: ArrayList<Int>  = arrayListOf(1,2,3,4,5,6,7)

    var midval = { array: ArrayList<Int> -> array.sum() / array.size  }
    println(midval(array))
}
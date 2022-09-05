fun main(args: Array<String>) {
    //SP 1
//    var sum = 0
//    for(it in 1 until 1000){
//        if ( it % 3 == 0 || it % 5 == 0)
//            sum+=it
//    }
//    println(sum)
//
    //SP 2
    var sum = 0
    var x = 1
    var y = 2
    var z = 0
    while(true){
        if (y >= 4000000)
            break
        if(y % 2 == 0)
            sum+=y
        z = x + y
        x = y
        y = z
    }
    println(sum)
}
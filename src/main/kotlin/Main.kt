fun main(args: Array<String>) {

    //SP 1
    var sum:Int = 0
    for(it in 1..1000){
        if ( it % 3 == 0 || it % 5 == 0)
            sum+=it
    }
    println(sum)
}
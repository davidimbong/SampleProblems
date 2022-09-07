import kotlin.math.sqrt
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    val test = measureTimeMillis {
        mainloop@for(a in 1..400){
            for(b in 1..400){
                for(c in 1..800){
                    if(is1000PythagoreanTriplet(a,b,c)){
                        val a2 = a*a
                        val b2 = b*b
                        val c2 = c*c
                        println("The pythagorean triplets are:\n$a + $b + $c = 1000")
                        println("$a2 + $b2 = $c2")
                        break@mainloop
                    }
                }
            }
        }
    }
    println("Runtime: $test millisecond(s)")
}

fun is1000PythagoreanTriplet(a: Int, b: Int, c: Int): Boolean{
    if(a+b+c == 1000 && (a*a + b*b) == c*c ){
        return true
    }
    return false
}
//    SP 1
//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
// The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.
//
//    var sum = 0
//    for(it in 1 until 1000){
//        if ( it % 3 == 0 || it % 5 == 0)
//            sum+=it
//    }
//    println(sum)
//


//    SP 2
//    Each new term in the Fibonacci sequence is generated by adding the previous two terms.
//    By starting with 1 and 2, the first 10 terms will be:
//    1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//    By considering the terms in the Fibonacci sequence whose values do not exceed four million,
//    find the sum of the even-valued terms.
//    sumOfEvenFibonacci(1,2)
//}
//
//fun sumOfEvenFibonacci(x: Int, y:Int, n: Int = 0){
//    var firstNum = x
//    var secondNum = y
//    var sum = n
//
//    if(y % 2 == 0)
//        sum+=y
//
//    var z = x + y
//    firstNum = secondNum
//    secondNum = z
//
//    if(firstNum >= 4000000)
//        println(sum)
//    else
//        sumOfEvenFibonacci(firstNum, secondNum, sum)
//}


//SP 3
//PRINT THE RUN TIME IN SECONDS AT THE END OF THE PROGRAM
//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?
//
//val zero:Long = 0
//var number:Long = 600851475143
//val squareRoot:Long = sqrt(number.toDouble()).toLong()
//
//val elapsed = measureTimeMillis{
//    for(num in 2..squareRoot){
//        while(number % num == zero && number / num > 1){
//            number/=num
//        }
//    }
//    println("The biggest prime factor of 600851475143 is: $number")
//}
//println("Runtime: $elapsed milliseconds")


//    SP 4
//    A palindromic number reads the same both ways.
//    The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//    Find the largest palindrome made from the product of two 3-digit numbers.
//
//    var x = 0
//    var y = 0
//    var palindrome = 0
//    val elapsed = measureTimeMillis {
//        mainLoop@ for (num1 in 999 downTo 100) {
//            for (num2 in 999 downTo 100) {
//                var product = num1 * num2
//                if (product > palindrome && product.isPalindrome()) {
//                        x = num1
//                        y = num2
//                        palindrome = num1 * num2
//                }
//            }
//        }
//    }
//    println("The largest palindrome made from the product of two 3-digit numbers is: $palindrome = $x x $y ")
//    println("Runtime: $elapsed milliseconds")
//
//fun Int.isPalindrome(): Boolean = this.toString().reversed() == this.toString()


// SP 5
//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//What is the smallest positive number that is evenly divisible by all the numbers from 1 to 20?
//var smallest = 2520
//val test = measureTimeMillis {
//    while (true) {
//        var x = 0
//        for (check in 11..20) {
//            if (smallest % check == 0) {
//                x += 1
//            } else {
//                smallest += 20
//                break
//            }
//        }
//        if (x == 10) {
//            println("The smallest positive number that is divisible through 1-20 is: $smallest ")
//            break
//        }
//    }
//}
//
//println("Runtime: $test milliseconds")


//SP 6
//The sum of the squares of the first ten natural numbers is:
//1^2 + 2^2 + ... + 10^2 = 385
//
//The square of the sum of the first ten natural numbers is:
//(1 + 2 + ... + 10)^2 = 55^2 = 3025
//
//Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640L.
//
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
//val test = measureTimeMillis {
//        val squareOfSum = squareOfSum(100)
//        val sumOfSquare = sumOfSquare(100)
//        println("The difference between the sum of the squares and the square of the sum of the first 100 natural numbers is:\n" +
//                "$squareOfSum - $sumOfSquare = ${squareOfSum - sumOfSquare}")
//    }
//
//    println("Run time: $test milliseconds")
//}
//
//fun sumOfSquare(lastNum: Int): Int{
//    var sum = 0
//    for(i in 1..lastNum){
//        sum+= i*i
//    }
//    return sum
//}
//
//fun squareOfSum(lastNum: Int): Int{
//    var sum = 0
//    for(i in 1..lastNum){
//        sum+= i
//    }
//    return sum*sum
//}


//SP 7
//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//What is the 10 001st prime number?
//
//val test = measureTimeMillis {
//        println("The 10001st prime number is: ${getPrimeNumber()}")
//    }
//    println("Runtime: $test milliseconds")
//}
//
//fun getPrimeNumber(): Int {
//    var counter = 1
//    var prime = 0
//
//    for( i in 3..Int.MAX_VALUE step 2){
//        if(isPrime(i) ) {
//            counter++
//                if(counter == 10001)
//                {
//                    prime = i
//                    break
//                }
//        }
//    }
//
//    return prime
//}
//
//fun isPrime(x: Int): Boolean {
//    for (i in 3..sqrt(x.toDouble()).toInt() step 2) {
//        if (x % i == 0)
//            return false
//    }
//    return true
//}


//SP 8
//The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.
//
//73167176531330624919225119674426574742355349194934
//96983520312774506326239578318016984801869478851843
//85861560789112949495459501737958331952853208805511
//12540698747158523863050715693290963295227443043557
//66896648950445244523161731856403098711121722383113
//62229893423380308135336276614282806444486645238749
//30358907296290491560440772390713810515859307960866
//70172427121883998797908792274921901699720888093776
//65727333001053367881220235421809751254540594752243
//52584907711670556013604839586446706324415722155397
//53697817977846174064955149290862569321978468622482
//83972241375657056057490261407972968652414535100474
//82166370484403199890008895243450658541227588666881
//16427171479924442928230863465674813919123162824586
//17866458359124566529476545682848912883142607690042
//24219022671055626321111109370544217506941658960408
//07198403850962455444362981230987879927244284909188
//84580156166097919133875499200524063689912560717606
//05886116467109405077541002256983155200055935729725
//71636269561882670428252483600823257530420752963450
//
//Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
//
//    val test = measureTimeMillis {
//        val thousandDigitsNumber = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450"
//        var highestProduct: Long = 0
//        var highestProductNumber= ""
//        for(i in 0..1000-13){
//            var product:Long  = 1
//            val tempNumber = thousandDigitsNumber.substring(i, i+13)
//            tempNumber.forEach {
//                product *= it.digitToInt()
//            }
//            if(product > highestProduct){
//                highestProduct = product
//                highestProductNumber = tempNumber
//            }
//        }
//        println("13 digit number with highest product is: $highestProductNumber\n" +
//                "Product: $highestProduct")
//    }
//    println("Runtime: $test millisecond(s)")
//}


//SP 9
//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//a^2 + b^2 = c^2
//For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product `abc` and display the Pythagorean triplet
//
//
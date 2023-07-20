package com.example.firstproject


fun main() {
        println("첫번째 숫자를 입력해주세요")
        var num1 = readLine()!!.toInt()
        println("두번째 숫자를 입력해주세요")
        var num2 = readLine()!!.toInt()

        totalCal(num1, num2)

    }


fun totalCal(num1:Int,num2:Int ) {
    var add = num1 + num2
    var minus = num1 - num2
    var multiple = num1 * num2
    var devide = num1 / num2

    println("요청하신 결과입니다")
    println("더하기: ${add}")
    println("빼기: ${minus}")
    println("곱하기: ${multiple}")
    println("나누기: ${devide}")

}

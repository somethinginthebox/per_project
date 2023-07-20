package com.example.myapplication

fun main(){
    //숫자 입력하기
    var num1 = readln()!!.toInt()
    var num2 = readln()!!.toInt()
    //메소드 호출하기
   sum(num1, num2)
}
fun sum(num1:Int, num2:Int){
    var reslut = num1 + num2
    println("num1 + num2 의 값은 ${reslut}입니다")
}
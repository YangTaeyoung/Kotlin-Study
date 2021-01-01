package chap03.section1

// 함수의 선언 방식 .1
fun sum1(a: Int, b: Int): Int //반환 타입
{
    var sum = a+b
    return sum // 반환 키워드: return
}

// 함수의 선언방식 .2: 함수의 간략화
// fun 함수이름 (매개변수: 타입): 리턴타입 = 리턴값
// 리턴타입이 없어도 되는 경우도 있음.(코틀린이 저절로 계산) 
fun sum2(a: Int, b: Int): Int = a + b


// Unit타입: void와 같음. 리턴 타입이 없음.


fun main()
{ // 최상위 (top-level) 함수
    fun sum3(a: Int, b: Int): Int {
        return a+b
    } // 지역함수: 함수 내부의 함수
    println(sum1(1,4))
    println(sum2(2,5))
    println(sum3(1,4))
}
package com.example.lab2kot_ph44046

fun main () {
    // khai báo và sử dụng Lambda Function
    val soA : Int? = 5
    val soB : Int? = 10
    val tong = tinhTong(soA!!, soB!!)
    val hieu = tinhHieu(soA!!, soB!!)
    println("Tổng hai số $soA và $soB = $tong")
    println("Hiệu hai số $soA và $soB = $hieu")
    println("Bình phương số $soA = ${binhPhuong(soA)}")
    println("Thương hai số $soA và $soB = ${tinhThuong(soA.toFloat(), soB.toFloat()) ()} ")

    val tenSV = "Vũ Minh Quân"
    println("In hoa chuỗi $tenSV = ${inHoa(tenSV)}")

    val length = tenSV.let { val l = it.length
    l}
    println("Độ dài chuỗi $tenSV = $length")

    val  a2 = soA.run {
         val kq = this * 2
        kq
    }
    println("A2 = $a2")

}

val inHoa : (String) -> String = String::uppercase

val tinhTong : (Int, Int) -> Int = {soA: Int, soB: Int -> (soA + soB)}

val tinhHieu = {soA: Int, soB: Int -> (soA - soB)}

val binhPhuong : (Int) -> Int = {it * it}

val tinhThuong = {soA: Float, soB: Float -> {
    if(soB == 0f){
        "Số bị chia phải khác 0!"
    }else{
        val c = soA / soB
        c
    }

}}
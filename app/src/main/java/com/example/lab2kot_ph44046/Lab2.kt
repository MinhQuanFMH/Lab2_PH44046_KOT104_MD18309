package com.example.lab2kot_ph44046

//fun main () {
//    do {
//        // khai báo và sử dụng kĩ thuật null safety
//        println("Nhập mã số sinh viên: ")
//        val mssv : String? = readLine()
//
//        val tenSV = getTenSV(mssv!!)
//
//        println("Tên sinh viên với mã $mssv là: $tenSV")
//
//        print("Tiếp không?(c/k):")
//        val s = readLine()
//        if (s == "k")
//            break;
//
//    } while (true)
//    println("Kết thúc chương trình!")
//}
//
//val danhsachSV : Map<String, String> = mutableMapOf("PH44046" to "Vũ Minh Quân", "PH44459" to "Lê Minh Đức")
//fun getTenSV (mssv : String) : String? {
//    val tenSV = danhsachSV.get(mssv)
//    if (tenSV == null)
//        return "Không tìm thấy tên sinh viên!"
//
//    return tenSV
//
//}

fun main() {
    var choice: Int
    do {
        println("Chọn chức năng:")
        println("1. Giải phương trình bậc 1")
        println("2. Xác định quý từ tháng")
        println("3. Kiểm tra năm nhuận")
        println("4. Thoát")

        print("Lựa chọn của bạn: ")
        choice = readLine()?.toIntOrNull() ?: 0 // Nếu đầu vào không hợp lệ, mặc định chọn 0

        when (choice) {
            1 -> bai1()
            2 -> bai2()
            3 -> bai3()
            4 -> println("Đã thoát chương trình")
            else -> println("Lựa chọn không hợp lệ, vui lòng chọn lại")
        }
    } while (choice != 4)
}


fun bai1 (){
    var a = 0.0
    var b = 0.0
    println("Nhập a:")
    var s = readLine()
    if (s != null) a = s.toDouble()
    println("Nhập b:")
    s = readLine()
    if (s != null) b = s.toDouble()
    if (a == 0.0 && b == 0.0) {
        println("Phương trình vô số nghiệm")
    } else if (a == 0.0 && b != 0.0) {
        println("Phương trình vô nghiệm")
    } else {
        val x = -b / a
        println("No x=" + x)
    }
}

fun bai2 () {
    var month = 0
    println("Nhập tháng:")
    val s: String? = readLine()
    if (s != null) month = s.toInt()
    when (month) {
        1, 2, 3 -> println("Tháng " + month + " thuộc quý 1")
        4, 5, 6 -> println("Tháng " + month + " thuộc quý 2")
        7, 8, 9 -> println("Tháng " + month + " thuộc quý 3")
        10, 11, 12 -> println("Tháng " + month + " thuộc quý 4")
        else -> println("Tháng " + month + " không hợp lệ")
    }
}

fun bai3 () {
    var year = 0
    var s: String?
    println("Chương trình kiểm tra năm nhuần:")
    do {
        println("Nhập 1 năm:")
        s = readLine()
        while (s == null || s.toInt() < 0) {
            println("Nhập sai năm, nhập lại:")
            s = readLine()
        }
        year = s.toInt()
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            println("Năm $year là năm nhuần")
        } else {
            println("Năm $year không phải là năm nhuần")
        }
        print("Tiếp không?(c/k):")
        s = readLine()
        if (s == "k")
            break;
    } while (true)
    println("Kết thúc chương trình")
}
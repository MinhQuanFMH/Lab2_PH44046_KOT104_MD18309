package com.example.lab2kot_ph44046

fun main (){
    val sv1 = SinhVienModel("Vũ Minh Quân", "PH44046", 8f)
    val sv2 = SinhVienModel("Nguyễn Văn Tỉnh", "PH44266", 7f)
    val sv3 = SinhVienModel("Phí Hồng sắc", "PH12533", 8.5f, false, 23)

    sv2.daTotNghiep = false
    sv2.tuoi = 22

//    println(sv1.getThongTin())
//    println(sv2.getThongTin())
    val listSV = mutableListOf<SinhVienModel>()
    listSV.add(sv1)
    listSV.add(sv2)
    listSV.add(sv3)
    listSV.removeAt(listSV.size - 1)

//    for (sinhvien in listSV){
//        println(sinhvien.getThongTin())
//    }

    for (i in listSV.indices){
        println("Sinh viên thứ $i: \n ${listSV.get(i).getThongTin()}")
    }
}
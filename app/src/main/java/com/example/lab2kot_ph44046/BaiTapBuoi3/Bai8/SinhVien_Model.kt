package com.example.lab2kot_ph44046.BaiTapBuoi3.Bai8

class SinhVien_Model(
    var  hoTen: String,
    var tuoi:Int,
    var lop: String
){
    override fun toString(): String {
        return "Sinh viên (họ tên: $hoTen ,tuổi: $tuoi ,lớp: $lop"
    }
}
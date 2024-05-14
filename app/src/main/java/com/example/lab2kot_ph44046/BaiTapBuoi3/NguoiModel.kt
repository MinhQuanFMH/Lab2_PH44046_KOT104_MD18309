package com.example.lab2kot_ph44046.BaiTapBuoi3

class NguoiModel {
    var hoTen: String = ""
    var tuoi: Int = 0
    var queQuan: String = ""

    constructor(hoTen: String, tuoi: Int, queQuan: String) {
        this.hoTen = hoTen
        this.tuoi = tuoi
        this.queQuan = queQuan
    }

    override fun toString(): String {
        return "Họ tên: $hoTen, Tuổi: $tuoi, Quê quán: $queQuan"
    }

}
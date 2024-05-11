package com.example.lab2kot_ph44046

class SinhVienModel (var tenSV: String, var mssv: String, var diemTB: Float) {
    var daTotNghiep : Boolean? = null
    var tuoi : Int? = null

    constructor( tenSV: String,  mssv: String,  diemTB: Float, datotnghiep: Boolean?, tuoi: Int?) : this(tenSV, mssv, diemTB) {
        this.daTotNghiep = datotnghiep
        this.tuoi = tuoi
    }

    fun getThongTin () : String {
        var sDaTotNghiep : String
        if (daTotNghiep == null) {
            sDaTotNghiep = "Chưa có dữ liệu!"
        } else {
            if (daTotNghiep!!)
                sDaTotNghiep = "Đã tốt nghiệp"
            else {
                sDaTotNghiep = "Chưa tốt nghiệp"
            }
        }

        var sTuoi : String
        if (tuoi == null) {
            sTuoi = "Chưa có dữ liệu!"
        } else {
            sTuoi = tuoi.toString()
        }

        return "Tên: $tenSV, Mssv: $mssv, DiemTB: $diemTB, Đã tốt nghiệp: $sDaTotNghiep, Tuổi: $sTuoi"
    }
}
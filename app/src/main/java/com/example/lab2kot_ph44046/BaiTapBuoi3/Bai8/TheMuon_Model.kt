package com.example.lab2kot_ph44046.BaiTapBuoi3.Bai8

class TheMuon_Model (
    var maPhieuMuon: Int,
    var ngayMuon: String,
    var hanTra: String,
    var soHieuSach: String,
    var sinhVien: SinhVien_Model
) {
    override fun toString(): String {
        return "TheMuon(maPhieuMuon=$maPhieuMuon, ngayMuon=$ngayMuon, hanTra=$hanTra, soHieuSach='$soHieuSach', $sinhVien)"
    }
}
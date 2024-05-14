package com.example.lab2kot_ph44046.BaiTapBuoi3

class CBGVModel (val nguoi: NguoiModel) {
    var maSoGV: String = ""
    var luongCung: Int = 0
    var luongThuong: Int = 0
    var tienPhat: Int = 0
    var luongThucLinh: Int = 0

    init {
        this.maSoGV = ""
        this.luongCung = 0
        this.luongThuong = 0
        this.tienPhat = 0
        this.luongThucLinh = 0
    }

    constructor(nguoi: NguoiModel, maSoGV: String, luongCung: Int, luongThuong: Int, tienPhat: Int) : this(nguoi) {
        this.maSoGV = maSoGV
        this.luongCung = luongCung
        this.luongThuong = luongThuong
        this.tienPhat = tienPhat
        tinhLuongThucLinh()
    }

    fun tinhLuongThucLinh() {
        luongThucLinh = luongCung + luongThuong - tienPhat
    }

    override fun toString(): String {
        return "Mã số GV: $maSoGV, $nguoi, Lương thực lĩnh: $luongThucLinh"
    }

}
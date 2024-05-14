package com.example.lab2kot_ph44046.BaiTapBuoi3.Bai8

import java.util.Scanner

fun main() {
    val danhSachTheMuon: MutableList<TheMuon_Model> = ArrayList()
    val scanner = Scanner(System.`in`)

    var luaChon: Int

    do {
        hienThiMenu()
        luaChon = scanner.nextInt()
        scanner.nextLine() // Xử lý enter sau khi nhập số

        when (luaChon) {
            1 -> {
                themTheMuon(danhSachTheMuon, scanner)
            }
            2 -> {
                xoaTheMuonTheoMaPhieuMuon(danhSachTheMuon, scanner)
            }
            3 -> {
                hienThiDanhSachTheMuon(danhSachTheMuon,scanner)
            }
            4 -> {
                println("Thoát chương trình!")
            }
            else -> {
                println("Lựa chọn không hợp lệ!")
            }
        }
    } while (luaChon != 4)
}

fun hienThiMenu() {
    println("--------------------------------------")
    println("Chương trình quản lý thư viện sách")
    println("--------------------------------------")
    println("1. Thêm thẻ mượn")
    println("2. Xóa thẻ mượn")
    println("3. Hiển thị danh sách thẻ mượn")
    println("4. Thoát chương trình")
    println("--------------------------------------")
    print("Nhập lựa chọn của bạn: ")
}

fun themTheMuon(danhSachTheMuon: MutableList<TheMuon_Model>, scanner: Scanner) {

    print("Nhập họ tên sinh viên: ")
    val hoTenSinhVien = scanner.nextLine()

    print("Nhập tuổi sinh viên: ")
    val tuoiSinhVien = scanner.nextInt()
    scanner.nextLine()
    print("Nhập lớp sinh viên: ")
    val lopSinhVien = scanner.nextLine()

    print("Nhập mã phiếu mượn: ")
    val maPhieuMuon = scanner.nextInt()
    scanner.nextLine()
    print("Nhập ngày mượn (dd/MM/yyyy): ")
    val ngayMuon = scanner.nextLine()

    print("Nhập hạn trả (dd/MM/yyyy): ")
    val hanTra = scanner.nextLine()

    print("Nhập số hiệu sách: ")
    val soHieuSach = scanner.nextLine()

    // Create student and loan record objects
    val sinhVien = SinhVien_Model(hoTenSinhVien, tuoiSinhVien, lopSinhVien) // Replace with actual constructor call
    val theMuon = TheMuon_Model(maPhieuMuon, ngayMuon, hanTra, soHieuSach, sinhVien) // Replace with actual constructor call

    // Add the loan record to the list
    danhSachTheMuon.add(theMuon)

    // Print success message
    println("Thêm thẻ mượn thành công!")

    // Consume the remaining newline character
    scanner.nextLine()
}

fun xoaTheMuonTheoMaPhieuMuon(danhSachTheMuon: MutableList<TheMuon_Model>, scanner: Scanner) {
    print("Nhập mã phiếu mượn cần xóa: ")
    val maPhieuMuon = scanner.nextInt()

    val index = danhSachTheMuon.indexOfFirst { it.maPhieuMuon == maPhieuMuon }
    if (index != -1) {
        danhSachTheMuon.removeAt(index)
        println("Xóa thẻ mượn thành công!")
    } else {
        println("Không tìm thấy thẻ mượn có mã phiếu mượn $maPhieuMuon")
    }

    scanner.nextLine() // Xử lý enter sau khi nhập số
}

fun hienThiDanhSachTheMuon(danhSachTheMuon: MutableList<TheMuon_Model>,scanner: Scanner) {
    if (danhSachTheMuon.isEmpty()) {
        println("Danh sách thẻ mượn đang trống!")
    } else {
        for (theMuon in danhSachTheMuon) {
            println(theMuon)
        }
    }
    scanner.nextLine()
}
package oop_133907_SebastianReinhart.week02

package oop_<nim>_<nama>.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== LIBRARY FINE SYSTEM ===")

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var loanDuration = scanner.nextInt()

    if (loanDuration < 0) {
        loanDuration = 1
        println("Durasi tidak boleh minus. Diubah menjadi 1 hari.")
    }

    val loan = Loan(bookTitle, borrower, loanDuration)

    println()
    println("=== DETAIL PEMINJAMAN ===")
    println("Judul Buku  : ${loan.bookTitle}")
    println("Peminjam    : ${loan.borrower}")
    println("Lama Pinjam : ${loan.loanDuration} hari")
    println("Total Denda : Rp${loan.calculateFine()}")
}
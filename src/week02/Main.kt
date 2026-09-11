package oop_133907_SebastianReinhart.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
        println("Program berhenti di sini untuk mahasiswa ini, tidak membuat objek.")
    } else {
        scanner.nextLine()

        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val student = Student(name, nim, major)

        println("Status: Pendaftaran Selesai.")
    }
}
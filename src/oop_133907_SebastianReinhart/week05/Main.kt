package oop_133907_SebastianReinhart.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val eWallet = EWallet(
        accountName = "Sebastian",
        balance = 50000.0
    )

    val creditCard = CreditCard(
        accountName = "Sebastian",
        limit = 100000.0
    )

    val paymentMethods: List<PaymentMethod> = listOf(
        eWallet,
        creditCard
    )

    for (payment in paymentMethods) {
        payment.processPayment(75000.0)
    }

    // Polymorphic Collection: List yang berisi tipe Parent, tapi isinya objek Anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")

    for (pegawai in daftarPegawai) {
        // Pemanggilan Runtime Polymorphism
        pegawai.bekerja()

        // Smart Casting dengan is dan when
        when (pegawai) {
            is Dosen -> {
                println("-> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }

            is Admin -> {
                println("-> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }

        println("--------------------------")
    }
}
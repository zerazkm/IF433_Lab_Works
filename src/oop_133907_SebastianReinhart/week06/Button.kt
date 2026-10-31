package oop_133907_SebastianReinhart.week06

class Button(override val name: String) : Clickable {

    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}
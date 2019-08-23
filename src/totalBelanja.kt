import java.util.*
import kotlin.collections.ArrayList

fun main (args : Array<String>) {
        programBelanja()
}
fun programBelanja ()  {
    var scan = Scanner (System.`in`)
    var list = ArrayList<Int>()
    println("Masukkan jumlah Harga Belanja")
    list.add(scan.nextInt())
    do {
        println("Masih ada pembelanjaan (Ya/Tidak)")
        var pilih = scan.next()
        if (pilih == "Ya") {
            println("Masukkan jumlah Harga Belanja")
            list.add(scan.nextInt())
        } else {
            var a =0
            println("terima kasih")
            for (p in 0..list.size-1) {
                a= a + list.get(p)
            }
            if (a > 150000) {
                var diskon = (a * 5) / 100
                a = a - diskon
                println("total belanja $a")
            } else {
                println("total belanja $a")
            }
        }
    }while(pilih!="Tidak")
}
package com.example.helloandroid

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.helloandroid.ui.theme.HelloAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val namaToko: String = "Warung bu yannti"
        val hargaproduk: Double = 15000.0
        val stokbarang: Int = 3
        val tokotutup: Boolean = true

        if (stokbarang<5){
            Log.d("KatalogUMKM","Peringatan: Stok $namaToko Menipis, Stok sisa $stokbarang")
        } else {
            Log.d("KatalogUMKM","Stok $namaToko aman, Sisa Stok $stokbarang")
        }
        val kategoriproduk: String = "Makanan"
        when (kategoriproduk){
            "Makanan" -> Log.d("KatalogUMKM","Kategori: Makanan - Simpan Di Tempat Sejuk")
            "Minuman" -> Log.d("KatalogUMKM","Kategori:Minuman - Simpan DI Kulkas")
            "Kerajinan" -> Log.d("KatalogUMKM","Kategori: Kerajinan - Pajang Di Etalase")
            else -> Log.d("KatalogUMKM","Kategori Tidak Di Kenal")
        }
        val daftarProduk = listOf("Keripik Singkong", "Kopi Batusangkar", "kain Songket")
        for (produk in daftarProduk){
            Log.d("KatalogUMKM","Produk Tersedia: $produk")
        }
        var stokSimulasi: Int = 3
        while (stokSimulasi>0) {
            Log.d("KatalogUMKM","Simulasi:barang terjual, sisa stok $stokSimulasi")
            stokSimulasi = stokSimulasi - 1
        }
        Log.d("KatalogUMKM","Simulasi: Stok habis")


        Log.d("KatalogUmkm","Nama Toko: $namaToko")
        Log.d("KatalogUmkm","Harga Produk: $hargaproduk")
        Log.d("KatalogUmkm","Stok Barang: $stokbarang")
        Log.d("KatalogUmkm","Toko Buka: $tokotutup")

        Toast.makeText(this,"Selamat datang di $namaToko\nStok barang : $stokbarang",
            Toast.LENGTH_LONG).show()

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloAndroidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloAndroidTheme {
        Greeting("Android")
    }
}
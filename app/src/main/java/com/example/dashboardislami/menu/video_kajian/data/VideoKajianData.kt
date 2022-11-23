package com.example.dashboardislami.menu.video_kajian.data

import com.example.dashboardislami.R
import com.example.dashboardislami.menu.video_kajian.model.VideoKajianModel

object VideoKajianData {

    private val thumbnailVideo = intArrayOf(
        R.drawable.kajianterhapusdosa,
        R.drawable.melihatjin,
        R.drawable.mawaldhy,
        R.drawable.idnsyeikh,
        R.drawable.derajatshalat


    )
    private val urlVideo = arrayOf(
        "sKqA87_Afto",
        "FrtvIv9_MVI",
        "ydXllM6xKhc",
        "qfMcGYwwph0",
        "hozr4Mzx750"
    )
    private val channelVideo = arrayOf(
        "Rumaysho TV",
        "Buya Arrazy Hasyim Love",
        "Rayyan",
        "IDN TV",
        "RUmaysho TV"
    )
    private val speakerVideo = arrayOf(
        "Ustad M Abduh Tuasikal",
        "Buya Arrazy Hasyim",
        "Ustad Mawaldhy Adha M",
        "Syeikh Faishol",
        "Ustad M Abduh Tuasikal"
    )
    private val titleVideo = arrayOf(
        "Kajian Malam Kamis: Dosa akan Terhapus Dengan Melakukan Shalat Lima Waktu",
        "Apakah Manusia Bisa Melihat Jin",
        "Profil Kamar Ja'far Bin Abu Thalib (IDN Boarding School)",
        "Bincang santai dengan Syaikh Faishol Al-Yamani",
        "Kajian Malam Kamis: 27 Derajat Dalam Shalat Berjamaah"
    )

    private val deskripsiVideo = arrayOf(
        "Shalat pada waktunya merupakan kewajiban yang harus dilakukan setiap Muslim. Shalat di awal waktu merupakan amalan yang paling afdhal dan penuh dengan keutamaan. Dan yang merugilah bagi orang yang menyia-nyiakan waktu shalat.",
        "Apakah Manusia Bisa Melihat Jin, Begini Penjelasannya Oleh Buya Arrazy Hasyim. Apakah Manusia Bisa Melihat Jin, Begini Penjelasannya Oleh Buya Arrazy Hasyim.",
        "Jangan lupa like, comment, dan subscribe video ini.\n" +
                "\n" +
                "jangan lupa follow IG:\n" +
                "instagram.com/ross_rzld\n" +
                "instagram.com/dafa_dif\n" +
                "instagram.com/mwldy_ad.15\n" +
                "\n" +
                "\n" +
                "2022 ©Dean",
        "Pada kesempatan kali ini, Team Media Creative IDN kembali menampilkan video terbaru dari IDN Boarding School, Judulnya Bincang Santai bersama Syeikh Faishol Ali Al-Qodiri Al-Yamani. \n" +
                "\n" +
                "Di video ini, Mochamad Ridwan Al'faridzi ( Siswa kelas 11 TKJ IDN Boarding School ) akan mewawancarai Syeikh Faishol tentang Asal, Latar belakang pendidikan beliau sampai sejarah beliau bisa sampai ke Indonesia dan menjadi Arabic Native Speaker di IDN Boarding School. \n" +
                "\n" +
                "Di video ini juga Syeikh Faishol akan bercerita tentang Testimoni dan kesan kesan beliau selama mengajar di IDN Boarding School..\n" +
                "\n" +
                "Oh iya Guys, berbeda dengan Podcast IDN biasanya yang menggunakan bahasa inggris sebagai bahasa pengantarnya, di video ini Kak Ridwan akan mewawancarai Syeikh Faishol menggunakan Bahasa Arab... Masya Allah Tabarokallah..",
        "Terdapat banyak sekali keutamaan shalat berjamaah di Masjid yang sayang sekali untuk dilewatkan begitu saja. Beberapa diantaranya adalah, shalat berjamaah di Masjid lebih utama 27 derajat daripada shalat sendirian, shalat berjamaah akan menghapuskan dosa, setiap langkah kaki seseorang yang berangkat dari rumah dalam keadaaan telah berwudhu akan diganjar dengan ditinggikannya derajat dan diampuni dosa-dosanya."
    )


    val listdata: ArrayList<VideoKajianModel>
        get() {
            var list = arrayListOf<VideoKajianModel>()
            for (position in titleVideo.indices) {

                var video = VideoKajianModel()
                video.thumbnailVideo = thumbnailVideo[position]
                video.channelVideo = channelVideo[position]
                video.urlVideoKajian = urlVideo[position]
                video.titleVideo = titleVideo[position]
                video.speakervideo = speakerVideo[position]
                video.deskripsiVideo = deskripsiVideo[position]
//                tambahkan video ke dalam varibale list
                list.add(video)

            }

            return list

        }
}
package com.example.dashboardislami.menu.Doa.data

import com.example.dashboardislami.menu.Doa.model.DoaModel

object DoaMakanMinum {

    private val doaTitle = arrayOf(
        "Doa Makan",
        "Doa Ketika Lupa Baca Doa Makan",
        "Doa Setelah Makan",
        "Doa Berbuka Puasa"
    )
    private val doaDoa = arrayOf(
        "بِسْمِ ٱللَّٰهِ ِ",
        "بِسْمِ اللَّهِ فِيْ أَوَّلِهِ وَآخِرِهِ",
        "الْحَمْدُ للَّهِ الَّذِي أَطْعَمَنِي هَذَا، وَرَزَقَنِيهِ، مِنْ غَيْرِ حَوْلٍ مِنِّي وَلَا قُوَّة",
        "ذَهَبَ الظَّمَأُ وَابْتَلَّتِ الْعُرُوقُ، وَثَبَتَ الأَجْرُ إِنْ شَاءَ اللَّه"
    )
    private val doaTranslate = arrayOf(
        "Dengan Menyebut Nama Allah",
        "Dengan Menyebut Nama Allah di awal dan di akhir",
        "Segala puji bagi Allah Yang memberi makan ini kepadaku dan Yang memberi rezeki kepadaku tanpa daya dan kekuatanku.",
        "Telah hilang rasa haus, dan urat-urat telah basah serta pahala akan tetap, insya Allah.",

        )
    private val doaLatin = arrayOf(
        "Bismillah",
        "Bismillah Fi Awalihi wa Akhiri",
        "Alhamdulillahilladzi ath'amani hadza, wa Rodzaqnihi min goiri hauli minnii wa la kuwwah",
        "Dzahabadzomau Wabtallatil uruuqu wasyabatal ajru insya allah"
    )
    private val doaProfile = arrayOf(
        "Hadist Ahmad Tirmidzi",
        "Hadist Riwayat Abu Dawud dan At-Tirmidzi",
        "Hadist Riwayat Abu Dawud, At-Tirmidzi, dan Ibnu Majah",
        "Muttafaq Alaihi"
    )
    val listDoaMakanMinum: ArrayList<DoaModel>
        get() {

            val list = arrayListOf<DoaModel>()
            for (data in DoaMakanMinum.doaTitle.indices) {
                val model = DoaModel()
                model.title = doaTitle[data]
                model.doa = doaDoa[data]
                model.latin = doaLatin[data]
                model.translate = doaTranslate[data]
                model.profile = doaProfile[data]
                list.add(model)
            }

            return list


        }

}
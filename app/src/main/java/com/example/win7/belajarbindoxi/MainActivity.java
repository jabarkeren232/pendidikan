package com.example.win7.belajarbindoxi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        String[][] data = new String[][]{
                {"Cerpen", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTMoYoZ-LFJuO2b09VAyll1kHAZYDbPVplwtSERY8nbRGteGc4kSA",
                        "Pengertian Cerpen",
                        "Cerpen adalah jenis karya sastra yang diparkan atau dijelaskan dalam bentuk tulisan yang berwujud sebuah cerita atau kisah secara pendek, jelas, serta ringkas. Cerpen bisa disebut juga dengan sebuah prosa fiksi yang isinya tentang pengisahan yang hanya terfokus pada satu konflik atau permasalahan.",
                        " Untuk lebih singkatnya cerpen itu adalah cerita pendek yang hanya berpusat pada satu konflik"},
                {
                        "Cerpen", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTMoYoZ-LFJuO2b09VAyll1kHAZYDbPVplwtSERY8nbRGteGc4kSA",
                        "Ciri-Ciri Cerpen",
                        "1.Jalan ceritanya lebih pendek dari novel\n" +
                                "2.Sebuah cerpen memiliki umlah kata yang tidak lebih dari 10.000 (10 ribu) kata\n" +
                                "3.Biasanya isi cerita cerpen berasal dari kehidupan sehari-hari\n" +
                                "4.Tidak menggambarkan semua kisah para tokohnya, hal ini karena dalam cerpen yang digambarkan hanyalah inti sarinya saja.\n" +
                                "5.Tokoh dalam cerpen digambarkan mengalami masalah atau suatu konflik hingga pada tahap penyelesainnya"
                        ,
                        "6.Pemakaian kata yang sederhana serta ekonomis dan mudah dikenal pembaca.\n" +
                                "7.Kesan yang ditinggalkan dari cerpen tersebut sangat mendalam sehingga pembaca dapat ikut merasakan kisah dari cerita tersebut.\n" +
                                "8.Biasanya hanya 1 kejadian saja yang diceritakan.\n" +
                                "9.Memiliki alur cerita tunggal dan lurus.\n" +
                                "10.Penokohan pada cerpen sangatlah sederhana, tidak mendalam serta singkat\n"

                },
                {
                        "Cerpen", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTMoYoZ-LFJuO2b09VAyll1kHAZYDbPVplwtSERY8nbRGteGc4kSA",
                        "Struktur Cerpen",
                        "1.Abstrak\n" +
                                "Abstrak merupakan ringkasan atau inti dari cerita pendek yang akan dikembangkan menjadi sebuah rangkaian-rangkaian peristiwa atau bisa juga sebagai gambaran awal dalam cerita. Abstrak bersifat opsional atau dalam artian bahwa setiap cerpen boleh tidak terdapat struktur abstrak tersebut.\n" +
                                "2.Orientasi\n" +
                                "Orientasi berkaitan dengan waktu, suasana, dan tempat yang berkaitan dengan jalan cerita dari cerpen tersebut.\n" +
                                "3.Komplikasi\n" +
                                "Komplikasi berisi urutan kejadian-kejadian yang dihubungkan secara sebab dan akibat. Pada komplikasi, biasanya mendapatkan karakter ataupun watak dari berbagai tokoh cerita pendek tersebut, hal ini karena pada bagian komplikasi kerumitan mulai bermunculan.\n" +
                                "\n",
                        "4.Evaluasi\n" +
                                "    Evaluasi yaitu struktur konflik yang terjadi dan mengarah pada klimaks serta sudah mulai mendapatkan penyelesaiannya dari konflik yang terjadi tersebut.\n" +
                                "5.Resolusi\n" +
                                "    Pada bagian resolusi, pengarang mulai mengungkapkan solusi yang dialami tokoh.\n" +
                                "6.Koda\n" +
                                "    Pada bagian koda, terdapat nilai ataupun pelajaran yang dapat diambil dari cerita pendek tersebut oleh pembacanya.\n" +
                                "\n"
                },
                {
                        "Teks Prosedur", "http://www.gurupendidikan.co.id/wp-content/uploads/2017/01/teks-prosedur-600x307.png",
                        "Pengertian Teks prosedur",
                        "Teks Prosedur merupakan teks yang berisi langkah-langkah atau tahap-tahap yang harus ditempuh untuk mencapai tujuan.",
                        ""
                },
                {
                        "Teks Prosedur",
                        "http://www.gurupendidikan.co.id/wp-content/uploads/2017/01/teks-prosedur-600x307.png",
                        "Tujuan Teks Prosedur",
                        "Tujuan penulisan teks prosedur merupakan untuk membantu pembaca atau pendengar untuk memahami bagaimana cara melakukan atau membuat sesuatu dengan tepat.",
                        ""

                },
                {
                        "Teks Prosedur", "http://www.gurupendidikan.co.id/wp-content/uploads/2017/01/teks-prosedur-600x307.png",
                        "Ciri-Ciri Teks Prosedur",
                        "Adapun ciri-ciri teks prosedur yang diantaranya yaitu:", "\n" +
                        "1.Menggunakan pola kalimat perintah (imperatif).\n" +
                        "2.Menggunakan kata kerja aktif.\n" +
                        "3.Menggunakan kata penghubung (konjungsi) untuk mengurutkan kegiatan.\n" +
                        "4.Menggunakan kata keterangan untuk menyatakan rinci waktu, tempat dan cara yang akurat.\n"
                }, {
                "Teks Prosedur",
                "http://www.gurupendidikan.co.id/wp-content/uploads/2017/01/teks-prosedur-600x307.png",
                "Macam-Macam Teks Prosedur",
                "Teks Prosedur Sederhana\n" +
                        "Prosedur yang dapat ditempuh hanya dengan dua atau tiga langkah saja, contoh: prosedur mengoperasikan setrika.\n" +
                        "Teks Prosedur Kompleks\n" +
                        "Prosedur yang terdiri atas banyak langkah dan langkah-langkah tersebut berjenjang dengan sublangkah pada setiap langkahnya. Contoh: prosedur tentang terkena tilang.",
                "Protokol\n" +
                        "Prosedur yang langkah-langkahnya tidak terlalu ketat/rumit dan mudah dipahami."
        }, {
                "Teks Prosedur",
                "http://www.gurupendidikan.co.id/wp-content/uploads/2017/01/teks-prosedur-600x307.png",
                "Macam-Macam Kalimat Dalam Teks Prosedur",
                "Kalimat Imperatif\n" +
                        "Kalimat yang mengandung perintah, fungsinya ialah untuk meminta atau melarang seseorang untuk melakukan sesuatu.\n" +
                        "Kalimat Deklaratif\n" +
                        "Kalimat yang berisi pernyataan, fungsinya ialah untuk memberikan informasi atau berita tentang sesuatu.",
                "Kalimat Intereogatif\n" +
                        "Kalimat yang berisi pertanyaan, fungsinya ialah untuk meminta informasi tentang sesuatu."
        }, {
                "Teks Prosedur",
                "http://www.gurupendidikan.co.id/wp-content/uploads/2017/01/teks-prosedur-600x307.png",
                "Contoh Teks Prosedur",
                "Kaca untuk botol dibuat dari pasir, batu gamping dan abu soda dengan menempuh langkah-langkah sebagai berikut.",
                "\n" +
                        "    Pertama, ketiga bahan tersebut dicampur secara proporsional.\n" +
                        "    Kadang-kadang pecahan-pecahan kaca ditambahkan.\n" +
                        "    Kemudian campuran itu dipanaskan dalam tungku pada suhu yang sangat tinggi.\n" +
                        "    Lalu adonan kaca diproduksi.\n" +
                        "    Setelan itu, campuran adonan itu dibentuk menjadi botol dengan cetakan.\n" +
                        "    Selanjutnya untuk memperkuat kaca botol-botol tersebut, botol-botol itu dipanaskan kembali lalu didinginkan.\n" +
                        "    Akhirnya, botol-botol itu siap digunakan.\n"
        }, {
                "Teks Eksplanasi",
                "https://i2.wp.com/www.bagi-in.com/wp-content/uploads/2017/08/teks-eksplanasi.png?fit=750%2C600&ssl=1",
                "Pengertian Teks Eksplanasi",
                " Teks ekspalanasi berasal dari kata “explain” yang artinya jelaskan, maka dapat disimpulkan bahwa pengertian teks eksplanasi adalah teks yang didalamnya berisi penjelasan atau proses-proses bagaimana dan mengapa dari sebuah topik yang berkaitan dengan suatu kejadian atau lingkungan sekitar dalam kehidupan sehari-hari.",
                " Tanpa kita sadari semua fenomena yang terjadi disekitar kita memiliki hubungan sebab dan akibat dalam setiap prosesnya. Disamping merasakan fenomena tersebut, kita juga harus menganalisa dan mencermati apa sebab dan akibat yang terjadi.\n" +
                        " Maka dari itu untuk mengidentifikasi sebuah teks eksplanasi maka kita harus mengetahui pengertian teks eksplanasi itu sendiri secara jelas. Pada dasarnya pengertian teks eksplanasi dapat kita temukan pada pembelajaran di tingkat SMA mapun SMK."
        }, {
                "Teks Eksplanasi",
                "https://i2.wp.com/www.bagi-in.com/wp-content/uploads/2017/08/teks-eksplanasi.png?fit=750%2C600&ssl=1",
                "Ciri-ciri Teks Eksplanasi",
                " Sama seperti teks pada umumnya, teks eksplanasi memiliki ciri ciri khusus yang dapat membantu kita mengidentifikasi apakah sebuah teks termasuk dalam teks eksplanasi ataupun tidak. Hal ini telah saya rangkum dalam ciri ciri teks eksplanasi. Teks dapat dikatakan sebagai teks eksplanasi jika memiliki kriteria dibawah ini:",
                "\n" +
                        "1.Informasi yang terkandung didalam teks bersifat fakta dan bukan merupakan rekayasa.\n" +
                        "2.Informasi yang disampaikan adalah informasi ilmiah atau real yang mengandung pengetahuan dan bukan merupakan karangan atau fiksi.\n" +
                        "3.Memiliki sifat yang informatif dan membujuk pembacanya.\n" +
                        "4.Diawali dengan pernyataan umum,  urutan sebab dan akibat, dan terdapat interpretasi.\n"
        }, {
                "Teks Eksplanasi",
                "https://i2.wp.com/www.bagi-in.com/wp-content/uploads/2017/08/teks-eksplanasi.png?fit=750%2C600&ssl=1",
                " Struktur Teks Eksplanasi",
                "Selain memiliki ciri ciri kebahasaan, teks eksplanasi juga memiliki struktur singkat yang terdiri atas penjelasan umum, deretan penjelas, dan interpretasi. Ketiga struktur tersebut telah saya rangkum dalam struktur teks eksplanasi pada artikel ini. Teks eksplanasi dikatakan baik dan benar jika memiliki struktur yang sesuai atau semestinya, berkut adalah struktur teks eksplanasi yang benar terdiri dari:",
                "\n" +
                        "1.Pernyataan Umum : adalah bagian pertama dari teks eksplanasi yang terdapat pada awal paragraf yang berisi tentantang penyampaian topik atau permasalahan yang dibahas. Pada bagian ini berisi gambaran mengapa dan bagaimana sebuah fenomena dapat terjadi. Dalam menulis pernyataan umum harus menarik agar pembaca tertarik untuk membacanya.\n" +
                        "2.Deretan Penjelas : Berisikan tentang hubungan sebab dan akibat tentang suatu fenomena yang akan disusun berdasarkan urutan waktu.\n" +
                        "3.Interpretasi : Adalah bagian akhir atau penutup teks eksplanasi yang terdapat pada akhir paragraf dan berisi inti atau kesimpulan dari sebuah fenomena.\n"
        },
                {
                        "Proposal",
                        "https://www.projectsmart.co.uk/img/proposal.png",
                        "Pengertian Proposal",
                        "pengertian proposal ialah rancangan dari suatu usulan sebuah penelitian yang kemudian akan dilaksanakan oleh peneliti terhadap bahan penelitiannya. Dalam pengertian proposal ini itu berarti proposal sama halnya dengan usulan.",
                        "Ada juga yang menyatakan bahwa pengertian proposal itu ialah suatu permintaan atau dapat juga dikatakan sebagai saran yang ditujukan kepada seseorang, instansi, organisasi, suatu badan, atau suatu kelompok untuk menjalankan atau melaksanakan suatu pekerjaan."

                }, {
                "Proposal",
                "https://www.projectsmart.co.uk/img/proposal.png",
                "Tujuan Proposal ",
                "Tujuan Proposal adalah memperoleh bantuan dana,memperoleh dukungan atau sponsor, dan memperoleh perizinan. ",
                "Unsur-unsur proposal yaitu, nama/ judul kegiatan, pendahuluan,tujuan, waktu dan tempat, sasaran kegiatan, susunan panitia, anggaran, penutup, tanda tangan dan nama terang."

        }, {
                "Proposal",
                "https://www.projectsmart.co.uk/img/proposal.png",
                "Fungsi Proposal",
                "1.Fungsi proposal untuk melakukan penelitian yang berkenaan dengan agama, sosial, politik, ekonomi, budaya, dan sebagainya.\n" +
                        "2.Fungsi proposal untuk mendirikan usaha kecil, menengah, atau besar.\n" +
                        "3.Fungsi proposal untuk mengajukan tender dari lembaga-lembaga pemerintah atau swasta",
                "4.Fungsi proposal untuk mengajukan kredit kepada bank.\n" +
                        "5.Fungsi proposal untuk mengadakan acara seminar, diskusi, pelatihan, dan sebagainya."
        }, {
                "Proposal",
                "https://www.projectsmart.co.uk/img/proposal.png",
                "Jenis-jenis Proposal",
                " Secara umum proposal dibedakan menjadi 4 jenis yaitu:",
                "\n" +
                        "\n" +
                        "1.Proposal Bisnis - proposal ini berkaitan dengan dunia usaha baik itu perseorangan maupun kelompok dan contoh dari proposal ini misalnya proposal pendirian usaha, proposal dalam bentuk kerjasama antar perusahaan.\n" +
                        "2.Proposal Proyek - pada umumnya proposal proyek ini mengacu pada dunia kerja yang berisikan serangkaian rencana bisnis atau komersil misalnya proposal proyek pembangunan.\n" +
                        "3.Proposal Penelitian - Jenis proposal ini lebih sering digunakan di bidang akademisi misalnya penelitian untuk pembuatan skripsi, tesis dan lainnya. isi dari proposal ini adalah pengajuan kegiatan penelitan.\n" +
                        "4.Proposal Kegiatan - yaitu pengajuan rencana sebuah kegiatan bak itu bersifat individu maupun kelompok misalnya proposal kegiatan pentas seni budaya.\n" +
                        "\n"
        },
                {
                        "Proposal",
                        "https://www.projectsmart.co.uk/img/proposal.png",
                        "Unsur-unsur Proposal",
                        "1.Latar belakang masalah, Dikemukakan adanya kesenjangan antara harapan dan kenyataan, baik kesenjangan teoretik ataupun kesenjangan praktis yang melatarbelakangi masalah yang diteliti. Selain itu, dipaparkan secara ringkas tentang teori, hasil-hasil penelitian, kesimpulan seminar, dan diskusi ilmiah maupun pengalaman pribadi yang terkait erat dengan pokok masalah yang diteliti. Dengan demikian, masalah yang dipilih untuk diteliti mendapat landasan berpijak yang lebih kokoh.\n" +
                                "2.Rumusan masalah, Rumusan masalah dinyatakan secara tersurat berupa pertanyaan-pertanyaan yang ingin dicarikan jawabannya. Dalam hal ini hendaknya rumusan masalah disusun secara singkat, padat, jelas, dan dituangkan dalam bentuk kalimat tanya. Rumusan masalah yang baik akan menampakkan variabel-variabel yang diteliti dan dapat diuji secara empiris.\n" +
                                "3.Tujuan penelitian, Tujuan penelitian diungkapkan pada sasaran yang ingin dicapai dalam penelitian.Tujuan penelitian mengacu pada rumusan penelitian dan berupa pernyataan.",
                        "4.Hipotesis, Hipotesis diajukan berupa jawaban sementara terhadap masalah penelitian agar hubungan antara masalah yang diteliti dengan kemungkinan jawabannya lebih jelas.Adapun rumusan hipotesis yang baik hendaknya: dituangkan dalam bentuk kalimat pernyataan, dirumuskan secara singkat, padat, dan jelas, dapat diuji secara empiris, dan menyatakan pertautan antara dua variabel atau lebih.\n" +
                                "5.Asumsi penelitian, Asumsi penelitian adalah anggapan dasar tentang suatu hal yang dijadikan pijakan berpikir dan bertindak dalam melaksanakan penelitian. Dalam hal ini tidak perlu dibuktikan kebenarannya, tetapi dapat langsung memanfaatkan hasil penelitian yang diperolehnya dari orang lain melalui karya tulisnya."
                },
                {
                        "Pidato",
                        "https://lh5.googleusercontent.com/proxy/cAQ2jSuhlQDGMC_ZgNrIgbIOzUvLtewhoBInGtfP8kA7j5n5ZCJ-vn-qqwbou7iELkLhTsOGNxOlxcaRAIDbL5MW0dkkocU7HV2Wu3XU54o43mQ7tdnC-qSnceYxMRFEX73Y8JSWpTBnaNOdFJiKepBEC1uKdJLsPg=w1200-h630-p-k-no-nu",
                        "Pengertian Pidato",
                        " Dalam Kamus Lengkap Bahasa Indonesia dijelaskan bahwa:",
                        "a. Pidato berarti menyampaikan pikiran dalam bentuk kata-kata yang disampaikan kepada orang banyak;\n" +
                                "b. Pidato juga merupakan wacana yang disiapkan untuk disampaikan di depan khalayak, Sedangkan\n" +
                                "c. Ceramah adalah Pidato yang disampaikan oleh pembicara di depan audiens (banyak orang)."
                }, {
                "Pidato",
                "https://lh5.googleusercontent.com/proxy/cAQ2jSuhlQDGMC_ZgNrIgbIOzUvLtewhoBInGtfP8kA7j5n5ZCJ-vn-qqwbou7iELkLhTsOGNxOlxcaRAIDbL5MW0dkkocU7HV2Wu3XU54o43mQ7tdnC-qSnceYxMRFEX73Y8JSWpTBnaNOdFJiKepBEC1uKdJLsPg=w1200-h630-p-k-no-nu",

                "Ciri-ciri Pidato",
                "Dalam sumber yang lain dijelaskan bahwa ciri pidato adalah:",
                "a. Merupakan jenis berbicara satu arah, dalam hal ini, orang lain berperan sebagai penyimak atau pendengar.\n" +
                        "b. Seseorang yang berpidato akan terus berbicara tanpa disela oleh pendengarnya.\n" +
                        "c. Masalah yang disampaikan biasanya materi pokok pikiran atau gagasan-gagasan yang dimilikinya,\n" +
                        "d. Biasanya pidato dilakukan dalam acara-acara resmi.\n" +
                        "e. Penyampaian pidato dapat dilakukan dengan cara bebas (secara langsung) dan ada yang mempergunakan teks."
        }, {
                "Pidato",
                "https://lh5.googleusercontent.com/proxy/cAQ2jSuhlQDGMC_ZgNrIgbIOzUvLtewhoBInGtfP8kA7j5n5ZCJ-vn-qqwbou7iELkLhTsOGNxOlxcaRAIDbL5MW0dkkocU7HV2Wu3XU54o43mQ7tdnC-qSnceYxMRFEX73Y8JSWpTBnaNOdFJiKepBEC1uKdJLsPg=w1200-h630-p-k-no-nu",
                "Tujuan Umum Berpidato",
                "Adapun tujuan utama seseorang harus berpidato adalah sebagai berikut:",
                "a. Untuk menginformasikan (to inform),\n" +
                        "b. Untuk menghibur (to entertain),\n" +
                        "c. Untuk membujuk, merayu dan mempengaruhi (to persuade)."
        }, {
                "Pidato",
                "https://lh5.googleusercontent.com/proxy/cAQ2jSuhlQDGMC_ZgNrIgbIOzUvLtewhoBInGtfP8kA7j5n5ZCJ-vn-qqwbou7iELkLhTsOGNxOlxcaRAIDbL5MW0dkkocU7HV2Wu3XU54o43mQ7tdnC-qSnceYxMRFEX73Y8JSWpTBnaNOdFJiKepBEC1uKdJLsPg=w1200-h630-p-k-no-nu",
                "Jenis-jenis Pidato",
                " Berdasarkan tujuan umum pidato di atas pidato dibagi lagi ke dalam beberapa jenis pidato, yaitu:",
                "a. Pidato Intruktif\n" +
                        "adalah pidato yang mempunyai tujuan untuk menyampaikan berita atau informasi penting kepada pendengar. Contohnya: Pidato Kenegaraan.\n" +
                        "\n" +
                        "b. Pidato Rekreatif\n" +
                        "Adalah pidato yang dipergunakan untuk menghibur pendengar yang ada pada saat itu. Contohnya: Pidato pada aat perayaan pesta ulang tahun.\n" +
                        "\n" +
                        "c. Pidato Persuasif\n" +
                        "Adalah pidato yang bertujuan mempengaruhi pendengar. Contohnya: Pidato Kampanye."
        }, {
                "Drama",
                "http://courtauldmemorialhall.co.uk/wp-content/uploads/2017/08/drama-masks.jpg",
                "Sejarah Drama",
                "Drama sudah menjadi tontonan sejak zaman dahulu. Nenek moyang kita sudah pernah memainkan drama sejak ribuan tahun yang lalu. Terdapat sebuah bukti tertulis yang dapat dipertanggungjawabkan yang mengungkapkan bahwa drama sudah ada pada abad kelima SM. Hal ini didasarkan pada temuan naskah drama kuno di Yunani. Penulisnya yaitu Aeschylus yang hidup antara tahun 525-456 SM. Isi ceritanya berupa persembahan kepada dewa-dewa.\n"
                ,
                " Di Indonesia, sejarah lahirnya drama ini juga tidak jauh berbeda dengan kelahiran drama di Yunani. Drama di Indonesia juga diawali dengan upacara keagamaan yang diselenggarakan pada zaman dahulu oleh para pemuka agama.\n" +
                        "\n"
        }, {
                "Drama",
                "http://courtauldmemorialhall.co.uk/wp-content/uploads/2017/08/drama-masks.jpg",
                " Jenis-Jenis Drama ",
                "Ada beberapa jenis drama tergantung dari dasar yang digunakannya. Dalam bentuk pembagian jenis drama, biasanya digunakan 3 dasar, yaitu : berdasarkan penyajian kisah drama, berdasarkan sarana, serta berdasarkan keberadaan naskah drama tersebut. Berdasarkan penyajian kisah, drama dapat dibedakan menjadi 8 jenis, antara lain:\n" +
                        "\n",
                "\n" +
                        "    Tragedi: drama yang bercerita tentang kesedihan.\n" +
                        "    Komedi: drama yang bercerita tentang komedi yang penuh dengan kelucuan.\n" +
                        "    Tragekomedi: perpaduan antara kisah drama tragedi dan komedi.\n" +
                        "    Opera: drama yang dialognya dengan cara dinyanyikan dan diiringi musik.\n" +
                        "    Melodrama: drama yang dialognya diucapkan dan dengan diiringi musik.\n" +
                        "    Farce: drama yang menyerupai dagelan, namun tidak sepenuhnya drama tersebut dagelan.\n" +
                        "    Tablo: jenis drama yang lebih mengutamakan gerak, para pemainnya tidak mengucapkan suatu dialog, namun dengan melakukan berbagai gerakan.\n" +
                        "    Sendratari: gabungan antara seni drama serta seni tari.\n" +
                        "\n" +
                        "\n"
        }, {
                "Drama",
                "http://courtauldmemorialhall.co.uk/wp-content/uploads/2017/08/drama-masks.jpg",
                " Unsur-Unsur Drama",
                " Berikut unsur-unsur drama : ",
                "\n" +
                        "1.Tema merupakan ide pokok atau sebuah gagasan utama dalam cerita drama.\n" +
                        "2.Alur yaitu jalan cerita dari pertunjukkan drama dimulai pada babak pertama sampai babak terakhir.\n" +
                        "3.Tokoh drama terdiri atas tokoh utama dan tokoh pembantu. Tokoh utama disebut juga dengan primadona sedangkan peran pembantu disebut dengan figuran.\n" +
                        "4.Watak merupakan perilaku yang diperankan oleh si tokoh drama tersebut. Watak protagonis adalah salah satu jenis watak dan protagonis adalah berwatak baik. Sedangkan watak antagonis merupakan watak yang jahat.\n" +
                        "5.Latar adalah gambaran tempat, waktu, serta situasi yang terjadi dalam kisah drama yang berlangsung.\n" +
                        "6.Amanat drama merupakan pesan yang disampaikan dari pengarang cerita drama tersebut kepada penonton. Amanat drama dapat disampaikan dengan melalui peran para tokoh drama tersebut.\n" +
                        "\n" +
                        "\n"
        }, {
                "Drama",
                "http://courtauldmemorialhall.co.uk/wp-content/uploads/2017/08/drama-masks.jpg",
                " Ciri-Ciri Teks Drama",
                "1.Seluruh cerita drama berbentuk dialog, baik tokoh dan juga narator. Inilah ciri utama dalam naskah dialog, semua ucapan ditulis dalam bentuk teks.\n" +
                        "2.Dialog dalam drama tidak menggunakan tanda petik (\"...\"). Hal ini karena dialog drama bukan sebuah kalimat langsung. Oleh karena itu, naskah drama sendiri tidak menggunakan tanda petik.\n" +
                        "\n",
                "3.Naskah drama sendiri dilengkapi dengan sebuah petunjuk tertentu yang harus dilakukan pada tokoh yang pemeran bersangkutan. Petunjuk tersebut ditulis dalam tanda kurung atau dapa juga dengan menggunakan jenis huruf yang berbeda dengan huruf pada dialog.\n" +
                        "4.Naskah drama terletak diatas dialog atau disamping kiri dialog.\n" +
                        "\n" +
                        "\n"
        }
        };
        private ListView lvItem;
        private ArrayList listItem;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            lvItem = (ListView) findViewById(R.id.lv_item);
            listItem = new ArrayList<>();

            ModelMateri materi = null;

            for (int i = 0; i < data.length; i++) {
                materi = new ModelMateri();
                materi.setTittle(data[i][0]);
                materi.setImage(data[i][1]);
                materi.setJudul(data[i][2]);
                materi.setIsi(data[i][3]);
                materi.setIsi2(data[i][4]);

                listItem.add(materi);
            }
            MateriAdapter adapter = new MateriAdapter(MainActivity.this, listItem);
            lvItem.setAdapter(adapter);
            lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    ModelMateri mtri = (ModelMateri) listItem.get(position);

                    Intent intent = new Intent(MainActivity.this, DetailMateri.class);
                    intent.putExtra(DetailMateri.KEY_ITEM, mtri);
                    startActivityForResult(intent, 0);
                }
            });
        }


        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.tentang, menu);
            return true;
        }


        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.Hiburan:
                    Intent i = new Intent(MainActivity.this, Hiburan.class);
                    startActivity(i);
                    break;
                case R.id.tentang:
                    Intent e = new Intent(MainActivity.this, Tentang.class);
                    startActivity(e);
                    break;
                case R.id.exit:
                    finish();

                    return super.onOptionsItemSelected(item);
            }
            return true;
        }


    }


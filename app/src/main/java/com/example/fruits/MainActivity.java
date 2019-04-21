package com.example.fruits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();

    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://jagad.id/wp-content/uploads/2018/02/Manfaat-Buah-Naga-Untuk-Kesehatan-dan-Efek-Samping.jpg");
        mNames.add("Buah Naga");
        mDesc.add("Buah naga sering dianggap membawa keberkahan tersendiri. Khususnya bagi kalangan masyarakat Vietnam dan juga Tiongkok. Mereka kerap meletakkan jenis buah ini di antara patung-patung naga di atas meja altar. Di dalam bahasa China, buah ini dikenal dengan Thang Loy yang diterjemahkan menjadi sebutan Dragin Fruit di dalam bahasa Inggris.\n" +
                "\n" +
                "Tekstur dari buah naga sendiri kerap disamakan dengan jenis buah kiwi lantaran bijinya yang sangat renyah dan juga hitam. Daging dari buah satu ini sangatlah manis saat dimakan. Ia juga memiliki biji yang biasanya dimakan oleh orang-orang bersamaan dengan dagingnya.");

        mImageUrls.add("https://i5.walmartimages.ca/images/Large/-42/253/999999-42253.jpg");
        mNames.add("Alpukat");
        mDesc.add("Avokad (Persea americana) ialah tumbuhan penghasil buah meja dengan nama sama. Tumbuhan ini berasal dari Meksiko dan Amerika Tengah dan kini banyak dibudidayakan di Amerika Selatan dan Amerika Tengah sebagai tanaman perkebunan monokultur dan sebagai tanaman pekarangan di daerah-daerah tropika lainnya di dunia.");

        mImageUrls.add("https://jatenglive.com/images/news/Hati-–-Hati----Jika-Menemukan-Semangka-Seperti-Ini-Jangan-Dikonsumsi-news20180829-reps%20indonesia.jpg");
        mNames.add("Semangka");
        mDesc.add("Buah semangka merupakan salah satu jenis buah yang dihasilkan oleh tanaman merambat. Buah satu ini memiliki bentuk yang besar dengan kulit buah yang relatif keras. Buahnya memiliki warna hijau muda yang ditambah dengan garis hijau tua.\n" +
                "\n" +
                "Buah semangka yang kerap dikonsumsi masyarakat umumnya memiliki warna merah disertai dengan biji yang kecil di dalamnya berwarna coklat. Namun, tahukah Anda bahwa ada juga daging buah semangka yang memiliki warna kuning.");

        mImageUrls.add("https://bumade.com/wp-content/uploads/2018/09/mangga.jpg");
        mNames.add("Mangga");
        mDesc.add("Buah mangga adalah salah satu jenis buah yang cukup favorit di Indonesia. Hal itu dikarenakan buah satu ini memiliki rasa yang manis dan juga daging yang cukup tebal. Bentuk dan juga tingkatan rasa manis dari buah satu ini cukup berbeda, tergantung dari jenis mangga apa. Karena buah satu ini memiliki beberapa jenis.\n" +
                "\n" +
                "Di Indonesia ada beberapa jenis buah mangga yang amat terkenal dengan rasanya yang lezat, misalnya adalah mangga ponding, mangga arum manis, mangga madu, simanalagi, dan beberapa jenis yang lainnya.\n" +
                "\n");

        mImageUrls.add("https://resepkoki.id/wp-content/uploads/2016/08/Durian-Petruk-300x300.jpg");
        mNames.add("Durian");
        mDesc.add("Buah durian merupakan salah satu jenis buah yang mempunyai kulit buah dengan lekuk yang tajam menyerupai duri. Buah ini memiliki rasa yang cukup unik dan lezat. Sedangkan untuk teksturnya sendiri bisa dibilang sangat pulen dan tidak keras. Selain itu, ia juga tidak melumer.\n" +
                "\n" +
                "Buah ini cukup banyak disukai oleh masyarakat, namun tidak sedikit masyarakat yang kurang suka terhadap jenis buah yang satu ini, salah satunya karena aroma yang dimilikinya.\n" +
                "\n" +
                "Di Indonesia sendiri, ada cukup banyak jenis buah durian. Di antara jenis buah durian yang terkenal di Indonesia adalah durian montong, durian bawor, durian bokor, durian merah, durian matahari dan lain sebagainya.\n" +
                "\n");

        mImageUrls.add("https://flavourstogo.ca/wp-content/uploads/2018/01/Honeydew-Melon-Food-Flavour-by-Capella-1.jpg");
        mNames.add("Melon");
        mDesc.add("Buah melon adalah buah yang masih satu suku dengan semangka atau labu-labuan jenis lain. Buah ini biasa di gunakan sebagai hidangan sebelum makan, di buat jus buah atau di gunakan sebagai campuran es buah. Buah dengan rasa manis yang khas dan daging buah yang lembut akan terasa segar dan nikmat jika di makan di siang hari yang panas.\n" +
                "\n" +
                "Melon sendiri merupakan tumbuhan satu musim yang tumbuh secara menjalar pada tiang penyangga yang sengaja di sediakan oleh petani buah ketika membudidayakan melon. Tumbuhan buah ini merupakan jenis tumbuhan yang berumah satu, yang mana perkawinan buah ini dapat di lakukan dengan bantuan angin dan sentuhan yang lain.\n" +
                "\n" +
                "Buah jenis ini memiliki ciri-ciri daging buah yang tebal, karena bagian yang harusnya untuk kulit berubah menjadi daging buah yang memiliki kandungan air cukup tinggi. Sehingga daging buahnya memiliki konsistensi yang tebal, halus, manis dan sedikit bau harum.\n" +
                "\n" +
                "Melon sendiri terdiri dari berbagai jenis, yang di temui di Indonesia sendiri ada jenis melon dengan daging buah berwarna oranye dan daging buah berwarna hijau segar. Rasa dari kedua jenis melon ini sedikit berbeda, namun sama-sama manis.\n" +
                "\n");

        mImageUrls.add("https://louperrine.com/wp-content/uploads/2017/04/Banana.jpg");
        mNames.add("Pisang");
        mDesc.add("Buah pisang adalah jenis buah yang cukup banyak ditemukan di sekitar masyarakat. Buah ini memiliki bentuk yang tersusun rapi di dalam tandan dan saat ia sudah matang, warnanya yang awalnya hijau bisa berubah menjadi berwarna kuning.\n" +
                "\n" +
                "Akan tetapi, ada juga buah pisang yang memiliki warna hijau, merah, ungu, jingga dan juga semi hitam saat buahnya sudah matang. Di dalam buah pisang sendiri ada kandungan sumber energi atau karbohidrat dan juga mineral. Selain itu, juga memiliki kandungan kalium.\n" +
                "\n");

        mImageUrls.add("https://i.ebayimg.com/images/g/AogAAOSwfaBaqFpZ/s-l640.jpg");
        mNames.add("Srikaya");
        mDesc.add("Srikaya (bahasa Latin: Annona squamosa), adalah tanaman yang tergolong ke dalam genus Annona yang berasal dari daerah tropis.\n" +
                "\n" +
                "Buah srikaya berbentuk bulat dengan kulit bermata banyak (serupa sirsak). Daging buahnya berwarna putih.\n" +
                "\n" +
                "Termasuk semak semi-hijau abadi atau pohon yang meranggas mencapai 8 m tingginya. Daunnya berselang, sederhana, lembing membujur, 7–12 cm panjangnya, dan berlebar 3–4 cm. Bunganya muncul dalam tandan sebanyak 3-4, tiap bunga berlebar 2–3 cm, dengan enam daun bunga/kelopak, kuning-hijau berbintik ungu di dasarnya.\n" +
                "\n" +
                "Buahnya biasanya bundar atau mirip kerucut cemara, berdiameter 6–10 cm, dengan kulit berbenjol dan bersisik. Daging buahnya putih, menyerupai dan memiliki rasa seperti podeng.");

        mImageUrls.add("https://images-na.ssl-images-amazon.com/images/I/519YT%2Bql%2B3L.jpg");
        mNames.add("Pepaya");
        mDesc.add("Pohon pepaya adalah salah satu jenis pohon yang banyak ditemukan di sekitar masyarakat. Buah pepaya yang telah matang biasanya memiliki warna orange. Sementara untuk daging buahnya yang masih muda bisa dijadikan sebagai sayuran.\n" +
                "\n" +
                "Sementara untuk daging buah yang sudah matang dan berwarna orange bisa konsumsi secara langsung  atau dicampurkan untuk berbagai jenis minuman misalnya es campur, jus dan lain sebagainya. Di dalam bahasa Jawa, buah pepaya ini dikenal dengan nama kates dan di dalam bahasa Sunda, buah ini dikenal dengan nama gedang.");

        mImageUrls.add("https://www.blueorangejuicebars.com/wp-content/uploads/2017/02/nutritional-benefits-oranges.jpg");
        mNames.add("Jeruk");
        mDesc.add("Buah jeruk adalah salah satu jenis buah yang di dalamnya banyak terkandung Vitamin C, kalsium dan juga mineral. Buah ini terdiri dari beberapa jenis, di antaranya adalah jeruk lemon, jeruk nipis. Jeruk mandarin, jeruk Sunkist, jeruk bali dan masih banyak lagi yang lainnya.\n" +
                "\n" +
                "Buah satu ini cenderung memiliki rasa asam, segar dan juga manis. Rasanya tersebut ditentukan berdasarkan jenis jeruknya sendiri. Selain itu juga ditentukan berdasarkan kematangannya. Hasil olahan dari jeruk sendiri sangatlah mudah dan sederhana. Baik itu olahan di dalam bentuk cair ataupun dalam bentuk bubuk.");

        mImageUrls.add("https://cdn1.medicalnewstoday.com/content/images/articles/271/271285/three-strawberries.jpg");
        mNames.add("Strawberry");
        mDesc.add("Buah stoberi tak hanya memiliki penampilan yang indah. Si merah ini juga kaya manfaat bagi kesehatan. Meski rasanya manis dan asam, stroberi mengandung banyak nutrisi yang dibutuhkan manusia. Berbagai penelitian menemukan stoberi bermanfaat sebagai pemutihan gigi, mengobati iritasi pada kulit hingga memperbaiki masalah pencernaan. Warna merah stroberi berasal dari kandungan anthocyanidin yang menandakan buah ini kaya antioksidan. Tingginya antioksidan pada stroberi beguna untuk mencegah peradangan, kanker, dan masalah jantung.  Buah ini juga mengandung vitamin C dan K, serat, folat, magnesium, dan kalium");

        mImageUrls.add("https://www.gadis.co.id/img/images/nanas%20a.jpg");
        mNames.add("Nanas");
        mDesc.add("Di dalam bahasa Inggrisnya, buah nanas dikenal dengan nama Pineapple. Buah ini memiliki rasa asam manis dan juga segar. Anda bisa menemukan buah satu ini dengan sangat mudah di pasar dan tentunya dengan harga yang terjangkau.\n" +
                "\n" +
                "Buah nanas memiliki warna kuning dan menjadi ikon tersendiri untuk daerah Kota Subang, Jawa Barat. Buah ini memiliki khasiat yang cukup ampuh untuk membantu melancarkan sistem pencernaan Anda. Selain itu, ia juga bisa mengatasi jerawat pada wajah.\n" +
                "\n" +
                "Di samping terkenal di Kota Subang, buah satu ini juga sangat terkenal di daerah provinsi lampung karena di sana terdapat pusat penanaman nanas dengan berbagai pabrik yang mengolahnya.");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls, mDesc);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

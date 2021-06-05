package com.example.pasgenap_robertlyonistanto_10rpl2_27;

import java.util.ArrayList;

public class ClubData {
    private static String [] clubName ={
            "Atlanta Hawks",
            "Boston Celtics",
            "Brooklyn Nets",
            "Charlotte Hornets",
            "Chicago Bulls",
            "Cleveland Cavaliers",
            "Detroit Pistons",
            "Indiana Pacers",
            "Miami Heat",
            "Milwaukee Bucks",
            "New York Knicks",
            "Orlando Magic",
            "Philadelphia 76ers",
            "Toronto Raptors",
            "Washington Wizards"
    };

    private static String [] clubDetail ={
            "Atlanta Hawks adalah tim bola basket profesional Amerika yang berbasis di Atlanta. Hawks bersaing di National Basketball Association (NBA) sebagai anggota Liga Divisi Tenggara Wilayah Timur. Tim memainkan pertandingan kandangnya di State Farm Arena.",
            "Boston Celtics adalah tim bola basket profesional Amerika yang berbasis di Boston. Celtics bersaing di National Basketball Association (NBA) sebagai anggota Divisi Atlantik Wilayah Timur liga. Didirikan pada tahun 1946 sebagai salah satu dari delapan tim asli liga, Celtics memainkan pertandingan kandang mereka di TD Garden.",
            "Brooklyn Nets adalah tim bola basket profesional Amerika yang berbasis di borough Brooklyn, New York City. Nets bersaing di National Basketball Association (NBA) sebagai anggota Divisi Atlantik dari Wilayah Timur. Tim memainkan pertandingan kandangnya di Barclays Center.",
            "Charlotte Hornets adalah tim bola basket profesional Amerika yang berbasis di Charlotte, Carolina Utara. The Hornets bersaing di National Basketball Association (NBA), sebagai anggota Divisi Tenggara Wilayah Timur liga. Tim ini sebagian besar dimiliki oleh anggota Basketball Hall-of-Fame Michael Jordan, yang memperoleh saham pengendali di tim tersebut pada 2010. Hornets memainkan pertandingan kandang mereka di Spectrum Center di Uptown Charlotte.",
            "Chicago Bulls adalah tim bola basket profesional Amerika yang berbasis di Chicago. Bulls bersaing di National Basketball Association (NBA) sebagai anggota Divisi Tengah Wilayah Timur liga. Tim ini didirikan pada 16 Januari 1966, dan memainkan pertandingan pertamanya selama musim NBA 1966–67. Bulls memainkan pertandingan kandang mereka di United Center.",
            "Cleveland Cavaliers, sering disebut sebagai Cavs, adalah tim bola basket profesional Amerika yang berbasis di Cleveland. Cavaliers bersaing di National Basketball Association (NBA) sebagai anggota Divisi Tengah Wilayah Timur liga. Tim mulai bermain sebagai tim ekspansi pada tahun 1970, bersama dengan Portland Trail Blazers dan Buffalo Braves. Pertandingan kandang pertama kali diadakan di Cleveland Arena dari tahun 1970 hingga 1974, diikuti oleh Richfield Coliseum dari tahun 1974 hingga 1994.",
            "Detroit Pistons adalah tim bola basket profesional Amerika yang berbasis di Detroit. Pistons bersaing di National Basketball Association (NBA) sebagai anggota Divisi Pusat Wilayah Timur liga dan memainkan pertandingan kandang mereka di Little Caesars Arena, yang terletak di Midtown. Tim ini didirikan di Fort Wayne, Indiana sebagai Fort Wayne Zollner Pistons pada tahun 1941.",
            "Indiana Pacers adalah tim bola basket profesional Amerika yang berbasis di Indianapolis. Pacers bersaing di National Basketball Association (NBA) sebagai anggota Divisi Tengah Wilayah Timur liga. Pacers pertama kali didirikan pada tahun 1967 sebagai anggota American Basketball Association (ABA) dan menjadi anggota NBA pada tahun 1976 sebagai hasil dari merger ABA-NBA. Mereka memainkan pertandingan kandang mereka di Bankers Life Fieldhouse. Tim ini dinamai berdasarkan negara bagian sejarah Indiana dengan mobil kecepatan Indianapolis 500 dan dengan industri balap harness.",
            "Miami Heat adalah tim bola basket profesional Amerika yang berbasis di Miami. Heat bersaing di National Basketball Association (NBA) sebagai anggota Liga Divisi Tenggara Wilayah Timur. Klub memainkan pertandingan kandangnya di American Airlines Arena, dan telah memenangkan tiga kejuaraan NBA. Waralaba mulai bermain di musim 1988-89 sebagai tim ekspansi. Setelah periode biasa-biasa saja, Heat memperoleh relevansi selama tahun 1990-an setelah penunjukan mantan pelatih kepala Pat Riley sebagai presiden tim.",
            "Milwaukee Bucks adalah tim bola basket profesional Amerika yang berbasis di Milwaukee. Bucks bersaing di National Basketball Association (NBA) sebagai anggota Divisi Tengah Wilayah Timur liga. Tim ini didirikan pada tahun 1968 sebagai tim ekspansi, dan bermain di Fiserv Forum. Mantan Senator AS Herb Kohl adalah pemilik lama tim, tetapi pada 16 April 2014, sebuah grup yang dipimpin oleh manajer dana lindung nilai miliarder Wes Edens dan Marc Lasry setuju untuk membeli saham mayoritas di tim dari Kohl, sebuah penjualan yang disetujui oleh pemilik NBA dan Dewan Gubernurnya satu bulan kemudian pada 16 Mei.",
            "New York Knickerbockers, lebih sering disebut sebagai New York Knicks, adalah tim bola basket profesional Amerika yang berbasis di borough Manhattan, New York City. Knicks bersaing di National Basketball Association (NBA) sebagai anggota Divisi Atlantik dari Wilayah Timur. Tim memainkan pertandingan kandangnya di Madison Square Garden, sebuah arena yang mereka bagikan dengan New York Rangers dari National Hockey League (NHL).",
            "Orlando Magic adalah tim bola basket profesional Amerika yang berbasis di Orlando, Florida. The Magic bersaing di National Basketball Association (NBA) sebagai anggota liga Divisi Tenggara Wilayah Timur. Waralaba didirikan pada tahun 1989 sebagai waralaba ekspansi, dan bintang NBA terkenal seperti Shaquille O'Neal, Penny Hardaway, Grant Hill, Tracy McGrady, dan Dwight Howard telah bermain untuk klub sepanjang sejarah mudanya.",
            "Philadelphia 76ers (bahasa sehari-hari dikenal sebagai Sixers) adalah tim bola basket profesional Amerika yang berbasis di wilayah metropolitan Philadelphia. 76ers bersaing di National Basketball Association (NBA) sebagai anggota Divisi Atlantik Wilayah Timur liga dan bermain di Wells Fargo Center. Didirikan pada tahun 1946 dan awalnya dikenal sebagai Syracuse Nationals, mereka adalah salah satu waralaba tertua di NBA dan satu dari hanya delapan (dari 23) yang bertahan dalam dekade pertama liga.",
            "Toronto Raptors adalah tim bola basket profesional Kanada yang berbasis di Toronto. Raptors bersaing di National Basketball Association (NBA) sebagai anggota Divisi Atlantik Wilayah Timur liga. Mereka biasanya memainkan pertandingan kandang mereka di Scotiabank Arena, yang mereka bagikan dengan Toronto Maple Leafs dari National Hockey League (NHL), tetapi mereka saat ini menggunakan Amalie Arena di Tampa, Florida sebagai rumah mereka selama musim 2020–21 karena Pandemi COVID-19 di Toronto.",
            "The Washington Wizards adalah tim bola basket profesional Amerika yang berbasis di Washington, D.C. The Wizards bersaing di National Basketball Association (NBA) sebagai anggota Divisi Tenggara Wilayah Timur liga. Tim memainkan pertandingan kandangnya di Capital One Arena, di lingkungan Chinatown di Washington, D.C. Waralaba ini didirikan pada tahun 1961 sebagai Chicago Packers yang berbasis di Chicago, Illinois, dan berganti nama menjadi Chicago Zephyrs pada musim berikutnya. Pada tahun 1963, mereka pindah ke Baltimore, Maryland, dan menjadi Baltimore Bullets, mengambil nama dari tim sebelumnya dengan nama yang sama."
    };

    private static int [] logoClub= {
        R.drawable.atlanta_hawks,
        R.drawable.boston_celtics,
        R.drawable.brooklyn_nets,
        R.drawable.charlotte_hornets,
        R.drawable.chicago_bulls,
        R.drawable.cleveland_cavaliers,
        R.drawable.detroit_pistons,
        R.drawable.indiana_pacers,
        R.drawable.miami_heat,
        R.drawable.milwaukee_bucks,
        R.drawable.new_york_knicks,
        R.drawable.orlando_magic,
        R.drawable.philadelphia_76ers,
        R.drawable.toronto_raptors,
        R.drawable.washington_wizards,
    };

    static ArrayList<Club> getListData(){
        ArrayList<Club> list = new ArrayList<>();
        for (int position = 0; position <clubName.length; position++){
            Club club = new Club();
            club.setName(clubName[position]);
            club.setDetail(clubDetail[position]);
            club.setFoto(logoClub[position]);
            list.add(club);
        }
        return list;
    };
}

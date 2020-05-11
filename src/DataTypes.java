public class DataTypes {
    public static void main(String[] args) {
        //1. Java Degisken tipini mutlaka ister  //fizikte unit meselesi
        // Bir degisken olustugu zaman bilgisayarin belleginde bir yer ayrilir
        // ve Java programlari bittigi zaman bu bellekten silinir
        // genelde int ve double kullanilir
        // degisken atama

        int a=3;
        System.out.println("a");
        int b;
        b=5;
        System.out.println("b");
        String str= "Hello";
        str="Merhaba";
        System.out.println(str);

        int c;
        c=30;
        c=20;
        c=a+b;
        System.out.println(c);

        int a1= 23;
        int b1= 24;
        int toplam=a1+b1;
        toplam=0;
        System.out.println(toplam);

        // java degisken atarken en son verdiginiz degeri tanir

        // ilkel veri tipler(primitive data types)-- tamsayilar
        // 1 byte=8 bit

        // byte--> bellekte 8 bitlik yer tutar. -128 ile 127 arasinda tamsayi degerler alir

        byte b_sayi=24;
        System.out.println(Byte.MIN_VALUE);    // -----> en kucuk byte degeri  (-128) verir
        System.out.println(Byte.MAX_VALUE);   // ----> en buyuk byte degeri (127)  verir


        // short--> bellekte 16 bitlik yer tutar. -32768 ile 32767 arasinda tamsayi degerler alir

        short s_sayi=23451;
        System.out.println(Short.MIN_VALUE);    // -----> en kucuk short degeri  (-32768) verir
        System.out.println(Short.MAX_VALUE);   // ----> en buyuk short degeri (32767)  verir


        // int--> bellekte 32 bitlik yer tutar. -2147483648 ile 2147483647 arasinda tamsayi degerler alir

        int i_sayi=23451223;
        System.out.println(Integer.MIN_VALUE);    // -----> en kucuk int degeri  (-2147483648) verir
        System.out.println(Integer.MAX_VALUE);   // ----> en buyuk int degeri (2147483647)  verir


        // long--> bellekte 64 bitlik yer tutar. -9223372036854775808 ile 9223372036854775807 arasinda tamsayi degerler alir

        long lg_sayi=23451223;
        System.out.println(Long.MIN_VALUE);    // -----> en kucuk int degeri  (-9223372036854775808) verir
        System.out.println(Long.MAX_VALUE);   // ----> en buyuk int degeri (9223372036854775807)  verir


        // byte-->short-->int-->long
        // hafizada cok yer kaplayan veri tipini hafizada az yer kaplayan veri tipine ceviremezsiniz
        // java otomatik donusturmeler yapar

        short s=120;
        int i=s/2;                 // java burda short s yi otomatik int e donusturdu.cunku int vri tipi bellekte cok yer kapliyor
        System.out.println(i);

        byte b2=3;
        // byte b3=(b2*5);
        byte b3=(byte)(b2*5);              // Java burda 5 i otomatik int olarak tanidi.
        System.out.println(b3);             // 5 ayni zaman da byte oldugu icin sorunsuz yazdirdi


        byte b4=3;
        //byte b5=(b2*500);
        byte b5=(byte)(b2*500);              // Java burda 500 i otomatik int olarak tanidi.
        System.out.println(b5);                // 500 byte kapsamadigi icin donusturme yaparken deger kaybetti

         short sayi1=100;
         byte sayi2=2;
         int sayi3=4;

         long d = sayi1+sayi2+sayi3;     // sayi1 +sayi2 yi shorta ceviriyor,
        System.out.println(d);             // short + sayi3 int oldugu icin int e ceviriyor
                                            //  long intden buyuk oldugu icin longa ceviriyor

//        byte b=12;
//        short sh=23903;
//        int i=232302032;
//        long lg=1323020328445452334l;
//        long max=Long.MAX_VALUE;
//        System.out.println(max);


        // Ondalik sayi veri tipleri double ve float veri tipleri

        // float--> bellekte 32 bitlik yer tutar. -32768 ile 32767 arasinda tamsayi degerler alir


        //float fsayi1=5.0;
         float fsayi1=(float)5.0;
         float fsayi2=5f;
         float fsayi3=3.4f;


        System.out.println(Float.MIN_VALUE);    // -----> en kucuk float degeri  (1.4E-45) verir
        System.out.println(Float.MAX_VALUE);   // ----> en buyuk float degeri (3.4028235E38)  verir


        // double--> bellekte 64 bitlik yer tutar. 4.9E-324 ile 1.7976931348623157E308 arasinda tamsayi degerler alir

        double dsayi1=5.25;
        double dsayi2=4.0;
        double dsayi3=4d;
        double dsayi4=4.23d;
        System.out.println(Double.MIN_VALUE);    // -----> en kucuk double degeri  (4.9E-324) verir
        System.out.println(Double.MAX_VALUE);   // ----> en buyuk double degeri (1.7976931348623157E308)  verir

        // Pi sayisi - double ile float arasindaki fark
        int num1=22/7;
        float num2=22f/7f;
        double num3=22d/7d;
        System.out.println("num1: "+ num1);
        System.out.println("num2: "+ num2);
        System.out.println("num3: "+ num3);


        // int-->float-->double    otomatik donusturme

        int m=5;
        float n=m;
        System.out.println(n);     // inti floata cevirdi

        int m1=5;
        float n1=m1;
        System.out.println(n1);     // inti double cevirdi


        double m3=3.52;
       // float n3=m3;
        float n3=(float)m3;
        System.out.println(n3);


        double sayi4=70.25;
        double sayi5=60d;
        double sayi6=80.2;
        System.out.println("Ortalama "+ (sayi4+sayi5+sayi6)/3);     // burda 3 integer ama double int otomatik
                                                                    // olarak donusturdu

        float sayi7=70.25f;
        float sayi8=60f;
        float sayi9=80.2f;
        System.out.println("Ortalama "+ (sayi7+sayi8+sayi9)/3);


        // char--> karakterleri gostermek icin kullanilir.16 bit yer kaplar
        // 2^16 tane karakteri simgelenebilir
        // unicode karakterleri simgeler

        char c1='A';
        char c2='?';
        //char c3='23'; hata veriyor
        char c3=23;
        System.out.println(c3);
        // Boalean --> Kosul durumlarinda kullanilir.tru ve false degerleri alir




}}

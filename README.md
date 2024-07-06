# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa Name, Id dan Level hero, dan memberikan output berupa informasi detail dari Id tersebut seperti Negara Asal, Tahun Pembuatan, Code Clan, dan Urutan Hero.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Hero`, `HeroBeraksi`, dan `Superhiro` adalah contoh dari class.

```bash
public class Hero {
    ...
}

public class Superhiro extends Hero {
    ...
}

public class HeroBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `hero1[i] = new Superhiro(name, id, level);` adalah contoh pembuatan object.

```bash
hero1[i] = new Superhiro(name, id, level);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `name`, `id` dan `level` adalah contoh atribut.

```bash
String name;
String id;
int level;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Hero` dan `Superhiro`.

```bash
public Hero(String name, String id, int level) {
    this.name = name;
    this.id = id;
    this.level = level;
}

public Superhiro(String name, String id, int level) {
    super(name, id, level);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setName`, `setid` dan `setLevel`` adalah contoh method mutator.

```bash
public void setName(String name) {
    this.name = name;
}

public void setId(String id) {
    this.id = id;
}

public void setLevel(String level) {
    this.level = level;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getName`, `getId`, `getLevel`, `getAsalNegara`, `getTahunDaftar`, `getUrutanHero`, dan `getClan` adalah contoh method accessor.

```bash
public String getName() {
    return name;
}

public String getId() {
    return id;
}

public String getLevel() {
    return Level;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `name`, `id` dan `level` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
protected String name;
protected String id;
protected int level;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Superhiro` mewarisi `Hero` dengan sintaks `extends`.

```bash
public class Superhiro extends Hero {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `display(String)` di `Hero` merupakan overloading method `display` dan `display` di `Superhiro` merupakan override dari method `display` di `Hero`.

```bash
public String display(String skill) {
    return display() + "\nSkill: " + skill;
}

@Override
public String display() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getAsalNegara` dan seleksi `switch` dalam method `getClan`.

```bash
public String getAsalNegara(){
        String kodeNeg = getId().substring(0, 2);
        //seleksi if
        if (kodeNeg.equals("11")){
            return "Prancis";
        }else {
            return "Negara Lain";
        }
    }

    public String getClan(){
        String kodeClan = getId().substring(4, 6);
       
        switch(kodeClan){
            case "01":   
                return "Empire";
            case "02":   
                return "Kingdom";
            case "03":   
                return "Castle";
            default:
                return "Clan lain";
        }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0; i<hero1.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukan Nama Hiro "+(i+1)+": ");
String name = scanner.nextLine();
System.out.print("Masukan ID "+(i+1)+": ");
String id = scanner.nextLine();
System.out.print("Masukan Level "+(i+1)+": ");
int level = scanner.nextInt();
scanner.nextLine();
System.out.println("--------------------------------");

System.out.println("================================");
System.out.println("Data Hero");
System.out.println(data.display());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Superhiro[] hero1 = new Superhiro[2];` adalah contoh penggunaan array.

```bash
Superhiro[] hero1 = new Superhiro[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (NumberFormatException e){
System.out.println("Kesalahan Format Nomor : "+e.getMessage());
} catch (StringIndexOutOfBoundsException e){
System.out.println("Kesalahan Format ID : "+e.getMessage());
} catch (Exception e){
System.out.println("Tampilkan Error = "+e.getMessage());
    } 
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat
```
Nama: Devi Tri Angraini
NPM: 2210010204

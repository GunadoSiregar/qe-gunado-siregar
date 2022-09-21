# Iterable Data Structure

## 1. Iterable
Iterable merupakan Sekumpulan data atau struktur data yang dapat dilakukan iterasi atau perulangan kepadanya.

Java Iterable - Hierarchy Interface. Iterable adalah struktur tertinggi dalam hirarki dalam bahasa pemograman java seperti collection dan list.

## 2. Interface
Seluruh daftar interface dalam hierarchy merupakan struktur data yang dapat dilakukan perulangan terhadap masing-masing data yang disimpan.

General-Purpose Implementations adalah implementasi yang paling sering digunakan yang didesain untuk penggunaan setiap hari.Mereka dirangkum dalam tabel berjudul General-purpose-implementations.

Interfaces	Hash table
Implementations	Resizable array Implementations	Tree Implementations	Linked List Implementations	Hash table + Linked list Implementations.
Set	Hashset		Treeset		LinkedHashset
List		ArrayList		LinkedList	
Deque		ArrayDeque		LinkedList	

Artinya jika kita ingin menggunakan struktur data dari masing-masing implementasi tersebut, kita juga bisa menggunakan interface (set, list, dan deque) sebagai tipe data dari variabel  tempat kita menyimpan kumpulan data tersebut.

Cara menggunakan interface iterable:
Method dalam kelas Iterable:
-	forEach(Consumer<? super T>): void
-	iterator(): Iterator<T>
-	spliterator: Spliterator<T> 

Contoh:

public static void main(String[] args) {
	Iterable<string> names = List.of(“alterra”, “academy”);
	for (var name: name) {
		System.out.println(name) ;
	}
}
Output:
alterra
academy

## 3. Iterator
Interface iterable memiliki satu method iterator()
Iterator adalah kelas yang mengelola iterasi di atas iterable. itu mempertahankan keadaan di mana kita berada dalam iterasi saat ini, dan tahu apa elemen atau data selanjutnya yang akan diambil dan bagaimana mendapatkannya

Contoh Iterator:

import java.util.Iterator;
import java.util.List;
Public class Main {
public static void main(String[] args) {
		Iterable<string> names = List.of(“alterra”, “academy”);
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String.1 = it.next();
			System.out.println(i) ;
		}
    }
}

Output:
alterra
academy

## 4. Collection
Collection merupakan kumpulan dari objek atau data yang diletakkan   dalam satu tempat yang sama (Collection of Objects).
Collection adalah setiap kelompok objek individu yang direpresentasikan sebagai satu unit adalah untuk mengetahui sebagai kumpulan objek

Method Collection
-	add()
-	addAll()
-	clear()
-	contains()
-	containsAll()
-	equals()
-	hashCode()
-	isEmpty()
-	Iterator()
-	remove()
-	removeAll()
-	stream()
-	toArray()

Contoh:
public static void main(String[] args) {
	Collection<String> names = new ArrayList<>();
	names.add(“Alterra”);
	names.add(“Academy”);
	names.add(“Coba”);
	names.remove(“Coba”);
	System.out.println(names.contains(“Aterra”));
}

Output:
true

## 5. List
a.	Merupakan sebuah interface yang menyediakan cara untuk menyimpan data secara linear
b.	List merupakan turunan dari interface collection
c.	List juga menerima nilai yang sama , sehingga apabila meng-input 2kali data yang sama , tetap dapat dilakukan
d.	Urutan data pada list tergantung kapan data tersebut dimasukkan kedalam list, maka data yang dimasukkan pertama , akan menjadi urutan pertama , maka urutan selanjutnya akan menyusul ke urutan berikutnya.
Method pada List :
•	Menambah
•	Menghapus
•	Mengecek
Apakah data tersedia dalam list , dan mengecek apakah list yang satu sama dengan list yang lainnya
Implementasi dari interface List :
•	Abstract List
•	Array List 
o	Menyediakan penyimpanan data yang dinamis artinya tidak terikat dengan kapasitas yang dapat disimpan oleh ArrayList tersebut
o	Data yang dimpan oleh ArrayList bisa sebanyak apapun , selama memori data dari komputer masih sanggup untuk menyimpan data tersebut

Array List Work :
Step 1 : Pembuatan Array List (Array Initialization) yang data nya masih kosong
Step 2 : Menambah elemen pada Array List , maka masing2 posisi akan terisi
Step 3 : Ketika data sudah penuh , lalu kita tetap memaksa memasukkan data kedalam Array List maka,
Step 4 : Array List akan membuat array baru dan memindahkan seluruh data pada array tersebut
Step 5 : Akan dilakukan hal yang sama , jika kapasitas penyimpanan sudah penuh
Maka sebetulnya panjang dari Array List terbatas , tetapi Array List dapat memanjangkan dirinya sehingga seolah-olah data yang dapat disimpan iyu tidak terbatas
Contoh
public static void main(String[] args) {
	List<Integer> umur = new ArrayList<>();
	umur.add(17);
	umur.add(60);
	umur.add(30);
	System.out.println(umur.get(2));
}

Output 
30

## 6. Linkedlist
•	Merupakan struktur data yang menyimpan setiap elemen nya saling terhubung satu sama lain , cara Linked List menghubungkan satu elemen dengan elemen yang lainnya adalah dengan menyimpan alamat memori dari masing-masing elemen , baik elemen setelah atau sebelumnya .
•	Jadi apabila ada sebuah elemen terdapat dalam Linked List , pada elemen tersebut akan menyimpan alamat memori dari elemen yang sebelumnya
•	Lalu elemen sebelumnya juga akan menyimpan alamat memori dari elemen yang sebelumnya lagi
Perbedaan Array List dan Linked List :
1.	Secara Structure /Alur :
Pada Array List —> Terbentuk ruang kosong , lalu akan diisi data
pada Linked List :
o	Berbentuk seperti gerbong kereta api , elemen pertama akan menyimpan data yang akan disimpan (tidak kosong)
o	menyimpan alamat memori data yang berikutnya, maka akan terhubung elemen satu dengan elemen yang lainnya
Secara Time Complexity :
•	Accessing element : 
o	Array List O(1) artinya konstan
o	Linked List O(n) artinya mengakses elemen yang memiliki kemungkinan untuk memerlukan waktu yang lebih lama
•	Insert/remove from begining 
o	Array List O(n) artinya bisa lebih lama dari Linked List
o	Linked List memiliki waktu yang lebih cepat yaitu O(1)
•	Insert / remove from end 
o	Array List dan Linked List memiliki waktu yang sama
•	Insert /remove from middle 
o	Array List dan Linked List memiliki waktu yang sama

Contoh:
public static void main(String[] args) {
	List<Integer> umur = new LinkedList<>();
	umur.add(17);
	umur.add(60);
	umur.add(30);
	System.out.println(umur.get(2));
}

Output
30

## 7. Immutable List.
Immutable list merupakan bagian dari list tapi tidak dapat diubah datanya.

Contoh:
public static void main(String[] args) {
	List<Integer> umur = new LinkedList<>();
	var umurImmutable = Collections.unmodifiableList(umur);
	umurImmutable.add(2); // tidak diizinkan
	umur.add(17);
	umur.add(60);
	umur.add(30);
	System.out.println(umur.get(2));
}

Output
error

## 8. Stack
Stack menyimpan data secara linear tetapi dalam proses penambahan dan pengambilan datanya, menggunakan last-in-first-out (LIFO), artinya data yang baru dimasukkan akan dikeluarkan terlebih dahulu Contohnya tumpukan buku.
Method:
-	Stack();
-	empty(): boolean
-	peek(): E, method untuk mengintip data
-	pop(): E, method untuk mengambil data
-	push(E) : E, method untuk menambah data
-	search[Object]: Int
-	serialVersion

Contoh:
public static void main(String[] args) {
	Stack<Integer> umur = new Stack<>();
	umur.push(7);
	umur.push(10);
	umur.push(5);
	System.out.println(umur.pop());
}

Output:
5

## 9. Set
Set merupakan sebuah struktur data yang dapat menyimpan sekumpulan data secara linear seperti ist, tetapi set  tidak dapat menerima data yang duplikat.

Hierarchy Interface & Implementation

Comparing Set
HashSet Vs LinkedHashSet Vs EnumSet Vs TreeSet

HashSet	LinkedHashSet	TreeSet	EnumSet
Data Structure	Hash Table	Hash Table + Linked List	Red-Black-Tree	Bit Vector
Sorting	No	Insertion Order	Sorted	Natural Order
Iterator	Fail-Fast	Fail-Fast	fail-Fast	Weekly Consistent
Nulls	Yes	Yes	Depends	No

Method Hash Set
-	HashSet();
-	add()
-	clear();
-	close();
-	isEmpty();
-	iterator();
-	remove()

	Method-method tersebut dapat digunakan untuk mengelola seluruh data atau elemn yang terdapat dalam set. Hash set disebut sebagai struktur data yang menyediakan cara tercepat untuk proses pencarian data.

Contoh:
public static void main(String[] args) {
	Set<Integer> umur = new HashSet<>();
	umur.add(3);
	umur.add(3);
	umur.add(4);
	umur.add(2);
	System.out.println(umur);
}

Output
[2, 3, 4]

## 10. LinkedHashSet
LinkedHashSet menyimpan insection order dimana, data yang di input lebihdahulu akan terdapat pada urutan yang pertama.
Contoh:
	public static void main(String[] args) {
		Set<Integer> umur = new LinkedHashSet<>();
		umur.add(3);
		umur.add(3);
		umur.add(4);
		umur.add(2);
	
		System.out.println(umur):
	}

Output:
[3, 4, 2]

Pada code diatas di jelakan bahwa yang awal nya variabel “umur berisikan HashSet di ubah menjadi LinkedHashSet”

## 11. EnumSet
Enum Set digunakan untuk menyimpan nilai “enum” . untuk urutan nya mengikuti penulisan enum tersebut.

Contoh:
	public class Main {
	
	enum moths{
		JANUARY, FEBRUARY, MARCH, MAY, JUNE, JULY, AUGUST, SEPTEMBER,
	OCTOBER, NAVEMBER, DECEMBER
	}
	
	public static void main(String[] args) {
		Set<months> set = EnumSet.allof(months.class);
		Iterator<months> iter = set.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());
		}
}

Output:
JANUARI
FEBRUARI
MARCH
MAY
JUNE
JULY
AUGUST
SEPTEMBER
OCTOBER
NOVEMBER
DECEMBER

## 12. Sorted Set
Sebuah Set yang selanjutnya memberikan pemesanan total pada elemen-elemennya.. Elemen-elemen diurutkan baik dengan menggunakan pengurutan alami atau dengan menggunakan Pembanding. Semua elemen yang dimasukkan ke dalam set yang diurutkan harus mengimplementasikan antarmuka Sebanding.

## 13. Queue
Queue adalah jenis array yang membolehkan adanya value duplicate atau nilai yang sama dalam index yang berbeda. List memiliki beberapa fungsi-fungsi yang cukup membantu dalam proses pengolahan nilai-nilai seperti fungsi clear() untuk menghapus semua element atau value pada list, melakukan insert value pada index element tertentu dengan fungsi add(int index, Object element), menghapus value pada index element tertentu dengan fungsi remove(int index).
-	Antarmuka Daftar menyediakan cara untuk menyimpan koleksi yang dipesan.
-	Ini adalah antarmuka anak Koleksi
-	Ini adalah kumpulan objek yang dipesan di mana nilai duplikat dapat disimpan
-	Sejak Daftar mempertahankan urutan penyisipan memungkinkan akses posisi dan penyisipan elemen.

Contoh:
public static void main(String[] args) {
	Queue<Integer> umur = new PriorityQueue<>();
	umur.add(7);
	umur.add(10);
	umur.add(5);
	
	System.out.println(umur.poll());
}

Output:
5

## 14. Deque
Deque adalah sekumpulan koleksi linear yang mendukung penambahan dan pengurangan elemn-lemen baik dari msing masing ujungnya. Deque adalah singkatan dari double-ended queue.

Method:
- addFirst()
- addLast()
- offerFirst()
- OfferLast()
- RemoveFirst()
- Remove Last()
- pollFirst()
- pollLast()
- getFirst()
- getLast()
- peekFirst()
- peekLast()
- removeFirstOccurence()
- removeLasttOccurence()
- push()
- pop()
- descendingIterator()

Contoh:
public static void main(String[] args) {
	Deque<String> bulan = new LinkedList<>();
	bulan.offerLast("1");
	bulan.offerLast("2");
	bulan.offerLast("3");
	
	System.out.println(bulan.pollLast());
}
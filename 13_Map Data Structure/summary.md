# Map Data Structure

## 1. Introduction
Map merupakan sturuktur yang ada di java yang dapat digunakan untuk menyimpan banyak data di dalamnya. Data yang tersimpan di dalam map akan disimpan dalam Queue, setiap Queue akan memiliki datanya sendiri atau value.

### Method-method  yang dapat digunakan dalam Map
1. size(); int
2. isEmpty(); boolean
3. containsKey(Object): boolean
4. containsValue(Object) : boolean
5. get(Object):V
6. put(K,V) :V
7. remove(Object): V
8. putAll(Map)

## 2. Bentuk Map di Java

### 1. HashMap
Merupakan implementasi dari map yang menggunakan algoritma struktur data *hashtable*. Untuk membuat HashMap, kita terlebih dahulu membuat variabel “Bulan” tipe variabel bulan adalah map yang Q nya berupa “string” dan value nya berupa “Integer” dan variabel bulan ini kita buat yang baru kemudian kita mengisi tiga data hashMap tersebut.
Implementasi :
public class MapDataStructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, Integer> bulan = new HashMap<>();
        bulan.put("Januari", 1);
        bulan.put("Februari", 2);
        bulan.put("Agustus", 8);
        System.out.println(bulan);
    }
Output:
{Agustus=8, Januari=1, Februari=2}

### 2. WeakHashMap
WeakHashMap juga mengunakan Hashtable tetapi bedanya WeakHashMap Q itu dapat di hilangkan jika tidak digunakan saat kita memanggil System.gc(); ini akan menyebabkan beberapa Q yang tidak ada lagi data nya akan hilang dari map.
Implementasi :
\*/
public class MapDataStructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, Integer> bulan = new WeakHashMap<>();
        bulan.put("Januari", 1);
        bulan.put("Februari", 2);
        bulan.put("Agustus", 8);
        System.out.println(bulan);
    }
}

### 3. IdentityHashMap
IdentityHashMap juga menggunakan HashTable tetapi jika Q referensi yang berbeda maka akan dianggap sebagai data yang berbeda.

### 4. LinkedHashMap
LinkedHashMap tidak ada perbedaan yang signifikan dengan hashMap yang biasa tetapi secara internal HashMap menerapkan doublelinklist dan juga HashTable sebagai struktur data di dalam map nya.

### 5. ImmutableMap
ImmutableMap artinya tidak dapat di ubah jadi map dalam bentuk ini tidak dapat di ubah isi nya baik ditambah atau mengubah data yang sudah ada.

### 6. Sorted Map
Artinya yang dapat di urutkan baik secara asceding maupun descending dan masing-masing penerapan map ini memiliki cara sorted nya sendiri

## 3. ethod yang dapat digunakan pada sorted maps
1. Method List
   - addAll(int, Collection<? extends E>); boolean
   - replaceAll(UnaryOperator<E>); void
   - sort(Comparator<? super E>); void
   - get(int): E
   - set(int, E);
   - add (int, E); void
   - remove (int): E
   - indexOf(Object): int
   - lastIndexOf(Object) : int
   - listIterator(): ListIterator
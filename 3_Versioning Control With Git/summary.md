# 1. Intoduction
Versioning adalah sebuah cara yang digunakan untuk mengatur versi dari source code program. 
Terdapat 3 tools versioning yaitu :
•	Version Control System (VCS)
•	Source Code Manager (SCM)
•	Revision Control System (RCS)
Macam-macam dari Version Control System :
•	Single User SCCS - 1972 Unix only RCS - 1982 Cross platform, text only
•	Centralized CVS - 1986 File focus Perforce - 1995 Subversion - 2000 - track directory structure Microsoft Team Foundation Server - 2005
•	Distributed Git - 2005 Mercurial - 2005 Bazaar - 2005
Kegunaan dari versioning yaitu :
•	Dapat melakukan track kesalahan apa yang terjadi
•	perubahan code atau terdapat update dapat diketahui anggota tim lain

# 2. Istilah-istilah  dalam Git:
•	git branch, untuk membuat branch atau percabangan 
•	git push, untuk menyimpang perubahan di repository global 
•	git chechout, untuk mengecek kita berada di branch mana 
•	git merge, untuk menyatukan branch yang kita buat dengan branch master 
•	git init,untuk inisialisasi awal 
•	git add, untuk menambahkan file yang mau kita ubah 
•	git commit, untuk menyimpan perubahan sudah dilakukan

# 3. Command line setelah kita membuat repository baru:
•	git init
•	git add readme.md
•	git commit -m “first commit”
•	git branch -M main
•	git remote add origin link github
•	git push -u origin main
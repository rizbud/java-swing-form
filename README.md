# README

## English

### Prerequisites

- Ensure you have Java Development Kit (JDK) installed on your system.
- Set up the `JAVA_HOME` environment variable and add the `bin` directory to your system's `PATH`.

### How to Compile and Run the Java Program

1. **Run the Java Program Without Compiling:**
   You can directly run the Java program without compiling using the following command:

   ```sh
   java Main.java
   ```

2. **Compile the Java Program:**
   Open your terminal or command prompt and navigate to the directory containing the `Main.java` file. Then, run the following command:

   ```sh
   javac Main.java
   ```

3. **Run the Java Program:**
   After compiling, you can run the program using the following command:

   ```sh
   java Main
   ```

### How to Generate a JAR File

1. **Compile the Java Program:**
   Ensure that your Java program is compiled. If not, compile it using:

   ```sh
   javac Main.java
   ```

2. **Generate the JAR File:**
   Use the following command to create a JAR file:

   ```sh
   jar cfm form.jar MANIFEST.MF Main.class
   ```

3. **Run the JAR File:**
   You can run the JAR file using the following command:

   ```sh
   java -jar form.jar
   ```

## Indonesian

### Prasyarat

- Pastikan Anda telah menginstal Java Development Kit (JDK) di sistem Anda.
- Atur variabel lingkungan `JAVA_HOME` dan tambahkan direktori `bin` ke `PATH` sistem Anda.

### Cara Mengompilasi dan Menjalankan Program Java

1. **Jalankan Program Java Tanpa Mengompilasi:**
   Anda dapat langsung menjalankan program Java tanpa mengompilasi menggunakan perintah berikut:

   ```sh
   java Main.java
   ```

2. **Kompilasi Program Java:**
   Buka terminal atau command prompt Anda dan navigasikan ke direktori yang berisi file `Main.java`. Kemudian, jalankan perintah berikut:

   ```sh
   javac Main.java
   ```

3. **Jalankan Program Java:**
   Setelah dikompilasi, Anda dapat menjalankan program menggunakan perintah berikut:

   ```sh
   java Main
   ```

### Cara Membuat File JAR

1. **Kompilasi Program Java:**
   Pastikan program Java Anda sudah dikompilasi. Jika belum, kompilasi menggunakan:

   ```sh
   javac Main.java
   ```

2. **Buat File JAR:**
   Gunakan perintah berikut untuk membuat file JAR:

   ```sh
   jar cfm form.jar MANIFEST.MF Main.class
   ```

3. **Jalankan File JAR:**
   Anda dapat menjalankan file JAR menggunakan perintah berikut:

   ```sh
   java -jar form.jar
   ```

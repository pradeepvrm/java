package com.pradeep.fileHandling;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

//        try (InputStreamReader isr = new InputStreamReader(System.in)) {
//            System.out.print("Enter some letters: ");
//            int letters = isr.read();
//            while (isr.ready()) {
//                System.out.println((char) letters);
//                letters = isr.read();
//            }
//            System.out.println();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//        try (FileReader fr = new FileReader("src/com/pradeep/fileHandling/notes.txt")) {
//            int letters = fr.read();
//            while (fr.ready()) {
//                System.out.println((char) letters);
//                letters = fr.read();
//            }
////            fr.close();
//            System.out.println();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }


//        try (BufferedReader br = new BufferedReader((new InputStreamReader(System.in)))) {
//            System.out.println(br.readLine());
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//        try (BufferedReader br = new BufferedReader((new FileReader("src/com/pradeep/fileHandling/notes.txt")))) {
////            System.out.println(br.readLine());
//            while (br.ready()) {
//                System.out.println(br.readLine());
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());


        //output
        OutputStream os = System.out;
//        os.write(🎁);  // illegal character

        // write to console
//        try (OutputStreamWriter osw = new OutputStreamWriter((System.out))) {
//            osw.write("hello there");
//            osw.write(97);
//            osw.write('A');
//            osw.write('\n');
//            char[] arr = "hello world".toCharArray();
//            osw.write(arr);
////            osw.write(🎁);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //write to a file
        try (FileWriter fw = new FileWriter("src/com/pradeep/fileHandling/notes.txt", true)) {
            fw.write('\n');
            fw.write("new appended text");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/pradeep/fileHandling/notes.txt"))) {
            bw.write("buffered text");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

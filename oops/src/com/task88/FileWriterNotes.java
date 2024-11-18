package com.task88;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterNotes {
    public static void main(String[] args) {
        String fileName = "tester";
        try(FileWriter writer = new FileWriter(fileName)){
                writer.write("hi hello");
                writer.flush();

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

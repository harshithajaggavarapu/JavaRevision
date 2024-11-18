package com.task88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderNotes {
    public static void main(String[] args) {
        String fileName = "tester-dhd";
        try(FileReader reader = new FileReader(fileName)){
             int readValue=0;
             do{
                 readValue = reader.read();
                 System.out.print((char)readValue);
             }while(readValue!=-1);
        }catch(FileNotFoundException ex){
            System.out.println("no such file is found");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

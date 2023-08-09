/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oxgui1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author minnie
 */
public class TestWriteFriend {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Friend f1 = new Friend("minmin", 20, "0913245637");
        Friend f2 = new Friend("nidnoi", 21, "0913245037");
        System.out.println(f1);
        System.out.println(f2);
        File file = new File("fiends.dat");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(f1);
        oos.writeObject(f2);
        oos.close();
        fos.close();
    }
    
    
}

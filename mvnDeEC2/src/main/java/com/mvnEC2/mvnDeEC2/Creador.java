package com.mvnEC2.mvnDeEC2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Creador {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String ruta = "/home/ec2-user/PruebaMvn/ejemplo.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("El fichero de texto ya estaba creados, pero se uso maven desde un script!!!!.");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Acabo de crear un archivo de texto, construido por maven desde un script!!!!!.");
        }
        bw.close();
	}

}









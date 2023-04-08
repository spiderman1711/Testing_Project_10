package com.mycompany.testing_project_10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Csv_writer {

    public static void csvWrite(String path, String[][] students) throws IOException {
        FileWriter fw = new FileWriter(new File(path));
        for (String[] data : students) {
            StringBuilder line = new StringBuilder();
            for (int i = 0; i < data.length; i++) {
                line.append(data[i]);
                if (i != data.length - 1) {
                    line.append(',');
                }
            }
            line.append("\n");
            fw.write(line.toString());
        }
        fw.close();
    }
}
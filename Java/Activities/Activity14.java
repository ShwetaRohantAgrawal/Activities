package activities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\0037SP744\\test1.txt");
        boolean fStatus = file.createNewFile();
        if(fStatus) {
            System.out.println("File created");
        }else{
            System.out.println("File creation failed");
        }
        File fileUtil = FileUtils.getFile("C:\\Users\\0037SP744\\test1.txt");
        System.out.println("Data in file: "+FileUtils.readFileToString(fileUtil,"UTF8"));

        File destDir = new File("resources");
        FileUtils.copyFileToDirectory(file,destDir);

        File newFile = FileUtils.getFile(destDir,"test.txt");
        String newFileData = FileUtils.readFileToString(newFile,"UTF8");
        System.out.println("Data in new File : "+newFileData);

    }
}

package pl.oskarpolak.models.services;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

/**
 * Created by Lenovo on 01.09.2017.
 */
@Service
public class FileService {
    public void addToFile(String s){

        try {
            File file = new File("C:\\classy\\plik.txt");
            Files.write(file.toPath(), s.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

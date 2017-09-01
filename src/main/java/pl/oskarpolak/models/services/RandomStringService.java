package pl.oskarpolak.models.services;

import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Lenovo on 01.09.2017.
 */
@Service
public class RandomStringService {

    public String getRandomString(){
        return UUID.randomUUID().toString();
    }

    public String getRandomString(int cut){
        if(cut > 63){
            throw new IllegalArgumentException(" < 63");
        }
        return UUID.randomUUID().toString().substring(0, cut);
    }
}

package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetProperties {
    private static GetProperties instance = null;
    private String music1;
    private String music2;
    private String music3;
    private String musicShort1;
    private String musicShort2;
    private String musicShort3;

    private GetProperties(){
        Properties properties = new Properties();
        String nameFile ="music.properties";

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nameFile);

        if (inputStream != null){
            try {
                properties.load(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        music1=properties.getProperty("MUSIC_1");
        musicShort1=properties.getProperty("MUSIC_SHORT_1");
        music2=properties.getProperty("MUSIC_2");
        musicShort2=properties.getProperty("MUSIC_SHORT_2");
        music3=properties.getProperty("MUSIC_3");
        musicShort3=properties.getProperty("MUSIC_SHORT_3");

    }

    public static GetProperties getInstance(){
        if (instance == null)
            instance = new GetProperties();
        return instance;
    }

    public String getMusic1(){
        return music1;
    }
    public String getMusic2(){
        return this.music2;
    }
    public String getMusic3(){
        return this.music3;
    }
    public String getMusicShort1(){
        return this.musicShort1;
    }
    public String getMusicShort2(){
        return this.musicShort2;
    }
    public  String getMusicShort3(){
        return this.musicShort3;
    }
}

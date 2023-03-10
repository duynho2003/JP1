package session12_TheEnd;

import java.util.stream.Stream;

public class Chp16_StreamAPI {
    public static void main(String[] args) {
        System.out.println("Youtube plays your video...");
        Stream<String> stream = Stream.of("Clip 01...","Clip 02...","Clip 03...");
        stream.forEach(p -> System.out.println(p));       
    }
}

import multimediaAudioeVideo.Audio;
import multimediaAudioeVideo.Video;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Desideri un audio o un video? (Scrivi 'audio' o 'video'):");
        String type = scanner.nextLine();

        System.out.println("Per favore scrivi il titolo:");
        String audioTitle = scanner.nextLine();


        System.out.println("Per favore scrivi la durata:");
        int audioDuration = Integer.parseInt(scanner.nextLine());


        System.out.println("Per favore scegli il volume (0-5):");
        int audioVolume = Integer.parseInt(scanner.nextLine());

        // Eseguo un if che in base alla scelta tra video o audio mi stampi le funzionalità richieste
        if (type.equalsIgnoreCase("video")) {


            System.out.println("Per favore scegli la luminosità (0-5):");
            int brightness = Integer.parseInt(scanner.nextLine());

            // Creo un'istanza di Video
            Video newVideo = new Video(audioTitle, audioDuration);
            newVideo.setVolume(audioVolume);
            newVideo.setBrightness(brightness);

            newVideo.play();

        } else {
            // Creo un'istanza di Audio
            Audio newAudio = new Audio(audioTitle, audioDuration);
            newAudio.setVolume(audioVolume);


            newAudio.play();
        }

        scanner.close();
    }
}

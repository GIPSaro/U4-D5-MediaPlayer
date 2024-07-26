import multimediaAudioeVideo.Audio;
import multimediaAudioeVideo.Video;
import multimediaImmagine.Immagine;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Desideri un audio o un video? (Scrivi 'audio', 'video' o 'immagine' ):");
        String type = scanner.nextLine();

        System.out.println("Per favore scrivi il titolo:");
        String title = scanner.nextLine();

        if (type.equalsIgnoreCase("audio") || type.equalsIgnoreCase("video")) {
            System.out.println("Per favore scrivi la durata:");
            int duration = Integer.parseInt(scanner.nextLine());


            System.out.println("Per favore scegli il volume (0-5):");
            int volume = Integer.parseInt(scanner.nextLine());

            if (type.equalsIgnoreCase("video")) {
                System.out.println("Per favore scegli la luminosità (0-5):");
                int brightness = Integer.parseInt(scanner.nextLine());

                // Creo un'istanza di Video

                Video newVideo = new Video(title, duration);
                newVideo.setVolume(volume);
                newVideo.setBrightness(brightness);

                newVideo.play();
            } else {

                // Creo un'istanza di Audio

                Audio newAudio = new Audio(title, duration);
                newAudio.setVolume(volume);

                newAudio.play();
            }
        } else if (type.equalsIgnoreCase("immagine")) {


            System.out.println("Per favore scegli la luminosità (0-5):");
            int brightness = Integer.parseInt(scanner.nextLine());

            // Creo un'istanza di Immagine

            Immagine newImmagine = new Immagine(title);
            newImmagine.setBrightness(brightness);

            newImmagine.view();
        } else {
            System.out.println("Tipo di media non valido. Per favore, riavvia il programma e inserisci 'audio', 'video', or 'immagine'.");
        }
        scanner.close();
    }
}

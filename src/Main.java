import multimediaAudioeVideo.Audio;
import multimediaAudioeVideo.Video;
import multimediaImmagine.Immagine;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//
//        QUI COMMENTO TUTTO IN MODO TALE DA RISPETTARE LA RICHIESTA DELL'ESERCIZIO.
//        QUESTO MI E' SERVITO PER PROVARE LA FUNZIONALITA' DEI MEDIA
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Desideri un audio o un video una immagine? (Scrivi 'audio', 'video' o 'immagine' ):");
//        String type = scanner.nextLine();
//
//        System.out.println("Per favore scrivi il titolo:");
//        String title = scanner.nextLine();
//
//        if (type.equalsIgnoreCase("audio") || type.equalsIgnoreCase("video")) {
//            System.out.println("Per favore scrivi la durata:");
//            int duration = Integer.parseInt(scanner.nextLine());
//
//
//            System.out.println("Per favore scegli il volume (0-5):");
//            int volume = Integer.parseInt(scanner.nextLine());
//
//            if (type.equalsIgnoreCase("video")) {
//                System.out.println("Per favore scegli la luminosità (0-5):");
//                int brightness = Integer.parseInt(scanner.nextLine());
//
//                // Creo un'istanza di Video
//
//                Video newVideo = new Video(title, duration);
//                newVideo.setVolume(volume);
//                newVideo.setBrightness(brightness);
//
//                newVideo.play();
//            } else {
//
//                // Creo un'istanza di Audio
//
//                Audio newAudio = new Audio(title, duration);
//                newAudio.setVolume(volume);
//
//                newAudio.play();
//            }
//        } else if (type.equalsIgnoreCase("immagine")) {
//
//
//            System.out.println("Per favore scegli la luminosità (0-5):");
//            int brightness = Integer.parseInt(scanner.nextLine());
//
//            // Creo un'istanza di Immagine
//
//            Immagine newImmagine = new Immagine(title);
//            newImmagine.setBrightness(brightness);
//
//            newImmagine.view();
//        } else {
//            System.out.println("Tipo di media non valido. Per favore, riavvia il programma e inserisci 'audio', 'video', or 'immagine'.");
//        }
//        scanner.close();
//    }

        // QUINDI..CREAZIONE DELL'ARRAY DI 5 ELEMENTI:
        Object[] playlist = new Object[5];
        Scanner scanner = new Scanner(System.in);

        // Popola la playlist con media di esempio

        playlist[0] = new Video("Video", 5);
        playlist[1] = new Audio("Audio", 3);
        playlist[2] = new Immagine("Immagine");
        playlist[3] = new Video("Video", 4);
        playlist[4] = new Audio("Audio", 6);

        while (true) {
            System.out.println("Inserisci un numero da 1 a 5 per selezionare un file. Digita 0 per terminare.");
            int selectedIndex = Integer.parseInt(scanner.nextLine());

            if (selectedIndex == 0) {
                break; // Termina il processo

            } else if (selectedIndex > 0 && selectedIndex <= 5) {
                Object selectedMedia = playlist[selectedIndex - 1];

                if (selectedMedia instanceof Audio) {
                    Audio audio = (Audio) selectedMedia;
                    System.out.println("Hai selezionato un audio.");

                    // Chiedi il titolo, la durata e il volume
                    System.out.println("Per favore, inserisci il titolo dell'audio:");
                    String title = scanner.nextLine();
                    audio.setTitle(title);

                    System.out.println("Per favore, inserisci la durata (in minuti):");
                    int duration = Integer.parseInt(scanner.nextLine());
                    audio.setDuration(duration);

                    System.out.println("Per favore, inserisci il volume (0-5):");
                    int volume = Integer.parseInt(scanner.nextLine());
                    audio.setVolume(volume);


                    audio.play();

                } else if (selectedMedia instanceof Video) {
                    Video video = (Video) selectedMedia;
                    System.out.println("Hai selezionato un video.");

                    // Chiedi il titolo, la durata, il volume e la luminosità
                    System.out.println("Per favore, inserisci il titolo del video:");
                    String title = scanner.nextLine();
                    video.setTitle(title); // Imposta il titolo del video

                    System.out.println("Per favore, inserisci la durata (in minuti):");
                    int duration = Integer.parseInt(scanner.nextLine());
                    video.setDuration(duration); // Imposta la durata

                    System.out.println("Per favore, inserisci il volume (0-5):");
                    int volume = Integer.parseInt(scanner.nextLine());
                    video.setVolume(volume); // Imposta il volume

                    System.out.println("Per favore, inserisci la luminosità (0-5):");
                    int brightness = Integer.parseInt(scanner.nextLine());
                    video.setBrightness(brightness); // Imposta la luminosità

                    // Stampa il risultato
                    video.play();

                } else if (selectedMedia instanceof Immagine) {
                    Immagine image = (Immagine) selectedMedia;
                    System.out.println("Hai selezionato un'immagine.");

                    // Chiedi il titolo e la luminosità
                    System.out.println("Per favore, inserisci il titolo dell'immagine:");
                    String title = scanner.nextLine();
                    image.setTitle(title); // Imposta il titolo dell'immagine

                    System.out.println("Per favore, inserisci la luminosità (0-5):");
                    int brightness = Integer.parseInt(scanner.nextLine());
                    image.setBrightness(brightness); // Imposta la luminosità

                    // Stampa il risultato
                    image.view();

                } else {
                    System.out.println("Nessun media trovato in questa posizione.");
                }
            } else {
                System.out.println("Numero non valido. Per favore, inserisci un numero da 1 a 5.");
            }
        }

        scanner.close();
    }
}
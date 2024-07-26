import multimediaAudioeVideo.Audio;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Per favore scrivi il testo della canzone:");
        String audioTitle = scanner.nextLine();


        System.out.println("Per favore scrivi la durata della canzone:");
        int audioDuration = Integer.parseInt(scanner.nextLine());


        System.out.println("Per favore scegli il volume (0-5):");
        int audioVolume = Integer.parseInt(scanner.nextLine());


        Audio newAudio = new Audio(audioTitle, audioDuration);
        newAudio.setVolume(audioVolume);


        newAudio.play();


        scanner.close();
    }
}

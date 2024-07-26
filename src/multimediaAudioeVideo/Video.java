package multimediaAudioeVideo;

public class Video extends Audio {
    private int brightness = 2; // Imposto una luminosità di default

    public Video(String mediaTitle, int duration) {
        super(mediaTitle, duration);
    }

    // Metodo per stampare il video con la luminosità

    @Override
    public void play() {
        int printCount = duration + volume + brightness;
        String puntoEsclamativo = "!".repeat(volume);
        String asterisco = "*".repeat(brightness);

        //ciclo for che in base al volume, luminosità e durata stampi il titolo tot num di volte
        
        for (int i = 0; i < printCount; i++) {
            System.out.println(this.mediaTitle + puntoEsclamativo + asterisco);
        }
    }

    // Metodo raiseBrightness() per aumentare la luminosità

    public void raiseBrightness() {
        if (brightness < 5) {
            this.brightness += 1;
        }
    }

    // Metodo lowerBrightness() per diminuire la luminosità

    public void lowerBrightness() {
        if (brightness > 0) {
            this.brightness -= 1;
        }
    }

    // Metodo setter per la luminosità


    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 5) {
            this.brightness = brightness;
        }
    }
}



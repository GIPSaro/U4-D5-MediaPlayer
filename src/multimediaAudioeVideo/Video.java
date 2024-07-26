package multimediaAudioeVideo;

public class Video {
    private String mediaTitle;
    private int duration;
    private int volume;
    private int brightness; // Imposto una luminosità di default

    public Video(String title, int duration) {

        this.mediaTitle = title;
        this.duration = duration;
        this.volume = 0;
        this.brightness = 0;
    }

    public void setTitle(String title) {
        this.mediaTitle = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setVolume(int volume) {
        if (volume < 0 || volume > 5) {
            throw new IllegalArgumentException("Volume deve essere tra 0 e 5.");
        }
        this.volume = volume;
    }

    // Metodo per stampare il video con la luminosità


    public void play() {
        int printCount = duration + volume + brightness;
        String puntoEsclamativo = "!".repeat(volume);
        String asterisco = "*".repeat(brightness);

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



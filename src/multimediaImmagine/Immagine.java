package multimediaImmagine;

public class Immagine {
    protected String mediaTitle;
    private int brightness = 2; // Luminosità di default

    public Immagine(String mediaTitle) {
        this.mediaTitle = mediaTitle;
    }

    public void view() {
        System.out.println(this.mediaTitle + "*".repeat(this.brightness));
    }

    public void raiseBrightness() {
        if (brightness < 5) {
            this.brightness += 1;
        }
    }

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

    public void setTitle(String title) {
        this.mediaTitle = title;
    }
}

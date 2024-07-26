package multimediaAudioeVideo;


public class Audio {

    protected String mediaTitle;
    protected int volume = 3; // imposto un volume di default
    private int duration;

    public Audio(String mediaTitle, int duration) {
        this.mediaTitle = mediaTitle;

    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Metodo setter per il titolo
    public void setTitle(String title) {
        this.mediaTitle = title;
    }

    // Metodo setter per il volume

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 5) {
            this.volume = volume;
        }
    }

    //Metodo play()
    public void play() {

        // ciclo per stampare tot numero di volte in base alla durata e il volume

        int printCount = duration + volume;
        String puntoEsclamativo = "!".repeat(volume);
        for (int i = 0; i < printCount; i++) {
            System.out.println(this.mediaTitle + puntoEsclamativo);
        }
    }
}


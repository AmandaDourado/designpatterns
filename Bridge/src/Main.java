import platforms.*;
import transmissions.AdvancedLive;
import transmissions.Live;
import transmissions.RecordLive;

public class Main {

    public static void main(String[] args) {
        startLive(new Youtube());
        startLive(new TwitchTV());
        startLive(new Facebook());
        startLive(new DisneyPlus());

        // implementar nova abstracao - recordlive vai extends live
        // implentar nova plataform - disney plus
    }

    // abstração
    public static void startLive(IPlatform platform) {
        /*System.out.println("Aguarde...");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();
        */
        /*
        System.out.println("Transmissão avançada...Aguarde");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.subtitles();
        advancedLive.result();
         */

        System.out.println("Record Live...");
        RecordLive recordLive = new RecordLive(platform);
        recordLive.broadcasting();
        recordLive.result();
        recordLive.gravarLive();
        recordLive.salvarLive();

        System.out.println("");
    }
}
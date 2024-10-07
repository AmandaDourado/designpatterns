package transmissions;

import platforms.IPlatform;

public class RecordLive extends Live {

    public RecordLive(IPlatform platform) {
        super.platform = platform;
    }

    public void gravarLive(){
        System.out.println("Gravando live");
    }

    public void salvarLive(){
        System.out.println("Mostrando lista de lives que foram gravadas");
    }
}

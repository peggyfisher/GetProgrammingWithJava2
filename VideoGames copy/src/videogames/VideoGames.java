package videogames;

public class VideoGames {   
    public static void main(String[] args) {
        ControllerInterface pc = new PCController();
        pc.onOff();
        ControllerInterface xbox = new XBoxController();
        xbox.onOff();
        ControllerInterface ps = new PlayStationController();
        ps.onOff();
        ControllerInterface nintendo = new NintendoController();
        nintendo.onOff();
    }   
}

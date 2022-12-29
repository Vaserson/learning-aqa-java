public class Radio implements ElectricityConsumer {

    public void playMusic() {
        System.out.println("Radio music is playing");
    }

    @Override
    public void electricityOn() {
        playMusic();
    }
}

package POLIMORPHISME;

public class samsung implements phone {
    
    private int volume;
    private boolean isPowerOn;

    public samsung (){
        //volume awal
        this.volume = 50;
    }
    
    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone menyala...");
        System.out.println("Selamt Datang di XIAOMI");
        System.out.println("Android version 29");
    }
    @Override
    public void powerOff() {
        isPowerOn= false;
        System.out.println("Handphone dimatikan");
    }
    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume FULL!!");
                System.out.println("sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }
    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume FULL!!");
                System.out.println("Sudah" + this.getVolume() + "%");
            }else{
                this.volume += 10;
                System.out.println("Volume Sekarang: " + this.getVolume()); 
            }
        }else{
            System.out.println("Nyalakan dl hp ny");
        }
    }
    public int getVolume(){
        return this.volume;
    }
}

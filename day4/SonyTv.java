package week4.day4;

public class SonyTv implements AndroidTv {

	private static SonyTv sony;
	@Override
	public void Blutooth() {
		System.out.println("Blutooth");
		
	}

	public  void voiceEragration() {
		System.out.println("voiceEragration");
		
	}

	@Override
	public  void Switchon() {
		System.out.println("Switchon");
		
	}

	@Override
	public void wifi() {
		System.out.println("wifi");
		
	}
public static void main(String[] args) {
	SonyTv.sony=new SonyTv();
	SonyTv sonyTv = new SonyTv();
	sonyTv.Blutooth();
	
	sonyTv.voiceEragration();
	sonyTv.Switchon();
	sonyTv.wifi();
}
}

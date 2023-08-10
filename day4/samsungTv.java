 package week4.day4;

public class samsungTv implements AndroidDesign
{

	@Override
	public void Blutooth() {
		System.out.println("Blutooth");
		
	}

	@Override
	public void voiceEragration() {
		System.out.println("voiceEragration");
		
	}

	@Override
	public void Switchon() {
		System.out.println("Switchon");
		
	}

	@Override
	public void wifi() {
		System.out.println("wifi");
		
	}
  public static void main(String[] args) {

	samsungTv samsungTv = new samsungTv();
	samsungTv.Blutooth();
	samsungTv.voiceEragration();
	samsungTv.Switchon();
	samsungTv.wifi();
  }
	  
	  
	  
}


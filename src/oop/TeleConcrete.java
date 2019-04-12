package oop;

public class TeleConcrete extends Teleabstract implements Teleinterface {
	//always extend abstract
	//always implement interface
	
	
	

	@Override
	public void camera() {
	
		System.out.println("camera functionality");
		
	}

	@Override
	public void call() {
		
		System.out.println("calling functionality");
		
		
	}

	@Override
	public void cancel() {
		System.out.println("call cancel functionality");
		
		
	}

	@Override
	public void answer() {
		System.out.println("call answer functionality");
		voicecommand();
		
		
	}
	
		
	
	

}

package com.n;

public class Desktop implements Software,HardWare {
	
	
	
	@Override
	public void hardwareResources() {
		System.out.println("indians");
		
	}
	
	
	@Override
	public void softwareResources() {
		System.out.println("Americans");
		
	}
	
	
	private void desktopModel() {
		System.out.println("Model");

	}
	
	
	public static void main(String[] args) {
		
		Desktop d=new Desktop();
		d.hardwareResources();
		d.softwareResources();
		d.desktopModel();
		
		for (int i = 0; i <=4; i++) {
			
			System.out.println(i);
			
		}
	}

}

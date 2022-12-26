package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("DesktopSize is big");

}
	public static void main(String[] args) {
		Desktop com=new Desktop();
		com.computerModel();
		com.desktopSize();
		
	}
}
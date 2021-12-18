package week2;

public class Smart_Overriding extends Android_Overriding {


	public void takeVideo()
	{
		System.out.print("Calling Parent class from child class: ");
		super.takeVideo();
		System.out.println("Smart Child Class - Take Video Method");
	}

}

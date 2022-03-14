package cap;

import java.util.*;
public class Ten {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double radius=s.nextDouble();
		sphereVolume(radius);
	}
	static void sphereVolume(double radius) {
		double volume = ((double)4/3)*3.14*(radius*radius*radius);
		System.out.println(volume);
	}
}

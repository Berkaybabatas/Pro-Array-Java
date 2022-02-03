package ProArrays;

public class Main {
public static void main(String[] args) {
	ProArray a=new ProArray(5);
	a.addInt(1);
	a.addInt(2);
	a.addInt(3);
	a.addInt(4);
	a.addInt(5);
	a.addInt(6);
	a.addInt(7);
	a.addInt(8);
	a.addInt(9);
	a.addInt(10);

	a.addInt(11);
	a.addInt(12);
	a.addInt(13);
	a.addInt(14);
	a.addInt(15);
	a.removeInt(2);
	a.addInt(16);
	a.Sirala();
	a.ArrayPrint();
	System.out.println();
	System.out.println("Size:"+a.getArraySize());
	System.out.println("Last Location:"+a.getArrayLastLocation());
}
}

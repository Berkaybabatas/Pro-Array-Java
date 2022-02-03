package ProArrays;

public class Main {
public static void main(String[] args) {
	ProArray a=new ProArray(5);
a.addInt(10);
a.addInt(20);
a.addInt(-10);
a.addInt(-99);
a.addInt(10);
a.addInt(100);
a.addInt(0);
a.removeInt(3);
a.sortBy(false);
a.ArrayPrint();
	System.out.println();
	System.out.println("Size:"+a.getArraySize());
	System.out.println("Last Location:"+a.getArrayLastLocation());
}
}

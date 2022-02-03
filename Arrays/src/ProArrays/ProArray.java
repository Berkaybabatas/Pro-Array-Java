package ProArrays;

public class ProArray {
	
protected int TempArray[];
protected int ArraySize;
protected int ArrayLastLocation;

public ProArray(int Size) {
	ArrayLastLocation=0;
	if(Size>0) {
		ArraySize=Size;
		TempArray=new int[getArraySize()];
	}else {
		System.out.println("Hatali Dizi Boyutu");
	}
}

private void ArrayCopy(){
	int newTempArray[]=new int[getArraySize()+10];
	for(int i=0;i<getArraySize();i++) {
		newTempArray[i]=TempArray[i];
	}
	ArraySize = getArraySize() + 10;
	TempArray=newTempArray;
}

public void addInt(int addNumber) {
	if(ArrayLastLocation==ArraySize) {
		ArrayCopy();
		TempArray[ArrayLastLocation]=addNumber;
		ArrayLastLocation++;
	}else {
		TempArray[ArrayLastLocation]=addNumber;
		ArrayLastLocation++;
	}
}
public void sortBy(boolean disending) {
	for(int i=0;i<=ArrayLastLocation-2;i++) {
		for(int j=i+1;j<=ArrayLastLocation-1;j++) {
			if(disending){
				if(TempArray[i]>TempArray[j]) {
					int Temp=TempArray[i];
				    TempArray[i]=TempArray[j];
				    TempArray[j]=Temp;
				}
			}else {
				if(TempArray[i]<TempArray[j]) {
					int Temp=TempArray[i];
					TempArray[i]=TempArray[j];
					TempArray[j]=Temp;
					}
			}
			}
	}
		
}
public boolean removeInt(int index) {
	if((index<=ArrayLastLocation)&&(index>0)) {
		for(int i=index;i<=ArrayLastLocation;i++) {
			TempArray[i]=TempArray[i+1];
			
		}
		ArrayLastLocation--;
		return true;
	}else {
		System.out.println("Hatali Dizi index");
		return false;
	}
	
}
public void ArrayPrint() {
	for(int i=0;i<ArrayLastLocation;i++) {
		System.out.print(TempArray[i]+" ");
	}
}

public int getInt(int index) {
	if((index<=ArrayLastLocation)&&(index>0)) {
		return TempArray[index];
	}else {
		System.out.println("Hatali Dizi index");
		return 0;
	}
}
public int getArraySize() {
	return ArraySize;
}

public int getArrayLastLocation() {
	return ArrayLastLocation;
}


}

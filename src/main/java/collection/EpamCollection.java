package collection;
public class EpamCollection{
private Object[] objArray=new Object[10];
private int elementcount=0;
public void add(Object obj) {
if(elementcount==objArray.length) {
increaseCapacity();
}
objArray[elementcount]=obj;
elementcount++;
}
public void print() {

System.out.print("[  ");
for(int i=0;i<elementcount;i++) {
System.out.print(objArray[i]+"  ");
}
System.out.print("]");
}
public int capacity() {
	return objArray.length;
}
public int size() {
	return elementcount;
}
public Object get(int index) {
	if(index<0 ||index>=size()) {
		throw new IndexOutOfBoundsException("index "+index+"is out of bounds!!!");
	}
return objArray[index];
}
public void remove(int index) {
System.out.print("The element at index " +index +" is "+objArray[index] +" is removed");
if(index<0 || index>=size()) {
throw new IndexOutOfBoundsException("index "+index+"  is out of bounds!!");

}
while(index<size()-1) {
objArray[index]=objArray[index+1];
index++;
}
objArray[index]=null;
elementcount--;

}
 public void increaseCapacity() {
  int newcapacity=objArray.length*2;
  Object[] nextArray=new Object[newcapacity];
  for(int i=0;i<objArray.length;i++) {
  nextArray[i]=objArray[i];
  }
  objArray=nextArray;
 

 }
}
package collection;
import java.util.*;
class EpamCollection{
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
if(index<0 || index>=size()) {
throw new IndexOutOfBoundsException("index "+index+" is out of bounds!!");

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
class Test{
public static void main(String args[])
{
EpamCollection col=new EpamCollection();
col.add("a");
col.add("b");
col.add("c");
col.add("d");
col.add("e");
col.add("f");
col.add("g");
col.add("h");
col.add("i");
col.add("a");
System.out.println("The predefined elements in collection are:");
col.print();

Label1:while("True"!=null)
{

System.out.println("\n1.Adding an element into the collection\n2.Retrieve an element from the collection\n3.Remove an element from the collection");
System.out.println("Enter your choice:");
Scanner s=new Scanner(System.in);
int choice=s.nextInt();
switch(choice)
{
case 1:
System.out.println("Enter the number of elements you want to add into collection:");
Scanner sc=new Scanner(System.in);
int numofelements=sc.nextInt();
System.out.println("Enter the elements:");
for(int i=0;i<numofelements;i++)
{
Scanner input=new Scanner(System.in);
String objelement=input.next();
col.add(objelement);
}
     col.print();
     break;
case 2:
System.out.println("Enter the index number of an element to retrieve:");
Scanner sca=new Scanner(System.in);
int i=sca.nextInt();
Object obj=col.get(i);
System.out.println("The element at index "+i +" is:"+obj);
break;
case 3:
System.out.println("Enter index number of an element to remove from the collection:");
Scanner inp=new Scanner(System.in);
int r=inp.nextInt();
col.remove(r);
System.out.println();
System.out.println("Elements in collection after removing an element are:");
col.print();
break;
default:
System.out.println("Wrong selection");
}
Label2:while("True"!=null) {    
    System.out.println();
	System.out.println("Do you want to continue(Y/N)or(y/n):"); 
    Scanner ch=new Scanner(System.in);
    char c=ch.next().charAt(0);
    
        if(c=='Y'||c=='y') {
        	continue Label1;
        }
        else if(c=='N'||c=='n'){
        	break Label1;
        }
        else if(c!='Y'&&c!='N'&&c!='y'&&c!='n') {
        	System.out.println("Wrong choice");
        	continue Label2;
        }
}
}
}
}
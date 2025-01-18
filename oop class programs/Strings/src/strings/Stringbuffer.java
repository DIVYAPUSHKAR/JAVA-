/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

/**
 *
 * @author RGUKT
 */
public class Stringbuffer {
    public static void main(String ar[])
    {
        StringBuffer sb=new StringBuffer("Hello ");  
        //1.append(String s):The append() method concatenates the given argument with this String.
sb.append("Java");
System.out.println(sb);
//2.insert(int offset, String s):The insert() method inserts the given String with this string at the given position.
sb.insert(1,"latha");//now original string is changed  
System.out.println(sb);
StringBuffer sb1=new StringBuffer("welcome");  
//3.replace(int startIndex, int endIndex, String str):
sb1.replace(1,3,"Java");  
System.out.println(sb1);
//4.delete(int startIndex, int endIndex)
sb.delete(1,3);  
System.out.println(sb);
//5.
StringBuffer sb2=new StringBuffer("good");  
sb2.reverse();  
System.out.println(sb2);
//5.capacity()
StringBuffer sb3=new StringBuffer();  
System.out.println(sb3.capacity());//default 16  
sb3.append("hai");  
System.out.println(sb3.capacity());//now 16  
sb3.append("java is platform independant");  
System.out.println(sb3.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
//6.ensureCapacity() 
sb3.ensureCapacity(10);//now no change  
System.out.println(sb3.capacity());
sb3.ensureCapacity(40);//now (34*2)+2  
System.out.println(sb3.capacity());//now 70 

    }
}

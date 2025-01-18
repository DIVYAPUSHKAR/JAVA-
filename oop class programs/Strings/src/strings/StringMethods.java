/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

/**
 *
 * @author RGUKT
 */
public class StringMethods {
    //2)concat()
    public static void main(String args[]){  
   String s="latha Reddy"+" cse";  
   System.out.println(s);
    String s1=50+30+"hello"+40+40;  
    System.out.println(s1);
    String s2="hello how are u,how do you  do do ";
     String s3=s.concat(s2);  
   System.out.println(s3);
   
  //3) charAt()
  System.out.println(s2.charAt(3));
  //4)contains()
  System.out.println(s2.contains("are"));
  //5) endsWith(String suffix) 

System.out.println(s2.endsWith("u"));//false 
//6.format()
 String str1 = String.format("%d", 101);          // Integer value  
        String str2 = String.format("%s", "hello world"); // String value  
 //7)startsWith()
 System.out.println(s2.startsWith("he"));  // true
 //8)indexOf()
 System.out.println(s2.indexOf("are"));//returns the index of is substring  
 System.out.println(s2.indexOf("h",8));//returns the index how substring after 4th index  
  System.out.println(s2.indexOf('w'));
  //9.substring(int startIndex, int endIndex) 
 // substring(int startIndex) 
 System.out.println(s.substring(0,8));
System.out.println(s.substring(6));
 //10.lastIndexOf(int ch, int fromIndex)
 //lastIndexOf(int ch)
 //lastIndexOf(substring, int fromIndex)
 //lastIndexOf(substring)
  String str3 = "This is index of example,ithis is very easy,";  
System.out.println("last index"+s.lastIndexOf('e'));
System.out.println("last index from position"+s2.lastIndexOf("do",19));
  //11.length()
  System.out.println("string length is: "+s1.length());
  //12.getBytes()
  String str4="ABCDEFG";  
byte[] b=s1.getBytes();  
for(int i=0;i<b.length;i++){  
System.out.println(b[i]);  
//13.getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)  
 String str5 = new String("Welcome to RGUKT-Basar");  
 char ch[]=new char[100];
  str5.getChars(0, 10, ch, 0);  
            System.out.println(ch); 
 //14.replace()
            System.out.println(str5.replace("RGUKT","IIIT"));
 //replaceAll()
       System.out.println(str5.replaceAll("a","e"));
//15)toLowerCase() and toUpperCase()       
     System.out.println(str5.toLowerCase()); 
       System.out.println(str5.toUpperCase());
  //16)join()
   String j=String.join(",","welcome","to","Hyd");  
   System.out.println(j);  
   //17)trim()
   String t="  hello java   ";  
System.out.println(t+"good");//without trim()  
System.out.println(t.trim()+"good");//with trim()  

            
}  
 }  
}

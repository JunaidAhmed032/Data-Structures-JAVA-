/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble_sort;

/**
 *
 * @author lenovo
 */
public class Bubble_Sort {

   public static class Bubblesort {
       public void bubblesort(int a[]){
    int l=a.length;
    for (int i = 0; i<=l-2; i++) {
        for (int j = 0; j <=l-2; j++) {
          if (a[j]>a[j+1]) {
              int tem=a[j];
              a[j]=a[j+1];
           a[j+1]=tem;
                    print(a);
          System.out.println("");
          System.out.println("---------------------------------------------");}
          print(a);
          System.out.println("");
          System.out.println("---------------------------------------------");
        }
     
    }
    System.out.println("fial sorted array is: ");
    print(a);
    
}
     public void print(int a[])
{
int l=a.length;
    for (int i = 0; i <l; i++) {
        System.out.print(a[i]+"  ");
       
       }

    
}}

    public Bubble_Sort() {
    }
    public static void main(String[] args) {
       int a[]={3,4,7,6,1,2,5};
        bubblesort(a);
    }
    
}

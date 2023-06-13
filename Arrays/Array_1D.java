import java.util.*;
public class Array_1D {
  public void Split_Array(){
    int[] array={1,2,3,4,5,6,7,8};
    int mid=array.length/2;
    int k=0;
    int[] b=new int[mid];
    int[] a=new int[array.length-mid];
    for(int i=0;i<array.length;i++){
        if(i<mid){
            b[i]=array[i];
        }
        else{
            a[k]=array[i];
            k++;
        }
    }
     System.out.print("Original array       ");
     for(int i=0;i<array.length;i++){
        System.out.print(array[i]+"  ");
     }
     
     System.out.print("\nsplited arrays    \n");
     System.out.println();
    for(int j=0;j<b.length;j++){
        System.out.print(b[j]+" ");
    }
    System.out.println();
     for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
    System.out.println();
  } 

   public void Duplicate_using_clone_method(){
   int[] a={1,2,3,4,5};
  // int[] b=a;      only refrenced will be changed. this will not make the duplicate array.
   int[] b;//=new int[5];
   b=(int[]) a.clone(); // clone method is defined in object class so duplicating an integer array  first convert it into int array

   for(int i=0;i<b.length;i++){
    System.out.print(b[i]+" ");
   }
   }

   public void Copy_using_arraycopy_method(){
    int[] a={1,2,3,4};
    int[] c={6,7,8,9};
    int[] b=new int[a.length+c.length];
    System.arraycopy(a, 0, b, 0, a.length);
    System.arraycopy(c, 0, b, 4, c.length);
    for(int i=0;i<b.length;i++){
        System.out.print(b[i]+" ");
    }
   }

Scanner scan=new Scanner(System.in);
public int[] insert(int[] array,int value){
    int[] newArray=new int[array.length+1];
    newArray[0]=value;
    for(int i=1;i<=array.length;i++){
        newArray[i]=array[i-1];
    }
    return newArray;
}

public int[] insert_at_Last(int[] array, int value){
    int[] newArray=new int[array.length+1];
    int last=newArray.length-1;
    for(int i=0;i<array.length;i++){
        newArray[i]=array[i];
    }
        newArray[last]=value;
    
    return newArray;
}
public int[] Insert_at_midle(int[] array,int value){
    int[] newArray=new int[array.length+1];
    int midle=array.length/2;
    for(int i=0;i<=array.length;i++){

        // 1 2 3 4 5 6 
        if(i<midle){
            newArray[i]=array[i];
        }
        else if(i==midle){
            newArray[i]=value;
        }
        else{
            newArray[i]=array[i-1];
        }
    }
    return newArray;
}


public int[] insert_at_anypos(int[] array){
int[] newArray=new int[array.length+1];
System.out.print("enter the position   ");
int position=scan.nextInt();
System.out.print("Enter the value    ");
int value=scan.nextInt();
for(int i=0;i<=array.length;i++){
    if(i<position){
        newArray[i]=array[i];
    }
    else if(i==position){
        newArray[i]=value;
    }
    else{
        newArray[i]=array[i-1];
    }
}
return newArray;
}


public int[] delete_at_first(int[] array){
    int[] newArray=new int[array.length-1];
    for(int i=1;i<array.length;i++){
        newArray[i-1]=array[i];
    }
    return newArray;
}

public int[] delete_at_last(int[] array){
    int[] newArray=new int[array.length-1];
    for(int i=0;i<array.length-1;i++){
     newArray[i]=array[i];
    }
    return newArray;
}


public int[] delete_at_any_position(int[] array){
    int[] newArray=new int[array.length-1];
    System.out.println("Enter the index you want to delete ");
    int index =scan.nextInt();
    for(int i=0;i<array.length;i++){
        if(i<index){
            newArray[i]=array[i];
        }
        else if(i==index){
        continue;
        }
        else{
            newArray[i-1]=array[i];
        }
    }
    return newArray;
}

public int[] Reverse(int[] array){
    for(int i=0;i<array.length/2;i++){
        int j=array[i];
        array[i]=array[array.length-i-1];
        array[array.length-i-1]=j;
    }
    return array;
}

public void display(int[] array){
    for(int i=0;i<array.length;i++){
        System.out.print(array[i]+"  ");
    }
    }

public static void main(String[] args) {
    Array_1D object=new Array_1D();
    object.Copy_using_arraycopy_method();
   // object.Duplicate_using_clone_method();
  //  int[] array={1,2,3,4,5};
   // object.display(array);
    // array=object.insert(array, 20);
    // System.out.println();
    // object.display(array);
    // array=object.insert_at_Last(array, 80);
    // array=object.insert_at_Last(array, 43);
    // System.out.println();
    // object.display(array);
    // System.out.println();
    // object.display(array);
    // array=object.Insert_at_midle(array, 90);
    // object.display(array);
    // array=object.insert_at_anypos(array);
    // object.display(array);
    // array=object.delete_at_any_position(array);
    // System.out.println();
    // object.display(array);
    // array=object.Reverse(array);
    // System.out.println();
    // object.display(array);

}

}

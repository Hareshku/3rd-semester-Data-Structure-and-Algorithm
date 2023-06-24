import java.util.*;
class Stack_basic_operations{
    Scanner sc=new Scanner(System.in);
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
   
    
    public void push(int data){
        Node newNode=new Node(data);
     if(head==null){
        head=newNode;
     }else{
       newNode.next=head;
     head=newNode; 
     }
         }




         public Node Reverse(Node head){
            if(head==null|| head.next==null){
                return head;
            }
            Node newhead=Reverse(head.next);
            head.next.next=head;
            head.next= null;
            return newhead;
         }
    public void search(){
    if(head==null){
        System.out.println("stack is empty ");
    }
    else{
        System.out.println("Enter the value you want to seach ");
        int data=sc.nextInt();
        Node temhead=head;
        int couter=0;
        int indexcer=0;
        while(temhead!=null){
            indexcer++;
            if(temhead.data==data){
                 couter++;
                System.out.println("element is present at position    "+indexcer);
                break;
        }
        temhead=temhead.next;
    }
    if(couter<=0){
        System.out.println("element not found");
    }
}    
}

public void Update(){
    if(head==null){
        System.out.println("stack is empty");
    }else{
        System.out.print("enter the position you want to update   ");
        int position=sc.nextInt();
        System.out.print("enter the new value  ");
        int value=sc.nextInt();

        Node temp=head;
        int counter=0;
        while(temp!=null){
            counter++;
            if(counter==position){
                temp.data=value;
            }
            temp=temp.next;
        }
    }
}

    public void push_at_bottom(int data){
        Node newNode=new Node(data);
        int size=0; 
        Node temphead=head;
         while(temphead!=null){
                size++;
                temphead=temphead.next;
            }
        
        int counter=0;
        int[] array=new int[size];
           
           

        if(head==null){
            head=newNode;
        }
        else{
            Node tempHead=head;
            while(tempHead!=null){
                array[counter++]=pop();
                tempHead=tempHead.next;
            }
          push(data);
        }
        for(int i=array.length-1; i>=0;i--){
            push(array[i]);
        }
    }

    public void push_at_end(int data){
        Node newNode=new Node(data);
        if(head==null){
         head=newNode;
        }
        else{
            Node tempNode=head;
            while(tempNode.next!=null){
                tempNode=tempNode.next;
            }
           tempNode.next=newNode;
        }
    }

    public int pop(){
        int top=head.data;
        head=head.next;
        return top;
    }

    public int peek(){
        int top=head.data;
        if(head==null){
            return -1;
        }else{
            
            return top;
        }
    }

    public void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Stack_basic_operations object=new Stack_basic_operations();
        int[] array={1,2,3,4,5};
        for(int i=0;i<array.length;i++){
            object.push(array[i]);
        }
        object.Display();
        object.head=object.Reverse(head);
        System.out.println();
        object.Display();
        System.out.println();
        object.push_at_bottom(90);
        System.out.println();
        object.Display();
        object.head=object.Reverse(object.head);
        System.out.println();
        object.Display();
        System.out.println();
        object.Update();
        object.Display();

        System.out.println(object.peek());
        System.out.println(object.pop());
        object.Display();
        object.search();
    }
}
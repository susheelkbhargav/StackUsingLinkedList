package com.company;

public class Stack {
    Node top;
    int length =0;

    public Stack() {
        top=null;
        this.length = 0;
    }

    void push (int data){
        Node n= new Node(data);
        if(isEmptyStack()==1){
            top= n;
            length++;
        }
        else{

            n.next=top;
            top=n;
            length++;
        }
    }

    void  pop(){
       if(isEmptyStack()==1){
           System.out.println("no item to pop in the stack");
       }
       else{
           Node n=top.next;
           top.next=null;
           top=n;

       }
       length--;

    }

    void printStack(){
        Node n=top;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }
    int Top(){
        return top.data;
    }

    int length(){
        return length;
    }

    int isEmptyStack(){
        if(length==0){
            return 1;
        }
        else{
            return 0;
        }

    }

}

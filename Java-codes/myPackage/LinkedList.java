package com.example.myPackage;

public class LinkedList {

    Node head;
    Node tail;
    static int count =0;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public static  class Node{
        int data;
        Node next;
        int flag;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.flag = 0;
        }

    }
    public void createTheList (int data){
        Node n = new Node(data);
        count++;
        if (this.head == null)
        {
            this.head = n;
            this.tail = n;

        }
        else{
            this.tail.next = n;

            this.tail = n;

        }
    }
    public void createLoop()
    {
        this.tail.next = this.head.next;
    }
    public void checkLoop (){
        Node temp = this.head;
        int check =0;
        int var1 = count;
        while(temp != null)
        {
            if(temp.flag == 0) {
                temp.flag = 1;
                temp = temp.next;

            }
            else{
                System.out.println("Loop detected");
                System.out.println("Quitting");
                check = 1;
                break;
            }
            var1--;

        }
        if (check == 0)
            System.out.println("Loop not detected");

    }

}

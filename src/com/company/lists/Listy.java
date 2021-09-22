package com.company.lists;

public class Listy {

    Link head;

    public void add (int data){
        Link link = new Link(data);
        if (head == null){
            head = link;
        }else{
            Link currentLink = head;
            while (currentLink.next != null){
                currentLink = currentLink.next;
            }
            currentLink = currentLink.next;
        }
    }

    @Override
    public String toString() {
        if (head == null){
            return null;
        }else{

        }
        return super.toString();
    }
}

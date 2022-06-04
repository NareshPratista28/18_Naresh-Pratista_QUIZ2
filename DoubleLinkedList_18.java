/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2;

/**
 *
 * @author nares
 */
public class DoubleLinkedList_18 {
    Node_18 head;
    int size;
    
    public DoubleLinkedList_18(){
        head = null;
        size = 1;    
    }
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addFirst(String namaPembeli, String noHp){
        if (isEmpty()){
            addFirst(namaPembeli, noHp);
        }else{
            Node_18 current = head;
            while (current.next != null){
                current = current.next;
            }
            Node_18 newNode = new Node_18(current, namaPembeli, noHp, null);
            current.next = newNode;
            size++;
    }
}

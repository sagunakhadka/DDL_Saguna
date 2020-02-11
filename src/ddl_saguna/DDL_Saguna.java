/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ddl_saguna;

/**
 *
 * @author Windows User
 */
public class DDL_Saguna {
    Node_Manish head;
    class Node_Manish { 
        int data; 
        Node_Manish prev; 
        Node_Manish next;  
        Node_Manish(int d) { data = d; } 
    }  
    public void push_Manish(int new_data) 
    { 
        Node_Manish new_Node = new Node_Manish(new_data); 
        new_Node.next = head; 
        new_Node.prev = null; 
        if (head != null) 
            head.prev = new_Node; 
        head = new_Node; 
    }
    public void InsertAfter_Saguna(Node_Manish prev_Node, int new_data) 
    { 
        if (prev_Node == null) { 
            System.out.println("The given previous node cannot be NULL "); 
            return; 
        } 
        Node_Manish new_node = new Node_Manish(new_data); 
        new_node.next = prev_Node.next; 
        prev_Node.next = new_node; 
        new_node.prev = prev_Node; 
        if (new_node.next != null) 
            new_node.next.prev = new_node; 
    } 
    void append_Manish(int new_data) 
    { 
        Node_Manish new_node = new Node_Manish(new_data);
        Node_Manish last = head;
        new_node.next = null; 
        if (head == null) { 
            new_node.prev = null; 
            head = new_node; 
            return; 
        } 
        while (last.next != null) 
            last = last.next; 
        last.next = new_node; 
        new_node.prev = last; 
    } 
    public void printlist_Manish(Node_Manish node) 
    { 
        Node_Manish last = null; 
        System.out.println("Traversal in forward Direction"); 
        while (node != null) { 
            System.out.println(node.data); 
            last = node; 
            node = node.next; 
        } 
        System.out.println(); 
        System.out.println("Traversal in reverse direction"); 
        while (last != null) { 
            System.out.println(last.data + " "); 
            last = last.prev; 
        } 
    } 
    public static void main(String[] args) {
        DDL_Saguna dll = new DDL_Saguna(); 
        dll.append_Manish(45); 
        dll.push_Manish(4); 
        dll.push_Manish(52); 
        dll.append_Manish(34); 
        dll.InsertAfter_Saguna(dll.head.next, 748); 
  
        System.out.println("Created DLL is: "); 
        dll.printlist_Manish(dll.head); 
        System.out.println("\nSaguna");
    } 
}


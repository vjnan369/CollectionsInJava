import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class LinkedList {
    Node head;
    public static void main(String ars[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Linked List Implementation: ");
        LinkedList list = new LinkedList();
        int userChoice;
        do {
            System.out.println("Enter 1 to add Elements: ");
            System.out.println("Enter 2 to get size of LinkedList: ");
            System.out.println("Enter 3 to find an element is in List: ");
            System.out.println("Enter 4 to get an index of given element: ");
            System.out.println("Enter 5 to add an element at first: ");
            System.out.println("Enter 6 to add an element at last: ");
            System.out.println("Enter 7 to remove given element: ");
            System.out.println("Enter 0 to Exit: ");
            System.out.print("Enter Your Choice: ");
            userChoice = s.nextInt();
            s.nextLine();
            switch (userChoice) {
                case 1:
                    System.out.print("Enter elements in one line with space: ");
                    String str[] = s.nextLine().split(" ");
                    for(int i=0; i<str.length; i++) {
                        boolean b = list.add(Integer.parseInt(str[i]));
                    }
                    System.out.print("List elements are:  ");
                    list.read();
                    break;
                case 2:
                    System.out.print("Total Elements are: ");
                    System.out.println(list.size());
                    break;
                case 3:
                    System.out.print("Enter an element to search: ");
                    int n = s.nextInt();
                    s.nextLine();
                    System.out.println(list.contains(n));
                    break;
                case 4:
                    System.out.print("Enter an element to find index: ");
                    int indexElement = s.nextInt();
                    s.nextLine();
                    System.out.println("Index is: " + list.indexOf(indexElement));
                    break;
                case 5:
                    System.out.print("Enter an element to add at first: ");
                    int firstElement = s.nextInt();
                    s.nextLine();
                    list.addFirst(firstElement);
                    System.out.print("List Elements are: ");
                    list.read();
                    break;
                case 6:
                    System.out.print("Enter an element to add at first: ");
                    int lastElement = s.nextInt();
                    s.nextLine();
                    list.addLast(lastElement);
                    System.out.print("List Elements are: ");
                    list.read();
                    break;
                case 7:
                    System.out.println("Enter an element to remove: ");
                    int removeElement = s.nextInt();
                    s.nextLine();
                    list.remove(removeElement);
                    System.out.print("List Elements are: ");
                    list.read();
                    break;

            }
        } while (userChoice != 0);

    }

    void remove(int n) {
        Node temp = head;
        Node carrierTemp = temp;
        if(carrierTemp.data == n) {
            temp = null;
            head = carrierTemp.next;
            carrierTemp = null;
        } else {
            temp = temp.next;
            while(temp != null) {
                if(temp.data == n) {
                    Node removalTemp = temp;
                    carrierTemp.next = temp.next;
                    removalTemp.next = null;
                    removalTemp = null;
                    break;
                }
                carrierTemp = temp;
                temp = temp.next;
            }
        }
    }

    void addLast(int n) {
        Node temp = head;
        Node lastNode = new Node(n);
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = lastNode;
    }

    void addFirst(int n) {
        Node firstNode = new Node(n);
        firstNode.next = head;
        head = firstNode;
    }

    int indexOf(int n) {
        Node temp = head;
        int index = 0;
        while(temp != null) {
            if (temp.data == n) {
                break;
            }
            index++;
            temp = temp.next;
        }
        if(temp == null) {
            return -1;
        }
        return index;
    }

    boolean contains(int n) {
        Node temp = head;
        boolean presence = false;
        while(temp != null) {
            if (temp.data == n) {
                presence = true;
                break;
            }
            temp = temp.next;
        }
        return presence;
    }

    int size() {
        Node temp = head;
        int count = 0;
        while(temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    void read() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    boolean add(int data) {
        Node temp;
        if(head == null) {
            temp = new Node(data);
            head = temp;
        }  else {
            temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            Node newNode = new Node(data);
            temp.next = newNode;
        }
        return true;
    }

}

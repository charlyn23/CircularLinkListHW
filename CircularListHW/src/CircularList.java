/**
 * Created by charlynbuchanan on 11/4/15.
 */
public class CircularList {

    Node head;


    public void insert(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        else {
            newNode.next = head;
            findTail().next = newNode;
            head = newNode;
        }
    }

    public void delete(String data)
    {
        Node current = head;
        if (head.data.equals(data)){

            findTail().next = head.next;
            head = head.next;
            System.out.println(head.data);
            System.out.println(findTail().data);
        }
        else
        {
            while(current.next != head && current.next != null)
            {
                current = current.next;
                if(current.next.data.equals(data))
                {
                    current.next = current.next.next;
                }
            }
        }
    }

    public void insertAfter(String compareTo, String newNodeData )
    {
        Node current = head;
        Node newNode = new Node(newNodeData);

        if(head.data.equals(compareTo)) {
            newNode.next = head.next;
            head.next = newNode;
        }
        else
        {
            while(current.next != head && current.next != null)
            {
                current = current.next;

                if(current.data.equals(compareTo))
                {
                    newNode.next = current.next;
                    current.next = newNode;
                }
            }
        }
    }

    public Node findTail(){
        Node current = head;
        while (current.next != head && current.next != null) {
            current = current.next;
        }
        return current;
    }

    public void print() {
        Node current = head;
        System.out.print(current.data + ", ");
        while (current.next != head && current.next != null) {
            current = current.next;
            System.out.print(current.data + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.insert("sunday");
        list.insert("monday");
        list.insert("tuesday");
        list.insert("wednesday");
        list.insert("thursday");
        list.insert("friday");
        list.insert("saturday");

        System.out.println(list);

        list.insertAfter("sunday", "funday");

        list.print();

    }
}

class LL {
    Node head;
    private int size;

    LL() { //constructor for LL class
        this.size = 0;
    }

    //this is to create node
    class Node { //we have to create node in the form of class
        String data;
        Node next; //next will have type as node
                                                                   
        Node(String data) { //this is the constructor of node
            this.data = data;
            this.next = null; //null because when we are creating first node,it will have next as null as we have not created other nodes yet
            size++; //whenever we are creating a node size increase
        }
    }

    //add first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) { //to check if there is existing linkedlist
            head = newNode; 
            return;
        }

        newNode.next = head; //process if linklist exist, so newNode will point towards the next of the newNode i.e,the first node or head(hard to understand)
        head = newNode;      //so our newNode will be the head
    }

    //add last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) { //to check if there is existing linkedlist
            head = newNode; 
            return;
        }

        Node currNode = head; //this is to treverse on linkedlist and this way we will also not lose the track of our head

        while (currNode.next != null) { //this will help treverse till the node before null
            currNode = currNode.next; //this will make the next node as currNode
        }

        currNode.next = newNode; //this will add the node before null and the newNode is already pointing to null refer line no 9
    }

    //delete first
    public void deleteFirst() {
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        size--; //deleting decreases size
        head = head.next; //second node will become next head and first node will be automatically removed by java garbage collector
    }
    //delete last
    public void deleteLast() {
        if(head == null) {
            System.out.println("list is empty");
            return;
        }

        size--; //we are writing it above the if statement because we will miss the single node list
        if(head.next == null) { //this case is to delete if there is only one node;as secondlast node will not exist and will give error in further code
            head = null; 
            return;
        }

        Node secondLast = head; //first both are assigned as head and head.next to treverse over the list
        Node lastNode = head.next;

        while(lastNode.next != null) { //if the above corner case is not written then it will give error here as there will be no node after null as our lastNode is head.next(in this case null)
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    //print 
    public void printList(){
        if(head == null) {
            System.out.println("list is empty"); //to check if list is empty
            return;
        }

        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public int getSize() {
        return size;
    }

    public static void main(String args[]) {
        LL list = new LL(); //this is the object of our class  
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
    }
}
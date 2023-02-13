

class LL{
    Node head;
   private int size;
   //LL constructor
   LL(){
       this.size = 0;
   }
   
    class Node{
        String data;
        Node next;
//Node constructor
        Node(String data){
            this.data = data;
            this.next = null;
        }


    }


    //add - first

      public void addFirst(String data){
         Node newNode =new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
      }

      //add last
      public void addLast(String data){
          Node newNode =new Node(data);
          if(head == null){
              head = newNode;
              return;
          }

          Node curNode =head;
          while(curNode.next!=null){
               curNode = curNode.next;
          }
          curNode.next = newNode;
          size++;
      }
    

      // print
      public void printList(){
        if(head == null){
            System.out.println("List is Empty");
        }
        Node curNode = head;
        while(curNode!=null){
            System.out.print(curNode.data + "->");
             curNode = curNode.next;
        }
        System.out.print("Null");
        System.out.println("");
    
      }

      // delete first

      public void deleteFirst(){
        if(head == null){
            System.out.println("this list is empty");
           return;

        }
         size--;
        head = head.next;

      }

      //delete last

      public void deleteLast()
    {
        if(head == null){
            System.out.println("this list is empty");
           return;
        }
        size--;
        if(head.next == null){
            head =null;
            return;
        }

        Node seccondLast =head;
        Node lastNode =head.next;
        while(lastNode.next !=null){
              lastNode = lastNode.next;
              seccondLast =seccondLast.next;
        }
        seccondLast.next=null;
    }


    // size
    public int getSize (){
          return size;
    }

    public static void main(String args[]){
         LL list =new LL();
          list.addFirst("a");
          list.addFirst("is");
          list.addLast("LinkedList");
          
          list.addFirst("This");
          

          list.deleteFirst();


          list.deleteLast();
      
          list.printList();
          System.out.println(list.getSize());
            list.addFirst("this");
           
            System.out.println(list.getSize());   
            list.printList();   
    }
}
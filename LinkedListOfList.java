public class LinkedListOfList{
    private ListOfList head;
    private ListOfList tail;

    public LinkedListOfList(){
      //
    }

    // only append prepend is not really needed for this project
    public void append(LinkedList nodesHead){

      if(this.tail == null){
        this.head = new ListOfList(nodesHead);
        this.tail = this.head;
      }else{
        this.tail.next = new ListOfList(nodesHead);
        this.tail = this.tail.next; // update tail
      }

    }

    public String toString(){
        if(this.head == null)
           return "[]";

        StringBuilder result = new StringBuilder("[ ");
        ListOfList current = this.head;

        while(current != null){
          result.append("[ ");
          result.append(current.nodesHead.toString() );
          result.append("],");
          current = current.next;
        }


        return result.toString();
      }

}

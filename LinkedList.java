public class LinkedList{

  private Node head;
  private Node tail;

  public LinkedList(){
    this.head = null;
    this.tail = null;
  }

  // only append prepend is not really needed for this project
  public void append(int row, int col, int val){

    if(this.tail == null){
      this.head = new Node(row,col,val);
      this.tail = this.head;
    }else{
        this.tail.next = new Node(row,col,val);
        this.tail = this.tail.next; // update tail
    }

  }

  public String toString(){
      if(this.head == null)
         return "[]";

      StringBuilder result = new StringBuilder("[ ");
      Node current = this.head;

      while(current != null){
        result.append("(" + current.row + "," + current.col +   ")" + ": " + current.val + ", ") ;
        current = current.next;
      }

      return result.toString();
    }

}

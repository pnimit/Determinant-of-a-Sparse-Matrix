// layout of list of list object
public class ListOfList{

  // data is nodes
  LinkedList nodesHead;
  ListOfList next;

  public ListOfList(LinkedList nodesHead){
      this.nodesHead = nodesHead;
      this.next = null;
  }

  // overloaded constructor
  public ListOfList(LinkedList nodesHead, ListOfList next){
      this.nodesHead = nodesHead;
      this.next = next;
  }

}

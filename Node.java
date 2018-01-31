// layout of node object
public class Node{

  // rows and col for matrix
  int row;
  int col;

  // matrix value
  int val;

  Node next;

  public Node(int row, int col, int val){
    this.row = row;
    this.col = col;
    this.val = val;
    this.next = null;
  }

  public Node(int row, int col, int val, Node next){
    this.row = row;
    this.col = col;
    this.val = val;
    this.next = next;
  }

}

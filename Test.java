public class Test{

  public static void main(String [] args){

    LinkedListOfList lol = new LinkedListOfList();

    LinkedList l1 = new LinkedList();

    l1.append(1,1,1);
    l1.append(2,2,2);
    l1.append(3,3,3);

    LinkedList l2 = new LinkedList();

    l2.append(4,4,4);
    l2.append(1,1,1);
    l2.append(1,2,4);

    LinkedList l3 = new LinkedList();

    l3.append(1,2,3);
    l3.append(2,3,4);
    l3.append(3,4,5);

    lol.append(l1);
    lol.append(l2);
    lol.append(l3);

    System.out.println(lol);

  }

}

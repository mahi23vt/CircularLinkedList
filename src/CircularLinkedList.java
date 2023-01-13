public class CircularLinkedList {
    private NumberNode head,tail;
    private int size=0;

    public void insertFirst(int num)
    {
        NumberNode node = new NumberNode(new Number(num));
        if(head == null)
        {
            head=node;
            tail=node;
            head.next=head;
            size++;
            return;
        }
        node.next=head;
        tail.next=node;
        tail=node;
        size++;
    }
    public void display()
    {
        NumberNode tempNode=head;
        if(head!=null) {
            do {
                System.out.print(tempNode.getNumber().getNum() + "-->");
                tempNode = tempNode.next;
            } while (tempNode!= head);
            System.out.println("Head Again");
        }
    }
}

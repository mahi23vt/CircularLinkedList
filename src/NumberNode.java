public class NumberNode {
    Number number;
    NumberNode next;

    public NumberNode(Number number) {
        this.number = number;
    }

    public NumberNode(Number number, NumberNode next) {
        this.number = number;
        this.next = next;
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    public NumberNode getNext() {
        return next;
    }

    public void setNext(NumberNode next) {
        this.next = next;
    }
}

public class ListCreation {

    public static void main(String args[]) {

        List list1 = new List(4);
        List list2 = new List(5);
        List list3 = new List(8);

        list1.createList();
        list1.generateAverage();

        list2.createList();
        list2.generateAverage();

        list3.createList();
        list3.generateAverage();
    }
}

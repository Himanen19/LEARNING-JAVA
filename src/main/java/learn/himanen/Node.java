//package learn.himanen;
//
//public class Node extends ListItem{
//
//
//    public Node(Object value) {
//        super(value);
//    }
//
//    @Override
//    ListItem next() {
//        return rightLink;
//    }
//
//    @Override
//    ListItem setNext(ListItem item) {
//        this.rightLink = item;
//        return rightLink;
//    }
//
//    @Override
//    ListItem previous() {
//        return leftLink;
//    }
//
//    @Override
//    ListItem setPrevious(ListItem item) {
//        this.leftLink = item;
//        return leftLink;
//    }
//
//    @Override
//    int compareTo(ListItem item) {
//        if (item != null ) {
//            return ((String) super.getValue()).compareTo((String) item.getValue());
//        }
//        return -1;
//    }
//
//}
//
//
//class MyLinkedList  {
//    ListItem root;
//
//    public MyLinkedList(ListItem root) {
//        this.root = root;
//    }
//    public boolean addItem(ListItem item) {
//        if(root == null ) {
//            root = item;
//        }
//            ListItem currentItem = this.root;
//        boolean point = true;
//        while(currentItem != null ) {
//            if (currentItem.compareTo(item) > 0) {
//                if ( currentItem.previous() != null ) {
//                    currentItem.setPrevious(item);
//                }
//                else {
//                    root.setNext(item);
//                }
//                currentItem = currentItem.next();
//
//            } else
//                if (currentItem.compareTo(item) < 0) {
//                currentItem.next();
//            }
//        }
//
//    }
//}

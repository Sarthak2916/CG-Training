package feature_28_1_26.linkedlist;

public class InventorySystem {

    public static void main(String[] args) {

        InventoryList inv = new InventoryList();

        inv.addAtEnd(101, "Laptop", 5, 55000);
        inv.addAtEnd(102, "Mouse", 20, 500);
        inv.addAtBeginning(103, "Keyboard", 10, 1500);

        inv.displayInventory();

        System.out.println("Total Value: " + inv.calculateTotalValue());

        inv.searchItem("Mouse");

        inv.updateQuantity(102, 30);

        inv.sortByPrice(true);

        System.out.println("\nAfter Sorting by Price:");
        inv.displayInventory();
    }
}

class ItemNode {
    int itemId;
    String itemName;
    int quantity;
    double price;
    ItemNode next;

    ItemNode(int id, String name, int qty, double price) {
        this.itemId = id;
        this.itemName = name;
        this.quantity = qty;
        this.price = price;
        this.next = null;
    }
}

class InventoryList {

    private ItemNode head;

    void addAtBeginning(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = head;
        head = newNode;
    }

    void addAtEnd(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);

        if (head == null) {
            head = newNode;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    void addAtPosition(int pos, int id, String name, int qty, double price) {

        if (pos == 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        ItemNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) return;

        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void removeItem(int id) {

        if (head == null) return;

        if (head.itemId == id) {
            head = head.next;
            return;
        }

        ItemNode curr = head;
        while (curr.next != null) {
            if (curr.next.itemId == id) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }

    void updateQuantity(int id, int newQty) {

        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    void searchItem(String key) {

        ItemNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (String.valueOf(temp.itemId).equals(key)
                    || temp.itemName.equalsIgnoreCase(key)) {

                System.out.println(
                        temp.itemId + " | " + temp.itemName +
                                " | Qty: " + temp.quantity +
                                " | Price: " + temp.price
                );
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("Item not found.");
    }

    double calculateTotalValue() {

        double total = 0;
        ItemNode temp = head;

        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }

        return total;
    }

    void sortByName(boolean ascending) {
        head = mergeSort(head, ascending, true);
    }

    void sortByPrice(boolean ascending) {
        head = mergeSort(head, ascending, false);
    }

    private ItemNode mergeSort(ItemNode node, boolean asc, boolean byName) {
        if (node == null || node.next == null) return node;

        ItemNode mid = getMiddle(node);
        ItemNode next = mid.next;
        mid.next = null;

        ItemNode left = mergeSort(node, asc, byName);
        ItemNode right = mergeSort(next, asc, byName);

        return merge(left, right, asc, byName);
    }

    private ItemNode merge(ItemNode a, ItemNode b, boolean asc, boolean byName) {

        if (a == null) return b;
        if (b == null) return a;

        boolean condition;

        if (byName)
            condition = asc ?
                    a.itemName.compareTo(b.itemName) <= 0 :
                    a.itemName.compareTo(b.itemName) > 0;
        else
            condition = asc ?
                    a.price <= b.price :
                    a.price > b.price;

        if (condition) {
            a.next = merge(a.next, b, asc, byName);
            return a;
        } else {
            b.next = merge(a, b.next, asc, byName);
            return b;
        }
    }

    private ItemNode getMiddle(ItemNode head) {

        ItemNode slow = head, fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    void displayInventory() {

        ItemNode temp = head;
        while (temp != null) {
            System.out.println(
                    temp.itemId + " | " + temp.itemName +
                            " | Qty: " + temp.quantity +
                            " | Price: " + temp.price
            );
            temp = temp.next;
        }
    }
}


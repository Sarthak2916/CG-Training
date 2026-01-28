package feature_28_1_26.linkedlist;

public class TicketReservationSystem {

    public static void main(String[] args) {

        TicketCircularList list = new TicketCircularList();

        list.addTicket(101, "Amit", "Inception", 12, "10:30 AM");
        list.addTicket(102, "Riya", "Avatar", 15, "11:00 AM");
        list.addTicket(103, "Amit", "Avatar", 18, "11:15 AM");

        list.displayTickets();

        System.out.println("Total Tickets: " + list.countTickets());

        list.searchTicket("Avatar");

        list.removeTicket(102);

        System.out.println("\nAfter Removal:");
        list.displayTickets();
    }
}

class TicketNode {
    int ticketId;
    String customerName;
    String movieName;
    int seatNumber;
    String bookingTime;
    TicketNode next;

    TicketNode(int ticketId, String customerName, String movieName,
               int seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = this;
    }
}

class TicketCircularList {

    private TicketNode head = null;

    void addTicket(int id, String customer, String movie,
                   int seat, String time) {

        TicketNode newNode =
                new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = newNode;
            return;
        }

        TicketNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    void removeTicket(int id) {

        if (head == null) return;

        TicketNode curr = head;
        TicketNode prev = null;

        if (head.next == head && head.ticketId == id) {
            head = null;
            return;
        }

        do {
            if (curr.ticketId == id) {

                if (curr == head) {
                    TicketNode last = head;
                    while (last.next != head)
                        last = last.next;

                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    void displayTickets() {

        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;
        do {
            System.out.println(
                    temp.ticketId + " | " +
                            temp.customerName + " | " +
                            temp.movieName + " | Seat: " +
                            temp.seatNumber + " | " +
                            temp.bookingTime
            );
            temp = temp.next;
        } while (temp != head);
    }

    void searchTicket(String keyword) {

        if (head == null) return;

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(keyword)
                    || temp.movieName.equalsIgnoreCase(keyword)) {

                System.out.println(
                        "Found → " + temp.ticketId + " | " +
                                temp.customerName + " | " +
                                temp.movieName
                );
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No ticket found.");
    }

    int countTickets() {

        if (head == null) return 0;

        int count = 0;
        TicketNode temp = head;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }
}


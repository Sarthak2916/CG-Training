package feature_15_1_26.java_class_and_object;

class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean booked;

    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = 0;
        this.price = 0;
        this.booked = false;
    }

    void bookTicket(int seatNumber, double price) {
        if (booked) {
            System.out.println("Ticket already booked!");
        } else {
            this.seatNumber = seatNumber;
            this.price = price;
            booked = true;
            System.out.println("Ticket booked successfully!");
        }
    }

    void displayTicketDetails() {
        System.out.println("Ticket Details:");
        System.out.println("Movie Name : " + movieName);

        if (booked) {
            System.out.println("Seat No.: " + seatNumber);
            System.out.println("Price: " + price);
            System.out.println("Status: Booked");
        } else {
            System.out.println("Status: Not Booked");
        }
    }
}



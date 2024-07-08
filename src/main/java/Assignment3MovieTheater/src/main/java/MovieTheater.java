package Assignment3MovieTheater.src.main.java;

public class MovieTheater {
    private char[][] seats;

    public MovieTheater(int rows, int cols) {
        seats = new char[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                seats[i][j] = '0';
            }
        }
    }

    public void displaySeatingChart() {
        for(int i = 0; i < seats.length; i++) {
            for(int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void reserveSeat(int row, int col) {
        if(seats[row][col] == 'X') {
            System.out.println("The seat is already taken.");
        } else {
            seats[row][col] = 'X';
            System.out.println("Seat reserved successfully!");

        }
    }

    public static void main(String[] args) {
        MovieTheater theater = new MovieTheater(5, 5);
        theater.displaySeatingChart();
        theater.reserveSeat(2, 2);
        theater.displaySeatingChart();
        theater.reserveSeat(2,2);
    }
}

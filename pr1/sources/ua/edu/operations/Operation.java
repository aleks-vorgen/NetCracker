package ua.edu.operations;

/**
 * Operation on two arguments
 *
 * @author Kulykov
 * @version 1.0
 */
public class Operation {

    private int x;
    private int y;

    /**
     * Create new operation using two numbers
     */
    public Operation (int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Method returns the result of operation
     * @return result of operation
     */
    public int getResult () { return x * y; }

}

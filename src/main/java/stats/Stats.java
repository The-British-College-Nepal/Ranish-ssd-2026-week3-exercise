package stats;

import java.util.Arrays;

/**
 * Calculates statistical metrics from a dynamic collection of integer values.
 *
 * @author Sudan Pudasaini
 */
public class Stats {

    private int[] numbers;
    private int count;

    /**
     * Creates a Stats object that can hold a fixed number of values.
     *
     * @param capacity the maximum size of the array
     */
    public Stats(int capacity) {
        numbers = new int[capacity];
    }

    /**
     * Adds an integer to the collection.
     *
     * @param value the integer being appended
     */
    public void addValue(int value) {
        numbers[count] = value;
        count++;
    }

    /**
     * Gets the number of values added so far.
     *
     * @return the number of values added
     */
    public int getCount() {
        return this.count;
    }

    /**
     * Finds the largest value added.
     *
     * @return the maximum value
     * @throws IllegalStateException if no values have been added
     */
    public int getMax() {
        if (count == 0) {
            throw new IllegalStateException("No values have been added to calculate statistics.");
        }
        int max = numbers[0];
        for (int i = 1; i < count; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    /**
     * Finds the smallest value added.
     *
     * @return the minimum value
     * @throws IllegalStateException if no values have been added
     */
    public int getMin() {
        if (count == 0) {
            throw new IllegalStateException("No values have been added to calculate statistics.");
        }
        int min = numbers[0];
        for (int i = 1; i < count; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    /**
     * Adds up all the values.
     *
     * @return the total of all values added
     */
    public int getTotal() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += numbers[i];
        }
        return total;
    }

    /**
     * Works out the average of all the values.
     *
     * @return the average of the values added
     * @throws IllegalStateException if no values have been added
     */
    public double getAverage() {
        if (count == 0) {
            throw new IllegalStateException("No values have been added to calculate statistics.");
        }
        return getTotal() / (double) count;
    }

    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }
}
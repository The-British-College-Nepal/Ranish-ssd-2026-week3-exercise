package stats;

import java.util.Arrays;

/**
 * Stores integers and calculates basic statistics on them.
 *
 * @author Sudan Pudasaini
 */
public class Stats {

    private int[] numbers;
    private int count;

    /**
     * Creates a Stats object with room for the given number of values.
     *
     * @param capacity the maximum number of values
     */
    public Stats(int capacity) {
        numbers = new int[capacity];
    }

    /**
     * Adds a value.
     *
     * @param value the value to add
     */
    public void addValue(int value) {
        numbers[count] = value;
        count++;
    }

    /**
     * Gets the number of values added.
     *
     * @return the count
     */
    public int getCount() {
        return this.count;
    }

    /**
     * Gets the largest value.
     *
     * @return the maximum value
     */
    public int getMax() {
        if (count == 0) {
            throw new IllegalStateException("No values have been added");
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
     * Gets the smallest value.
     *
     * @return the minimum value
     */
    public int getMin() {
        if (count == 0) {
            throw new IllegalStateException("No values have been added");
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
     * Gets the total of all values.
     *
     * @return the total
     */
    public int getTotal() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += numbers[i];
        }
        return total;
    }

    /**
     * Gets the average of all values.
     *
     * @return the average
     */
    public double getAverage() {
        if (count == 0) {
            throw new IllegalStateException("No values have been added");
        }
        return getTotal() / (double) count;
    }

    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }
}
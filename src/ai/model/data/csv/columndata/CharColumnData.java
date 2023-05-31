package src.ai.model.data.csv.columndata;

/**
 * A record to represent the data associated with a column of type char, all bounds are inclusive.
 *
 * @param name       the name of this column.
 * @param lowerBound the lowest ascii value a char can have in this column.
 * @param upperBound the highest ascii value that a char can have in this column.
 *
 * @author devinlinux
 */
public record CharColumnData(String name, int lowerBound, int upperBound) implements ColumnData {

    /**
     * A method to check if a value is a valid value to store in this column
     *
     * @param value the value to check
     * @return whether the value is a valid value to store in this column.
     */
    @Override
    public boolean isValid(Object value) {
        return value instanceof Character val && (int) val >= this.lowerBound && (int) val <= this.upperBound;
    }

    /**
     * A method to print out the column data, basically just requiring that each
     * implementing record has a toString.
     *
     * @return the {@code String} representation of the column data.
     */
    @Override
    public String toString() {
        return String.format("Name: %s%nLower Bound: %d%nUpper Bound: %d", this.name, this.lowerBound, this.upperBound);
    }
}

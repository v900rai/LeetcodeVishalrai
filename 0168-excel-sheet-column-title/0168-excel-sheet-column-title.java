class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();

        while (columnNumber > 0) {
            int index = (columnNumber - 1) % 26;
            str.insert(0, (char) ('A' + index));
            columnNumber = (columnNumber - 1) / 26;
        }
        return str.toString();

    }
}
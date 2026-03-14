class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (a, b) -> {
            String[] logs1 = a.split(" ", 2);
            String[] logs2 = b.split(" ", 2);
            boolean isDigit1 = Character.isDigit(logs1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(logs2[1].charAt(0));
            if (!isDigit1 && !isDigit2) {
                int compare = logs1[1].compareTo(logs2[1]);
                if (compare != 0) {
                    return compare;
                }
                return logs1[0].compareTo(logs2[0]);
            }

            if (isDigit1 && isDigit2) {
                return 0;
            }
            return isDigit1 ? 1 : -1;
        });
        return logs;
    }
}
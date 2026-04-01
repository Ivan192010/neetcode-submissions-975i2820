class Solution {
    public int minOperations(String[] logs) {
        int length = logs.length;
        int counter = 0;
        for(int i = 0; i < length; i++){
            if(logs[i].equals("../")){
                if (counter > 0) counter--;
            } else if (!logs[i].equals("./")) {
                counter++;
            }
        }
        return counter;
    }
}
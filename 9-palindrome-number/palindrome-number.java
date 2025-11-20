class Solution {
    public boolean isPalindrome(int x) {
        String str = ""+x;
        char[] org = str.toCharArray();
        int left = 0;
        int right = org.length - 1;

        for(int i = 0; i < str.length(); i++){
            if(org[left] != org[right]){
                return false;
            }
            right --;
            left ++;
        }
        return true;
    }
}
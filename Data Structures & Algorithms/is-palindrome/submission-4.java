class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length()-1;
        s = s.trim();
        if(s.length() == 0 || s.length() == 1)
            return true;

        while(left <= right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if(leftChar == ' ' || !isAlphanumeric(leftChar)){
                left++;
                continue;
            }
            if(rightChar == ' ' || !isAlphanumeric(rightChar)){
                right --;
                continue;
            }
                
            if(Character.toLowerCase(leftChar) == Character.toLowerCase(rightChar)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public boolean isAlphanumeric(char character){
        if ((character >= '0' && character <= '9') || (character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')){
            return true;
        }
        return false;
    }
}

class Solution {
    public List<String> fizzBuzz(int n) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++){  // Start from 0
            int number = i + 1;  // Convert index to actual number
            
            if(number % 3 == 0 && number % 5 == 0){
                answer[i] = "FizzBuzz";
            }else if(number % 3 == 0){
                answer[i] = "Fizz";
            }else if(number % 5 == 0){
                answer[i] = "Buzz";
            }else {
                answer[i] = String.valueOf(number);
            }
        }
        return Arrays.asList(answer);
    }
}
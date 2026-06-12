class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> li = new ArrayList<>();
        int count = 1;
        while(count <= n)
        {
            if(count % 3 == 0 && count % 5 == 0)
            {
                li.add("FizzBuzz");
            }
             else if(count % 3 == 0)
            {
                li.add("Fizz");
            }
            else if(count % 5 == 0)
            {
                li.add("Buzz");
            }
            else
            {
                li.add(String.valueOf(count));
            }
            count++;
        }
        return li;
    }
}
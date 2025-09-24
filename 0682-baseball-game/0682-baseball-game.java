class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stk = new Stack<>();
        int score = 0;
        for(String str : operations){
            if(str.equals("C")){
                stk.pop();
            } else if(str.equals("D")){
                stk.push(stk.peek()*2);
            } else if(str.equals("+")){
                int last = stk.pop();
                int secondLast = stk.peek();
                stk.push(last);
                stk.push(last + secondLast);
            } else {
                stk.push(Integer.parseInt(str));
            }
        }
        while(!stk.isEmpty()){
            score += stk.pop();
        }
        return score;
    }
}
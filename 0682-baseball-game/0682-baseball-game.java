class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> st=new Stack<>();
        for(String op: operations){
            if(op.equals("C")){
                st.pop();
            }
            else if(op.equals("D")){
                st.push(st.peek()*2);
            }
            else if(op.equals("+")){
                int last=st.peek();
                int secondlast=st.get(st.size()-2);
                st.push(last+secondlast);
            }
            else{
                st.push(Integer.parseInt(op));
            }
        }
        int total=0;
        while(!st.isEmpty()){
            total+=st.pop();
        }
        return total;
    }
}
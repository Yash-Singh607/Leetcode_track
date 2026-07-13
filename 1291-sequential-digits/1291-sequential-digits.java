class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list=new ArrayList<>();
        String s="123456789";
        // length of sequential number // generate all sequential number from len=2 to len=9
        for(int len=2;len<=9;len++){
            // for window of len(2 to 9)
            for(int start=0;start+len<=9;start++){
                String numstr=s.substring(start,start+len);
                int num=Integer.parseInt(numstr);
                if(num>=low && num<=high){
                    list.add(num);
                }
            }
        }
        return list;
    }
}
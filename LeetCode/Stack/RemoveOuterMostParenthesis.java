//Leetcode 1021 - Remove Outer Most Parenthesis

public class RemoveOuterMostParenthesis {
    public String removeOuterParentheses(String s) {
        StringBuilder res=new StringBuilder();
        int count=0;

        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(count>0){
                    res.append('(');
                }
                count+=1;
            }
            else{
                count-=1;
                if(count>0){
                    res.append(')');
                }
            }
        }

        return res.toString();
    }
}

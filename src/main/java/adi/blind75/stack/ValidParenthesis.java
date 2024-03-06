package adi.blind75.stack;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String[] strArray = {"()", "()[]{}", "(]"};
        for(String s : strArray){
            System.out.println("\""+s+"\" --> "+checkValidParenthesis(s));
        }
    }
    public static boolean checkValidParenthesis(String str){
        Stack<Character> stackList = new Stack<>();
        for(char c : str.toCharArray()){
            if(c == '{' || c == '[' || c == '(' ){
                stackList.push(c);
            } else {
                if(stackList.isEmpty()){
                    return false;
                } else {
                    char tmp = stackList.peek();
                    switch(c){
                        case '}': if(tmp == '{'){
                                        stackList.pop();
                                    } else {
                                        return false;
                                    }
                                    break;
                        case ']': if(tmp == '['){
                                    stackList.pop();
                                } else {
                                    return false;
                                }
                                    break;
                        case ')': if(tmp == '('){
                                    stackList.pop();
                                } else {
                                    return false;
                                }
                                    break;
                        default: break;
                    }
                }
            }
        }
        return stackList.isEmpty();
    }
}

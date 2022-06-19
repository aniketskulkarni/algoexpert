package com.java.problem.medium;

import java.util.Stack;

public class BalancedBrackets {
    public static boolean balancedBrackets(String str) {
        Stack<Character> charStack = new Stack<>();
        int idx = 0;
        for (char ch : str.toCharArray()) {
            idx++;

            if (charStack.empty() && (ch == ')' || ch == '}' || ch == ']')) {
                break;
            }

            if (ch == '(' || ch == '{' || ch == '[') {
                charStack.push(ch);
                continue;
            }

            if (!charStack.empty() && (ch == ')' || ch == '}' || ch == ']')) {
                char popedChar = charStack.pop();
                if (popedChar != '(' && ch == ')') {
                    break;
                }
                if (popedChar != '{' && ch == '}') {
                    break;
                }
                if (popedChar != '[' && ch == ']') {
                    break;
                }
            }
        }
        return charStack.empty() && str.length() == idx ? true : false;
    }

    public static boolean balancedBrackets1(String str) {
        Stack<Character> charStack = new Stack<>();
        int idx = 0;
        for(char ch: str.toCharArray()) {
          idx++;
    
          if(charStack.empty() && (ch == ')' || ch == '}' || ch == ']')) {
            break;
          }
          
          if(ch == '(' || ch == '{' || ch == '[') {
            charStack.push(ch);
            continue;
          }      
          
          if(!charStack.empty() && (ch == ')' || ch == '}' || ch == ']')) {
            char popedChar = charStack.pop();
            if ((popedChar != '(' && ch == ')') || (popedChar != '{' && ch == '}') || (popedChar != '[' && ch == ']')) {
                break;
            }
          }
        }
        return charStack.empty() && str.length() == idx ? true : false;
      }

    public static void main(String[] args) {
        BalancedBrackets obj = new BalancedBrackets();
        obj.balancedBrackets("(((((({{{{{[[[[[([)])]]]]]}}}}}))))))");
    }
}

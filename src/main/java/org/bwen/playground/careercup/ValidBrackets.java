package org.bwen.playground.careercup;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ValidBrackets {
    public static boolean isValid(String input) {

        Stack<Character> stack = new Stack<Character>();
        Set<Character> left = new HashSet();
        left.add('{');
        left.add('(');
        Set<Character> right = new HashSet();
        right.add('}');
        right.add(')');
        //Stream.of(Character.valueOf('{'),Character.valueOf('(')).collect(Collectors.toList());
        for (Character c : input.toCharArray()) {
            System.out.println("Checking "+c);
            if (left.contains(c)) {
                stack.push(c);
            }
            else if (right.contains(c)){
                Character x = stack.pop();
                if (!match(x, c)) {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        if(stack.empty()) {
            return true;
        }
        else {
            return false;
        }
    }
      private static boolean match(Character left, Character right) {
            switch(left) {
                case '{': return right =='}';
                case '(': return right ==')';
                default: return false;
            }

        }

  }


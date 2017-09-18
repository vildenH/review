package test;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;
        while (in.hasNext()) {
            Stack<String> stack = new Stack();
            String pathStr = in.next();
            char[] path = pathStr.toCharArray();

            for (int i = 0; i < path.length; ) {
                while (i < path.length && path[i] == '/') {
                    i++;
                }
                String temp = "";
                while (i < path.length && path[i] != '/') {
                    temp = temp + path[i];
                    i++;
                }
                if (temp.equals("..") && stack.empty() == false) {
                    stack.pop();
                } else if (!temp.equals(".") && !temp.trim().equals("")) {
                    stack.push(temp);
                }
            }
            if (stack.empty()) {
                System.out.println("/");
            } else {
                String ans = "";
                while (stack.size() > 0) {
                    ans = "/" + stack.peek() + ans;
                    stack.pop();
                }
                System.out.println(ans);
            }
        }
    }
}
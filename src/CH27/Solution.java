//package CH27;
//import java.util.*;
//
//public class Solution {
//    public List<String> solution(String[] expressions) {
//        List<String> answer = new ArrayList<>();
//        Set<Integer> candidate = new HashSet<>();
//        
//        for (int i = 2; i < 10; i++) {
//            candidate.add(i);
//        }
//
//        List<String> unknown = new ArrayList<>();
//
//        for (String expression : expressions) {
//            if (expression.split(" ")[4].equals("X")) {
//                unknown.add(expression);
//            }
//            if (candidate.size() > 1) {
//                Set<Integer> tempSet = new HashSet<>(findBase(expression));
//                candidate.retainAll(tempSet);
//            }
//        }
//
//        for (String expression : unknown) {
//            Set<Integer> results = new HashSet<>();
//            for (int base : candidate) {
//                results.add(calculateX(expression, base));
//            }
//            String temp = results.size() == 1 ? String.valueOf(results.iterator().next()) : "?";
//            answer.add(expression.substring(0, expression.length() - 1) + temp);
//        }
//
//        return answer;
//    }
//
//    private int decimalToBase(int number, int base) {
//        if (number == 0) {
//            return 0;
//        }
//        StringBuilder result = new StringBuilder();
//        while (number > 0) {
//            result.append(number % base);
//            number /= base;
//        }
//        return Integer.parseInt(result.reverse().toString());
//    }
//
//    private int calculateX(String expression, int base) {
//        String[] exp = expression.split(" ");
//        int op1 = Integer.parseInt(exp[0], base);
//        int op2 = Integer.parseInt(exp[2], base);
//        int result = (exp[1].equals("+")) ? op1 + op2 : op1 - op2;
//        return decimalToBase(result, base);
//    }
//
//    private boolean checkPossible(String expression, int base) {
//        String[] exp = expression.split(" ");
//        int op1 = Integer.parseInt(exp[0], base);
//        int op2 = Integer.parseInt(exp[2], base);
//        int result = Integer.parseInt(exp[4], base);
//        return (exp[1].equals("+")) ? (op1 + op2 == result) : (op1 - op2 == result);
//    }
//
//    private List<Integer> findBase(String expression) {
//        List<Integer> result = new ArrayList<>();
//        for (int i = 2; i < 10; i++) {
//            result.add(i);
//        }
//        String[] exp = expression.split(" ");
//
//        for (int i = 0; i < 3; i++) {
//            if (!exp[i].equals("X")) {
//                int n = exp[i].length();
//                int minBase = 2;
//                for (int j = 0; j < n; j++) {
//                    int temp = Character.getNumericValue(exp[i].charAt(j)) + 1;
//                    minBase = Math.max(minBase, temp);
//                }
//                result.removeIf(base -> base < minBase);
//            }
//        }
//
//        if (!exp[4].equals("X")) {
//            Iterator<Integer> iter = result.iterator();
//            while (iter.hasNext()) {
//                int base = iter.next();
//                if (!checkPossible(expression, base)) {
//                    iter.remove();
//                }
//            }
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        String[] expressions = {
//            "1 + 2 = X",
//            "X - 2 = 1",
//            "2 + 3 = 5",
//            "4 - X = 2"
//        };
//        List<String> results = solution.solution(expressions);
//        for (String res : results) {
//            System.out.println(res);
//        }
//    }
//}

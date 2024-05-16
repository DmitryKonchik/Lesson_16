import java.util.*;

public class Main {
    public static void main(String[] args) {

////        FirstTask
//
//        String[] words = new String[] {"skg", "skg", "qw", "re", "11", "11"};
//        Map<String, Boolean> map = new LinkedHashMap<>();
//
//        for (String w : words) {
//            if(!map.containsKey(w)) {
//                map.put(w, false);
//            } else {
//                map.put(w,true);
//            }
//        }
//        System.out.println(map);


//        SecondTask
//
//        String[] words = new String[]{"sksxkgbsxg", "skg", "qw", "re", "11", "123231"};
//
//        Map<String, String> map = new LinkedHashMap<>();
//
//        for (String w : words) {
//            char[] chars = w.toCharArray();
//                map.put("" + chars[0], "" + chars[chars.length - 1]);
//        }
//        System.out.println(map);

//        HardTask

        String str = "([{{[(( ))]}dgf}])";
        String str1 = "{{[]fds()}}}}";
        String st2 = "{[(  dg2])}";
        String str3 = "[13fsdhg( 123)]";
        System.out.println(checkParentheses(str));
        System.out.println(checkParentheses(str1));
        System.out.println(checkParentheses(st2));
        System.out.println(checkParentheses(str3));

    }

    static boolean checkParentheses(String str) {
        Deque<String> deque = new ArrayDeque<>();
        String[] str1 = str.split("");
//        String[] str1 = str.replaceAll("\\w+\\s+", "").split("");

        for (String s : str1) {
            if (s.equals("[") || s.equals("(") || s.equals("{")) {
                deque.addLast(s);
            } else {
                if (deque.isEmpty()){
                    System.out.println("не сбалансирована");
                    return false;
                }
                if (s.equals("}") && deque.getLast().equals("{")) {
                    deque.pollLast();
                    continue;
                }
                if (s.equals("]") && deque.getLast().equals("[")) {
                    deque.pollLast();
                    continue;
                }
                if (s.equals(")") && deque.getLast().equals("(")) {
                    deque.pollLast();
                }
            }
        }
        if (deque.isEmpty()) {
            System.out.println("сбалансирована");
            return true;
        } else {
            System.out.println("не сбалансирована");
            return false;
        }

    }
}
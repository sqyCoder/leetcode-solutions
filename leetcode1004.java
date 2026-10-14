public class leetcode1004 {
        public boolean isValid(String s) {
            StringBuilder stack = new StringBuilder();

            for (char ch : s.toCharArray()) {
                if (ch == 'c') {
                    int n = stack.length();
                    // 必须能拿出 "ab"
                    if (n < 2 || stack.charAt(n - 1) != 'b' || stack.charAt(n - 2) != 'a') {
                        return false;
                    }
                    // 删掉 "ab"，相当于删掉 "abc"
                    stack.setLength(n - 2);
                } else {
                    // 'a' 或 'b' 先存着
                    stack.append(ch);
                }
            }

            return stack.length() == 0;
        }
    }

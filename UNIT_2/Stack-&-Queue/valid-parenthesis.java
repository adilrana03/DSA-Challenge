// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.


// Input: s = "()[]{}"
// Output: true

// ----S O L U T I O N---///
class Solution {
        public boolean isValid(String s) {
            Stack<Character> st= new Stack<>();
            for(char c : s.toCharArray()){
                if(c=='(')
                    st.push(')');
                    else if(c=='[')
                    st.push(']');
                    else if(c=='{')
                    st.push('}');
                    else if(st.isEmpty() || st.pop() != c)
                    return false;
            }
            return st.isEmpty();
        }
    }
| Concept             | Logic                            | Common Condition                    |   |         |   |       |
| ------------------- | -------------------------------- | ----------------------------------- | - | ------- | - | ----- |
| Traversing String   | Visit each character             | `for(int i=0; i<s.length(); i++)`   |   |         |   |       |
| Character Match     | Check if characters are equal    | `s.charAt(i) == ch`                 |   |         |   |       |
| Character Not Equal | Check if characters differ       | `s.charAt(i) != ch`                 |   |         |   |       |
| Palindrome          | Compare start and end characters | `s.charAt(left) != s.charAt(right)` |   |         |   |       |
| Count Characters    | Increase count when found        | `if(s.charAt(i) == ch)`             |   |         |   |       |
| Vowel Check         | Check if character is vowel      | `if(ch=='a'                         |   | ch=='e' |   | ...)` |
| Uppercase Check     | Check uppercase letter           | `Character.isUpperCase(ch)`         |   |         |   |       |
| Lowercase Check     | Check lowercase letter           | `Character.isLowerCase(ch)`         |   |         |   |       |
| Convert Case        | Change case                      | `Character.toLowerCase(ch)`         |   |         |   |       |
| String Contains     | Check substring exists           | `s.contains("abc")`                 |   |         |   |       |
| Compare Strings     | Check equality                   | `s.equals(str)`                     |   |         |   |       |
| Ignore Case         | Compare without case             | `s.equalsIgnoreCase(str)`           |   |         |   |       |
| Reverse String      | Traverse from end to start       | `for(i=s.length()-1;i>=0;i--)`      |   |         |   |       |
| First Occurrence    | Find first index                 | `s.indexOf(ch)`                     |   |         |   |       |
| Last Occurrence     | Find last index                  | `s.lastIndexOf(ch)`                 |   |         |   |       |
| Split String        | Break into words                 | `s.split(" ")`                      |   |         |   |       |

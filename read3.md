| If Question Says...        | Logic             | Condition / Formula              |
| -------------------------- | ----------------- | -------------------------------- |
| Count something            | Traverse + count  | `count++`                        |
| Sum of elements            | Traverse + add    | `sum += arr[i]`                  |
| Find largest               | Track max         | `if(arr[i] > max)`               |
| Find smallest              | Track min         | `if(arr[i] < min)`               |
| Find index of element      | Search            | `if(arr[i] == target)`           |
| Count occurrences          | Search + count    | `if(arr[i] == target)`           |
| Check element exists       | Search            | `if(arr[i] == target)`           |
| Count even numbers         | Count             | `if(arr[i] % 2 == 0)`            |
| Count odd numbers          | Count             | `if(arr[i] % 2 != 0)`            |
| Count positive numbers     | Count             | `if(arr[i] > 0)`                 |
| Count negative numbers     | Count             | `if(arr[i] < 0)`                 |
| Find maximum even          | Max + even check  | `if(arr[i]%2==0 && arr[i]>max)`  |
| Find minimum odd           | Min + odd check   | `if(arr[i]%2!=0 && arr[i]<min)`  |
| Reverse array              | Two pointers      | `while(left < right)`            |
| Check palindrome array     | Two pointers      | `if(arr[left] != arr[right])`    |
| Check sorted array         | Compare adjacent  | `if(arr[i] > arr[i+1])`          |
| Find duplicate             | Nested loops      | `if(arr[i] == arr[j])`           |
| Count duplicates           | Nested loops      | `if(arr[i] == arr[j])`           |
| Two Sum                    | Check pairs       | `if(arr[i]+arr[j]==target)`      |
| Pair with given sum        | Nested loops      | `if(arr[i]+arr[j]==target)`      |
| Pair with given difference | Nested loops      | `if(Math.abs(arr[i]-arr[j])==k)` |
| Find second largest        | Track two values  | `if(arr[i] > largest)`           |
| Find second smallest       | Track two values  | `if(arr[i] < smallest)`          |
| Remove duplicates (sorted) | Compare neighbors | `if(arr[i] != arr[i-1])`         |
| Merge arrays               | Copy elements     | `result[k++] = arr[i++]`         |
| Average of array           | Sum then divide   | `sum / arr.length`               |
| Product of array           | Multiply          | `product *= arr[i]`              |
| Replace even/odd values    | Traverse          | `if(arr[i]%2==0)`                |
| Find missing number        | Sum formula       | `n*(n+1)/2`                      |
| Find common elements       | Nested loops      | `if(arr1[i]==arr2[j])`           |
| Frequency of elements      | Count matches     | `if(arr[i]==arr[j])`             |
| Move zeros to end          | Two pointers      | `if(arr[i]!=0)`                  |
| Find largest difference    | Compare pairs     | `Math.abs(arr[i]-arr[j])`        |

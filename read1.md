| Sorting Algorithm  | Main Logic                                                                  | Condition Used                  |
| ------------------ | --------------------------------------------------------------------------- | ------------------------------- |
| **Bubble Sort**    | Compare adjacent elements and swap if wrong order                           | `if(arr[j] > arr[j+1])`         |
| **Selection Sort** | Find the minimum element and place it at the correct position               | `if(arr[j] < arr[minIndex])`    |
| **Insertion Sort** | Take one element and insert it into the correct position in the sorted part | `while(j >= 0 && arr[j] > key)` |
| **Merge Sort**     | Divide array into halves, sort, then merge                                  | `if(left[i] <= right[j])`       |
| **Quick Sort**     | Choose a pivot and place smaller elements on the left, larger on the right  | `if(arr[j] < pivot)`            |

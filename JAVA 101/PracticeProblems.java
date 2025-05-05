// Practice Problems 

// # 1: Write a function called countOccurrences that takes an integer array arr 
and an integer n, and returns the number of times that n appears in arr.


public static int count0ccurences(int[] arr, int n){
  // initialize count accumulator 
  int count = 0 

  //
  for (int num : arr){ 
      if (num == n){ 
        count = count + 1; 
      }
  }

  return count; 
}

// #2: Write a function called reverseArray that takes an integer array arr 
and returns a new array with the elements of arr but in reverse order.

public static int reverseArray(int[] arr){ 
    for (int i = 0; i < arr.length; i++){
      reverse[i] = arr[arr.length - 1 - i];
    }

    return reverse
}

// #3: Write a function called sumGrid that takes a 2d double array grid 
and returns the sum of all the elements. Hint: you can do this with nested 
for loops (look up what that is).

public static double sumGrid(double[][] grid){
    double sum = 0; 

    for (int row = 0; row < grid.length; row++){
        for (int col =0; col < grid[row].length; col++){
            sum = sum + grid[row][col]; 
        }
    }

    return sum; 
}

// #4: Write a function called fib that takes an integer n and returns the nth 
number in the fibonacci sequence (starting with 0 1).

public static int fib(int n){
    if(n <= 1){
      return n; 
    } 

    return fib(n-1) + fib(n-2);

}

// Define an array
let arr = [5, 2, 9, 1, 5, 6];

// Sort the array in descending order
arr.sort(function(a, b) {
  return b - a;
});

// Alternatively, you can use an arrow function for the comparison:
// arr.sort((a, b) => b - a);

// Print the sorted array
console.log(arr);

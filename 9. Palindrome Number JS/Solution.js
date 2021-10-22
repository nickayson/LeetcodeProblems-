/**
 * @param {number} x
 * @return {boolean}
 */

let int = 121;

 var isPalindrome = function(x) {
    //no negatives
    //essentially use mod to find remainders and if they are the same then it is a palindrome
    var reversed = 0;
    var og = x; // to use for comparison
    var remainder;
    
    if(x < 0){
        return false;
    }
    while (x != 0){
        remainder = x % 10;
        reversed = reversed * 10 + remainder;
        x = parseInt(x/10);
    }
    if(og == reversed){
        console.log(true);
        return true;
    }else{
     return false;   
    }

    // return x == x.toString().split('').reverse().join('');
    // //simpler
};

isPalindrome(int);
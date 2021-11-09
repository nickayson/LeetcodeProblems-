/**
 * @param {string} s
 * @return {boolean}
 */

let pal = "A man, a plan, a canal: Panama";
 var isPalindrome = function(s) {
    s = s.toLowerCase();
    s = s.replace(/\s/g, ''); // all spaces gone
    s = s.replace(/[.,\/#!$%\^&\*;:{}=\-_`~()]/g,"");// manually type out all punctuation 
    let text = s.split('');
    for(let i = 0; i < text.length; i++){
        if(s[i] != s[text.length - i - 1]){
            console.log(s)
           return false;
         }
    }
    console.log("true");
    console.log(s);
    return true;
};

 isPalindrome(pal);
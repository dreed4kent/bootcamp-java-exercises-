/*
1. SumDouble
*/

function sumDouble(x, y) {
    let sum = x + y;
    if (x === y) {
        sum *= 2;
    }
    return sum;
}

/*
2. HasTeen
*/

function hasTeen(x, y, z) {
    if ((x > 12 && x < 20 || y > 12 && y < 20 || z > 12 && z < 20)) {
        return true;
    } else {
        return false;
    }
}

/*
3. LastDigit
*/

function lastDigit(x, y) {
    if (x%10 == y%10) {
        return true;
    } else {
        return false;
    }
}

/*
4. SeeColor
*/

function seeColor(colorString) {
    if (colorString.substring(0, 3) == "red") {
        return "red";
    } else if (colorString.substring(0, 4) == "blue") {
        return "blue";
    } else {
        return "";
    }
}

/*
5. MiddleThree
*/

function middleThree(str) {
    return str.substring(str.length / 2 - 1, str.length / 2 + 2);
}

/*
6. FrontAgain
*/

function frontAgain(str) {
    if (str.substring(0, 2) == str.substring(str.length - 2)) {
        return true;
    } else {
        return false;
    }
}

/*
7. AlarmClock
*/

function alarmClock(day, vacation) {
    var arr = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]
    if (vacation) {
        if (day > 0 && day < 6){
            return arr[day] + " 10:00";
        } else {
            return arr[day] + " off";
        }
    } else {
        if (day > 0 && day < 6) {
            return arr[day] + " 7:00";
        } else {
            return arr[day] + " 10:00";
        }
    }
}

/*
8. MakeMiddle
*/

function makeMiddle(intArray) {
    var results = [];
    if (intArray.length % 2 == 0 && intArray.length > 1) {
        results.push(intArray[intArray.length / 2-1])
        results.push(intArray[intArray.length / 2])
    }
    return results;
}

/*
9. OddOnly
*/

function oddOnly(intArray) {
    var results = [];
    for (var i = 0; i < intArray.length; i++) {
        if (intArray[i] % 2 == 0) {
        } else {
        results.push(intArray[i]);
        }
    }
    return results;
}

/*
10. Weave
*/

// function weave() {
//     var Array1
// }

/*
11. CigarParty
*/

  function cigarParty (cigars, weekend) {
    if (weekend) {
        if (cigars > 39) {
          return true;
        }
        } else {
        if (cigars > 39 && cigars < 61) {
          return true;
        }
        }
    return false;
}

/*
12. StringSplosion
*/

function stringSplosion(code) {
var result = "";
for(var i = 0; i <= code.length; i++) {
    result += code.substring(i, 0);
    }
    return result;
}

/*
13. FizzBuzz
*/

function fizzBuzz(num) {
    if(num % 15 == 0) {
        return "FizzBuzz";
    } else if (num%5==0) {
          return "Buzz";
    } else if (num%3==0) {
          return "Fizz";
    } else {
          return num;
    }
}

/*
14. CountValues
*/

/*
15. ReverseArray
*/
var arr = ["sravani", "Shiva", "Ashutosh", "Pavani", "Rakesh"];
var names = "Ashutosh";
var flag = false;
for (var i = 0; i < arr.length; i++) {
    if (names === arr[i]) {
        flag = true;
        console.log('the name is present at:' + i);
    }
}
if (flag === false) {
    console.log('the name is not there in the array');
}

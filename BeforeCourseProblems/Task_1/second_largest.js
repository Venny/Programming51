/* 2. Second largest num */

var nums = [1 ,2, 5, 4, 7, 5];
var nums2 = [0, 12, 11, 10, 9, 7, 3, 2];
var nums3 = [11, 2, 3, 4, 5, 6, 7];
var nums4 = [11, 2, 3, 4, 5, 6, 700, 0, -12, 11, 10, 9, 7, 3];
var nums5 = [0, 0, 0, 1, 3, 0, 0, 0];

function second_largest(nums){
	var myNumArray = nums.map(Number), // Convert the array items in nums if they're not
		myFirstNum = myNumArray[0],
		mySecondNum = myNumArray[1];

	if(myNumArray.length < 2){
		return false;
	}
	else {
		for(var i = 0; i < myNumArray.length; i++){ 
			if( myFirstNum < myNumArray[i] ){
				mySecondNum = myFirstNum;
				myFirstNum = myNumArray[i];
			}
			else {
				if( mySecondNum < myNumArray[i] && myFirstNum != myNumArray[i] ){
					mySecondNum = myNumArray[i];
				}
			}
		}
	}

	console.log('The first num in the array is: ' + myFirstNum);
	console.log('The second one: ' + mySecondNum);
}


second_largest(nums5);
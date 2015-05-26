/* Count words */
var wordsArr = ["apple", "banana", "apple", "pie"];
//count_words(wordsArr);
function count_words(arr){
  var counts = {};
  for(var i = 0; i < arr.length; i++){
    counts[arr[i]] = (counts[arr[i]] + 1) || 1;
  }

  //console.log(counts);
  return counts;
}


/* Unique words */
unique_words_count(wordsArr);
function unique_words_count(arr){
  //console.log(Object.keys(count_words(arr)).length);
  return Object.keys(count_words(arr)).length;
}


/* NaN Expand */
nan_expand(5);
function nan_expand(times){
  if(times <= 0){
    console.log('');
    return '';
  }
  else {
    var result = '';
    for (var i = 1; i <= times; i++) {
      result += 'Not a ';
    };


    //console.log(result + 'NaN');
    return result + 'NaN';
  }
}


/* Iterations of NaN Expand */
var expanded = nan_expand(5);
iterations_of_nan_expand(expanded);
function iterations_of_nan_expand(expanded){
  var stringArr = expanded.split(' ');
  var counts = {};
  for(var i = 0; i < stringArr.length; i++){
    if(stringArr[i] == 'Not'){
      counts[stringArr[i]] = (counts[stringArr[i]] + 1) || 1;
    }
  }
  //console.log(counts.Not);
  return counts.Not;
}


/* Spam and   Eggs */
var num = 75;
prepare_meal(num);
function prepare_meal(number){
  var text = '';
  while(number % 3 == 0 || number % 5 == 0){
    if(number % 3 == 0){
      number /= 3;
      text += 'spam ';
    }
    else {
      number /= 5;
      text += (number == 1)? 'and eggs': 'eggs ';
    }
  }

  console.log(text);
}

/* 3. Cipher text */

var encrypted_word = 'mjriew',
	cipher = {
		'h': 'i', 
		'y': 'j', 
		'o': 'e', 
		't': 'r', 
		'n': 'w', 
		'p': 'm'
	};

/*var encrypted_word = 'bbbbbbbbbbbbbbbbbbbbbbbbbbb',
	cipher = {'a': 'b'};*/

function decode_word(encrypted_word, cipher){
	var myWord = encrypted_word.split(''),
		singleLetter = '',
		decriptor = [];

	for(var i in myWord){	
		singleLetter = myWord[i];

		for(var m in cipher){
			if(singleLetter === cipher[m]){
				decriptor.push(m);
			}
		}
	}

	console.log(decriptor.join(''));
}

decode_word(encrypted_word, cipher)
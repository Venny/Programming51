/* 4. Cinema Seats */

var cinema = [ [1, 1, 1],
               [1, 0, 0],
               [1, 0, 0],
               [1, 1, 0] ],

    cinema2 = [ [0, 0],
                [0, 0],
                [0, 0] ],

    cinema3 = [ [1, 1, 1, 0],
                [1, 0, 1, 0],
                [0, 0, 0, 0] ],

    cinema4 = [ [1, 0, 1, 0],
                [1, 1, 1, 0] ];

order_of_seats(cinema4);

function order_of_seats(cinema){
  var tuples = [],
      seatsPerRowArr = [];

  for ( var i in cinema ) {
    var row = cinema[i],
        seatsPerRow = 0;

    // Make the tuples array
    for( var n in row){
      var tuple = [];
      if(row[n] == 0){
        tuple.push(parseInt(i) + 1, parseInt(n) + 1); // because the arrays start form 0
        tuples.push(tuple);
        seatsPerRow++;
      }
    }

    // Save the seats number per row to help later in the sorting
    if(seatsPerRow > 0 ){
      seatsRow = {
        'seatsPerRow': seatsPerRow,
        'row': parseInt(i) + 1
      }
      seatsPerRowArr.push(seatsRow);
    }

  };

  sortTheCinemaArray(seatsPerRowArr, tuples);
}

function sortTheCinemaArray(seatsPerRowArr, tuples){
  //Create a second array for the sorting
  var sortedTuples = [],
      row;

  seatsPerRowArr.sort(function(a, b){
    return a.seatsPerRow - b.seatsPerRow ;
  });

  for(var i in seatsPerRowArr){
    seatsPerRowArr[i].seatsPerRow;
    row = seatsPerRowArr[i].row;

    for(var n in tuples){
      if(tuples[n][0] == row){
        sortedTuples.push(tuples[n])
      }
    }
  }

  console.log(sortedTuples);
  return sortedTuples;
}




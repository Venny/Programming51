/* 1. Los or profit */

var income = [1 ,2, 5, 5],
	outcome = [1, 8, 10];

function lossOfProfit(income, outcome){
	var incomeNum = 0,
		outcomeNum = 0;

	for(var i in income){
		incomeNum += income[i];
	}
	for(var m in outcome){
		outcomeNum += outcome[m];
	}

	console.log(incomeNum - outcomeNum);
	return incomeNum - outcomeNum;
}

lossOfProfit(income, outcome);

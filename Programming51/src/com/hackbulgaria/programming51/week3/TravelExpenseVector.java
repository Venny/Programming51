package com.hackbulgaria.programming51.week3;

/**
 * Created by Inspired Day on 6/24/2015.
 */
public class TravelExpenseVector {
    private TravelExpense [] travelExpenseVector;
    private int currentSize;
    private int capacity;


    public TravelExpenseVector(){
        this.currentSize = 0;
        this.capacity = 10;
        travelExpenseVector = new TravelExpense [capacity];
    }

    public String toString(){
        String expenses = "";
        for(TravelExpense item:travelExpenseVector){
            expenses += (item + "/n");
        }
        return expenses;
    }

    public void add(TravelExpense expense){
        if(currentSize == capacity){
            resize();
        }
        travelExpenseVector[currentSize] = expense;
    }

    public int getTotalNetCost(){
        int total = 0;
        for(int i = 0; i <= currentSize; i++){
            total += travelExpenseVector[i].getNetCost();
        }
        return total;
    }

    public Employee getEmployeeWithMostExpenses(){
        int mostExpensesEmployee = 0;
        for(int i = 0; i < currentSize; i++){
            employeeExpenses(i);
        }
    }

    private void resize(){
        TravelExpense [] temp = new TravelExpense[capacity*2 +1];
        for(int i = 0; i < capacity; i++){
            temp[i] = travelExpenseVector[i];
        }
        travelExpenseVector = temp;

    }

    private int employeeExpenses(int index){
        String employeeName = travelExpenseVector[index].getEmployee().toString();
        int employeeExpenses = 0;
        for(int i = 0; i < currentSize; i++){
            if(travelExpenseVector[i].getEmployee().toString().equals(employeeName)){
                employeeExpenses += travelExpenseVector[i].getNetCost();
            }
        }
        return employeeExpenses;
    }

}

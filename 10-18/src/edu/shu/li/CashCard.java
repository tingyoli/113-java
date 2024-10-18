package edu.shu.li;

public class CashCard {
    public String number;
    public int balance;
    public int bonus;

    public CashCard(String number, int balance, int bonus){
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }

    public String getNumber(){
        return this.number;
    }
    public int getBalance(){
        return this.balance;
    }
    public int getBonus(){
        return this.bonus;
    }

    public void setNumber(String number){
        this.number = number;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public void setBonus(int bonus){
        this.bonus = bonus;
    }

    public void store(int money){
        if(money > 0){
            this.balance += money;
            if(money >= 1000){
                this.bonus += money/1000;
            }
        }
        else{
            System.out.println("儲值金額為負");
        }
    }

    public void  charge(int money){
        if(money > 0){
            if(money <= this.balance){
                this.balance -= money;
            }
            else{
                System.out.println("餘額不足");
            }
        }
        else{
            System.out.println("扣款金額為負");
        }
    }
}

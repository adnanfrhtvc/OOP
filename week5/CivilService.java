package org.example.week5;

public class CivilService implements NationalService{
    private int daysLeft;
    CivilService(){}
    @Override
    public int getDaysLeft(){
        return this.daysLeft;
    }
    @Override
    public void work(){
        if(this.daysLeft==0){
            System.out.println("Days cannot become negative");
        }
        else{
            this.daysLeft-=this.daysLeft;
        }
    }
}

package org.example.week5;

public class MilitaryService implements NationalService {
    private int daysLeft;
    MilitaryService(int daysLeft){
        this.daysLeft=daysLeft;
    }
    @Override
    public int getDaysLeft(){
        return this.daysLeft;
    }
    @Override
    public void work(){
        if(this.daysLeft==0){
            System.out.println("Days can't be negative");
        }
        else{
            this.daysLeft-=1;
        }
    }
}

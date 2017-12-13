package Rooms;

import Characters.Character;

public class Room {

    double rewardGold;

    public Room(double rewardGold) {
        this.rewardGold = rewardGold;
    }


    public void collectReward(Character character){

        character.setGold(character.getGold() + this.rewardGold);
    }

    public double getRewardGold() {
        return rewardGold;
    }

    public void setRewardGold(double rewardGold) {
        this.rewardGold = rewardGold;
    }
}

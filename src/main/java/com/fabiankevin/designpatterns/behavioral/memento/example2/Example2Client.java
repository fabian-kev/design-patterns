package com.fabiankevin.designpatterns.behavioral.memento.example2;

import com.fabiankevin.designpatterns.behavioral.memento.example2.originator.Human;

public class Example2Client {

    public static void main(String[] args) {
        HumanManager humanManager = new HumanManager();
        Human human = new Human();

        human.decide("he walks outside");
        humanManager.saveState(human);

        human.decide("he meets a woman");
        humanManager.saveState(human);

        human.decide("he's starting dating her");
        humanManager.saveState(human);

        human.decide("he asks the woman to be his gf and rejected");
        humanManager.saveState(human);

        humanManager.undo(human);
        System.out.println("last decision "+human.getDecision());
        humanManager.undo(human);
        System.out.println("last decision "+human.getDecision());
        humanManager.undo(human);
        System.out.println("last decision "+human.getDecision());

    }
}

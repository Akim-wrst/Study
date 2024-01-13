package Generics_Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Team<T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    Team(String name) {
        this.name = name;
    }

    void addNewParticipant(T participant) {
        participants.add(participant);
        System.out.println(" V komandu " + name + " bil dobavlen noviy uchastnik " +
                " po imeni " + participant.getName() + " " + participant.getAge());
    }

    void playWitch(Team<T> team) {
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            winnerName = this.name;
        } else {
            winnerName = team.name;
        }
        System.out.println(" viygrala komanda " + winnerName);
    }
}


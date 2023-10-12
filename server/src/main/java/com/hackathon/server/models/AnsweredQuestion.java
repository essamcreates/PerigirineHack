package com.hackathon.server.models;


import jakarta.persistence.*;

@Entity
@Table(name = "answered_questions")
public class AnsweredQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String chosenOption;




//    private DailyQuestion dailyQuestion;
//
//   private User user;
//

    public AnsweredQuestion() {
    }

    public AnsweredQuestion(Long id, String chosenOption) {
        this.id = id;
        this.chosenOption = chosenOption;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChosenOption() {
        return chosenOption;
    }

    public void setChosenOption(String chosenOption) {
        this.chosenOption = chosenOption;
    }
}
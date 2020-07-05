package sbz.biochemical.analysis.model.mind;

import sbz.biochemical.analysis.model.user.User;
import javax.persistence.*;

@Entity
@Table(name = "DAILY_MIND_STATES")
public class DailyMindState {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "day")
    private String day;

    @Column(name = "state")
    private Mood mood;

    @ManyToOne()
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public DailyMindState() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

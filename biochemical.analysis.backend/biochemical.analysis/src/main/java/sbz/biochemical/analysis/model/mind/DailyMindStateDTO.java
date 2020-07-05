package sbz.biochemical.analysis.model.mind;

public class DailyMindStateDTO {

    private Mood mood;

    public DailyMindStateDTO() {
    }

    public DailyMindStateDTO(Mood mood) {
        this.mood = mood;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }
}

package sbz.biochemical.analysis.model.mind;

import org.kie.api.definition.type.Expires;
import org.kie.api.definition.type.Role;
import org.kie.api.definition.type.Timestamp;

import java.io.Serializable;
import java.util.Date;

@Role(Role.Type.EVENT)
@Timestamp("executionTime")
@Expires("2h30m")
public class DailyMindStateEvent implements Serializable {

    private static final long serialVersionUID = 1L;
    private Date executionTime;
    private Mood mood;
    private String user;

    public DailyMindStateEvent() {
        super();
    }

    public DailyMindStateEvent(Mood mood, String user) {
        super();
        this.mood = mood;
        this.user = user;
        this.executionTime = new Date();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Date getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Date executionTime) {
        this.executionTime = executionTime;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}

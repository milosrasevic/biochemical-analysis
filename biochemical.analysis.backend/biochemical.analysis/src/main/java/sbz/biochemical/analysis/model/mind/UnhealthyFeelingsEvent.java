package sbz.biochemical.analysis.model.mind;

import org.kie.api.definition.type.Role;

@Role(Role.Type.EVENT)
public class UnhealthyFeelingsEvent {

    private String feelings;
    private String user;

    public UnhealthyFeelingsEvent() {
    }

    public UnhealthyFeelingsEvent(String feelings, String user) {
        this.feelings = feelings;
        this.user = user;
    }

    public String getFeelings() {
        return feelings;
    }

    public void setFeelings(String feelings) {
        this.feelings = feelings;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}

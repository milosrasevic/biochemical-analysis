package sbz.biochemical.analysis.model.bones;

import sbz.biochemical.analysis.model.bones.analysis.BoneMarrow;
import sbz.biochemical.analysis.model.bones.analysis.BonesCondition;
import sbz.biochemical.analysis.model.bones.analysis.JointsCondition;

import java.io.Serializable;

public class BonesAnalysis implements Serializable {

    private BoneMarrow boneMarrow;
    private BonesCondition bonesCondition;
    private JointsCondition jointsCondition;

    public BonesAnalysis() {
    }

    public BonesAnalysis(BoneMarrow boneMarrow, BonesCondition bonesCondition, JointsCondition jointsCondition) {
        this.boneMarrow = boneMarrow;
        this.bonesCondition = bonesCondition;
        this.jointsCondition = jointsCondition;
    }

    public BoneMarrow getBoneMarrow() {
        return boneMarrow;
    }

    public void setBoneMarrow(BoneMarrow boneMarrow) {
        this.boneMarrow = boneMarrow;
    }

    public BonesCondition getBonesCondition() {
        return bonesCondition;
    }

    public void setBonesCondition(BonesCondition bonesCondition) {
        this.bonesCondition = bonesCondition;
    }

    public JointsCondition getJointsCondition() {
        return jointsCondition;
    }

    public void setJointsCondition(JointsCondition jointsCondition) {
        this.jointsCondition = jointsCondition;
    }
}

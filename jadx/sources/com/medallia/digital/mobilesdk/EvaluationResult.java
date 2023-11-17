package com.medallia.digital.mobilesdk;

import org.json.JSONObject;

class EvaluationResult implements C10756c1 {
    private String engagementId;
    private MDEngagementType engagementType;
    private Long nextEvaluationTime;

    protected EvaluationResult(String str, Long l, MDEngagementType mDEngagementType) {
        this.engagementId = str;
        this.nextEvaluationTime = l;
        this.engagementType = mDEngagementType;
    }

    public String getEngagementId() {
        return this.engagementId;
    }

    public MDEngagementType getEngagementType() {
        return this.engagementType;
    }

    /* access modifiers changed from: package-private */
    public Long getNextEvaluationTime() {
        return this.nextEvaluationTime;
    }

    public String toJsonString() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{\"engagementId\":");
            sb.append(C11051p3.m40518c(this.engagementId));
            sb.append(",\"nextEvaluationTime\":");
            sb.append(this.nextEvaluationTime);
            sb.append(",\"engagementType\":");
            MDEngagementType mDEngagementType = this.engagementType;
            sb.append(C11051p3.m40518c(mDEngagementType != null ? mDEngagementType.toString() : null));
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    protected EvaluationResult(JSONObject jSONObject) {
        try {
            if (jSONObject.has("engagementId") && !jSONObject.isNull("engagementId")) {
                this.engagementId = jSONObject.getString("engagementId");
            }
            if (jSONObject.has("nextEvaluationTime") && !jSONObject.isNull("nextEvaluationTime")) {
                this.nextEvaluationTime = Long.valueOf(jSONObject.getLong("nextEvaluationTime"));
            }
            if (jSONObject.has("engagementType") && !jSONObject.isNull("engagementType")) {
                this.engagementType = MDEngagementType.fromString(jSONObject.getString("engagementType"));
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}

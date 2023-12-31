package com.medallia.digital.mobilesdk;

public class MDInterceptListenerData {
    private String engagementId;
    private MDEngagementType engagementType;
    private MDAppearanceMode interceptAppearanceDisplay;
    private MDAppearanceMode interceptAppearanceSet;
    private String reason;
    private long timestamp;

    protected MDInterceptListenerData(long j, String str) {
        updateParams(j, str, (MDEngagementType) null, (String) null, (MDAppearanceMode) null, (MDAppearanceMode) null);
    }

    private void updateParams(long j, String str, MDEngagementType mDEngagementType, String str2, MDAppearanceMode mDAppearanceMode, MDAppearanceMode mDAppearanceMode2) {
        this.timestamp = j;
        this.engagementId = str;
        this.engagementType = mDEngagementType;
        this.reason = str2;
        this.interceptAppearanceSet = mDAppearanceMode;
        this.interceptAppearanceDisplay = mDAppearanceMode2;
    }

    public String getEngagementId() {
        return this.engagementId;
    }

    public MDEngagementType getEngagementType() {
        return this.engagementType;
    }

    public MDAppearanceMode getInterceptAppearanceDisplay() {
        return this.interceptAppearanceDisplay;
    }

    public MDAppearanceMode getInterceptAppearanceSet() {
        return this.interceptAppearanceSet;
    }

    public String getReason() {
        return this.reason;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    protected MDInterceptListenerData(long j, String str, MDEngagementType mDEngagementType) {
        updateParams(j, str, mDEngagementType, (String) null, (MDAppearanceMode) null, (MDAppearanceMode) null);
    }

    protected MDInterceptListenerData(long j, String str, MDEngagementType mDEngagementType, MDAppearanceMode mDAppearanceMode, MDAppearanceMode mDAppearanceMode2) {
        updateParams(j, str, mDEngagementType, (String) null, mDAppearanceMode, mDAppearanceMode2);
    }

    protected MDInterceptListenerData(long j, String str, String str2, MDEngagementType mDEngagementType) {
        updateParams(j, str, mDEngagementType, str2, (MDAppearanceMode) null, (MDAppearanceMode) null);
    }
}

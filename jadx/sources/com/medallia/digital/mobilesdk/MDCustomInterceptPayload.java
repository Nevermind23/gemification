package com.medallia.digital.mobilesdk;

import java.io.Serializable;

public class MDCustomInterceptPayload implements Serializable {
    String declineText;
    String deferText;
    String provideFeedbackText;
    String subtitleText;
    String titleText;

    public MDCustomInterceptPayload(MDCustomInterceptPayload mDCustomInterceptPayload) {
        this.titleText = mDCustomInterceptPayload.titleText;
        this.subtitleText = mDCustomInterceptPayload.subtitleText;
        this.provideFeedbackText = mDCustomInterceptPayload.provideFeedbackText;
        this.declineText = mDCustomInterceptPayload.declineText;
        this.deferText = mDCustomInterceptPayload.deferText;
    }

    public String getDeclineText() {
        return this.declineText;
    }

    public String getDeferText() {
        return this.deferText;
    }

    public String getProvideFeedbackText() {
        return this.provideFeedbackText;
    }

    public String getSubtitleText() {
        return this.subtitleText;
    }

    public String getTitleText() {
        return this.titleText;
    }

    /* access modifiers changed from: protected */
    public String toJsonString() {
        try {
            return "{\"titleText\":" + C11051p3.m40518c(this.titleText) + ",\"subtitleText\":" + C11051p3.m40518c(this.subtitleText) + ",\"provideFeedbackText\":" + C11051p3.m40518c(this.provideFeedbackText) + ",\"declineText\":" + C11051p3.m40518c(this.declineText) + ",\"deferText\":" + C11051p3.m40518c(this.deferText) + "}";
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    MDCustomInterceptPayload(String str, String str2, String str3, String str4, String str5) {
        this.titleText = str;
        this.subtitleText = str2;
        this.provideFeedbackText = str3;
        this.declineText = str4;
        this.deferText = str5;
    }
}

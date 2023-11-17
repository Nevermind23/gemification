package p341ge.bog.mobilebank.model;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.model.FeatureFeedback */
public final class FeatureFeedback {
    private final long feedbackId;
    private final FeedbackType feedbackType;
    private final String feedbackVersion;

    public FeatureFeedback(long j, FeedbackType feedbackType2, String str) {
        C41536l.m120489i(feedbackType2, "feedbackType");
        C41536l.m120489i(str, "feedbackVersion");
        this.feedbackId = j;
        this.feedbackType = feedbackType2;
        this.feedbackVersion = str;
    }

    public static /* synthetic */ FeatureFeedback copy$default(FeatureFeedback featureFeedback, long j, FeedbackType feedbackType2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = featureFeedback.feedbackId;
        }
        if ((i & 2) != 0) {
            feedbackType2 = featureFeedback.feedbackType;
        }
        if ((i & 4) != 0) {
            str = featureFeedback.feedbackVersion;
        }
        return featureFeedback.copy(j, feedbackType2, str);
    }

    public final long component1() {
        return this.feedbackId;
    }

    public final FeedbackType component2() {
        return this.feedbackType;
    }

    public final String component3() {
        return this.feedbackVersion;
    }

    public final FeatureFeedback copy(long j, FeedbackType feedbackType2, String str) {
        C41536l.m120489i(feedbackType2, "feedbackType");
        C41536l.m120489i(str, "feedbackVersion");
        return new FeatureFeedback(j, feedbackType2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeatureFeedback)) {
            return false;
        }
        FeatureFeedback featureFeedback = (FeatureFeedback) obj;
        return this.feedbackId == featureFeedback.feedbackId && this.feedbackType == featureFeedback.feedbackType && C41536l.m120484d(this.feedbackVersion, featureFeedback.feedbackVersion);
    }

    public final long getFeedbackId() {
        return this.feedbackId;
    }

    public final FeedbackType getFeedbackType() {
        return this.feedbackType;
    }

    public final String getFeedbackVersion() {
        return this.feedbackVersion;
    }

    public int hashCode() {
        return (((C7397t.m28148a(this.feedbackId) * 31) + this.feedbackType.hashCode()) * 31) + this.feedbackVersion.hashCode();
    }

    public final boolean shouldShowAfterPayment() {
        FeedbackType feedbackType2 = this.feedbackType;
        return feedbackType2 == FeedbackType.TRANSFERS_AND_PAYMENTS || feedbackType2 == FeedbackType.PAYMENTS;
    }

    public final boolean shouldShowAfterTransfer() {
        FeedbackType feedbackType2 = this.feedbackType;
        return feedbackType2 == FeedbackType.TRANSFERS_AND_PAYMENTS || feedbackType2 == FeedbackType.TRANSFERS;
    }

    public final boolean shouldShowPFMSurvey() {
        return this.feedbackType == FeedbackType.PFM_SATISFACTION_SURVEY;
    }

    public String toString() {
        long j = this.feedbackId;
        FeedbackType feedbackType2 = this.feedbackType;
        String str = this.feedbackVersion;
        return "FeatureFeedback(feedbackId=" + j + ", feedbackType=" + feedbackType2 + ", feedbackVersion=" + str + ")";
    }
}

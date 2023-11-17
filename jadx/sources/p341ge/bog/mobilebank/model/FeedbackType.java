package p341ge.bog.mobilebank.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.model.FeedbackType */
public enum FeedbackType {
    ;

    /* renamed from: ge.bog.mobilebank.model.FeedbackType$PAYMENTS */
    static final class PAYMENTS extends FeedbackType {
        PAYMENTS(String str, int i) {
            super(str, i, (DefaultConstructorMarker) null);
        }

        public String getQuestionKey() {
            return "text.feature.feedback.after.payment.question ";
        }
    }

    /* renamed from: ge.bog.mobilebank.model.FeedbackType$PFM_SATISFACTION_SURVEY */
    static final class PFM_SATISFACTION_SURVEY extends FeedbackType {
        PFM_SATISFACTION_SURVEY(String str, int i) {
            super(str, i, (DefaultConstructorMarker) null);
        }

        public String getQuestionKey() {
            return "text.feature.feedback.pfm.satisfaction_survey.question";
        }
    }

    /* renamed from: ge.bog.mobilebank.model.FeedbackType$TRANSFERS */
    static final class TRANSFERS extends FeedbackType {
        TRANSFERS(String str, int i) {
            super(str, i, (DefaultConstructorMarker) null);
        }

        public String getQuestionKey() {
            return "text.feature.feedback.after.transfer.question";
        }
    }

    /* renamed from: ge.bog.mobilebank.model.FeedbackType$TRANSFERS_AND_PAYMENTS */
    static final class TRANSFERS_AND_PAYMENTS extends FeedbackType {
        TRANSFERS_AND_PAYMENTS(String str, int i) {
            super(str, i, (DefaultConstructorMarker) null);
        }

        public String getQuestionKey() {
            return "text.feature.feedback.after.payment.or.transfer.question";
        }
    }

    public abstract String getQuestionKey();
}

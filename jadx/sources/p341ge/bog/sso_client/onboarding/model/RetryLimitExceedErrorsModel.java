package p341ge.bog.sso_client.onboarding.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.sso_client.onboarding.model.RetryLimitExceedErrorsModel */
public final class RetryLimitExceedErrorsModel {
    private final List<String> retryLimitExceededErrors;

    public RetryLimitExceedErrorsModel(List<String> list) {
        C41536l.m120489i(list, "retryLimitExceededErrors");
        this.retryLimitExceededErrors = list;
    }

    public static /* synthetic */ RetryLimitExceedErrorsModel copy$default(RetryLimitExceedErrorsModel retryLimitExceedErrorsModel, List<String> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = retryLimitExceedErrorsModel.retryLimitExceededErrors;
        }
        return retryLimitExceedErrorsModel.copy(list);
    }

    public final List<String> component1() {
        return this.retryLimitExceededErrors;
    }

    public final RetryLimitExceedErrorsModel copy(List<String> list) {
        C41536l.m120489i(list, "retryLimitExceededErrors");
        return new RetryLimitExceedErrorsModel(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RetryLimitExceedErrorsModel) && C41536l.m120484d(this.retryLimitExceededErrors, ((RetryLimitExceedErrorsModel) obj).retryLimitExceededErrors);
    }

    public final List<String> getRetryLimitExceededErrors() {
        return this.retryLimitExceededErrors;
    }

    public int hashCode() {
        return this.retryLimitExceededErrors.hashCode();
    }

    public String toString() {
        return "RetryLimitExceedErrorsModel(retryLimitExceededErrors=" + this.retryLimitExceededErrors + ')';
    }
}

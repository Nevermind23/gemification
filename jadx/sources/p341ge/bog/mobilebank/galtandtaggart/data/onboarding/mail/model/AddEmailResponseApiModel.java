package p341ge.bog.mobilebank.galtandtaggart.data.onboarding.mail.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.onboarding.mail.model.AddEmailResponseApiModel */
public final class AddEmailResponseApiModel {
    private final String requestId;

    public AddEmailResponseApiModel(String str) {
        C41536l.m120489i(str, "requestId");
        this.requestId = str;
    }

    public static /* synthetic */ AddEmailResponseApiModel copy$default(AddEmailResponseApiModel addEmailResponseApiModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addEmailResponseApiModel.requestId;
        }
        return addEmailResponseApiModel.copy(str);
    }

    public final String component1() {
        return this.requestId;
    }

    public final AddEmailResponseApiModel copy(String str) {
        C41536l.m120489i(str, "requestId");
        return new AddEmailResponseApiModel(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddEmailResponseApiModel) && C41536l.m120484d(this.requestId, ((AddEmailResponseApiModel) obj).requestId);
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return this.requestId.hashCode();
    }

    public String toString() {
        String str = this.requestId;
        return "AddEmailResponseApiModel(requestId=" + str + ")";
    }
}

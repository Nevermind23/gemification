package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.IdentomatStatusApiModel */
public final class IdentomatStatusApiModel {
    private final String status;

    public IdentomatStatusApiModel(String str) {
        this.status = str;
    }

    public static /* synthetic */ IdentomatStatusApiModel copy$default(IdentomatStatusApiModel identomatStatusApiModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = identomatStatusApiModel.status;
        }
        return identomatStatusApiModel.copy(str);
    }

    public final String component1() {
        return this.status;
    }

    public final IdentomatStatusApiModel copy(String str) {
        return new IdentomatStatusApiModel(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IdentomatStatusApiModel) && C41536l.m120484d(this.status, ((IdentomatStatusApiModel) obj).status);
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.status;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.status;
        return "IdentomatStatusApiModel(status=" + str + ")";
    }
}

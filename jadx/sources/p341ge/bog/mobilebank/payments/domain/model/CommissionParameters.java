package p341ge.bog.mobilebank.payments.domain.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.payments.domain.model.CommissionParameters */
public final class CommissionParameters {
    private final List<KeyValue> essParameters;
    private final String essServiceId;

    public CommissionParameters(List<KeyValue> list, String str) {
        C41536l.m120489i(list, "essParameters");
        C41536l.m120489i(str, "essServiceId");
        this.essParameters = list;
        this.essServiceId = str;
    }

    public static /* synthetic */ CommissionParameters copy$default(CommissionParameters commissionParameters, List<KeyValue> list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = commissionParameters.essParameters;
        }
        if ((i & 2) != 0) {
            str = commissionParameters.essServiceId;
        }
        return commissionParameters.copy(list, str);
    }

    public final List<KeyValue> component1() {
        return this.essParameters;
    }

    public final String component2() {
        return this.essServiceId;
    }

    public final CommissionParameters copy(List<KeyValue> list, String str) {
        C41536l.m120489i(list, "essParameters");
        C41536l.m120489i(str, "essServiceId");
        return new CommissionParameters(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommissionParameters)) {
            return false;
        }
        CommissionParameters commissionParameters = (CommissionParameters) obj;
        return C41536l.m120484d(this.essParameters, commissionParameters.essParameters) && C41536l.m120484d(this.essServiceId, commissionParameters.essServiceId);
    }

    public final List<KeyValue> getEssParameters() {
        return this.essParameters;
    }

    public final String getEssServiceId() {
        return this.essServiceId;
    }

    public int hashCode() {
        return (this.essParameters.hashCode() * 31) + this.essServiceId.hashCode();
    }

    public String toString() {
        List<KeyValue> list = this.essParameters;
        String str = this.essServiceId;
        return "CommissionParameters(essParameters=" + list + ", essServiceId=" + str + ")";
    }
}

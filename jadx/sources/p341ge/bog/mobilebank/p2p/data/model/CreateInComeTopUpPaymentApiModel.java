package p341ge.bog.mobilebank.p2p.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.p2p.data.model.CreateInComeTopUpPaymentApiModel */
public final class CreateInComeTopUpPaymentApiModel {
    private final long opDocKey;
    private final String p2pWebStartUrl;

    public CreateInComeTopUpPaymentApiModel(long j, String str) {
        C41536l.m120489i(str, "p2pWebStartUrl");
        this.opDocKey = j;
        this.p2pWebStartUrl = str;
    }

    public static /* synthetic */ CreateInComeTopUpPaymentApiModel copy$default(CreateInComeTopUpPaymentApiModel createInComeTopUpPaymentApiModel, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = createInComeTopUpPaymentApiModel.opDocKey;
        }
        if ((i & 2) != 0) {
            str = createInComeTopUpPaymentApiModel.p2pWebStartUrl;
        }
        return createInComeTopUpPaymentApiModel.copy(j, str);
    }

    public final long component1() {
        return this.opDocKey;
    }

    public final String component2() {
        return this.p2pWebStartUrl;
    }

    public final CreateInComeTopUpPaymentApiModel copy(long j, String str) {
        C41536l.m120489i(str, "p2pWebStartUrl");
        return new CreateInComeTopUpPaymentApiModel(j, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateInComeTopUpPaymentApiModel)) {
            return false;
        }
        CreateInComeTopUpPaymentApiModel createInComeTopUpPaymentApiModel = (CreateInComeTopUpPaymentApiModel) obj;
        return this.opDocKey == createInComeTopUpPaymentApiModel.opDocKey && C41536l.m120484d(this.p2pWebStartUrl, createInComeTopUpPaymentApiModel.p2pWebStartUrl);
    }

    public final long getOpDocKey() {
        return this.opDocKey;
    }

    public final String getP2pWebStartUrl() {
        return this.p2pWebStartUrl;
    }

    public int hashCode() {
        return (C7397t.m28148a(this.opDocKey) * 31) + this.p2pWebStartUrl.hashCode();
    }

    public String toString() {
        long j = this.opDocKey;
        String str = this.p2pWebStartUrl;
        return "CreateInComeTopUpPaymentApiModel(opDocKey=" + j + ", p2pWebStartUrl=" + str + ")";
    }
}

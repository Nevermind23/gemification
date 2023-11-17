package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.PensionStatusApiModel */
public final class PensionStatusApiModel {
    private final long modificationDate;
    private final String serviceStatus;

    public PensionStatusApiModel(String str, long j) {
        C41536l.m120489i(str, "serviceStatus");
        this.serviceStatus = str;
        this.modificationDate = j;
    }

    public static /* synthetic */ PensionStatusApiModel copy$default(PensionStatusApiModel pensionStatusApiModel, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pensionStatusApiModel.serviceStatus;
        }
        if ((i & 2) != 0) {
            j = pensionStatusApiModel.modificationDate;
        }
        return pensionStatusApiModel.copy(str, j);
    }

    public final String component1() {
        return this.serviceStatus;
    }

    public final long component2() {
        return this.modificationDate;
    }

    public final PensionStatusApiModel copy(String str, long j) {
        C41536l.m120489i(str, "serviceStatus");
        return new PensionStatusApiModel(str, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PensionStatusApiModel)) {
            return false;
        }
        PensionStatusApiModel pensionStatusApiModel = (PensionStatusApiModel) obj;
        return C41536l.m120484d(this.serviceStatus, pensionStatusApiModel.serviceStatus) && this.modificationDate == pensionStatusApiModel.modificationDate;
    }

    public final long getModificationDate() {
        return this.modificationDate;
    }

    public final String getServiceStatus() {
        return this.serviceStatus;
    }

    public int hashCode() {
        return (this.serviceStatus.hashCode() * 31) + C7397t.m28148a(this.modificationDate);
    }

    public String toString() {
        String str = this.serviceStatus;
        long j = this.modificationDate;
        return "PensionStatusApiModel(serviceStatus=" + str + ", modificationDate=" + j + ")";
    }
}

package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.ExtServiceStatusApiModel */
public final class ExtServiceStatusApiModel {
    private final String modificationDate;
    private final String serviceStatus;

    public ExtServiceStatusApiModel(String str, String str2) {
        this.serviceStatus = str;
        this.modificationDate = str2;
    }

    public static /* synthetic */ ExtServiceStatusApiModel copy$default(ExtServiceStatusApiModel extServiceStatusApiModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = extServiceStatusApiModel.serviceStatus;
        }
        if ((i & 2) != 0) {
            str2 = extServiceStatusApiModel.modificationDate;
        }
        return extServiceStatusApiModel.copy(str, str2);
    }

    public final String component1() {
        return this.serviceStatus;
    }

    public final String component2() {
        return this.modificationDate;
    }

    public final ExtServiceStatusApiModel copy(String str, String str2) {
        return new ExtServiceStatusApiModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtServiceStatusApiModel)) {
            return false;
        }
        ExtServiceStatusApiModel extServiceStatusApiModel = (ExtServiceStatusApiModel) obj;
        return C41536l.m120484d(this.serviceStatus, extServiceStatusApiModel.serviceStatus) && C41536l.m120484d(this.modificationDate, extServiceStatusApiModel.modificationDate);
    }

    public final String getModificationDate() {
        return this.modificationDate;
    }

    public final String getServiceStatus() {
        return this.serviceStatus;
    }

    public int hashCode() {
        String str = this.serviceStatus;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.modificationDate;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.serviceStatus;
        String str2 = this.modificationDate;
        return "ExtServiceStatusApiModel(serviceStatus=" + str + ", modificationDate=" + str2 + ")";
    }
}

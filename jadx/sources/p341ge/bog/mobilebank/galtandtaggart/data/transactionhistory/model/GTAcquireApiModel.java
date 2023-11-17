package p341ge.bog.mobilebank.galtandtaggart.data.transactionhistory.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.transactionhistory.model.GTAcquireApiModel */
public final class GTAcquireApiModel {

    /* renamed from: id */
    private final String f61137id;
    private final String name;
    private final String symbol;

    public GTAcquireApiModel(String str, String str2, String str3) {
        this.f61137id = str;
        this.symbol = str2;
        this.name = str3;
    }

    public static /* synthetic */ GTAcquireApiModel copy$default(GTAcquireApiModel gTAcquireApiModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gTAcquireApiModel.f61137id;
        }
        if ((i & 2) != 0) {
            str2 = gTAcquireApiModel.symbol;
        }
        if ((i & 4) != 0) {
            str3 = gTAcquireApiModel.name;
        }
        return gTAcquireApiModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f61137id;
    }

    public final String component2() {
        return this.symbol;
    }

    public final String component3() {
        return this.name;
    }

    public final GTAcquireApiModel copy(String str, String str2, String str3) {
        return new GTAcquireApiModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GTAcquireApiModel)) {
            return false;
        }
        GTAcquireApiModel gTAcquireApiModel = (GTAcquireApiModel) obj;
        return C41536l.m120484d(this.f61137id, gTAcquireApiModel.f61137id) && C41536l.m120484d(this.symbol, gTAcquireApiModel.symbol) && C41536l.m120484d(this.name, gTAcquireApiModel.name);
    }

    public final String getId() {
        return this.f61137id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.f61137id;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f61137id;
        String str2 = this.symbol;
        String str3 = this.name;
        return "GTAcquireApiModel(id=" + str + ", symbol=" + str2 + ", name=" + str3 + ")";
    }
}

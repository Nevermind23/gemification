package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.WatchListCreateResultApiModel */
public final class WatchListCreateResultApiModel {

    /* renamed from: id */
    private final BigDecimal f61135id;
    private final boolean isDefault;
    private final String name;
    private final BigDecimal symbolQuantity;

    public WatchListCreateResultApiModel(BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, boolean z) {
        C41536l.m120489i(bigDecimal, "id");
        this.f61135id = bigDecimal;
        this.name = str;
        this.symbolQuantity = bigDecimal2;
        this.isDefault = z;
    }

    public static /* synthetic */ WatchListCreateResultApiModel copy$default(WatchListCreateResultApiModel watchListCreateResultApiModel, BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = watchListCreateResultApiModel.f61135id;
        }
        if ((i & 2) != 0) {
            str = watchListCreateResultApiModel.name;
        }
        if ((i & 4) != 0) {
            bigDecimal2 = watchListCreateResultApiModel.symbolQuantity;
        }
        if ((i & 8) != 0) {
            z = watchListCreateResultApiModel.isDefault;
        }
        return watchListCreateResultApiModel.copy(bigDecimal, str, bigDecimal2, z);
    }

    public final BigDecimal component1() {
        return this.f61135id;
    }

    public final String component2() {
        return this.name;
    }

    public final BigDecimal component3() {
        return this.symbolQuantity;
    }

    public final boolean component4() {
        return this.isDefault;
    }

    public final WatchListCreateResultApiModel copy(BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, boolean z) {
        C41536l.m120489i(bigDecimal, "id");
        return new WatchListCreateResultApiModel(bigDecimal, str, bigDecimal2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchListCreateResultApiModel)) {
            return false;
        }
        WatchListCreateResultApiModel watchListCreateResultApiModel = (WatchListCreateResultApiModel) obj;
        return C41536l.m120484d(this.f61135id, watchListCreateResultApiModel.f61135id) && C41536l.m120484d(this.name, watchListCreateResultApiModel.name) && C41536l.m120484d(this.symbolQuantity, watchListCreateResultApiModel.symbolQuantity) && this.isDefault == watchListCreateResultApiModel.isDefault;
    }

    public final BigDecimal getId() {
        return this.f61135id;
    }

    public final String getName() {
        return this.name;
    }

    public final BigDecimal getSymbolQuantity() {
        return this.symbolQuantity;
    }

    public int hashCode() {
        int hashCode = this.f61135id.hashCode() * 31;
        String str = this.name;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal = this.symbolQuantity;
        if (bigDecimal != null) {
            i = bigDecimal.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.isDefault;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f61135id;
        String str = this.name;
        BigDecimal bigDecimal2 = this.symbolQuantity;
        boolean z = this.isDefault;
        return "WatchListCreateResultApiModel(id=" + bigDecimal + ", name=" + str + ", symbolQuantity=" + bigDecimal2 + ", isDefault=" + z + ")";
    }
}

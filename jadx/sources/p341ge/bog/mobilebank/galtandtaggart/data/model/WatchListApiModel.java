package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.WatchListApiModel */
public final class WatchListApiModel {

    /* renamed from: id */
    private final BigDecimal f61133id;
    private final String name;
    private final int symbolQuantity;

    public WatchListApiModel(BigDecimal bigDecimal, String str, int i) {
        C41536l.m120489i(bigDecimal, "id");
        C41536l.m120489i(str, "name");
        this.f61133id = bigDecimal;
        this.name = str;
        this.symbolQuantity = i;
    }

    public static /* synthetic */ WatchListApiModel copy$default(WatchListApiModel watchListApiModel, BigDecimal bigDecimal, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bigDecimal = watchListApiModel.f61133id;
        }
        if ((i2 & 2) != 0) {
            str = watchListApiModel.name;
        }
        if ((i2 & 4) != 0) {
            i = watchListApiModel.symbolQuantity;
        }
        return watchListApiModel.copy(bigDecimal, str, i);
    }

    public final BigDecimal component1() {
        return this.f61133id;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.symbolQuantity;
    }

    public final WatchListApiModel copy(BigDecimal bigDecimal, String str, int i) {
        C41536l.m120489i(bigDecimal, "id");
        C41536l.m120489i(str, "name");
        return new WatchListApiModel(bigDecimal, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchListApiModel)) {
            return false;
        }
        WatchListApiModel watchListApiModel = (WatchListApiModel) obj;
        return C41536l.m120484d(this.f61133id, watchListApiModel.f61133id) && C41536l.m120484d(this.name, watchListApiModel.name) && this.symbolQuantity == watchListApiModel.symbolQuantity;
    }

    public final BigDecimal getId() {
        return this.f61133id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSymbolQuantity() {
        return this.symbolQuantity;
    }

    public int hashCode() {
        return (((this.f61133id.hashCode() * 31) + this.name.hashCode()) * 31) + this.symbolQuantity;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f61133id;
        String str = this.name;
        int i = this.symbolQuantity;
        return "WatchListApiModel(id=" + bigDecimal + ", name=" + str + ", symbolQuantity=" + i + ")";
    }
}

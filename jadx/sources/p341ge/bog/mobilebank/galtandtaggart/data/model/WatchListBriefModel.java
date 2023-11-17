package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.WatchListBriefModel */
public final class WatchListBriefModel {

    /* renamed from: id */
    private final BigDecimal f61134id;
    private final String name;

    public WatchListBriefModel(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "id");
        C41536l.m120489i(str, "name");
        this.f61134id = bigDecimal;
        this.name = str;
    }

    public static /* synthetic */ WatchListBriefModel copy$default(WatchListBriefModel watchListBriefModel, BigDecimal bigDecimal, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = watchListBriefModel.f61134id;
        }
        if ((i & 2) != 0) {
            str = watchListBriefModel.name;
        }
        return watchListBriefModel.copy(bigDecimal, str);
    }

    public final BigDecimal component1() {
        return this.f61134id;
    }

    public final String component2() {
        return this.name;
    }

    public final WatchListBriefModel copy(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "id");
        C41536l.m120489i(str, "name");
        return new WatchListBriefModel(bigDecimal, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchListBriefModel)) {
            return false;
        }
        WatchListBriefModel watchListBriefModel = (WatchListBriefModel) obj;
        return C41536l.m120484d(this.f61134id, watchListBriefModel.f61134id) && C41536l.m120484d(this.name, watchListBriefModel.name);
    }

    public final BigDecimal getId() {
        return this.f61134id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.f61134id.hashCode() * 31) + this.name.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.f61134id;
        String str = this.name;
        return "WatchListBriefModel(id=" + bigDecimal + ", name=" + str + ")";
    }
}

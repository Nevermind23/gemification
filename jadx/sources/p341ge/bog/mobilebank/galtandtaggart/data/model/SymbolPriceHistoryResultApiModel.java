package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.SymbolPriceHistoryResultApiModel */
public final class SymbolPriceHistoryResultApiModel {
    private final List<SymbolPriceHistoryApiModel> data;

    public SymbolPriceHistoryResultApiModel(List<SymbolPriceHistoryApiModel> list) {
        C41536l.m120489i(list, "data");
        this.data = list;
    }

    public static /* synthetic */ SymbolPriceHistoryResultApiModel copy$default(SymbolPriceHistoryResultApiModel symbolPriceHistoryResultApiModel, List<SymbolPriceHistoryApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = symbolPriceHistoryResultApiModel.data;
        }
        return symbolPriceHistoryResultApiModel.copy(list);
    }

    public final List<SymbolPriceHistoryApiModel> component1() {
        return this.data;
    }

    public final SymbolPriceHistoryResultApiModel copy(List<SymbolPriceHistoryApiModel> list) {
        C41536l.m120489i(list, "data");
        return new SymbolPriceHistoryResultApiModel(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SymbolPriceHistoryResultApiModel) && C41536l.m120484d(this.data, ((SymbolPriceHistoryResultApiModel) obj).data);
    }

    public final List<SymbolPriceHistoryApiModel> getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        List<SymbolPriceHistoryApiModel> list = this.data;
        return "SymbolPriceHistoryResultApiModel(data=" + list + ")";
    }
}

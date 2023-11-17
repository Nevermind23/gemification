package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.SymbolHistoryDataContainerApiModel */
public final class SymbolHistoryDataContainerApiModel {
    private final List<SymbolHistoryDataItemApiModel> data;

    public SymbolHistoryDataContainerApiModel(List<SymbolHistoryDataItemApiModel> list) {
        C41536l.m120489i(list, "data");
        this.data = list;
    }

    public static /* synthetic */ SymbolHistoryDataContainerApiModel copy$default(SymbolHistoryDataContainerApiModel symbolHistoryDataContainerApiModel, List<SymbolHistoryDataItemApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = symbolHistoryDataContainerApiModel.data;
        }
        return symbolHistoryDataContainerApiModel.copy(list);
    }

    public final List<SymbolHistoryDataItemApiModel> component1() {
        return this.data;
    }

    public final SymbolHistoryDataContainerApiModel copy(List<SymbolHistoryDataItemApiModel> list) {
        C41536l.m120489i(list, "data");
        return new SymbolHistoryDataContainerApiModel(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SymbolHistoryDataContainerApiModel) && C41536l.m120484d(this.data, ((SymbolHistoryDataContainerApiModel) obj).data);
    }

    public final List<SymbolHistoryDataItemApiModel> getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        List<SymbolHistoryDataItemApiModel> list = this.data;
        return "SymbolHistoryDataContainerApiModel(data=" + list + ")";
    }
}

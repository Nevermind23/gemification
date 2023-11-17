package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.WatchListSymbolsDataApiModel */
public final class WatchListSymbolsDataApiModel {
    private final List<WatchListSymbolApiModel> instruments;

    public WatchListSymbolsDataApiModel(List<WatchListSymbolApiModel> list) {
        C41536l.m120489i(list, "instruments");
        this.instruments = list;
    }

    public static /* synthetic */ WatchListSymbolsDataApiModel copy$default(WatchListSymbolsDataApiModel watchListSymbolsDataApiModel, List<WatchListSymbolApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = watchListSymbolsDataApiModel.instruments;
        }
        return watchListSymbolsDataApiModel.copy(list);
    }

    public final List<WatchListSymbolApiModel> component1() {
        return this.instruments;
    }

    public final WatchListSymbolsDataApiModel copy(List<WatchListSymbolApiModel> list) {
        C41536l.m120489i(list, "instruments");
        return new WatchListSymbolsDataApiModel(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WatchListSymbolsDataApiModel) && C41536l.m120484d(this.instruments, ((WatchListSymbolsDataApiModel) obj).instruments);
    }

    public final List<WatchListSymbolApiModel> getInstruments() {
        return this.instruments;
    }

    public int hashCode() {
        return this.instruments.hashCode();
    }

    public String toString() {
        List<WatchListSymbolApiModel> list = this.instruments;
        return "WatchListSymbolsDataApiModel(instruments=" + list + ")";
    }
}

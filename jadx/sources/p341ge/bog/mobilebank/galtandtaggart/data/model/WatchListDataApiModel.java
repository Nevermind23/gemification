package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.WatchListDataApiModel */
public final class WatchListDataApiModel {
    private final List<WatchListApiModel> watchlists;

    public WatchListDataApiModel(List<WatchListApiModel> list) {
        C41536l.m120489i(list, "watchlists");
        this.watchlists = list;
    }

    public static /* synthetic */ WatchListDataApiModel copy$default(WatchListDataApiModel watchListDataApiModel, List<WatchListApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = watchListDataApiModel.watchlists;
        }
        return watchListDataApiModel.copy(list);
    }

    public final List<WatchListApiModel> component1() {
        return this.watchlists;
    }

    public final WatchListDataApiModel copy(List<WatchListApiModel> list) {
        C41536l.m120489i(list, "watchlists");
        return new WatchListDataApiModel(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WatchListDataApiModel) && C41536l.m120484d(this.watchlists, ((WatchListDataApiModel) obj).watchlists);
    }

    public final List<WatchListApiModel> getWatchlists() {
        return this.watchlists;
    }

    public int hashCode() {
        return this.watchlists.hashCode();
    }

    public String toString() {
        List<WatchListApiModel> list = this.watchlists;
        return "WatchListDataApiModel(watchlists=" + list + ")";
    }
}

package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.SearchSymbolResultApiModel */
public final class SearchSymbolResultApiModel {
    private final List<SearchSymbolArrayApiModel> assets;

    public SearchSymbolResultApiModel(List<SearchSymbolArrayApiModel> list) {
        C41536l.m120489i(list, "assets");
        this.assets = list;
    }

    public static /* synthetic */ SearchSymbolResultApiModel copy$default(SearchSymbolResultApiModel searchSymbolResultApiModel, List<SearchSymbolArrayApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchSymbolResultApiModel.assets;
        }
        return searchSymbolResultApiModel.copy(list);
    }

    public final List<SearchSymbolArrayApiModel> component1() {
        return this.assets;
    }

    public final SearchSymbolResultApiModel copy(List<SearchSymbolArrayApiModel> list) {
        C41536l.m120489i(list, "assets");
        return new SearchSymbolResultApiModel(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchSymbolResultApiModel) && C41536l.m120484d(this.assets, ((SearchSymbolResultApiModel) obj).assets);
    }

    public final List<SearchSymbolArrayApiModel> getAssets() {
        return this.assets;
    }

    public int hashCode() {
        return this.assets.hashCode();
    }

    public String toString() {
        List<SearchSymbolArrayApiModel> list = this.assets;
        return "SearchSymbolResultApiModel(assets=" + list + ")";
    }
}

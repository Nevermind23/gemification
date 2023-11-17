package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.SearchSymbolArrayApiModel */
public final class SearchSymbolArrayApiModel {
    private final String currency;
    private final String image;
    private final List<WatchListBriefModel> inMyWatchlists;
    private final BigDecimal mktPrice;
    private final String name;
    private final BigDecimal priorClose;
    private final String symbol;

    public SearchSymbolArrayApiModel(String str, String str2, BigDecimal bigDecimal, String str3, BigDecimal bigDecimal2, List<WatchListBriefModel> list, String str4) {
        C41536l.m120489i(str, "symbol");
        C41536l.m120489i(str2, "name");
        C41536l.m120489i(str3, "currency");
        this.symbol = str;
        this.name = str2;
        this.mktPrice = bigDecimal;
        this.currency = str3;
        this.priorClose = bigDecimal2;
        this.inMyWatchlists = list;
        this.image = str4;
    }

    public static /* synthetic */ SearchSymbolArrayApiModel copy$default(SearchSymbolArrayApiModel searchSymbolArrayApiModel, String str, String str2, BigDecimal bigDecimal, String str3, BigDecimal bigDecimal2, List<WatchListBriefModel> list, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchSymbolArrayApiModel.symbol;
        }
        if ((i & 2) != 0) {
            str2 = searchSymbolArrayApiModel.name;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            bigDecimal = searchSymbolArrayApiModel.mktPrice;
        }
        BigDecimal bigDecimal3 = bigDecimal;
        if ((i & 8) != 0) {
            str3 = searchSymbolArrayApiModel.currency;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            bigDecimal2 = searchSymbolArrayApiModel.priorClose;
        }
        BigDecimal bigDecimal4 = bigDecimal2;
        if ((i & 32) != 0) {
            list = searchSymbolArrayApiModel.inMyWatchlists;
        }
        List<WatchListBriefModel> list2 = list;
        if ((i & 64) != 0) {
            str4 = searchSymbolArrayApiModel.image;
        }
        return searchSymbolArrayApiModel.copy(str, str5, bigDecimal3, str6, bigDecimal4, list2, str4);
    }

    public final String component1() {
        return this.symbol;
    }

    public final String component2() {
        return this.name;
    }

    public final BigDecimal component3() {
        return this.mktPrice;
    }

    public final String component4() {
        return this.currency;
    }

    public final BigDecimal component5() {
        return this.priorClose;
    }

    public final List<WatchListBriefModel> component6() {
        return this.inMyWatchlists;
    }

    public final String component7() {
        return this.image;
    }

    public final SearchSymbolArrayApiModel copy(String str, String str2, BigDecimal bigDecimal, String str3, BigDecimal bigDecimal2, List<WatchListBriefModel> list, String str4) {
        C41536l.m120489i(str, "symbol");
        C41536l.m120489i(str2, "name");
        C41536l.m120489i(str3, "currency");
        return new SearchSymbolArrayApiModel(str, str2, bigDecimal, str3, bigDecimal2, list, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSymbolArrayApiModel)) {
            return false;
        }
        SearchSymbolArrayApiModel searchSymbolArrayApiModel = (SearchSymbolArrayApiModel) obj;
        return C41536l.m120484d(this.symbol, searchSymbolArrayApiModel.symbol) && C41536l.m120484d(this.name, searchSymbolArrayApiModel.name) && C41536l.m120484d(this.mktPrice, searchSymbolArrayApiModel.mktPrice) && C41536l.m120484d(this.currency, searchSymbolArrayApiModel.currency) && C41536l.m120484d(this.priorClose, searchSymbolArrayApiModel.priorClose) && C41536l.m120484d(this.inMyWatchlists, searchSymbolArrayApiModel.inMyWatchlists) && C41536l.m120484d(this.image, searchSymbolArrayApiModel.image);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getImage() {
        return this.image;
    }

    public final List<WatchListBriefModel> getInMyWatchlists() {
        return this.inMyWatchlists;
    }

    public final BigDecimal getMktPrice() {
        return this.mktPrice;
    }

    public final String getName() {
        return this.name;
    }

    public final BigDecimal getPriorClose() {
        return this.priorClose;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        int hashCode = ((this.symbol.hashCode() * 31) + this.name.hashCode()) * 31;
        BigDecimal bigDecimal = this.mktPrice;
        int i = 0;
        int hashCode2 = (((hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.currency.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.priorClose;
        int hashCode3 = (hashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        List<WatchListBriefModel> list = this.inMyWatchlists;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.image;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.symbol;
        String str2 = this.name;
        BigDecimal bigDecimal = this.mktPrice;
        String str3 = this.currency;
        BigDecimal bigDecimal2 = this.priorClose;
        List<WatchListBriefModel> list = this.inMyWatchlists;
        String str4 = this.image;
        return "SearchSymbolArrayApiModel(symbol=" + str + ", name=" + str2 + ", mktPrice=" + bigDecimal + ", currency=" + str3 + ", priorClose=" + bigDecimal2 + ", inMyWatchlists=" + list + ", image=" + str4 + ")";
    }
}

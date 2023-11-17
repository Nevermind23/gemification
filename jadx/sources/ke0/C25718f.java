package ke0;

import g91.C32343x;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.galtandtaggart.data.model.GTMarketInfoApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.SearchSymbolArrayApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.SearchSymbolResultApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.WatchListBriefModel;
import xe0.C29752j;

/* renamed from: ke0.f */
public final class C25718f {
    /* renamed from: a */
    public final GTMarketInfoApiModel mo64290a(GTMarketInfoApiModel gTMarketInfoApiModel) {
        C41536l.m120489i(gTMarketInfoApiModel, "gtMarketInfoApiModel");
        return gTMarketInfoApiModel;
    }

    /* renamed from: b */
    public final List mo64291b(SearchSymbolResultApiModel searchSymbolResultApiModel) {
        ArrayList arrayList;
        C41536l.m120489i(searchSymbolResultApiModel, "searchSymbolResult");
        List<SearchSymbolArrayApiModel> assets = searchSymbolResultApiModel.getAssets();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(assets, 10));
        for (SearchSymbolArrayApiModel searchSymbolArrayApiModel : assets) {
            String symbol = searchSymbolArrayApiModel.getSymbol();
            String name = searchSymbolArrayApiModel.getName();
            BigDecimal mktPrice = searchSymbolArrayApiModel.getMktPrice();
            if (mktPrice == null) {
                mktPrice = BigDecimal.valueOf(0);
                C41536l.m120488h(mktPrice, "valueOf(this.toLong())");
            }
            String P = C32343x.m95408P(mktPrice, searchSymbolArrayApiModel.getCurrency());
            BigDecimal mktPrice2 = searchSymbolArrayApiModel.getMktPrice();
            if (mktPrice2 == null) {
                mktPrice2 = BigDecimal.valueOf(0);
                C41536l.m120488h(mktPrice2, "valueOf(this.toLong())");
            }
            BigDecimal priorClose = searchSymbolArrayApiModel.getPriorClose();
            if (priorClose == null) {
                priorClose = BigDecimal.valueOf(0);
                C41536l.m120488h(priorClose, "valueOf(this.toLong())");
            }
            BigDecimal a = C25721i.m80955a(mktPrice2, priorClose);
            List<WatchListBriefModel> inMyWatchlists = searchSymbolArrayApiModel.getInMyWatchlists();
            if (inMyWatchlists != null) {
                ArrayList arrayList3 = new ArrayList(C41343r.m119925u(inMyWatchlists, 10));
                for (WatchListBriefModel id : inMyWatchlists) {
                    arrayList3.add(id.getId());
                }
                arrayList = arrayList3;
            } else {
                arrayList = C41341q.m119907j();
            }
            arrayList2.add(new C29752j(symbol, name, P, a, arrayList, searchSymbolArrayApiModel.getImage()));
        }
        return arrayList2;
    }
}

package ke0;

import g91.C32343x;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.galtandtaggart.data.model.WatchListApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.WatchListCreateResultApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.WatchListDataApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.WatchListSymbolApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.WatchListSymbolsDataApiModel;
import p341ge.bog.mobilebank.galtandtaggart.domain.model.WatchList;
import xe0.C29759q;
import xe0.C29760r;

/* renamed from: ke0.j */
public final class C25722j {
    /* renamed from: a */
    public final WatchList mo64297a(WatchListCreateResultApiModel watchListCreateResultApiModel) {
        int i;
        C41536l.m120489i(watchListCreateResultApiModel, "apiModel");
        BigDecimal id = watchListCreateResultApiModel.getId();
        String name = watchListCreateResultApiModel.getName();
        if (name == null) {
            name = "";
        }
        BigDecimal symbolQuantity = watchListCreateResultApiModel.getSymbolQuantity();
        if (symbolQuantity != null) {
            i = symbolQuantity.intValue();
        } else {
            i = 0;
        }
        return new WatchList(id, name, i);
    }

    /* renamed from: b */
    public final List mo64298b(WatchListDataApiModel watchListDataApiModel) {
        C41536l.m120489i(watchListDataApiModel, "apiModel");
        List<WatchListApiModel> watchlists = watchListDataApiModel.getWatchlists();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(watchlists, 10));
        for (WatchListApiModel watchListApiModel : watchlists) {
            arrayList.add(new WatchList(watchListApiModel.getId(), watchListApiModel.getName(), watchListApiModel.getSymbolQuantity()));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final List mo64299c(WatchListSymbolsDataApiModel watchListSymbolsDataApiModel) {
        C41536l.m120489i(watchListSymbolsDataApiModel, "apiModel");
        List<WatchListSymbolApiModel> instruments = watchListSymbolsDataApiModel.getInstruments();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(instruments, 10));
        for (WatchListSymbolApiModel watchListSymbolApiModel : instruments) {
            arrayList.add(new C29760r(watchListSymbolApiModel.getSymbol(), watchListSymbolApiModel.getSymbolType(), watchListSymbolApiModel.getSecurityName(), C32343x.m95408P(watchListSymbolApiModel.getMarketValue(), "USD"), C25721i.m80955a(watchListSymbolApiModel.getMarketValue(), watchListSymbolApiModel.getPriorClose()), watchListSymbolApiModel.getImage(), (C29759q) null, 64, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }
}

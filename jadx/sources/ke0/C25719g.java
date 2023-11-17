package ke0;

import com.github.mikephil.charting.utils.Utils;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.galtandtaggart.data.model.CalculateTradeDataApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.ClientPositionApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.FundamentalDataApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.FundamentalDataContainerApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.ShareStatus;
import p341ge.bog.mobilebank.galtandtaggart.data.model.ShareSymbolMetaDataApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.ShareSymbolOnlineDataApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.ShareSymbolOnlineMinimizedDataApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.SymbolHistoryDataContainerApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.SymbolHistoryDataItemApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.WatchListApiModel;
import xe0.C29745c;
import xe0.C29747e;
import xe0.C29750h;
import xe0.C29755m;
import xe0.C29756n;
import xe0.C29757o;
import xe0.C29758p;

/* renamed from: ke0.g */
public final class C25719g {

    /* renamed from: a */
    private final SimpleDateFormat f65485a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    /* renamed from: c */
    private final C29747e m80946c(ClientPositionApiModel clientPositionApiModel) {
        return new C29747e(clientPositionApiModel.getOpenQty(), clientPositionApiModel.getAvgPrice(), clientPositionApiModel.getUnrealizedPL(), clientPositionApiModel.getMarketValue());
    }

    /* renamed from: e */
    private final C29755m m80947e(FundamentalDataContainerApiModel fundamentalDataContainerApiModel) {
        String str;
        String str2;
        if (fundamentalDataContainerApiModel == null) {
            return null;
        }
        FundamentalDataApiModel fundamentalDataModel = fundamentalDataContainerApiModel.getFundamentalDataModel();
        C41536l.m120486f(fundamentalDataModel);
        String b = C25720h.m80954b(fundamentalDataModel.getMarketCap(), true, false, 2, (Object) null);
        String b2 = C25720h.m80954b(fundamentalDataModel.getOpenPrice(), true, false, 2, (Object) null);
        String b3 = C25720h.m80954b(fundamentalDataContainerApiModel.getClosePrior(), true, false, 2, (Object) null);
        String b4 = C25720h.m80954b(fundamentalDataModel.getAskPrice(), true, false, 2, (Object) null);
        String b5 = C25720h.m80954b(fundamentalDataModel.getPeRatio(), false, false, 3, (Object) null);
        String b6 = C25720h.m80954b(fundamentalDataModel.getBidPrice(), true, false, 2, (Object) null);
        String b7 = C25720h.m80954b(fundamentalDataModel.getEarningsPerShare(), true, false, 2, (Object) null);
        String str3 = C25720h.m80954b(fundamentalDataModel.getHighPrice(), true, false, 2, (Object) null) + " - " + C25720h.m80954b(fundamentalDataModel.getLowPrice(), true, false, 2, (Object) null);
        String str4 = C25720h.m80954b(fundamentalDataModel.getFiftyTwoWeekHighPrice(), true, false, 2, (Object) null) + " - " + C25720h.m80954b(fundamentalDataModel.getFiftyTwoWeekLowPrice(), true, false, 2, (Object) null);
        String str5 = C25720h.m80954b(fundamentalDataModel.getDividend(), true, false, 2, (Object) null) + " (" + C25720h.m80954b(fundamentalDataModel.getDividendYield(), false, false, 3, (Object) null) + "%)";
        String b8 = C25720h.m80954b(fundamentalDataModel.getVolumeMovingAverage10Day(), false, true, 1, (Object) null);
        String pbRatio = fundamentalDataModel.getPbRatio();
        if (pbRatio == null) {
            str = "0.00";
        } else {
            str = pbRatio;
        }
        String bookValuePerShare = fundamentalDataModel.getBookValuePerShare();
        if (bookValuePerShare == null) {
            str2 = "0.00";
        } else {
            str2 = bookValuePerShare;
        }
        return new C29755m(b, b2, b3, b4, b5, b6, b7, str3, str4, str5, b8, str, str2, C25720h.m80954b(fundamentalDataModel.getSharesOutstanding(), false, true, 1, (Object) null));
    }

    /* renamed from: a */
    public final List mo64292a(SymbolHistoryDataContainerApiModel symbolHistoryDataContainerApiModel) {
        Date date;
        C41536l.m120489i(symbolHistoryDataContainerApiModel, "symbolHistory");
        List<SymbolHistoryDataItemApiModel> data = symbolHistoryDataContainerApiModel.getData();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(data, 10));
        for (SymbolHistoryDataItemApiModel symbolHistoryDataItemApiModel : data) {
            try {
                date = this.f65485a.parse(symbolHistoryDataItemApiModel.getDate());
            } catch (Exception unused) {
                date = new Date();
            }
            Date date2 = date;
            C41536l.m120488h(date2, "try {\n                  …e()\n                    }");
            arrayList.add(new C29758p(date2, symbolHistoryDataItemApiModel.getOpen(), symbolHistoryDataItemApiModel.getHigh(), symbolHistoryDataItemApiModel.getLow(), symbolHistoryDataItemApiModel.getClose(), symbolHistoryDataItemApiModel.getVolume()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C29745c mo64293b(CalculateTradeDataApiModel calculateTradeDataApiModel) {
        C41536l.m120489i(calculateTradeDataApiModel, "calculateTradeDataApiModel");
        return new C29745c(calculateTradeDataApiModel.getAmount(), calculateTradeDataApiModel.getAmountCurrency(), calculateTradeDataApiModel.getFee(), calculateTradeDataApiModel.getFeeCurrency(), calculateTradeDataApiModel.getQuantity(), calculateTradeDataApiModel.getOpUniqueId(), calculateTradeDataApiModel.getPrice());
    }

    /* renamed from: d */
    public final C29750h mo64294d(ShareSymbolOnlineMinimizedDataApiModel shareSymbolOnlineMinimizedDataApiModel) {
        C41536l.m120489i(shareSymbolOnlineMinimizedDataApiModel, "minimizedDataApiModel");
        return new C29750h(shareSymbolOnlineMinimizedDataApiModel.getMktPrice(), shareSymbolOnlineMinimizedDataApiModel.getCurrency(), C25721i.m80955a(shareSymbolOnlineMinimizedDataApiModel.getMktPrice(), shareSymbolOnlineMinimizedDataApiModel.getPriorClose()));
    }

    /* renamed from: f */
    public final C29756n mo64295f(ShareSymbolMetaDataApiModel shareSymbolMetaDataApiModel) {
        C29747e eVar;
        ArrayList arrayList;
        C41536l.m120489i(shareSymbolMetaDataApiModel, "shareMetaData");
        String name = shareSymbolMetaDataApiModel.getName();
        String currency = shareSymbolMetaDataApiModel.getCurrency();
        String info = shareSymbolMetaDataApiModel.getInfo();
        if (shareSymbolMetaDataApiModel.getClientPosition() != null) {
            eVar = m80946c(shareSymbolMetaDataApiModel.getClientPosition());
        } else {
            eVar = null;
        }
        C29747e eVar2 = eVar;
        ShareStatus status = shareSymbolMetaDataApiModel.getStatus();
        List<WatchListApiModel> inMyWatchlists = shareSymbolMetaDataApiModel.getInMyWatchlists();
        if (inMyWatchlists != null) {
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(inMyWatchlists, 10));
            for (WatchListApiModel id : inMyWatchlists) {
                arrayList2.add(id.getId());
            }
            arrayList = arrayList2;
        } else {
            arrayList = C41341q.m119907j();
        }
        return new C29756n(name, currency, info, eVar2, status, arrayList);
    }

    /* renamed from: g */
    public final C29757o mo64296g(ShareSymbolOnlineDataApiModel shareSymbolOnlineDataApiModel) {
        double d;
        String str;
        C29755m mVar;
        C41536l.m120489i(shareSymbolOnlineDataApiModel, "shareOnlineData");
        BigDecimal a = C25721i.m80955a(shareSymbolOnlineDataApiModel.getMktPrice(), shareSymbolOnlineDataApiModel.getPriorClose());
        BigDecimal mktPrice = shareSymbolOnlineDataApiModel.getMktPrice();
        if (mktPrice != null) {
            d = mktPrice.doubleValue();
        } else {
            d = Utils.DOUBLE_EPSILON;
        }
        FundamentalDataContainerApiModel fundamentals = shareSymbolOnlineDataApiModel.getFundamentals();
        if (fundamentals != null) {
            str = fundamentals.getImage();
        } else {
            str = null;
        }
        if (shareSymbolOnlineDataApiModel.getFundamentals() != null) {
            mVar = m80947e(shareSymbolOnlineDataApiModel.getFundamentals());
        } else {
            mVar = null;
        }
        return new C29757o(a, d, str, mVar);
    }
}

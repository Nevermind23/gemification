package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.ShareSymbolMetaDataApiModel */
public final class ShareSymbolMetaDataApiModel {
    private final ClientPositionApiModel clientPosition;
    private final String currency;
    private final Object fundamentals;

    /* renamed from: id */
    private final String f61131id;
    private final List<WatchListApiModel> inMyWatchlists;
    private final String info;
    private final Object mktPrice;
    private final String name;
    private final String priorClose;
    private final ShareStatus status;
    private final String symbol;
    private final String symbolType;

    public ShareSymbolMetaDataApiModel(String str, String str2, String str3, String str4, ShareStatus shareStatus, Object obj, String str5, String str6, String str7, List<WatchListApiModel> list, ClientPositionApiModel clientPositionApiModel, Object obj2) {
        C41536l.m120489i(str4, "name");
        C41536l.m120489i(str5, "currency");
        this.f61131id = str;
        this.symbol = str2;
        this.symbolType = str3;
        this.name = str4;
        this.status = shareStatus;
        this.mktPrice = obj;
        this.currency = str5;
        this.priorClose = str6;
        this.info = str7;
        this.inMyWatchlists = list;
        this.clientPosition = clientPositionApiModel;
        this.fundamentals = obj2;
    }

    public static /* synthetic */ ShareSymbolMetaDataApiModel copy$default(ShareSymbolMetaDataApiModel shareSymbolMetaDataApiModel, String str, String str2, String str3, String str4, ShareStatus shareStatus, Object obj, String str5, String str6, String str7, List list, ClientPositionApiModel clientPositionApiModel, Object obj2, int i, Object obj3) {
        ShareSymbolMetaDataApiModel shareSymbolMetaDataApiModel2 = shareSymbolMetaDataApiModel;
        int i2 = i;
        return shareSymbolMetaDataApiModel.copy((i2 & 1) != 0 ? shareSymbolMetaDataApiModel2.f61131id : str, (i2 & 2) != 0 ? shareSymbolMetaDataApiModel2.symbol : str2, (i2 & 4) != 0 ? shareSymbolMetaDataApiModel2.symbolType : str3, (i2 & 8) != 0 ? shareSymbolMetaDataApiModel2.name : str4, (i2 & 16) != 0 ? shareSymbolMetaDataApiModel2.status : shareStatus, (i2 & 32) != 0 ? shareSymbolMetaDataApiModel2.mktPrice : obj, (i2 & 64) != 0 ? shareSymbolMetaDataApiModel2.currency : str5, (i2 & 128) != 0 ? shareSymbolMetaDataApiModel2.priorClose : str6, (i2 & C11398b.f33139r) != 0 ? shareSymbolMetaDataApiModel2.info : str7, (i2 & C11398b.f33140s) != 0 ? shareSymbolMetaDataApiModel2.inMyWatchlists : list, (i2 & C11398b.f33141t) != 0 ? shareSymbolMetaDataApiModel2.clientPosition : clientPositionApiModel, (i2 & C11398b.f33142u) != 0 ? shareSymbolMetaDataApiModel2.fundamentals : obj2);
    }

    public final String component1() {
        return this.f61131id;
    }

    public final List<WatchListApiModel> component10() {
        return this.inMyWatchlists;
    }

    public final ClientPositionApiModel component11() {
        return this.clientPosition;
    }

    public final Object component12() {
        return this.fundamentals;
    }

    public final String component2() {
        return this.symbol;
    }

    public final String component3() {
        return this.symbolType;
    }

    public final String component4() {
        return this.name;
    }

    public final ShareStatus component5() {
        return this.status;
    }

    public final Object component6() {
        return this.mktPrice;
    }

    public final String component7() {
        return this.currency;
    }

    public final String component8() {
        return this.priorClose;
    }

    public final String component9() {
        return this.info;
    }

    public final ShareSymbolMetaDataApiModel copy(String str, String str2, String str3, String str4, ShareStatus shareStatus, Object obj, String str5, String str6, String str7, List<WatchListApiModel> list, ClientPositionApiModel clientPositionApiModel, Object obj2) {
        String str8 = str4;
        C41536l.m120489i(str8, "name");
        String str9 = str5;
        C41536l.m120489i(str9, "currency");
        return new ShareSymbolMetaDataApiModel(str, str2, str3, str8, shareStatus, obj, str9, str6, str7, list, clientPositionApiModel, obj2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareSymbolMetaDataApiModel)) {
            return false;
        }
        ShareSymbolMetaDataApiModel shareSymbolMetaDataApiModel = (ShareSymbolMetaDataApiModel) obj;
        return C41536l.m120484d(this.f61131id, shareSymbolMetaDataApiModel.f61131id) && C41536l.m120484d(this.symbol, shareSymbolMetaDataApiModel.symbol) && C41536l.m120484d(this.symbolType, shareSymbolMetaDataApiModel.symbolType) && C41536l.m120484d(this.name, shareSymbolMetaDataApiModel.name) && this.status == shareSymbolMetaDataApiModel.status && C41536l.m120484d(this.mktPrice, shareSymbolMetaDataApiModel.mktPrice) && C41536l.m120484d(this.currency, shareSymbolMetaDataApiModel.currency) && C41536l.m120484d(this.priorClose, shareSymbolMetaDataApiModel.priorClose) && C41536l.m120484d(this.info, shareSymbolMetaDataApiModel.info) && C41536l.m120484d(this.inMyWatchlists, shareSymbolMetaDataApiModel.inMyWatchlists) && C41536l.m120484d(this.clientPosition, shareSymbolMetaDataApiModel.clientPosition) && C41536l.m120484d(this.fundamentals, shareSymbolMetaDataApiModel.fundamentals);
    }

    public final ClientPositionApiModel getClientPosition() {
        return this.clientPosition;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Object getFundamentals() {
        return this.fundamentals;
    }

    public final String getId() {
        return this.f61131id;
    }

    public final List<WatchListApiModel> getInMyWatchlists() {
        return this.inMyWatchlists;
    }

    public final String getInfo() {
        return this.info;
    }

    public final Object getMktPrice() {
        return this.mktPrice;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPriorClose() {
        return this.priorClose;
    }

    public final ShareStatus getStatus() {
        return this.status;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getSymbolType() {
        return this.symbolType;
    }

    public int hashCode() {
        String str = this.f61131id;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.symbolType;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.name.hashCode()) * 31;
        ShareStatus shareStatus = this.status;
        int hashCode4 = (hashCode3 + (shareStatus == null ? 0 : shareStatus.hashCode())) * 31;
        Object obj = this.mktPrice;
        int hashCode5 = (((hashCode4 + (obj == null ? 0 : obj.hashCode())) * 31) + this.currency.hashCode()) * 31;
        String str4 = this.priorClose;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.info;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<WatchListApiModel> list = this.inMyWatchlists;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        ClientPositionApiModel clientPositionApiModel = this.clientPosition;
        int hashCode9 = (hashCode8 + (clientPositionApiModel == null ? 0 : clientPositionApiModel.hashCode())) * 31;
        Object obj2 = this.fundamentals;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode9 + i;
    }

    public String toString() {
        String str = this.f61131id;
        String str2 = this.symbol;
        String str3 = this.symbolType;
        String str4 = this.name;
        ShareStatus shareStatus = this.status;
        Object obj = this.mktPrice;
        String str5 = this.currency;
        String str6 = this.priorClose;
        String str7 = this.info;
        List<WatchListApiModel> list = this.inMyWatchlists;
        ClientPositionApiModel clientPositionApiModel = this.clientPosition;
        Object obj2 = this.fundamentals;
        return "ShareSymbolMetaDataApiModel(id=" + str + ", symbol=" + str2 + ", symbolType=" + str3 + ", name=" + str4 + ", status=" + shareStatus + ", mktPrice=" + obj + ", currency=" + str5 + ", priorClose=" + str6 + ", info=" + str7 + ", inMyWatchlists=" + list + ", clientPosition=" + clientPositionApiModel + ", fundamentals=" + obj2 + ")";
    }
}

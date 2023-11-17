package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.ShareSymbolOnlineDataApiModel */
public final class ShareSymbolOnlineDataApiModel {
    private final Object clientPosition;
    private final String currency;
    private final FundamentalDataContainerApiModel fundamentals;

    /* renamed from: id */
    private final String f61132id;
    private final List<Object> inMyWatchlists;
    private final String info;
    private final BigDecimal mktPrice;
    private final String name;
    private final BigDecimal priorClose;
    private final String status;
    private final String symbol;
    private final String symbolType;

    public ShareSymbolOnlineDataApiModel(String str, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, String str6, BigDecimal bigDecimal2, String str7, List<? extends Object> list, Object obj, FundamentalDataContainerApiModel fundamentalDataContainerApiModel) {
        this.f61132id = str;
        this.symbol = str2;
        this.symbolType = str3;
        this.name = str4;
        this.status = str5;
        this.mktPrice = bigDecimal;
        this.currency = str6;
        this.priorClose = bigDecimal2;
        this.info = str7;
        this.inMyWatchlists = list;
        this.clientPosition = obj;
        this.fundamentals = fundamentalDataContainerApiModel;
    }

    public static /* synthetic */ ShareSymbolOnlineDataApiModel copy$default(ShareSymbolOnlineDataApiModel shareSymbolOnlineDataApiModel, String str, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, String str6, BigDecimal bigDecimal2, String str7, List list, Object obj, FundamentalDataContainerApiModel fundamentalDataContainerApiModel, int i, Object obj2) {
        ShareSymbolOnlineDataApiModel shareSymbolOnlineDataApiModel2 = shareSymbolOnlineDataApiModel;
        int i2 = i;
        return shareSymbolOnlineDataApiModel.copy((i2 & 1) != 0 ? shareSymbolOnlineDataApiModel2.f61132id : str, (i2 & 2) != 0 ? shareSymbolOnlineDataApiModel2.symbol : str2, (i2 & 4) != 0 ? shareSymbolOnlineDataApiModel2.symbolType : str3, (i2 & 8) != 0 ? shareSymbolOnlineDataApiModel2.name : str4, (i2 & 16) != 0 ? shareSymbolOnlineDataApiModel2.status : str5, (i2 & 32) != 0 ? shareSymbolOnlineDataApiModel2.mktPrice : bigDecimal, (i2 & 64) != 0 ? shareSymbolOnlineDataApiModel2.currency : str6, (i2 & 128) != 0 ? shareSymbolOnlineDataApiModel2.priorClose : bigDecimal2, (i2 & C11398b.f33139r) != 0 ? shareSymbolOnlineDataApiModel2.info : str7, (i2 & C11398b.f33140s) != 0 ? shareSymbolOnlineDataApiModel2.inMyWatchlists : list, (i2 & C11398b.f33141t) != 0 ? shareSymbolOnlineDataApiModel2.clientPosition : obj, (i2 & C11398b.f33142u) != 0 ? shareSymbolOnlineDataApiModel2.fundamentals : fundamentalDataContainerApiModel);
    }

    public final String component1() {
        return this.f61132id;
    }

    public final List<Object> component10() {
        return this.inMyWatchlists;
    }

    public final Object component11() {
        return this.clientPosition;
    }

    public final FundamentalDataContainerApiModel component12() {
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

    public final String component5() {
        return this.status;
    }

    public final BigDecimal component6() {
        return this.mktPrice;
    }

    public final String component7() {
        return this.currency;
    }

    public final BigDecimal component8() {
        return this.priorClose;
    }

    public final String component9() {
        return this.info;
    }

    public final ShareSymbolOnlineDataApiModel copy(String str, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, String str6, BigDecimal bigDecimal2, String str7, List<? extends Object> list, Object obj, FundamentalDataContainerApiModel fundamentalDataContainerApiModel) {
        return new ShareSymbolOnlineDataApiModel(str, str2, str3, str4, str5, bigDecimal, str6, bigDecimal2, str7, list, obj, fundamentalDataContainerApiModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareSymbolOnlineDataApiModel)) {
            return false;
        }
        ShareSymbolOnlineDataApiModel shareSymbolOnlineDataApiModel = (ShareSymbolOnlineDataApiModel) obj;
        return C41536l.m120484d(this.f61132id, shareSymbolOnlineDataApiModel.f61132id) && C41536l.m120484d(this.symbol, shareSymbolOnlineDataApiModel.symbol) && C41536l.m120484d(this.symbolType, shareSymbolOnlineDataApiModel.symbolType) && C41536l.m120484d(this.name, shareSymbolOnlineDataApiModel.name) && C41536l.m120484d(this.status, shareSymbolOnlineDataApiModel.status) && C41536l.m120484d(this.mktPrice, shareSymbolOnlineDataApiModel.mktPrice) && C41536l.m120484d(this.currency, shareSymbolOnlineDataApiModel.currency) && C41536l.m120484d(this.priorClose, shareSymbolOnlineDataApiModel.priorClose) && C41536l.m120484d(this.info, shareSymbolOnlineDataApiModel.info) && C41536l.m120484d(this.inMyWatchlists, shareSymbolOnlineDataApiModel.inMyWatchlists) && C41536l.m120484d(this.clientPosition, shareSymbolOnlineDataApiModel.clientPosition) && C41536l.m120484d(this.fundamentals, shareSymbolOnlineDataApiModel.fundamentals);
    }

    public final Object getClientPosition() {
        return this.clientPosition;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final FundamentalDataContainerApiModel getFundamentals() {
        return this.fundamentals;
    }

    public final String getId() {
        return this.f61132id;
    }

    public final List<Object> getInMyWatchlists() {
        return this.inMyWatchlists;
    }

    public final String getInfo() {
        return this.info;
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

    public final String getStatus() {
        return this.status;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getSymbolType() {
        return this.symbolType;
    }

    public int hashCode() {
        String str = this.f61132id;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.symbolType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.status;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal = this.mktPrice;
        int hashCode6 = (hashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str6 = this.currency;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.priorClose;
        int hashCode8 = (hashCode7 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str7 = this.info;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<Object> list = this.inMyWatchlists;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        Object obj = this.clientPosition;
        int hashCode11 = (hashCode10 + (obj == null ? 0 : obj.hashCode())) * 31;
        FundamentalDataContainerApiModel fundamentalDataContainerApiModel = this.fundamentals;
        if (fundamentalDataContainerApiModel != null) {
            i = fundamentalDataContainerApiModel.hashCode();
        }
        return hashCode11 + i;
    }

    public String toString() {
        String str = this.f61132id;
        String str2 = this.symbol;
        String str3 = this.symbolType;
        String str4 = this.name;
        String str5 = this.status;
        BigDecimal bigDecimal = this.mktPrice;
        String str6 = this.currency;
        BigDecimal bigDecimal2 = this.priorClose;
        String str7 = this.info;
        List<Object> list = this.inMyWatchlists;
        Object obj = this.clientPosition;
        FundamentalDataContainerApiModel fundamentalDataContainerApiModel = this.fundamentals;
        return "ShareSymbolOnlineDataApiModel(id=" + str + ", symbol=" + str2 + ", symbolType=" + str3 + ", name=" + str4 + ", status=" + str5 + ", mktPrice=" + bigDecimal + ", currency=" + str6 + ", priorClose=" + bigDecimal2 + ", info=" + str7 + ", inMyWatchlists=" + list + ", clientPosition=" + obj + ", fundamentals=" + fundamentalDataContainerApiModel + ")";
    }
}

package p341ge.bog.mobilebank.cleanarch.packages.data;

import androidx.annotation.Keep;
import hd0.C24978b;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.packages.data.CrossSellPackageApiModel */
public final class CrossSellPackageApiModel {
    private final String detailDictionaryKey;
    private final String headerDictionaryKey;
    private final String iconUrl;
    private final C24978b showFlag;

    public CrossSellPackageApiModel(String str, String str2, String str3, C24978b bVar) {
        this.headerDictionaryKey = str;
        this.detailDictionaryKey = str2;
        this.iconUrl = str3;
        this.showFlag = bVar;
    }

    public static /* synthetic */ CrossSellPackageApiModel copy$default(CrossSellPackageApiModel crossSellPackageApiModel, String str, String str2, String str3, C24978b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = crossSellPackageApiModel.headerDictionaryKey;
        }
        if ((i & 2) != 0) {
            str2 = crossSellPackageApiModel.detailDictionaryKey;
        }
        if ((i & 4) != 0) {
            str3 = crossSellPackageApiModel.iconUrl;
        }
        if ((i & 8) != 0) {
            bVar = crossSellPackageApiModel.showFlag;
        }
        return crossSellPackageApiModel.copy(str, str2, str3, bVar);
    }

    public final String component1() {
        return this.headerDictionaryKey;
    }

    public final String component2() {
        return this.detailDictionaryKey;
    }

    public final String component3() {
        return this.iconUrl;
    }

    public final C24978b component4() {
        return this.showFlag;
    }

    public final CrossSellPackageApiModel copy(String str, String str2, String str3, C24978b bVar) {
        return new CrossSellPackageApiModel(str, str2, str3, bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrossSellPackageApiModel)) {
            return false;
        }
        CrossSellPackageApiModel crossSellPackageApiModel = (CrossSellPackageApiModel) obj;
        return C41536l.m120484d(this.headerDictionaryKey, crossSellPackageApiModel.headerDictionaryKey) && C41536l.m120484d(this.detailDictionaryKey, crossSellPackageApiModel.detailDictionaryKey) && C41536l.m120484d(this.iconUrl, crossSellPackageApiModel.iconUrl) && this.showFlag == crossSellPackageApiModel.showFlag;
    }

    public final String getDetailDictionaryKey() {
        return this.detailDictionaryKey;
    }

    public final String getHeaderDictionaryKey() {
        return this.headerDictionaryKey;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final C24978b getShowFlag() {
        return this.showFlag;
    }

    public int hashCode() {
        String str = this.headerDictionaryKey;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.detailDictionaryKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C24978b bVar = this.showFlag;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.headerDictionaryKey;
        String str2 = this.detailDictionaryKey;
        String str3 = this.iconUrl;
        C24978b bVar = this.showFlag;
        return "CrossSellPackageApiModel(headerDictionaryKey=" + str + ", detailDictionaryKey=" + str2 + ", iconUrl=" + str3 + ", showFlag=" + bVar + ")";
    }
}

package p341ge.bog.mobilebank.transportcard.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.transportcard.data.model.TransportCardPassTypeApiModel */
public final class TransportCardPassTypeApiModel {
    private final boolean isDefault;
    private final double price;
    private final String title;
    private final String typeCode;
    private final String typeId;

    public TransportCardPassTypeApiModel(String str, double d, String str2, String str3, boolean z) {
        C41536l.m120489i(str, "typeId");
        C41536l.m120489i(str2, "typeCode");
        C41536l.m120489i(str3, "title");
        this.typeId = str;
        this.price = d;
        this.typeCode = str2;
        this.title = str3;
        this.isDefault = z;
    }

    public static /* synthetic */ TransportCardPassTypeApiModel copy$default(TransportCardPassTypeApiModel transportCardPassTypeApiModel, String str, double d, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transportCardPassTypeApiModel.typeId;
        }
        if ((i & 2) != 0) {
            d = transportCardPassTypeApiModel.price;
        }
        double d2 = d;
        if ((i & 4) != 0) {
            str2 = transportCardPassTypeApiModel.typeCode;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = transportCardPassTypeApiModel.title;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            z = transportCardPassTypeApiModel.isDefault;
        }
        return transportCardPassTypeApiModel.copy(str, d2, str4, str5, z);
    }

    public final String component1() {
        return this.typeId;
    }

    public final double component2() {
        return this.price;
    }

    public final String component3() {
        return this.typeCode;
    }

    public final String component4() {
        return this.title;
    }

    public final boolean component5() {
        return this.isDefault;
    }

    public final TransportCardPassTypeApiModel copy(String str, double d, String str2, String str3, boolean z) {
        C41536l.m120489i(str, "typeId");
        C41536l.m120489i(str2, "typeCode");
        C41536l.m120489i(str3, "title");
        return new TransportCardPassTypeApiModel(str, d, str2, str3, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransportCardPassTypeApiModel)) {
            return false;
        }
        TransportCardPassTypeApiModel transportCardPassTypeApiModel = (TransportCardPassTypeApiModel) obj;
        return C41536l.m120484d(this.typeId, transportCardPassTypeApiModel.typeId) && Double.compare(this.price, transportCardPassTypeApiModel.price) == 0 && C41536l.m120484d(this.typeCode, transportCardPassTypeApiModel.typeCode) && C41536l.m120484d(this.title, transportCardPassTypeApiModel.title) && this.isDefault == transportCardPassTypeApiModel.isDefault;
    }

    public final double getPrice() {
        return this.price;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTypeCode() {
        return this.typeCode;
    }

    public final String getTypeId() {
        return this.typeId;
    }

    public int hashCode() {
        int hashCode = ((((((this.typeId.hashCode() * 31) + Double.doubleToLongBits(this.price)) * 31) + this.typeCode.hashCode()) * 31) + this.title.hashCode()) * 31;
        boolean z = this.isDefault;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public String toString() {
        String str = this.typeId;
        double d = this.price;
        String str2 = this.typeCode;
        String str3 = this.title;
        boolean z = this.isDefault;
        return "TransportCardPassTypeApiModel(typeId=" + str + ", price=" + d + ", typeCode=" + str2 + ", title=" + str3 + ", isDefault=" + z + ")";
    }
}

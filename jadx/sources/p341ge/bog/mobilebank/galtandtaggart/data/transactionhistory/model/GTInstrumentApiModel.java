package p341ge.bog.mobilebank.galtandtaggart.data.transactionhistory.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.transactionhistory.model.GTInstrumentApiModel */
public final class GTInstrumentApiModel {

    /* renamed from: id */
    private final String f61138id;
    private final String image;
    private final String name;
    private final String symbol;

    public GTInstrumentApiModel(String str, String str2, String str3, String str4) {
        this.f61138id = str;
        this.symbol = str2;
        this.name = str3;
        this.image = str4;
    }

    public static /* synthetic */ GTInstrumentApiModel copy$default(GTInstrumentApiModel gTInstrumentApiModel, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gTInstrumentApiModel.f61138id;
        }
        if ((i & 2) != 0) {
            str2 = gTInstrumentApiModel.symbol;
        }
        if ((i & 4) != 0) {
            str3 = gTInstrumentApiModel.name;
        }
        if ((i & 8) != 0) {
            str4 = gTInstrumentApiModel.image;
        }
        return gTInstrumentApiModel.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.f61138id;
    }

    public final String component2() {
        return this.symbol;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.image;
    }

    public final GTInstrumentApiModel copy(String str, String str2, String str3, String str4) {
        return new GTInstrumentApiModel(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GTInstrumentApiModel)) {
            return false;
        }
        GTInstrumentApiModel gTInstrumentApiModel = (GTInstrumentApiModel) obj;
        return C41536l.m120484d(this.f61138id, gTInstrumentApiModel.f61138id) && C41536l.m120484d(this.symbol, gTInstrumentApiModel.symbol) && C41536l.m120484d(this.name, gTInstrumentApiModel.name) && C41536l.m120484d(this.image, gTInstrumentApiModel.image);
    }

    public final String getId() {
        return this.f61138id;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.f61138id;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.image;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.f61138id;
        String str2 = this.symbol;
        String str3 = this.name;
        String str4 = this.image;
        return "GTInstrumentApiModel(id=" + str + ", symbol=" + str2 + ", name=" + str3 + ", image=" + str4 + ")";
    }
}

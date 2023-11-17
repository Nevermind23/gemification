package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.CasHistoryItemUiModel */
public final class CasHistoryItemUiModel implements Parcelable {
    public static final Parcelable.Creator<CasHistoryItemUiModel> CREATOR = new C21143a();

    /* renamed from: d */
    private final Integer f56795d;

    /* renamed from: e */
    private final String f56796e;

    /* renamed from: f */
    private final Integer f56797f;

    /* renamed from: g */
    private final Double f56798g;

    /* renamed from: h */
    private final String f56799h;

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.CasHistoryItemUiModel$a */
    public static final class C21143a implements Parcelable.Creator {
        /* renamed from: a */
        public final CasHistoryItemUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CasHistoryItemUiModel(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString());
        }

        /* renamed from: b */
        public final CasHistoryItemUiModel[] newArray(int i) {
            return new CasHistoryItemUiModel[i];
        }
    }

    public CasHistoryItemUiModel(Integer num, String str, Integer num2, Double d, String str2) {
        this.f56795d = num;
        this.f56796e = str;
        this.f56797f = num2;
        this.f56798g = d;
        this.f56799h = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CasHistoryItemUiModel)) {
            return false;
        }
        CasHistoryItemUiModel casHistoryItemUiModel = (CasHistoryItemUiModel) obj;
        return C41536l.m120484d(this.f56795d, casHistoryItemUiModel.f56795d) && C41536l.m120484d(this.f56796e, casHistoryItemUiModel.f56796e) && C41536l.m120484d(this.f56797f, casHistoryItemUiModel.f56797f) && C41536l.m120484d(this.f56798g, casHistoryItemUiModel.f56798g) && C41536l.m120484d(this.f56799h, casHistoryItemUiModel.f56799h);
    }

    public int hashCode() {
        Integer num = this.f56795d;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f56796e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f56797f;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.f56798g;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.f56799h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        Integer num = this.f56795d;
        String str = this.f56796e;
        Integer num2 = this.f56797f;
        Double d = this.f56798g;
        String str2 = this.f56799h;
        return "CasHistoryItemUiModel(orderNo=" + num + ", monthDictionaryKey=" + str + ", operationCount=" + num2 + ", amount=" + d + ", ccy=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        Integer num = this.f56795d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.f56796e);
        Integer num2 = this.f56797f;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Double d = this.f56798g;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.f56799h);
    }
}

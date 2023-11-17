package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox;

import android.os.Parcel;
import android.os.Parcelable;
import g91.C32303f;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxTariffUiModel */
public final class MoneyBoxTariffUiModel implements Parcelable {
    public static final Parcelable.Creator<MoneyBoxTariffUiModel> CREATOR = new C33110a();

    /* renamed from: d */
    private final long f81082d;

    /* renamed from: e */
    private final String f81083e;

    /* renamed from: f */
    private final double f81084f;

    /* renamed from: g */
    private final String f81085g;

    /* renamed from: h */
    private final String f81086h;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxTariffUiModel$a */
    public static final class C33110a implements Parcelable.Creator {
        /* renamed from: a */
        public final MoneyBoxTariffUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new MoneyBoxTariffUiModel(parcel.readLong(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final MoneyBoxTariffUiModel[] newArray(int i) {
            return new MoneyBoxTariffUiModel[i];
        }
    }

    public MoneyBoxTariffUiModel(long j, String str, double d, String str2, String str3) {
        C41536l.m120489i(str, "schemeType");
        this.f81082d = j;
        this.f81083e = str;
        this.f81084f = d;
        this.f81085g = str2;
        this.f81086h = str3;
    }

    /* renamed from: a */
    public final String mo75109a() {
        return this.f81086h;
    }

    /* renamed from: b */
    public final String mo75110b(String str) {
        C41536l.m120489i(str, "ccy");
        return C32303f.m95200k(this.f81084f, str);
    }

    /* renamed from: d */
    public final long mo75111d() {
        return this.f81082d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final double mo75113e() {
        return this.f81084f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyBoxTariffUiModel)) {
            return false;
        }
        MoneyBoxTariffUiModel moneyBoxTariffUiModel = (MoneyBoxTariffUiModel) obj;
        return this.f81082d == moneyBoxTariffUiModel.f81082d && C41536l.m120484d(this.f81083e, moneyBoxTariffUiModel.f81083e) && Double.compare(this.f81084f, moneyBoxTariffUiModel.f81084f) == 0 && C41536l.m120484d(this.f81085g, moneyBoxTariffUiModel.f81085g) && C41536l.m120484d(this.f81086h, moneyBoxTariffUiModel.f81086h);
    }

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.f81082d) * 31) + this.f81083e.hashCode()) * 31) + Double.doubleToLongBits(this.f81084f)) * 31;
        String str = this.f81085g;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f81086h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        long j = this.f81082d;
        String str = this.f81083e;
        double d = this.f81084f;
        String str2 = this.f81085g;
        String str3 = this.f81086h;
        return "MoneyBoxTariffUiModel(id=" + j + ", schemeType=" + str + ", tariff=" + d + ", dfltCcy=" + str2 + ", ccy=" + str3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f81082d);
        parcel.writeString(this.f81083e);
        parcel.writeDouble(this.f81084f);
        parcel.writeString(this.f81085g);
        parcel.writeString(this.f81086h);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneyBoxTariffUiModel(long j, String str, double d, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, d, str2, (i & 16) != 0 ? str2 : str3);
    }
}

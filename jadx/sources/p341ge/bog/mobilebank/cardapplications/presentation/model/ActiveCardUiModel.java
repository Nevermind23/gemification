package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.ActiveCardUiModel */
public final class ActiveCardUiModel implements Parcelable {
    public static final Parcelable.Creator<ActiveCardUiModel> CREATOR = new C14190a();

    /* renamed from: d */
    private final long f41591d;

    /* renamed from: e */
    private final long f41592e;

    /* renamed from: f */
    private final String f41593f;

    /* renamed from: g */
    private final long f41594g;

    /* renamed from: h */
    private final String f41595h;

    /* renamed from: i */
    private final long f41596i;

    /* renamed from: j */
    private final long f41597j;

    /* renamed from: k */
    private final long f41598k;

    /* renamed from: l */
    private final String f41599l;

    /* renamed from: m */
    private final String f41600m;

    /* renamed from: n */
    private final String f41601n;

    /* renamed from: o */
    private final String f41602o;

    /* renamed from: p */
    private final CardExternalFile f41603p;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.ActiveCardUiModel$a */
    public static final class C14190a implements Parcelable.Creator {
        /* renamed from: a */
        public final ActiveCardUiModel createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            ActiveCardUiModel activeCardUiModel = r2;
            ActiveCardUiModel activeCardUiModel2 = new ActiveCardUiModel(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (CardExternalFile) parcel2.readParcelable(ActiveCardUiModel.class.getClassLoader()));
            return activeCardUiModel;
        }

        /* renamed from: b */
        public final ActiveCardUiModel[] newArray(int i) {
            return new ActiveCardUiModel[i];
        }
    }

    public ActiveCardUiModel(long j, long j2, String str, long j3, String str2, long j4, long j5, long j6, String str3, String str4, String str5, String str6, CardExternalFile cardExternalFile) {
        String str7 = str3;
        CardExternalFile cardExternalFile2 = cardExternalFile;
        C41536l.m120489i(str, "lastFour");
        C41536l.m120489i(str2, "acctNo");
        C41536l.m120489i(str7, "subProductCode");
        C41536l.m120489i(cardExternalFile2, "cardExternalFile");
        this.f41591d = j;
        this.f41592e = j2;
        this.f41593f = str;
        this.f41594g = j3;
        this.f41595h = str2;
        this.f41596i = j4;
        this.f41597j = j5;
        this.f41598k = j6;
        this.f41599l = str7;
        this.f41600m = str4;
        this.f41601n = str5;
        this.f41602o = str6;
        this.f41603p = cardExternalFile2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveCardUiModel)) {
            return false;
        }
        ActiveCardUiModel activeCardUiModel = (ActiveCardUiModel) obj;
        return this.f41591d == activeCardUiModel.f41591d && this.f41592e == activeCardUiModel.f41592e && C41536l.m120484d(this.f41593f, activeCardUiModel.f41593f) && this.f41594g == activeCardUiModel.f41594g && C41536l.m120484d(this.f41595h, activeCardUiModel.f41595h) && this.f41596i == activeCardUiModel.f41596i && this.f41597j == activeCardUiModel.f41597j && this.f41598k == activeCardUiModel.f41598k && C41536l.m120484d(this.f41599l, activeCardUiModel.f41599l) && C41536l.m120484d(this.f41600m, activeCardUiModel.f41600m) && C41536l.m120484d(this.f41601n, activeCardUiModel.f41601n) && C41536l.m120484d(this.f41602o, activeCardUiModel.f41602o) && C41536l.m120484d(this.f41603p, activeCardUiModel.f41603p);
    }

    public int hashCode() {
        int a = ((((((((((((((((C7397t.m28148a(this.f41591d) * 31) + C7397t.m28148a(this.f41592e)) * 31) + this.f41593f.hashCode()) * 31) + C7397t.m28148a(this.f41594g)) * 31) + this.f41595h.hashCode()) * 31) + C7397t.m28148a(this.f41596i)) * 31) + C7397t.m28148a(this.f41597j)) * 31) + C7397t.m28148a(this.f41598k)) * 31) + this.f41599l.hashCode()) * 31;
        String str = this.f41600m;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f41601n;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f41602o;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f41603p.hashCode();
    }

    public String toString() {
        long j = this.f41591d;
        long j2 = this.f41592e;
        String str = this.f41593f;
        long j3 = this.f41594g;
        String str2 = this.f41595h;
        long j4 = this.f41596i;
        long j5 = this.f41597j;
        long j6 = this.f41598k;
        String str3 = this.f41599l;
        String str4 = this.f41600m;
        String str5 = this.f41601n;
        String str6 = this.f41602o;
        CardExternalFile cardExternalFile = this.f41603p;
        return "ActiveCardUiModel(id=" + j + ", cardForTypeDescKeyId=" + j2 + ", lastFour=" + str + ", expDate=" + j3 + ", acctNo=" + str2 + ", acctKey=" + j4 + ", clientKey=" + j5 + ", cardId=" + j6 + ", subProductCode=" + str3 + ", cardNameKey=" + str4 + ", cardNameValue=" + str5 + ", cardNickName=" + str6 + ", cardExternalFile=" + cardExternalFile + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f41591d);
        parcel.writeLong(this.f41592e);
        parcel.writeString(this.f41593f);
        parcel.writeLong(this.f41594g);
        parcel.writeString(this.f41595h);
        parcel.writeLong(this.f41596i);
        parcel.writeLong(this.f41597j);
        parcel.writeLong(this.f41598k);
        parcel.writeString(this.f41599l);
        parcel.writeString(this.f41600m);
        parcel.writeString(this.f41601n);
        parcel.writeString(this.f41602o);
        parcel.writeParcelable(this.f41603p, i);
    }
}

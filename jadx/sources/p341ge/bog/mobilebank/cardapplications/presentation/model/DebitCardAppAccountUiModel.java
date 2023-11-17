package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardAppAccountUiModel */
public final class DebitCardAppAccountUiModel implements Parcelable {
    public static final Parcelable.Creator<DebitCardAppAccountUiModel> CREATOR = new C14209a();

    /* renamed from: d */
    private final long f41670d;

    /* renamed from: e */
    private final String f41671e;

    /* renamed from: f */
    private final String f41672f;

    /* renamed from: g */
    private final String f41673g;

    /* renamed from: h */
    private final String f41674h;

    /* renamed from: i */
    private final long f41675i;

    /* renamed from: j */
    private final String f41676j;

    /* renamed from: k */
    private final String f41677k;

    /* renamed from: l */
    private final String f41678l;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardAppAccountUiModel$a */
    public static final class C14209a implements Parcelable.Creator {
        /* renamed from: a */
        public final DebitCardAppAccountUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new DebitCardAppAccountUiModel(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final DebitCardAppAccountUiModel[] newArray(int i) {
            return new DebitCardAppAccountUiModel[i];
        }
    }

    public DebitCardAppAccountUiModel(long j, String str, String str2, String str3, String str4, long j2, String str5, String str6, String str7) {
        C41536l.m120489i(str, "acctNo");
        C41536l.m120489i(str2, "ccy");
        C41536l.m120489i(str3, "planType");
        C41536l.m120489i(str4, "planCode");
        C41536l.m120489i(str5, "cardClass");
        C41536l.m120489i(str6, "cardType");
        C41536l.m120489i(str7, "availableAmount");
        this.f41670d = j;
        this.f41671e = str;
        this.f41672f = str2;
        this.f41673g = str3;
        this.f41674h = str4;
        this.f41675i = j2;
        this.f41676j = str5;
        this.f41677k = str6;
        this.f41678l = str7;
    }

    /* renamed from: a */
    public final long mo39484a() {
        return this.f41670d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardAppAccountUiModel)) {
            return false;
        }
        DebitCardAppAccountUiModel debitCardAppAccountUiModel = (DebitCardAppAccountUiModel) obj;
        return this.f41670d == debitCardAppAccountUiModel.f41670d && C41536l.m120484d(this.f41671e, debitCardAppAccountUiModel.f41671e) && C41536l.m120484d(this.f41672f, debitCardAppAccountUiModel.f41672f) && C41536l.m120484d(this.f41673g, debitCardAppAccountUiModel.f41673g) && C41536l.m120484d(this.f41674h, debitCardAppAccountUiModel.f41674h) && this.f41675i == debitCardAppAccountUiModel.f41675i && C41536l.m120484d(this.f41676j, debitCardAppAccountUiModel.f41676j) && C41536l.m120484d(this.f41677k, debitCardAppAccountUiModel.f41677k) && C41536l.m120484d(this.f41678l, debitCardAppAccountUiModel.f41678l);
    }

    public int hashCode() {
        return (((((((((((((((C7397t.m28148a(this.f41670d) * 31) + this.f41671e.hashCode()) * 31) + this.f41672f.hashCode()) * 31) + this.f41673g.hashCode()) * 31) + this.f41674h.hashCode()) * 31) + C7397t.m28148a(this.f41675i)) * 31) + this.f41676j.hashCode()) * 31) + this.f41677k.hashCode()) * 31) + this.f41678l.hashCode();
    }

    public String toString() {
        long j = this.f41670d;
        String str = this.f41671e;
        String str2 = this.f41672f;
        String str3 = this.f41673g;
        String str4 = this.f41674h;
        long j2 = this.f41675i;
        String str5 = this.f41676j;
        String str6 = this.f41677k;
        String str7 = this.f41678l;
        return "DebitCardAppAccountUiModel(acctKey=" + j + ", acctNo=" + str + ", ccy=" + str2 + ", planType=" + str3 + ", planCode=" + str4 + ", clientKey=" + j2 + ", cardClass=" + str5 + ", cardType=" + str6 + ", availableAmount=" + str7 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f41670d);
        parcel.writeString(this.f41671e);
        parcel.writeString(this.f41672f);
        parcel.writeString(this.f41673g);
        parcel.writeString(this.f41674h);
        parcel.writeLong(this.f41675i);
        parcel.writeString(this.f41676j);
        parcel.writeString(this.f41677k);
        parcel.writeString(this.f41678l);
    }
}

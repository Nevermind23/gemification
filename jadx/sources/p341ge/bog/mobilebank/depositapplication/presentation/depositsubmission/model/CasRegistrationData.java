package p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.model.CasRegistrationData */
public final class CasRegistrationData implements Parcelable {
    public static final Parcelable.Creator<CasRegistrationData> CREATOR = new C22979a();

    /* renamed from: d */
    private final BigDecimal f60434d;

    /* renamed from: e */
    private final long f60435e;

    /* renamed from: f */
    private final String f60436f;

    /* renamed from: g */
    private final CardAccountSelectorUiModel f60437g;

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.model.CasRegistrationData$a */
    public static final class C22979a implements Parcelable.Creator {
        /* renamed from: a */
        public final CasRegistrationData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CasRegistrationData((BigDecimal) parcel.readSerializable(), parcel.readLong(), parcel.readString(), (CardAccountSelectorUiModel) parcel.readParcelable(CasRegistrationData.class.getClassLoader()));
        }

        /* renamed from: b */
        public final CasRegistrationData[] newArray(int i) {
            return new CasRegistrationData[i];
        }
    }

    public CasRegistrationData() {
        this((BigDecimal) null, 0, (String) null, (CardAccountSelectorUiModel) null, 15, (DefaultConstructorMarker) null);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CasRegistrationData)) {
            return false;
        }
        CasRegistrationData casRegistrationData = (CasRegistrationData) obj;
        return C41536l.m120484d(this.f60434d, casRegistrationData.f60434d) && this.f60435e == casRegistrationData.f60435e && C41536l.m120484d(this.f60436f, casRegistrationData.f60436f) && C41536l.m120484d(this.f60437g, casRegistrationData.f60437g);
    }

    public int hashCode() {
        int hashCode = ((((this.f60434d.hashCode() * 31) + C7397t.m28148a(this.f60435e)) * 31) + this.f60436f.hashCode()) * 31;
        CardAccountSelectorUiModel cardAccountSelectorUiModel = this.f60437g;
        return hashCode + (cardAccountSelectorUiModel == null ? 0 : cardAccountSelectorUiModel.hashCode());
    }

    public String toString() {
        BigDecimal bigDecimal = this.f60434d;
        long j = this.f60435e;
        String str = this.f60436f;
        CardAccountSelectorUiModel cardAccountSelectorUiModel = this.f60437g;
        return "CasRegistrationData(amount=" + bigDecimal + ", agreeKey=" + j + ", ccy=" + str + ", account=" + cardAccountSelectorUiModel + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeSerializable(this.f60434d);
        parcel.writeLong(this.f60435e);
        parcel.writeString(this.f60436f);
        parcel.writeParcelable(this.f60437g, i);
    }

    public CasRegistrationData(BigDecimal bigDecimal, long j, String str, CardAccountSelectorUiModel cardAccountSelectorUiModel) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "ccy");
        this.f60434d = bigDecimal;
        this.f60435e = j;
        this.f60436f = str;
        this.f60437g = cardAccountSelectorUiModel;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CasRegistrationData(java.math.BigDecimal r7, long r8, java.lang.String r10, p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L_0x000b
            java.math.BigDecimal r7 = java.math.BigDecimal.ZERO
            java.lang.String r13 = "ZERO"
            kotlin.jvm.internal.C41536l.m120488h(r7, r13)
        L_0x000b:
            r1 = r7
            r7 = r12 & 2
            if (r7 == 0) goto L_0x0012
            r8 = -1
        L_0x0012:
            r2 = r8
            r7 = r12 & 4
            if (r7 == 0) goto L_0x0019
            java.lang.String r10 = "GEL"
        L_0x0019:
            r4 = r10
            r7 = r12 & 8
            if (r7 == 0) goto L_0x001f
            r11 = 0
        L_0x001f:
            r5 = r11
            r0 = r6
            r0.<init>(r1, r2, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.model.CasRegistrationData.<init>(java.math.BigDecimal, long, java.lang.String, ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

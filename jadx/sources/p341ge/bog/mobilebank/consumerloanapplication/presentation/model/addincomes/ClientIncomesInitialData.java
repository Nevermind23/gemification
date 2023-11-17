package p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes;

import android.os.Parcel;
import android.os.Parcelable;
import h00.C24846c;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.ClientIncomesInitialData */
public final class ClientIncomesInitialData implements Parcelable {
    public static final Parcelable.Creator<ClientIncomesInitialData> CREATOR = new C22667a();

    /* renamed from: d */
    private final BigDecimal f59811d;

    /* renamed from: e */
    private final String f59812e;

    /* renamed from: f */
    private final String f59813f;

    /* renamed from: g */
    private final String f59814g;

    /* renamed from: h */
    private final String f59815h;

    /* renamed from: i */
    private final String f59816i;

    /* renamed from: j */
    private final C24846c f59817j;

    /* renamed from: k */
    private BigDecimal f59818k;

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.ClientIncomesInitialData$a */
    public static final class C22667a implements Parcelable.Creator {
        /* renamed from: a */
        public final ClientIncomesInitialData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new ClientIncomesInitialData((BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : C24846c.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable());
        }

        /* renamed from: b */
        public final ClientIncomesInitialData[] newArray(int i) {
            return new ClientIncomesInitialData[i];
        }
    }

    public ClientIncomesInitialData(BigDecimal bigDecimal, String str, String str2, String str3, String str4, String str5, C24846c cVar, BigDecimal bigDecimal2) {
        C41536l.m120489i(str3, "subProductType");
        C41536l.m120489i(str4, "productType");
        this.f59811d = bigDecimal;
        this.f59812e = str;
        this.f59813f = str2;
        this.f59814g = str3;
        this.f59815h = str4;
        this.f59816i = str5;
        this.f59817j = cVar;
        this.f59818k = bigDecimal2;
    }

    /* renamed from: a */
    public final BigDecimal mo56067a() {
        return this.f59811d;
    }

    /* renamed from: b */
    public final String mo56068b() {
        return this.f59816i;
    }

    /* renamed from: d */
    public final BigDecimal mo56069d() {
        return this.f59818k;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo56071e() {
        return this.f59812e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientIncomesInitialData)) {
            return false;
        }
        ClientIncomesInitialData clientIncomesInitialData = (ClientIncomesInitialData) obj;
        return C41536l.m120484d(this.f59811d, clientIncomesInitialData.f59811d) && C41536l.m120484d(this.f59812e, clientIncomesInitialData.f59812e) && C41536l.m120484d(this.f59813f, clientIncomesInitialData.f59813f) && C41536l.m120484d(this.f59814g, clientIncomesInitialData.f59814g) && C41536l.m120484d(this.f59815h, clientIncomesInitialData.f59815h) && C41536l.m120484d(this.f59816i, clientIncomesInitialData.f59816i) && this.f59817j == clientIncomesInitialData.f59817j && C41536l.m120484d(this.f59818k, clientIncomesInitialData.f59818k);
    }

    /* renamed from: f */
    public final String mo56073f() {
        return this.f59815h;
    }

    /* renamed from: g */
    public final C24846c mo56074g() {
        return this.f59817j;
    }

    /* renamed from: h */
    public final String mo56075h() {
        return this.f59813f;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.f59811d;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.f59812e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f59813f;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f59814g.hashCode()) * 31) + this.f59815h.hashCode()) * 31;
        String str3 = this.f59816i;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C24846c cVar = this.f59817j;
        int hashCode5 = (hashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f59818k;
        if (bigDecimal2 != null) {
            i = bigDecimal2.hashCode();
        }
        return hashCode5 + i;
    }

    /* renamed from: i */
    public final void mo56077i(BigDecimal bigDecimal) {
        this.f59818k = bigDecimal;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f59811d;
        String str = this.f59812e;
        String str2 = this.f59813f;
        String str3 = this.f59814g;
        String str4 = this.f59815h;
        String str5 = this.f59816i;
        C24846c cVar = this.f59817j;
        BigDecimal bigDecimal2 = this.f59818k;
        return "ClientIncomesInitialData(amount=" + bigDecimal + ", productCurrency=" + str + ", term=" + str2 + ", subProductType=" + str3 + ", productType=" + str4 + ", applicationId=" + str5 + ", status=" + cVar + ", incomeMinAmount=" + bigDecimal2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeSerializable(this.f59811d);
        parcel.writeString(this.f59812e);
        parcel.writeString(this.f59813f);
        parcel.writeString(this.f59814g);
        parcel.writeString(this.f59815h);
        parcel.writeString(this.f59816i);
        C24846c cVar = this.f59817j;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(cVar.name());
        }
        parcel.writeSerializable(this.f59818k);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ClientIncomesInitialData(java.math.BigDecimal r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, h00.C24846c r19, java.math.BigDecimal r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r9 = r2
            goto L_0x000b
        L_0x0009:
            r9 = r18
        L_0x000b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0011
            r10 = r2
            goto L_0x0013
        L_0x0011:
            r10 = r19
        L_0x0013:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0019
            r11 = r2
            goto L_0x001b
        L_0x0019:
            r11 = r20
        L_0x001b:
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.ClientIncomesInitialData.<init>(java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, h00.c, java.math.BigDecimal, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

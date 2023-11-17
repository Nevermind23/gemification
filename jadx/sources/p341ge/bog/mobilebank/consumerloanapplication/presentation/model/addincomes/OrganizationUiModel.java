package p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.OrganizationUiModel */
public final class OrganizationUiModel implements Parcelable {
    public static final Parcelable.Creator<OrganizationUiModel> CREATOR = new C22676a();

    /* renamed from: d */
    private final Long f59851d;

    /* renamed from: e */
    private final String f59852e;

    /* renamed from: f */
    private final String f59853f;

    /* renamed from: g */
    private final String f59854g;

    /* renamed from: h */
    private final String f59855h;

    /* renamed from: i */
    private final String f59856i;

    /* renamed from: j */
    private final String f59857j;

    /* renamed from: k */
    private final String f59858k;

    /* renamed from: l */
    private final String f59859l;

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.OrganizationUiModel$a */
    public static final class C22676a implements Parcelable.Creator {
        /* renamed from: a */
        public final OrganizationUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new OrganizationUiModel(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final OrganizationUiModel[] newArray(int i) {
            return new OrganizationUiModel[i];
        }
    }

    public OrganizationUiModel() {
        this((Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 511, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final String mo56157a() {
        return this.f59858k;
    }

    /* renamed from: b */
    public final String mo56158b() {
        return this.f59859l;
    }

    /* renamed from: d */
    public final String mo56159d() {
        return this.f59856i;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo56161e() {
        return this.f59857j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrganizationUiModel)) {
            return false;
        }
        OrganizationUiModel organizationUiModel = (OrganizationUiModel) obj;
        return C41536l.m120484d(this.f59851d, organizationUiModel.f59851d) && C41536l.m120484d(this.f59852e, organizationUiModel.f59852e) && C41536l.m120484d(this.f59853f, organizationUiModel.f59853f) && C41536l.m120484d(this.f59854g, organizationUiModel.f59854g) && C41536l.m120484d(this.f59855h, organizationUiModel.f59855h) && C41536l.m120484d(this.f59856i, organizationUiModel.f59856i) && C41536l.m120484d(this.f59857j, organizationUiModel.f59857j) && C41536l.m120484d(this.f59858k, organizationUiModel.f59858k) && C41536l.m120484d(this.f59859l, organizationUiModel.f59859l);
    }

    /* renamed from: f */
    public final String mo56163f() {
        return this.f59853f;
    }

    public int hashCode() {
        Long l = this.f59851d;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.f59852e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f59853f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59854g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f59855h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f59856i;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f59857j;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f59858k;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f59859l;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        Long l = this.f59851d;
        String str = this.f59852e;
        String str2 = this.f59853f;
        String str3 = this.f59854g;
        String str4 = this.f59855h;
        String str5 = this.f59856i;
        String str6 = this.f59857j;
        String str7 = this.f59858k;
        String str8 = this.f59859l;
        return "OrganizationUiModel(id=" + l + ", statId=" + str + ", taxId=" + str2 + ", abbreviation=" + str3 + ", abbreviationEn=" + str4 + ", customerName=" + str5 + ", customerNameEn=" + str6 + ", address=" + str7 + ", addressEn=" + str8 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        Long l = this.f59851d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.f59852e);
        parcel.writeString(this.f59853f);
        parcel.writeString(this.f59854g);
        parcel.writeString(this.f59855h);
        parcel.writeString(this.f59856i);
        parcel.writeString(this.f59857j);
        parcel.writeString(this.f59858k);
        parcel.writeString(this.f59859l);
    }

    public OrganizationUiModel(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f59851d = l;
        this.f59852e = str;
        this.f59853f = str2;
        this.f59854g = str3;
        this.f59855h = str4;
        this.f59856i = str5;
        this.f59857j = str6;
        this.f59858k = str7;
        this.f59859l = str8;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OrganizationUiModel(java.lang.Long r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r12
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r13
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r14
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r15
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002e
        L_0x002c:
            r7 = r16
        L_0x002e:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0034
            r8 = r2
            goto L_0x0036
        L_0x0034:
            r8 = r17
        L_0x0036:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003c
            r9 = r2
            goto L_0x003e
        L_0x003c:
            r9 = r18
        L_0x003e:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r2 = r19
        L_0x0045:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.OrganizationUiModel.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

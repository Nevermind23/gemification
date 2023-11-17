package p341ge.bog.sso_client.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.sso_client.models.CountryCode */
public final class CountryCode implements Parcelable {
    public static final Parcelable.Creator<CountryCode> CREATOR = new C35924a();

    /* renamed from: d */
    private final String f86886d;

    /* renamed from: e */
    private final String f86887e;

    /* renamed from: f */
    private final String f86888f;

    /* renamed from: g */
    private final String f86889g;

    /* renamed from: h */
    private final Boolean f86890h;

    /* renamed from: i */
    private final String f86891i;

    /* renamed from: j */
    private final Integer f86892j;

    /* renamed from: ge.bog.sso_client.models.CountryCode$a */
    public static final class C35924a implements Parcelable.Creator {
        /* renamed from: a */
        public final CountryCode createFromParcel(Parcel parcel) {
            Boolean bool;
            C41536l.m120489i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CountryCode(readString, readString2, readString3, readString4, bool, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* renamed from: b */
        public final CountryCode[] newArray(int i) {
            return new CountryCode[i];
        }
    }

    public CountryCode() {
        this((String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (Integer) null, C11051p3.f31760d, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final String mo88219a() {
        return this.f86886d;
    }

    /* renamed from: b */
    public final String mo88220b() {
        return this.f86888f;
    }

    /* renamed from: d */
    public final Boolean mo88221d() {
        return this.f86890h;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo88223e() {
        return this.f86891i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountryCode)) {
            return false;
        }
        CountryCode countryCode = (CountryCode) obj;
        return C41536l.m120484d(this.f86886d, countryCode.f86886d) && C41536l.m120484d(this.f86887e, countryCode.f86887e) && C41536l.m120484d(this.f86888f, countryCode.f86888f) && C41536l.m120484d(this.f86889g, countryCode.f86889g) && C41536l.m120484d(this.f86890h, countryCode.f86890h) && C41536l.m120484d(this.f86891i, countryCode.f86891i) && C41536l.m120484d(this.f86892j, countryCode.f86892j);
    }

    /* renamed from: f */
    public final Integer mo88225f() {
        return this.f86892j;
    }

    public int hashCode() {
        String str = this.f86886d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f86887e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f86888f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f86889g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f86890h;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.f86891i;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f86892j;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        return "CountryCode(callingCode=" + this.f86886d + ", ccy=" + this.f86887e + ", code=" + this.f86888f + ", code2=" + this.f86889g + ", currentCountry=" + this.f86890h + ", name=" + this.f86891i + ", order=" + this.f86892j + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f86886d);
        parcel.writeString(this.f86887e);
        parcel.writeString(this.f86888f);
        parcel.writeString(this.f86889g);
        Boolean bool = this.f86890h;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.f86891i);
        Integer num = this.f86892j;
        if (num == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num.intValue());
    }

    public CountryCode(String str, String str2, String str3, String str4, Boolean bool, String str5, Integer num) {
        this.f86886d = str;
        this.f86887e = str2;
        this.f86888f = str3;
        this.f86889g = str4;
        this.f86890h = bool;
        this.f86891i = str5;
        this.f86892j = num;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CountryCode(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.Boolean r11, java.lang.String r12, java.lang.Integer r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r9
        L_0x0016:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r11
        L_0x0024:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            r5 = r0
            goto L_0x002b
        L_0x002a:
            r5 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.sso_client.models.CountryCode.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

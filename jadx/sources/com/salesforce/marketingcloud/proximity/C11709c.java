package com.salesforce.marketingcloud.proximity;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: com.salesforce.marketingcloud.proximity.c */
public final class C11709c implements Parcelable {
    public static final Parcelable.Creator<C11709c> CREATOR = new C11710a();

    /* renamed from: a */
    private final String f33950a;

    /* renamed from: b */
    private final String f33951b;

    /* renamed from: c */
    private final int f33952c;

    /* renamed from: d */
    private final int f33953d;

    /* renamed from: com.salesforce.marketingcloud.proximity.c$a */
    public static final class C11710a implements Parcelable.Creator<C11709c> {
        /* renamed from: a */
        public final C11709c createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new C11709c(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* renamed from: a */
        public final C11709c[] newArray(int i) {
            return new C11709c[i];
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11709c(com.salesforce.marketingcloud.messages.Region r4) {
        /*
            r3 = this;
            java.lang.String r0 = "region"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            java.lang.String r0 = r4.mo30395id()
            java.lang.String r1 = r4.proximityUuid()
            if (r1 == 0) goto L_0x001b
            int r2 = r4.major()
            int r4 = r4.minor()
            r3.<init>(r0, r1, r2, r4)
            return
        L_0x001b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Not a beacon region"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.proximity.C11709c.<init>(com.salesforce.marketingcloud.messages.Region):void");
    }

    /* renamed from: a */
    public static /* synthetic */ C11709c m42707a(C11709c cVar, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = cVar.f33950a;
        }
        if ((i3 & 2) != 0) {
            str2 = cVar.f33951b;
        }
        if ((i3 & 4) != 0) {
            i = cVar.f33952c;
        }
        if ((i3 & 8) != 0) {
            i2 = cVar.f33953d;
        }
        return cVar.mo30985a(str, str2, i, i2);
    }

    /* renamed from: b */
    public final String mo30987b() {
        return this.f33951b;
    }

    /* renamed from: c */
    public final int mo30988c() {
        return this.f33952c;
    }

    /* renamed from: d */
    public final int mo30989d() {
        return this.f33953d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo30991e() {
        return this.f33951b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11709c)) {
            return false;
        }
        C11709c cVar = (C11709c) obj;
        return C41536l.m120484d(this.f33950a, cVar.f33950a) && C41536l.m120484d(this.f33951b, cVar.f33951b) && this.f33952c == cVar.f33952c && this.f33953d == cVar.f33953d;
    }

    /* renamed from: f */
    public final String mo30993f() {
        return this.f33950a;
    }

    /* renamed from: g */
    public final int mo30994g() {
        return this.f33952c;
    }

    /* renamed from: h */
    public final int mo30995h() {
        return this.f33953d;
    }

    public int hashCode() {
        return (((((this.f33950a.hashCode() * 31) + this.f33951b.hashCode()) * 31) + this.f33952c) * 31) + this.f33953d;
    }

    public String toString() {
        return "BeaconRegion(id=" + this.f33950a + ", guid=" + this.f33951b + ", major=" + this.f33952c + ", minor=" + this.f33953d + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f33950a);
        parcel.writeString(this.f33951b);
        parcel.writeInt(this.f33952c);
        parcel.writeInt(this.f33953d);
    }

    public C11709c(String str, String str2, int i, int i2) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str2, "guid");
        this.f33950a = str;
        this.f33951b = str2;
        this.f33952c = i;
        this.f33953d = i2;
    }

    /* renamed from: a */
    public final C11709c mo30985a(String str, String str2, int i, int i2) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str2, "guid");
        return new C11709c(str, str2, i, i2);
    }

    /* renamed from: a */
    public final String mo30986a() {
        return this.f33950a;
    }
}

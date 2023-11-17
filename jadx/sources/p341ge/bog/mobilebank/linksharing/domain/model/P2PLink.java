package p341ge.bog.mobilebank.linksharing.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.linksharing.domain.model.P2PLink */
public final class P2PLink implements Parcelable {
    public static final Parcelable.Creator<P2PLink> CREATOR = new C15116b();

    /* renamed from: m */
    public static final C15115a f43395m = new C15115a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final P2PLink f43396n = new P2PLink((Long) null, "", (String) null, false, false, (Boolean) null, (Long) null, (Long) null, (String) null);

    /* renamed from: d */
    private final Long f43397d;

    /* renamed from: e */
    private final String f43398e;

    /* renamed from: f */
    private final String f43399f;

    /* renamed from: g */
    private final boolean f43400g;

    /* renamed from: h */
    private final boolean f43401h;

    /* renamed from: i */
    private final Boolean f43402i;

    /* renamed from: j */
    private final Long f43403j;

    /* renamed from: k */
    private final Long f43404k;

    /* renamed from: l */
    private final String f43405l;

    /* renamed from: ge.bog.mobilebank.linksharing.domain.model.P2PLink$a */
    public static final class C15115a {
        private C15115a() {
        }

        public /* synthetic */ C15115a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final P2PLink mo42142a() {
            return P2PLink.f43396n;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.domain.model.P2PLink$b */
    public static final class C15116b implements Parcelable.Creator {
        /* renamed from: a */
        public final P2PLink createFromParcel(Parcel parcel) {
            Boolean bool;
            C41536l.m120489i(parcel, "parcel");
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            }
            return new P2PLink(valueOf, readString, readString2, z2, z3, bool, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
        }

        /* renamed from: b */
        public final P2PLink[] newArray(int i) {
            return new P2PLink[i];
        }
    }

    public P2PLink(Long l, String str, String str2, boolean z, boolean z2, Boolean bool, Long l2, Long l3, String str3) {
        C41536l.m120489i(str, "linkNickName");
        this.f43397d = l;
        this.f43398e = str;
        this.f43399f = str2;
        this.f43400g = z;
        this.f43401h = z2;
        this.f43402i = bool;
        this.f43403j = l2;
        this.f43404k = l3;
        this.f43405l = str3;
    }

    /* renamed from: b */
    public final Long mo42132b() {
        return this.f43404k;
    }

    /* renamed from: d */
    public final String mo42133d() {
        return this.f43398e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo42135e() {
        return this.f43399f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P2PLink)) {
            return false;
        }
        P2PLink p2PLink = (P2PLink) obj;
        return C41536l.m120484d(this.f43397d, p2PLink.f43397d) && C41536l.m120484d(this.f43398e, p2PLink.f43398e) && C41536l.m120484d(this.f43399f, p2PLink.f43399f) && this.f43400g == p2PLink.f43400g && this.f43401h == p2PLink.f43401h && C41536l.m120484d(this.f43402i, p2PLink.f43402i) && C41536l.m120484d(this.f43403j, p2PLink.f43403j) && C41536l.m120484d(this.f43404k, p2PLink.f43404k) && C41536l.m120484d(this.f43405l, p2PLink.f43405l);
    }

    /* renamed from: f */
    public final boolean mo42137f() {
        return this.f43400g;
    }

    /* renamed from: g */
    public final boolean mo42138g() {
        return this.f43401h;
    }

    public int hashCode() {
        Long l = this.f43397d;
        int i = 0;
        int hashCode = (((l == null ? 0 : l.hashCode()) * 31) + this.f43398e.hashCode()) * 31;
        String str = this.f43399f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f43400g;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f43401h;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        Boolean bool = this.f43402i;
        int hashCode3 = (i3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l2 = this.f43403j;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f43404k;
        int hashCode5 = (hashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str2 = this.f43405l;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        Long l = this.f43397d;
        String str = this.f43398e;
        String str2 = this.f43399f;
        boolean z = this.f43400g;
        boolean z2 = this.f43401h;
        Boolean bool = this.f43402i;
        Long l2 = this.f43403j;
        Long l3 = this.f43404k;
        String str3 = this.f43405l;
        return "P2PLink(clientKey=" + l + ", linkNickName=" + str + ", linkUrl=" + str2 + ", isLinkActive=" + z + ", isLinkValid=" + z2 + ", linkStatus=" + bool + ", linkEndDate=" + l2 + ", acctKey=" + l3 + ", acctNo=" + str3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        Long l = this.f43397d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.f43398e);
        parcel.writeString(this.f43399f);
        parcel.writeInt(this.f43400g ? 1 : 0);
        parcel.writeInt(this.f43401h ? 1 : 0);
        Boolean bool = this.f43402i;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Long l2 = this.f43403j;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Long l3 = this.f43404k;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        parcel.writeString(this.f43405l);
    }
}

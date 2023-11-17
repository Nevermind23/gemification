package j31;

import kotlin.jvm.internal.C41536l;

/* renamed from: j31.a */
public final class C36725a {

    /* renamed from: a */
    private final String f88619a;

    /* renamed from: b */
    private final String f88620b;

    /* renamed from: c */
    private final Number f88621c;

    /* renamed from: d */
    private final boolean f88622d;

    /* renamed from: e */
    private final String f88623e;

    /* renamed from: f */
    private final String f88624f;

    public C36725a(String str, String str2, Number number, boolean z, String str3, String str4) {
        this.f88619a = str;
        this.f88620b = str2;
        this.f88621c = number;
        this.f88622d = z;
        this.f88623e = str3;
        this.f88624f = str4;
    }

    /* renamed from: b */
    public static /* synthetic */ C36725a m108889b(C36725a aVar, String str, String str2, Number number, boolean z, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f88619a;
        }
        if ((i & 2) != 0) {
            str2 = aVar.f88620b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            number = aVar.f88621c;
        }
        Number number2 = number;
        if ((i & 8) != 0) {
            z = aVar.f88622d;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str3 = aVar.f88623e;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = aVar.f88624f;
        }
        return aVar.mo89539a(str, str5, number2, z2, str6, str4);
    }

    /* renamed from: a */
    public final C36725a mo89539a(String str, String str2, Number number, boolean z, String str3, String str4) {
        return new C36725a(str, str2, number, z, str3, str4);
    }

    /* renamed from: c */
    public final String mo89540c() {
        return this.f88624f;
    }

    /* renamed from: d */
    public final String mo89541d() {
        return this.f88623e;
    }

    /* renamed from: e */
    public final boolean mo89542e() {
        return this.f88622d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36725a)) {
            return false;
        }
        C36725a aVar = (C36725a) obj;
        return C41536l.m120484d(this.f88619a, aVar.f88619a) && C41536l.m120484d(this.f88620b, aVar.f88620b) && C41536l.m120484d(this.f88621c, aVar.f88621c) && this.f88622d == aVar.f88622d && C41536l.m120484d(this.f88623e, aVar.f88623e) && C41536l.m120484d(this.f88624f, aVar.f88624f);
    }

    public int hashCode() {
        String str = this.f88619a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f88620b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Number number = this.f88621c;
        int hashCode3 = (hashCode2 + (number == null ? 0 : number.hashCode())) * 31;
        boolean z = this.f88622d;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        String str3 = this.f88623e;
        int hashCode4 = (i2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f88624f;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.f88619a;
        String str2 = this.f88620b;
        Number number = this.f88621c;
        boolean z = this.f88622d;
        String str3 = this.f88623e;
        String str4 = this.f88624f;
        return "ExternalFile(id=" + str + ", languageCode=" + str2 + ", extFileId=" + number + ", isDark=" + z + ", fileUrl=" + str3 + ", fileSubType=" + str4 + ")";
    }
}

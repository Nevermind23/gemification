package a30;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: a30.d */
public final class C19159d {

    /* renamed from: a */
    private final String f53351a;

    /* renamed from: b */
    private final C19166f f53352b;

    /* renamed from: c */
    private final String f53353c;

    /* renamed from: d */
    private final int f53354d;

    /* renamed from: e */
    private final String f53355e;

    /* renamed from: f */
    private final Long f53356f;

    /* renamed from: g */
    private final String f53357g;

    /* renamed from: h */
    private final String f53358h;

    public C19159d(String str, C19166f fVar, String str2, int i, String str3, Long l, String str4, String str5) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(fVar, "type");
        C41536l.m120489i(str2, "title");
        C41536l.m120489i(str4, "nickName");
        this.f53351a = str;
        this.f53352b = fVar;
        this.f53353c = str2;
        this.f53354d = i;
        this.f53355e = str3;
        this.f53356f = l;
        this.f53357g = str4;
        this.f53358h = str5;
    }

    /* renamed from: a */
    public final Long mo47377a() {
        return this.f53356f;
    }

    /* renamed from: b */
    public final int mo47378b() {
        return this.f53354d;
    }

    /* renamed from: c */
    public final String mo47379c() {
        return this.f53351a;
    }

    /* renamed from: d */
    public final String mo47380d() {
        return this.f53357g;
    }

    /* renamed from: e */
    public final String mo47381e() {
        return this.f53358h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19159d)) {
            return false;
        }
        C19159d dVar = (C19159d) obj;
        return C41536l.m120484d(this.f53351a, dVar.f53351a) && this.f53352b == dVar.f53352b && C41536l.m120484d(this.f53353c, dVar.f53353c) && this.f53354d == dVar.f53354d && C41536l.m120484d(this.f53355e, dVar.f53355e) && C41536l.m120484d(this.f53356f, dVar.f53356f) && C41536l.m120484d(this.f53357g, dVar.f53357g) && C41536l.m120484d(this.f53358h, dVar.f53358h);
    }

    /* renamed from: f */
    public final String mo47383f() {
        return this.f53355e;
    }

    /* renamed from: g */
    public final String mo47384g() {
        return this.f53353c;
    }

    /* renamed from: h */
    public final C19166f mo47385h() {
        return this.f53352b;
    }

    public int hashCode() {
        int hashCode = ((((((this.f53351a.hashCode() * 31) + this.f53352b.hashCode()) * 31) + this.f53353c.hashCode()) * 31) + this.f53354d) * 31;
        String str = this.f53355e;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f53356f;
        int hashCode3 = (((hashCode2 + (l == null ? 0 : l.hashCode())) * 31) + this.f53357g.hashCode()) * 31;
        String str2 = this.f53358h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.f53351a;
        C19166f fVar = this.f53352b;
        String str2 = this.f53353c;
        int i = this.f53354d;
        String str3 = this.f53355e;
        Long l = this.f53356f;
        String str4 = this.f53357g;
        String str5 = this.f53358h;
        return "MoneyRequestReceiverItem(id=" + str + ", type=" + fVar + ", title=" + str2 + ", iconRes=" + i + ", pictureUrl=" + str3 + ", contactId=" + l + ", nickName=" + str4 + ", phoneNumber=" + str5 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19159d(String str, C19166f fVar, String str2, int i, String str3, Long l, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fVar, str2, i, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : l, str4, str5);
    }
}

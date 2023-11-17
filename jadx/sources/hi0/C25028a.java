package hi0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import xh0.C29780a;

/* renamed from: hi0.a */
public final class C25028a {

    /* renamed from: a */
    private final long f64362a;

    /* renamed from: b */
    private final String f64363b;

    /* renamed from: c */
    private final String f64364c;

    /* renamed from: d */
    private final String f64365d;

    /* renamed from: e */
    private final String f64366e;

    /* renamed from: f */
    private final String f64367f;

    /* renamed from: g */
    private final List f64368g;

    /* renamed from: h */
    private final Boolean f64369h;

    /* renamed from: i */
    private final C29780a f64370i;

    public C25028a(long j, String str, String str2, String str3, String str4, String str5, List list, Boolean bool, C29780a aVar) {
        C41536l.m120489i(str3, "imageUrl");
        C41536l.m120489i(aVar, "externalFile");
        this.f64362a = j;
        this.f64363b = str;
        this.f64364c = str2;
        this.f64365d = str3;
        this.f64366e = str4;
        this.f64367f = str5;
        this.f64368g = list;
        this.f64369h = bool;
        this.f64370i = aVar;
    }

    /* renamed from: a */
    public final String mo63427a() {
        return this.f64363b;
    }

    /* renamed from: b */
    public final List mo63428b() {
        return this.f64368g;
    }

    /* renamed from: c */
    public final String mo63429c() {
        return this.f64367f;
    }

    /* renamed from: d */
    public final String mo63430d() {
        return this.f64364c;
    }

    /* renamed from: e */
    public final C29780a mo63431e() {
        return this.f64370i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25028a)) {
            return false;
        }
        C25028a aVar = (C25028a) obj;
        return this.f64362a == aVar.f64362a && C41536l.m120484d(this.f64363b, aVar.f64363b) && C41536l.m120484d(this.f64364c, aVar.f64364c) && C41536l.m120484d(this.f64365d, aVar.f64365d) && C41536l.m120484d(this.f64366e, aVar.f64366e) && C41536l.m120484d(this.f64367f, aVar.f64367f) && C41536l.m120484d(this.f64368g, aVar.f64368g) && C41536l.m120484d(this.f64369h, aVar.f64369h) && C41536l.m120484d(this.f64370i, aVar.f64370i);
    }

    /* renamed from: f */
    public final long mo63433f() {
        return this.f64362a;
    }

    /* renamed from: g */
    public final String mo63434g() {
        return this.f64365d;
    }

    /* renamed from: h */
    public final String mo63435h() {
        return this.f64366e;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f64362a) * 31;
        String str = this.f64363b;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f64364c;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f64365d.hashCode()) * 31;
        String str3 = this.f64366e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f64367f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f64368g;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.f64369h;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((hashCode5 + i) * 31) + this.f64370i.hashCode();
    }

    /* renamed from: i */
    public final Boolean mo63437i() {
        return this.f64369h;
    }

    public String toString() {
        long j = this.f64362a;
        String str = this.f64363b;
        String str2 = this.f64364c;
        String str3 = this.f64365d;
        String str4 = this.f64366e;
        String str5 = this.f64367f;
        List list = this.f64368g;
        Boolean bool = this.f64369h;
        C29780a aVar = this.f64370i;
        return "AnimationUiModel(id=" + j + ", availableAmount=" + str + ", designName=" + str2 + ", imageUrl=" + str3 + ", logoUrl=" + str4 + ", designJson=" + str5 + ", designGyro=" + list + ", isDark=" + bool + ", externalFile=" + aVar + ")";
    }
}

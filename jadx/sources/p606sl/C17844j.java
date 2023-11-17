package p606sl;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.designsystem.components.common.Image;

/* renamed from: sl.j */
public final class C17844j {

    /* renamed from: a */
    private long f50811a;

    /* renamed from: b */
    private String f50812b;

    /* renamed from: c */
    private String f50813c;

    /* renamed from: d */
    private String f50814d;

    /* renamed from: e */
    private Image f50815e;

    /* renamed from: f */
    private long f50816f;

    /* renamed from: g */
    private int f50817g;

    public C17844j(long j, String str, String str2, String str3, Image image, long j2, int i) {
        C41536l.m120489i(str, "clientKey");
        C41536l.m120489i(str2, "brandName");
        C41536l.m120489i(str3, "brandNameEn");
        this.f50811a = j;
        this.f50812b = str;
        this.f50813c = str2;
        this.f50814d = str3;
        this.f50815e = image;
        this.f50816f = j2;
        this.f50817g = i;
    }

    /* renamed from: a */
    public final String mo45484a() {
        return this.f50813c;
    }

    /* renamed from: b */
    public final String mo45485b() {
        return this.f50814d;
    }

    /* renamed from: c */
    public final Image mo45486c() {
        return this.f50815e;
    }

    /* renamed from: d */
    public final long mo45487d() {
        return this.f50811a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17844j)) {
            return false;
        }
        C17844j jVar = (C17844j) obj;
        return this.f50811a == jVar.f50811a && C41536l.m120484d(this.f50812b, jVar.f50812b) && C41536l.m120484d(this.f50813c, jVar.f50813c) && C41536l.m120484d(this.f50814d, jVar.f50814d) && C41536l.m120484d(this.f50815e, jVar.f50815e) && this.f50816f == jVar.f50816f && this.f50817g == jVar.f50817g;
    }

    public int hashCode() {
        int a = ((((((C7397t.m28148a(this.f50811a) * 31) + this.f50812b.hashCode()) * 31) + this.f50813c.hashCode()) * 31) + this.f50814d.hashCode()) * 31;
        Image image = this.f50815e;
        return ((((a + (image == null ? 0 : image.hashCode())) * 31) + C7397t.m28148a(this.f50816f)) * 31) + this.f50817g;
    }

    public String toString() {
        long j = this.f50811a;
        String str = this.f50812b;
        String str2 = this.f50813c;
        String str3 = this.f50814d;
        Image image = this.f50815e;
        long j2 = this.f50816f;
        int i = this.f50817g;
        return "BnplMerchant(merchantClientId=" + j + ", clientKey=" + str + ", brandName=" + str2 + ", brandNameEn=" + str3 + ", logo=" + image + ", ofrCategoryId=" + j2 + ", merchantCount=" + i + ")";
    }
}

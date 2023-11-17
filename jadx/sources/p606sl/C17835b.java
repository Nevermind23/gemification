package p606sl;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

/* renamed from: sl.b */
public final class C17835b {

    /* renamed from: f */
    public static final C17836a f50724f = new C17836a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private long f50725a;

    /* renamed from: b */
    private String f50726b;

    /* renamed from: c */
    private String f50727c;

    /* renamed from: d */
    private String f50728d;

    /* renamed from: e */
    private List f50729e;

    /* renamed from: sl.b$a */
    public static final class C17836a {
        private C17836a() {
        }

        public /* synthetic */ C17836a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C17834a mo45436a(C17835b bVar) {
            C41536l.m120489i(bVar, "<this>");
            return new C17834a(bVar.mo45430c(), bVar.mo45428a(), bVar.mo45429b(), bVar.mo45431d());
        }
    }

    public C17835b(long j, String str, String str2, String str3, List list) {
        C41536l.m120489i(str, "categoryDesc");
        C41536l.m120489i(str2, "categoryDescEn");
        C41536l.m120489i(str3, "categoryNameKey");
        C41536l.m120489i(list, "merchants");
        this.f50725a = j;
        this.f50726b = str;
        this.f50727c = str2;
        this.f50728d = str3;
        this.f50729e = list;
    }

    /* renamed from: a */
    public final String mo45428a() {
        return this.f50726b;
    }

    /* renamed from: b */
    public final String mo45429b() {
        return this.f50727c;
    }

    /* renamed from: c */
    public final long mo45430c() {
        return this.f50725a;
    }

    /* renamed from: d */
    public final String mo45431d() {
        return this.f50728d;
    }

    /* renamed from: e */
    public final List mo45432e() {
        return this.f50729e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17835b)) {
            return false;
        }
        C17835b bVar = (C17835b) obj;
        return this.f50725a == bVar.f50725a && C41536l.m120484d(this.f50726b, bVar.f50726b) && C41536l.m120484d(this.f50727c, bVar.f50727c) && C41536l.m120484d(this.f50728d, bVar.f50728d) && C41536l.m120484d(this.f50729e, bVar.f50729e);
    }

    public int hashCode() {
        return (((((((C7397t.m28148a(this.f50725a) * 31) + this.f50726b.hashCode()) * 31) + this.f50727c.hashCode()) * 31) + this.f50728d.hashCode()) * 31) + this.f50729e.hashCode();
    }

    public String toString() {
        long j = this.f50725a;
        String str = this.f50726b;
        String str2 = this.f50727c;
        String str3 = this.f50728d;
        List list = this.f50729e;
        return "BnplCategoryWithMerchants(categoryId=" + j + ", categoryDesc=" + str + ", categoryDescEn=" + str2 + ", categoryNameKey=" + str3 + ", merchants=" + list + ")";
    }
}

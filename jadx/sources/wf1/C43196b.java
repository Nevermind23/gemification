package wf1;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import dg1.C40681e;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: wf1.b */
public final class C43196b {

    /* renamed from: d */
    public static final C43197a f100769d = new C43197a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final C40681e f100770e;

    /* renamed from: f */
    public static final C40681e f100771f;

    /* renamed from: g */
    public static final C40681e f100772g;

    /* renamed from: h */
    public static final C40681e f100773h;

    /* renamed from: i */
    public static final C40681e f100774i;

    /* renamed from: j */
    public static final C40681e f100775j;

    /* renamed from: a */
    public final C40681e f100776a;

    /* renamed from: b */
    public final C40681e f100777b;

    /* renamed from: c */
    public final int f100778c;

    /* renamed from: wf1.b$a */
    public static final class C43197a {
        private C43197a() {
        }

        public /* synthetic */ C43197a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C40681e.C40682a aVar = C40681e.f96327g;
        f100770e = aVar.mo94822c(":");
        f100771f = aVar.mo94822c(":status");
        f100772g = aVar.mo94822c(":method");
        f100773h = aVar.mo94822c(":path");
        f100774i = aVar.mo94822c(":scheme");
        f100775j = aVar.mo94822c(":authority");
    }

    public C43196b(C40681e eVar, C40681e eVar2) {
        C41536l.m120489i(eVar, "name");
        C41536l.m120489i(eVar2, C11755a.C11756a.f34100b);
        this.f100776a = eVar;
        this.f100777b = eVar2;
        this.f100778c = eVar.mo94793B() + 32 + eVar2.mo94793B();
    }

    /* renamed from: a */
    public final C40681e mo101747a() {
        return this.f100776a;
    }

    /* renamed from: b */
    public final C40681e mo101748b() {
        return this.f100777b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43196b)) {
            return false;
        }
        C43196b bVar = (C43196b) obj;
        return C41536l.m120484d(this.f100776a, bVar.f100776a) && C41536l.m120484d(this.f100777b, bVar.f100777b);
    }

    public int hashCode() {
        return (this.f100776a.hashCode() * 31) + this.f100777b.hashCode();
    }

    public String toString() {
        return this.f100776a.mo94797F() + ": " + this.f100777b.mo94797F();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C43196b(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C41536l.m120489i(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            dg1.e$a r0 = dg1.C40681e.f96327g
            dg1.e r2 = r0.mo94822c(r2)
            dg1.e r3 = r0.mo94822c(r3)
            r1.<init>((dg1.C40681e) r2, (dg1.C40681e) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wf1.C43196b.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C43196b(C40681e eVar, String str) {
        this(eVar, C40681e.f96327g.mo94822c(str));
        C41536l.m120489i(eVar, "name");
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
    }
}

package p603si;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: si.a */
public final class C17796a extends ArrayList implements C17799b {

    /* renamed from: d */
    private final C17797a f50675d;

    /* renamed from: e */
    private C17799b f50676e;

    /* renamed from: si.a$a */
    public enum C17797a {
        ALL,
        ANY
    }

    /* renamed from: si.a$b */
    public /* synthetic */ class C17798b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f50680a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                si.a$a[] r0 = p603si.C17796a.C17797a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                si.a$a r1 = p603si.C17796a.C17797a.ALL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                si.a$a r1 = p603si.C17796a.C17797a.ANY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f50680a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p603si.C17796a.C17798b.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17796a(List list, C17797a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C41341q.m119907j() : list, (i & 2) != 0 ? C17797a.ALL : aVar);
    }

    /* renamed from: b */
    public String mo45383b() {
        C17799b bVar = this.f50676e;
        if (bVar != null) {
            return bVar.mo45383b();
        }
        return null;
    }

    /* renamed from: c */
    public Object[] mo45384c() {
        C17799b bVar = this.f50676e;
        if (bVar != null) {
            return bVar.mo45384c();
        }
        return null;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C17799b)) {
            return false;
        }
        return mo45388k((C17799b) obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: si.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: si.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: si.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: si.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo45386g(java.lang.String... r7) {
        /*
            r6 = this;
            java.lang.String r0 = "inputs"
            kotlin.jvm.internal.C41536l.m120489i(r7, r0)
            si.a$a r0 = r6.f50675d
            int[] r1 = p603si.C17796a.C17798b.f50680a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0022
            r7 = 2
            if (r0 == r7) goto L_0x001c
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L_0x001c:
            he1.l r7 = new he1.l
            r7.<init>(r1, r2, r1)
            throw r7
        L_0x0022:
            java.util.Iterator r0 = r6.iterator()
        L_0x0026:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0042
            java.lang.Object r3 = r0.next()
            r4 = r3
            si.b r4 = (p603si.C17799b) r4
            int r5 = r7.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r7, r5)
            java.lang.String[] r5 = (java.lang.String[]) r5
            boolean r4 = r4.mo45386g(r5)
            r4 = r4 ^ r2
            if (r4 == 0) goto L_0x0026
            r1 = r3
        L_0x0042:
            si.b r1 = (p603si.C17799b) r1
            r6.f50676e = r1
            if (r1 != 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r2 = 0
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p603si.C17796a.mo45386g(java.lang.String[]):boolean");
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C17799b)) {
            return -1;
        }
        return mo45391n((C17799b) obj);
    }

    /* renamed from: k */
    public /* bridge */ boolean mo45388k(C17799b bVar) {
        return super.contains(bVar);
    }

    /* renamed from: l */
    public /* bridge */ int mo45389l() {
        return super.size();
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C17799b)) {
            return -1;
        }
        return mo45392o((C17799b) obj);
    }

    /* renamed from: n */
    public /* bridge */ int mo45391n(C17799b bVar) {
        return super.indexOf(bVar);
    }

    /* renamed from: o */
    public /* bridge */ int mo45392o(C17799b bVar) {
        return super.lastIndexOf(bVar);
    }

    /* renamed from: r */
    public /* bridge */ boolean mo45393r(C17799b bVar) {
        return super.remove(bVar);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof C17799b)) {
            return false;
        }
        return mo45393r((C17799b) obj);
    }

    public final /* bridge */ int size() {
        return mo45389l();
    }

    public C17796a(List list, C17797a aVar) {
        C41536l.m120489i(list, "validators");
        C41536l.m120489i(aVar, "requirementType");
        this.f50675d = aVar;
        addAll(list);
    }
}

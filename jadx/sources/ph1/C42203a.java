package ph1;

import af1.C40296c;
import fh1.C40951a;
import ih1.C41368a;
import ih1.C41370b;
import java.util.ArrayList;
import java.util.List;
import kh1.C41518c;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import mh1.C41769a;
import nh1.C41806a;
import oh1.C41951b;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.error.NoBeanDefFoundException;
import sh1.C42576a;
import ue1.C43064a;

/* renamed from: ph1.a */
public final class C42203a {

    /* renamed from: a */
    private final ArrayList f99295a = new ArrayList();

    /* renamed from: b */
    private final C41951b f99296b;

    /* renamed from: c */
    private Object f99297c;

    /* renamed from: d */
    private final ArrayList f99298d;

    /* renamed from: e */
    private boolean f99299e;

    /* renamed from: f */
    private C41769a f99300f;

    /* renamed from: g */
    private final C41518c f99301g;

    /* renamed from: h */
    private final String f99302h;

    /* renamed from: i */
    private final C42205b f99303i;

    /* renamed from: j */
    private final C40951a f99304j;

    /* renamed from: ph1.a$a */
    static final class C42204a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C42203a f99305d;

        /* renamed from: e */
        final /* synthetic */ C41806a f99306e;

        /* renamed from: f */
        final /* synthetic */ C40296c f99307f;

        /* renamed from: g */
        final /* synthetic */ C43064a f99308g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42204a(C42203a aVar, C41806a aVar2, C40296c cVar, C43064a aVar3) {
            super(0);
            this.f99305d = aVar;
            this.f99306e = aVar2;
            this.f99307f = cVar;
            this.f99308g = aVar3;
        }

        public final Object invoke() {
            return this.f99305d.m122564l(this.f99306e, this.f99307f, this.f99308g);
        }
    }

    public C42203a(String str, C42205b bVar, C40951a aVar) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(bVar, "_scopeDefinition");
        C41536l.m120489i(aVar, "_koin");
        this.f99302h = str;
        this.f99303i = bVar;
        this.f99304j = aVar;
        this.f99296b = new C41951b(aVar, this);
        this.f99298d = new ArrayList();
        this.f99301g = aVar.mo95344b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0007 A[LOOP:0: B:1:0x0007->B:4:0x0017, LOOP_START, PHI: r1 
      PHI: (r1v1 java.lang.Object) = (r1v0 java.lang.Object), (r1v5 java.lang.Object) binds: [B:0:0x0000, B:4:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m122562f(af1.C40296c r4, nh1.C41806a r5, ue1.C43064a r6) {
        /*
            r3 = this;
            java.util.ArrayList r0 = r3.f99295a
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x0007:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0019
            java.lang.Object r1 = r0.next()
            ph1.a r1 = (ph1.C42203a) r1
            java.lang.Object r1 = r1.mo97677i(r4, r5, r6)
            if (r1 == 0) goto L_0x0007
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ph1.C42203a.m122562f(af1.c, nh1.a, ue1.a):java.lang.Object");
    }

    /* renamed from: h */
    private final Object m122563h(C40296c cVar) {
        if (!cVar.mo94324a(this.f99297c)) {
            return null;
        }
        Object obj = this.f99297c;
        if (!(obj instanceof Object)) {
            return null;
        }
        return obj;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final Object m122564l(C41806a aVar, C40296c cVar, C43064a aVar2) {
        if (!this.f99299e) {
            Object g = this.f99296b.mo97155g(C41370b.m120068a(cVar, aVar), aVar2);
            if (g == null) {
                C41518c b = this.f99304j.mo95344b();
                b.mo96284b('\'' + C42576a.m123264a(cVar) + "' - q:'" + aVar + "' not found in current scope");
                g = m122563h(cVar);
            }
            if (g == null) {
                C41518c b2 = this.f99304j.mo95344b();
                b2.mo96284b('\'' + C42576a.m123264a(cVar) + "' - q:'" + aVar + "' not found in current scope's source");
                C41769a aVar3 = this.f99300f;
                if (aVar3 != null) {
                    g = aVar3.mo94869b(cVar);
                } else {
                    g = null;
                }
            }
            if (g == null) {
                C41518c b3 = this.f99304j.mo95344b();
                b3.mo96284b('\'' + C42576a.m123264a(cVar) + "' - q:'" + aVar + "' not found in injected parameters");
                g = m122562f(cVar, aVar, aVar2);
            }
            if (g != null) {
                return g;
            }
            C41518c b4 = this.f99304j.mo95344b();
            b4.mo96284b('\'' + C42576a.m123264a(cVar) + "' - q:'" + aVar + "' not found in linked scopes");
            m122565n(aVar, cVar);
            throw new KotlinNothingValueException();
        }
        throw new ClosedScopeException("Scope '" + this.f99302h + "' is closed");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r5 != null) goto L_0x001d;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Void m122565n(nh1.C41806a r5, af1.C40296c r6) {
        /*
            r4 = this;
            r0 = 39
            if (r5 == 0) goto L_0x001b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " & qualifier:'"
            r1.append(r2)
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            if (r5 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            java.lang.String r5 = ""
        L_0x001d:
            org.koin.core.error.NoBeanDefFoundException r1 = new org.koin.core.error.NoBeanDefFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No definition found for class:'"
            r2.append(r3)
            java.lang.String r6 = sh1.C42576a.m123264a(r6)
            r2.append(r6)
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = ". Check your definitions!"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ph1.C42203a.m122565n(nh1.a, af1.c):java.lang.Void");
    }

    /* renamed from: b */
    public final void mo97670b(C41769a aVar) {
        C41536l.m120489i(aVar, "parameters");
        this.f99300f = aVar;
    }

    /* renamed from: c */
    public final void mo97671c() {
        this.f99300f = null;
    }

    /* renamed from: d */
    public final void mo97672d(List list) {
        C41536l.m120489i(list, "links");
        this.f99296b.mo97151a(this.f99303i.mo97682b());
        this.f99295a.addAll(list);
    }

    /* renamed from: e */
    public final void mo97673e() {
        if (this.f99303i.mo97683c()) {
            this.f99296b.mo97153c();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42203a)) {
            return false;
        }
        C42203a aVar = (C42203a) obj;
        return C41536l.m120484d(this.f99302h, aVar.f99302h) && C41536l.m120484d(this.f99303i, aVar.f99303i) && C41536l.m120484d(this.f99304j, aVar.f99304j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002b, code lost:
        if (r1 != null) goto L_0x0030;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo97675g(af1.C40296c r6, nh1.C41806a r7, ue1.C43064a r8) {
        /*
            r5 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.C41536l.m120489i(r6, r0)
            fh1.a r0 = r5.f99304j
            kh1.c r0 = r0.mo95344b()
            kh1.b r1 = kh1.C41517b.DEBUG
            boolean r0 = r0.mo96287f(r1)
            if (r0 == 0) goto L_0x0097
            r0 = 39
            if (r7 == 0) goto L_0x002e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " with qualifier '"
            r1.append(r2)
            r1.append(r7)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            java.lang.String r1 = ""
        L_0x0030:
            fh1.a r2 = r5.f99304j
            kh1.c r2 = r2.mo95344b()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "+- '"
            r3.append(r4)
            java.lang.String r4 = sh1.C42576a.m123264a(r6)
            r3.append(r4)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.mo96284b(r0)
            ph1.a$a r0 = new ph1.a$a
            r0.<init>(r5, r7, r6, r8)
            he1.m r7 = qh1.C42354a.m122847b(r0)
            java.lang.Object r8 = r7.mo95675a()
            java.lang.Object r7 = r7.mo95676b()
            java.lang.Number r7 = (java.lang.Number) r7
            double r0 = r7.doubleValue()
            fh1.a r7 = r5.f99304j
            kh1.c r7 = r7.mo95344b()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "|- '"
            r2.append(r3)
            java.lang.String r6 = sh1.C42576a.m123264a(r6)
            r2.append(r6)
            java.lang.String r6 = "' in "
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = " ms"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r7.mo96284b(r6)
            return r8
        L_0x0097:
            java.lang.Object r6 = r5.m122564l(r7, r6, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ph1.C42203a.mo97675g(af1.c, nh1.a, ue1.a):java.lang.Object");
    }

    public int hashCode() {
        String str = this.f99302h;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C42205b bVar = this.f99303i;
        int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        C40951a aVar = this.f99304j;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode2 + i;
    }

    /* renamed from: i */
    public final Object mo97677i(C40296c cVar, C41806a aVar, C43064a aVar2) {
        C41536l.m120489i(cVar, "clazz");
        try {
            return mo97675g(cVar, aVar, aVar2);
        } catch (ClosedScopeException unused) {
            C41518c b = this.f99304j.mo95344b();
            b.mo96284b("Koin.getOrNull - scope closed - no instance found for " + C42576a.m123264a(cVar) + " on scope " + toString());
            return null;
        } catch (NoBeanDefFoundException unused2) {
            C41518c b2 = this.f99304j.mo95344b();
            b2.mo96284b("Koin.getOrNull - no instance found for " + C42576a.m123264a(cVar) + " on scope " + toString());
            return null;
        }
    }

    /* renamed from: j */
    public final C42205b mo97678j() {
        return this.f99303i;
    }

    /* renamed from: k */
    public final void mo97679k(C41368a aVar) {
        C41536l.m120489i(aVar, "beanDefinition");
        this.f99296b.mo97152b(aVar);
    }

    /* renamed from: m */
    public final void mo97680m(Object obj) {
        this.f99297c = obj;
    }

    public String toString() {
        return "['" + this.f99302h + "']";
    }
}

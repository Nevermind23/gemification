package p034c3;

import androidx.lifecycle.C1612n;
import com.apollographql.apollo.exception.ApolloNetworkException;
import dg1.C40672b;
import dg1.C40681e;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import of1.C41869b0;
import of1.C41872c0;
import of1.C41880d0;
import of1.C41882e;
import of1.C41888f;
import of1.C41931v;
import of1.C41937x;
import of1.C41939y;
import p088g3.C6204a;
import p217q2.C7832d;
import p217q2.C7833e;
import p217q2.C7835f;
import p217q2.C7836g;
import p217q2.C7842i;
import p217q2.C7851m;
import p230r2.C8045b;
import p243s2.C8103c;
import p243s2.C8115i;
import p243s2.C8140s;
import p256t2.C8334b;
import p256t2.C8341f;
import p269u2.C8550a;
import p320y2.C9035a;
import p320y2.C9041b;

/* renamed from: c3.d */
public final class C2242d implements C9035a {

    /* renamed from: i */
    static final C41937x f6958i = C41937x.m121709g("application/json; charset=utf-8");

    /* renamed from: a */
    final C41931v f6959a;

    /* renamed from: b */
    final C41882e.C41883a f6960b;

    /* renamed from: c */
    final C8115i f6961c;

    /* renamed from: d */
    final boolean f6962d;

    /* renamed from: e */
    final C8103c f6963e;

    /* renamed from: f */
    final C7851m f6964f;

    /* renamed from: g */
    AtomicReference f6965g = new AtomicReference();

    /* renamed from: h */
    volatile boolean f6966h;

    /* renamed from: c3.d$a */
    class C2243a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C9035a.C9038c f6967d;

        /* renamed from: e */
        final /* synthetic */ C9035a.C9036a f6968e;

        C2243a(C9035a.C9038c cVar, C9035a.C9036a aVar) {
            this.f6967d = cVar;
            this.f6968e = aVar;
        }

        public void run() {
            C2242d.this.mo7185f(this.f6967d, this.f6968e);
        }
    }

    /* renamed from: c3.d$b */
    class C2244b implements C41888f {

        /* renamed from: a */
        final /* synthetic */ C41882e f6970a;

        /* renamed from: b */
        final /* synthetic */ C9035a.C9038c f6971b;

        /* renamed from: c */
        final /* synthetic */ C9035a.C9036a f6972c;

        C2244b(C41882e eVar, C9035a.C9038c cVar, C9035a.C9036a aVar) {
            this.f6970a = eVar;
            this.f6971b = cVar;
            this.f6972c = aVar;
        }

        /* renamed from: a */
        public void mo7189a(C41882e eVar, IOException iOException) {
            if (!C2242d.this.f6966h && C1612n.m5659a(C2242d.this.f6965g, this.f6970a, (Object) null)) {
                C2242d.this.f6963e.mo23289d(iOException, "Failed to execute http call for operation %s", this.f6971b.f25169b.name().name());
                this.f6972c.mo93d(new ApolloNetworkException("Failed to execute http call", iOException));
            }
        }

        /* renamed from: b */
        public void mo7190b(C41882e eVar, C41880d0 d0Var) {
            if (!C2242d.this.f6966h && C1612n.m5659a(C2242d.this.f6965g, this.f6970a, (Object) null)) {
                this.f6972c.mo91b(new C9035a.C9040d(d0Var));
                this.f6972c.mo90a();
            }
        }
    }

    /* renamed from: c3.d$c */
    private static final class C2245c {

        /* renamed from: a */
        public final String f6974a;

        /* renamed from: b */
        public final String f6975b;

        /* renamed from: c */
        public final File f6976c;

        C2245c(String str, String str2, File file) {
            this.f6974a = str;
            this.f6975b = str2;
            this.f6976c = file;
        }
    }

    public C2242d(C41931v vVar, C41882e.C41883a aVar, C8045b.C8048c cVar, boolean z, C7851m mVar, C8103c cVar2) {
        this.f6959a = (C41931v) C8140s.m30754b(vVar, "serverUrl == null");
        this.f6960b = (C41882e.C41883a) C8140s.m30754b(aVar, "httpCallFactory == null");
        this.f6961c = C8115i.m30669d(cVar);
        this.f6962d = z;
        this.f6964f = (C7851m) C8140s.m30754b(mVar, "scalarTypeAdapters == null");
        this.f6963e = (C8103c) C8140s.m30754b(cVar2, "logger == null");
    }

    /* renamed from: b */
    static void m8544b(C41931v.C41932a aVar, C7836g gVar) {
        C40672b bVar = new C40672b();
        C8341f U = C8341f.m31358U(bVar);
        U.mo23525h0(true);
        U.mo23513k();
        U.mo23508Q("persistedQuery").mo23513k().mo23508Q("version").mo23515n0(1).mo23508Q("sha256Hash").mo23519q0(gVar.operationId()).mo23516o();
        U.mo23516o();
        U.close();
        aVar.mo96980b("extensions", bVar.mo94746o1());
    }

    /* renamed from: c */
    static void m8545c(C41931v.C41932a aVar, C7836g gVar, C7851m mVar) {
        C40672b bVar = new C40672b();
        C8341f U = C8341f.m31358U(bVar);
        U.mo23525h0(true);
        U.mo23513k();
        gVar.variables().marshaller().marshal(new C8334b(U, mVar));
        U.mo23516o();
        U.close();
        aVar.mo96980b("variables", bVar.mo94746o1());
    }

    /* renamed from: d */
    static String m8546d(C7836g gVar, C7851m mVar) {
        return m8549k(gVar, mVar, true, true).mo94813s().mo94810o();
    }

    /* renamed from: h */
    static C41931v m8547h(C41931v vVar, C7836g gVar, C7851m mVar, boolean z, boolean z2) {
        C41931v.C41932a k = vVar.mo96956k();
        if (!z2 || z) {
            k.mo96980b("query", gVar.queryDocument());
        }
        if (gVar.variables() != C7836g.f22757a) {
            m8545c(k, gVar, mVar);
        }
        k.mo96980b("operationName", gVar.name().name());
        if (z2) {
            m8544b(k, gVar);
        }
        return k.mo96981c();
    }

    /* renamed from: i */
    static C41872c0 m8548i(C41872c0 c0Var, ArrayList arrayList) {
        C40672b bVar = new C40672b();
        C8341f U = C8341f.m31358U(bVar);
        U.mo23513k();
        for (int i = 0; i < arrayList.size(); i++) {
            U.mo23508Q(String.valueOf(i)).mo23510a();
            U.mo23519q0(((C2245c) arrayList.get(i)).f6974a);
            U.mo23514n();
        }
        U.mo23516o();
        U.close();
        C41939y.C41940a a = new C41939y.C41940a().mo97026e(C41939y.f98585l).mo97022a("operations", (String) null, c0Var).mo97022a("map", (String) null, C41872c0.m121331d(f6958i, bVar.mo94743n0()));
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C2245c cVar = (C2245c) arrayList.get(i2);
            a.mo97022a(String.valueOf(i2), cVar.f6976c.getName(), C41872c0.m121332e(C41937x.m121709g(cVar.f6975b), cVar.f6976c));
        }
        return a.mo97025d();
    }

    /* renamed from: k */
    static C40681e m8549k(C7836g gVar, C7851m mVar, boolean z, boolean z2) {
        if (gVar instanceof C7842i) {
            return ((C7842i) gVar).composeRequestBody(z2, z, mVar);
        }
        return gVar.composeRequestBody(mVar);
    }

    /* renamed from: l */
    private static void m8550l(Object obj, String str, ArrayList arrayList) {
        int i = 0;
        if (obj instanceof C7835f) {
            try {
                Field[] declaredFields = obj.getClass().getDeclaredFields();
                int length = declaredFields.length;
                while (i < length) {
                    Field field = declaredFields[i];
                    field.setAccessible(true);
                    m8550l(field.get(obj), str + "." + field.getName(), arrayList);
                    i++;
                }
            } catch (IllegalAccessException unused) {
            }
        } else if (obj instanceof C7833e) {
            m8550l(((C7833e) obj).f22755a, str, arrayList);
        } else if (obj instanceof C7832d) {
            C7832d dVar = (C7832d) obj;
            arrayList.add(new C2245c(str, dVar.mo22762b(), new File(dVar.mo22761a())));
            System.out.println(str);
        } else if (obj instanceof C7832d[]) {
            C7832d[] dVarArr = (C7832d[]) obj;
            int length2 = dVarArr.length;
            int i2 = 0;
            while (i < length2) {
                C7832d dVar2 = dVarArr[i];
                String str2 = str + "." + i2;
                arrayList.add(new C2245c(str2, dVar2.mo22762b(), new File(dVar2.mo22761a())));
                System.out.println(str2);
                i2++;
                i++;
            }
        } else if (obj instanceof Collection) {
            Object[] array = ((Collection) obj).toArray();
            while (i < array.length) {
                m8550l(array[i], str + "." + i, arrayList);
                i++;
            }
        }
    }

    /* renamed from: m */
    static C41872c0 m8551m(C41872c0 c0Var, C7836g gVar) {
        ArrayList arrayList = new ArrayList();
        for (String str : gVar.variables().valueMap().keySet()) {
            Object obj = gVar.variables().valueMap().get(str);
            m8550l(obj, "variables." + str, arrayList);
        }
        if (arrayList.isEmpty()) {
            return c0Var;
        }
        return m8548i(c0Var, arrayList);
    }

    /* renamed from: a */
    public void mo84a(C9035a.C9038c cVar, C9041b bVar, Executor executor, C9035a.C9036a aVar) {
        executor.execute(new C2243a(cVar, aVar));
    }

    public void dispose() {
        this.f6966h = true;
        C41882e eVar = (C41882e) this.f6965g.getAndSet((Object) null);
        if (eVar != null) {
            eVar.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo7184e(C41869b0.C41870a aVar, C7836g gVar, C8550a aVar2, C6204a aVar3) {
        aVar.mo96691i("Accept", "application/json").mo96691i("X-APOLLO-OPERATION-ID", gVar.operationId()).mo96691i("X-APOLLO-OPERATION-NAME", gVar.name().name()).mo96704v(gVar.operationId());
        for (String str : aVar3.mo19787c()) {
            aVar.mo96691i(str, aVar3.mo19786b(str));
        }
        if (this.f6961c.mo23280f()) {
            C8045b.C8048c cVar = (C8045b.C8048c) this.f6961c.mo23278e();
            aVar.mo96691i("X-APOLLO-CACHE-KEY", m8546d(gVar, this.f6964f)).mo96691i("X-APOLLO-CACHE-FETCH-STRATEGY", cVar.f23202a.name()).mo96691i("X-APOLLO-EXPIRE-TIMEOUT", String.valueOf(cVar.mo23211a())).mo96691i("X-APOLLO-EXPIRE-AFTER-READ", Boolean.toString(cVar.f23205d)).mo96691i("X-APOLLO-PREFETCH", Boolean.toString(this.f6962d)).mo96691i("X-APOLLO-CACHE-DO-NOT-STORE", Boolean.toString("true".equalsIgnoreCase(aVar2.mo23913a("do-not-store"))));
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7185f(p320y2.C9035a.C9038c r8, p320y2.C9035a.C9036a r9) {
        /*
            r7 = this;
            boolean r0 = r7.f6966h
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            y2.a$b r0 = p320y2.C9035a.C9037b.NETWORK
            r9.mo92c(r0)
            boolean r0 = r8.f25175h     // Catch:{ IOException -> 0x0059 }
            if (r0 == 0) goto L_0x0022
            q2.g r2 = r8.f25169b     // Catch:{ IOException -> 0x0059 }
            boolean r0 = r2 instanceof p217q2.C7842i     // Catch:{ IOException -> 0x0059 }
            if (r0 == 0) goto L_0x0022
            u2.a r3 = r8.f25170c     // Catch:{ IOException -> 0x0059 }
            g3.a r4 = r8.f25171d     // Catch:{ IOException -> 0x0059 }
            boolean r5 = r8.f25174g     // Catch:{ IOException -> 0x0059 }
            boolean r6 = r8.f25176i     // Catch:{ IOException -> 0x0059 }
            r1 = r7
            of1.e r0 = r1.mo7186g(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x0059 }
            goto L_0x0031
        L_0x0022:
            q2.g r2 = r8.f25169b     // Catch:{ IOException -> 0x0059 }
            u2.a r3 = r8.f25170c     // Catch:{ IOException -> 0x0059 }
            g3.a r4 = r8.f25171d     // Catch:{ IOException -> 0x0059 }
            boolean r5 = r8.f25174g     // Catch:{ IOException -> 0x0059 }
            boolean r6 = r8.f25176i     // Catch:{ IOException -> 0x0059 }
            r1 = r7
            of1.e r0 = r1.mo7187j(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x0059 }
        L_0x0031:
            java.util.concurrent.atomic.AtomicReference r1 = r7.f6965g
            java.lang.Object r1 = r1.getAndSet(r0)
            of1.e r1 = (of1.C41882e) r1
            if (r1 == 0) goto L_0x003e
            r1.cancel()
        L_0x003e:
            boolean r1 = r0.mo96790x()
            if (r1 != 0) goto L_0x0052
            boolean r1 = r7.f6966h
            if (r1 == 0) goto L_0x0049
            goto L_0x0052
        L_0x0049:
            c3.d$b r1 = new c3.d$b
            r1.<init>(r0, r8, r9)
            com.google.firebase.perf.network.FirebasePerfOkHttpClient.enqueue(r0, r1)
            return
        L_0x0052:
            java.util.concurrent.atomic.AtomicReference r8 = r7.f6965g
            r9 = 0
            androidx.lifecycle.C1612n.m5659a(r8, r0, r9)
            return
        L_0x0059:
            r0 = move-exception
            s2.c r1 = r7.f6963e
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            q2.g r8 = r8.f25169b
            q2.h r8 = r8.name()
            java.lang.String r8 = r8.name()
            r3 = 0
            r2[r3] = r8
            java.lang.String r8 = "Failed to prepare http call for operation %s"
            r1.mo23289d(r0, r8, r2)
            com.apollographql.apollo.exception.ApolloNetworkException r8 = new com.apollographql.apollo.exception.ApolloNetworkException
            java.lang.String r1 = "Failed to prepare http call"
            r8.<init>(r1, r0)
            r9.mo93d(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c3.C2242d.mo7185f(y2.a$c, y2.a$a):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C41882e mo7186g(C7836g gVar, C8550a aVar, C6204a aVar2, boolean z, boolean z2) {
        C41869b0.C41870a e = new C41869b0.C41870a().mo96706x(m8547h(this.f6959a, gVar, this.f6964f, z, z2)).mo96687e();
        mo7184e(e, gVar, aVar, aVar2);
        return this.f6960b.mo96791a(e.mo96684b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C41882e mo7187j(C7836g gVar, C8550a aVar, C6204a aVar2, boolean z, boolean z2) {
        C41869b0.C41870a m = new C41869b0.C41870a().mo96706x(this.f6959a).mo96691i("Content-Type", "application/json").mo96695m(m8551m(C41872c0.m121331d(f6958i, m8549k(gVar, this.f6964f, z, z2)), gVar));
        mo7184e(m, gVar, aVar, aVar2);
        return this.f6960b.mo96791a(m.mo96684b());
    }
}

package p736ds;

import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p891su.C28261a;
import p891su.C28262b;
import p891su.C28267d;
import p891su.C28269e;
import ue1.C43075l;

/* renamed from: ds.b */
public final class C20052b implements C20051a {

    /* renamed from: d */
    private final ArrayList f54668d = new ArrayList();

    /* renamed from: ds.b$a */
    static final class C20053a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f54669d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20053a(String str) {
            super(1);
            this.f54669d = str;
        }

        /* renamed from: a */
        public final Boolean invoke(C28262b bVar) {
            C41536l.m120489i(bVar, "it");
            return Boolean.valueOf(C41536l.m120484d(bVar.mo67869d(), this.f54669d));
        }
    }

    /* renamed from: ds.b$b */
    static final class C20054b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28261a f54670d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20054b(C28261a aVar) {
            super(1);
            this.f54670d = aVar;
        }

        /* renamed from: a */
        public final Boolean invoke(C28261a aVar) {
            boolean z;
            C41536l.m120489i(aVar, "it");
            if (aVar.mo67857m() == this.f54670d.mo67857m()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: A3 */
    public synchronized C28261a mo48462A3(long j, C28262b bVar) {
        boolean z;
        C28262b bVar2 = bVar;
        synchronized (this) {
            C41536l.m120489i(bVar2, "newAccount");
            Iterator it = this.f54668d.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((C28261a) it.next()).mo67857m() == j) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return null;
            }
            C28261a aVar = (C28261a) this.f54668d.get(i);
            C41536l.m120488h(aVar, "addAccount$lambda$2");
            List B0 = C41358y.m119991B0(aVar.mo67845c());
            B0.add(bVar2);
            C41238w wVar = C41238w.f97225a;
            C28261a b = C28261a.m86864b(aVar, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (C28267d) null, B0, (C28269e) null, 0, false, false, false, false, (String) null, false, false, 130943, (Object) null);
            this.f54668d.set(i, b);
            return b;
        }
    }

    /* renamed from: K3 */
    public synchronized List mo48463K3() {
        return new ArrayList(this.f54668d);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: su.b} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Number] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p891su.C28262b mo48464L0(long r31, p891su.C28262b r33) {
        /*
            r30 = this;
            r1 = r30
            r0 = r33
            monitor-enter(r30)
            java.lang.String r2 = "updatedAccount"
            kotlin.jvm.internal.C41536l.m120489i(r0, r2)     // Catch:{ all -> 0x0123 }
            java.util.ArrayList r2 = r1.f54668d     // Catch:{ all -> 0x0123 }
            java.lang.Iterable r2 = ie1.C41358y.m119995F0(r2)     // Catch:{ all -> 0x0123 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0123 }
        L_0x0014:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0123 }
            r4 = 1
            r5 = 0
            r6 = 0
            if (r3 == 0) goto L_0x0038
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0123 }
            r7 = r3
            ie1.h0 r7 = (ie1.C41324h0) r7     // Catch:{ all -> 0x0123 }
            java.lang.Object r7 = r7.mo95946d()     // Catch:{ all -> 0x0123 }
            su.a r7 = (p891su.C28261a) r7     // Catch:{ all -> 0x0123 }
            long r7 = r7.mo67857m()     // Catch:{ all -> 0x0123 }
            int r7 = (r7 > r31 ? 1 : (r7 == r31 ? 0 : -1))
            if (r7 != 0) goto L_0x0034
            r7 = r4
            goto L_0x0035
        L_0x0034:
            r7 = r5
        L_0x0035:
            if (r7 == 0) goto L_0x0014
            goto L_0x0039
        L_0x0038:
            r3 = r6
        L_0x0039:
            ie1.h0 r3 = (ie1.C41324h0) r3     // Catch:{ all -> 0x0123 }
            if (r3 == 0) goto L_0x0121
            int r2 = r3.mo95943a()     // Catch:{ all -> 0x0123 }
            java.lang.Object r3 = r3.mo95944b()     // Catch:{ all -> 0x0123 }
            r7 = r3
            su.a r7 = (p891su.C28261a) r7     // Catch:{ all -> 0x0123 }
            java.util.List r3 = r7.mo67845c()     // Catch:{ all -> 0x0123 }
            java.util.List r3 = ie1.C41358y.m119991B0(r3)     // Catch:{ all -> 0x0123 }
            java.lang.Iterable r8 = ie1.C41358y.m119995F0(r3)     // Catch:{ all -> 0x0123 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0123 }
        L_0x0058:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0123 }
            if (r9 == 0) goto L_0x008b
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0123 }
            r10 = r9
            ie1.h0 r10 = (ie1.C41324h0) r10     // Catch:{ all -> 0x0123 }
            java.lang.Object r11 = r10.mo95946d()     // Catch:{ all -> 0x0123 }
            su.b r11 = (p891su.C28262b) r11     // Catch:{ all -> 0x0123 }
            boolean r11 = r11.mo67873g()     // Catch:{ all -> 0x0123 }
            if (r11 == 0) goto L_0x0087
            java.lang.Object r10 = r10.mo95946d()     // Catch:{ all -> 0x0123 }
            su.b r10 = (p891su.C28262b) r10     // Catch:{ all -> 0x0123 }
            java.lang.String r10 = r10.mo67869d()     // Catch:{ all -> 0x0123 }
            java.lang.String r11 = r33.mo67869d()     // Catch:{ all -> 0x0123 }
            boolean r10 = kotlin.jvm.internal.C41536l.m120484d(r10, r11)     // Catch:{ all -> 0x0123 }
            if (r10 != 0) goto L_0x0087
            r10 = r4
            goto L_0x0088
        L_0x0087:
            r10 = r5
        L_0x0088:
            if (r10 == 0) goto L_0x0058
            goto L_0x008c
        L_0x008b:
            r9 = r6
        L_0x008c:
            ie1.h0 r9 = (ie1.C41324h0) r9     // Catch:{ all -> 0x0123 }
            if (r9 == 0) goto L_0x00b6
            int r8 = r9.mo95943a()     // Catch:{ all -> 0x0123 }
            java.lang.Object r9 = r9.mo95944b()     // Catch:{ all -> 0x0123 }
            r10 = r9
            su.b r10 = (p891su.C28262b) r10     // Catch:{ all -> 0x0123 }
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 23
            r18 = 0
            su.b r9 = p891su.C28262b.m86885b(r10, r11, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0123 }
            r3.set(r8, r9)     // Catch:{ all -> 0x0123 }
            java.lang.Object r8 = r3.get(r8)     // Catch:{ all -> 0x0123 }
            su.b r8 = (p891su.C28262b) r8     // Catch:{ all -> 0x0123 }
            r29 = r8
            goto L_0x00b8
        L_0x00b6:
            r29 = r6
        L_0x00b8:
            java.util.Iterator r8 = r3.iterator()     // Catch:{ all -> 0x0123 }
            r9 = r5
        L_0x00bd:
            boolean r10 = r8.hasNext()     // Catch:{ all -> 0x0123 }
            r11 = -1
            if (r10 == 0) goto L_0x00dc
            java.lang.Object r10 = r8.next()     // Catch:{ all -> 0x0123 }
            su.b r10 = (p891su.C28262b) r10     // Catch:{ all -> 0x0123 }
            java.lang.String r10 = r10.mo67869d()     // Catch:{ all -> 0x0123 }
            java.lang.String r12 = r33.mo67869d()     // Catch:{ all -> 0x0123 }
            boolean r10 = kotlin.jvm.internal.C41536l.m120484d(r10, r12)     // Catch:{ all -> 0x0123 }
            if (r10 == 0) goto L_0x00d9
            goto L_0x00dd
        L_0x00d9:
            int r9 = r9 + 1
            goto L_0x00bd
        L_0x00dc:
            r9 = r11
        L_0x00dd:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0123 }
            int r9 = r8.intValue()     // Catch:{ all -> 0x0123 }
            if (r9 == r11) goto L_0x00e8
            goto L_0x00e9
        L_0x00e8:
            r4 = r5
        L_0x00e9:
            if (r4 == 0) goto L_0x00ec
            r6 = r8
        L_0x00ec:
            if (r6 == 0) goto L_0x00f5
            int r4 = r6.intValue()     // Catch:{ all -> 0x0123 }
            r3.set(r4, r0)     // Catch:{ all -> 0x0123 }
        L_0x00f5:
            java.util.ArrayList r0 = r1.f54668d     // Catch:{ all -> 0x0123 }
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 130943(0x1ff7f, float:1.8349E-40)
            r28 = 0
            r16 = r3
            su.a r3 = p891su.C28261a.m86864b(r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0123 }
            r0.set(r2, r3)     // Catch:{ all -> 0x0123 }
            r6 = r29
        L_0x0121:
            monitor-exit(r30)
            return r6
        L_0x0123:
            r0 = move-exception
            monitor-exit(r30)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p736ds.C20052b.mo48464L0(long, su.b):su.b");
    }

    /* renamed from: R2 */
    public synchronized void mo48465R2(C28261a aVar) {
        C41536l.m120489i(aVar, "contact");
        boolean unused = C41352v.m119961F(this.f54668d, new C20054b(aVar));
    }

    /* renamed from: R3 */
    public C28261a mo48466R3(long j) {
        Object obj;
        boolean z;
        Iterator it = this.f54668d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C28261a) obj).mo67857m() == j) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (C28261a) obj;
    }

    public synchronized void clean() {
        this.f54668d.clear();
    }

    /* renamed from: f */
    public synchronized C28261a mo48467f(long j, String str) {
        boolean z;
        String str2 = str;
        synchronized (this) {
            C41536l.m120489i(str2, "accountNumber");
            Iterator it = this.f54668d.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((C28261a) it.next()).mo67857m() == j) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return null;
            }
            Object obj = this.f54668d.get(i);
            C41536l.m120488h(obj, "contacts[index]");
            C28261a aVar = (C28261a) obj;
            List B0 = C41358y.m119991B0(aVar.mo67845c());
            boolean unused = C41352v.m119961F(B0, new C20053a(str2));
            C28261a b = C28261a.m86864b(aVar, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (C28267d) null, B0, (C28269e) null, 0, false, false, false, false, (String) null, false, false, 130943, (Object) null);
            this.f54668d.set(i, b);
            return b;
        }
    }

    /* renamed from: i0 */
    public synchronized void mo48468i0(List list, boolean z) {
        C41536l.m120489i(list, "contacts");
        if (!z) {
            this.f54668d.clear();
        }
        this.f54668d.addAll(list);
    }

    /* renamed from: j0 */
    public synchronized void mo48469j0(C28261a aVar) {
        boolean z;
        C41536l.m120489i(aVar, "contact");
        Iterator it = this.f54668d.iterator();
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((C28261a) it.next()).mo67857m() == aVar.mo67857m()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i++;
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() != -1) {
            z2 = true;
        }
        if (!z2) {
            valueOf = null;
        }
        if (valueOf != null) {
            this.f54668d.set(valueOf.intValue(), aVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: su.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: su.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: su.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: su.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: su.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p891su.C28262b mo48470m1(long r6, java.lang.String r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "accountNumber"
            kotlin.jvm.internal.C41536l.m120489i(r8, r0)     // Catch:{ all -> 0x0053 }
            java.util.ArrayList r0 = r5.f54668d     // Catch:{ all -> 0x0053 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0053 }
        L_0x000c:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0053 }
            r2 = 0
            if (r1 == 0) goto L_0x0028
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0053 }
            r3 = r1
            su.a r3 = (p891su.C28261a) r3     // Catch:{ all -> 0x0053 }
            long r3 = r3.mo67857m()     // Catch:{ all -> 0x0053 }
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0024
            r3 = 1
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            if (r3 == 0) goto L_0x000c
            goto L_0x0029
        L_0x0028:
            r1 = r2
        L_0x0029:
            su.a r1 = (p891su.C28261a) r1     // Catch:{ all -> 0x0053 }
            if (r1 == 0) goto L_0x0051
            java.util.List r6 = r1.mo67845c()     // Catch:{ all -> 0x0053 }
            if (r6 == 0) goto L_0x0051
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0053 }
        L_0x0037:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0053 }
            if (r7 == 0) goto L_0x004f
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0053 }
            r0 = r7
            su.b r0 = (p891su.C28262b) r0     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = r0.mo67869d()     // Catch:{ all -> 0x0053 }
            boolean r0 = kotlin.jvm.internal.C41536l.m120484d(r0, r8)     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0037
            r2 = r7
        L_0x004f:
            su.b r2 = (p891su.C28262b) r2     // Catch:{ all -> 0x0053 }
        L_0x0051:
            monitor-exit(r5)
            return r2
        L_0x0053:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p736ds.C20052b.mo48470m1(long, java.lang.String):su.b");
    }

    public synchronized int size() {
        return this.f54668d.size();
    }
}

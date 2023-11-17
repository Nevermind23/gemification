package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.C3846a;
import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.common.api.internal.C3871b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import p156l6.C6935d;
import p156l6.C6940f;
import p156l6.C6946i;
import p156l6.C6950k;
import p182n6.C7249c;
import p182n6.C7264i;
import p274u7.C8641a;
import p274u7.C8644d;

/* renamed from: com.google.android.gms.common.api.c */
public abstract class C3860c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Set f12284a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: com.google.android.gms.common.api.c$a */
    public static final class C3861a {

        /* renamed from: a */
        private Account f12285a;

        /* renamed from: b */
        private final Set f12286b = new HashSet();

        /* renamed from: c */
        private final Set f12287c = new HashSet();

        /* renamed from: d */
        private int f12288d;

        /* renamed from: e */
        private View f12289e;

        /* renamed from: f */
        private String f12290f;

        /* renamed from: g */
        private String f12291g;

        /* renamed from: h */
        private final Map f12292h = new ArrayMap();

        /* renamed from: i */
        private final Context f12293i;

        /* renamed from: j */
        private final Map f12294j = new ArrayMap();

        /* renamed from: k */
        private C6940f f12295k;

        /* renamed from: l */
        private int f12296l = -1;

        /* renamed from: m */
        private C3863c f12297m;

        /* renamed from: n */
        private Looper f12298n;

        /* renamed from: o */
        private C3846a f12299o = C3846a.m14468q();

        /* renamed from: p */
        private C3847a.C3848a f12300p = C8644d.f24424c;

        /* renamed from: q */
        private final ArrayList f12301q = new ArrayList();

        /* renamed from: r */
        private final ArrayList f12302r = new ArrayList();

        public C3861a(Context context) {
            this.f12293i = context;
            this.f12298n = context.getMainLooper();
            this.f12290f = context.getPackageName();
            this.f12291g = context.getClass().getName();
        }

        /* renamed from: a */
        public C3861a mo11961a(C3847a aVar) {
            C7264i.m27903l(aVar, "Api must not be null");
            this.f12294j.put(aVar, (Object) null);
            List a = ((C3847a.C3854e) C7264i.m27903l(aVar.mo11915c(), "Base client builder must not be null")).mo114a((Object) null);
            this.f12287c.addAll(a);
            this.f12286b.addAll(a);
            return this;
        }

        /* renamed from: b */
        public C3861a mo11962b(C3862b bVar) {
            C7264i.m27903l(bVar, "Listener must not be null");
            this.f12301q.add(bVar);
            return this;
        }

        /* renamed from: c */
        public C3861a mo11963c(C3863c cVar) {
            C7264i.m27903l(cVar, "Listener must not be null");
            this.f12302r.add(cVar);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: com.google.android.gms.common.api.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.android.gms.common.api.C3860c mo11964d() {
            /*
                r22 = this;
                r1 = r22
                java.util.Map r0 = r1.f12294j
                boolean r0 = r0.isEmpty()
                r2 = 1
                r0 = r0 ^ r2
                java.lang.String r3 = "must call addApi() to add at least one API"
                p182n6.C7264i.m27893b(r0, r3)
                n6.c r0 = r22.mo11965e()
                java.util.Map r3 = r0.mo21625k()
                androidx.collection.ArrayMap r11 = new androidx.collection.ArrayMap
                r11.<init>()
                androidx.collection.ArrayMap r14 = new androidx.collection.ArrayMap
                r14.<init>()
                java.util.ArrayList r15 = new java.util.ArrayList
                r15.<init>()
                java.util.Map r4 = r1.f12294j
                java.util.Set r4 = r4.keySet()
                java.util.Iterator r12 = r4.iterator()
                r4 = 0
                r13 = 0
                r16 = r4
                r17 = r13
            L_0x0036:
                boolean r4 = r12.hasNext()
                if (r4 == 0) goto L_0x00d4
                java.lang.Object r4 = r12.next()
                r10 = r4
                com.google.android.gms.common.api.a r10 = (com.google.android.gms.common.api.C3847a) r10
                java.util.Map r4 = r1.f12294j
                java.lang.Object r18 = r4.get(r10)
                java.lang.Object r4 = r3.get(r10)
                if (r4 == 0) goto L_0x0051
                r4 = r2
                goto L_0x0052
            L_0x0051:
                r4 = r13
            L_0x0052:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
                r11.put(r10, r5)
                l6.l0 r9 = new l6.l0
                r9.<init>(r10, r4)
                r15.add(r9)
                com.google.android.gms.common.api.a$a r4 = r10.mo11913a()
                java.lang.Object r4 = p182n6.C7264i.m27902k(r4)
                r19 = r4
                com.google.android.gms.common.api.a$a r19 = (com.google.android.gms.common.api.C3847a.C3848a) r19
                android.content.Context r5 = r1.f12293i
                android.os.Looper r6 = r1.f12298n
                r4 = r19
                r7 = r0
                r8 = r18
                r20 = r9
                r21 = r10
                r10 = r20
                com.google.android.gms.common.api.a$f r4 = r4.mo113c(r5, r6, r7, r8, r9, r10)
                com.google.android.gms.common.api.a$c r5 = r21.mo11914b()
                r14.put(r5, r4)
                int r5 = r19.mo11917b()
                if (r5 != r2) goto L_0x0094
                if (r18 == 0) goto L_0x0092
                r17 = r2
                goto L_0x0094
            L_0x0092:
                r17 = r13
            L_0x0094:
                boolean r4 = r4.mo11920d()
                if (r4 == 0) goto L_0x0036
                if (r16 != 0) goto L_0x009f
                r16 = r21
                goto L_0x0036
            L_0x009f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = r21.mo11916d()
                java.lang.String r3 = r16.mo11916d()
                java.lang.String r4 = java.lang.String.valueOf(r2)
                int r4 = r4.length()
                java.lang.String r5 = java.lang.String.valueOf(r3)
                int r5 = r5.length()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                int r4 = r4 + 21
                int r4 = r4 + r5
                r6.<init>(r4)
                r6.append(r2)
                java.lang.String r2 = " cannot be used with "
                r6.append(r2)
                r6.append(r3)
                java.lang.String r2 = r6.toString()
                r0.<init>(r2)
                throw r0
            L_0x00d4:
                if (r16 == 0) goto L_0x012c
                if (r17 != 0) goto L_0x0102
                android.accounts.Account r3 = r1.f12285a
                if (r3 != 0) goto L_0x00de
                r3 = r2
                goto L_0x00df
            L_0x00de:
                r3 = r13
            L_0x00df:
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r5 = r16.mo11916d()
                r4[r13] = r5
                java.lang.String r5 = "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead"
                p182n6.C7264i.m27907p(r3, r5, r4)
                java.util.Set r3 = r1.f12286b
                java.util.Set r4 = r1.f12287c
                boolean r3 = r3.equals(r4)
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r5 = r16.mo11916d()
                r4[r13] = r5
                java.lang.String r5 = "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead."
                p182n6.C7264i.m27907p(r3, r5, r4)
                goto L_0x012c
            L_0x0102:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = r16.mo11916d()
                java.lang.String r3 = java.lang.String.valueOf(r2)
                int r3 = r3.length()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                int r3 = r3 + 82
                r4.<init>(r3)
                java.lang.String r3 = "With using "
                r4.append(r3)
                r4.append(r2)
                java.lang.String r2 = ", GamesOptions can only be specified within GoogleSignInOptions.Builder"
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                r0.<init>(r2)
                throw r0
            L_0x012c:
                java.util.Collection r3 = r14.values()
                int r16 = com.google.android.gms.common.api.internal.C3890g0.m14727p(r3, r2)
                com.google.android.gms.common.api.internal.g0 r2 = new com.google.android.gms.common.api.internal.g0
                android.content.Context r5 = r1.f12293i
                java.util.concurrent.locks.ReentrantLock r6 = new java.util.concurrent.locks.ReentrantLock
                r6.<init>()
                android.os.Looper r7 = r1.f12298n
                com.google.android.gms.common.a r9 = r1.f12299o
                com.google.android.gms.common.api.a$a r10 = r1.f12300p
                java.util.ArrayList r12 = r1.f12301q
                java.util.ArrayList r13 = r1.f12302r
                int r3 = r1.f12296l
                r4 = r2
                r8 = r0
                r0 = r15
                r15 = r3
                r17 = r0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                java.util.Set r3 = com.google.android.gms.common.api.C3860c.f12284a
                monitor-enter(r3)
                java.util.Set r0 = com.google.android.gms.common.api.C3860c.f12284a     // Catch:{ all -> 0x0171 }
                r0.add(r2)     // Catch:{ all -> 0x0171 }
                monitor-exit(r3)     // Catch:{ all -> 0x0171 }
                int r0 = r1.f12296l
                if (r0 < 0) goto L_0x0170
                l6.f r0 = r1.f12295k
                com.google.android.gms.common.api.internal.i1 r0 = com.google.android.gms.common.api.internal.C3898i1.m14769t(r0)
                int r3 = r1.f12296l
                com.google.android.gms.common.api.c$c r4 = r1.f12297m
                r0.mo12090u(r3, r2, r4)
            L_0x0170:
                return r2
            L_0x0171:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0171 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C3860c.C3861a.mo11964d():com.google.android.gms.common.api.c");
        }

        /* renamed from: e */
        public final C7249c mo11965e() {
            C8641a aVar = C8641a.f24412m;
            Map map = this.f12294j;
            C3847a aVar2 = C8644d.f24428g;
            if (map.containsKey(aVar2)) {
                aVar = (C8641a) this.f12294j.get(aVar2);
            }
            return new C7249c(this.f12285a, this.f12286b, this.f12292h, this.f12288d, this.f12289e, this.f12290f, this.f12291g, aVar, false);
        }
    }

    /* renamed from: com.google.android.gms.common.api.c$b */
    public interface C3862b extends C6935d {
    }

    /* renamed from: com.google.android.gms.common.api.c$c */
    public interface C3863c extends C6946i {
    }

    /* renamed from: h */
    public static Set m14546h() {
        Set set = f12284a;
        synchronized (set) {
        }
        return set;
    }

    /* renamed from: d */
    public abstract void mo11951d();

    /* renamed from: e */
    public abstract void mo11952e();

    /* renamed from: f */
    public abstract void mo11953f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: g */
    public abstract C3871b mo11954g(C3871b bVar);

    /* renamed from: i */
    public abstract Looper mo11955i();

    /* renamed from: j */
    public abstract boolean mo11956j();

    /* renamed from: k */
    public boolean mo11957k(C6950k kVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: l */
    public void mo11958l() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: m */
    public abstract void mo11959m(C3863c cVar);

    /* renamed from: n */
    public abstract void mo11960n(C3863c cVar);
}

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.C3846a;
import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.common.api.C3860c;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import p156l6.C6935d;
import p156l6.C6946i;
import p182n6.C7249c;
import p182n6.C7264i;
import p182n6.C7291w;

/* renamed from: com.google.android.gms.common.internal.c */
public abstract class C3964c extends C3958b implements C3847a.C3855f, C7291w {

    /* renamed from: F */
    private final C7249c f12678F;

    /* renamed from: G */
    private final Set f12679G;

    /* renamed from: H */
    private final Account f12680H;

    protected C3964c(Context context, Looper looper, int i, C7249c cVar, C3860c.C3862b bVar, C3860c.C3863c cVar2) {
        this(context, looper, i, cVar, (C6935d) bVar, (C6946i) cVar2);
    }

    /* renamed from: q0 */
    private final Set m15076q0(Set set) {
        Set<Scope> p0 = mo12260p0(set);
        for (Scope contains : p0) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return p0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Executor mo12217B() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final Set mo12222H() {
        return this.f12679G;
    }

    /* renamed from: m */
    public Set mo11926m() {
        return mo7052k() ? this.f12679G : Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public final C7249c mo12259o0() {
        return this.f12678F;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public Set mo12260p0(Set set) {
        return set;
    }

    /* renamed from: z */
    public final Account mo12255z() {
        return this.f12680H;
    }

    protected C3964c(Context context, Looper looper, int i, C7249c cVar, C6935d dVar, C6946i iVar) {
        this(context, looper, C3965d.m15083a(context), C3846a.m14468q(), i, cVar, (C6935d) C7264i.m27902k(dVar), (C6946i) C7264i.m27902k(iVar));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C3964c(android.content.Context r11, android.os.Looper r12, com.google.android.gms.common.internal.C3965d r13, com.google.android.gms.common.C3846a r14, int r15, p182n6.C7249c r16, p156l6.C6935d r17, p156l6.C6946i r18) {
        /*
            r10 = this;
            r9 = r10
            r0 = r17
            r1 = r18
            r2 = 0
            if (r0 != 0) goto L_0x000a
            r6 = r2
            goto L_0x0010
        L_0x000a:
            com.google.android.gms.common.internal.f r3 = new com.google.android.gms.common.internal.f
            r3.<init>(r0)
            r6 = r3
        L_0x0010:
            if (r1 != 0) goto L_0x0014
            r7 = r2
            goto L_0x001a
        L_0x0014:
            com.google.android.gms.common.internal.g r0 = new com.google.android.gms.common.internal.g
            r0.<init>(r1)
            r7 = r0
        L_0x001a:
            java.lang.String r8 = r16.mo21624j()
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r16
            r9.f12678F = r0
            android.accounts.Account r1 = r16.mo21615a()
            r9.f12680H = r1
            java.util.Set r0 = r16.mo21618d()
            java.util.Set r0 = r10.m15076q0(r0)
            r9.f12679G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C3964c.<init>(android.content.Context, android.os.Looper, com.google.android.gms.common.internal.d, com.google.android.gms.common.a, int, n6.c, l6.d, l6.i):void");
    }
}

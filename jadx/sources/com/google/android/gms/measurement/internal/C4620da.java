package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C4226i3;

/* renamed from: com.google.android.gms.measurement.internal.da */
final class C4620da extends C4608ca {

    /* renamed from: g */
    private final C4226i3 f14293g;

    /* renamed from: h */
    final /* synthetic */ C4585b f14294h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4620da(C4585b bVar, String str, int i, C4226i3 i3Var) {
        super(str, i);
        this.f14294h = bVar;
        this.f14293g = i3Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo14315a() {
        return this.f14293g.mo13226A();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo14316b() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo14317c() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v18, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14344k(java.lang.Long r11, java.lang.Long r12, com.google.android.gms.internal.measurement.C4143d5 r13, boolean r14) {
        /*
            r10 = this;
            com.google.android.gms.internal.measurement.C4388rc.m16600c()
            com.google.android.gms.measurement.internal.b r0 = r10.f14294h
            com.google.android.gms.measurement.internal.t4 r0 = r0.f14613a
            com.google.android.gms.measurement.internal.g r0 = r0.mo14876z()
            java.lang.String r1 = r10.f14248a
            com.google.android.gms.measurement.internal.e3 r2 = com.google.android.gms.measurement.internal.C4636f3.f14358Y
            boolean r0 = r0.mo14398B(r1, r2)
            com.google.android.gms.internal.measurement.i3 r1 = r10.f14293g
            boolean r1 = r1.mo13229G()
            com.google.android.gms.internal.measurement.i3 r2 = r10.f14293g
            boolean r2 = r2.mo13230H()
            com.google.android.gms.internal.measurement.i3 r3 = r10.f14293g
            boolean r3 = r3.mo13231I()
            r4 = 0
            r5 = 1
            if (r1 != 0) goto L_0x0030
            if (r2 != 0) goto L_0x0030
            if (r3 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r1 = r4
            goto L_0x0031
        L_0x0030:
            r1 = r5
        L_0x0031:
            r2 = 0
            if (r14 == 0) goto L_0x0060
            if (r1 != 0) goto L_0x0060
            com.google.android.gms.measurement.internal.b r11 = r10.f14294h
            com.google.android.gms.measurement.internal.t4 r11 = r11.f14613a
            com.google.android.gms.measurement.internal.p3 r11 = r11.mo14551d()
            com.google.android.gms.measurement.internal.n3 r11 = r11.mo14679v()
            int r12 = r10.f14249b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            com.google.android.gms.internal.measurement.i3 r13 = r10.f14293g
            boolean r13 = r13.mo13232J()
            if (r13 == 0) goto L_0x005a
            com.google.android.gms.internal.measurement.i3 r13 = r10.f14293g
            int r13 = r13.mo13226A()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
        L_0x005a:
            java.lang.String r13 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r11.mo14617c(r13, r12, r2)
            return r5
        L_0x0060:
            com.google.android.gms.internal.measurement.i3 r6 = r10.f14293g
            com.google.android.gms.internal.measurement.b3 r6 = r6.mo13227B()
            boolean r7 = r6.mo12898G()
            boolean r8 = r13.mo13036Q()
            if (r8 == 0) goto L_0x00ab
            boolean r8 = r6.mo12900I()
            if (r8 != 0) goto L_0x0099
            com.google.android.gms.measurement.internal.b r6 = r10.f14294h
            com.google.android.gms.measurement.internal.t4 r6 = r6.f14613a
            com.google.android.gms.measurement.internal.p3 r6 = r6.mo14551d()
            com.google.android.gms.measurement.internal.n3 r6 = r6.mo14680w()
            com.google.android.gms.measurement.internal.b r7 = r10.f14294h
            com.google.android.gms.measurement.internal.t4 r7 = r7.f14613a
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo14847D()
            java.lang.String r8 = r13.mo13033F()
            java.lang.String r7 = r7.mo14530f(r8)
            java.lang.String r8 = "No number filter for long property. property"
            r6.mo14616b(r8, r7)
            goto L_0x019c
        L_0x0099:
            long r8 = r13.mo13031B()
            com.google.android.gms.internal.measurement.g3 r2 = r6.mo12895C()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C4608ca.m17620h(r8, r2)
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C4608ca.m17622j(r2, r7)
            goto L_0x019c
        L_0x00ab:
            boolean r8 = r13.mo13035P()
            if (r8 == 0) goto L_0x00ec
            boolean r8 = r6.mo12900I()
            if (r8 != 0) goto L_0x00da
            com.google.android.gms.measurement.internal.b r6 = r10.f14294h
            com.google.android.gms.measurement.internal.t4 r6 = r6.f14613a
            com.google.android.gms.measurement.internal.p3 r6 = r6.mo14551d()
            com.google.android.gms.measurement.internal.n3 r6 = r6.mo14680w()
            com.google.android.gms.measurement.internal.b r7 = r10.f14294h
            com.google.android.gms.measurement.internal.t4 r7 = r7.f14613a
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo14847D()
            java.lang.String r8 = r13.mo13033F()
            java.lang.String r7 = r7.mo14530f(r8)
            java.lang.String r8 = "No number filter for double property. property"
            r6.mo14616b(r8, r7)
            goto L_0x019c
        L_0x00da:
            double r8 = r13.mo13030A()
            com.google.android.gms.internal.measurement.g3 r2 = r6.mo12895C()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C4608ca.m17619g(r8, r2)
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C4608ca.m17622j(r2, r7)
            goto L_0x019c
        L_0x00ec:
            boolean r8 = r13.mo13038T()
            if (r8 == 0) goto L_0x017b
            boolean r8 = r6.mo12902K()
            if (r8 != 0) goto L_0x0162
            boolean r8 = r6.mo12900I()
            if (r8 != 0) goto L_0x0121
            com.google.android.gms.measurement.internal.b r6 = r10.f14294h
            com.google.android.gms.measurement.internal.t4 r6 = r6.f14613a
            com.google.android.gms.measurement.internal.p3 r6 = r6.mo14551d()
            com.google.android.gms.measurement.internal.n3 r6 = r6.mo14680w()
            com.google.android.gms.measurement.internal.b r7 = r10.f14294h
            com.google.android.gms.measurement.internal.t4 r7 = r7.f14613a
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo14847D()
            java.lang.String r8 = r13.mo13033F()
            java.lang.String r7 = r7.mo14530f(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            r6.mo14616b(r8, r7)
            goto L_0x019c
        L_0x0121:
            java.lang.String r8 = r13.mo13034G()
            boolean r8 = com.google.android.gms.measurement.internal.C4741o9.m18055N(r8)
            if (r8 == 0) goto L_0x013c
            java.lang.String r2 = r13.mo13034G()
            com.google.android.gms.internal.measurement.g3 r6 = r6.mo12895C()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C4608ca.m17621i(r2, r6)
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C4608ca.m17622j(r2, r7)
            goto L_0x019c
        L_0x013c:
            com.google.android.gms.measurement.internal.b r6 = r10.f14294h
            com.google.android.gms.measurement.internal.t4 r6 = r6.f14613a
            com.google.android.gms.measurement.internal.p3 r6 = r6.mo14551d()
            com.google.android.gms.measurement.internal.n3 r6 = r6.mo14680w()
            com.google.android.gms.measurement.internal.b r7 = r10.f14294h
            com.google.android.gms.measurement.internal.t4 r7 = r7.f14613a
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo14847D()
            java.lang.String r8 = r13.mo13033F()
            java.lang.String r7 = r7.mo14530f(r8)
            java.lang.String r8 = r13.mo13034G()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.mo14617c(r9, r7, r8)
            goto L_0x019c
        L_0x0162:
            java.lang.String r2 = r13.mo13034G()
            com.google.android.gms.internal.measurement.n3 r6 = r6.mo12896D()
            com.google.android.gms.measurement.internal.b r8 = r10.f14294h
            com.google.android.gms.measurement.internal.t4 r8 = r8.f14613a
            com.google.android.gms.measurement.internal.p3 r8 = r8.mo14551d()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C4608ca.m17618f(r2, r6, r8)
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C4608ca.m17622j(r2, r7)
            goto L_0x019c
        L_0x017b:
            com.google.android.gms.measurement.internal.b r6 = r10.f14294h
            com.google.android.gms.measurement.internal.t4 r6 = r6.f14613a
            com.google.android.gms.measurement.internal.p3 r6 = r6.mo14551d()
            com.google.android.gms.measurement.internal.n3 r6 = r6.mo14680w()
            com.google.android.gms.measurement.internal.b r7 = r10.f14294h
            com.google.android.gms.measurement.internal.t4 r7 = r7.f14613a
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo14847D()
            java.lang.String r8 = r13.mo13033F()
            java.lang.String r7 = r7.mo14530f(r8)
            java.lang.String r8 = "User property has no value, property"
            r6.mo14616b(r8, r7)
        L_0x019c:
            com.google.android.gms.measurement.internal.b r6 = r10.f14294h
            com.google.android.gms.measurement.internal.t4 r6 = r6.f14613a
            com.google.android.gms.measurement.internal.p3 r6 = r6.mo14551d()
            com.google.android.gms.measurement.internal.n3 r6 = r6.mo14679v()
            if (r2 != 0) goto L_0x01ad
            java.lang.String r7 = "null"
            goto L_0x01ae
        L_0x01ad:
            r7 = r2
        L_0x01ae:
            java.lang.String r8 = "Property filter result"
            r6.mo14616b(r8, r7)
            if (r2 != 0) goto L_0x01b6
            return r4
        L_0x01b6:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r10.f14250c = r4
            if (r3 == 0) goto L_0x01c4
            boolean r3 = r2.booleanValue()
            if (r3 == 0) goto L_0x01c3
            goto L_0x01c4
        L_0x01c3:
            return r5
        L_0x01c4:
            if (r14 == 0) goto L_0x01ce
            com.google.android.gms.internal.measurement.i3 r14 = r10.f14293g
            boolean r14 = r14.mo13229G()
            if (r14 == 0) goto L_0x01d0
        L_0x01ce:
            r10.f14251d = r2
        L_0x01d0:
            boolean r14 = r2.booleanValue()
            if (r14 == 0) goto L_0x0215
            if (r1 == 0) goto L_0x0215
            boolean r14 = r13.mo13037S()
            if (r14 == 0) goto L_0x0215
            long r13 = r13.mo13032C()
            if (r11 == 0) goto L_0x01e8
            long r13 = r11.longValue()
        L_0x01e8:
            if (r0 == 0) goto L_0x0200
            com.google.android.gms.internal.measurement.i3 r11 = r10.f14293g
            boolean r11 = r11.mo13229G()
            if (r11 == 0) goto L_0x0200
            com.google.android.gms.internal.measurement.i3 r11 = r10.f14293g
            boolean r11 = r11.mo13230H()
            if (r11 != 0) goto L_0x0200
            if (r12 == 0) goto L_0x0200
            long r13 = r12.longValue()
        L_0x0200:
            com.google.android.gms.internal.measurement.i3 r11 = r10.f14293g
            boolean r11 = r11.mo13230H()
            if (r11 == 0) goto L_0x020f
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f14253f = r11
            goto L_0x0215
        L_0x020f:
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f14252e = r11
        L_0x0215:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4620da.mo14344k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.d5, boolean):boolean");
    }
}

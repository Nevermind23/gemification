package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C4511z2;

/* renamed from: com.google.android.gms.measurement.internal.ba */
final class C4596ba extends C4608ca {

    /* renamed from: g */
    private final C4511z2 f14232g;

    /* renamed from: h */
    final /* synthetic */ C4585b f14233h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4596ba(C4585b bVar, String str, int i, C4511z2 z2Var) {
        super(str, i);
        this.f14233h = bVar;
        this.f14232g = z2Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo14315a() {
        return this.f14232g.mo13848B();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo14316b() {
        return this.f14232g.mo13856N();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo14317c() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r5v16, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03fa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03fb  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14318k(java.lang.Long r16, java.lang.Long r17, com.google.android.gms.internal.measurement.C4244j4 r18, long r19, com.google.android.gms.measurement.internal.C4753q r21, boolean r22) {
        /*
            r15 = this;
            r0 = r15
            com.google.android.gms.internal.measurement.C4388rc.m16600c()
            com.google.android.gms.measurement.internal.b r1 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r1 = r1.f14613a
            com.google.android.gms.measurement.internal.g r1 = r1.mo14876z()
            java.lang.String r2 = r0.f14248a
            com.google.android.gms.measurement.internal.e3 r3 = com.google.android.gms.measurement.internal.C4636f3.f14361a0
            boolean r1 = r1.mo14398B(r2, r3)
            com.google.android.gms.internal.measurement.z2 r2 = r0.f14232g
            boolean r2 = r2.mo13855M()
            if (r2 == 0) goto L_0x0021
            r2 = r21
            long r2 = r2.f14774e
            goto L_0x0023
        L_0x0021:
            r2 = r19
        L_0x0023:
            com.google.android.gms.measurement.internal.b r4 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r4 = r4.f14613a
            com.google.android.gms.measurement.internal.p3 r4 = r4.mo14551d()
            java.lang.String r4 = r4.mo14672D()
            r5 = 2
            boolean r4 = android.util.Log.isLoggable(r4, r5)
            r5 = 0
            if (r4 == 0) goto L_0x0093
            com.google.android.gms.measurement.internal.b r4 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r4 = r4.f14613a
            com.google.android.gms.measurement.internal.p3 r4 = r4.mo14551d()
            com.google.android.gms.measurement.internal.n3 r4 = r4.mo14679v()
            int r6 = r0.f14249b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.gms.internal.measurement.z2 r7 = r0.f14232g
            boolean r7 = r7.mo13857O()
            if (r7 == 0) goto L_0x005c
            com.google.android.gms.internal.measurement.z2 r7 = r0.f14232g
            int r7 = r7.mo13848B()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x005d
        L_0x005c:
            r7 = r5
        L_0x005d:
            com.google.android.gms.measurement.internal.b r8 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r8 = r8.f14613a
            com.google.android.gms.measurement.internal.k3 r8 = r8.mo14847D()
            com.google.android.gms.internal.measurement.z2 r9 = r0.f14232g
            java.lang.String r9 = r9.mo13851G()
            java.lang.String r8 = r8.mo14528d(r9)
            java.lang.String r9 = "Evaluating filter. audience, filter, event"
            r4.mo14618d(r9, r6, r7, r8)
            com.google.android.gms.measurement.internal.b r4 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r4 = r4.f14613a
            com.google.android.gms.measurement.internal.p3 r4 = r4.mo14551d()
            com.google.android.gms.measurement.internal.n3 r4 = r4.mo14679v()
            com.google.android.gms.measurement.internal.b r6 = r0.f14233h
            com.google.android.gms.measurement.internal.m9 r6 = r6.f15082b
            com.google.android.gms.measurement.internal.o9 r6 = r6.mo14587g0()
            com.google.android.gms.internal.measurement.z2 r7 = r0.f14232g
            java.lang.String r6 = r6.mo14659E(r7)
            java.lang.String r7 = "Filter definition"
            r4.mo14616b(r7, r6)
        L_0x0093:
            com.google.android.gms.internal.measurement.z2 r4 = r0.f14232g
            boolean r4 = r4.mo13857O()
            r6 = 0
            if (r4 == 0) goto L_0x0440
            com.google.android.gms.internal.measurement.z2 r4 = r0.f14232g
            int r4 = r4.mo13848B()
            r7 = 256(0x100, float:3.59E-43)
            if (r4 <= r7) goto L_0x00a8
            goto L_0x0440
        L_0x00a8:
            com.google.android.gms.internal.measurement.z2 r4 = r0.f14232g
            boolean r4 = r4.mo13853K()
            com.google.android.gms.internal.measurement.z2 r7 = r0.f14232g
            boolean r7 = r7.mo13854L()
            com.google.android.gms.internal.measurement.z2 r8 = r0.f14232g
            boolean r8 = r8.mo13855M()
            r9 = 1
            if (r4 != 0) goto L_0x00c4
            if (r7 != 0) goto L_0x00c4
            if (r8 == 0) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            r4 = r6
            goto L_0x00c5
        L_0x00c4:
            r4 = r9
        L_0x00c5:
            if (r22 == 0) goto L_0x00f3
            if (r4 != 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.b r1 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r1 = r1.f14613a
            com.google.android.gms.measurement.internal.p3 r1 = r1.mo14551d()
            com.google.android.gms.measurement.internal.n3 r1 = r1.mo14679v()
            int r2 = r0.f14249b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.gms.internal.measurement.z2 r3 = r0.f14232g
            boolean r3 = r3.mo13857O()
            if (r3 == 0) goto L_0x00ed
            com.google.android.gms.internal.measurement.z2 r3 = r0.f14232g
            int r3 = r3.mo13848B()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
        L_0x00ed:
            java.lang.String r3 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.mo14617c(r3, r2, r5)
            return r9
        L_0x00f3:
            com.google.android.gms.internal.measurement.z2 r7 = r0.f14232g
            java.lang.String r8 = r18.mo13282H()
            boolean r10 = r7.mo13856N()
            if (r10 == 0) goto L_0x0115
            com.google.android.gms.internal.measurement.g3 r10 = r7.mo13850F()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C4608ca.m17620h(r2, r10)
            if (r2 != 0) goto L_0x010b
            goto L_0x03e1
        L_0x010b:
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0115
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x0115:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.List r3 = r7.mo13852H()
            java.util.Iterator r3 = r3.iterator()
        L_0x0122:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x015f
            java.lang.Object r10 = r3.next()
            com.google.android.gms.internal.measurement.b3 r10 = (com.google.android.gms.internal.measurement.C4107b3) r10
            java.lang.String r11 = r10.mo12897E()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0157
            com.google.android.gms.measurement.internal.b r2 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r2 = r2.f14613a
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14680w()
            com.google.android.gms.measurement.internal.b r3 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r3 = r3.f14613a
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo14847D()
            java.lang.String r3 = r3.mo14528d(r8)
            java.lang.String r7 = "null or empty param name in filter. event"
            r2.mo14616b(r7, r3)
            goto L_0x03e1
        L_0x0157:
            java.lang.String r10 = r10.mo12897E()
            r2.add(r10)
            goto L_0x0122
        L_0x015f:
            androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap
            r3.<init>()
            java.util.List r10 = r18.mo13283I()
            java.util.Iterator r10 = r10.iterator()
        L_0x016c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01ff
            java.lang.Object r11 = r10.next()
            com.google.android.gms.internal.measurement.n4 r11 = (com.google.android.gms.internal.measurement.C4312n4) r11
            java.lang.String r12 = r11.mo13396G()
            boolean r12 = r2.contains(r12)
            if (r12 == 0) goto L_0x016c
            boolean r12 = r11.mo13401W()
            if (r12 == 0) goto L_0x01a0
            java.lang.String r12 = r11.mo13396G()
            boolean r13 = r11.mo13401W()
            if (r13 == 0) goto L_0x019b
            long r13 = r11.mo13395D()
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            goto L_0x019c
        L_0x019b:
            r11 = r5
        L_0x019c:
            r3.put(r12, r11)
            goto L_0x016c
        L_0x01a0:
            boolean r12 = r11.mo13399U()
            if (r12 == 0) goto L_0x01be
            java.lang.String r12 = r11.mo13396G()
            boolean r13 = r11.mo13399U()
            if (r13 == 0) goto L_0x01b9
            double r13 = r11.mo13392A()
            java.lang.Double r11 = java.lang.Double.valueOf(r13)
            goto L_0x01ba
        L_0x01b9:
            r11 = r5
        L_0x01ba:
            r3.put(r12, r11)
            goto L_0x016c
        L_0x01be:
            boolean r12 = r11.mo13403Y()
            if (r12 == 0) goto L_0x01d0
            java.lang.String r12 = r11.mo13396G()
            java.lang.String r11 = r11.mo13397H()
            r3.put(r12, r11)
            goto L_0x016c
        L_0x01d0:
            com.google.android.gms.measurement.internal.b r2 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r2 = r2.f14613a
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14680w()
            com.google.android.gms.measurement.internal.b r3 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r3 = r3.f14613a
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo14847D()
            java.lang.String r3 = r3.mo14528d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r7 = r7.f14613a
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo14847D()
            java.lang.String r8 = r11.mo13396G()
            java.lang.String r7 = r7.mo14529e(r8)
            java.lang.String r8 = "Unknown value for param. event, param"
            r2.mo14617c(r8, r3, r7)
            goto L_0x03e1
        L_0x01ff:
            java.util.List r2 = r7.mo13852H()
            java.util.Iterator r2 = r2.iterator()
        L_0x0207:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x03df
            java.lang.Object r7 = r2.next()
            com.google.android.gms.internal.measurement.b3 r7 = (com.google.android.gms.internal.measurement.C4107b3) r7
            boolean r10 = r7.mo12899H()
            if (r10 == 0) goto L_0x0221
            boolean r10 = r7.mo12898G()
            if (r10 == 0) goto L_0x0221
            r10 = r9
            goto L_0x0222
        L_0x0221:
            r10 = r6
        L_0x0222:
            java.lang.String r11 = r7.mo12897E()
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x024b
            com.google.android.gms.measurement.internal.b r2 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r2 = r2.f14613a
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14680w()
            com.google.android.gms.measurement.internal.b r3 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r3 = r3.f14613a
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo14847D()
            java.lang.String r3 = r3.mo14528d(r8)
            java.lang.String r7 = "Event has empty param name. event"
            r2.mo14616b(r7, r3)
            goto L_0x03e1
        L_0x024b:
            java.lang.Object r12 = r3.get(r11)
            boolean r13 = r12 instanceof java.lang.Long
            if (r13 == 0) goto L_0x02a0
            boolean r13 = r7.mo12900I()
            if (r13 != 0) goto L_0x0284
            com.google.android.gms.measurement.internal.b r2 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r2 = r2.f14613a
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14680w()
            com.google.android.gms.measurement.internal.b r3 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r3 = r3.f14613a
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo14847D()
            java.lang.String r3 = r3.mo14528d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r7 = r7.f14613a
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo14847D()
            java.lang.String r7 = r7.mo14529e(r11)
            java.lang.String r8 = "No number filter for long param. event, param"
            r2.mo14617c(r8, r3, r7)
            goto L_0x03e1
        L_0x0284:
            java.lang.Long r12 = (java.lang.Long) r12
            long r11 = r12.longValue()
            com.google.android.gms.internal.measurement.g3 r7 = r7.mo12895C()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C4608ca.m17620h(r11, r7)
            if (r7 != 0) goto L_0x0296
            goto L_0x03e1
        L_0x0296:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x0207
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x02a0:
            boolean r13 = r12 instanceof java.lang.Double
            if (r13 == 0) goto L_0x02f1
            boolean r13 = r7.mo12900I()
            if (r13 != 0) goto L_0x02d5
            com.google.android.gms.measurement.internal.b r2 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r2 = r2.f14613a
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14680w()
            com.google.android.gms.measurement.internal.b r3 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r3 = r3.f14613a
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo14847D()
            java.lang.String r3 = r3.mo14528d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r7 = r7.f14613a
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo14847D()
            java.lang.String r7 = r7.mo14529e(r11)
            java.lang.String r8 = "No number filter for double param. event, param"
            r2.mo14617c(r8, r3, r7)
            goto L_0x03e1
        L_0x02d5:
            java.lang.Double r12 = (java.lang.Double) r12
            double r11 = r12.doubleValue()
            com.google.android.gms.internal.measurement.g3 r7 = r7.mo12895C()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C4608ca.m17619g(r11, r7)
            if (r7 != 0) goto L_0x02e7
            goto L_0x03e1
        L_0x02e7:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x0207
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x02f1:
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L_0x0387
            boolean r13 = r7.mo12902K()
            if (r13 == 0) goto L_0x030e
            java.lang.String r12 = (java.lang.String) r12
            com.google.android.gms.internal.measurement.n3 r7 = r7.mo12896D()
            com.google.android.gms.measurement.internal.b r11 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r11 = r11.f14613a
            com.google.android.gms.measurement.internal.p3 r11 = r11.mo14551d()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C4608ca.m17618f(r12, r7, r11)
            goto L_0x0324
        L_0x030e:
            boolean r13 = r7.mo12900I()
            if (r13 == 0) goto L_0x035d
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = com.google.android.gms.measurement.internal.C4741o9.m18055N(r12)
            if (r13 == 0) goto L_0x0332
            com.google.android.gms.internal.measurement.g3 r7 = r7.mo12895C()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C4608ca.m17621i(r12, r7)
        L_0x0324:
            if (r7 != 0) goto L_0x0328
            goto L_0x03e1
        L_0x0328:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x0207
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x0332:
            com.google.android.gms.measurement.internal.b r2 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r2 = r2.f14613a
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14680w()
            com.google.android.gms.measurement.internal.b r3 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r3 = r3.f14613a
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo14847D()
            java.lang.String r3 = r3.mo14528d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r7 = r7.f14613a
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo14847D()
            java.lang.String r7 = r7.mo14529e(r11)
            java.lang.String r8 = "Invalid param value for number filter. event, param"
            r2.mo14617c(r8, r3, r7)
            goto L_0x03e1
        L_0x035d:
            com.google.android.gms.measurement.internal.b r2 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r2 = r2.f14613a
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14680w()
            com.google.android.gms.measurement.internal.b r3 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r3 = r3.f14613a
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo14847D()
            java.lang.String r3 = r3.mo14528d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r7 = r7.f14613a
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo14847D()
            java.lang.String r7 = r7.mo14529e(r11)
            java.lang.String r8 = "No filter for String param. event, param"
            r2.mo14617c(r8, r3, r7)
            goto L_0x03e1
        L_0x0387:
            if (r12 != 0) goto L_0x03b5
            com.google.android.gms.measurement.internal.b r2 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r2 = r2.f14613a
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14679v()
            com.google.android.gms.measurement.internal.b r3 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r3 = r3.f14613a
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo14847D()
            java.lang.String r3 = r3.mo14528d(r8)
            com.google.android.gms.measurement.internal.b r5 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r5 = r5.f14613a
            com.google.android.gms.measurement.internal.k3 r5 = r5.mo14847D()
            java.lang.String r5 = r5.mo14529e(r11)
            java.lang.String r7 = "Missing param for filter. event, param"
            r2.mo14617c(r7, r3, r5)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x03b5:
            com.google.android.gms.measurement.internal.b r2 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r2 = r2.f14613a
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14680w()
            com.google.android.gms.measurement.internal.b r3 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r3 = r3.f14613a
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo14847D()
            java.lang.String r3 = r3.mo14528d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r7 = r7.f14613a
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo14847D()
            java.lang.String r7 = r7.mo14529e(r11)
            java.lang.String r8 = "Unknown param type. event, param"
            r2.mo14617c(r8, r3, r7)
            goto L_0x03e1
        L_0x03df:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
        L_0x03e1:
            com.google.android.gms.measurement.internal.b r2 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r2 = r2.f14613a
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14679v()
            if (r5 != 0) goto L_0x03f2
            java.lang.String r3 = "null"
            goto L_0x03f3
        L_0x03f2:
            r3 = r5
        L_0x03f3:
            java.lang.String r7 = "Event filter result"
            r2.mo14616b(r7, r3)
            if (r5 != 0) goto L_0x03fb
            return r6
        L_0x03fb:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f14250c = r2
            boolean r3 = r5.booleanValue()
            if (r3 != 0) goto L_0x0406
            return r9
        L_0x0406:
            r0.f14251d = r2
            if (r4 == 0) goto L_0x043f
            boolean r2 = r18.mo13286U()
            if (r2 == 0) goto L_0x043f
            long r2 = r18.mo13280D()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            com.google.android.gms.internal.measurement.z2 r3 = r0.f14232g
            boolean r3 = r3.mo13854L()
            if (r3 == 0) goto L_0x0430
            if (r1 == 0) goto L_0x042d
            com.google.android.gms.internal.measurement.z2 r1 = r0.f14232g
            boolean r1 = r1.mo13856N()
            if (r1 != 0) goto L_0x042b
            goto L_0x042d
        L_0x042b:
            r2 = r16
        L_0x042d:
            r0.f14253f = r2
            goto L_0x043f
        L_0x0430:
            if (r1 == 0) goto L_0x043d
            com.google.android.gms.internal.measurement.z2 r1 = r0.f14232g
            boolean r1 = r1.mo13856N()
            if (r1 != 0) goto L_0x043b
            goto L_0x043d
        L_0x043b:
            r2 = r17
        L_0x043d:
            r0.f14252e = r2
        L_0x043f:
            return r9
        L_0x0440:
            com.google.android.gms.measurement.internal.b r1 = r0.f14233h
            com.google.android.gms.measurement.internal.t4 r1 = r1.f14613a
            com.google.android.gms.measurement.internal.p3 r1 = r1.mo14551d()
            com.google.android.gms.measurement.internal.n3 r1 = r1.mo14680w()
            java.lang.String r2 = r0.f14248a
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r2)
            com.google.android.gms.internal.measurement.z2 r3 = r0.f14232g
            boolean r3 = r3.mo13857O()
            if (r3 == 0) goto L_0x0464
            com.google.android.gms.internal.measurement.z2 r3 = r0.f14232g
            int r3 = r3.mo13848B()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
        L_0x0464:
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r4 = "Invalid event filter ID. appId, id"
            r1.mo14617c(r4, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4596ba.mo14318k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.j4, long, com.google.android.gms.measurement.internal.q, boolean):boolean");
    }
}

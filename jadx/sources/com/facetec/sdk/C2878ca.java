package com.facetec.sdk;

import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: com.facetec.sdk.ca */
public final class C2878ca extends C3004eg implements C3176gr {

    /* renamed from: a */
    private C3177gs f9460a;

    /* renamed from: b */
    private C3175gq f9461b;

    /* renamed from: e */
    private C2972dv f9462e;

    public C2878ca(C2972dv dvVar, C3175gq gqVar, C3177gs gsVar) {
        this.f9462e = dvVar;
        this.f9461b = gqVar;
        this.f9460a = gsVar;
    }

    /* renamed from: b */
    public final void mo8991b(C3160gb gbVar, Object obj) {
        if (obj == null) {
            gbVar.mo9318f();
            return;
        }
        C3471o oVar = (C3471o) obj;
        C2972dv dvVar = this.f9462e;
        C3177gs gsVar = this.f9460a;
        gbVar.mo9316e();
        if (oVar != oVar.f11328c) {
            gsVar.mo9365e(gbVar, 0);
            gbVar.mo9315d(oVar.f11328c);
        }
        if (oVar != oVar.f11326a) {
            gsVar.mo9365e(gbVar, 11);
            C3583t tVar = oVar.f11326a;
            Class<C3583t> cls = C3583t.class;
            Type a = C3174gp.m12982a(cls, tVar);
            C3004eg<?> b = dvVar.mo9133b(C3142fw.m12893c(a));
            if (cls != a && !C3174gp.m12983d(b)) {
                C3004eg<?> b2 = dvVar.mo9134b(cls);
                if (C3174gp.m12983d(b2)) {
                    b = b2;
                }
            }
            b.mo8991b(gbVar, tVar);
        }
        if (oVar != oVar.f11330e) {
            gsVar.mo9365e(gbVar, 6);
            C3448n nVar = new C3448n();
            ArrayList<String> arrayList = oVar.f11330e;
            Type b3 = nVar.mo9332b();
            Type a2 = C3174gp.m12982a(b3, arrayList);
            C3004eg<?> b4 = dvVar.mo9133b(C3142fw.m12893c(a2));
            if (b3 != a2 && !C3174gp.m12983d(b4)) {
                C3004eg<?> b5 = dvVar.mo9133b(nVar);
                if (C3174gp.m12983d(b5)) {
                    b4 = b5;
                }
            }
            b4.mo8991b(gbVar, arrayList);
        }
        if (oVar != oVar.f11329d) {
            gsVar.mo9365e(gbVar, 2);
            gbVar.mo9315d(oVar.f11329d);
        }
        if (oVar != oVar.f11327b) {
            gsVar.mo9365e(gbVar, 4);
            gbVar.mo9315d(oVar.f11327b);
        }
        if (oVar != oVar.f11333i) {
            gsVar.mo9365e(gbVar, 5);
            gbVar.mo9315d(oVar.f11333i);
        }
        if (oVar != oVar.f11334j) {
            gsVar.mo9365e(gbVar, 7);
            gbVar.mo9315d(oVar.f11334j);
        }
        if (oVar != oVar.f11332g) {
            gsVar.mo9365e(gbVar, 9);
            gbVar.mo9315d(oVar.f11332g);
        }
        gsVar.mo9365e(gbVar, 8);
        gbVar.mo9307a((Number) Integer.valueOf(oVar.f11331f));
        gbVar.mo9310c();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0127, code lost:
        r8.mo9298l();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo8992d(com.facetec.sdk.C3143fx r8) {
        /*
            r7 = this;
            com.facetec.sdk.fv r0 = r8.mo9292f()
            com.facetec.sdk.fv r1 = com.facetec.sdk.C3141fv.NULL
            r2 = 0
            if (r0 != r1) goto L_0x000d
            r8.mo9301o()
            return r2
        L_0x000d:
            com.facetec.sdk.o r0 = new com.facetec.sdk.o
            r0.<init>()
            com.facetec.sdk.dv r1 = r7.f9462e
            com.facetec.sdk.gq r3 = r7.f9461b
            r8.mo9289d()
        L_0x0019:
            boolean r4 = r8.mo9291e()
            if (r4 == 0) goto L_0x012c
            int r4 = r3.mo9363e(r8)
            com.facetec.sdk.fv r5 = r8.mo9292f()
            com.facetec.sdk.fv r6 = com.facetec.sdk.C3141fv.NULL
            if (r5 == r6) goto L_0x002d
            r5 = 1
            goto L_0x002e
        L_0x002d:
            r5 = 0
        L_0x002e:
            switch(r4) {
                case 1: goto L_0x0113;
                case 2: goto L_0x00f5;
                case 3: goto L_0x0031;
                case 4: goto L_0x00d7;
                case 5: goto L_0x00c6;
                case 6: goto L_0x00ae;
                case 7: goto L_0x008f;
                case 8: goto L_0x0031;
                case 9: goto L_0x0071;
                case 10: goto L_0x0053;
                case 11: goto L_0x0035;
                default: goto L_0x0031;
            }
        L_0x0031:
            r8.mo9301o()
            goto L_0x0019
        L_0x0035:
            if (r5 == 0) goto L_0x004f
            com.facetec.sdk.fv r4 = r8.mo9292f()
            com.facetec.sdk.fv r5 = com.facetec.sdk.C3141fv.BOOLEAN
            if (r4 == r5) goto L_0x0044
            java.lang.String r4 = r8.mo9295i()
            goto L_0x004c
        L_0x0044:
            boolean r4 = r8.mo9296j()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x004c:
            r0.f11327b = r4
            goto L_0x0019
        L_0x004f:
            r0.f11327b = r2
            goto L_0x0127
        L_0x0053:
            if (r5 == 0) goto L_0x006d
            com.facetec.sdk.fv r4 = r8.mo9292f()
            com.facetec.sdk.fv r5 = com.facetec.sdk.C3141fv.BOOLEAN
            if (r4 == r5) goto L_0x0062
            java.lang.String r4 = r8.mo9295i()
            goto L_0x006a
        L_0x0062:
            boolean r4 = r8.mo9296j()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x006a:
            r0.f11328c = r4
            goto L_0x0019
        L_0x006d:
            r0.f11328c = r2
            goto L_0x0127
        L_0x0071:
            if (r5 == 0) goto L_0x008b
            com.facetec.sdk.fv r4 = r8.mo9292f()
            com.facetec.sdk.fv r5 = com.facetec.sdk.C3141fv.BOOLEAN
            if (r4 == r5) goto L_0x0080
            java.lang.String r4 = r8.mo9295i()
            goto L_0x0088
        L_0x0080:
            boolean r4 = r8.mo9296j()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x0088:
            r0.f11332g = r4
            goto L_0x0019
        L_0x008b:
            r0.f11332g = r2
            goto L_0x0127
        L_0x008f:
            if (r5 == 0) goto L_0x00aa
            com.facetec.sdk.fv r4 = r8.mo9292f()
            com.facetec.sdk.fv r5 = com.facetec.sdk.C3141fv.BOOLEAN
            if (r4 == r5) goto L_0x009e
            java.lang.String r4 = r8.mo9295i()
            goto L_0x00a6
        L_0x009e:
            boolean r4 = r8.mo9296j()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x00a6:
            r0.f11334j = r4
            goto L_0x0019
        L_0x00aa:
            r0.f11334j = r2
            goto L_0x0127
        L_0x00ae:
            if (r5 == 0) goto L_0x00c3
            com.facetec.sdk.n r4 = new com.facetec.sdk.n
            r4.<init>()
            com.facetec.sdk.eg r4 = r1.mo9133b(r4)
            java.lang.Object r4 = r4.mo8992d(r8)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r0.f11330e = r4
            goto L_0x0019
        L_0x00c3:
            r0.f11330e = r2
            goto L_0x0127
        L_0x00c6:
            if (r5 == 0) goto L_0x0127
            int r4 = r8.mo9299m()     // Catch:{ NumberFormatException -> 0x00d0 }
            r0.f11331f = r4     // Catch:{ NumberFormatException -> 0x00d0 }
            goto L_0x0019
        L_0x00d0:
            r8 = move-exception
            com.facetec.sdk.ei r0 = new com.facetec.sdk.ei
            r0.<init>((java.lang.Throwable) r8)
            throw r0
        L_0x00d7:
            if (r5 == 0) goto L_0x00f2
            com.facetec.sdk.fv r4 = r8.mo9292f()
            com.facetec.sdk.fv r5 = com.facetec.sdk.C3141fv.BOOLEAN
            if (r4 == r5) goto L_0x00e6
            java.lang.String r4 = r8.mo9295i()
            goto L_0x00ee
        L_0x00e6:
            boolean r4 = r8.mo9296j()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x00ee:
            r0.f11329d = r4
            goto L_0x0019
        L_0x00f2:
            r0.f11329d = r2
            goto L_0x0127
        L_0x00f5:
            if (r5 == 0) goto L_0x0110
            com.facetec.sdk.fv r4 = r8.mo9292f()
            com.facetec.sdk.fv r5 = com.facetec.sdk.C3141fv.BOOLEAN
            if (r4 == r5) goto L_0x0104
            java.lang.String r4 = r8.mo9295i()
            goto L_0x010c
        L_0x0104:
            boolean r4 = r8.mo9296j()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x010c:
            r0.f11333i = r4
            goto L_0x0019
        L_0x0110:
            r0.f11333i = r2
            goto L_0x0127
        L_0x0113:
            if (r5 == 0) goto L_0x0125
            java.lang.Class<com.facetec.sdk.t> r4 = com.facetec.sdk.C3583t.class
            com.facetec.sdk.eg r4 = r1.mo9134b(r4)
            java.lang.Object r4 = r4.mo8992d(r8)
            com.facetec.sdk.t r4 = (com.facetec.sdk.C3583t) r4
            r0.f11326a = r4
            goto L_0x0019
        L_0x0125:
            r0.f11326a = r2
        L_0x0127:
            r8.mo9298l()
            goto L_0x0019
        L_0x012c:
            r8.mo9287c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2878ca.mo8992d(com.facetec.sdk.fx):java.lang.Object");
    }
}

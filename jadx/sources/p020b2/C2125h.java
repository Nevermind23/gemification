package p020b2;

import p033c2.C2224c;

/* renamed from: b2.h */
abstract class C2125h {

    /* renamed from: a */
    private static final C2224c.C2225a f6279a = C2224c.C2225a.m8482a("ty", "d");

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c2, code lost:
        if (r2.equals("gf") == false) goto L_0x0034;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p319y1.C9011c m8200a(p033c2.C2224c r7, com.airbnb.lottie.C2325h r8) {
        /*
            r7.mo7153n()
            r0 = 2
            r1 = r0
        L_0x0005:
            boolean r2 = r7.hasNext()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0028
            c2.c$a r2 = f6279a
            int r2 = r7.mo7160x(r2)
            if (r2 == 0) goto L_0x0023
            if (r2 == r3) goto L_0x001e
            r7.mo7161y()
            r7.mo7148N()
            goto L_0x0005
        L_0x001e:
            int r1 = r7.mo7157t()
            goto L_0x0005
        L_0x0023:
            java.lang.String r2 = r7.mo7147I0()
            goto L_0x0029
        L_0x0028:
            r2 = r4
        L_0x0029:
            if (r2 != 0) goto L_0x002c
            return r4
        L_0x002c:
            int r5 = r2.hashCode()
            r6 = -1
            switch(r5) {
                case 3239: goto L_0x00d2;
                case 3270: goto L_0x00c6;
                case 3295: goto L_0x00bc;
                case 3307: goto L_0x00b0;
                case 3308: goto L_0x00a5;
                case 3488: goto L_0x009a;
                case 3633: goto L_0x008f;
                case 3634: goto L_0x0084;
                case 3646: goto L_0x0078;
                case 3669: goto L_0x006b;
                case 3679: goto L_0x005e;
                case 3681: goto L_0x0051;
                case 3705: goto L_0x0044;
                case 3710: goto L_0x0037;
                default: goto L_0x0034;
            }
        L_0x0034:
            r0 = r6
            goto L_0x00dd
        L_0x0037:
            java.lang.String r0 = "tr"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0040
            goto L_0x0034
        L_0x0040:
            r0 = 13
            goto L_0x00dd
        L_0x0044:
            java.lang.String r0 = "tm"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x004d
            goto L_0x0034
        L_0x004d:
            r0 = 12
            goto L_0x00dd
        L_0x0051:
            java.lang.String r0 = "st"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x005a
            goto L_0x0034
        L_0x005a:
            r0 = 11
            goto L_0x00dd
        L_0x005e:
            java.lang.String r0 = "sr"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0067
            goto L_0x0034
        L_0x0067:
            r0 = 10
            goto L_0x00dd
        L_0x006b:
            java.lang.String r0 = "sh"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0074
            goto L_0x0034
        L_0x0074:
            r0 = 9
            goto L_0x00dd
        L_0x0078:
            java.lang.String r0 = "rp"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0081
            goto L_0x0034
        L_0x0081:
            r0 = 8
            goto L_0x00dd
        L_0x0084:
            java.lang.String r0 = "rd"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x008d
            goto L_0x0034
        L_0x008d:
            r0 = 7
            goto L_0x00dd
        L_0x008f:
            java.lang.String r0 = "rc"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0098
            goto L_0x0034
        L_0x0098:
            r0 = 6
            goto L_0x00dd
        L_0x009a:
            java.lang.String r0 = "mm"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00a3
            goto L_0x0034
        L_0x00a3:
            r0 = 5
            goto L_0x00dd
        L_0x00a5:
            java.lang.String r0 = "gs"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00ae
            goto L_0x0034
        L_0x00ae:
            r0 = 4
            goto L_0x00dd
        L_0x00b0:
            java.lang.String r0 = "gr"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00ba
            goto L_0x0034
        L_0x00ba:
            r0 = 3
            goto L_0x00dd
        L_0x00bc:
            java.lang.String r3 = "gf"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x00dd
            goto L_0x0034
        L_0x00c6:
            java.lang.String r0 = "fl"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00d0
            goto L_0x0034
        L_0x00d0:
            r0 = r3
            goto L_0x00dd
        L_0x00d2:
            java.lang.String r0 = "el"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00dc
            goto L_0x0034
        L_0x00dc:
            r0 = 0
        L_0x00dd:
            switch(r0) {
                case 0: goto L_0x013b;
                case 1: goto L_0x0136;
                case 2: goto L_0x0131;
                case 3: goto L_0x012c;
                case 4: goto L_0x0127;
                case 5: goto L_0x011d;
                case 6: goto L_0x0118;
                case 7: goto L_0x0113;
                case 8: goto L_0x010e;
                case 9: goto L_0x0109;
                case 10: goto L_0x0104;
                case 11: goto L_0x00ff;
                case 12: goto L_0x00fa;
                case 13: goto L_0x00f5;
                default: goto L_0x00e0;
            }
        L_0x00e0:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Unknown shape type "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            p048d2.C5804f.m23334c(r8)
            goto L_0x013f
        L_0x00f5:
            x1.l r4 = p020b2.C2115c.m8177g(r7, r8)
            goto L_0x013f
        L_0x00fa:
            y1.s r4 = p020b2.C2136m0.m8219a(r7, r8)
            goto L_0x013f
        L_0x00ff:
            y1.r r4 = p020b2.C2134l0.m8217a(r7, r8)
            goto L_0x013f
        L_0x0104:
            y1.j r4 = p020b2.C2116c0.m8178a(r7, r8, r1)
            goto L_0x013f
        L_0x0109:
            y1.q r4 = p020b2.C2132k0.m8214a(r7, r8)
            goto L_0x013f
        L_0x010e:
            y1.l r4 = p020b2.C2120e0.m8193a(r7, r8)
            goto L_0x013f
        L_0x0113:
            y1.m r4 = p020b2.C2122f0.m8195a(r7, r8)
            goto L_0x013f
        L_0x0118:
            y1.k r4 = p020b2.C2118d0.m8190a(r7, r8)
            goto L_0x013f
        L_0x011d:
            y1.i r4 = p020b2.C2151y.m8258a(r7)
            java.lang.String r0 = "Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove()."
            r8.mo7542a(r0)
            goto L_0x013f
        L_0x0127:
            y1.f r4 = p020b2.C2141q.m8229a(r7, r8)
            goto L_0x013f
        L_0x012c:
            y1.p r4 = p020b2.C2130j0.m8211a(r7, r8)
            goto L_0x013f
        L_0x0131:
            y1.e r4 = p020b2.C2140p.m8228a(r7, r8)
            goto L_0x013f
        L_0x0136:
            y1.o r4 = p020b2.C2128i0.m8205a(r7, r8)
            goto L_0x013f
        L_0x013b:
            y1.b r4 = p020b2.C2121f.m8194a(r7, r8, r1)
        L_0x013f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0149
            r7.mo7148N()
            goto L_0x013f
        L_0x0149:
            r7.mo7155q()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p020b2.C2125h.m8200a(c2.c, com.airbnb.lottie.h):y1.c");
    }
}

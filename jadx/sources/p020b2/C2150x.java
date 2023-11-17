package p020b2;

/* renamed from: b2.x */
abstract class C2150x {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (r0.equals("s") == false) goto L_0x0062;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p319y1.C9016h m8257a(p033c2.C2224c r11, com.airbnb.lottie.C2325h r12) {
        /*
            r11.mo7153n()
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r2
            r4 = r1
        L_0x0008:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x00d4
            java.lang.String r5 = r11.mo7150b0()
            r5.hashCode()
            int r6 = r5.hashCode()
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = -1
            switch(r6) {
                case 111: goto L_0x0043;
                case 3588: goto L_0x0038;
                case 104433: goto L_0x002d;
                case 3357091: goto L_0x0022;
                default: goto L_0x0020;
            }
        L_0x0020:
            r6 = r10
            goto L_0x004d
        L_0x0022:
            java.lang.String r6 = "mode"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x002b
            goto L_0x0020
        L_0x002b:
            r6 = r7
            goto L_0x004d
        L_0x002d:
            java.lang.String r6 = "inv"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0036
            goto L_0x0020
        L_0x0036:
            r6 = r8
            goto L_0x004d
        L_0x0038:
            java.lang.String r6 = "pt"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0041
            goto L_0x0020
        L_0x0041:
            r6 = r9
            goto L_0x004d
        L_0x0043:
            java.lang.String r6 = "o"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x004c
            goto L_0x0020
        L_0x004c:
            r6 = r1
        L_0x004d:
            switch(r6) {
                case 0: goto L_0x00ce;
                case 1: goto L_0x00c8;
                case 2: goto L_0x00c2;
                case 3: goto L_0x0054;
                default: goto L_0x0050;
            }
        L_0x0050:
            r11.mo7148N()
            goto L_0x0008
        L_0x0054:
            java.lang.String r0 = r11.mo7147I0()
            r0.hashCode()
            int r6 = r0.hashCode()
            switch(r6) {
                case 97: goto L_0x0083;
                case 105: goto L_0x0078;
                case 110: goto L_0x006d;
                case 115: goto L_0x0064;
                default: goto L_0x0062;
            }
        L_0x0062:
            r7 = r10
            goto L_0x008d
        L_0x0064:
            java.lang.String r6 = "s"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x008d
            goto L_0x0062
        L_0x006d:
            java.lang.String r6 = "n"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0076
            goto L_0x0062
        L_0x0076:
            r7 = r8
            goto L_0x008d
        L_0x0078:
            java.lang.String r6 = "i"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0081
            goto L_0x0062
        L_0x0081:
            r7 = r9
            goto L_0x008d
        L_0x0083:
            java.lang.String r6 = "a"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x008c
            goto L_0x0062
        L_0x008c:
            r7 = r1
        L_0x008d:
            switch(r7) {
                case 0: goto L_0x00be;
                case 1: goto L_0x00b5;
                case 2: goto L_0x00b1;
                case 3: goto L_0x00ad;
                default: goto L_0x0090;
            }
        L_0x0090:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Unknown mask mode "
            r0.append(r6)
            r0.append(r5)
            java.lang.String r5 = ". Defaulting to Add."
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            p048d2.C5804f.m23334c(r0)
            y1.h$a r0 = p319y1.C9016h.C9017a.MASK_MODE_ADD
            goto L_0x0008
        L_0x00ad:
            y1.h$a r0 = p319y1.C9016h.C9017a.MASK_MODE_SUBTRACT
            goto L_0x0008
        L_0x00b1:
            y1.h$a r0 = p319y1.C9016h.C9017a.MASK_MODE_NONE
            goto L_0x0008
        L_0x00b5:
            java.lang.String r0 = "Animation contains intersect masks. They are not supported but will be treated like add masks."
            r12.mo7542a(r0)
            y1.h$a r0 = p319y1.C9016h.C9017a.MASK_MODE_INTERSECT
            goto L_0x0008
        L_0x00be:
            y1.h$a r0 = p319y1.C9016h.C9017a.MASK_MODE_ADD
            goto L_0x0008
        L_0x00c2:
            boolean r4 = r11.mo7146E0()
            goto L_0x0008
        L_0x00c8:
            x1.h r2 = p020b2.C2117d.m8189k(r11, r12)
            goto L_0x0008
        L_0x00ce:
            x1.d r3 = p020b2.C2117d.m8186h(r11, r12)
            goto L_0x0008
        L_0x00d4:
            r11.mo7155q()
            y1.h r11 = new y1.h
            r11.<init>(r0, r2, r3, r4)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p020b2.C2150x.m8257a(c2.c, com.airbnb.lottie.h):y1.h");
    }
}

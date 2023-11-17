package p122ib;

import com.google.zxing.C5753c;
import com.google.zxing.C5763l;
import com.google.zxing.C5764m;
import java.util.Map;

/* renamed from: ib.b */
public final class C6629b implements C5763l {
    /* renamed from: a */
    public void mo18886a() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005e A[LOOP:0: B:29:0x005c->B:30:0x005e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.C5764m mo18887b(com.google.zxing.C5753c r11, java.util.Map r12) {
        /*
            r10 = this;
            kb.a r0 = new kb.a
            ob.b r11 = r11.mo18870a()
            r0.<init>(r11)
            r11 = 0
            r1 = 0
            ib.a r2 = r0.mo20922a(r11)     // Catch:{ NotFoundException -> 0x002b, FormatException -> 0x0025 }
            com.google.zxing.o[] r3 = r2.mo22010b()     // Catch:{ NotFoundException -> 0x002b, FormatException -> 0x0025 }
            jb.a r4 = new jb.a     // Catch:{ NotFoundException -> 0x0023, FormatException -> 0x0021 }
            r4.<init>()     // Catch:{ NotFoundException -> 0x0023, FormatException -> 0x0021 }
            ob.e r2 = r4.mo20818c(r2)     // Catch:{ NotFoundException -> 0x0023, FormatException -> 0x0021 }
            r4 = r3
            r3 = r1
            r1 = r2
            r2 = r3
            goto L_0x002f
        L_0x0021:
            r2 = move-exception
            goto L_0x0027
        L_0x0023:
            r2 = move-exception
            goto L_0x002d
        L_0x0025:
            r2 = move-exception
            r3 = r1
        L_0x0027:
            r4 = r3
            r3 = r2
            r2 = r1
            goto L_0x002f
        L_0x002b:
            r2 = move-exception
            r3 = r1
        L_0x002d:
            r4 = r3
            r3 = r1
        L_0x002f:
            if (r1 != 0) goto L_0x004e
            r1 = 1
            ib.a r0 = r0.mo20922a(r1)     // Catch:{ NotFoundException -> 0x0046, FormatException -> 0x0044 }
            com.google.zxing.o[] r4 = r0.mo22010b()     // Catch:{ NotFoundException -> 0x0046, FormatException -> 0x0044 }
            jb.a r1 = new jb.a     // Catch:{ NotFoundException -> 0x0046, FormatException -> 0x0044 }
            r1.<init>()     // Catch:{ NotFoundException -> 0x0046, FormatException -> 0x0044 }
            ob.e r1 = r1.mo20818c(r0)     // Catch:{ NotFoundException -> 0x0046, FormatException -> 0x0044 }
            goto L_0x004e
        L_0x0044:
            r11 = move-exception
            goto L_0x0047
        L_0x0046:
            r11 = move-exception
        L_0x0047:
            if (r2 != 0) goto L_0x004d
            if (r3 == 0) goto L_0x004c
            throw r3
        L_0x004c:
            throw r11
        L_0x004d:
            throw r2
        L_0x004e:
            r6 = r4
            if (r12 == 0) goto L_0x0066
            com.google.zxing.d r0 = com.google.zxing.C5754d.NEED_RESULT_POINT_CALLBACK
            java.lang.Object r12 = r12.get(r0)
            com.google.zxing.p r12 = (com.google.zxing.C5767p) r12
            if (r12 == 0) goto L_0x0066
            int r0 = r6.length
        L_0x005c:
            if (r11 >= r0) goto L_0x0066
            r2 = r6[r11]
            r12.mo18906a(r2)
            int r11 = r11 + 1
            goto L_0x005c
        L_0x0066:
            com.google.zxing.m r11 = new com.google.zxing.m
            java.lang.String r3 = r1.mo22001h()
            byte[] r4 = r1.mo21998e()
            int r5 = r1.mo21996c()
            com.google.zxing.a r7 = com.google.zxing.C5751a.AZTEC
            long r8 = java.lang.System.currentTimeMillis()
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.util.List r12 = r1.mo21994a()
            if (r12 == 0) goto L_0x0089
            com.google.zxing.n r0 = com.google.zxing.C5765n.BYTE_SEGMENTS
            r11.mo18899h(r0, r12)
        L_0x0089:
            java.lang.String r12 = r1.mo21995b()
            if (r12 == 0) goto L_0x0094
            com.google.zxing.n r0 = com.google.zxing.C5765n.ERROR_CORRECTION_LEVEL
            r11.mo18899h(r0, r12)
        L_0x0094:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p122ib.C6629b.mo18887b(com.google.zxing.c, java.util.Map):com.google.zxing.m");
    }

    /* renamed from: c */
    public C5764m mo18888c(C5753c cVar) {
        return mo18887b(cVar, (Map) null);
    }
}

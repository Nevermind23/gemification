package p105h7;

import com.salesforce.marketingcloud.C11398b;

/* renamed from: h7.z */
final class C6476z extends C6445b0 {

    /* renamed from: h */
    final char[] f19802h = new char[C11398b.f33140s];

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C6476z(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            h7.y r4 = new h7.y
            java.lang.String r5 = "base16()"
            java.lang.String r0 = "0123456789ABCDEF"
            char[] r0 = r0.toCharArray()
            r4.<init>(r5, r0)
            r5 = 0
            r3.<init>(r4, r5)
            r5 = 512(0x200, float:7.175E-43)
            char[] r5 = new char[r5]
            r3.f19802h = r5
            char[] r5 = r4.f19795b
            int r5 = r5.length
            r0 = 16
            r1 = 0
            if (r5 != r0) goto L_0x0023
            r5 = 1
            goto L_0x0024
        L_0x0023:
            r5 = r1
        L_0x0024:
            p105h7.C6460j.m25556c(r5)
        L_0x0027:
            r5 = 256(0x100, float:3.59E-43)
            if (r1 >= r5) goto L_0x0044
            char[] r5 = r3.f19802h
            int r0 = r1 >>> 4
            char r0 = r4.mo20382a(r0)
            r5[r1] = r0
            char[] r5 = r3.f19802h
            r0 = r1 | 256(0x100, float:3.59E-43)
            r2 = r1 & 15
            char r2 = r4.mo20382a(r2)
            r5[r0] = r2
            int r1 = r1 + 1
            goto L_0x0027
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p105h7.C6476z.<init>(java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20312a(Appendable appendable, byte[] bArr, int i, int i2) {
        C6460j.m25558e(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = bArr[i3] & 255;
            appendable.append(this.f19802h[b]);
            appendable.append(this.f19802h[b | 256]);
        }
    }
}

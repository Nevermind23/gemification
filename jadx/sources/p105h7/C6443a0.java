package p105h7;

/* renamed from: h7.a0 */
final class C6443a0 extends C6445b0 {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C6443a0(java.lang.String r2, java.lang.String r3, java.lang.Character r4) {
        /*
            r1 = this;
            h7.y r0 = new h7.y
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r1.<init>(r0, r4)
            char[] r2 = r0.f19795b
            int r2 = r2.length
            r3 = 64
            if (r2 != r3) goto L_0x0017
            r2 = 1
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            p105h7.C6460j.m25556c(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p105h7.C6443a0.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20312a(Appendable appendable, byte[] bArr, int i, int i2) {
        int i3 = 0;
        C6460j.m25558e(0, i2, bArr.length);
        for (int i4 = i2; i4 >= 3; i4 -= 3) {
            int i5 = i3 + 1;
            int i6 = i5 + 1;
            byte b = ((bArr[i3] & 255) << 16) | ((bArr[i5] & 255) << 8) | (bArr[i6] & 255);
            appendable.append(this.f19726f.mo20382a(b >>> 18));
            appendable.append(this.f19726f.mo20382a((b >>> 12) & 63));
            appendable.append(this.f19726f.mo20382a((b >>> 6) & 63));
            appendable.append(this.f19726f.mo20382a(b & 63));
            i3 = i6 + 1;
        }
        if (i3 < i2) {
            mo20314e(appendable, bArr, i3, i2 - i3);
        }
    }
}

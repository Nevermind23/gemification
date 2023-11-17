package p105h7;

import java.math.RoundingMode;

/* renamed from: h7.b0 */
class C6445b0 extends C6447c0 {

    /* renamed from: f */
    final C6475y f19726f;

    /* renamed from: g */
    final Character f19727g;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C6445b0(p105h7.C6475y r4, java.lang.Character r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.f19726f = r4
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L_0x0017
            r5.charValue()
            r2 = 61
            boolean r4 = r4.mo20383b(r2)
            if (r4 != 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r4 = r0
            goto L_0x0018
        L_0x0017:
            r4 = r1
        L_0x0018:
            if (r4 == 0) goto L_0x001d
            r3.f19727g = r5
            return
        L_0x001d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.String r5 = "Padding character %s was already in alphabet"
            java.lang.String r5 = p105h7.C6461k.m25560a(r5, r1)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p105h7.C6445b0.<init>(h7.y, java.lang.Character):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20312a(Appendable appendable, byte[] bArr, int i, int i2) {
        int i3 = 0;
        C6460j.m25558e(0, i2, bArr.length);
        while (i3 < i2) {
            mo20314e(appendable, bArr, i3, Math.min(this.f19726f.f19799f, i2 - i3));
            i3 += this.f19726f.f19799f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo20313b(int i) {
        C6475y yVar = this.f19726f;
        return yVar.f19798e * C6451e0.m25544a(i, yVar.f19799f, RoundingMode.CEILING);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo20314e(Appendable appendable, byte[] bArr, int i, int i2) {
        boolean z;
        C6460j.m25558e(i, i + i2, bArr.length);
        int i3 = 0;
        if (i2 <= this.f19726f.f19799f) {
            z = true;
        } else {
            z = false;
        }
        C6460j.m25556c(z);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | ((long) (bArr[i + i4] & 255))) << 8;
        }
        int i5 = ((i2 + 1) * 8) - this.f19726f.f19797d;
        while (i3 < i2 * 8) {
            C6475y yVar = this.f19726f;
            appendable.append(yVar.mo20382a(yVar.f19796c & ((int) (j >>> (i5 - i3)))));
            i3 += this.f19726f.f19797d;
        }
        if (this.f19727g != null) {
            while (i3 < this.f19726f.f19799f * 8) {
                this.f19727g.charValue();
                appendable.append('=');
                i3 += this.f19726f.f19797d;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6445b0) {
            C6445b0 b0Var = (C6445b0) obj;
            if (this.f19726f.equals(b0Var.f19726f)) {
                Character ch = this.f19727g;
                Character ch2 = b0Var.f19727g;
                if (ch == ch2) {
                    return true;
                }
                if (ch == null || !ch.equals(ch2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f19726f.hashCode();
        Character ch = this.f19727g;
        if (ch == null) {
            i = 0;
        } else {
            i = ch.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.f19726f);
        if (8 % this.f19726f.f19797d != 0) {
            if (this.f19727g == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.f19727g);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    C6445b0(String str, String str2, Character ch) {
        this(new C6475y(str, str2.toCharArray()), ch);
    }
}

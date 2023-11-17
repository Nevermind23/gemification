package gg1;

/* renamed from: gg1.a */
public class C41123a implements C41124b {

    /* renamed from: a */
    protected final byte[] f97035a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b */
    protected byte f97036b = 61;

    /* renamed from: c */
    protected final byte[] f97037c = new byte[128];

    public C41123a() {
        mo95554b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00a3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo95553a(byte[] r10, int r11, int r12, java.io.OutputStream r13) {
        /*
            r9 = this;
            int r0 = r12 % 3
            int r12 = r12 - r0
            r1 = r11
        L_0x0004:
            int r2 = r11 + r12
            r3 = 4
            r4 = 2
            if (r1 >= r2) goto L_0x004c
            byte r2 = r10[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r5 = r1 + 1
            byte r5 = r10[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r6 = r1 + 2
            byte r6 = r10[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte[] r7 = r9.f97035a
            int r8 = r2 >>> 2
            r8 = r8 & 63
            byte r7 = r7[r8]
            r13.write(r7)
            byte[] r7 = r9.f97035a
            int r2 = r2 << r3
            int r3 = r5 >>> 4
            r2 = r2 | r3
            r2 = r2 & 63
            byte r2 = r7[r2]
            r13.write(r2)
            byte[] r2 = r9.f97035a
            int r3 = r5 << 2
            int r4 = r6 >>> 6
            r3 = r3 | r4
            r3 = r3 & 63
            byte r2 = r2[r3]
            r13.write(r2)
            byte[] r2 = r9.f97035a
            r3 = r6 & 63
            byte r2 = r2[r3]
            r13.write(r2)
            int r1 = r1 + 3
            goto L_0x0004
        L_0x004c:
            r11 = 1
            if (r0 == r11) goto L_0x007b
            if (r0 == r4) goto L_0x0052
            goto L_0x009e
        L_0x0052:
            byte r1 = r10[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r11
            byte r10 = r10[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r11 = r1 >>> 2
            r11 = r11 & 63
            int r1 = r1 << r3
            int r2 = r10 >>> 4
            r1 = r1 | r2
            r1 = r1 & 63
            int r10 = r10 << r4
            r10 = r10 & 63
            byte[] r2 = r9.f97035a
            byte r11 = r2[r11]
            r13.write(r11)
            byte[] r11 = r9.f97035a
            byte r11 = r11[r1]
            r13.write(r11)
            byte[] r11 = r9.f97035a
            byte r10 = r11[r10]
            goto L_0x0096
        L_0x007b:
            byte r10 = r10[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r11 = r10 >>> 2
            r11 = r11 & 63
            int r10 = r10 << r3
            r10 = r10 & 63
            byte[] r1 = r9.f97035a
            byte r11 = r1[r11]
            r13.write(r11)
            byte[] r11 = r9.f97035a
            byte r10 = r11[r10]
            r13.write(r10)
            byte r10 = r9.f97036b
        L_0x0096:
            r13.write(r10)
            byte r10 = r9.f97036b
            r13.write(r10)
        L_0x009e:
            int r12 = r12 / 3
            int r12 = r12 * r3
            if (r0 != 0) goto L_0x00a4
            r3 = 0
        L_0x00a4:
            int r12 = r12 + r3
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: gg1.C41123a.mo95553a(byte[], int, int, java.io.OutputStream):int");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo95554b() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f97037c;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.f97035a;
            if (i < bArr2.length) {
                this.f97037c[bArr2[i]] = (byte) i;
                i++;
            } else {
                return;
            }
        }
    }
}

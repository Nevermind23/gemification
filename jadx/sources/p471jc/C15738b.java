package p471jc;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: jc.b */
public final class C15738b {

    /* renamed from: a */
    private final byte[][] f44616a;

    /* renamed from: b */
    private final int f44617b;

    /* renamed from: c */
    private final int f44618c;

    public C15738b(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = i;
        iArr[0] = i2;
        this.f44616a = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        this.f44617b = i;
        this.f44618c = i2;
    }

    /* renamed from: a */
    public void mo43118a(byte b) {
        for (byte[] fill : this.f44616a) {
            Arrays.fill(fill, b);
        }
    }

    /* renamed from: b */
    public byte mo43119b(int i, int i2) {
        return this.f44616a[i2][i];
    }

    /* renamed from: c */
    public byte[][] mo43120c() {
        return this.f44616a;
    }

    /* renamed from: d */
    public int mo43121d() {
        return this.f44618c;
    }

    /* renamed from: e */
    public int mo43122e() {
        return this.f44617b;
    }

    /* renamed from: f */
    public void mo43123f(int i, int i2, int i3) {
        this.f44616a[i2][i] = (byte) i3;
    }

    /* renamed from: g */
    public void mo43124g(int i, int i2, boolean z) {
        this.f44616a[i2][i] = z ? (byte) 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f44617b * 2 * this.f44618c) + 2);
        for (int i = 0; i < this.f44618c; i++) {
            byte[] bArr = this.f44616a[i];
            for (int i2 = 0; i2 < this.f44617b; i2++) {
                byte b = bArr[i2];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append(10);
        }
        return sb.toString();
    }
}

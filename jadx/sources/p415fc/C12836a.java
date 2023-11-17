package p415fc;

import java.lang.reflect.Array;

/* renamed from: fc.a */
public final class C12836a {

    /* renamed from: a */
    private final C12837b[] f37940a;

    /* renamed from: b */
    private int f37941b;

    /* renamed from: c */
    private final int f37942c;

    /* renamed from: d */
    private final int f37943d;

    C12836a(int i, int i2) {
        C12837b[] bVarArr = new C12837b[i];
        this.f37940a = bVarArr;
        int length = bVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f37940a[i3] = new C12837b(((i2 + 4) * 17) + 1);
        }
        this.f37943d = i2 * 17;
        this.f37942c = i;
        this.f37941b = -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C12837b mo33488a() {
        return this.f37940a[this.f37941b];
    }

    /* renamed from: b */
    public byte[][] mo33489b(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = this.f37943d * i;
        iArr[0] = this.f37942c * i2;
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        int i3 = this.f37942c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.f37940a[i4 / i2].mo33492b(i);
        }
        return bArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo33490c() {
        this.f37941b++;
    }
}

package p415fc;

/* renamed from: fc.b */
final class C12837b {

    /* renamed from: a */
    private final byte[] f37944a;

    /* renamed from: b */
    private int f37945b = 0;

    C12837b(int i) {
        this.f37944a = new byte[i];
    }

    /* renamed from: c */
    private void m48590c(int i, boolean z) {
        this.f37944a[i] = z ? (byte) 1 : 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33491a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f37945b;
            this.f37945b = i3 + 1;
            m48590c(i3, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public byte[] mo33492b(int i) {
        int length = this.f37944a.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.f37944a[i2 / i];
        }
        return bArr;
    }
}

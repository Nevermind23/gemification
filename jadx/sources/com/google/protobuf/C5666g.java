package com.google.protobuf;

/* renamed from: com.google.protobuf.g */
public abstract class C5666g {

    /* renamed from: d */
    private static volatile int f17890d = 100;

    /* renamed from: a */
    int f17891a;

    /* renamed from: b */
    int f17892b;

    /* renamed from: c */
    private boolean f17893c;

    /* renamed from: com.google.protobuf.g$b */
    private static final class C5668b extends C5666g {

        /* renamed from: e */
        private final byte[] f17894e;

        /* renamed from: f */
        private final boolean f17895f;

        /* renamed from: g */
        private int f17896g;

        /* renamed from: h */
        private int f17897h;

        /* renamed from: i */
        private int f17898i;

        /* renamed from: j */
        private int f17899j;

        /* renamed from: k */
        private int f17900k;

        /* renamed from: f */
        private void m22669f() {
            int i = this.f17896g + this.f17897h;
            this.f17896g = i;
            int i2 = i - this.f17899j;
            int i3 = this.f17900k;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f17897h = i4;
                this.f17896g = i - i4;
                return;
            }
            this.f17897h = 0;
        }

        /* renamed from: d */
        public int mo18656d() {
            return this.f17898i - this.f17899j;
        }

        /* renamed from: e */
        public int mo18657e(int i) {
            if (i >= 0) {
                int d = i + mo18656d();
                if (d >= 0) {
                    int i2 = this.f17900k;
                    if (d <= i2) {
                        this.f17900k = d;
                        m22669f();
                        return i2;
                    }
                    throw InvalidProtocolBufferException.m22430d();
                }
                throw InvalidProtocolBufferException.m22429c();
            }
            throw InvalidProtocolBufferException.m22428b();
        }

        private C5668b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f17900k = Integer.MAX_VALUE;
            this.f17894e = bArr;
            this.f17896g = i2 + i;
            this.f17898i = i;
            this.f17899j = i;
            this.f17895f = z;
        }
    }

    /* renamed from: a */
    public static C5666g m22666a(byte[] bArr) {
        return m22667b(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static C5666g m22667b(byte[] bArr, int i, int i2) {
        return m22668c(bArr, i, i2, false);
    }

    /* renamed from: c */
    static C5666g m22668c(byte[] bArr, int i, int i2, boolean z) {
        C5668b bVar = new C5668b(bArr, i, i2, z);
        try {
            bVar.mo18657e(i2);
            return bVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private C5666g() {
        this.f17891a = f17890d;
        this.f17892b = Integer.MAX_VALUE;
        this.f17893c = false;
    }
}

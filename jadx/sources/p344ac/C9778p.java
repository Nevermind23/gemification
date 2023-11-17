package p344ac;

import com.google.zxing.FormatException;

/* renamed from: ac.p */
final class C9778p extends C9779q {

    /* renamed from: b */
    private final int f26564b;

    /* renamed from: c */
    private final int f26565c;

    C9778p(int i, int i2, int i3) {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw FormatException.m23153a();
        }
        this.f26564b = i2;
        this.f26565c = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo26239b() {
        return this.f26564b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo26240c() {
        return this.f26565c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo26241d() {
        return this.f26564b == 10;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo26242e() {
        return this.f26565c == 10;
    }
}

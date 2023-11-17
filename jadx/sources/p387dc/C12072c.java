package p387dc;

/* renamed from: dc.c */
final class C12072c {

    /* renamed from: a */
    private final C12071b f35479a;

    /* renamed from: b */
    private final int[] f35480b;

    C12072c(C12071b bVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f35479a = bVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f35480b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f35480b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f35480b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C12072c mo32205a(C12072c cVar) {
        if (!this.f35479a.equals(cVar.f35479a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo32209e()) {
            return cVar;
        } else {
            if (cVar.mo32209e()) {
                return this;
            }
            int[] iArr = this.f35480b;
            int[] iArr2 = cVar.f35480b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = this.f35479a.mo32195a(iArr2[i - length], iArr[i]);
            }
            return new C12072c(this.f35479a, iArr4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo32206b(int i) {
        if (i == 0) {
            return mo32207c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int a : this.f35480b) {
                i2 = this.f35479a.mo32195a(i2, a);
            }
            return i2;
        }
        int[] iArr = this.f35480b;
        int i3 = iArr[0];
        int length = iArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            C12071b bVar = this.f35479a;
            i3 = bVar.mo32195a(bVar.mo32203i(i, i3), this.f35480b[i4]);
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo32207c(int i) {
        int[] iArr = this.f35480b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo32208d() {
        return this.f35480b.length - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo32209e() {
        return this.f35480b[0] == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C12072c mo32210f(int i) {
        if (i == 0) {
            return this.f35479a.mo32200f();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f35480b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f35479a.mo32203i(this.f35480b[i2], i);
        }
        return new C12072c(this.f35479a, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C12072c mo32211g(C12072c cVar) {
        if (!this.f35479a.equals(cVar.f35479a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo32209e() || cVar.mo32209e()) {
            return this.f35479a.mo32200f();
        } else {
            int[] iArr = this.f35480b;
            int length = iArr.length;
            int[] iArr2 = cVar.f35480b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    C12071b bVar = this.f35479a;
                    iArr3[i4] = bVar.mo32195a(iArr3[i4], bVar.mo32203i(i2, iArr2[i3]));
                }
            }
            return new C12072c(this.f35479a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C12072c mo32212h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f35479a.mo32200f();
        } else {
            int length = this.f35480b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f35479a.mo32203i(this.f35480b[i3], i2);
            }
            return new C12072c(this.f35479a, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C12072c mo32213i() {
        int length = this.f35480b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f35479a.mo32204j(0, this.f35480b[i]);
        }
        return new C12072c(this.f35479a, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C12072c mo32214j(C12072c cVar) {
        if (!this.f35479a.equals(cVar.f35479a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (cVar.mo32209e()) {
            return this;
        } else {
            return mo32205a(cVar.mo32213i());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(mo32208d() * 8);
        for (int d = mo32208d(); d >= 0; d--) {
            int c = mo32207c(d);
            if (c != 0) {
                if (c < 0) {
                    sb.append(" - ");
                    c = -c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (d == 0 || c != 1) {
                    sb.append(c);
                }
                if (d != 0) {
                    if (d == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(d);
                    }
                }
            }
        }
        return sb.toString();
    }
}

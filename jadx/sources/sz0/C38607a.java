package sz0;

import p190o1.C7397t;

/* renamed from: sz0.a */
public final class C38607a {

    /* renamed from: a */
    private final long f92467a;

    /* renamed from: b */
    private final int f92468b;

    /* renamed from: c */
    private final int f92469c;

    public C38607a(long j, int i, int i2) {
        this.f92467a = j;
        this.f92468b = i;
        this.f92469c = i2;
    }

    /* renamed from: a */
    public final long mo92229a() {
        return this.f92467a;
    }

    /* renamed from: b */
    public final int mo92230b() {
        return this.f92468b;
    }

    /* renamed from: c */
    public final int mo92231c() {
        return this.f92469c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38607a)) {
            return false;
        }
        C38607a aVar = (C38607a) obj;
        return this.f92467a == aVar.f92467a && this.f92468b == aVar.f92468b && this.f92469c == aVar.f92469c;
    }

    public int hashCode() {
        return (((C7397t.m28148a(this.f92467a) * 31) + this.f92468b) * 31) + this.f92469c;
    }

    public String toString() {
        long j = this.f92467a;
        int i = this.f92468b;
        int i2 = this.f92469c;
        return "ClickedProductItemData(accKey=" + j + ", position=" + i + ", type=" + i2 + ")";
    }
}

package p604sj;

/* renamed from: sj.a */
public final class C17812a {

    /* renamed from: a */
    private final int f50693a;

    /* renamed from: b */
    private final int f50694b;

    public C17812a(int i, int i2) {
        this.f50693a = i;
        this.f50694b = i2;
    }

    /* renamed from: a */
    public final int mo45396a() {
        return this.f50694b;
    }

    /* renamed from: b */
    public final int mo45397b() {
        return this.f50693a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17812a)) {
            return false;
        }
        C17812a aVar = (C17812a) obj;
        return this.f50693a == aVar.f50693a && this.f50694b == aVar.f50694b;
    }

    public int hashCode() {
        return (this.f50693a * 31) + this.f50694b;
    }

    public String toString() {
        int i = this.f50693a;
        int i2 = this.f50694b;
        return "BadgeSize(containerSizeId=" + i + ", badgeSizeId=" + i2 + ")";
    }
}

package uo0;

/* renamed from: uo0.a */
public final class C18269a {

    /* renamed from: a */
    private final int f51584a;

    /* renamed from: b */
    private final int f51585b;

    /* renamed from: c */
    private final int f51586c;

    public C18269a(int i, int i2, int i3) {
        this.f51584a = i;
        this.f51585b = i2;
        this.f51586c = i3;
    }

    /* renamed from: a */
    public final int mo45919a() {
        return this.f51584a;
    }

    /* renamed from: b */
    public final int mo45920b() {
        return this.f51585b;
    }

    /* renamed from: c */
    public final int mo45921c() {
        return this.f51586c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18269a)) {
            return false;
        }
        C18269a aVar = (C18269a) obj;
        return this.f51584a == aVar.f51584a && this.f51585b == aVar.f51585b && this.f51586c == aVar.f51586c;
    }

    public int hashCode() {
        return (((this.f51584a * 31) + this.f51585b) * 31) + this.f51586c;
    }

    public String toString() {
        int i = this.f51584a;
        int i2 = this.f51585b;
        int i3 = this.f51586c;
        return "HeaderStyle(iconOutlineColor=" + i + ", iconTintColor=" + i2 + ", textColor=" + i3 + ")";
    }
}

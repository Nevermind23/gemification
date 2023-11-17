package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* renamed from: androidx.core.graphics.d */
public final class C0829d {

    /* renamed from: e */
    public static final C0829d f3464e = new C0829d(0, 0, 0, 0);

    /* renamed from: a */
    public final int f3465a;

    /* renamed from: b */
    public final int f3466b;

    /* renamed from: c */
    public final int f3467c;

    /* renamed from: d */
    public final int f3468d;

    /* renamed from: androidx.core.graphics.d$a */
    static class C0830a {
        /* renamed from: a */
        static Insets m3110a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    private C0829d(int i, int i2, int i3, int i4) {
        this.f3465a = i;
        this.f3466b = i2;
        this.f3467c = i3;
        this.f3468d = i4;
    }

    /* renamed from: a */
    public static C0829d m3105a(C0829d dVar, C0829d dVar2) {
        return m3106b(Math.max(dVar.f3465a, dVar2.f3465a), Math.max(dVar.f3466b, dVar2.f3466b), Math.max(dVar.f3467c, dVar2.f3467c), Math.max(dVar.f3468d, dVar2.f3468d));
    }

    /* renamed from: b */
    public static C0829d m3106b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return f3464e;
        }
        return new C0829d(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static C0829d m3107c(Rect rect) {
        return m3106b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static C0829d m3108d(Insets insets) {
        return m3106b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: e */
    public Insets mo3296e() {
        return C0830a.m3110a(this.f3465a, this.f3466b, this.f3467c, this.f3468d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0829d.class != obj.getClass()) {
            return false;
        }
        C0829d dVar = (C0829d) obj;
        if (this.f3468d == dVar.f3468d && this.f3465a == dVar.f3465a && this.f3467c == dVar.f3467c && this.f3466b == dVar.f3466b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f3465a * 31) + this.f3466b) * 31) + this.f3467c) * 31) + this.f3468d;
    }

    public String toString() {
        return "Insets{left=" + this.f3465a + ", top=" + this.f3466b + ", right=" + this.f3467c + ", bottom=" + this.f3468d + '}';
    }
}

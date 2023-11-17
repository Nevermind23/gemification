package p677yb;

import com.google.zxing.C5766o;

/* renamed from: yb.c */
public final class C18873c {

    /* renamed from: a */
    private final int f52814a;

    /* renamed from: b */
    private final int[] f52815b;

    /* renamed from: c */
    private final C5766o[] f52816c;

    public C18873c(int i, int[] iArr, int i2, int i3, int i4) {
        this.f52814a = i;
        this.f52815b = iArr;
        float f = (float) i4;
        this.f52816c = new C5766o[]{new C5766o((float) i2, f), new C5766o((float) i3, f)};
    }

    /* renamed from: a */
    public C5766o[] mo46853a() {
        return this.f52816c;
    }

    /* renamed from: b */
    public int[] mo46854b() {
        return this.f52815b;
    }

    /* renamed from: c */
    public int mo46855c() {
        return this.f52814a;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C18873c) && this.f52814a == ((C18873c) obj).f52814a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f52814a;
    }
}

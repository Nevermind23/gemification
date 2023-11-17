package p181n5;

import android.content.Context;
import p298w5.C8850a;

/* renamed from: n5.c */
final class C7231c extends C7238h {

    /* renamed from: a */
    private final Context f21411a;

    /* renamed from: b */
    private final C8850a f21412b;

    /* renamed from: c */
    private final C8850a f21413c;

    /* renamed from: d */
    private final String f21414d;

    C7231c(Context context, C8850a aVar, C8850a aVar2, String str) {
        if (context != null) {
            this.f21411a = context;
            if (aVar != null) {
                this.f21412b = aVar;
                if (aVar2 != null) {
                    this.f21413c = aVar2;
                    if (str != null) {
                        this.f21414d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    /* renamed from: b */
    public Context mo21603b() {
        return this.f21411a;
    }

    /* renamed from: c */
    public String mo21604c() {
        return this.f21414d;
    }

    /* renamed from: d */
    public C8850a mo21605d() {
        return this.f21413c;
    }

    /* renamed from: e */
    public C8850a mo21606e() {
        return this.f21412b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7238h)) {
            return false;
        }
        C7238h hVar = (C7238h) obj;
        if (!this.f21411a.equals(hVar.mo21603b()) || !this.f21412b.equals(hVar.mo21606e()) || !this.f21413c.equals(hVar.mo21605d()) || !this.f21414d.equals(hVar.mo21604c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.f21411a.hashCode() ^ 1000003) * 1000003) ^ this.f21412b.hashCode()) * 1000003) ^ this.f21413c.hashCode()) * 1000003) ^ this.f21414d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f21411a + ", wallClock=" + this.f21412b + ", monotonicClock=" + this.f21413c + ", backendName=" + this.f21414d + "}";
    }
}

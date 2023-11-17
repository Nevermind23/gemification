package p430gd;

import android.graphics.Rect;
import java.util.List;
import p416fd.C12861p;

/* renamed from: gd.m */
public class C12983m {

    /* renamed from: a */
    private C12861p f38294a;

    /* renamed from: b */
    private int f38295b;

    /* renamed from: c */
    private boolean f38296c = false;

    /* renamed from: d */
    private C12987q f38297d = new C12984n();

    public C12983m(int i, C12861p pVar) {
        this.f38295b = i;
        this.f38294a = pVar;
    }

    /* renamed from: a */
    public C12861p mo33778a(List list, boolean z) {
        return this.f38297d.mo33784b(list, mo33779b(z));
    }

    /* renamed from: b */
    public C12861p mo33779b(boolean z) {
        C12861p pVar = this.f38294a;
        if (pVar == null) {
            return null;
        }
        if (z) {
            return pVar.mo33530b();
        }
        return pVar;
    }

    /* renamed from: c */
    public int mo33780c() {
        return this.f38295b;
    }

    /* renamed from: d */
    public Rect mo33781d(C12861p pVar) {
        return this.f38297d.mo33777d(pVar, this.f38294a);
    }

    /* renamed from: e */
    public void mo33782e(C12987q qVar) {
        this.f38297d = qVar;
    }
}

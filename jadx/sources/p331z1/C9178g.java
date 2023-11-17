package p331z1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.C2315d0;
import com.airbnb.lottie.C2325h;
import java.util.Collections;
import java.util.List;
import p020b2.C2129j;
import p255t1.C8312d;
import p294w1.C8738e;
import p319y1.C9009a;
import p319y1.C9027p;

/* renamed from: z1.g */
public class C9178g extends C9169b {

    /* renamed from: D */
    private final C8312d f25500D;

    /* renamed from: E */
    private final C9171c f25501E;

    C9178g(C2315d0 d0Var, C9174e eVar, C9171c cVar, C2325h hVar) {
        super(d0Var, eVar);
        this.f25501E = cVar;
        C8312d dVar = new C8312d(d0Var, this, new C9027p("__container", eVar.mo24773n(), false), hVar);
        this.f25500D = dVar;
        dVar.mo23469b(Collections.emptyList(), Collections.emptyList());
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo24748I(C8738e eVar, int i, List list, C8738e eVar2) {
        this.f25500D.mo23472f(eVar, i, list, eVar2);
    }

    /* renamed from: e */
    public void mo23471e(RectF rectF, Matrix matrix, boolean z) {
        super.mo23471e(rectF, matrix, z);
        this.f25500D.mo23471e(rectF, this.f25434o, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo24754t(Canvas canvas, Matrix matrix, int i) {
        this.f25500D.mo23473h(canvas, matrix, i);
    }

    /* renamed from: v */
    public C9009a mo24755v() {
        C9009a v = super.mo24755v();
        if (v != null) {
            return v;
        }
        return this.f25501E.mo24755v();
    }

    /* renamed from: x */
    public C2129j mo24757x() {
        C2129j x = super.mo24757x();
        if (x != null) {
            return x;
        }
        return this.f25501E.mo24757x();
    }
}

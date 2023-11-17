package p341ge.bog.chat.presentation.activity;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.C1259w;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import p503lg.C16574l;

/* renamed from: ge.bog.chat.presentation.activity.p0 */
public abstract class C13054p0 extends RecyclerView.C1762z {

    /* renamed from: a */
    private final RecyclerView f38454a;

    /* renamed from: b */
    private final C1259w f38455b;

    /* renamed from: ge.bog.chat.presentation.activity.p0$a */
    public static final class C13055a extends GestureDetector.SimpleOnGestureListener {
        C13055a() {
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            C41536l.m120489i(motionEvent, "e");
            return true;
        }
    }

    public C13054p0(RecyclerView recyclerView) {
        C41536l.m120489i(recyclerView, "recyclerView");
        this.f38454a = recyclerView;
        this.f38455b = new C1259w(recyclerView.getContext(), new C13055a());
    }

    /* renamed from: e */
    private final boolean m49237e(float f, float f2, View view, View view2) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (f < ((float) view.getLeft()) + translationX + ((float) view2.getLeft()) || f > ((float) view.getLeft()) + translationX + ((float) view2.getRight()) || f2 < ((float) view.getTop()) + translationY + ((float) view2.getTop()) || f2 > ((float) view.getTop()) + translationY + ((float) view2.getBottom())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo5737b(RecyclerView recyclerView, MotionEvent motionEvent) {
        C41536l.m120489i(recyclerView, "rv");
        C41536l.m120489i(motionEvent, "e");
        if (!this.f38455b.mo3731a(motionEvent)) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        View X = recyclerView.mo5295X(x, y);
        if (X != null) {
            RecyclerView.C1734f0 Z = recyclerView.mo5299Z(X);
            if (Z instanceof C16574l) {
                C16574l lVar = (C16574l) Z;
                if (lVar.mo34412d() && m49237e(x, y, X, lVar.mo34413f())) {
                    mo34319f(Z.getAdapterPosition(), (C16574l) Z);
                    return false;
                }
            }
            mo34320g();
            return false;
        }
        mo34320g();
        return false;
    }

    /* renamed from: d */
    public final C16574l mo34331d(int i) {
        RecyclerView.C1734f0 e0 = this.f38454a.mo5320e0(i);
        if (e0 instanceof C16574l) {
            return (C16574l) e0;
        }
        return null;
    }

    /* renamed from: f */
    public abstract void mo34319f(int i, C16574l lVar);

    /* renamed from: g */
    public abstract void mo34320g();

    /* renamed from: h */
    public final void mo34332h() {
        this.f38454a.mo5360m(this);
    }

    /* renamed from: i */
    public final void mo34333i() {
        this.f38454a.mo5365n1(this);
    }
}

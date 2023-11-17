package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import lr0.C37131f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.normalsteps.NormalStepsView;

/* renamed from: pr0.v */
public final class C37971v implements C6201a {

    /* renamed from: d */
    private final NormalStepsView f91267d;

    /* renamed from: e */
    public final NormalStepsView f91268e;

    private C37971v(NormalStepsView normalStepsView, NormalStepsView normalStepsView2) {
        this.f91267d = normalStepsView;
        this.f91268e = normalStepsView2;
    }

    /* renamed from: a */
    public static C37971v m111629a(View view) {
        if (view != null) {
            NormalStepsView normalStepsView = (NormalStepsView) view;
            return new C37971v(normalStepsView, normalStepsView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C37971v m111630d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.item_offered_plan, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111629a(inflate);
    }

    /* renamed from: c */
    public NormalStepsView mo3946b() {
        return this.f91267d;
    }
}

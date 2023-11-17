package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.actioncard.ActionCardView;

/* renamed from: iy0.o */
public final class C36620o implements C6201a {

    /* renamed from: d */
    private final ActionCardView f88340d;

    private C36620o(ActionCardView actionCardView) {
        this.f88340d = actionCardView;
    }

    /* renamed from: a */
    public static C36620o m108614a(View view) {
        if (view != null) {
            return new C36620o((ActionCardView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36620o m108615d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.common_product, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108614a(inflate);
    }

    /* renamed from: c */
    public ActionCardView mo3946b() {
        return this.f88340d;
    }
}

package p481jm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p411em.C12488e;
import p411em.C12489f;

/* renamed from: jm.z */
public final class C16247z implements C6201a {

    /* renamed from: d */
    private final FrameLayout f46015d;

    /* renamed from: e */
    public final InlineFeedback f46016e;

    private C16247z(FrameLayout frameLayout, InlineFeedback inlineFeedback) {
        this.f46015d = frameLayout;
        this.f46016e = inlineFeedback;
    }

    /* renamed from: a */
    public static C16247z m57922a(View view) {
        int i = C12488e.feedback_acc_package;
        InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view, i);
        if (inlineFeedback != null) {
            return new C16247z((FrameLayout) view, inlineFeedback);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16247z m57923d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.item_package_fee_warning, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57922a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f46015d;
    }
}

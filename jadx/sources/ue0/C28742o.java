package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ie0.C25187g;
import ie0.C25188h;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: ue0.o */
public final class C28742o implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73400d;

    /* renamed from: e */
    public final TextView f73401e;

    private C28742o(ConstraintLayout constraintLayout, TextView textView) {
        this.f73400d = constraintLayout;
        this.f73401e = textView;
    }

    /* renamed from: a */
    public static C28742o m88093a(View view) {
        int i = C25187g.textItem;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            return new C28742o((ConstraintLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28742o m88094d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.action_sheet_share_statistics_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88093a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73400d;
    }
}

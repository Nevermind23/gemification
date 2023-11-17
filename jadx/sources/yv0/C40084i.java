package yv0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.common.EmptyView;
import uv0.C39107d;

/* renamed from: yv0.i */
public final class C40084i implements C6201a {

    /* renamed from: d */
    private final EmptyView f95299d;

    private C40084i(EmptyView emptyView) {
        this.f95299d = emptyView;
    }

    /* renamed from: a */
    public static C40084i m116142a(View view) {
        if (view != null) {
            return new C40084i((EmptyView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C40084i m116143d(LayoutInflater layoutInflater) {
        return m116144e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C40084i m116144e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39107d.view_empty, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116142a(inflate);
    }

    /* renamed from: c */
    public EmptyView mo3946b() {
        return this.f95299d;
    }
}

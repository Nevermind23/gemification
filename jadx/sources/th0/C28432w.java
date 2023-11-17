package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import oh0.C27011f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.common.EmptyView;

/* renamed from: th0.w */
public final class C28432w implements C6201a {

    /* renamed from: d */
    private final EmptyView f72225d;

    private C28432w(EmptyView emptyView) {
        this.f72225d = emptyView;
    }

    /* renamed from: a */
    public static C28432w m87250a(View view) {
        if (view != null) {
            return new C28432w((EmptyView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28432w m87251d(LayoutInflater layoutInflater) {
        return m87252e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28432w m87252e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_empty_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87250a(inflate);
    }

    /* renamed from: c */
    public EmptyView mo3946b() {
        return this.f72225d;
    }
}

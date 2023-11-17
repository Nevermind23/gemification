package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.list.StatusListItem;
import p601sg.C17783h;

/* renamed from: ak.s */
public final class C10008s implements C6201a {

    /* renamed from: d */
    private final StatusListItem f27488d;

    private C10008s(StatusListItem statusListItem) {
        this.f27488d = statusListItem;
    }

    /* renamed from: a */
    public static C10008s m36707a(View view) {
        if (view != null) {
            return new C10008s((StatusListItem) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C10008s m36708d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.item_strength_status, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36707a(inflate);
    }

    /* renamed from: c */
    public StatusListItem mo3946b() {
        return this.f27488d;
    }
}

package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bv0.C31205e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.listsection.ListSectionView;

/* renamed from: ev0.o */
public final class C31834o implements C6201a {

    /* renamed from: d */
    private final ListSectionView f78533d;

    private C31834o(ListSectionView listSectionView) {
        this.f78533d = listSectionView;
    }

    /* renamed from: a */
    public static C31834o m94125a(View view) {
        if (view != null) {
            return new C31834o((ListSectionView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C31834o m94126d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.item_bank_with_products, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94125a(inflate);
    }

    /* renamed from: c */
    public ListSectionView mo3946b() {
        return this.f78533d;
    }
}

package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ba1.C10217v;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.list.ListItem;

/* renamed from: ua1.h */
public final class C28645h implements C6201a {

    /* renamed from: d */
    private final ListItem f72748d;

    private C28645h(ListItem listItem) {
        this.f72748d = listItem;
    }

    /* renamed from: a */
    public static C28645h m87684a(View view) {
        if (view != null) {
            return new C28645h((ListItem) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28645h m87685d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.aml_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87684a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f72748d;
    }
}

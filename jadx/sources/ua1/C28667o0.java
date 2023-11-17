package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;

/* renamed from: ua1.o0 */
public final class C28667o0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f72870d;

    /* renamed from: e */
    public final ActionSheetTitle f72871e;

    /* renamed from: f */
    public final RecyclerView f72872f;

    private C28667o0(LinearLayout linearLayout, ActionSheetTitle actionSheetTitle, RecyclerView recyclerView) {
        this.f72870d = linearLayout;
        this.f72871e = actionSheetTitle;
        this.f72872f = recyclerView;
    }

    /* renamed from: a */
    public static C28667o0 m87780a(View view) {
        int i = C10216u.f28317b;
        ActionSheetTitle actionSheetTitle = (ActionSheetTitle) C6202b.m24689a(view, i);
        if (actionSheetTitle != null) {
            i = C10216u.security_settings_recycler;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                return new C28667o0((LinearLayout) view, actionSheetTitle, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28667o0 m87781d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_security_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87780a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f72870d;
    }
}

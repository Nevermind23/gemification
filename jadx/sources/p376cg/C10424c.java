package p376cg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p653wf.C18588q;
import p653wf.C18589r;

/* renamed from: cg.c */
public final class C10424c implements C6201a {

    /* renamed from: d */
    private final LinearLayout f29638d;

    /* renamed from: e */
    public final RecyclerView f29639e;

    /* renamed from: f */
    public final ToolbarView f29640f;

    private C10424c(LinearLayout linearLayout, RecyclerView recyclerView, ToolbarView toolbarView) {
        this.f29638d = linearLayout;
        this.f29639e = recyclerView;
        this.f29640f = toolbarView;
    }

    /* renamed from: a */
    public static C10424c m37861a(View view) {
        int i = C18588q.faq_recycler;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            i = C18588q.f52149B0;
            ToolbarView toolbarView = (ToolbarView) C6202b.m24689a(view, i);
            if (toolbarView != null) {
                return new C10424c((LinearLayout) view, recyclerView, toolbarView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10424c m37862d(LayoutInflater layoutInflater) {
        return m37863e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C10424c m37863e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18589r.activity_chat_faq, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37861a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f29638d;
    }
}

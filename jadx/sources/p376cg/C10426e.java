package p376cg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.chat.presentation.view.ScrollListenerWebView;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p653wf.C18588q;
import p653wf.C18589r;

/* renamed from: cg.e */
public final class C10426e implements C6201a {

    /* renamed from: d */
    private final LinearLayout f29646d;

    /* renamed from: e */
    public final View f29647e;

    /* renamed from: f */
    public final FixedButtonView f29648f;

    /* renamed from: g */
    public final ToolbarView f29649g;

    /* renamed from: h */
    public final ScrollListenerWebView f29650h;

    private C10426e(LinearLayout linearLayout, View view, FixedButtonView fixedButtonView, ToolbarView toolbarView, ScrollListenerWebView scrollListenerWebView) {
        this.f29646d = linearLayout;
        this.f29647e = view;
        this.f29648f = fixedButtonView;
        this.f29649g = toolbarView;
        this.f29650h = scrollListenerWebView;
    }

    /* renamed from: a */
    public static C10426e m37871a(View view) {
        int i = C18588q.f52165p;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C18588q.f52152I;
            FixedButtonView fixedButtonView = (FixedButtonView) C6202b.m24689a(view, i);
            if (fixedButtonView != null) {
                i = C18588q.f52149B0;
                ToolbarView toolbarView = (ToolbarView) C6202b.m24689a(view, i);
                if (toolbarView != null) {
                    i = C18588q.f52151E0;
                    ScrollListenerWebView scrollListenerWebView = (ScrollListenerWebView) C6202b.m24689a(view, i);
                    if (scrollListenerWebView != null) {
                        return new C10426e((LinearLayout) view, a, fixedButtonView, toolbarView, scrollListenerWebView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10426e m37872d(LayoutInflater layoutInflater) {
        return m37873e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C10426e m37873e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18589r.activity_pre_contract, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37871a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f29646d;
    }
}

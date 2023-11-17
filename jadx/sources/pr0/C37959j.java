package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import lr0.C37130e;
import lr0.C37131f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView;

/* renamed from: pr0.j */
public final class C37959j implements C6201a {

    /* renamed from: d */
    private final LayerView f91219d;

    /* renamed from: e */
    public final TextProgressBarView f91220e;

    /* renamed from: f */
    public final EmptyWidget f91221f;

    private C37959j(LayerView layerView, TextProgressBarView textProgressBarView, EmptyWidget emptyWidget) {
        this.f91219d = layerView;
        this.f91220e = textProgressBarView;
        this.f91221f = emptyWidget;
    }

    /* renamed from: a */
    public static C37959j m111581a(View view) {
        int i = C37130e.f89446u1;
        TextProgressBarView textProgressBarView = (TextProgressBarView) C6202b.m24689a(view, i);
        if (textProgressBarView != null) {
            i = C37130e.f89449v1;
            EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
            if (emptyWidget != null) {
                return new C37959j((LayerView) view, textProgressBarView, emptyWidget);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C37959j m111582d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.item_installment_progress, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111581a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f91219d;
    }
}

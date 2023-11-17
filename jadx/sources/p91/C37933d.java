package p91;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import l91.C37116c;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: p91.d */
public final class C37933d implements C6201a {

    /* renamed from: d */
    private final LayerView f91063d;

    /* renamed from: e */
    public final View f91064e;

    /* renamed from: f */
    public final RecyclerView f91065f;

    /* renamed from: g */
    public final Button f91066g;

    /* renamed from: h */
    public final Guideline f91067h;

    /* renamed from: i */
    public final Guideline f91068i;

    /* renamed from: j */
    public final AppCompatTextView f91069j;

    /* renamed from: k */
    public final EmptyWidget f91070k;

    private C37933d(LayerView layerView, View view, RecyclerView recyclerView, Button button, Guideline guideline, Guideline guideline2, AppCompatTextView appCompatTextView, EmptyWidget emptyWidget) {
        this.f91063d = layerView;
        this.f91064e = view;
        this.f91065f = recyclerView;
        this.f91066g = button;
        this.f91067h = guideline;
        this.f91068i = guideline2;
        this.f91069j = appCompatTextView;
        this.f91070k = emptyWidget;
    }

    /* renamed from: a */
    public static C37933d m111487a(View view) {
        int i = C37116c.backgrounds_click_catcher;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C37116c.backgrounds_recycler;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                i = C37116c.change_bg_button;
                Button button = (Button) C6202b.m24689a(view, i);
                if (button != null) {
                    i = C37116c.f89313i;
                    Guideline guideline = (Guideline) C6202b.m24689a(view, i);
                    if (guideline != null) {
                        i = C37116c.f89314j;
                        Guideline guideline2 = (Guideline) C6202b.m24689a(view, i);
                        if (guideline2 != null) {
                            i = C37116c.prelogin_backgrounds_description;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                            if (appCompatTextView != null) {
                                i = C37116c.prelogin_backgrounds_title;
                                EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
                                if (emptyWidget != null) {
                                    return new C37933d((LayerView) view, a, recyclerView, button, guideline, guideline2, appCompatTextView, emptyWidget);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f91063d;
    }
}

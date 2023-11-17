package p481jm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p411em.C12488e;
import p411em.C12489f;

/* renamed from: jm.n */
public final class C16235n implements C6201a {

    /* renamed from: d */
    private final LayerView f45923d;

    /* renamed from: e */
    public final AppCompatImageView f45924e;

    /* renamed from: f */
    public final ListItem f45925f;

    /* renamed from: g */
    public final TwoLineReverseTextItem f45926g;

    /* renamed from: h */
    public final ProgressBar f45927h;

    /* renamed from: i */
    public final AppCompatImageView f45928i;

    private C16235n(LayerView layerView, AppCompatImageView appCompatImageView, ListItem listItem, TwoLineReverseTextItem twoLineReverseTextItem, ProgressBar progressBar, AppCompatImageView appCompatImageView2) {
        this.f45923d = layerView;
        this.f45924e = appCompatImageView;
        this.f45925f = listItem;
        this.f45926g = twoLineReverseTextItem;
        this.f45927h = progressBar;
        this.f45928i = appCompatImageView2;
    }

    /* renamed from: a */
    public static C16235n m57874a(View view) {
        int i = C12488e.app_type_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C12488e.card_container;
            ListItem listItem = (ListItem) C6202b.m24689a(view, i);
            if (listItem != null) {
                i = C12488e.f37183L;
                TwoLineReverseTextItem twoLineReverseTextItem = (TwoLineReverseTextItem) C6202b.m24689a(view, i);
                if (twoLineReverseTextItem != null) {
                    i = C12488e.f37201f1;
                    ProgressBar progressBar = (ProgressBar) C6202b.m24689a(view, i);
                    if (progressBar != null) {
                        i = C12488e.f37214n1;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
                        if (appCompatImageView2 != null) {
                            return new C16235n((LayerView) view, appCompatImageView, listItem, twoLineReverseTextItem, progressBar, appCompatImageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16235n m57875d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.card_app_type_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57874a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f45923d;
    }
}

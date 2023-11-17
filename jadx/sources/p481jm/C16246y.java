package p481jm;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.currencybadge.CurrencyBadgeView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p411em.C12488e;

/* renamed from: jm.y */
public final class C16246y implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f46003d;

    /* renamed from: e */
    public final PageDescriptionView f46004e;

    /* renamed from: f */
    public final LayerView f46005f;

    /* renamed from: g */
    public final AppCompatTextView f46006g;

    /* renamed from: h */
    public final AppCompatTextView f46007h;

    /* renamed from: i */
    public final ListItem f46008i;

    /* renamed from: j */
    public final Barrier f46009j;

    /* renamed from: k */
    public final LayerView f46010k;

    /* renamed from: l */
    public final CurrencyBadgeView f46011l;

    /* renamed from: m */
    public final AppCompatImageView f46012m;

    /* renamed from: n */
    public final AppCompatImageView f46013n;

    /* renamed from: o */
    public final Barrier f46014o;

    private C16246y(ConstraintLayout constraintLayout, PageDescriptionView pageDescriptionView, LayerView layerView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ListItem listItem, Barrier barrier, LayerView layerView2, CurrencyBadgeView currencyBadgeView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, Barrier barrier2) {
        this.f46003d = constraintLayout;
        this.f46004e = pageDescriptionView;
        this.f46005f = layerView;
        this.f46006g = appCompatTextView;
        this.f46007h = appCompatTextView2;
        this.f46008i = listItem;
        this.f46009j = barrier;
        this.f46010k = layerView2;
        this.f46011l = currencyBadgeView;
        this.f46012m = appCompatImageView;
        this.f46013n = appCompatImageView2;
        this.f46014o = barrier2;
    }

    /* renamed from: a */
    public static C16246y m57919a(View view) {
        int i = C12488e.delivery_option_description;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            i = C12488e.delivery_options_container;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C12488e.delivery_subtitle;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    i = C12488e.delivery_title;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView2 != null) {
                        i = C12488e.f37208l0;
                        ListItem listItem = (ListItem) C6202b.m24689a(view, i);
                        if (listItem != null) {
                            i = C12488e.f37216o0;
                            Barrier barrier = (Barrier) C6202b.m24689a(view, i);
                            if (barrier != null) {
                                i = C12488e.f37179G0;
                                LayerView layerView2 = (LayerView) C6202b.m24689a(view, i);
                                if (layerView2 != null) {
                                    i = C12488e.f37212m1;
                                    CurrencyBadgeView currencyBadgeView = (CurrencyBadgeView) C6202b.m24689a(view, i);
                                    if (currencyBadgeView != null) {
                                        i = C12488e.f37214n1;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                                        if (appCompatImageView != null) {
                                            i = C12488e.option_icon;
                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
                                            if (appCompatImageView2 != null) {
                                                i = C12488e.f37199e2;
                                                Barrier barrier2 = (Barrier) C6202b.m24689a(view, i);
                                                if (barrier2 != null) {
                                                    return new C16246y((ConstraintLayout) view, pageDescriptionView, layerView, appCompatTextView, appCompatTextView2, listItem, barrier, layerView2, currencyBadgeView, appCompatImageView, appCompatImageView2, barrier2);
                                                }
                                            }
                                        }
                                    }
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
    public ConstraintLayout mo3946b() {
        return this.f46003d;
    }
}

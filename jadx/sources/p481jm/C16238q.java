package p481jm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p411em.C12488e;
import p411em.C12489f;

/* renamed from: jm.q */
public final class C16238q implements C6201a {

    /* renamed from: d */
    private final ScrollView f45957d;

    /* renamed from: e */
    public final PageDescriptionView f45958e;

    /* renamed from: f */
    public final EmptyWidget f45959f;

    /* renamed from: g */
    public final ConstraintLayout f45960g;

    /* renamed from: h */
    public final RecyclerView f45961h;

    /* renamed from: i */
    public final Guideline f45962i;

    /* renamed from: j */
    public final Guideline f45963j;

    /* renamed from: k */
    public final LayerView f45964k;

    /* renamed from: l */
    public final Input f45965l;

    /* renamed from: m */
    public final LayerView f45966m;

    private C16238q(ScrollView scrollView, PageDescriptionView pageDescriptionView, EmptyWidget emptyWidget, ConstraintLayout constraintLayout, RecyclerView recyclerView, Guideline guideline, Guideline guideline2, LayerView layerView, Input input, LayerView layerView2) {
        this.f45957d = scrollView;
        this.f45958e = pageDescriptionView;
        this.f45959f = emptyWidget;
        this.f45960g = constraintLayout;
        this.f45961h = recyclerView;
        this.f45962i = guideline;
        this.f45963j = guideline2;
        this.f45964k = layerView;
        this.f45965l = input;
        this.f45966m = layerView2;
    }

    /* renamed from: a */
    public static C16238q m57887a(View view) {
        int i = C12488e.card_insurance_description;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            i = C12488e.card_insurance_header;
            EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
            if (emptyWidget != null) {
                i = C12488e.card_insurance_inputs;
                ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view, i);
                if (constraintLayout != null) {
                    i = C12488e.fees_container;
                    RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                    if (recyclerView != null) {
                        i = C12488e.f37174D0;
                        Guideline guideline = (Guideline) C6202b.m24689a(view, i);
                        if (guideline != null) {
                            i = C12488e.f37176E0;
                            Guideline guideline2 = (Guideline) C6202b.m24689a(view, i);
                            if (guideline2 != null) {
                                i = C12488e.f37186O0;
                                LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                                if (layerView != null) {
                                    i = C12488e.insurance_selector;
                                    Input input = (Input) C6202b.m24689a(view, i);
                                    if (input != null) {
                                        i = C12488e.summary_container;
                                        LayerView layerView2 = (LayerView) C6202b.m24689a(view, i);
                                        if (layerView2 != null) {
                                            return new C16238q((ScrollView) view, pageDescriptionView, emptyWidget, constraintLayout, recyclerView, guideline, guideline2, layerView, input, layerView2);
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

    /* renamed from: d */
    public static C16238q m57888d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.fragment_order_card_insurance_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57887a(inflate);
    }

    /* renamed from: c */
    public ScrollView mo3946b() {
        return this.f45957d;
    }
}

package p341ge.bog.mobilebank.cleanarch.presentation.common.filter.items;

import android.view.View;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.items.MultiSelectFilterView;
import p341ge.bog.mobilebank.p975ui.views.widgets.CustomCheckBox;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.items.c */
public final /* synthetic */ class C21529c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CustomCheckBox f57564d;

    /* renamed from: e */
    public final /* synthetic */ MultiSelectFilterView f57565e;

    /* renamed from: f */
    public final /* synthetic */ int f57566f;

    public /* synthetic */ C21529c(CustomCheckBox customCheckBox, MultiSelectFilterView multiSelectFilterView, int i) {
        this.f57564d = customCheckBox;
        this.f57565e = multiSelectFilterView;
        this.f57566f = i;
    }

    public final void onClick(View view) {
        MultiSelectFilterView.C21526a.m69605c(this.f57564d, this.f57565e, this.f57566f, view);
    }
}

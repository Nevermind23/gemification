package p341ge.bog.mobilebank.cleanarch.presentation.common.filter.items;

import android.view.View;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.items.AccountFilterView;
import p341ge.bog.mobilebank.p975ui.views.widgets.CustomCheckBox;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.items.a */
public final /* synthetic */ class C21527a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CustomCheckBox f57560d;

    /* renamed from: e */
    public final /* synthetic */ AccountFilterView f57561e;

    /* renamed from: f */
    public final /* synthetic */ int f57562f;

    public /* synthetic */ C21527a(CustomCheckBox customCheckBox, AccountFilterView accountFilterView, int i) {
        this.f57560d = customCheckBox;
        this.f57561e = accountFilterView;
        this.f57562f = i;
    }

    public final void onClick(View view) {
        AccountFilterView.C21517a.m69553c(this.f57560d, this.f57561e, this.f57562f, view);
    }
}

package g50;

import android.widget.CompoundButton;
import g50.C20732h;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel;

/* renamed from: g50.j */
public final /* synthetic */ class C20738j implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C20732h f55931a;

    /* renamed from: b */
    public final /* synthetic */ TransactionCategoryModel f55932b;

    /* renamed from: c */
    public final /* synthetic */ C20732h.C20733a f55933c;

    public /* synthetic */ C20738j(C20732h hVar, TransactionCategoryModel transactionCategoryModel, C20732h.C20733a aVar) {
        this.f55931a = hVar;
        this.f55932b = transactionCategoryModel;
        this.f55933c = aVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C20732h.C20733a.C20735b.m67154e(this.f55931a, this.f55932b, this.f55933c, compoundButton, z);
    }
}

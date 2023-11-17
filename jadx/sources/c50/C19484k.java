package c50;

import android.widget.CompoundButton;
import c50.C19490q;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel;

/* renamed from: c50.k */
public final /* synthetic */ class C19484k implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ TransactionCategoryModel f53752a;

    /* renamed from: b */
    public final /* synthetic */ C19490q f53753b;

    public /* synthetic */ C19484k(TransactionCategoryModel transactionCategoryModel, C19490q qVar) {
        this.f53752a = transactionCategoryModel;
        this.f53753b = qVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C19490q.C19491a.m65064z(this.f53752a, this.f53753b, compoundButton, z);
    }
}

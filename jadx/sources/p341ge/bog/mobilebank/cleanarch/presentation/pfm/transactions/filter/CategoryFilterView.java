package p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactions.filter;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g50.C20727d;
import g50.C20732h;
import he1.C41238w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactions.filter.CategoryFilterView */
public final class CategoryFilterView extends C20727d {

    /* renamed from: l */
    private C20732h f59082l;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactions.filter.CategoryFilterView$a */
    static final class C22262a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CategoryFilterView f59083d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22262a(CategoryFilterView categoryFilterView) {
            super(1);
            this.f59083d = categoryFilterView;
        }

        /* renamed from: a */
        public final void mo55139a(int i) {
            this.f59083d.mo49261h(i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55139a(((Number) obj).intValue());
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CategoryFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
        C41536l.m120489i(attributeSet, "attributeSet");
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new RecyclerView.C1752q(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setNestedScrollingEnabled(false);
        C20732h hVar = new C20732h();
        this.f59082l = hVar;
        recyclerView.setAdapter(hVar);
        getContentLayout().addView(recyclerView);
        this.f59082l.mo49272o(new C22262a(this));
    }

    public final List<Long> getSelectedCategoryIds() {
        HashSet k = this.f59082l.mo49268k();
        if (k.isEmpty()) {
            return null;
        }
        return new ArrayList(k);
    }

    public final void setCategories(List<TransactionCategoryModel> list) {
        C41536l.m120489i(list, "categories");
        this.f59082l.mo49271n(list);
    }

    public final void setSelectedCategoryIds(List<Long> list) {
        HashSet hashSet;
        C20732h hVar = this.f59082l;
        if (list == null || (hashSet = C41358y.m120034x0(list)) == null) {
            hashSet = new HashSet();
        }
        hVar.mo49273p(hashSet);
    }
}

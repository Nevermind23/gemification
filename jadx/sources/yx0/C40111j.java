package yx0;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.payments.presentation.form.model.SelectElementViewData;
import ue1.C43075l;

/* renamed from: yx0.j */
public final class C40111j extends Filter {

    /* renamed from: a */
    private final List f95353a;

    /* renamed from: b */
    private final C43075l f95354b;

    public C40111j(List list, C43075l lVar) {
        C41536l.m120489i(list, "options");
        C41536l.m120489i(lVar, "callback");
        this.f95353a = list;
        this.f95354b = lVar;
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        boolean z;
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (charSequence == null || C40439w.m117118v(charSequence)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            List list = this.f95353a;
            filterResults.values = list;
            filterResults.count = list.size();
        } else {
            List list2 = this.f95353a;
            ArrayList arrayList = new ArrayList();
            for (Object next : list2) {
                if (C40440x.m117135K(((SelectElementViewData) next).mo80348h(), charSequence, true)) {
                    arrayList.add(next);
                }
            }
            filterResults.values = arrayList;
            filterResults.count = arrayList.size();
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Object obj;
        if (filterResults != null) {
            obj = filterResults.values;
        } else {
            obj = null;
        }
        C41536l.m120487g(obj, "null cannot be cast to non-null type kotlin.collections.List<ge.bog.mobilebank.payments.presentation.form.model.SelectElementViewData>");
        this.f95354b.invoke((List) obj);
    }
}

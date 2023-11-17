package p341ge.bog.mobilebank.cleanarch.presentation.common.filter.items;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import d10.C19821e;
import he1.C41238w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.CustomCheckBox;
import p366bk.C10322k;
import p366bk.C10324m;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.items.MultiSelectFilterView */
public final class MultiSelectFilterView extends C19821e {
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final HashSet f57556w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final ArrayList f57557x;

    /* renamed from: y */
    private String f57558y;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.items.MultiSelectFilterView$a */
    static final class C21526a extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ MultiSelectFilterView f57559d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21526a(MultiSelectFilterView multiSelectFilterView) {
            super(2);
            this.f57559d = multiSelectFilterView;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m69605c(CustomCheckBox customCheckBox, MultiSelectFilterView multiSelectFilterView, int i, View view) {
            C41536l.m120489i(customCheckBox, "$checkbox");
            C41536l.m120489i(multiSelectFilterView, "this$0");
            customCheckBox.setChecked(!customCheckBox.isChecked());
            if (customCheckBox.isChecked()) {
                multiSelectFilterView.f57556w.add(Integer.valueOf(i));
            } else {
                multiSelectFilterView.f57556w.remove(Integer.valueOf(i));
            }
            C43075l onValueChanged = multiSelectFilterView.getOnValueChanged();
            if (onValueChanged != null) {
                onValueChanged.invoke(new FilterValue.MultiSelect(multiSelectFilterView.f57556w));
            }
            multiSelectFilterView.mo48121n();
        }

        /* renamed from: b */
        public final void mo53747b(View view, int i) {
            C41536l.m120489i(view, "view");
            View findViewById = view.findViewById(C10322k.titleTV);
            C41536l.m120488h(findViewById, "view.findViewById(R.id.titleTV)");
            View findViewById2 = view.findViewById(C10322k.f28735G7);
            C41536l.m120488h(findViewById2, "view.findViewById(R.id.checkbox)");
            CustomCheckBox customCheckBox = (CustomCheckBox) findViewById2;
            ((BogTextView) findViewById).setText((CharSequence) this.f57559d.f57557x.get(i));
            customCheckBox.setChecked(this.f57559d.f57556w.contains(Integer.valueOf(i)));
            view.setOnClickListener(new C21529c(customCheckBox, this.f57559d, i));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo53747b((View) obj, ((Number) obj2).intValue());
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiSelectFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C10324m.multi_select_filter_recycler_item);
        C41536l.m120489i(context, "context");
        this.f57556w = new HashSet();
        this.f57557x = new ArrayList();
        m69602B();
    }

    /* renamed from: B */
    private final void m69602B() {
        setOnBindItem(new C21526a(this));
    }

    public final String getAnalyticsCategory() {
        return this.f57558y;
    }

    public int getSelectedCount() {
        return this.f57556w.size();
    }

    public FilterValue getValue() {
        return new FilterValue.MultiSelect(this.f57556w);
    }

    public final void setAnalyticsCategory(String str) {
        this.f57558y = str;
    }

    public void setItems(List<String> list) {
        C41536l.m120489i(list, "items");
        this.f57557x.clear();
        this.f57557x.addAll(list);
        ExpandableItemView.m69446y(this, list.size(), false, 2, (Object) null);
    }

    public void setValue(FilterValue.MultiSelect multiSelect) {
        C41536l.m120489i(multiSelect, C11755a.C11756a.f34100b);
        this.f57556w.clear();
        this.f57556w.addAll(multiSelect.mo53826d());
        mo48121n();
        mo53637o();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MultiSelectFilterView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}

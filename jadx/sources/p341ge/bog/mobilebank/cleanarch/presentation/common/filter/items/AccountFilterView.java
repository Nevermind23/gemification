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
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.AccountFilterItemModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.CustomCheckBox;
import p366bk.C10322k;
import p366bk.C10324m;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.items.AccountFilterView */
public final class AccountFilterView extends C19821e {
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final HashSet f57509w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final ArrayList f57510x;

    /* renamed from: y */
    private String f57511y;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.items.AccountFilterView$a */
    static final class C21517a extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ AccountFilterView f57512d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21517a(AccountFilterView accountFilterView) {
            super(2);
            this.f57512d = accountFilterView;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m69553c(CustomCheckBox customCheckBox, AccountFilterView accountFilterView, int i, View view) {
            C41536l.m120489i(customCheckBox, "$checkbox");
            C41536l.m120489i(accountFilterView, "this$0");
            customCheckBox.setChecked(!customCheckBox.isChecked());
            if (customCheckBox.isChecked()) {
                accountFilterView.f57509w.add(Integer.valueOf(i));
            } else {
                accountFilterView.f57509w.remove(Integer.valueOf(i));
            }
            C43075l onValueChanged = accountFilterView.getOnValueChanged();
            if (onValueChanged != null) {
                onValueChanged.invoke(new FilterValue.MultiSelect(accountFilterView.f57509w));
            }
            accountFilterView.mo48121n();
        }

        /* renamed from: b */
        public final void mo53727b(View view, int i) {
            C41536l.m120489i(view, "view");
            View findViewById = view.findViewById(C10322k.titleTV);
            C41536l.m120488h(findViewById, "view.findViewById(R.id.titleTV)");
            View findViewById2 = view.findViewById(C10322k.acctNoTV);
            C41536l.m120488h(findViewById2, "view.findViewById(R.id.acctNoTV)");
            View findViewById3 = view.findViewById(C10322k.f28827e1);
            C41536l.m120488h(findViewById3, "view.findViewById(R.id.amountTV)");
            View findViewById4 = view.findViewById(C10322k.f28735G7);
            C41536l.m120488h(findViewById4, "view.findViewById(R.id.checkbox)");
            CustomCheckBox customCheckBox = (CustomCheckBox) findViewById4;
            ((BogTextView) findViewById).setText(((AccountFilterItemModel) this.f57512d.f57510x.get(i)).mo53753d());
            ((BogTextView) findViewById2).setText(((AccountFilterItemModel) this.f57512d.f57510x.get(i)).mo53751a());
            ((BogTextView) findViewById3).setText(((AccountFilterItemModel) this.f57512d.f57510x.get(i)).mo53752b());
            customCheckBox.setChecked(this.f57512d.f57509w.contains(Integer.valueOf(i)));
            view.setOnClickListener(new C21527a(customCheckBox, this.f57512d, i));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo53727b((View) obj, ((Number) obj2).intValue());
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountFilterView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: B */
    private final void m69550B() {
        setOnBindItem(new C21517a(this));
    }

    public final String getAnalyticsCategory() {
        return this.f57511y;
    }

    public int getSelectedCount() {
        return this.f57509w.size();
    }

    public FilterValue getValue() {
        return new FilterValue.MultiSelect(this.f57509w);
    }

    public final void setAnalyticsCategory(String str) {
        this.f57511y = str;
    }

    public void setItems(List<AccountFilterItemModel> list) {
        C41536l.m120489i(list, "items");
        this.f57510x.clear();
        this.f57510x.addAll(list);
        ExpandableItemView.m69446y(this, list.size(), false, 2, (Object) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C10324m.account_filter_recycler_item);
        C41536l.m120489i(context, "context");
        this.f57509w = new HashSet();
        this.f57510x = new ArrayList();
        m69550B();
    }

    public void setValue(FilterValue.MultiSelect multiSelect) {
        C41536l.m120489i(multiSelect, C11755a.C11756a.f34100b);
        this.f57509w.clear();
        this.f57509w.addAll(multiSelect.mo53826d());
        mo48121n();
        mo53637o();
    }
}

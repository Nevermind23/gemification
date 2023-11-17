package d10;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import b10.C19308a;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;
import ue1.C43075l;

/* renamed from: d10.e */
public abstract class C19821e extends ExpandableItemView implements C19308a {

    /* renamed from: u */
    private C43075l f54198u;

    /* renamed from: v */
    private String f54199v = "";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19821e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, C10324m.filter_header, i);
        C41536l.m120489i(context, "context");
    }

    public final C43075l getOnValueChanged() {
        return this.f54198u;
    }

    public abstract int getSelectedCount();

    public abstract /* synthetic */ FilterValue getValue();

    /* renamed from: n */
    public void mo48121n() {
        View findViewById = getHeaderView().findViewById(C10322k.headerTV);
        C41536l.m120488h(findViewById, "headerView.findViewById(R.id.headerTV)");
        BogTextView bogTextView = (BogTextView) findViewById;
        View findViewById2 = getHeaderView().findViewById(C10322k.bubbleTV);
        C41536l.m120488h(findViewById2, "headerView.findViewById(R.id.bubbleTV)");
        BogTextView bogTextView2 = (BogTextView) findViewById2;
        String str = this.f54199v;
        if (str == null) {
            str = "";
        }
        bogTextView.setText(str);
        int selectedCount = getSelectedCount();
        if (selectedCount > 0) {
            bogTextView2.setVisibility(0);
            bogTextView2.setText(String.valueOf(selectedCount));
            return;
        }
        bogTextView2.setVisibility(8);
    }

    public final void setOnValueChanged(C43075l lVar) {
        this.f54198u = lVar;
    }

    public void setTitle(String str) {
        this.f54199v = str;
        mo48121n();
    }

    public abstract /* synthetic */ void setValue(FilterValue filterValue);
}

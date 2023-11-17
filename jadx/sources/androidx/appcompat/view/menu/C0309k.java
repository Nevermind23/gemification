package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: androidx.appcompat.view.menu.k */
abstract class C0309k implements C0318p, C0313m, AdapterView.OnItemClickListener {

    /* renamed from: d */
    private Rect f1660d;

    C0309k() {
    }

    /* renamed from: A */
    protected static boolean m1173A(C0297g gVar) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    protected static C0296f m1174B(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0296f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0296f) listAdapter;
    }

    /* renamed from: r */
    protected static int m1175r(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public int mo900a() {
        return 0;
    }

    /* renamed from: e */
    public boolean mo904e(C0297g gVar, C0301i iVar) {
        return false;
    }

    /* renamed from: l */
    public boolean mo908l(C0297g gVar, C0301i iVar) {
        return false;
    }

    /* renamed from: m */
    public void mo909m(Context context, C0297g gVar) {
    }

    /* renamed from: n */
    public abstract void mo928n(C0297g gVar);

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        C0297g gVar = m1174B(listAdapter).f1580d;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (mo932p()) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        gVar.mo981O(menuItem, this, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo932p() {
        return true;
    }

    /* renamed from: q */
    public Rect mo1176q() {
        return this.f1660d;
    }

    /* renamed from: s */
    public abstract void mo933s(View view);

    /* renamed from: t */
    public void mo1177t(Rect rect) {
        this.f1660d = rect;
    }

    /* renamed from: u */
    public abstract void mo934u(boolean z);

    /* renamed from: v */
    public abstract void mo935v(int i);

    /* renamed from: w */
    public abstract void mo936w(int i);

    /* renamed from: x */
    public abstract void mo937x(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: y */
    public abstract void mo938y(boolean z);

    /* renamed from: z */
    public abstract void mo939z(int i);
}

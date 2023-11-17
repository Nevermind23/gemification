package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0297g;
import androidx.appcompat.widget.C0483r1;

public final class ExpandedMenuView extends ListView implements C0297g.C0299b, C0315n, AdapterView.OnItemClickListener {

    /* renamed from: f */
    private static final int[] f1478f = {16842964, 16843049};

    /* renamed from: d */
    private C0297g f1479d;

    /* renamed from: e */
    private int f1480e;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    /* renamed from: a */
    public void mo826a(C0297g gVar) {
        this.f1479d = gVar;
    }

    /* renamed from: d */
    public boolean mo827d(C0301i iVar) {
        return this.f1479d.mo980N(iVar, 0);
    }

    public int getWindowAnimations() {
        return this.f1480e;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo827d((C0301i) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0483r1 v = C0483r1.m1946v(context, attributeSet, f1478f, i, 0);
        if (v.mo2332s(0)) {
            setBackgroundDrawable(v.mo2320g(0));
        }
        if (v.mo2332s(1)) {
            setDivider(v.mo2320g(1));
        }
        v.mo2333w();
    }
}

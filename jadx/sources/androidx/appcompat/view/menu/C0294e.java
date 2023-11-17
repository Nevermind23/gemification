package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.C0313m;
import androidx.appcompat.view.menu.C0315n;
import java.util.ArrayList;
import p030c.C2216g;

/* renamed from: androidx.appcompat.view.menu.e */
public class C0294e implements C0313m, AdapterView.OnItemClickListener {

    /* renamed from: d */
    Context f1568d;

    /* renamed from: e */
    LayoutInflater f1569e;

    /* renamed from: f */
    C0297g f1570f;

    /* renamed from: g */
    ExpandedMenuView f1571g;

    /* renamed from: h */
    int f1572h;

    /* renamed from: i */
    int f1573i;

    /* renamed from: j */
    int f1574j;

    /* renamed from: k */
    private C0313m.C0314a f1575k;

    /* renamed from: l */
    C0295a f1576l;

    /* renamed from: m */
    private int f1577m;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    private class C0295a extends BaseAdapter {

        /* renamed from: d */
        private int f1578d = -1;

        public C0295a() {
            mo952a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo952a() {
            C0301i x = C0294e.this.f1570f.mo1041x();
            if (x != null) {
                ArrayList B = C0294e.this.f1570f.mo969B();
                int size = B.size();
                for (int i = 0; i < size; i++) {
                    if (((C0301i) B.get(i)) == x) {
                        this.f1578d = i;
                        return;
                    }
                }
            }
            this.f1578d = -1;
        }

        /* renamed from: b */
        public C0301i getItem(int i) {
            ArrayList B = C0294e.this.f1570f.mo969B();
            int i2 = i + C0294e.this.f1572h;
            int i3 = this.f1578d;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return (C0301i) B.get(i2);
        }

        public int getCount() {
            int size = C0294e.this.f1570f.mo969B().size() - C0294e.this.f1572h;
            if (this.f1578d < 0) {
                return size;
            }
            return size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0294e eVar = C0294e.this;
                view = eVar.f1569e.inflate(eVar.f1574j, viewGroup, false);
            }
            ((C0315n.C0316a) view).mo805c(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo952a();
            super.notifyDataSetChanged();
        }
    }

    public C0294e(Context context, int i) {
        this(i, 0);
        this.f1568d = context;
        this.f1569e = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public int mo900a() {
        return this.f1577m;
    }

    /* renamed from: b */
    public ListAdapter mo947b() {
        if (this.f1576l == null) {
            this.f1576l = new C0295a();
        }
        return this.f1576l;
    }

    /* renamed from: c */
    public void mo902c(C0297g gVar, boolean z) {
        C0313m.C0314a aVar = this.f1575k;
        if (aVar != null) {
            aVar.mo519c(gVar, z);
        }
    }

    /* renamed from: d */
    public C0315n mo948d(ViewGroup viewGroup) {
        if (this.f1571g == null) {
            this.f1571g = (ExpandedMenuView) this.f1569e.inflate(C2216g.f6586g, viewGroup, false);
            if (this.f1576l == null) {
                this.f1576l = new C0295a();
            }
            this.f1571g.setAdapter(this.f1576l);
            this.f1571g.setOnItemClickListener(this);
        }
        return this.f1571g;
    }

    /* renamed from: e */
    public boolean mo904e(C0297g gVar, C0301i iVar) {
        return false;
    }

    /* renamed from: f */
    public void mo905f(C0313m.C0314a aVar) {
        this.f1575k = aVar;
    }

    /* renamed from: g */
    public void mo925g(Parcelable parcelable) {
        mo949n((Bundle) parcelable);
    }

    /* renamed from: h */
    public boolean mo906h(C0322r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new C0300h(rVar).mo1045b((IBinder) null);
        C0313m.C0314a aVar = this.f1575k;
        if (aVar == null) {
            return true;
        }
        aVar.mo520d(rVar);
        return true;
    }

    /* renamed from: i */
    public Parcelable mo926i() {
        if (this.f1571g == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        mo950o(bundle);
        return bundle;
    }

    /* renamed from: j */
    public void mo907j(boolean z) {
        C0295a aVar = this.f1576l;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: k */
    public boolean mo927k() {
        return false;
    }

    /* renamed from: l */
    public boolean mo908l(C0297g gVar, C0301i iVar) {
        return false;
    }

    /* renamed from: m */
    public void mo909m(Context context, C0297g gVar) {
        if (this.f1573i != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f1573i);
            this.f1568d = contextThemeWrapper;
            this.f1569e = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f1568d != null) {
            this.f1568d = context;
            if (this.f1569e == null) {
                this.f1569e = LayoutInflater.from(context);
            }
        }
        this.f1570f = gVar;
        C0295a aVar = this.f1576l;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: n */
    public void mo949n(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f1571g.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: o */
    public void mo950o(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f1571g;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f1570f.mo981O(this.f1576l.getItem(i), this, 0);
    }

    public C0294e(int i, int i2) {
        this.f1574j = i;
        this.f1573i = i2;
    }
}

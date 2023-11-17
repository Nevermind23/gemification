package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.C0315n;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.f */
public class C0296f extends BaseAdapter {

    /* renamed from: d */
    C0297g f1580d;

    /* renamed from: e */
    private int f1581e = -1;

    /* renamed from: f */
    private boolean f1582f;

    /* renamed from: g */
    private final boolean f1583g;

    /* renamed from: h */
    private final LayoutInflater f1584h;

    /* renamed from: i */
    private final int f1585i;

    public C0296f(C0297g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f1583g = z;
        this.f1584h = layoutInflater;
        this.f1580d = gVar;
        this.f1585i = i;
        mo959a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo959a() {
        C0301i x = this.f1580d.mo1041x();
        if (x != null) {
            ArrayList B = this.f1580d.mo969B();
            int size = B.size();
            for (int i = 0; i < size; i++) {
                if (((C0301i) B.get(i)) == x) {
                    this.f1581e = i;
                    return;
                }
            }
        }
        this.f1581e = -1;
    }

    /* renamed from: b */
    public C0297g mo960b() {
        return this.f1580d;
    }

    /* renamed from: c */
    public C0301i getItem(int i) {
        ArrayList arrayList;
        if (this.f1583g) {
            arrayList = this.f1580d.mo969B();
        } else {
            arrayList = this.f1580d.mo973G();
        }
        int i2 = this.f1581e;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0301i) arrayList.get(i);
    }

    /* renamed from: d */
    public void mo962d(boolean z) {
        this.f1582f = z;
    }

    public int getCount() {
        ArrayList arrayList;
        if (this.f1583g) {
            arrayList = this.f1580d.mo969B();
        } else {
            arrayList = this.f1580d.mo973G();
        }
        if (this.f1581e < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z;
        if (view == null) {
            view = this.f1584h.inflate(this.f1585i, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i3 = i - 1;
        if (i3 >= 0) {
            i2 = getItem(i3).getGroupId();
        } else {
            i2 = groupId;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (!this.f1580d.mo974H() || groupId == i2) {
            z = false;
        } else {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        C0315n.C0316a aVar = (C0315n.C0316a) view;
        if (this.f1582f) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo805c(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo959a();
        super.notifyDataSetChanged();
    }
}

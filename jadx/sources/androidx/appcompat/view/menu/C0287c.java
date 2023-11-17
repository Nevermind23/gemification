package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.SimpleArrayMap;
import p279v.C8682b;

/* renamed from: androidx.appcompat.view.menu.c */
abstract class C0287c {

    /* renamed from: a */
    final Context f1528a;

    /* renamed from: b */
    private SimpleArrayMap f1529b;

    /* renamed from: c */
    private SimpleArrayMap f1530c;

    C0287c(Context context) {
        this.f1528a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final MenuItem mo917c(MenuItem menuItem) {
        if (!(menuItem instanceof C8682b)) {
            return menuItem;
        }
        C8682b bVar = (C8682b) menuItem;
        if (this.f1529b == null) {
            this.f1529b = new SimpleArrayMap();
        }
        MenuItem menuItem2 = (MenuItem) this.f1529b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C0303j jVar = new C0303j(this.f1528a, bVar);
        this.f1529b.put(bVar, jVar);
        return jVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final SubMenu mo918d(SubMenu subMenu) {
        return subMenu;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo919e() {
        SimpleArrayMap simpleArrayMap = this.f1529b;
        if (simpleArrayMap != null) {
            simpleArrayMap.clear();
        }
        SimpleArrayMap simpleArrayMap2 = this.f1530c;
        if (simpleArrayMap2 != null) {
            simpleArrayMap2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo920f(int i) {
        if (this.f1529b != null) {
            int i2 = 0;
            while (i2 < this.f1529b.size()) {
                if (((C8682b) this.f1529b.keyAt(i2)).getGroupId() == i) {
                    this.f1529b.removeAt(i2);
                    i2--;
                }
                i2++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo921g(int i) {
        if (this.f1529b != null) {
            for (int i2 = 0; i2 < this.f1529b.size(); i2++) {
                if (((C8682b) this.f1529b.keyAt(i2)).getItemId() == i) {
                    this.f1529b.removeAt(i2);
                    return;
                }
            }
        }
    }
}

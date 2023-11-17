package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C0767a;
import androidx.core.view.C1111b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p279v.C8681a;

/* renamed from: androidx.appcompat.view.menu.g */
public class C0297g implements C8681a {

    /* renamed from: A */
    private static final int[] f1586A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f1587a;

    /* renamed from: b */
    private final Resources f1588b;

    /* renamed from: c */
    private boolean f1589c;

    /* renamed from: d */
    private boolean f1590d;

    /* renamed from: e */
    private C0298a f1591e;

    /* renamed from: f */
    private ArrayList f1592f;

    /* renamed from: g */
    private ArrayList f1593g;

    /* renamed from: h */
    private boolean f1594h;

    /* renamed from: i */
    private ArrayList f1595i;

    /* renamed from: j */
    private ArrayList f1596j;

    /* renamed from: k */
    private boolean f1597k;

    /* renamed from: l */
    private int f1598l = 0;

    /* renamed from: m */
    private ContextMenu.ContextMenuInfo f1599m;

    /* renamed from: n */
    CharSequence f1600n;

    /* renamed from: o */
    Drawable f1601o;

    /* renamed from: p */
    View f1602p;

    /* renamed from: q */
    private boolean f1603q = false;

    /* renamed from: r */
    private boolean f1604r = false;

    /* renamed from: s */
    private boolean f1605s = false;

    /* renamed from: t */
    private boolean f1606t = false;

    /* renamed from: u */
    private boolean f1607u = false;

    /* renamed from: v */
    private ArrayList f1608v = new ArrayList();

    /* renamed from: w */
    private CopyOnWriteArrayList f1609w = new CopyOnWriteArrayList();

    /* renamed from: x */
    private C0301i f1610x;

    /* renamed from: y */
    private boolean f1611y = false;

    /* renamed from: z */
    private boolean f1612z;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    public interface C0298a {
        /* renamed from: a */
        boolean mo462a(C0297g gVar, MenuItem menuItem);

        /* renamed from: b */
        void mo464b(C0297g gVar);
    }

    /* renamed from: androidx.appcompat.view.menu.g$b */
    public interface C0299b {
        /* renamed from: d */
        boolean mo827d(C0301i iVar);
    }

    public C0297g(Context context) {
        this.f1587a = context;
        this.f1588b = context.getResources();
        this.f1592f = new ArrayList();
        this.f1593g = new ArrayList();
        this.f1594h = true;
        this.f1595i = new ArrayList();
        this.f1596j = new ArrayList();
        this.f1597k = true;
        m1070f0(true);
    }

    /* renamed from: D */
    private static int m1067D(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f1586A;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: P */
    private void m1068P(int i, boolean z) {
        if (i >= 0 && i < this.f1592f.size()) {
            this.f1592f.remove(i);
            if (z) {
                mo979M(true);
            }
        }
    }

    /* renamed from: a0 */
    private void m1069a0(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources E = mo971E();
        if (view != null) {
            this.f1602p = view;
            this.f1600n = null;
            this.f1601o = null;
        } else {
            if (i > 0) {
                this.f1600n = E.getText(i);
            } else if (charSequence != null) {
                this.f1600n = charSequence;
            }
            if (i2 > 0) {
                this.f1601o = C0767a.m2895e(mo1040w(), i2);
            } else if (drawable != null) {
                this.f1601o = drawable;
            }
            this.f1602p = null;
        }
        mo979M(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        if (androidx.core.view.C1117b3.m4140e(android.view.ViewConfiguration.get(r2.f1587a), r2.f1587a) != false) goto L_0x001d;
     */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1070f0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x001c
            android.content.res.Resources r3 = r2.f1588b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L_0x001c
            android.content.Context r3 = r2.f1587a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f1587a
            boolean r3 = androidx.core.view.C1117b3.m4140e(r3, r1)
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r2.f1590d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0297g.m1070f0(boolean):void");
    }

    /* renamed from: g */
    private C0301i m1071g(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0301i(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: i */
    private void m1072i(boolean z) {
        if (!this.f1609w.isEmpty()) {
            mo1018h0();
            Iterator it = this.f1609w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0313m mVar = (C0313m) weakReference.get();
                if (mVar == null) {
                    this.f1609w.remove(weakReference);
                } else {
                    mVar.mo907j(z);
                }
            }
            mo1015g0();
        }
    }

    /* renamed from: j */
    private void m1073j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f1609w.isEmpty()) {
            Iterator it = this.f1609w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0313m mVar = (C0313m) weakReference.get();
                if (mVar == null) {
                    this.f1609w.remove(weakReference);
                } else {
                    int a = mVar.mo900a();
                    if (a > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(a)) != null) {
                        mVar.mo925g(parcelable);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    private void m1074k(Bundle bundle) {
        Parcelable i;
        if (!this.f1609w.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator it = this.f1609w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0313m mVar = (C0313m) weakReference.get();
                if (mVar == null) {
                    this.f1609w.remove(weakReference);
                } else {
                    int a = mVar.mo900a();
                    if (a > 0 && (i = mVar.mo926i()) != null) {
                        sparseArray.put(a, i);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    /* renamed from: l */
    private boolean m1075l(C0322r rVar, C0313m mVar) {
        boolean z = false;
        if (this.f1609w.isEmpty()) {
            return false;
        }
        if (mVar != null) {
            z = mVar.mo906h(rVar);
        }
        Iterator it = this.f1609w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0313m mVar2 = (C0313m) weakReference.get();
            if (mVar2 == null) {
                this.f1609w.remove(weakReference);
            } else if (!z) {
                z = mVar2.mo906h(rVar);
            }
        }
        return z;
    }

    /* renamed from: p */
    private static int m1076p(ArrayList arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C0301i) arrayList.get(size)).mo1052f() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: A */
    public View mo968A() {
        return this.f1602p;
    }

    /* renamed from: B */
    public ArrayList mo969B() {
        mo1037t();
        return this.f1596j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean mo970C() {
        return this.f1606t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public Resources mo971E() {
        return this.f1588b;
    }

    /* renamed from: F */
    public C0297g mo972F() {
        return this;
    }

    /* renamed from: G */
    public ArrayList mo973G() {
        if (!this.f1594h) {
            return this.f1593g;
        }
        this.f1593g.clear();
        int size = this.f1592f.size();
        for (int i = 0; i < size; i++) {
            C0301i iVar = (C0301i) this.f1592f.get(i);
            if (iVar.isVisible()) {
                this.f1593g.add(iVar);
            }
        }
        this.f1594h = false;
        this.f1597k = true;
        return this.f1593g;
    }

    /* renamed from: H */
    public boolean mo974H() {
        return this.f1611y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo975I() {
        return this.f1589c;
    }

    /* renamed from: J */
    public boolean mo976J() {
        return this.f1590d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo977K(C0301i iVar) {
        this.f1597k = true;
        mo979M(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo978L(C0301i iVar) {
        this.f1594h = true;
        mo979M(true);
    }

    /* renamed from: M */
    public void mo979M(boolean z) {
        if (!this.f1603q) {
            if (z) {
                this.f1594h = true;
                this.f1597k = true;
            }
            m1072i(z);
            return;
        }
        this.f1604r = true;
        if (z) {
            this.f1605s = true;
        }
    }

    /* renamed from: N */
    public boolean mo980N(MenuItem menuItem, int i) {
        return mo981O(menuItem, (C0313m) null, i);
    }

    /* renamed from: O */
    public boolean mo981O(MenuItem menuItem, C0313m mVar, int i) {
        boolean z;
        C0301i iVar = (C0301i) menuItem;
        if (iVar == null || !iVar.isEnabled()) {
            return false;
        }
        boolean k = iVar.mo1074k();
        C1111b a = iVar.mo841a();
        if (a == null || !a.mo1163b()) {
            z = false;
        } else {
            z = true;
        }
        if (iVar.mo1073j()) {
            k |= iVar.expandActionView();
            if (k) {
                mo1011e(true);
            }
        } else if (iVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                mo1011e(false);
            }
            if (!iVar.hasSubMenu()) {
                iVar.mo1104x(new C0322r(mo1040w(), this, iVar));
            }
            C0322r rVar = (C0322r) iVar.getSubMenu();
            if (z) {
                a.mo1165f(rVar);
            }
            k |= m1075l(rVar, mVar);
            if (!k) {
                mo1011e(true);
            }
        } else if ((i & 1) == 0) {
            mo1011e(true);
        }
        return k;
    }

    /* renamed from: Q */
    public void mo982Q(C0313m mVar) {
        Iterator it = this.f1609w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0313m mVar2 = (C0313m) weakReference.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.f1609w.remove(weakReference);
            }
        }
    }

    /* renamed from: R */
    public void mo983R(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo1039v());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0322r) item.getSubMenu()).mo983R(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* renamed from: S */
    public void mo984S(Bundle bundle) {
        m1073j(bundle);
    }

    /* renamed from: T */
    public void mo985T(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0322r) item.getSubMenu()).mo985T(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo1039v(), sparseArray);
        }
    }

    /* renamed from: U */
    public void mo986U(Bundle bundle) {
        m1074k(bundle);
    }

    /* renamed from: V */
    public void mo987V(C0298a aVar) {
        this.f1591e = aVar;
    }

    /* renamed from: W */
    public C0297g mo988W(int i) {
        this.f1598l = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo989X(MenuItem menuItem) {
        boolean z;
        int groupId = menuItem.getGroupId();
        int size = this.f1592f.size();
        mo1018h0();
        for (int i = 0; i < size; i++) {
            C0301i iVar = (C0301i) this.f1592f.get(i);
            if (iVar.getGroupId() == groupId && iVar.mo1076m() && iVar.isCheckable()) {
                if (iVar == menuItem) {
                    z = true;
                } else {
                    z = false;
                }
                iVar.mo1082s(z);
            }
        }
        mo1015g0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public C0297g mo990Y(int i) {
        m1069a0(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public C0297g mo991Z(Drawable drawable) {
        m1069a0(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo992a(int i, int i2, int i3, CharSequence charSequence) {
        int D = m1067D(i3);
        C0301i g = m1071g(i, i2, i3, D, charSequence, this.f1598l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1599m;
        if (contextMenuInfo != null) {
            g.mo1102v(contextMenuInfo);
        }
        ArrayList arrayList = this.f1592f;
        arrayList.add(m1076p(arrayList, D), g);
        mo979M(true);
        return g;
    }

    public MenuItem add(CharSequence charSequence) {
        return mo992a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        int i6;
        PackageManager packageManager = this.f1587a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            if (i8 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i8];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent4 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent4;
            }
        }
        return i5;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void mo1002b(C0313m mVar) {
        mo1004c(mVar, this.f1587a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public C0297g mo1003b0(int i) {
        m1069a0(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* renamed from: c */
    public void mo1004c(C0313m mVar, Context context) {
        this.f1609w.add(new WeakReference(mVar));
        mVar.mo909m(context, this);
        this.f1597k = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public C0297g mo1005c0(CharSequence charSequence) {
        m1069a0(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public void clear() {
        C0301i iVar = this.f1610x;
        if (iVar != null) {
            mo1013f(iVar);
        }
        this.f1592f.clear();
        mo979M(true);
    }

    public void clearHeader() {
        this.f1601o = null;
        this.f1600n = null;
        this.f1602p = null;
        mo979M(false);
    }

    public void close() {
        mo1011e(true);
    }

    /* renamed from: d */
    public void mo1009d() {
        C0298a aVar = this.f1591e;
        if (aVar != null) {
            aVar.mo464b(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public C0297g mo1010d0(View view) {
        m1069a0(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* renamed from: e */
    public final void mo1011e(boolean z) {
        if (!this.f1607u) {
            this.f1607u = true;
            Iterator it = this.f1609w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0313m mVar = (C0313m) weakReference.get();
                if (mVar == null) {
                    this.f1609w.remove(weakReference);
                } else {
                    mVar.mo902c(this, z);
                }
            }
            this.f1607u = false;
        }
    }

    /* renamed from: e0 */
    public void mo1012e0(boolean z) {
        this.f1612z = z;
    }

    /* renamed from: f */
    public boolean mo1013f(C0301i iVar) {
        boolean z = false;
        if (!this.f1609w.isEmpty() && this.f1610x == iVar) {
            mo1018h0();
            Iterator it = this.f1609w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0313m mVar = (C0313m) weakReference.get();
                if (mVar == null) {
                    this.f1609w.remove(weakReference);
                } else {
                    z = mVar.mo908l(this, iVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo1015g0();
            if (z) {
                this.f1610x = null;
            }
        }
        return z;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0301i iVar = (C0301i) this.f1592f.get(i2);
            if (iVar.getItemId() == i) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = iVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g0 */
    public void mo1015g0() {
        this.f1603q = false;
        if (this.f1604r) {
            this.f1604r = false;
            mo979M(this.f1605s);
        }
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.f1592f.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo1017h(C0297g gVar, MenuItem menuItem) {
        C0298a aVar = this.f1591e;
        return aVar != null && aVar.mo462a(gVar, menuItem);
    }

    /* renamed from: h0 */
    public void mo1018h0() {
        if (!this.f1603q) {
            this.f1603q = true;
            this.f1604r = false;
            this.f1605s = false;
        }
    }

    public boolean hasVisibleItems() {
        if (this.f1612z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C0301i) this.f1592f.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo1027r(i, keyEvent) != null;
    }

    /* renamed from: m */
    public boolean mo1021m(C0301i iVar) {
        boolean z = false;
        if (this.f1609w.isEmpty()) {
            return false;
        }
        mo1018h0();
        Iterator it = this.f1609w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0313m mVar = (C0313m) weakReference.get();
            if (mVar == null) {
                this.f1609w.remove(weakReference);
            } else {
                z = mVar.mo904e(this, iVar);
                if (z) {
                    break;
                }
            }
        }
        mo1015g0();
        if (z) {
            this.f1610x = iVar;
        }
        return z;
    }

    /* renamed from: n */
    public int mo1022n(int i) {
        return mo1023o(i, 0);
    }

    /* renamed from: o */
    public int mo1023o(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (((C0301i) this.f1592f.get(i2)).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo980N(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        C0301i r = mo1027r(i, keyEvent);
        if (r != null) {
            z = mo980N(r, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            mo1011e(true);
        }
        return z;
    }

    /* renamed from: q */
    public int mo1026q(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C0301i) this.f1592f.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C0301i mo1027r(int i, KeyEvent keyEvent) {
        char c;
        ArrayList arrayList = this.f1608v;
        arrayList.clear();
        mo1030s(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0301i) arrayList.get(0);
        }
        boolean I = mo975I();
        for (int i2 = 0; i2 < size; i2++) {
            C0301i iVar = (C0301i) arrayList.get(i2);
            if (I) {
                c = iVar.getAlphabeticShortcut();
            } else {
                c = iVar.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (I && c == 8 && i == 67))) {
                return iVar;
            }
        }
        return null;
    }

    public void removeGroup(int i) {
        int n = mo1022n(i);
        if (n >= 0) {
            int size = this.f1592f.size() - n;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || ((C0301i) this.f1592f.get(n)).getGroupId() != i) {
                    mo979M(true);
                } else {
                    m1068P(n, false);
                    i2 = i3;
                }
            }
            mo979M(true);
        }
    }

    public void removeItem(int i) {
        m1068P(mo1026q(i), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo1030s(List list, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean z;
        boolean I = mo975I();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f1592f.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0301i iVar = (C0301i) this.f1592f.get(i3);
                if (iVar.hasSubMenu()) {
                    ((C0297g) iVar.getSubMenu()).mo1030s(list, i, keyEvent);
                }
                if (I) {
                    c = iVar.getAlphabeticShortcut();
                } else {
                    c = iVar.getNumericShortcut();
                }
                if (I) {
                    i2 = iVar.getAlphabeticModifiers();
                } else {
                    i2 = iVar.getNumericModifiers();
                }
                if ((modifiers & 69647) == (i2 & 69647)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (I && c == 8 && i == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f1592f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0301i iVar = (C0301i) this.f1592f.get(i2);
            if (iVar.getGroupId() == i) {
                iVar.mo1099t(z2);
                iVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f1611y = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f1592f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0301i iVar = (C0301i) this.f1592f.get(i2);
            if (iVar.getGroupId() == i) {
                iVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f1592f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0301i iVar = (C0301i) this.f1592f.get(i2);
            if (iVar.getGroupId() == i && iVar.mo1105y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo979M(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f1589c = z;
        mo979M(false);
    }

    public int size() {
        return this.f1592f.size();
    }

    /* renamed from: t */
    public void mo1037t() {
        ArrayList G = mo973G();
        if (this.f1597k) {
            Iterator it = this.f1609w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0313m mVar = (C0313m) weakReference.get();
                if (mVar == null) {
                    this.f1609w.remove(weakReference);
                } else {
                    z |= mVar.mo927k();
                }
            }
            if (z) {
                this.f1595i.clear();
                this.f1596j.clear();
                int size = G.size();
                for (int i = 0; i < size; i++) {
                    C0301i iVar = (C0301i) G.get(i);
                    if (iVar.mo1075l()) {
                        this.f1595i.add(iVar);
                    } else {
                        this.f1596j.add(iVar);
                    }
                }
            } else {
                this.f1595i.clear();
                this.f1596j.clear();
                this.f1596j.addAll(mo973G());
            }
            this.f1597k = false;
        }
    }

    /* renamed from: u */
    public ArrayList mo1038u() {
        mo1037t();
        return this.f1595i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public String mo1039v() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: w */
    public Context mo1040w() {
        return this.f1587a;
    }

    /* renamed from: x */
    public C0301i mo1041x() {
        return this.f1610x;
    }

    /* renamed from: y */
    public Drawable mo1042y() {
        return this.f1601o;
    }

    /* renamed from: z */
    public CharSequence mo1043z() {
        return this.f1600n;
    }

    public MenuItem add(int i) {
        return mo992a(0, 0, 0, this.f1588b.getString(i));
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f1588b.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo992a(i, i2, i3, charSequence);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0301i iVar = (C0301i) mo992a(i, i2, i3, charSequence);
        C0322r rVar = new C0322r(this.f1587a, this, iVar);
        iVar.mo1104x(rVar);
        return rVar;
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo992a(i, i2, i3, this.f1588b.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f1588b.getString(i4));
    }
}

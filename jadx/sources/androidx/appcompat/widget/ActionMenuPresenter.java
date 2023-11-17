package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.C0263a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0286b;
import androidx.appcompat.view.menu.C0297g;
import androidx.appcompat.view.menu.C0301i;
import androidx.appcompat.view.menu.C0310l;
import androidx.appcompat.view.menu.C0313m;
import androidx.appcompat.view.menu.C0315n;
import androidx.appcompat.view.menu.C0318p;
import androidx.appcompat.view.menu.C0322r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.view.C1111b;
import java.util.ArrayList;
import p030c.C2210a;
import p030c.C2216g;

class ActionMenuPresenter extends C0286b implements C1111b.C1112a {

    /* renamed from: A */
    private final SparseBooleanArray f1759A = new SparseBooleanArray();

    /* renamed from: B */
    C0336e f1760B;

    /* renamed from: C */
    C0331a f1761C;

    /* renamed from: D */
    C0333c f1762D;

    /* renamed from: E */
    private C0332b f1763E;

    /* renamed from: F */
    final C0337f f1764F = new C0337f();

    /* renamed from: G */
    int f1765G;

    /* renamed from: n */
    C0334d f1766n;

    /* renamed from: o */
    private Drawable f1767o;

    /* renamed from: p */
    private boolean f1768p;

    /* renamed from: q */
    private boolean f1769q;

    /* renamed from: r */
    private boolean f1770r;

    /* renamed from: s */
    private int f1771s;

    /* renamed from: t */
    private int f1772t;

    /* renamed from: u */
    private int f1773u;

    /* renamed from: v */
    private boolean f1774v;

    /* renamed from: w */
    private boolean f1775w;

    /* renamed from: x */
    private boolean f1776x;

    /* renamed from: y */
    private boolean f1777y;

    /* renamed from: z */
    private int f1778z;

    @SuppressLint({"BanParcelableUsage"})
    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0330a();

        /* renamed from: d */
        public int f1779d;

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$a */
        class C0330a implements Parcelable.Creator {
            C0330a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1779d);
        }

        SavedState(Parcel parcel) {
            this.f1779d = parcel.readInt();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$a */
    private class C0331a extends C0310l {
        public C0331a(Context context, C0322r rVar, View view) {
            super(context, rVar, view, false, C2210a.f6453i);
            if (!((C0301i) rVar.getItem()).mo1075l()) {
                View view2 = ActionMenuPresenter.this.f1766n;
                mo1182f(view2 == null ? (View) ActionMenuPresenter.this.f1526l : view2);
            }
            mo1186j(ActionMenuPresenter.this.f1764F);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo1181e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f1761C = null;
            actionMenuPresenter.f1765G = 0;
            super.mo1181e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$b */
    private class C0332b extends ActionMenuItemView.C0284b {
        C0332b() {
        }

        /* renamed from: a */
        public C0318p mo825a() {
            C0331a aVar = ActionMenuPresenter.this.f1761C;
            if (aVar != null) {
                return aVar.mo1179c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$c */
    private class C0333c implements Runnable {

        /* renamed from: d */
        private C0336e f1782d;

        public C0333c(C0336e eVar) {
            this.f1782d = eVar;
        }

        public void run() {
            if (ActionMenuPresenter.this.f1520f != null) {
                ActionMenuPresenter.this.f1520f.mo1009d();
            }
            View view = (View) ActionMenuPresenter.this.f1526l;
            if (!(view == null || view.getWindowToken() == null || !this.f1782d.mo1188m())) {
                ActionMenuPresenter.this.f1760B = this.f1782d;
            }
            ActionMenuPresenter.this.f1762D = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d */
    private class C0334d extends AppCompatImageView implements ActionMenuView.C0338a {

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d$a */
        class C0335a extends C0515y0 {

            /* renamed from: m */
            final /* synthetic */ ActionMenuPresenter f1785m;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0335a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f1785m = actionMenuPresenter;
            }

            /* renamed from: b */
            public C0318p mo823b() {
                C0336e eVar = ActionMenuPresenter.this.f1760B;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo1179c();
            }

            /* renamed from: c */
            public boolean mo824c() {
                ActionMenuPresenter.this.mo1343N();
                return true;
            }

            /* renamed from: d */
            public boolean mo1353d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f1762D != null) {
                    return false;
                }
                actionMenuPresenter.mo1334E();
                return true;
            }
        }

        public C0334d(Context context) {
            super(context, (AttributeSet) null, C2210a.f6452h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0512x1.m2056a(this, getContentDescription());
            setOnTouchListener(new C0335a(this, ActionMenuPresenter.this));
        }

        /* renamed from: a */
        public boolean mo803a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo804b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.mo1343N();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0836a.m3150l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$e */
    private class C0336e extends C0310l {
        public C0336e(Context context, C0297g gVar, View view, boolean z) {
            super(context, gVar, view, z, C2210a.f6453i);
            mo1184h(8388613);
            mo1186j(ActionMenuPresenter.this.f1764F);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo1181e() {
            if (ActionMenuPresenter.this.f1520f != null) {
                ActionMenuPresenter.this.f1520f.close();
            }
            ActionMenuPresenter.this.f1760B = null;
            super.mo1181e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$f */
    private class C0337f implements C0313m.C0314a {
        C0337f() {
        }

        /* renamed from: c */
        public void mo519c(C0297g gVar, boolean z) {
            if (gVar instanceof C0322r) {
                gVar.mo972F().mo1011e(false);
            }
            C0313m.C0314a p = ActionMenuPresenter.this.mo912p();
            if (p != null) {
                p.mo519c(gVar, z);
            }
        }

        /* renamed from: d */
        public boolean mo520d(C0297g gVar) {
            if (gVar == ActionMenuPresenter.this.f1520f) {
                return false;
            }
            ActionMenuPresenter.this.f1765G = ((C0322r) gVar).getItem().getItemId();
            C0313m.C0314a p = ActionMenuPresenter.this.mo912p();
            if (p != null) {
                return p.mo520d(gVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C2216g.f6582c, C2216g.f6581b);
    }

    /* renamed from: C */
    private View m1293C(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1526l;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0315n.C0316a) && ((C0315n.C0316a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: B */
    public boolean mo1332B() {
        return mo1334E() | mo1335F();
    }

    /* renamed from: D */
    public Drawable mo1333D() {
        C0334d dVar = this.f1766n;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1768p) {
            return this.f1767o;
        }
        return null;
    }

    /* renamed from: E */
    public boolean mo1334E() {
        C0315n nVar;
        C0333c cVar = this.f1762D;
        if (cVar == null || (nVar = this.f1526l) == null) {
            C0336e eVar = this.f1760B;
            if (eVar == null) {
                return false;
            }
            eVar.mo1178b();
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.f1762D = null;
        return true;
    }

    /* renamed from: F */
    public boolean mo1335F() {
        C0331a aVar = this.f1761C;
        if (aVar == null) {
            return false;
        }
        aVar.mo1178b();
        return true;
    }

    /* renamed from: G */
    public boolean mo1336G() {
        return this.f1762D != null || mo1337H();
    }

    /* renamed from: H */
    public boolean mo1337H() {
        C0336e eVar = this.f1760B;
        return eVar != null && eVar.mo1180d();
    }

    /* renamed from: I */
    public void mo1338I(Configuration configuration) {
        if (!this.f1774v) {
            this.f1773u = C0263a.m881b(this.f1519e).mo735d();
        }
        C0297g gVar = this.f1520f;
        if (gVar != null) {
            gVar.mo979M(true);
        }
    }

    /* renamed from: J */
    public void mo1339J(boolean z) {
        this.f1777y = z;
    }

    /* renamed from: K */
    public void mo1340K(ActionMenuView actionMenuView) {
        this.f1526l = actionMenuView;
        actionMenuView.mo826a(this.f1520f);
    }

    /* renamed from: L */
    public void mo1341L(Drawable drawable) {
        C0334d dVar = this.f1766n;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f1768p = true;
        this.f1767o = drawable;
    }

    /* renamed from: M */
    public void mo1342M(boolean z) {
        this.f1769q = z;
        this.f1770r = true;
    }

    /* renamed from: N */
    public boolean mo1343N() {
        C0297g gVar;
        if (!this.f1769q || mo1337H() || (gVar = this.f1520f) == null || this.f1526l == null || this.f1762D != null || gVar.mo969B().isEmpty()) {
            return false;
        }
        C0333c cVar = new C0333c(new C0336e(this.f1519e, this.f1520f, this.f1766n, true));
        this.f1762D = cVar;
        ((View) this.f1526l).post(cVar);
        return true;
    }

    /* renamed from: c */
    public void mo902c(C0297g gVar, boolean z) {
        mo1332B();
        super.mo902c(gVar, z);
    }

    /* renamed from: d */
    public void mo903d(C0301i iVar, C0315n.C0316a aVar) {
        aVar.mo805c(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1526l);
        if (this.f1763E == null) {
            this.f1763E = new C0332b();
        }
        actionMenuItemView.setPopupCallback(this.f1763E);
    }

    /* renamed from: g */
    public void mo925g(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).f1779d) > 0 && (findItem = this.f1520f.findItem(i)) != null) {
            mo906h((C0322r) findItem.getSubMenu());
        }
    }

    /* renamed from: h */
    public boolean mo906h(C0322r rVar) {
        boolean z = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        C0322r rVar2 = rVar;
        while (rVar2.mo1221i0() != this.f1520f) {
            rVar2 = (C0322r) rVar2.mo1221i0();
        }
        View C = m1293C(rVar2.getItem());
        if (C == null) {
            return false;
        }
        this.f1765G = rVar.getItem().getItemId();
        int size = rVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        C0331a aVar = new C0331a(this.f1519e, rVar, C);
        this.f1761C = aVar;
        aVar.mo1183g(z);
        this.f1761C.mo1187k();
        super.mo906h(rVar);
        return true;
    }

    /* renamed from: i */
    public Parcelable mo926i() {
        SavedState savedState = new SavedState();
        savedState.f1779d = this.f1765G;
        return savedState;
    }

    /* renamed from: j */
    public void mo907j(boolean z) {
        ArrayList arrayList;
        C0315n nVar;
        super.mo907j(z);
        ((View) this.f1526l).requestLayout();
        C0297g gVar = this.f1520f;
        boolean z2 = false;
        if (gVar != null) {
            ArrayList u = gVar.mo1038u();
            int size = u.size();
            for (int i = 0; i < size; i++) {
                C1111b a = ((C0301i) u.get(i)).mo841a();
                if (a != null) {
                    a.mo3673i(this);
                }
            }
        }
        C0297g gVar2 = this.f1520f;
        if (gVar2 != null) {
            arrayList = gVar2.mo969B();
        } else {
            arrayList = null;
        }
        if (this.f1769q && arrayList != null) {
            int size2 = arrayList.size();
            if (size2 == 1) {
                z2 = !((C0301i) arrayList.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f1766n == null) {
                this.f1766n = new C0334d(this.f1518d);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1766n.getParent();
            if (viewGroup != this.f1526l) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1766n);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1526l;
                actionMenuView.addView(this.f1766n, actionMenuView.mo1358F());
            }
        } else {
            C0334d dVar = this.f1766n;
            if (dVar != null && dVar.getParent() == (nVar = this.f1526l)) {
                ((ViewGroup) nVar).removeView(this.f1766n);
            }
        }
        ((ActionMenuView) this.f1526l).setOverflowReserved(this.f1769q);
    }

    /* renamed from: k */
    public boolean mo927k() {
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        ActionMenuPresenter actionMenuPresenter = this;
        C0297g gVar = actionMenuPresenter.f1520f;
        View view = null;
        boolean z4 = false;
        if (gVar != null) {
            arrayList = gVar.mo973G();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i5 = actionMenuPresenter.f1773u;
        int i6 = actionMenuPresenter.f1772t;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f1526l;
        boolean z5 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            C0301i iVar = (C0301i) arrayList.get(i9);
            if (iVar.mo1078o()) {
                i7++;
            } else if (iVar.mo1077n()) {
                i8++;
            } else {
                z5 = true;
            }
            if (actionMenuPresenter.f1777y && iVar.isActionViewExpanded()) {
                i5 = 0;
            }
        }
        if (actionMenuPresenter.f1769q && (z5 || i8 + i7 > i5)) {
            i5--;
        }
        int i12 = i5 - i7;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f1759A;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f1775w) {
            int i13 = actionMenuPresenter.f1778z;
            i2 = i6 / i13;
            i3 = i13 + ((i6 % i13) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < i) {
            C0301i iVar2 = (C0301i) arrayList.get(i14);
            if (iVar2.mo1078o()) {
                View q = actionMenuPresenter.mo913q(iVar2, view, viewGroup);
                if (actionMenuPresenter.f1775w) {
                    i2 -= ActionMenuView.m1336L(q, i3, i2, makeMeasureSpec, z4 ? 1 : 0);
                } else {
                    q.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = q.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i15 == 0) {
                    i15 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.mo1101u(true);
                z = z4;
                i4 = i;
            } else if (iVar2.mo1077n()) {
                int groupId2 = iVar2.getGroupId();
                boolean z6 = sparseBooleanArray.get(groupId2);
                if ((i12 > 0 || z6) && i6 > 0 && (!actionMenuPresenter.f1775w || i2 > 0)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z7 = z2;
                i4 = i;
                if (z2) {
                    View q2 = actionMenuPresenter.mo913q(iVar2, (View) null, viewGroup);
                    if (actionMenuPresenter.f1775w) {
                        int L = ActionMenuView.m1336L(q2, i3, i2, makeMeasureSpec, 0);
                        i2 -= L;
                        if (L == 0) {
                            z7 = false;
                        }
                    } else {
                        q2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z8 = z7;
                    int measuredWidth2 = q2.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i15 == 0) {
                        i15 = measuredWidth2;
                    }
                    if (!actionMenuPresenter.f1775w ? i6 + i15 <= 0 : i6 < 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    z2 = z8 & z3;
                }
                if (z2 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z6) {
                    sparseBooleanArray.put(groupId2, false);
                    int i16 = 0;
                    while (i16 < i14) {
                        C0301i iVar3 = (C0301i) arrayList.get(i16);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.mo1075l()) {
                                i12++;
                            }
                            iVar3.mo1101u(false);
                        }
                        i16++;
                    }
                }
                if (z2) {
                    i12--;
                }
                iVar2.mo1101u(z2);
                z = false;
            } else {
                z = z4;
                i4 = i;
                iVar2.mo1101u(z);
            }
            i14++;
            z4 = z;
            i = i4;
            view = null;
            actionMenuPresenter = this;
        }
        return true;
    }

    /* renamed from: m */
    public void mo909m(Context context, C0297g gVar) {
        super.mo909m(context, gVar);
        Resources resources = context.getResources();
        C0263a b = C0263a.m881b(context);
        if (!this.f1770r) {
            this.f1769q = b.mo737f();
        }
        if (!this.f1776x) {
            this.f1771s = b.mo734c();
        }
        if (!this.f1774v) {
            this.f1773u = b.mo735d();
        }
        int i = this.f1771s;
        if (this.f1769q) {
            if (this.f1766n == null) {
                C0334d dVar = new C0334d(this.f1518d);
                this.f1766n = dVar;
                if (this.f1768p) {
                    dVar.setImageDrawable(this.f1767o);
                    this.f1767o = null;
                    this.f1768p = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1766n.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f1766n.getMeasuredWidth();
        } else {
            this.f1766n = null;
        }
        this.f1772t = i;
        this.f1778z = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    /* renamed from: o */
    public boolean mo911o(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f1766n) {
            return false;
        }
        return super.mo911o(viewGroup, i);
    }

    /* renamed from: q */
    public View mo913q(C0301i iVar, View view, ViewGroup viewGroup) {
        int i;
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.mo1073j()) {
            actionView = super.mo913q(iVar, view, viewGroup);
        }
        if (iVar.isActionViewExpanded()) {
            i = 8;
        } else {
            i = 0;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo1378o(layoutParams));
        }
        return actionView;
    }

    /* renamed from: r */
    public C0315n mo914r(ViewGroup viewGroup) {
        C0315n nVar = this.f1526l;
        C0315n r = super.mo914r(viewGroup);
        if (nVar != r) {
            ((ActionMenuView) r).setPresenter(this);
        }
        return r;
    }

    /* renamed from: t */
    public boolean mo916t(int i, C0301i iVar) {
        return iVar.mo1075l();
    }
}

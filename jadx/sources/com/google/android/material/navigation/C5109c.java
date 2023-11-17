package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.view.menu.C0297g;
import androidx.appcompat.view.menu.C0301i;
import androidx.appcompat.view.menu.C0315n;
import androidx.core.util.C1005e;
import androidx.core.util.C1007g;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.badge.C4933a;
import com.google.android.material.internal.C5085j;
import java.util.HashSet;
import p009a8.C0072b;
import p009a8.C0077g;
import p026b8.C2170a;
import p030c.C2210a;
import p045d.C5769a;
import p060e1.C5893c;
import p060e1.C5958l0;
import p060e1.C5968n0;
import p145k8.C6835a;
import p223q8.C7922g;
import p223q8.C7929k;

/* renamed from: com.google.android.material.navigation.c */
public abstract class C5109c extends ViewGroup implements C0315n {

    /* renamed from: G */
    private static final int[] f16317G = {16842912};

    /* renamed from: H */
    private static final int[] f16318H = {-16842910};

    /* renamed from: A */
    private int f16319A;

    /* renamed from: B */
    private C7929k f16320B;

    /* renamed from: C */
    private boolean f16321C = false;

    /* renamed from: D */
    private ColorStateList f16322D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public NavigationBarPresenter f16323E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C0297g f16324F;

    /* renamed from: d */
    private final C5968n0 f16325d;

    /* renamed from: e */
    private final View.OnClickListener f16326e;

    /* renamed from: f */
    private final C1005e f16327f = new C1007g(5);

    /* renamed from: g */
    private final SparseArray f16328g = new SparseArray(5);

    /* renamed from: h */
    private int f16329h;

    /* renamed from: i */
    private C5102a[] f16330i;

    /* renamed from: j */
    private int f16331j = 0;

    /* renamed from: k */
    private int f16332k = 0;

    /* renamed from: l */
    private ColorStateList f16333l;

    /* renamed from: m */
    private int f16334m;

    /* renamed from: n */
    private ColorStateList f16335n;

    /* renamed from: o */
    private final ColorStateList f16336o = mo16652e(16842808);

    /* renamed from: p */
    private int f16337p;

    /* renamed from: q */
    private int f16338q;

    /* renamed from: r */
    private Drawable f16339r;

    /* renamed from: s */
    private ColorStateList f16340s;

    /* renamed from: t */
    private int f16341t;

    /* renamed from: u */
    private final SparseArray f16342u = new SparseArray(5);

    /* renamed from: v */
    private int f16343v = -1;

    /* renamed from: w */
    private int f16344w = -1;

    /* renamed from: x */
    private boolean f16345x;

    /* renamed from: y */
    private int f16346y;

    /* renamed from: z */
    private int f16347z;

    /* renamed from: com.google.android.material.navigation.c$a */
    class C5110a implements View.OnClickListener {
        C5110a() {
        }

        public void onClick(View view) {
            C0301i itemData = ((C5102a) view).getItemData();
            if (!C5109c.this.f16324F.mo981O(itemData, C5109c.this.f16323E, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public C5109c(Context context) {
        super(context);
        if (isInEditMode()) {
            this.f16325d = null;
        } else {
            C5893c cVar = new C5893c();
            this.f16325d = cVar;
            cVar.mo19409N0(0);
            cVar.mo19350p0((long) C6835a.m26565f(getContext(), C0072b.motionDurationLong1, getResources().getInteger(C0077g.material_motion_duration_long_1)));
            cVar.mo19355t0(C6835a.m26566g(getContext(), C0072b.motionEasingStandard, C2170a.f6351b));
            cVar.mo19402F0(new C5085j());
        }
        this.f16326e = new C5110a();
        ViewCompat.m3544C0(this, 1);
    }

    /* renamed from: f */
    private Drawable m19978f() {
        if (this.f16320B == null || this.f16322D == null) {
            return null;
        }
        C7922g gVar = new C7922g(this.f16320B);
        gVar.mo22941X(this.f16322D);
        return gVar;
    }

    private C5102a getNewItem() {
        C5102a aVar = (C5102a) this.f16327f.mo3440b();
        if (aVar == null) {
            return mo15566g(getContext());
        }
        return aVar;
    }

    /* renamed from: l */
    private boolean m19979l(int i) {
        return i != -1;
    }

    /* renamed from: n */
    private void m19980n() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f16324F.size(); i++) {
            hashSet.add(Integer.valueOf(this.f16324F.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.f16342u.size(); i2++) {
            int keyAt = this.f16342u.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f16342u.delete(keyAt);
            }
        }
    }

    /* renamed from: r */
    private void m19981r(int i) {
        if (!m19979l(i)) {
            throw new IllegalArgumentException(i + " is not a valid view id");
        }
    }

    private void setBadgeIfNeeded(C5102a aVar) {
        C4933a aVar2;
        int id = aVar.getId();
        if (m19979l(id) && (aVar2 = (C4933a) this.f16342u.get(id)) != null) {
            aVar.setBadge(aVar2);
        }
    }

    /* renamed from: a */
    public void mo826a(C0297g gVar) {
        this.f16324F = gVar;
    }

    /* renamed from: d */
    public void mo16651d() {
        removeAllViews();
        C5102a[] aVarArr = this.f16330i;
        if (aVarArr != null) {
            for (C5102a aVar : aVarArr) {
                if (aVar != null) {
                    this.f16327f.mo3439a(aVar);
                    aVar.mo16614h();
                }
            }
        }
        if (this.f16324F.size() == 0) {
            this.f16331j = 0;
            this.f16332k = 0;
            this.f16330i = null;
            return;
        }
        m19980n();
        this.f16330i = new C5102a[this.f16324F.size()];
        boolean k = mo16678k(this.f16329h, this.f16324F.mo973G().size());
        for (int i = 0; i < this.f16324F.size(); i++) {
            this.f16323E.mo16538n(true);
            this.f16324F.getItem(i).setCheckable(true);
            this.f16323E.mo16538n(false);
            C5102a newItem = getNewItem();
            this.f16330i[i] = newItem;
            newItem.setIconTintList(this.f16333l);
            newItem.setIconSize(this.f16334m);
            newItem.setTextColor(this.f16336o);
            newItem.setTextAppearanceInactive(this.f16337p);
            newItem.setTextAppearanceActive(this.f16338q);
            newItem.setTextColor(this.f16335n);
            int i2 = this.f16343v;
            if (i2 != -1) {
                newItem.setItemPaddingTop(i2);
            }
            int i3 = this.f16344w;
            if (i3 != -1) {
                newItem.setItemPaddingBottom(i3);
            }
            newItem.setActiveIndicatorWidth(this.f16346y);
            newItem.setActiveIndicatorHeight(this.f16347z);
            newItem.setActiveIndicatorMarginHorizontal(this.f16319A);
            newItem.setActiveIndicatorDrawable(m19978f());
            newItem.setActiveIndicatorResizeable(this.f16321C);
            newItem.setActiveIndicatorEnabled(this.f16345x);
            Drawable drawable = this.f16339r;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f16341t);
            }
            newItem.setItemRippleColor(this.f16340s);
            newItem.setShifting(k);
            newItem.setLabelVisibilityMode(this.f16329h);
            C0301i iVar = (C0301i) this.f16324F.getItem(i);
            newItem.mo805c(iVar, 0);
            newItem.setItemPosition(i);
            int itemId = iVar.getItemId();
            newItem.setOnTouchListener((View.OnTouchListener) this.f16328g.get(itemId));
            newItem.setOnClickListener(this.f16326e);
            int i4 = this.f16331j;
            if (i4 != 0 && itemId == i4) {
                this.f16332k = i;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f16324F.size() - 1, this.f16332k);
        this.f16332k = min;
        this.f16324F.getItem(min).setChecked(true);
    }

    /* renamed from: e */
    public ColorStateList mo16652e(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList a = C5769a.m23209a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C2210a.f6466v, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a.getDefaultColor();
        int[] iArr = f16318H;
        return new ColorStateList(new int[][]{iArr, f16317G, ViewGroup.EMPTY_STATE_SET}, new int[]{a.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract C5102a mo15566g(Context context);

    /* access modifiers changed from: package-private */
    public SparseArray<C4933a> getBadgeDrawables() {
        return this.f16342u;
    }

    public ColorStateList getIconTintList() {
        return this.f16333l;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f16322D;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f16345x;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f16347z;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f16319A;
    }

    public C7929k getItemActiveIndicatorShapeAppearance() {
        return this.f16320B;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f16346y;
    }

    public Drawable getItemBackground() {
        C5102a[] aVarArr = this.f16330i;
        if (aVarArr == null || aVarArr.length <= 0) {
            return this.f16339r;
        }
        return aVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f16341t;
    }

    public int getItemIconSize() {
        return this.f16334m;
    }

    public int getItemPaddingBottom() {
        return this.f16344w;
    }

    public int getItemPaddingTop() {
        return this.f16343v;
    }

    public ColorStateList getItemRippleColor() {
        return this.f16340s;
    }

    public int getItemTextAppearanceActive() {
        return this.f16338q;
    }

    public int getItemTextAppearanceInactive() {
        return this.f16337p;
    }

    public ColorStateList getItemTextColor() {
        return this.f16335n;
    }

    public int getLabelVisibilityMode() {
        return this.f16329h;
    }

    /* access modifiers changed from: protected */
    public C0297g getMenu() {
        return this.f16324F;
    }

    public int getSelectedItemId() {
        return this.f16331j;
    }

    /* access modifiers changed from: protected */
    public int getSelectedItemPosition() {
        return this.f16332k;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: h */
    public C5102a mo16675h(int i) {
        m19981r(i);
        C5102a[] aVarArr = this.f16330i;
        if (aVarArr == null) {
            return null;
        }
        for (C5102a aVar : aVarArr) {
            if (aVar.getId() == i) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: i */
    public C4933a mo16676i(int i) {
        return (C4933a) this.f16342u.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C4933a mo16677j(int i) {
        m19981r(i);
        C4933a aVar = (C4933a) this.f16342u.get(i);
        if (aVar == null) {
            aVar = C4933a.m18819d(getContext());
            this.f16342u.put(i, aVar);
        }
        C5102a h = mo16675h(i);
        if (h != null) {
            h.setBadge(aVar);
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo16678k(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo16679m(int i) {
        m19981r(i);
        C4933a aVar = (C4933a) this.f16342u.get(i);
        C5102a h = mo16675h(i);
        if (h != null) {
            h.mo16618p();
        }
        if (aVar != null) {
            this.f16342u.remove(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo16680o(SparseArray sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            if (this.f16342u.indexOfKey(keyAt) < 0) {
                this.f16342u.append(keyAt, (C4933a) sparseArray.get(keyAt));
            }
        }
        C5102a[] aVarArr = this.f16330i;
        if (aVarArr != null) {
            for (C5102a aVar : aVarArr) {
                aVar.setBadge((C4933a) this.f16342u.get(aVar.getId()));
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.m3965A0(accessibilityNodeInfo).mo3595a0(AccessibilityNodeInfoCompat.CollectionInfoCompat.m4048a(1, this.f16324F.mo973G().size(), false, 1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo16682p(int i) {
        int size = this.f16324F.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f16324F.getItem(i2);
            if (i == item.getItemId()) {
                this.f16331j = i;
                this.f16332k = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    /* renamed from: q */
    public void mo16683q() {
        C5968n0 n0Var;
        C0297g gVar = this.f16324F;
        if (gVar != null && this.f16330i != null) {
            int size = gVar.size();
            if (size != this.f16330i.length) {
                mo16651d();
                return;
            }
            int i = this.f16331j;
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = this.f16324F.getItem(i2);
                if (item.isChecked()) {
                    this.f16331j = item.getItemId();
                    this.f16332k = i2;
                }
            }
            if (!(i == this.f16331j || (n0Var = this.f16325d) == null)) {
                C5958l0.m23911b(this, n0Var);
            }
            boolean k = mo16678k(this.f16329h, this.f16324F.mo973G().size());
            for (int i3 = 0; i3 < size; i3++) {
                this.f16323E.mo16538n(true);
                this.f16330i[i3].setLabelVisibilityMode(this.f16329h);
                this.f16330i[i3].setShifting(k);
                this.f16330i[i3].mo805c((C0301i) this.f16324F.getItem(i3), 0);
                this.f16323E.mo16538n(false);
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f16333l = colorStateList;
        C5102a[] aVarArr = this.f16330i;
        if (aVarArr != null) {
            for (C5102a iconTintList : aVarArr) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f16322D = colorStateList;
        C5102a[] aVarArr = this.f16330i;
        if (aVarArr != null) {
            for (C5102a activeIndicatorDrawable : aVarArr) {
                activeIndicatorDrawable.setActiveIndicatorDrawable(m19978f());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f16345x = z;
        C5102a[] aVarArr = this.f16330i;
        if (aVarArr != null) {
            for (C5102a activeIndicatorEnabled : aVarArr) {
                activeIndicatorEnabled.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f16347z = i;
        C5102a[] aVarArr = this.f16330i;
        if (aVarArr != null) {
            for (C5102a activeIndicatorHeight : aVarArr) {
                activeIndicatorHeight.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f16319A = i;
        C5102a[] aVarArr = this.f16330i;
        if (aVarArr != null) {
            for (C5102a activeIndicatorMarginHorizontal : aVarArr) {
                activeIndicatorMarginHorizontal.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setItemActiveIndicatorResizeable(boolean z) {
        this.f16321C = z;
        C5102a[] aVarArr = this.f16330i;
        if (aVarArr != null) {
            for (C5102a activeIndicatorResizeable : aVarArr) {
                activeIndicatorResizeable.setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(C7929k kVar) {
        this.f16320B = kVar;
        C5102a[] aVarArr = this.f16330i;
        if (aVarArr != null) {
            for (C5102a activeIndicatorDrawable : aVarArr) {
                activeIndicatorDrawable.setActiveIndicatorDrawable(m19978f());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f16346y = i;
        C5102a[] aVarArr = this.f16330i;
        if (aVarArr != null) {
            for (C5102a activeIndicatorWidth : aVarArr) {
                activeIndicatorWidth.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f16339r = drawable;
        C5102a[] aVarArr = this.f16330i;
        if (aVarArr != null) {
            for (C5102a itemBackground : aVarArr) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f16341t = i;
        C5102a[] aVarArr = this.f16330i;
        if (aVarArr != null) {
            for (C5102a itemBackground : aVarArr) {
                itemBackground.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.f16334m = i;
        C5102a[] aVarArr = this.f16330i;
        if (aVarArr != null) {
            for (C5102a iconSize : aVarArr) {
                iconSize.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.f16344w = i;
        C5102a[] aVarArr = this.f16330i;
        if (aVarArr != null) {
            for (C5102a itemPaddingBottom : aVarArr) {
                itemPaddingBottom.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.f16343v = i;
        C5102a[] aVarArr = this.f16330i;
        if (aVarArr != null) {
            for (C5102a itemPaddingTop : aVarArr) {
                itemPaddingTop.setItemPaddingTop(i);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f16340s = colorStateList;
        C5102a[] aVarArr = this.f16330i;
        if (aVarArr != null) {
            for (C5102a itemRippleColor : aVarArr) {
                itemRippleColor.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f16338q = i;
        C5102a[] aVarArr = this.f16330i;
        if (aVarArr != null) {
            for (C5102a aVar : aVarArr) {
                aVar.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f16335n;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f16337p = i;
        C5102a[] aVarArr = this.f16330i;
        if (aVarArr != null) {
            for (C5102a aVar : aVarArr) {
                aVar.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f16335n;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f16335n = colorStateList;
        C5102a[] aVarArr = this.f16330i;
        if (aVarArr != null) {
            for (C5102a textColor : aVarArr) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f16329h = i;
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
        this.f16323E = navigationBarPresenter;
    }
}

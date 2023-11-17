package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import androidx.appcompat.view.C0272g;
import androidx.appcompat.view.menu.C0297g;
import androidx.appcompat.view.menu.C0315n;
import androidx.appcompat.widget.C0483r1;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.badge.C4933a;
import com.google.android.material.internal.C5088l;
import p009a8.C0074d;
import p009a8.C0082l;
import p184n8.C7343c;
import p223q8.C7922g;
import p223q8.C7926h;
import p223q8.C7929k;
import p249s8.C8273a;

public abstract class NavigationBarView extends FrameLayout {

    /* renamed from: d */
    private final C5108b f16269d;

    /* renamed from: e */
    private final C5109c f16270e;

    /* renamed from: f */
    private final NavigationBarPresenter f16271f;

    /* renamed from: g */
    private MenuInflater f16272g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C5100c f16273h;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C5097a();

        /* renamed from: f */
        Bundle f16274f;

        /* renamed from: com.google.android.material.navigation.NavigationBarView$SavedState$a */
        class C5097a implements Parcelable.ClassLoaderCreator {
            C5097a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m19934b(Parcel parcel, ClassLoader classLoader) {
            this.f16274f = parcel.readBundle(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f16274f);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m19934b(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$a */
    class C5098a implements C0297g.C0298a {
        C5098a() {
        }

        /* renamed from: a */
        public boolean mo462a(C0297g gVar, MenuItem menuItem) {
            C5099b unused = NavigationBarView.this.getClass();
            if (NavigationBarView.this.f16273h == null || NavigationBarView.this.f16273h.mo16600a(menuItem)) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public void mo464b(C0297g gVar) {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$b */
    public interface C5099b {
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$c */
    public interface C5100c {
        /* renamed from: a */
        boolean mo16600a(MenuItem menuItem);
    }

    public NavigationBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C8273a.m31120c(context, attributeSet, i, i2), attributeSet, i);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f16271f = navigationBarPresenter;
        Context context2 = getContext();
        int[] iArr = C0082l.f758m5;
        int i3 = C0082l.f868x5;
        int i4 = C0082l.f858w5;
        C0483r1 j = C5088l.m19899j(context2, attributeSet, iArr, i, i2, i3, i4);
        C5108b bVar = new C5108b(context2, getClass(), getMaxItemCount());
        this.f16269d = bVar;
        C5109c d = mo15557d(context2);
        this.f16270e = d;
        navigationBarPresenter.mo16537d(d);
        navigationBarPresenter.mo16536b(1);
        d.setPresenter(navigationBarPresenter);
        bVar.mo1002b(navigationBarPresenter);
        navigationBarPresenter.mo909m(getContext(), bVar);
        int i5 = C0082l.f818s5;
        if (j.mo2332s(i5)) {
            d.setIconTintList(j.mo2316c(i5));
        } else {
            d.setIconTintList(d.mo16652e(16842808));
        }
        setItemIconSize(j.mo2319f(C0082l.f808r5, getResources().getDimensionPixelSize(C0074d.mtrl_navigation_bar_item_default_icon_size)));
        if (j.mo2332s(i3)) {
            setItemTextAppearanceInactive(j.mo2327n(i3, 0));
        }
        if (j.mo2332s(i4)) {
            setItemTextAppearanceActive(j.mo2327n(i4, 0));
        }
        int i6 = C0082l.f878y5;
        if (j.mo2332s(i6)) {
            setItemTextColor(j.mo2316c(i6));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            ViewCompat.m3627v0(this, m19928c(context2));
        }
        int i7 = C0082l.f838u5;
        if (j.mo2332s(i7)) {
            setItemPaddingTop(j.mo2319f(i7, 0));
        }
        int i8 = C0082l.f828t5;
        if (j.mo2332s(i8)) {
            setItemPaddingBottom(j.mo2319f(i8, 0));
        }
        int i9 = C0082l.f778o5;
        if (j.mo2332s(i9)) {
            setElevation((float) j.mo2319f(i9, 0));
        }
        C0836a.m3153o(getBackground().mutate(), C7343c.m28004b(context2, j, C0082l.f768n5));
        setLabelVisibilityMode(j.mo2325l(C0082l.f888z5, -1));
        int n = j.mo2327n(C0082l.f798q5, 0);
        if (n != 0) {
            d.setItemBackgroundRes(n);
        } else {
            setItemRippleColor(C7343c.m28004b(context2, j, C0082l.f848v5));
        }
        int n2 = j.mo2327n(C0082l.f788p5, 0);
        if (n2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(n2, C0082l.f698g5);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(C0082l.f718i5, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(C0082l.f708h5, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(C0082l.f738k5, 0));
            setItemActiveIndicatorColor(C7343c.m28003a(context2, obtainStyledAttributes, C0082l.f728j5));
            setItemActiveIndicatorShapeAppearance(C7929k.m29975b(context2, obtainStyledAttributes.getResourceId(C0082l.f748l5, 0), 0).mo22998m());
            obtainStyledAttributes.recycle();
        }
        int i12 = C0082l.f385A5;
        if (j.mo2332s(i12)) {
            mo16547g(j.mo2327n(i12, 0));
        }
        j.mo2333w();
        addView(d);
        bVar.mo987V(new C5098a());
    }

    /* renamed from: c */
    private C7922g m19928c(Context context) {
        C7922g gVar = new C7922g();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            gVar.mo22941X(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        gVar.mo22934M(context);
        return gVar;
    }

    private MenuInflater getMenuInflater() {
        if (this.f16272g == null) {
            this.f16272g = new C0272g(getContext());
        }
        return this.f16272g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C5109c mo15557d(Context context);

    /* renamed from: e */
    public C4933a mo16545e(int i) {
        return this.f16270e.mo16676i(i);
    }

    /* renamed from: f */
    public C4933a mo16546f(int i) {
        return this.f16270e.mo16677j(i);
    }

    /* renamed from: g */
    public void mo16547g(int i) {
        this.f16271f.mo16538n(true);
        getMenuInflater().inflate(i, this.f16269d);
        this.f16271f.mo16538n(false);
        this.f16271f.mo907j(true);
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f16270e.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f16270e.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f16270e.getItemActiveIndicatorMarginHorizontal();
    }

    public C7929k getItemActiveIndicatorShapeAppearance() {
        return this.f16270e.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f16270e.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f16270e.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f16270e.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f16270e.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f16270e.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f16270e.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f16270e.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f16270e.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f16270e.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f16270e.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f16270e.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f16270e.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f16269d;
    }

    public C0315n getMenuView() {
        return this.f16270e;
    }

    public NavigationBarPresenter getPresenter() {
        return this.f16271f;
    }

    public int getSelectedItemId() {
        return this.f16270e.getSelectedItemId();
    }

    /* renamed from: h */
    public void mo16568h(int i) {
        this.f16270e.mo16679m(i);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C7926h.m29970e(this);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3880a());
        this.f16269d.mo984S(savedState.f16274f);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f16274f = bundle;
        this.f16269d.mo986U(bundle);
        return savedState;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C7926h.m29969d(this, f);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f16270e.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f16270e.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f16270e.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f16270e.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(C7929k kVar) {
        this.f16270e.setItemActiveIndicatorShapeAppearance(kVar);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f16270e.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.f16270e.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.f16270e.setItemBackgroundRes(i);
    }

    public void setItemIconSize(int i) {
        this.f16270e.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f16270e.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.f16270e.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.f16270e.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f16270e.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.f16270e.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f16270e.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f16270e.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f16270e.getLabelVisibilityMode() != i) {
            this.f16270e.setLabelVisibilityMode(i);
            this.f16271f.mo907j(false);
        }
    }

    public void setOnItemReselectedListener(C5099b bVar) {
    }

    public void setOnItemSelectedListener(C5100c cVar) {
        this.f16273h = cVar;
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.f16269d.findItem(i);
        if (findItem != null && !this.f16269d.mo981O(findItem, this.f16271f, 0)) {
            findItem.setChecked(true);
        }
    }
}

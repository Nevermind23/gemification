package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.C0483r1;
import androidx.core.content.C0767a;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.internal.C5088l;
import com.google.android.material.internal.C5089m;
import com.google.android.material.navigation.C5109c;
import com.google.android.material.navigation.NavigationBarView;
import p009a8.C0072b;
import p009a8.C0073c;
import p009a8.C0074d;
import p009a8.C0081k;
import p009a8.C0082l;

public class BottomNavigationView extends NavigationBarView {

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$a */
    class C4942a implements C5089m.C5093d {
        C4942a() {
        }

        /* renamed from: a */
        public WindowInsetsCompat mo15563a(View view, WindowInsetsCompat windowInsetsCompat, C5089m.C5094e eVar) {
            int i;
            eVar.f16262d += windowInsetsCompat.mo3493i();
            boolean z = true;
            if (ViewCompat.m3541B(view) != 1) {
                z = false;
            }
            int j = windowInsetsCompat.mo3494j();
            int k = windowInsetsCompat.mo3495k();
            int i2 = eVar.f16259a;
            if (z) {
                i = k;
            } else {
                i = j;
            }
            eVar.f16259a = i2 + i;
            int i3 = eVar.f16261c;
            if (!z) {
                j = k;
            }
            eVar.f16261c = i3 + j;
            eVar.mo16535a(view);
            return windowInsetsCompat;
        }
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$b */
    public interface C4943b extends NavigationBarView.C5099b {
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$c */
    public interface C4944c extends NavigationBarView.C5100c {
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0072b.f146e);
    }

    /* renamed from: i */
    private void m18895i(Context context) {
        View view = new View(context);
        view.setBackgroundColor(C0767a.m2893c(context, C0073c.f165a));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C0074d.f206g)));
        addView(view);
    }

    /* renamed from: j */
    private void m18896j() {
        C5089m.m19900a(this, new C4942a());
    }

    /* renamed from: k */
    private int m18897k(int i) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), 1073741824);
    }

    /* renamed from: l */
    private boolean m18898l() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C5109c mo15557d(Context context) {
        return new C4946b(context);
    }

    public int getMaxItemCount() {
        return 5;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, m18897k(i2));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        C4946b bVar = (C4946b) getMenuView();
        if (bVar.mo15569s() != z) {
            bVar.setItemHorizontalTranslationEnabled(z);
            getPresenter().mo907j(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(C4943b bVar) {
        setOnItemReselectedListener(bVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(C4944c cVar) {
        setOnItemSelectedListener(cVar);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, C0081k.f362j);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Context context2 = getContext();
        C0483r1 j = C5088l.m19899j(context2, attributeSet, C0082l.f643b0, i, i2, new int[0]);
        setItemHorizontalTranslationEnabled(j.mo2314a(C0082l.f663d0, true));
        int i3 = C0082l.f653c0;
        if (j.mo2332s(i3)) {
            setMinimumHeight(j.mo2319f(i3, 0));
        }
        j.mo2333w();
        if (m18898l()) {
            m18895i(context2);
        }
        m18896j();
    }
}

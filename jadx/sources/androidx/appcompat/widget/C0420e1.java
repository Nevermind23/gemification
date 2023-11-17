package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0296f;
import androidx.appcompat.view.menu.C0297g;
import androidx.appcompat.view.menu.C0301i;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.e1 */
public class C0420e1 extends C0520z0 implements C0416d1 {

    /* renamed from: N */
    private static Method f2073N;

    /* renamed from: M */
    private C0416d1 f2074M;

    /* renamed from: androidx.appcompat.widget.e1$a */
    static class C0421a {
        /* renamed from: a */
        static void m1699a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        /* renamed from: b */
        static void m1700b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* renamed from: androidx.appcompat.widget.e1$b */
    static class C0422b {
        /* renamed from: a */
        static void m1701a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.e1$c */
    public static class C0423c extends C0494u0 {

        /* renamed from: q */
        final int f2075q;

        /* renamed from: r */
        final int f2076r;

        /* renamed from: s */
        private C0416d1 f2077s;

        /* renamed from: t */
        private MenuItem f2078t;

        /* renamed from: androidx.appcompat.widget.e1$c$a */
        static class C0424a {
            /* renamed from: a */
            static int m1704a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public C0423c(Context context, boolean z) {
            super(context, z);
            if (1 == C0424a.m1704a(context.getResources().getConfiguration())) {
                this.f2075q = 21;
                this.f2076r = 22;
                return;
            }
            this.f2075q = 22;
            this.f2076r = 21;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo2055d(int i, int i2, int i3, int i4, int i5) {
            return super.mo2055d(i, i2, i3, i4, i5);
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo2056e(MotionEvent motionEvent, int i) {
            return super.mo2056e(motionEvent, i);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            C0296f fVar;
            C0301i iVar;
            int pointToPosition;
            int i2;
            if (this.f2077s != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    fVar = (C0296f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    fVar = (C0296f) adapter;
                    i = 0;
                }
                if (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= fVar.getCount()) {
                    iVar = null;
                } else {
                    iVar = fVar.getItem(i2);
                }
                MenuItem menuItem = this.f2078t;
                if (menuItem != iVar) {
                    C0297g b = fVar.mo960b();
                    if (menuItem != null) {
                        this.f2077s.mo944n(b, menuItem);
                    }
                    this.f2078t = iVar;
                    if (iVar != null) {
                        this.f2077s.mo943a(b, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            C0296f fVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f2075q) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f2076r) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    fVar = (C0296f) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    fVar = (C0296f) adapter;
                }
                fVar.mo960b().mo1011e(false);
                return true;
            }
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(C0416d1 d1Var) {
            this.f2077s = d1Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2073N = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0420e1(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: S */
    public void mo2050S(Object obj) {
        C0421a.m1699a(this.f2295I, (Transition) obj);
    }

    /* renamed from: T */
    public void mo2051T(Object obj) {
        C0421a.m1700b(this.f2295I, (Transition) obj);
    }

    /* renamed from: U */
    public void mo2052U(C0416d1 d1Var) {
        this.f2074M = d1Var;
    }

    /* renamed from: V */
    public void mo2053V(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2073N;
            if (method != null) {
                try {
                    method.invoke(this.f2295I, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            C0422b.m1701a(this.f2295I, z);
        }
    }

    /* renamed from: a */
    public void mo943a(C0297g gVar, MenuItem menuItem) {
        C0416d1 d1Var = this.f2074M;
        if (d1Var != null) {
            d1Var.mo943a(gVar, menuItem);
        }
    }

    /* renamed from: n */
    public void mo944n(C0297g gVar, MenuItem menuItem) {
        C0416d1 d1Var = this.f2074M;
        if (d1Var != null) {
            d1Var.mo944n(gVar, menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C0494u0 mo2054s(Context context, boolean z) {
        C0423c cVar = new C0423c(context, z);
        cVar.setHoverListener(this);
        return cVar;
    }
}

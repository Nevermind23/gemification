package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.C5082i;
import com.google.android.material.internal.C5088l;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import p009a8.C0072b;
import p009a8.C0074d;
import p009a8.C0076f;
import p009a8.C0080j;
import p009a8.C0081k;
import p184n8.C7344d;
import p223q8.C7922g;

/* renamed from: com.google.android.material.badge.a */
public class C4933a extends Drawable implements C5082i.C5084b {

    /* renamed from: q */
    private static final int f15539q = C0081k.f368p;

    /* renamed from: r */
    private static final int f15540r = C0072b.f145d;

    /* renamed from: d */
    private final WeakReference f15541d;

    /* renamed from: e */
    private final C7922g f15542e = new C7922g();

    /* renamed from: f */
    private final C5082i f15543f;

    /* renamed from: g */
    private final Rect f15544g = new Rect();

    /* renamed from: h */
    private final BadgeState f15545h;

    /* renamed from: i */
    private float f15546i;

    /* renamed from: j */
    private float f15547j;

    /* renamed from: k */
    private int f15548k;

    /* renamed from: l */
    private float f15549l;

    /* renamed from: m */
    private float f15550m;

    /* renamed from: n */
    private float f15551n;

    /* renamed from: o */
    private WeakReference f15552o;

    /* renamed from: p */
    private WeakReference f15553p;

    /* renamed from: com.google.android.material.badge.a$a */
    class C4934a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ View f15554d;

        /* renamed from: e */
        final /* synthetic */ FrameLayout f15555e;

        C4934a(View view, FrameLayout frameLayout) {
            this.f15554d = view;
            this.f15555e = frameLayout;
        }

        public void run() {
            C4933a.this.mo15514K(this.f15554d, this.f15555e);
        }
    }

    private C4933a(Context context, int i, int i2, int i3, BadgeState.State state) {
        this.f15541d = new WeakReference(context);
        C5088l.m19892c(context);
        C5082i iVar = new C5082i(this);
        this.f15543f = iVar;
        iVar.mo16519e().setTextAlign(Paint.Align.CENTER);
        m18813D(C0081k.f358f);
        this.f15545h = new BadgeState(context, i, i2, i3, state);
        m18832x();
    }

    /* renamed from: C */
    private void m18812C(C7344d dVar) {
        Context context;
        if (this.f15543f.mo16518d() != dVar && (context = (Context) this.f15541d.get()) != null) {
            this.f15543f.mo16522h(dVar, context);
            m18816L();
        }
    }

    /* renamed from: D */
    private void m18813D(int i) {
        Context context = (Context) this.f15541d.get();
        if (context != null) {
            m18812C(new C7344d(context, i));
        }
    }

    /* renamed from: I */
    private void m18814I(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != C0076f.f286x) {
            WeakReference weakReference = this.f15553p;
            if (weakReference == null || weakReference.get() != viewGroup) {
                m18815J(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(C0076f.f286x);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, indexOfChild);
                this.f15553p = new WeakReference(frameLayout);
                frameLayout.post(new C4934a(view, frameLayout));
            }
        }
    }

    /* renamed from: J */
    private static void m18815J(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    /* renamed from: L */
    private void m18816L() {
        View view;
        Context context = (Context) this.f15541d.get();
        WeakReference weakReference = this.f15552o;
        ViewGroup viewGroup = null;
        if (weakReference != null) {
            view = (View) weakReference.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f15544g);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference weakReference2 = this.f15553p;
            if (weakReference2 != null) {
                viewGroup = (ViewGroup) weakReference2.get();
            }
            if (viewGroup != null || C4935b.f15557a) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            m18818b(context, rect2, view);
            C4935b.m18856f(this.f15544g, this.f15546i, this.f15547j, this.f15550m, this.f15551n);
            this.f15542e.mo22938U(this.f15549l);
            if (!rect.equals(this.f15544g)) {
                this.f15542e.setBounds(this.f15544g);
            }
        }
    }

    /* renamed from: M */
    private void m18817M() {
        this.f15548k = ((int) Math.pow(10.0d, ((double) mo15526k()) - 1.0d)) - 1;
    }

    /* renamed from: b */
    private void m18818b(Context context, Rect rect, View view) {
        int i;
        float f;
        float f2;
        float f3;
        int o = m18824o();
        int g = this.f15545h.mo15483g();
        if (g == 8388691 || g == 8388693) {
            this.f15547j = (float) (rect.bottom - o);
        } else {
            this.f15547j = (float) (rect.top + o);
        }
        if (mo15527l() <= 9) {
            if (!mo15530p()) {
                f3 = this.f15545h.f15518c;
            } else {
                f3 = this.f15545h.f15519d;
            }
            this.f15549l = f3;
            this.f15551n = f3;
            this.f15550m = f3;
        } else {
            float f4 = this.f15545h.f15519d;
            this.f15549l = f4;
            this.f15551n = f4;
            this.f15550m = (this.f15543f.mo16520f(m18822g()) / 2.0f) + this.f15545h.f15520e;
        }
        Resources resources = context.getResources();
        if (mo15530p()) {
            i = C0074d.f181L;
        } else {
            i = C0074d.f178I;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        int n = m18823n();
        int g2 = this.f15545h.mo15483g();
        if (g2 == 8388659 || g2 == 8388691) {
            if (ViewCompat.m3541B(view) == 0) {
                f = (((float) rect.left) - this.f15550m) + ((float) dimensionPixelSize) + ((float) n);
            } else {
                f = ((((float) rect.right) + this.f15550m) - ((float) dimensionPixelSize)) - ((float) n);
            }
            this.f15546i = f;
            return;
        }
        if (ViewCompat.m3541B(view) == 0) {
            f2 = ((((float) rect.right) + this.f15550m) - ((float) dimensionPixelSize)) - ((float) n);
        } else {
            f2 = (((float) rect.left) - this.f15550m) + ((float) dimensionPixelSize) + ((float) n);
        }
        this.f15546i = f2;
    }

    /* renamed from: d */
    public static C4933a m18819d(Context context) {
        return new C4933a(context, 0, f15540r, f15539q, (BadgeState.State) null);
    }

    /* renamed from: e */
    static C4933a m18820e(Context context, BadgeState.State state) {
        return new C4933a(context, 0, f15540r, f15539q, state);
    }

    /* renamed from: f */
    private void m18821f(Canvas canvas) {
        Rect rect = new Rect();
        String g = m18822g();
        this.f15543f.mo16519e().getTextBounds(g, 0, g.length(), rect);
        canvas.drawText(g, this.f15546i, this.f15547j + ((float) (rect.height() / 2)), this.f15543f.mo16519e());
    }

    /* renamed from: g */
    private String m18822g() {
        if (mo15527l() <= this.f15548k) {
            return NumberFormat.getInstance(this.f15545h.mo15492p()).format((long) mo15527l());
        }
        Context context = (Context) this.f15541d.get();
        if (context == null) {
            return "";
        }
        return String.format(this.f15545h.mo15492p(), context.getString(C0080j.f339o), new Object[]{Integer.valueOf(this.f15548k), "+"});
    }

    /* renamed from: n */
    private int m18823n() {
        int i;
        if (mo15530p()) {
            i = this.f15545h.mo15488l();
        } else {
            i = this.f15545h.mo15489m();
        }
        return i + this.f15545h.mo15479c();
    }

    /* renamed from: o */
    private int m18824o() {
        int i;
        if (mo15530p()) {
            i = this.f15545h.mo15494r();
        } else {
            i = this.f15545h.mo15495s();
        }
        return i + this.f15545h.mo15480d();
    }

    /* renamed from: q */
    private void m18825q() {
        this.f15543f.mo16519e().setAlpha(getAlpha());
        invalidateSelf();
    }

    /* renamed from: r */
    private void m18826r() {
        ColorStateList valueOf = ColorStateList.valueOf(this.f15545h.mo15482f());
        if (this.f15542e.mo22965x() != valueOf) {
            this.f15542e.mo22941X(valueOf);
            invalidateSelf();
        }
    }

    /* renamed from: s */
    private void m18827s() {
        FrameLayout frameLayout;
        WeakReference weakReference = this.f15552o;
        if (weakReference != null && weakReference.get() != null) {
            View view = (View) this.f15552o.get();
            WeakReference weakReference2 = this.f15553p;
            if (weakReference2 != null) {
                frameLayout = (FrameLayout) weakReference2.get();
            } else {
                frameLayout = null;
            }
            mo15514K(view, frameLayout);
        }
    }

    /* renamed from: t */
    private void m18828t() {
        this.f15543f.mo16519e().setColor(this.f15545h.mo15484h());
        invalidateSelf();
    }

    /* renamed from: u */
    private void m18829u() {
        m18817M();
        this.f15543f.mo16523i(true);
        m18816L();
        invalidateSelf();
    }

    /* renamed from: v */
    private void m18830v() {
        this.f15543f.mo16523i(true);
        m18816L();
        invalidateSelf();
    }

    /* renamed from: w */
    private void m18831w() {
        boolean u = this.f15545h.mo15497u();
        setVisible(u, false);
        if (C4935b.f15557a && mo15523i() != null && !u) {
            ((ViewGroup) mo15523i().getParent()).invalidate();
        }
    }

    /* renamed from: x */
    private void m18832x() {
        m18829u();
        m18830v();
        m18825q();
        m18826r();
        m18828t();
        m18827s();
        m18816L();
        m18831w();
    }

    /* renamed from: A */
    public void mo15508A(int i) {
        if (this.f15545h.mo15490n() != i) {
            this.f15545h.mo15501z(i);
            m18829u();
        }
    }

    /* renamed from: B */
    public void mo15509B(int i) {
        int max = Math.max(0, i);
        if (this.f15545h.mo15491o() != max) {
            this.f15545h.mo15474A(max);
            m18830v();
        }
    }

    /* renamed from: E */
    public void mo15510E(int i) {
        mo15512G(i);
        mo15511F(i);
    }

    /* renamed from: F */
    public void mo15511F(int i) {
        this.f15545h.mo15475B(i);
        m18816L();
    }

    /* renamed from: G */
    public void mo15512G(int i) {
        this.f15545h.mo15476C(i);
        m18816L();
    }

    /* renamed from: H */
    public void mo15513H(boolean z) {
        this.f15545h.mo15477D(z);
        m18831w();
    }

    /* renamed from: K */
    public void mo15514K(View view, FrameLayout frameLayout) {
        this.f15552o = new WeakReference(view);
        boolean z = C4935b.f15557a;
        if (!z || frameLayout != null) {
            this.f15553p = new WeakReference(frameLayout);
        } else {
            m18814I(view);
        }
        if (!z) {
            m18815J(view);
        }
        m18816L();
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo15515a() {
        invalidateSelf();
    }

    /* renamed from: c */
    public void mo15516c() {
        if (mo15530p()) {
            this.f15545h.mo15478a();
            m18830v();
        }
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f15542e.draw(canvas);
            if (mo15530p()) {
                m18821f(canvas);
            }
        }
    }

    public int getAlpha() {
        return this.f15545h.mo15481e();
    }

    public int getIntrinsicHeight() {
        return this.f15544g.height();
    }

    public int getIntrinsicWidth() {
        return this.f15544g.width();
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public CharSequence mo15522h() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!mo15530p()) {
            return this.f15545h.mo15486j();
        }
        if (this.f15545h.mo15487k() == 0 || (context = (Context) this.f15541d.get()) == null) {
            return null;
        }
        if (mo15527l() <= this.f15548k) {
            return context.getResources().getQuantityString(this.f15545h.mo15487k(), mo15527l(), new Object[]{Integer.valueOf(mo15527l())});
        }
        return context.getString(this.f15545h.mo15485i(), new Object[]{Integer.valueOf(this.f15548k)});
    }

    /* renamed from: i */
    public FrameLayout mo15523i() {
        WeakReference weakReference = this.f15553p;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public boolean isStateful() {
        return false;
    }

    /* renamed from: j */
    public int mo15525j() {
        return this.f15545h.mo15489m();
    }

    /* renamed from: k */
    public int mo15526k() {
        return this.f15545h.mo15490n();
    }

    /* renamed from: l */
    public int mo15527l() {
        if (mo15530p()) {
            return this.f15545h.mo15491o();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public BadgeState.State mo15528m() {
        return this.f15545h.mo15493q();
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: p */
    public boolean mo15530p() {
        return this.f15545h.mo15496t();
    }

    public void setAlpha(int i) {
        this.f15545h.mo15498w(i);
        m18825q();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: y */
    public void mo15533y(int i) {
        this.f15545h.mo15499x(i);
        m18826r();
    }

    /* renamed from: z */
    public void mo15534z(int i) {
        if (this.f15543f.mo16519e().getColor() != i) {
            this.f15545h.mo15500y(i);
            m18828t();
        }
    }
}

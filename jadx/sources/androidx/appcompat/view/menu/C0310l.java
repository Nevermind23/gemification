package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0313m;
import androidx.core.view.C1266x;
import androidx.core.view.ViewCompat;

/* renamed from: androidx.appcompat.view.menu.l */
public class C0310l {

    /* renamed from: a */
    private final Context f1661a;

    /* renamed from: b */
    private final C0297g f1662b;

    /* renamed from: c */
    private final boolean f1663c;

    /* renamed from: d */
    private final int f1664d;

    /* renamed from: e */
    private final int f1665e;

    /* renamed from: f */
    private View f1666f;

    /* renamed from: g */
    private int f1667g;

    /* renamed from: h */
    private boolean f1668h;

    /* renamed from: i */
    private C0313m.C0314a f1669i;

    /* renamed from: j */
    private C0309k f1670j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f1671k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f1672l;

    /* renamed from: androidx.appcompat.view.menu.l$a */
    class C0311a implements PopupWindow.OnDismissListener {
        C0311a() {
        }

        public void onDismiss() {
            C0310l.this.mo1181e();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.l$b */
    static class C0312b {
        /* renamed from: a */
        static void m1205a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public C0310l(Context context, C0297g gVar, View view, boolean z, int i) {
        this(context, gVar, view, z, i, 0);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.k] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.q] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.C0309k m1191a() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f1661a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            androidx.appcompat.view.menu.C0310l.C0312b.m1205a(r0, r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f1661a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p030c.C2213d.f6480a
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x002e
            r0 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            if (r0 == 0) goto L_0x0042
            androidx.appcompat.view.menu.d r0 = new androidx.appcompat.view.menu.d
            android.content.Context r2 = r14.f1661a
            android.view.View r3 = r14.f1666f
            int r4 = r14.f1664d
            int r5 = r14.f1665e
            boolean r6 = r14.f1663c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0054
        L_0x0042:
            androidx.appcompat.view.menu.q r0 = new androidx.appcompat.view.menu.q
            android.content.Context r8 = r14.f1661a
            androidx.appcompat.view.menu.g r9 = r14.f1662b
            android.view.View r10 = r14.f1666f
            int r11 = r14.f1664d
            int r12 = r14.f1665e
            boolean r13 = r14.f1663c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0054:
            androidx.appcompat.view.menu.g r1 = r14.f1662b
            r0.mo928n(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f1672l
            r0.mo937x(r1)
            android.view.View r1 = r14.f1666f
            r0.mo933s(r1)
            androidx.appcompat.view.menu.m$a r1 = r14.f1669i
            r0.mo905f(r1)
            boolean r1 = r14.f1668h
            r0.mo934u(r1)
            int r1 = r14.f1667g
            r0.mo935v(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0310l.m1191a():androidx.appcompat.view.menu.k");
    }

    /* renamed from: l */
    private void m1192l(int i, int i2, boolean z, boolean z2) {
        C0309k c = mo1179c();
        c.mo938y(z2);
        if (z) {
            if ((C1266x.m4406b(this.f1667g, ViewCompat.m3541B(this.f1666f)) & 7) == 5) {
                i -= this.f1666f.getWidth();
            }
            c.mo936w(i);
            c.mo939z(i2);
            int i3 = (int) ((this.f1661a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c.mo1177t(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        c.mo923d();
    }

    /* renamed from: b */
    public void mo1178b() {
        if (mo1180d()) {
            this.f1670j.dismiss();
        }
    }

    /* renamed from: c */
    public C0309k mo1179c() {
        if (this.f1670j == null) {
            this.f1670j = m1191a();
        }
        return this.f1670j;
    }

    /* renamed from: d */
    public boolean mo1180d() {
        C0309k kVar = this.f1670j;
        return kVar != null && kVar.mo922b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo1181e() {
        this.f1670j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1671k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void mo1182f(View view) {
        this.f1666f = view;
    }

    /* renamed from: g */
    public void mo1183g(boolean z) {
        this.f1668h = z;
        C0309k kVar = this.f1670j;
        if (kVar != null) {
            kVar.mo934u(z);
        }
    }

    /* renamed from: h */
    public void mo1184h(int i) {
        this.f1667g = i;
    }

    /* renamed from: i */
    public void mo1185i(PopupWindow.OnDismissListener onDismissListener) {
        this.f1671k = onDismissListener;
    }

    /* renamed from: j */
    public void mo1186j(C0313m.C0314a aVar) {
        this.f1669i = aVar;
        C0309k kVar = this.f1670j;
        if (kVar != null) {
            kVar.mo905f(aVar);
        }
    }

    /* renamed from: k */
    public void mo1187k() {
        if (!mo1188m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: m */
    public boolean mo1188m() {
        if (mo1180d()) {
            return true;
        }
        if (this.f1666f == null) {
            return false;
        }
        m1192l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean mo1189n(int i, int i2) {
        if (mo1180d()) {
            return true;
        }
        if (this.f1666f == null) {
            return false;
        }
        m1192l(i, i2, true, true);
        return true;
    }

    public C0310l(Context context, C0297g gVar, View view, boolean z, int i, int i2) {
        this.f1667g = 8388611;
        this.f1672l = new C0311a();
        this.f1661a = context;
        this.f1662b = gVar;
        this.f1666f = view;
        this.f1663c = z;
        this.f1664d = i;
        this.f1665e = i2;
    }
}

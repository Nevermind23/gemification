package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.widget.C1292c;

/* renamed from: androidx.appcompat.widget.g */
class C0428g {

    /* renamed from: a */
    private final CheckedTextView f2083a;

    /* renamed from: b */
    private ColorStateList f2084b = null;

    /* renamed from: c */
    private PorterDuff.Mode f2085c = null;

    /* renamed from: d */
    private boolean f2086d = false;

    /* renamed from: e */
    private boolean f2087e = false;

    /* renamed from: f */
    private boolean f2088f;

    C0428g(CheckedTextView checkedTextView) {
        this.f2083a = checkedTextView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2089a() {
        Drawable a = C1292c.m4499a(this.f2083a);
        if (a == null) {
            return;
        }
        if (this.f2086d || this.f2087e) {
            Drawable mutate = C0836a.m3156r(a).mutate();
            if (this.f2086d) {
                C0836a.m3153o(mutate, this.f2084b);
            }
            if (this.f2087e) {
                C0836a.m3154p(mutate, this.f2085c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f2083a.getDrawableState());
            }
            this.f2083a.setCheckMarkDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList mo2090b() {
        return this.f2084b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode mo2091c() {
        return this.f2085c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[SYNTHETIC, Splitter:B:12:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ all -> 0x0084 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2092d(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CheckedTextView r0 = r9.f2083a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p030c.C2219j.f6696P0
            r8 = 0
            androidx.appcompat.widget.r1 r0 = androidx.appcompat.widget.C0483r1.m1946v(r0, r10, r3, r11, r8)
            android.widget.CheckedTextView r1 = r9.f2083a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.mo2331r()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.ViewCompat.m3615p0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p030c.C2219j.f6706R0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo2332s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x003a
            int r10 = r0.mo2327n(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x003a
            android.widget.CheckedTextView r11 = r9.f2083a     // Catch:{ NotFoundException -> 0x003a }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003a }
            android.graphics.drawable.Drawable r10 = p045d.C5769a.m23210b(r1, r10)     // Catch:{ NotFoundException -> 0x003a }
            r11.setCheckMarkDrawable(r10)     // Catch:{ NotFoundException -> 0x003a }
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = r8
        L_0x003b:
            if (r10 != 0) goto L_0x0058
            int r10 = p030c.C2219j.f6701Q0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo2332s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0058
            int r10 = r0.mo2327n(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x0058
            android.widget.CheckedTextView r11 = r9.f2083a     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0084 }
            android.graphics.drawable.Drawable r10 = p045d.C5769a.m23210b(r1, r10)     // Catch:{ all -> 0x0084 }
            r11.setCheckMarkDrawable(r10)     // Catch:{ all -> 0x0084 }
        L_0x0058:
            int r10 = p030c.C2219j.f6711S0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo2332s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0069
            android.widget.CheckedTextView r11 = r9.f2083a     // Catch:{ all -> 0x0084 }
            android.content.res.ColorStateList r10 = r0.mo2316c(r10)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C1292c.m4500b(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0069:
            int r10 = p030c.C2219j.f6716T0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo2332s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0080
            android.widget.CheckedTextView r11 = r9.f2083a     // Catch:{ all -> 0x0084 }
            r1 = -1
            int r10 = r0.mo2324k(r10, r1)     // Catch:{ all -> 0x0084 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.C0485s0.m1971e(r10, r1)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C1292c.m4501c(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0080:
            r0.mo2333w()
            return
        L_0x0084:
            r10 = move-exception
            r0.mo2333w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0428g.mo2092d(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2093e() {
        if (this.f2088f) {
            this.f2088f = false;
            return;
        }
        this.f2088f = true;
        mo2089a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2094f(ColorStateList colorStateList) {
        this.f2084b = colorStateList;
        this.f2086d = true;
        mo2089a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2095g(PorterDuff.Mode mode) {
        this.f2085c = mode;
        this.f2087e = true;
        mo2089a();
    }
}

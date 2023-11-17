package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.widget.C1295d;

/* renamed from: androidx.appcompat.widget.h */
class C0434h {

    /* renamed from: a */
    private final CompoundButton f2096a;

    /* renamed from: b */
    private ColorStateList f2097b = null;

    /* renamed from: c */
    private PorterDuff.Mode f2098c = null;

    /* renamed from: d */
    private boolean f2099d = false;

    /* renamed from: e */
    private boolean f2100e = false;

    /* renamed from: f */
    private boolean f2101f;

    C0434h(CompoundButton compoundButton) {
        this.f2096a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2103a() {
        Drawable a = C1295d.m4505a(this.f2096a);
        if (a == null) {
            return;
        }
        if (this.f2099d || this.f2100e) {
            Drawable mutate = C0836a.m3156r(a).mutate();
            if (this.f2099d) {
                C0836a.m3153o(mutate, this.f2097b);
            }
            if (this.f2100e) {
                C0836a.m3154p(mutate, this.f2098c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f2096a.getDrawableState());
            }
            this.f2096a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo2104b(int i) {
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo2105c() {
        return this.f2097b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode mo2106d() {
        return this.f2098c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[SYNTHETIC, Splitter:B:12:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ all -> 0x0084 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2107e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f2096a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p030c.C2219j.f6721U0
            r8 = 0
            androidx.appcompat.widget.r1 r0 = androidx.appcompat.widget.C0483r1.m1946v(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f2096a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.mo2331r()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.ViewCompat.m3615p0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p030c.C2219j.f6731W0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo2332s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x003a
            int r10 = r0.mo2327n(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x003a
            android.widget.CompoundButton r11 = r9.f2096a     // Catch:{ NotFoundException -> 0x003a }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003a }
            android.graphics.drawable.Drawable r10 = p045d.C5769a.m23210b(r1, r10)     // Catch:{ NotFoundException -> 0x003a }
            r11.setButtonDrawable(r10)     // Catch:{ NotFoundException -> 0x003a }
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = r8
        L_0x003b:
            if (r10 != 0) goto L_0x0058
            int r10 = p030c.C2219j.f6726V0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo2332s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0058
            int r10 = r0.mo2327n(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x0058
            android.widget.CompoundButton r11 = r9.f2096a     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0084 }
            android.graphics.drawable.Drawable r10 = p045d.C5769a.m23210b(r1, r10)     // Catch:{ all -> 0x0084 }
            r11.setButtonDrawable(r10)     // Catch:{ all -> 0x0084 }
        L_0x0058:
            int r10 = p030c.C2219j.f6736X0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo2332s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0069
            android.widget.CompoundButton r11 = r9.f2096a     // Catch:{ all -> 0x0084 }
            android.content.res.ColorStateList r10 = r0.mo2316c(r10)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C1295d.m4508d(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0069:
            int r10 = p030c.C2219j.f6741Y0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo2332s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0080
            android.widget.CompoundButton r11 = r9.f2096a     // Catch:{ all -> 0x0084 }
            r1 = -1
            int r10 = r0.mo2324k(r10, r1)     // Catch:{ all -> 0x0084 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.C0485s0.m1971e(r10, r1)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C1295d.m4509e(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0080:
            r0.mo2333w()
            return
        L_0x0084:
            r10 = move-exception
            r0.mo2333w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0434h.mo2107e(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2108f() {
        if (this.f2101f) {
            this.f2101f = false;
            return;
        }
        this.f2101f = true;
        mo2103a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2109g(ColorStateList colorStateList) {
        this.f2097b = colorStateList;
        this.f2099d = true;
        mo2103a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2110h(PorterDuff.Mode mode) {
        this.f2098c = mode;
        this.f2100e = true;
        mo2103a();
    }
}

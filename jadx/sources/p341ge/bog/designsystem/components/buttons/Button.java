package p341ge.bog.designsystem.components.buttons;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.thumbnailiconbadge.ThumbnailIconBadgeView;
import p341ge.bog.designsystem.components.verifiedbadge.VerifiedBadgeView;
import p476jh.C15769a;
import p601sg.C17777b;

/* renamed from: ge.bog.designsystem.components.buttons.Button */
public final class Button extends LayerView implements Checkable {

    /* renamed from: i */
    public static final C13202a f38938i = new C13202a((DefaultConstructorMarker) null);

    /* renamed from: j */
    private static final int[] f38939j = {16842912};

    /* renamed from: k */
    private static final int[] f38940k = {C17777b.state_badge_visible};

    /* renamed from: d */
    private C15769a f38941d;

    /* renamed from: e */
    private boolean f38942e;

    /* renamed from: f */
    private Integer f38943f;

    /* renamed from: g */
    private boolean f38944g;

    /* renamed from: h */
    private boolean f38945h;

    /* renamed from: ge.bog.designsystem.components.buttons.Button$a */
    public static final class C13202a {
        private C13202a() {
        }

        public /* synthetic */ C13202a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.buttons.Button$b */
    public interface C13203b {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Button(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C41536l.m120488h(drawableState, "states");
        this.f38941d.mo43204v(C41333m.m119793r(drawableState, 16842910), C41333m.m119793r(drawableState, 16842919), C41333m.m119793r(drawableState, 16842912), C41333m.m119793r(drawableState, 16843518), this.f38942e);
    }

    public final Drawable getBackgroundSelector() {
        return this.f38941d.mo43183a();
    }

    public final Integer getBadgeColor() {
        return this.f38943f;
    }

    public final CharSequence getButtonAmountText() {
        return this.f38941d.mo43185c();
    }

    public final Integer getButtonBadgeCount() {
        return this.f38941d.mo43186d();
    }

    public final boolean getButtonBadgeVisible() {
        return this.f38942e;
    }

    public final Drawable getButtonIcon() {
        return this.f38941d.mo43187e();
    }

    public final ColorStateList getButtonIconBackgroundTint() {
        return this.f38941d.mo43188f();
    }

    public final ImageView getButtonIconImageView() {
        return this.f38941d.mo43189g();
    }

    public final ColorStateList getButtonIconTint() {
        return this.f38941d.mo43190h();
    }

    public final CharSequence getButtonText() {
        return this.f38941d.mo43192j();
    }

    public final ColorStateList getButtonTextTint() {
        return this.f38941d.mo43193k();
    }

    public final boolean getIconBeforeText() {
        return this.f38941d.mo43196n();
    }

    public final boolean getLoading() {
        return this.f38941d.mo43191i();
    }

    public final int getMaxLines() {
        return this.f38941d.mo43198p();
    }

    public final ColorStateList getTextColor() {
        return this.f38941d.mo43200r();
    }

    public final ThumbnailIconBadgeView getThumbnailIconBadgeView() {
        return this.f38941d.mo43201s();
    }

    public final VerifiedBadgeView getVerificationBadgeView() {
        return this.f38941d.mo43202t();
    }

    public boolean isChecked() {
        return this.f38944g;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f38939j);
        }
        if (this.f38942e) {
            View.mergeDrawableStates(onCreateDrawableState, f38940k);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        if (this.f38941d.mo43203u() != -1) {
            i3 = this.f38941d.mo43203u();
        } else {
            i3 = Math.max(this.f38941d.mo43199q(), getMeasuredWidth());
        }
        if (this.f38941d.mo43195m() != -1) {
            i4 = this.f38941d.mo43195m();
        } else {
            i4 = getMeasuredHeight();
        }
        setMeasuredDimension(i3, i4);
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public final void setBackgroundSelector(Drawable drawable) {
        this.f38941d.mo43205w(drawable);
    }

    public final void setBadgeColor(Integer num) {
        this.f38941d.mo43206x(num);
    }

    public final void setButtonAmountText(CharSequence charSequence) {
        this.f38941d.mo43207y(charSequence);
    }

    public final void setButtonBadgeCount(Integer num) {
        boolean z;
        this.f38941d.mo43208z(num);
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        setButtonBadgeVisible(z);
    }

    public final void setButtonBadgeVisible(boolean z) {
        this.f38942e = z;
        refreshDrawableState();
    }

    public final void setButtonIcon(Drawable drawable) {
        this.f38941d.mo43174A(drawable);
    }

    public final void setButtonIconBackgroundTint(ColorStateList colorStateList) {
        this.f38941d.mo43175B(colorStateList);
    }

    public final void setButtonIconTint(ColorStateList colorStateList) {
        this.f38941d.mo43176C(colorStateList);
    }

    public final void setButtonText(CharSequence charSequence) {
        this.f38941d.mo43178E(charSequence);
    }

    public final void setButtonTextTint(ColorStateList colorStateList) {
        this.f38941d.mo43179F(colorStateList);
    }

    public void setChecked(boolean z) {
        this.f38944g = z;
        refreshDrawableState();
        if (!this.f38945h) {
            this.f38945h = false;
        }
    }

    public final void setIconBeforeText(boolean z) {
        this.f38941d.mo43180G(z);
    }

    public final void setLoading(boolean z) {
        setEnabled(!z);
        this.f38941d.mo43177D(z);
    }

    public final void setMaxLines(int i) {
        this.f38941d.mo43181H(i);
    }

    public final void setOnCheckedChangeListener(C13203b bVar) {
        setOnClickListener((View.OnClickListener) null);
    }

    public final void setTextColor(ColorStateList colorStateList) {
        this.f38941d.mo43182I(colorStateList);
    }

    public void toggle() {
        setChecked(!this.f38944g);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Button(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [jh.a] */
    /* JADX WARNING: type inference failed for: r4v2, types: [jh.a$r] */
    /* JADX WARNING: type inference failed for: r0v41 */
    /* JADX WARNING: type inference failed for: r0v42 */
    /* JADX WARNING: type inference failed for: r0v43 */
    /* JADX WARNING: type inference failed for: r0v44 */
    /* JADX WARNING: type inference failed for: r0v45 */
    /* JADX WARNING: type inference failed for: r0v46 */
    /* JADX WARNING: type inference failed for: r0v47 */
    /* JADX WARNING: type inference failed for: r0v48 */
    /* JADX WARNING: type inference failed for: r0v49 */
    /* JADX WARNING: type inference failed for: r0v50 */
    /* JADX WARNING: type inference failed for: r0v51 */
    /* JADX WARNING: type inference failed for: r0v52 */
    /* JADX WARNING: type inference failed for: r0v53 */
    /* JADX WARNING: type inference failed for: r0v54 */
    /* JADX WARNING: type inference failed for: r0v55 */
    /* JADX WARNING: type inference failed for: r0v56 */
    /* JADX WARNING: type inference failed for: r0v57 */
    /* JADX WARNING: type inference failed for: r0v58 */
    /* JADX WARNING: type inference failed for: r0v59 */
    /* JADX WARNING: type inference failed for: r0v60 */
    /* JADX WARNING: type inference failed for: r0v61 */
    /* JADX WARNING: type inference failed for: r0v62 */
    /* JADX WARNING: type inference failed for: r0v63 */
    /* JADX WARNING: type inference failed for: r0v64 */
    /* JADX WARNING: type inference failed for: r0v65 */
    /* JADX WARNING: type inference failed for: r0v66 */
    /* JADX WARNING: type inference failed for: r4v3, types: [jh.a$s] */
    /* JADX WARNING: type inference failed for: r0v67 */
    /* JADX WARNING: type inference failed for: r0v68 */
    /* JADX WARNING: type inference failed for: r0v69 */
    /* JADX WARNING: type inference failed for: r0v70 */
    /* JADX WARNING: type inference failed for: r0v71 */
    /* JADX WARNING: type inference failed for: r0v72 */
    /* JADX WARNING: type inference failed for: r0v73 */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Button(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C41536l.m120489i(r11, r0)
            r10.<init>(r11, r12, r13)
            android.content.res.Resources$Theme r13 = r11.getTheme()
            int[] r0 = p601sg.C17787l.f50456o1
            r1 = 0
            android.content.res.TypedArray r12 = r13.obtainStyledAttributes(r12, r0, r1, r1)
            android.view.LayoutInflater r13 = android.view.LayoutInflater.from(r11)     // Catch:{ all -> 0x02bc }
            int r0 = p601sg.C17787l.f49842A1     // Catch:{ all -> 0x02bc }
            int r0 = r12.getInt(r0, r1)     // Catch:{ all -> 0x02bc }
            java.lang.String r2 = "inflate(layoutInflater, this, true)"
            r3 = 1
            switch(r0) {
                case 0: goto L_0x0200;
                case 1: goto L_0x01f3;
                case 2: goto L_0x01e6;
                case 3: goto L_0x01d9;
                case 4: goto L_0x01cc;
                case 5: goto L_0x01bf;
                case 6: goto L_0x01b2;
                case 7: goto L_0x01a5;
                case 8: goto L_0x0198;
                case 9: goto L_0x018a;
                case 10: goto L_0x017c;
                case 11: goto L_0x016e;
                case 12: goto L_0x0160;
                case 13: goto L_0x0152;
                case 14: goto L_0x0144;
                case 15: goto L_0x0136;
                case 16: goto L_0x0128;
                case 17: goto L_0x011a;
                case 18: goto L_0x010c;
                case 19: goto L_0x00fe;
                case 20: goto L_0x00f0;
                case 21: goto L_0x00e2;
                case 22: goto L_0x00d4;
                case 23: goto L_0x00c6;
                case 24: goto L_0x00b8;
                case 25: goto L_0x00aa;
                case 26: goto L_0x009c;
                case 27: goto L_0x0089;
                case 28: goto L_0x007b;
                case 29: goto L_0x006d;
                case 30: goto L_0x005f;
                case 31: goto L_0x0051;
                case 32: goto L_0x0043;
                case 33: goto L_0x0035;
                case 34: goto L_0x0027;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02bc }
            goto L_0x02b6
        L_0x0027:
            jh.a$u r0 = new jh.a$u     // Catch:{ all -> 0x02bc }
            ak.v1 r13 = p352ak.C10031v1.m36793d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x0035:
            jh.a$l r0 = new jh.a$l     // Catch:{ all -> 0x02bc }
            ak.j3 r13 = p352ak.C9943j3.m36469d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x0043:
            jh.a$v r0 = new jh.a$v     // Catch:{ all -> 0x02bc }
            ak.z4 r13 = p352ak.C10062z4.m36908d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x0051:
            jh.a$a r0 = new jh.a$a     // Catch:{ all -> 0x02bc }
            ak.y0 r13 = p352ak.C10051y0.m36866d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x005f:
            jh.a$d r0 = new jh.a$d     // Catch:{ all -> 0x02bc }
            ak.b1 r13 = p352ak.C9877b1.m36229d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x006d:
            jh.a$f r0 = new jh.a$f     // Catch:{ all -> 0x02bc }
            ak.a r13 = p352ak.C9867a.m36193d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x007b:
            jh.a$b0 r0 = new jh.a$b0     // Catch:{ all -> 0x02bc }
            ak.w1 r13 = p352ak.C10038w1.m36818d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x0089:
            jh.a$s r0 = new jh.a$s     // Catch:{ all -> 0x02bc }
            ak.p1 r5 = p352ak.C9989p1.m36637d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r5, r2)     // Catch:{ all -> 0x02bc }
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x009c:
            jh.a$c0 r0 = new jh.a$c0     // Catch:{ all -> 0x02bc }
            ak.u1 r13 = p352ak.C10024u1.m36766d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x00aa:
            jh.a$j r0 = new jh.a$j     // Catch:{ all -> 0x02bc }
            ak.f1 r13 = p352ak.C9909f1.m36348d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x00b8:
            jh.a$i r0 = new jh.a$i     // Catch:{ all -> 0x02bc }
            ak.e1 r13 = p352ak.C9901e1.m36318d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x00c6:
            jh.a$e r0 = new jh.a$e     // Catch:{ all -> 0x02bc }
            ak.c1 r13 = p352ak.C9885c1.m36258d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x00d4:
            jh.a$c r0 = new jh.a$c     // Catch:{ all -> 0x02bc }
            ak.a1 r13 = p352ak.C9869a1.m36201d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x00e2:
            jh.a$b r0 = new jh.a$b     // Catch:{ all -> 0x02bc }
            ak.d1 r13 = p352ak.C9893d1.m36286d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x00f0:
            jh.a$d0 r0 = new jh.a$d0     // Catch:{ all -> 0x02bc }
            ak.r1 r13 = p352ak.C10003r1.m36689d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x00fe:
            jh.a$p r0 = new jh.a$p     // Catch:{ all -> 0x02bc }
            ak.l1 r13 = p352ak.C9957l1.m36520d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x010c:
            jh.a$g0 r0 = new jh.a$g0     // Catch:{ all -> 0x02bc }
            ak.x1 r13 = p352ak.C10045x1.m36844d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x011a:
            jh.a$o r0 = new jh.a$o     // Catch:{ all -> 0x02bc }
            ak.j1 r13 = p352ak.C9941j1.m36462d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x0128:
            jh.a$q r0 = new jh.a$q     // Catch:{ all -> 0x02bc }
            ak.m1 r13 = p352ak.C9965m1.m36551d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x0136:
            jh.a$h0 r0 = new jh.a$h0     // Catch:{ all -> 0x02bc }
            ak.y1 r13 = p352ak.C10052y1.m36870d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x0144:
            jh.a$i0 r0 = new jh.a$i0     // Catch:{ all -> 0x02bc }
            ak.y1 r13 = p352ak.C10052y1.m36870d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x0152:
            jh.a$g r0 = new jh.a$g     // Catch:{ all -> 0x02bc }
            ak.g1 r13 = p352ak.C9917g1.m36377d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x0160:
            jh.a$t r0 = new jh.a$t     // Catch:{ all -> 0x02bc }
            ak.p1 r13 = p352ak.C9989p1.m36637d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x016e:
            jh.a$h r0 = new jh.a$h     // Catch:{ all -> 0x02bc }
            ak.z0 r13 = p352ak.C10058z0.m36894d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x017c:
            jh.a$k r0 = new jh.a$k     // Catch:{ all -> 0x02bc }
            ak.h1 r13 = p352ak.C9925h1.m36406d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x018a:
            jh.a$n r0 = new jh.a$n     // Catch:{ all -> 0x02bc }
            ak.k1 r13 = p352ak.C9949k1.m36490d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x0198:
            jh.a$m r0 = new jh.a$m     // Catch:{ all -> 0x02bc }
            ak.i1 r13 = p352ak.C9933i1.m36435d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x01a5:
            jh.a$f0 r0 = new jh.a$f0     // Catch:{ all -> 0x02bc }
            ak.t1 r13 = p352ak.C10017t1.m36742d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x01b2:
            jh.a$e0 r0 = new jh.a$e0     // Catch:{ all -> 0x02bc }
            ak.s1 r13 = p352ak.C10010s1.m36716d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x01bf:
            jh.a$a0 r0 = new jh.a$a0     // Catch:{ all -> 0x02bc }
            ak.s1 r13 = p352ak.C10010s1.m36716d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x01cc:
            jh.a$x r0 = new jh.a$x     // Catch:{ all -> 0x02bc }
            ak.q1 r13 = p352ak.C9996q1.m36663d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x01d9:
            jh.a$w r0 = new jh.a$w     // Catch:{ all -> 0x02bc }
            ak.q1 r13 = p352ak.C9996q1.m36663d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x01e6:
            jh.a$z r0 = new jh.a$z     // Catch:{ all -> 0x02bc }
            ak.q1 r13 = p352ak.C9996q1.m36663d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x01f3:
            jh.a$y r0 = new jh.a$y     // Catch:{ all -> 0x02bc }
            ak.q1 r13 = p352ak.C9996q1.m36663d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r13, r2)     // Catch:{ all -> 0x02bc }
            r0.<init>(r13)     // Catch:{ all -> 0x02bc }
            goto L_0x0211
        L_0x0200:
            jh.a$r r0 = new jh.a$r     // Catch:{ all -> 0x02bc }
            ak.p1 r5 = p352ak.C9989p1.m36637d(r13, r10, r3)     // Catch:{ all -> 0x02bc }
            kotlin.jvm.internal.C41536l.m120488h(r5, r2)     // Catch:{ all -> 0x02bc }
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x02bc }
        L_0x0211:
            r10.f38941d = r0     // Catch:{ all -> 0x02bc }
            int r13 = p601sg.C17787l.f50627z1     // Catch:{ all -> 0x02bc }
            int r13 = r12.getInt(r13, r1)     // Catch:{ all -> 0x02bc }
            if (r13 <= 0) goto L_0x021e
            r10.setMaxLines(r13)     // Catch:{ all -> 0x02bc }
        L_0x021e:
            int r13 = p601sg.C17787l.f49857B1     // Catch:{ all -> 0x02bc }
            boolean r13 = r12.getBoolean(r13, r3)     // Catch:{ all -> 0x02bc }
            if (r13 != 0) goto L_0x0229
            r10.setIconBeforeText(r1)     // Catch:{ all -> 0x02bc }
        L_0x0229:
            int r13 = p601sg.C17787l.f50612y1     // Catch:{ all -> 0x02bc }
            int r13 = r12.getResourceId(r13, r1)     // Catch:{ all -> 0x02bc }
            if (r13 == 0) goto L_0x0238
            android.content.res.ColorStateList r13 = p045d.C5769a.m23209a(r11, r13)     // Catch:{ all -> 0x02bc }
            r10.setTextColor(r13)     // Catch:{ all -> 0x02bc }
        L_0x0238:
            int r13 = p601sg.C17787l.f50597x1     // Catch:{ all -> 0x02bc }
            java.lang.CharSequence r13 = r12.getText(r13)     // Catch:{ all -> 0x02bc }
            r10.setButtonText(r13)     // Catch:{ all -> 0x02bc }
            int r13 = p601sg.C17787l.f50552u1     // Catch:{ all -> 0x02bc }
            int r13 = r12.getResourceId(r13, r1)     // Catch:{ all -> 0x02bc }
            if (r13 == 0) goto L_0x0250
            android.graphics.drawable.Drawable r13 = p045d.C5769a.m23210b(r11, r13)     // Catch:{ all -> 0x02bc }
            r10.setButtonIcon(r13)     // Catch:{ all -> 0x02bc }
        L_0x0250:
            int r13 = p601sg.C17787l.f50582w1     // Catch:{ all -> 0x02bc }
            boolean r13 = r12.getBoolean(r13, r3)     // Catch:{ all -> 0x02bc }
            if (r13 != 0) goto L_0x025c
            r13 = 0
            r10.setButtonIcon(r13)     // Catch:{ all -> 0x02bc }
        L_0x025c:
            int r13 = p601sg.C17787l.f50567v1     // Catch:{ all -> 0x02bc }
            int r13 = r12.getResourceId(r13, r1)     // Catch:{ all -> 0x02bc }
            if (r13 == 0) goto L_0x026b
            android.content.res.ColorStateList r13 = p045d.C5769a.m23209a(r11, r13)     // Catch:{ all -> 0x02bc }
            r10.setButtonIconTint(r13)     // Catch:{ all -> 0x02bc }
        L_0x026b:
            int r13 = p601sg.C17787l.f50488q1     // Catch:{ all -> 0x02bc }
            boolean r13 = r12.getBoolean(r13, r1)     // Catch:{ all -> 0x02bc }
            r10.setChecked(r13)     // Catch:{ all -> 0x02bc }
            int r13 = p601sg.C17787l.f50472p1     // Catch:{ all -> 0x02bc }
            boolean r13 = r12.getBoolean(r13, r3)     // Catch:{ all -> 0x02bc }
            r10.setEnabled(r13)     // Catch:{ all -> 0x02bc }
            int r13 = p601sg.C17787l.f49872C1     // Catch:{ all -> 0x02bc }
            boolean r13 = r12.getBoolean(r13, r1)     // Catch:{ all -> 0x02bc }
            if (r13 == 0) goto L_0x0288
            r10.setLoading(r3)     // Catch:{ all -> 0x02bc }
        L_0x0288:
            int r13 = p601sg.C17787l.f50504r1     // Catch:{ all -> 0x02bc }
            boolean r13 = r12.getBoolean(r13, r1)     // Catch:{ all -> 0x02bc }
            if (r13 == 0) goto L_0x0293
            r10.setActivated(r3)     // Catch:{ all -> 0x02bc }
        L_0x0293:
            int r13 = p601sg.C17787l.f50520s1     // Catch:{ all -> 0x02bc }
            java.lang.CharSequence r13 = r12.getText(r13)     // Catch:{ all -> 0x02bc }
            if (r13 == 0) goto L_0x02a3
            java.lang.String r0 = "getText(R.styleable.Button_amount_text)"
            kotlin.jvm.internal.C41536l.m120488h(r13, r0)     // Catch:{ all -> 0x02bc }
            r10.setButtonAmountText(r13)     // Catch:{ all -> 0x02bc }
        L_0x02a3:
            int r13 = p601sg.C17787l.f50536t1     // Catch:{ all -> 0x02bc }
            int r13 = r12.getResourceId(r13, r1)     // Catch:{ all -> 0x02bc }
            if (r13 == 0) goto L_0x02b2
            android.graphics.drawable.Drawable r11 = p045d.C5769a.m23210b(r11, r13)     // Catch:{ all -> 0x02bc }
            r10.setBackgroundSelector(r11)     // Catch:{ all -> 0x02bc }
        L_0x02b2:
            r12.recycle()
            return
        L_0x02b6:
            java.lang.String r13 = "Unknown Button type"
            r11.<init>(r13)     // Catch:{ all -> 0x02bc }
            throw r11     // Catch:{ all -> 0x02bc }
        L_0x02bc:
            r11 = move-exception
            r12.recycle()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.buttons.Button.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

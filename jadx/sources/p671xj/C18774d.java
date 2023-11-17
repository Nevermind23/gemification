package p671xj;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.core.content.res.C0808h;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.tooltip.view.ToolTipView;
import p601sg.C17779d;
import p601sg.C17781f;
import p601sg.C17782g;
import p601sg.C17783h;
import p601sg.C17786k;
import ue1.C43064a;

/* renamed from: xj.d */
public final class C18774d {

    /* renamed from: a */
    private final View f52472a;

    /* renamed from: b */
    private C18775a f52473b;

    /* renamed from: c */
    private int f52474c;

    /* renamed from: d */
    private int f52475d;

    /* renamed from: e */
    private String f52476e;

    /* renamed from: f */
    private C43064a f52477f;

    /* renamed from: g */
    private boolean f52478g;

    /* renamed from: h */
    private boolean f52479h;

    /* renamed from: i */
    private boolean f52480i;

    /* renamed from: j */
    private PopupWindow f52481j;

    /* renamed from: k */
    private boolean f52482k;

    /* renamed from: l */
    private final int f52483l;

    /* renamed from: xj.d$a */
    public enum C18775a {
        Left,
        Top,
        Right,
        Bottom
    }

    /* renamed from: xj.d$b */
    public /* synthetic */ class C18776b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52489a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                xj.d$a[] r0 = p671xj.C18774d.C18775a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xj.d$a r1 = p671xj.C18774d.C18775a.Top     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                xj.d$a r1 = p671xj.C18774d.C18775a.Bottom     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                xj.d$a r1 = p671xj.C18774d.C18775a.Left     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                xj.d$a r1 = p671xj.C18774d.C18775a.Right     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f52489a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p671xj.C18774d.C18776b.<clinit>():void");
        }
    }

    public C18774d(View view, C18775a aVar, int i, int i2, String str, C43064a aVar2, boolean z, boolean z2, boolean z3) {
        C41536l.m120489i(view, "anchorView");
        C41536l.m120489i(aVar, "arrowPosition");
        C41536l.m120489i(str, "text");
        this.f52472a = view;
        this.f52473b = aVar;
        this.f52474c = i;
        this.f52475d = i2;
        this.f52476e = str;
        this.f52477f = aVar2;
        this.f52478g = z;
        this.f52479h = z2;
        this.f52480i = z3;
        this.f52483l = m63522e().getResources().getDimensionPixelSize(C17779d.f49645S1);
    }

    /* renamed from: d */
    private final Activity m63521d(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        C41536l.m120488h(baseContext, "context.baseContext");
        return m63521d(baseContext);
    }

    /* renamed from: e */
    private final Context m63522e() {
        return this.f52472a.getContext();
    }

    /* renamed from: f */
    private final PopupWindow m63523f() {
        PopupWindow popupWindow = this.f52481j;
        C41536l.m120486f(popupWindow);
        return popupWindow;
    }

    /* renamed from: g */
    private final int m63524g() {
        return m63522e().getResources().getDimensionPixelSize(C17779d.f49642K1);
    }

    /* renamed from: h */
    private final int m63525h() {
        return m63522e().getResources().getDimensionPixelSize(C17779d.f49645S1);
    }

    /* renamed from: i */
    private final int m63526i() {
        return m63522e().getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: j */
    private final int m63527j() {
        return m63522e().getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: k */
    private final StaticLayout m63528k(String str, int i, TextPaint textPaint) {
        StaticLayout build = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, i).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
        C41536l.m120488h(build, "{\n            StaticLayo…NORMAL).build()\n        }");
        return build;
    }

    /* renamed from: l */
    private final int m63529l() {
        Context e = m63522e();
        C41536l.m120488h(e, "context");
        Activity d = m63521d(e);
        if (d == null) {
            return 0;
        }
        Window window = d.getWindow();
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    /* renamed from: m */
    private final Rect m63530m(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        int i = iArr[0];
        rect.left = i;
        rect.top = iArr[1];
        rect.right = i + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        return rect;
    }

    /* renamed from: w */
    public static /* synthetic */ void m63531w(C18774d dVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        dVar.mo46570v(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final void m63532x(C18774d dVar, int i) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m63533y();
        if (i != -1) {
            dVar.m63523f().getContentView().postDelayed(new C18772b(dVar), ((long) i) * 1000);
        }
    }

    /* renamed from: y */
    private final void m63533y() {
        int i;
        int i2;
        int i3;
        int i4;
        View inflate = View.inflate(m63522e(), C17783h.layout_tooltip, (ViewGroup) null);
        C41536l.m120487g(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) inflate;
        ToolTipView toolTipView = (ToolTipView) frameLayout.findViewById(C17782g.toolTipView);
        toolTipView.setArrowPosition(this.f52473b);
        toolTipView.setAnchorView(this.f52472a);
        toolTipView.setText(this.f52476e);
        toolTipView.setTextColor(this.f52475d);
        toolTipView.setContainerBackgroundResourceId(this.f52474c);
        toolTipView.setOnClickListener(new C18773c(this));
        this.f52481j = new PopupWindow(m63522e());
        m63523f().setClippingEnabled(false);
        m63523f().setHeight(-2);
        m63523f().setContentView(frameLayout);
        if (this.f52479h) {
            m63523f().setOutsideTouchable(true);
            m63523f().setFocusable(true);
            m63523f().setBackgroundDrawable(new ColorDrawable(0));
        } else {
            m63523f().setBackgroundDrawable((Drawable) null);
        }
        if (this.f52480i) {
            m63523f().setAnimationStyle(C17786k.tooltipFadeAnimation);
        }
        Rect m = m63530m(this.f52472a);
        if (m == null) {
            Log.d("ToolTipError", "showTooltip: anchorView location not found");
            return;
        }
        TextPaint textPaint = new TextPaint();
        Typeface h = C0808h.m3033h(m63522e(), C17781f.f49673b);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize((float) m63522e().getResources().getDimensionPixelSize(C17779d.tooltip_default_text_size));
        textPaint.setTypeface(h);
        float measureText = textPaint.measureText(this.f52476e);
        int i5 = C18776b.f52489a[this.f52473b.ordinal()];
        if (i5 == 1 || i5 == 2) {
            int i6 = this.f52483l;
            if (measureText < ((float) ((m63527j() - (this.f52483l * 2)) - (m63524g() * 2)))) {
                m63523f().setWidth((int) (measureText + ((float) (m63524g() * 2))));
                i6 = m.centerX() - (m63523f().getWidth() / 2);
                int i7 = this.f52483l;
                if (i6 < i7) {
                    i6 = i7;
                } else if (m63523f().getWidth() + i6 > m63527j() - this.f52483l) {
                    i6 = (m63527j() - this.f52483l) - m63523f().getWidth();
                }
            } else {
                m63523f().setWidth(m63527j() - (this.f52483l * 2));
            }
            m63523f().setHeight(m63528k(this.f52476e, m63523f().getWidth() - (m63524g() * 2), textPaint).getHeight() + (m63525h() * 2) + toolTipView.getArrowHeightPx());
            if (m.top - m63523f().getHeight() < m63529l()) {
                this.f52473b = C18775a.Top;
            } else if (m.bottom + m63523f().getHeight() > m63526i()) {
                this.f52473b = C18775a.Bottom;
            }
            toolTipView.setArrowPosition(this.f52473b);
            PopupWindow f = m63523f();
            View view = this.f52472a;
            if (this.f52473b == C18775a.Top) {
                i = m.bottom;
            } else {
                i = m.top - m63523f().getHeight();
            }
            f.showAtLocation(view, 0, i6, i);
        } else if (i5 == 3 || i5 == 4) {
            C18775a aVar = this.f52473b;
            C18775a aVar2 = C18775a.Left;
            if (aVar == aVar2) {
                i3 = (m63527j() - this.f52483l) - (m63524g() * 2);
                i2 = toolTipView.getArrowHeightPx();
            } else {
                i3 = (this.f52472a.getLeft() - this.f52483l) - (m63524g() * 2);
                i2 = toolTipView.getArrowHeightPx();
            }
            if (measureText < ((float) (i3 - i2))) {
                m63523f().setWidth((int) (measureText + ((float) (m63524g() * 2)) + ((float) toolTipView.getArrowHeightPx())));
            } else {
                m63523f().setWidth((m63527j() - this.f52483l) - m.right);
            }
            m63523f().setHeight(m63528k(this.f52476e, m63523f().getWidth(), textPaint).getHeight() + (m63525h() * 2));
            PopupWindow f2 = m63523f();
            View view2 = this.f52472a;
            if (this.f52473b == aVar2) {
                i4 = m.right;
            } else {
                i4 = m.left - m63523f().getWidth();
            }
            f2.showAtLocation(view2, 0, i4, m.centerY() - (m63523f().getHeight() / 2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static final void m63534z(C18774d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        if (dVar.f52478g) {
            dVar.mo46561c();
        }
        C43064a aVar = dVar.f52477f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: c */
    public final void mo46561c() {
        if (!this.f52482k) {
            PopupWindow popupWindow = this.f52481j;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
            this.f52482k = true;
            this.f52477f = null;
            this.f52481j = null;
        }
    }

    /* renamed from: n */
    public final void mo46562n(C18775a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f52473b = aVar;
    }

    /* renamed from: o */
    public final void mo46563o(int i) {
        this.f52474c = i;
    }

    /* renamed from: p */
    public final void mo46564p(boolean z) {
        this.f52478g = z;
    }

    /* renamed from: q */
    public final void mo46565q(boolean z) {
        this.f52479h = z;
    }

    /* renamed from: r */
    public final void mo46566r(boolean z) {
        this.f52480i = z;
    }

    /* renamed from: s */
    public final void mo46567s(C43064a aVar) {
        this.f52477f = aVar;
    }

    /* renamed from: t */
    public final void mo46568t(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f52476e = str;
    }

    /* renamed from: u */
    public final void mo46569u(int i) {
        this.f52475d = i;
    }

    /* renamed from: v */
    public final void mo46570v(int i) {
        this.f52472a.post(new C18771a(this, i));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C18774d(android.view.View r10, p671xj.C18774d.C18775a r11, int r12, int r13, java.lang.String r14, ue1.C43064a r15, boolean r16, boolean r17, boolean r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r9 = this;
            r0 = r19
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0009
            xj.d$a r1 = p671xj.C18774d.C18775a.Top
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r2 = r0 & 4
            r3 = 0
            if (r2 == 0) goto L_0x0011
            r2 = r3
            goto L_0x0012
        L_0x0011:
            r2 = r12
        L_0x0012:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0019
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x001a
        L_0x0019:
            r4 = r13
        L_0x001a:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0021
            java.lang.String r5 = ""
            goto L_0x0022
        L_0x0021:
            r5 = r14
        L_0x0022:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x0029
        L_0x0028:
            r6 = r15
        L_0x0029:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x002f
            r7 = r3
            goto L_0x0031
        L_0x002f:
            r7 = r16
        L_0x0031:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0037
            r8 = r3
            goto L_0x0039
        L_0x0037:
            r8 = r17
        L_0x0039:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r3 = r18
        L_0x0040:
            r11 = r9
            r12 = r10
            r13 = r1
            r14 = r2
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p671xj.C18774d.<init>(android.view.View, xj.d$a, int, int, java.lang.String, ue1.a, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

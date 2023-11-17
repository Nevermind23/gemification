package p341ge.bog.designsystem.components.checkbox;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.view.C0267d;
import androidx.appcompat.widget.C0418e;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.widget.C1314o;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import he1.C41224m;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p045d.C5769a;
import p601sg.C17777b;
import p601sg.C17779d;
import p601sg.C17780e;
import p601sg.C17786k;
import p601sg.C17787l;
import p616th.C17965a;
import p642vh.C18368l;

/* renamed from: ge.bog.designsystem.components.checkbox.CheckboxView */
public final class CheckboxView extends C0418e {

    /* renamed from: j */
    public static final C13221a f39028j = new C13221a((DefaultConstructorMarker) null);

    /* renamed from: k */
    private static final int[] f39029k = {C17777b.state_half_checked};

    /* renamed from: d */
    private boolean f39030d;

    /* renamed from: e */
    private boolean f39031e;

    /* renamed from: f */
    private C13224d f39032f;

    /* renamed from: g */
    private C41224m f39033g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C13223c f39034h;

    /* renamed from: i */
    private C13222b f39035i;

    /* renamed from: ge.bog.designsystem.components.checkbox.CheckboxView$a */
    public static final class C13221a {
        private C13221a() {
        }

        public /* synthetic */ C13221a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.checkbox.CheckboxView$b */
    public interface C13222b {
        /* renamed from: a */
        void mo27107a(CompoundButton compoundButton, boolean z, boolean z2);
    }

    /* renamed from: ge.bog.designsystem.components.checkbox.CheckboxView$c */
    public interface C13223c {
        /* renamed from: a */
        void mo27198a();
    }

    /* renamed from: ge.bog.designsystem.components.checkbox.CheckboxView$d */
    public enum C13224d {
        NORMAL(Integer.valueOf(C17786k.f49823N), Integer.valueOf(C17786k.TextBody1InvertComponents150Left), (Integer) null),
        SMALL_TEXT(Integer.valueOf(C17786k.f49828Y), Integer.valueOf(C17786k.TextBody2InvertComponents150Left), Integer.valueOf(C17786k.TextBody2Negative500Left));
        

        /* renamed from: g */
        public static final C13225a f39036g = null;

        /* renamed from: d */
        private final Integer f39040d;

        /* renamed from: e */
        private final Integer f39041e;

        /* renamed from: f */
        private final Integer f39042f;

        /* renamed from: ge.bog.designsystem.components.checkbox.CheckboxView$d$a */
        public static final class C13225a {
            private C13225a() {
            }

            public /* synthetic */ C13225a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C13224d mo35158a(int i) {
                C13224d dVar;
                C13224d[] values = C13224d.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        dVar = null;
                        break;
                    }
                    dVar = values[i2];
                    if (dVar.ordinal() == i) {
                        break;
                    }
                    i2++;
                }
                return dVar == null ? C13224d.NORMAL : dVar;
            }
        }

        static {
            f39036g = new C13225a((DefaultConstructorMarker) null);
        }

        private C13224d(Integer num, Integer num2, Integer num3) {
            this.f39040d = num;
            this.f39041e = num2;
            this.f39042f = num3;
        }

        /* renamed from: b */
        public final Integer mo35155b() {
            return this.f39041e;
        }

        /* renamed from: c */
        public final Integer mo35156c() {
            return this.f39042f;
        }

        /* renamed from: e */
        public final Integer mo35157e() {
            return this.f39040d;
        }
    }

    /* renamed from: ge.bog.designsystem.components.checkbox.CheckboxView$e */
    public /* synthetic */ class C13226e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39043a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ge.bog.designsystem.components.checkbox.CheckboxView$d[] r0 = p341ge.bog.designsystem.components.checkbox.CheckboxView.C13224d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.designsystem.components.checkbox.CheckboxView$d r1 = p341ge.bog.designsystem.components.checkbox.CheckboxView.C13224d.NORMAL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ge.bog.designsystem.components.checkbox.CheckboxView$d r1 = p341ge.bog.designsystem.components.checkbox.CheckboxView.C13224d.SMALL_TEXT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f39043a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.checkbox.CheckboxView.C13226e.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.designsystem.components.checkbox.CheckboxView$f */
    public static final class C13227f extends ClickableSpan {

        /* renamed from: d */
        final /* synthetic */ CheckboxView f39044d;

        C13227f(CheckboxView checkboxView) {
            this.f39044d = checkboxView;
        }

        public void onClick(View view) {
            C41536l.m120489i(view, "widget");
            this.f39044d.cancelPendingInputEvents();
            C13223c b = this.f39044d.f39034h;
            if (b != null) {
                b.mo27198a();
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            C41536l.m120489i(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.bgColor = 0;
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckboxView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: c */
    private final void m49728c(boolean z) {
        int i = C13226e.f39043a[this.f39032f.ordinal()];
        if (i == 1) {
            m49729d(z);
        } else if (i == 2) {
            if (this.f39033g == null) {
                m49729d(z);
            } else if (this.f39030d) {
                m49730e();
            } else if (z) {
                m49730e();
            } else {
                setText(getClickableTextWithoutSpans());
                m49729d(z);
            }
        }
    }

    /* renamed from: d */
    private final void m49729d(boolean z) {
        Integer num;
        if (this.f39030d) {
            num = this.f39032f.mo35156c();
        } else if (z) {
            num = this.f39032f.mo35157e();
        } else {
            num = this.f39032f.mo35155b();
        }
        if (num != null) {
            num.intValue();
            C1314o.m4575q(this, num.intValue());
        }
    }

    /* renamed from: e */
    private final void m49730e() {
        int i;
        int i2;
        C41224m mVar = this.f39033g;
        if (mVar != null) {
            String str = (String) mVar.mo95675a();
            String str2 = (String) mVar.mo95676b();
            String str3 = str + " " + str2 + "  ";
            Drawable b = C5769a.m23210b(getContext(), C17780e.f49651I);
            C41536l.m120486f(b);
            Resources resources = getResources();
            int i3 = C17779d.external_link_drawable_size;
            b.setBounds(0, 0, resources.getDimensionPixelSize(i3), getResources().getDimensionPixelSize(i3));
            Drawable r = C0836a.m3156r(b);
            Context context = getContext();
            C41536l.m120488h(context, "context");
            C0836a.m3152n(r, C18368l.m62755d(context, C17777b.f49603w));
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str3);
            Context context2 = getContext();
            if (this.f39030d) {
                i = C17786k.TextBody2Negative500Left;
            } else {
                i = C17786k.f49828Y;
            }
            valueOf.setSpan(new TextAppearanceSpan(context2, i), 0, str.length(), 33);
            valueOf.setSpan(getClickableSpan(), C40440x.m117156X(str3, str2, 0, false, 6, (Object) null), str3.length(), 33);
            Context context3 = getContext();
            if (this.f39030d) {
                i2 = C17786k.TextBody2Negative500Left;
            } else {
                i2 = C17786k.f49829b0;
            }
            valueOf.setSpan(new TextAppearanceSpan(context3, i2), C40440x.m117156X(str3, str2, 0, false, 6, (Object) null), str3.length() - 2, 33);
            valueOf.setSpan(new C17965a(getResources().getDimensionPixelSize(C17779d.spacing_2)), str3.length() - 2, str3.length() - 1, 33);
            valueOf.setSpan(new ImageSpan(r, 1), str3.length() - 1, str3.length(), 17);
            setText(valueOf);
            setIncludeFontPadding(false);
            setMovementMethod(LinkMovementMethod.getInstance());
            setHighlightColor(0);
        }
    }

    private final ClickableSpan getClickableSpan() {
        return new C13227f(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (r1 == null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getClickableTextWithoutSpans() {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            he1.m r1 = r4.f39033g
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0026
            java.lang.Object r1 = r1.mo95678e()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0026
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " "
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            if (r1 != 0) goto L_0x0027
        L_0x0026:
            r1 = r2
        L_0x0027:
            r0.append(r1)
            he1.m r1 = r4.f39033g
            if (r1 == 0) goto L_0x0038
            java.lang.Object r1 = r1.mo95680f()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r2 = r1
        L_0x0038:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder()\n        …)\n            .toString()"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.checkbox.CheckboxView.getClickableTextWithoutSpans():java.lang.String");
    }

    /* renamed from: h */
    public static /* synthetic */ void m49731h(CheckboxView checkboxView, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        checkboxView.mo35145g(str, str2);
    }

    /* renamed from: f */
    public final boolean mo35144f() {
        return this.f39031e;
    }

    /* renamed from: g */
    public final void mo35145g(String str, String str2) {
        boolean z;
        C41536l.m120489i(str, "leadingText");
        if (str2 == null || C40439w.m117118v(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f39033g = C41233s.m119492a(str, str2);
            m49730e();
            return;
        }
        setText(str);
    }

    public final C13224d getType$design_system_release() {
        return this.f39032f;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        if (mo35144f()) {
            int[] iArr = f39029k;
            int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
            View.mergeDrawableStates(onCreateDrawableState, iArr);
            C41536l.m120488h(onCreateDrawableState, "{\n            val drawab… drawableStates\n        }");
            return onCreateDrawableState;
        }
        int[] onCreateDrawableState2 = super.onCreateDrawableState(i);
        C41536l.m120488h(onCreateDrawableState2, "super.onCreateDrawableState(extraSpace)");
        return onCreateDrawableState2;
    }

    public void setChecked(boolean z) {
        this.f39031e = false;
        if (isChecked() == z) {
            refreshDrawableState();
        } else {
            super.setChecked(z);
        }
        if (z) {
            setError(false);
        }
        C13222b bVar = this.f39035i;
        if (bVar != null) {
            bVar.mo27107a(this, z, mo35144f());
        }
    }

    public void setEnabled(boolean z) {
        setError(false);
        m49728c(z);
        super.setEnabled(z);
    }

    public final void setError(boolean z) {
        this.f39030d = z;
        m49728c(isEnabled());
    }

    public final void setHalfChecked(boolean z) {
        this.f39031e = z;
        if (z) {
            super.setChecked(false);
            setError(false);
        }
        refreshDrawableState();
        C13222b bVar = this.f39035i;
        if (bVar != null) {
            bVar.mo27107a(this, isChecked(), this.f39031e);
        }
    }

    public final void setOnCheckedStateChangeListener(C13222b bVar) {
        C41536l.m120489i(bVar, "listener");
        this.f39035i = bVar;
    }

    public final void setTextClickListener(C13223c cVar) {
        C41536l.m120489i(cVar, "listener");
        this.f39034h = cVar;
    }

    public final void setType$design_system_release(C13224d dVar) {
        C41536l.m120489i(dVar, C11755a.C11756a.f34100b);
        this.f39032f = dVar;
        m49728c(isEnabled());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckboxView(Context context, AttributeSet attributeSet) {
        super(new C0267d(context, C17786k.CheckboxStyle), attributeSet, C17777b.f49592a);
        C41536l.m120489i(context, "context");
        C13224d dVar = C13224d.NORMAL;
        this.f39032f = dVar;
        int[] iArr = C17787l.f49948H2;
        C41536l.m120488h(iArr, "CheckboxView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setType$design_system_release(C13224d.f39036g.mo35158a(obtainStyledAttributes.getInt(C17787l.f49963I2, dVar.ordinal())));
        setHalfChecked(obtainStyledAttributes.getBoolean(C17787l.f49978J2, false));
        m49728c(isEnabled());
        obtainStyledAttributes.recycle();
    }
}

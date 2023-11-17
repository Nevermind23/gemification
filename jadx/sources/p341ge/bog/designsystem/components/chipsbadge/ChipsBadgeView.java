package p341ge.bog.designsystem.components.chipsbadge;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0767a;
import androidx.core.widget.C1314o;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C9958l2;
import p601sg.C17777b;
import p601sg.C17778c;
import p601sg.C17779d;
import p601sg.C17780e;
import p601sg.C17785j;
import p601sg.C17786k;
import p642vh.C18368l;

/* renamed from: ge.bog.designsystem.components.chipsbadge.ChipsBadgeView */
public final class ChipsBadgeView extends LayerView {

    /* renamed from: d */
    private final C9958l2 f39097d;

    /* renamed from: ge.bog.designsystem.components.chipsbadge.ChipsBadgeView$a */
    public static abstract class C13241a {

        /* renamed from: ge.bog.designsystem.components.chipsbadge.ChipsBadgeView$a$a */
        public static final class C13242a extends C13241a {

            /* renamed from: a */
            private final String f39098a;

            /* renamed from: b */
            private final int f39099b;

            /* renamed from: c */
            private final Integer f39100c;

            /* renamed from: d */
            private final Color.Resource f39101d = new Color.Resource(C17778c.color_brand_retail_se_tr_300);

            /* renamed from: e */
            private final int f39102e;

            /* renamed from: f */
            private final Color.Attribute f39103f;

            /* renamed from: g */
            private final int f39104g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13242a(String str) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(str, "text");
                this.f39098a = str;
                int i = C17786k.f49837x0;
                this.f39099b = i;
                this.f39102e = i;
                this.f39103f = new Color.Attribute(C17777b.f49590A);
                this.f39104g = C17785j.f49818t;
            }

            /* renamed from: b */
            public Integer mo35219b() {
                return this.f39100c;
            }

            /* renamed from: c */
            public Integer mo35220c() {
                return Integer.valueOf(this.f39104g);
            }

            /* renamed from: e */
            public int mo35222e() {
                return this.f39102e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13242a) && C41536l.m120484d(mo35223f(), ((C13242a) obj).mo35223f());
            }

            /* renamed from: f */
            public String mo35223f() {
                return this.f39098a;
            }

            /* renamed from: g */
            public int mo35224g() {
                return this.f39099b;
            }

            /* renamed from: h */
            public Color.Resource mo35218a() {
                return this.f39101d;
            }

            public int hashCode() {
                return mo35223f().hashCode();
            }

            /* renamed from: i */
            public Color.Attribute mo35221d() {
                return this.f39103f;
            }

            public String toString() {
                String f = mo35223f();
                return "BNPL(text=" + f + ")";
            }
        }

        /* renamed from: ge.bog.designsystem.components.chipsbadge.ChipsBadgeView$a$b */
        public static final class C13243b extends C13241a {

            /* renamed from: a */
            private final String f39105a;

            /* renamed from: b */
            private final int f39106b = C17786k.TextTitle3;

            /* renamed from: c */
            private final Integer f39107c;

            /* renamed from: d */
            private final Color.Resource f39108d = new Color.Resource(C17778c.f49620Z);

            /* renamed from: e */
            private final int f39109e = C17786k.f49837x0;

            /* renamed from: f */
            private final Color.Attribute f39110f = new Color.Attribute(C17777b.color_white_tr_200);

            /* renamed from: g */
            private final int f39111g = C17785j.cashback;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13243b(String str) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(str, "text");
                this.f39105a = str;
            }

            /* renamed from: b */
            public Integer mo35219b() {
                return this.f39107c;
            }

            /* renamed from: c */
            public Integer mo35220c() {
                return Integer.valueOf(this.f39111g);
            }

            /* renamed from: e */
            public int mo35222e() {
                return this.f39109e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13243b) && C41536l.m120484d(mo35223f(), ((C13243b) obj).mo35223f());
            }

            /* renamed from: f */
            public String mo35223f() {
                return this.f39105a;
            }

            /* renamed from: g */
            public int mo35224g() {
                return this.f39106b;
            }

            /* renamed from: h */
            public Color.Resource mo35218a() {
                return this.f39108d;
            }

            public int hashCode() {
                return mo35223f().hashCode();
            }

            /* renamed from: i */
            public Color.Attribute mo35221d() {
                return this.f39110f;
            }

            public String toString() {
                String f = mo35223f();
                return "Cashback(text=" + f + ")";
            }
        }

        /* renamed from: ge.bog.designsystem.components.chipsbadge.ChipsBadgeView$a$c */
        public static final class C13244c extends C13241a {

            /* renamed from: a */
            private final String f39112a;

            /* renamed from: b */
            private final int f39113b;

            /* renamed from: c */
            private final int f39114c = C17780e.f49669s;

            /* renamed from: d */
            private final Color.Attribute f39115d = new Color.Attribute(C17777b.f49603w);

            /* renamed from: e */
            private final int f39116e;

            /* renamed from: f */
            private final Color.Attribute f39117f;

            /* renamed from: g */
            private final Integer f39118g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13244c(String str) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(str, "text");
                this.f39112a = str;
                int i = C17786k.TextTitle3;
                this.f39113b = i;
                this.f39116e = i;
                this.f39117f = new Color.Attribute(C17777b.f49590A);
            }

            /* renamed from: b */
            public Integer mo35219b() {
                return Integer.valueOf(this.f39114c);
            }

            /* renamed from: c */
            public Integer mo35220c() {
                return this.f39118g;
            }

            /* renamed from: e */
            public int mo35222e() {
                return this.f39116e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13244c) && C41536l.m120484d(mo35223f(), ((C13244c) obj).mo35223f());
            }

            /* renamed from: f */
            public String mo35223f() {
                return this.f39112a;
            }

            /* renamed from: g */
            public int mo35224g() {
                return this.f39113b;
            }

            /* renamed from: h */
            public Color.Attribute mo35218a() {
                return this.f39115d;
            }

            public int hashCode() {
                return mo35223f().hashCode();
            }

            /* renamed from: i */
            public Color.Attribute mo35221d() {
                return this.f39117f;
            }

            public String toString() {
                String f = mo35223f();
                return "Gift(text=" + f + ")";
            }
        }

        /* renamed from: ge.bog.designsystem.components.chipsbadge.ChipsBadgeView$a$d */
        public static final class C13245d extends C13241a {

            /* renamed from: a */
            private final String f39119a;

            /* renamed from: b */
            private final int f39120b = C17786k.TextTitle3;

            /* renamed from: c */
            private final int f39121c = C17780e.f49667q;

            /* renamed from: d */
            private final Color.Resource f39122d = new Color.Resource(C17778c.f49621a0);

            /* renamed from: e */
            private final int f39123e = C17786k.f49837x0;

            /* renamed from: f */
            private final Color.Attribute f39124f = new Color.Attribute(C17777b.color_white_tr_200);

            /* renamed from: g */
            private final int f39125g = C17785j.installment;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13245d(String str) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(str, "text");
                this.f39119a = str;
            }

            /* renamed from: b */
            public Integer mo35219b() {
                return Integer.valueOf(this.f39121c);
            }

            /* renamed from: c */
            public Integer mo35220c() {
                return Integer.valueOf(this.f39125g);
            }

            /* renamed from: e */
            public int mo35222e() {
                return this.f39123e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13245d) && C41536l.m120484d(mo35223f(), ((C13245d) obj).mo35223f());
            }

            /* renamed from: f */
            public String mo35223f() {
                return this.f39119a;
            }

            /* renamed from: g */
            public int mo35224g() {
                return this.f39120b;
            }

            /* renamed from: h */
            public Color.Resource mo35218a() {
                return this.f39122d;
            }

            public int hashCode() {
                return mo35223f().hashCode();
            }

            /* renamed from: i */
            public Color.Attribute mo35221d() {
                return this.f39124f;
            }

            public String toString() {
                String f = mo35223f();
                return "Installment(text=" + f + ")";
            }
        }

        /* renamed from: ge.bog.designsystem.components.chipsbadge.ChipsBadgeView$a$e */
        public static final class C13246e extends C13241a {

            /* renamed from: a */
            private final String f39126a;

            /* renamed from: b */
            private final int f39127b;

            /* renamed from: c */
            private final int f39128c = C17780e.icons_36_mr_white;

            /* renamed from: d */
            private final Color.Resource f39129d = new Color.Resource(C17778c.color_brand_mr_tr_400);

            /* renamed from: e */
            private final int f39130e;

            /* renamed from: f */
            private final Color.Attribute f39131f;

            /* renamed from: g */
            private final Integer f39132g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13246e(String str) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(str, "text");
                this.f39126a = str;
                int i = C17786k.TextTitle3;
                this.f39127b = i;
                this.f39130e = i;
                this.f39131f = new Color.Attribute(C17777b.f49590A);
            }

            /* renamed from: b */
            public Integer mo35219b() {
                return Integer.valueOf(this.f39128c);
            }

            /* renamed from: c */
            public Integer mo35220c() {
                return this.f39132g;
            }

            /* renamed from: e */
            public int mo35222e() {
                return this.f39130e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13246e) && C41536l.m120484d(mo35223f(), ((C13246e) obj).mo35223f());
            }

            /* renamed from: f */
            public String mo35223f() {
                return this.f39126a;
            }

            /* renamed from: g */
            public int mo35224g() {
                return this.f39127b;
            }

            /* renamed from: h */
            public Color.Resource mo35218a() {
                return this.f39129d;
            }

            public int hashCode() {
                return mo35223f().hashCode();
            }

            /* renamed from: i */
            public Color.Attribute mo35221d() {
                return this.f39131f;
            }

            public String toString() {
                String f = mo35223f();
                return "MR(text=" + f + ")";
            }
        }

        /* renamed from: ge.bog.designsystem.components.chipsbadge.ChipsBadgeView$a$f */
        public static final class C13247f extends C13241a {

            /* renamed from: a */
            private final String f39133a;

            /* renamed from: b */
            private final int f39134b;

            /* renamed from: c */
            private final int f39135c = C17780e.icons_36_plus_white;

            /* renamed from: d */
            private final Color.Resource f39136d = new Color.Resource(C17778c.color_support_first_solid_df_500);

            /* renamed from: e */
            private final int f39137e;

            /* renamed from: f */
            private final Color.Attribute f39138f;

            /* renamed from: g */
            private final Integer f39139g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13247f(String str) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(str, "text");
                this.f39133a = str;
                int i = C17786k.TextTitle3;
                this.f39134b = i;
                this.f39137e = i;
                this.f39138f = new Color.Attribute(C17777b.f49590A);
            }

            /* renamed from: b */
            public Integer mo35219b() {
                return Integer.valueOf(this.f39135c);
            }

            /* renamed from: c */
            public Integer mo35220c() {
                return this.f39139g;
            }

            /* renamed from: e */
            public int mo35222e() {
                return this.f39137e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13247f) && C41536l.m120484d(mo35223f(), ((C13247f) obj).mo35223f());
            }

            /* renamed from: f */
            public String mo35223f() {
                return this.f39133a;
            }

            /* renamed from: g */
            public int mo35224g() {
                return this.f39134b;
            }

            /* renamed from: h */
            public Color.Resource mo35218a() {
                return this.f39136d;
            }

            public int hashCode() {
                return mo35223f().hashCode();
            }

            /* renamed from: i */
            public Color.Attribute mo35221d() {
                return this.f39138f;
            }

            public String toString() {
                String f = mo35223f();
                return "Plus(text=" + f + ")";
            }
        }

        /* renamed from: ge.bog.designsystem.components.chipsbadge.ChipsBadgeView$a$g */
        public static final class C13248g extends C13241a {

            /* renamed from: a */
            private final String f39140a;

            /* renamed from: b */
            private final int f39141b = C17786k.TextTitle3;

            /* renamed from: c */
            private final Integer f39142c;

            /* renamed from: d */
            private final Color.Attribute f39143d = new Color.Attribute(C17777b.f49603w);

            /* renamed from: e */
            private final int f39144e = C17786k.f49837x0;

            /* renamed from: f */
            private final Color.Attribute f39145f = new Color.Attribute(C17777b.color_white_tr_200);

            /* renamed from: g */
            private final int f39146g = C17785j.sale;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13248g(String str) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(str, "text");
                this.f39140a = str;
            }

            /* renamed from: b */
            public Integer mo35219b() {
                return this.f39142c;
            }

            /* renamed from: c */
            public Integer mo35220c() {
                return Integer.valueOf(this.f39146g);
            }

            /* renamed from: e */
            public int mo35222e() {
                return this.f39144e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13248g) && C41536l.m120484d(mo35223f(), ((C13248g) obj).mo35223f());
            }

            /* renamed from: f */
            public String mo35223f() {
                return this.f39140a;
            }

            /* renamed from: g */
            public int mo35224g() {
                return this.f39141b;
            }

            /* renamed from: h */
            public Color.Attribute mo35218a() {
                return this.f39143d;
            }

            public int hashCode() {
                return mo35223f().hashCode();
            }

            /* renamed from: i */
            public Color.Attribute mo35221d() {
                return this.f39145f;
            }

            public String toString() {
                String f = mo35223f();
                return "Sale(text=" + f + ")";
            }
        }

        private C13241a() {
        }

        public /* synthetic */ C13241a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public abstract Color mo35218a();

        /* renamed from: b */
        public abstract Integer mo35219b();

        /* renamed from: c */
        public abstract Integer mo35220c();

        /* renamed from: d */
        public abstract Color mo35221d();

        /* renamed from: e */
        public abstract int mo35222e();

        /* renamed from: f */
        public abstract String mo35223f();

        /* renamed from: g */
        public abstract int mo35224g();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ChipsBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    private final void setBadgeBackgroundColor(int i) {
        GradientDrawable gradientDrawable;
        Drawable background = getBackground();
        if (background instanceof GradientDrawable) {
            gradientDrawable = (GradientDrawable) background;
        } else {
            gradientDrawable = null;
        }
        if (gradientDrawable != null) {
            gradientDrawable.mutate();
            gradientDrawable.setColor(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(C17779d.chips_badge_height), 1073741824));
    }

    public final void setBadgeType(C13241a aVar) {
        String str;
        C41536l.m120489i(aVar, "badgeType");
        Integer c = aVar.mo35220c();
        if (c == null || (str = getContext().getString(c.intValue())) == null) {
            str = aVar.mo35223f();
        }
        C41536l.m120488h(str, "badgeType.rightText?.let…g(it) } ?: badgeType.text");
        if (aVar.mo35219b() != null) {
            this.f39097d.f27236f.setVisibility(8);
            this.f39097d.f27235e.setVisibility(0);
            ImageView imageView = this.f39097d.f27235e;
            Integer b = aVar.mo35219b();
            if (b != null) {
                imageView.setImageResource(b.intValue());
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            this.f39097d.f27236f.setVisibility(0);
            this.f39097d.f27235e.setVisibility(8);
            this.f39097d.f27236f.setText(aVar.mo35223f());
        }
        Color a = aVar.mo35218a();
        Context context = getContext();
        C41536l.m120488h(context, "context");
        setBadgeBackgroundColor(a.mo35260a(context));
        C1314o.m4575q(this.f39097d.f27236f, aVar.mo35224g());
        C1314o.m4575q(this.f39097d.f27237g, aVar.mo35222e());
        AppCompatTextView appCompatTextView = this.f39097d.f27237g;
        Color d = aVar.mo35221d();
        Context context2 = appCompatTextView.getContext();
        C41536l.m120488h(context2, "context");
        appCompatTextView.setTextColor(d.mo35260a(context2));
        C41536l.m120488h(appCompatTextView, "setBadgeType$lambda$1");
        C18368l.m62751F(appCompatTextView, !C40439w.m117118v(str), false, 2, (Object) null);
        appCompatTextView.setText(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChipsBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChipsBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C9958l2 c = C9958l2.m36524c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f39097d = c;
        setBackground(C0767a.m2895e(context, C17780e.shape_chips_badge));
        if (isInEditMode()) {
            setBadgeType(new C13241a.C13248g("20%"));
        }
    }
}

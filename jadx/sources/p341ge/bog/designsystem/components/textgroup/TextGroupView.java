package p341ge.bog.designsystem.components.textgroup;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0767a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C10007r5;
import p601sg.C17777b;
import p601sg.C17778c;
import p601sg.C17780e;
import p601sg.C17787l;
import p642vh.C18352d;
import p642vh.C18355e0;
import p642vh.C18377p;
import p642vh.C18379r;
import ue1.C43064a;

/* renamed from: ge.bog.designsystem.components.textgroup.TextGroupView */
public final class TextGroupView extends LayerView {

    /* renamed from: k */
    static final /* synthetic */ C40303i[] f40384k;

    /* renamed from: d */
    private final C10007r5 f40385d;

    /* renamed from: e */
    private final C18379r f40386e;

    /* renamed from: f */
    private final C18352d f40387f;

    /* renamed from: g */
    private final C18377p f40388g;

    /* renamed from: h */
    private final C18355e0 f40389h;

    /* renamed from: i */
    private final C18355e0 f40390i;

    /* renamed from: j */
    private boolean f40391j;

    /* renamed from: ge.bog.designsystem.components.textgroup.TextGroupView$b */
    public enum C13525b {
        NEUTRAL(new C13524a(new Color.Attribute(C17777b.f49597m), (Integer) null, 2, (DefaultConstructorMarker) null)),
        POSITIVE(new C13524a(new Color.Resource(C17778c.f49617S), Integer.valueOf(C17780e.shape_text_group_positive))),
        NEGATIVE(new C13524a(new Color.Resource(C17778c.f49605C), Integer.valueOf(C17780e.shape_text_group_negative)));
        

        /* renamed from: e */
        public static final C13526a f40394e = null;

        /* renamed from: d */
        private final C13524a f40399d;

        /* renamed from: ge.bog.designsystem.components.textgroup.TextGroupView$b$a */
        public static final class C13526a {
            private C13526a() {
            }

            public /* synthetic */ C13526a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C13525b mo36858a(int i) {
                C13525b bVar;
                boolean z;
                C13525b[] values = C13525b.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        bVar = null;
                        break;
                    }
                    bVar = values[i2];
                    if (bVar.ordinal() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    i2++;
                }
                if (bVar == null) {
                    return C13525b.NEUTRAL;
                }
                return bVar;
            }
        }

        static {
            f40394e = new C13526a((DefaultConstructorMarker) null);
        }

        private C13525b(C13524a aVar) {
            this.f40399d = aVar;
        }

        /* renamed from: b */
        public final C13524a mo36857b() {
            return this.f40399d;
        }
    }

    static {
        Class<TextGroupView> cls = TextGroupView.class;
        f40384k = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "iconTint", "getIconTint()Lge/bog/designsystem/components/common/Color;", 0)), C41520a0.m120439e(new C41539o(cls, "bgDrawable", "getBgDrawable()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "iconResId", "getIconResId()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "bottomTitle", "getBottomTitle()Ljava/lang/CharSequence;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TextGroupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    private final Drawable getBgDrawable() {
        return this.f40387f.getValue(this, f40384k[1]);
    }

    private final Color getIconTint() {
        return this.f40386e.getValue(this, f40384k[0]);
    }

    private final void setBgDrawable(Drawable drawable) {
        this.f40387f.setValue(this, f40384k[1], drawable);
    }

    private final void setIconTint(Color color) {
        this.f40386e.setValue(this, f40384k[0], color);
    }

    /* renamed from: a */
    public final boolean mo36844a() {
        return this.f40391j;
    }

    public final CharSequence getBottomTitle() {
        return this.f40390i.getValue(this, f40384k[4]);
    }

    public final Integer getIconResId() {
        return this.f40388g.getValue(this, f40384k[2]);
    }

    public final CharSequence getTitle() {
        return this.f40389h.getValue(this, f40384k[3]);
    }

    public final void setActive(boolean z) {
        if (z != this.f40391j) {
            this.f40385d.f27485f.setSelected(z);
            this.f40391j = z;
        }
    }

    public final void setBottomTitle(CharSequence charSequence) {
        this.f40390i.setValue(this, f40384k[4], charSequence);
    }

    public final void setIconResId(Integer num) {
        this.f40388g.setValue(this, f40384k[2], num);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f40389h.setValue(this, f40384k[3], charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextGroupView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: ge.bog.designsystem.components.textgroup.TextGroupView$a */
    public static final class C13524a {

        /* renamed from: a */
        private final Color f40392a;

        /* renamed from: b */
        private final Integer f40393b;

        public C13524a(Color color, Integer num) {
            this.f40392a = color;
            this.f40393b = num;
        }

        /* renamed from: a */
        public final Integer mo36852a() {
            return this.f40393b;
        }

        /* renamed from: b */
        public final Color mo36853b() {
            return this.f40392a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13524a)) {
                return false;
            }
            C13524a aVar = (C13524a) obj;
            return C41536l.m120484d(this.f40392a, aVar.f40392a) && C41536l.m120484d(this.f40393b, aVar.f40393b);
        }

        public int hashCode() {
            Color color = this.f40392a;
            int i = 0;
            int hashCode = (color == null ? 0 : color.hashCode()) * 31;
            Integer num = this.f40393b;
            if (num != null) {
                i = num.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            Color color = this.f40392a;
            Integer num = this.f40393b;
            return "Config(tint=" + color + ", bgDrawable=" + num + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C13524a(Color color, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : color, (i & 2) != 0 ? null : num);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C10007r5 d = C10007r5.m36704d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f40385d = d;
        ImageView imageView = d.f27486g;
        C41536l.m120488h(imageView, "binding.iconImage");
        this.f40386e = new C18379r(imageView);
        LinearLayout linearLayout = d.f27485f;
        C41536l.m120488h(linearLayout, "binding.backgroundLayout");
        this.f40387f = new C18352d(linearLayout);
        ImageView imageView2 = d.f27486g;
        C41536l.m120488h(imageView2, "binding.iconImage");
        this.f40388g = new C18377p(imageView2);
        TextView textView = d.f27487h;
        C41536l.m120488h(textView, "binding.titleText");
        this.f40389h = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView2 = d.f27484e;
        C41536l.m120488h(textView2, "binding.amountText");
        this.f40390i = new C18355e0(textView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        int[] iArr = C17787l.f50515rc;
        C41536l.m120488h(iArr, "TextGroupView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        String string = obtainStyledAttributes.getString(C17787l.f50578vc);
        String str = "";
        setTitle(string == null ? str : string);
        String string2 = obtainStyledAttributes.getString(C17787l.f50563uc);
        setBottomTitle(string2 != null ? string2 : str);
        setIconResId(Integer.valueOf(obtainStyledAttributes.getResourceId(C17787l.f50531sc, 0)));
        C13524a b = C13525b.f40394e.mo36858a(obtainStyledAttributes.getInt(C17787l.f50547tc, C13525b.NEUTRAL.ordinal())).mo36857b();
        Color b2 = b.mo36853b();
        if (b2 != null) {
            setIconTint(b2);
        }
        Integer a = b.mo36852a();
        if (a != null) {
            setBgDrawable(C0767a.m2895e(context2, a.intValue()));
        }
        obtainStyledAttributes.recycle();
    }
}

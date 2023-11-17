package p697zh;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p352ak.C9879b3;
import p601sg.C17780e;
import p601sg.C17787l;
import p642vh.C18355e0;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: zh.c */
public final class C19025c extends LinearLayout {

    /* renamed from: g */
    static final /* synthetic */ C40303i[] f53148g = {C41520a0.m120439e(new C41539o(C19025c.class, "text", "getText()Ljava/lang/CharSequence;", 0))};

    /* renamed from: d */
    private final C9879b3 f53149d;

    /* renamed from: e */
    private final C18355e0 f53150e;

    /* renamed from: f */
    private C19026a f53151f;

    /* renamed from: zh.c$a */
    public enum C19026a {
        POSITIVE(new Image.Resource(C17780e.icons_10_system_check, (Boolean) null, 2, (DefaultConstructorMarker) null)),
        NEGATIVE(new Image.Resource(C17780e.icons_10_system_close, (Boolean) null, 2, (DefaultConstructorMarker) null));
        

        /* renamed from: e */
        public static final C19027a f53152e = null;

        /* renamed from: d */
        private final Image.Resource f53156d;

        /* renamed from: zh.c$a$a */
        public static final class C19027a {
            private C19027a() {
            }

            public /* synthetic */ C19027a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C19026a mo47213a(int i) {
                for (C19026a aVar : C19026a.values()) {
                    if (aVar.ordinal() == i) {
                        return aVar;
                    }
                }
                return null;
            }
        }

        static {
            f53152e = new C19027a((DefaultConstructorMarker) null);
        }

        private C19026a(Image.Resource resource) {
            this.f53156d = resource;
        }

        /* renamed from: b */
        public final Image.Resource mo47212b() {
            return this.f53156d;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19025c(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    private final void m64299a(C19026a aVar) {
        ImageView imageView = this.f53149d.f26809e;
        C41536l.m120488h(imageView, "binding.iconImage");
        C18368l.m62746A(imageView, aVar.mo47212b(), (C43075l) null, 2, (Object) null);
    }

    public final CharSequence getText() {
        return this.f53150e.getValue(this, f53148g[0]);
    }

    public final C19026a getType() {
        return this.f53151f;
    }

    public final void setText(CharSequence charSequence) {
        this.f53150e.setValue(this, f53148g[0], charSequence);
    }

    public final void setType(C19026a aVar) {
        C41536l.m120489i(aVar, C11755a.C11756a.f34100b);
        this.f53151f = aVar;
        m64299a(aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19025c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C9879b3 c = C9879b3.m36237c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(\n        LayoutI…from(context), this\n    )");
        this.f53149d = c;
        TextView textView = c.f26810f;
        C41536l.m120488h(textView, "binding.titleText");
        this.f53150e = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        C19026a aVar = C19026a.POSITIVE;
        this.f53151f = aVar;
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        int[] iArr = C17787l.f50363i4;
        C41536l.m120488h(iArr, "DepositHighlightsView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setText(obtainStyledAttributes.getString(C17787l.f50379j4));
        C19026a a = C19026a.f53152e.mo47213a(obtainStyledAttributes.getInt(C17787l.f50395k4, 0));
        setType(a != null ? a : aVar);
        obtainStyledAttributes.recycle();
    }
}

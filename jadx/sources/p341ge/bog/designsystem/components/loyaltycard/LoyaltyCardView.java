package p341ge.bog.designsystem.components.loyaltycard;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C10054y3;
import p601sg.C17779d;
import p601sg.C17780e;
import p601sg.C17786k;
import p601sg.C17787l;
import p642vh.C18355e0;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.loyaltycard.LoyaltyCardView */
public final class LoyaltyCardView extends LayerView {

    /* renamed from: j */
    static final /* synthetic */ C40303i[] f39785j;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C10054y3 f39786d;

    /* renamed from: e */
    private final C18355e0 f39787e;

    /* renamed from: f */
    private final C18355e0 f39788f;

    /* renamed from: g */
    private final C18355e0 f39789g;

    /* renamed from: h */
    private final C41555e f39790h;

    /* renamed from: i */
    private final C41555e f39791i;

    /* renamed from: ge.bog.designsystem.components.loyaltycard.LoyaltyCardView$a */
    public static final class C13378a {

        /* renamed from: a */
        private final Image f39792a;

        /* renamed from: b */
        private final Integer f39793b;

        public C13378a(Image image, Integer num) {
            C41536l.m120489i(image, "image");
            this.f39792a = image;
            this.f39793b = num;
        }

        /* renamed from: a */
        public final Image mo36144a() {
            return this.f39792a;
        }

        /* renamed from: b */
        public final Integer mo36145b() {
            return this.f39793b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13378a)) {
                return false;
            }
            C13378a aVar = (C13378a) obj;
            return C41536l.m120484d(this.f39792a, aVar.f39792a) && C41536l.m120484d(this.f39793b, aVar.f39793b);
        }

        public int hashCode() {
            int hashCode = this.f39792a.hashCode() * 31;
            Integer num = this.f39793b;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            Image image = this.f39792a;
            Integer num = this.f39793b;
            return "LoyaltyCardLogo(image=" + image + ", width=" + num + ")";
        }
    }

    /* renamed from: ge.bog.designsystem.components.loyaltycard.LoyaltyCardView$b */
    public enum C13379b {
        SINGLE(r2, r2),
        MULTIPLE(C17779d.spacing_12, C17779d.f49644Q1);
        

        /* renamed from: f */
        public static final C13380a f39794f = null;

        /* renamed from: d */
        private final int f39798d;

        /* renamed from: e */
        private final int f39799e;

        /* renamed from: ge.bog.designsystem.components.loyaltycard.LoyaltyCardView$b$a */
        public static final class C13380a {
            private C13380a() {
            }

            public /* synthetic */ C13380a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C13379b mo36151a(int i) {
                return C13379b.values()[i];
            }
        }

        static {
            f39794f = new C13380a((DefaultConstructorMarker) null);
        }

        private C13379b(int i, int i2) {
            this.f39798d = i;
            this.f39799e = i2;
        }

        /* renamed from: b */
        public final int mo36149b() {
            return this.f39799e;
        }

        /* renamed from: c */
        public final int mo36150c() {
            return this.f39798d;
        }
    }

    /* renamed from: ge.bog.designsystem.components.loyaltycard.LoyaltyCardView$c */
    public static final class C13381c extends C41553c {

        /* renamed from: a */
        final /* synthetic */ LoyaltyCardView f39800a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13381c(Object obj, LoyaltyCardView loyaltyCardView) {
            super(obj);
            this.f39800a = loyaltyCardView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            Image image;
            int i;
            Integer b;
            C41536l.m120489i(iVar, "property");
            C13378a aVar = (C13378a) obj2;
            if (!C41536l.m120484d((C13378a) obj, aVar)) {
                ImageView imageView = this.f39800a.f39786d.f27776f;
                C41536l.m120488h(imageView, "binding.logo");
                if (aVar != null) {
                    image = aVar.mo36144a();
                } else {
                    image = null;
                }
                C18368l.m62746A(imageView, image, (C43075l) null, 2, (Object) null);
                ImageView imageView2 = this.f39800a.f39786d.f27776f;
                C41536l.m120488h(imageView2, "binding.logo");
                ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.C0620b bVar = (ConstraintLayout.C0620b) layoutParams;
                    if (aVar == null || (b = aVar.mo36145b()) == null) {
                        i = -2;
                    } else {
                        i = b.intValue();
                    }
                    bVar.width = i;
                    bVar.height = this.f39800a.getResources().getDimensionPixelSize(C17779d.loyalty_card_logo_height);
                    imageView2.setLayoutParams(bVar);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.loyaltycard.LoyaltyCardView$d */
    public static final class C13382d extends C41553c {

        /* renamed from: a */
        final /* synthetic */ LoyaltyCardView f39801a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13382d(Object obj, LoyaltyCardView loyaltyCardView) {
            super(obj);
            this.f39801a = loyaltyCardView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C13379b bVar = (C13379b) obj2;
            if (((C13379b) obj) != bVar) {
                this.f39801a.setLoyaltyCardType(bVar);
            }
        }
    }

    static {
        Class<LoyaltyCardView> cls = LoyaltyCardView.class;
        f39785j = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "description", "getDescription()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "logo", "getLogo()Lge/bog/designsystem/components/loyaltycard/LoyaltyCardView$LoyaltyCardLogo;", 0)), C41520a0.m120439e(new C41539o(cls, "type", "getType()Lge/bog/designsystem/components/loyaltycard/LoyaltyCardView$LoyaltyCardType;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LoyaltyCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    public final void setLoyaltyCardType(C13379b bVar) {
        TextView textView = this.f39786d.f27778h;
        C41536l.m120488h(textView, "setLoyaltyCardType$lambda$5");
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.C0620b bVar2 = (ConstraintLayout.C0620b) layoutParams;
            bVar2.setMarginStart(textView.getResources().getDimensionPixelSize(bVar.mo36150c()));
            bVar2.setMarginEnd(textView.getResources().getDimensionPixelSize(bVar.mo36149b()));
            textView.setLayoutParams(bVar2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public final CharSequence getDescription() {
        return this.f39789g.getValue(this, f39785j[2]);
    }

    public final C13378a getLogo() {
        return (C13378a) this.f39790h.getValue(this, f39785j[3]);
    }

    public final CharSequence getText() {
        return this.f39788f.getValue(this, f39785j[1]);
    }

    public final CharSequence getTitle() {
        return this.f39787e.getValue(this, f39785j[0]);
    }

    public final C13379b getType() {
        return (C13379b) this.f39791i.getValue(this, f39785j[4]);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), getResources().getDimensionPixelSize(C17779d.loyalty_card_height));
    }

    public final void setDescription(CharSequence charSequence) {
        this.f39789g.setValue(this, f39785j[2], charSequence);
    }

    public final void setLogo(C13378a aVar) {
        this.f39790h.setValue(this, f39785j[3], aVar);
    }

    public final void setText(CharSequence charSequence) {
        this.f39788f.setValue(this, f39785j[1], charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f39787e.setValue(this, f39785j[0], charSequence);
    }

    public final void setType(C13379b bVar) {
        C41536l.m120489i(bVar, "<set-?>");
        this.f39791i.setValue(this, f39785j[4], bVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoyaltyCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C10054y3 d = C10054y3.m36878d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f39786d = d;
        TextView textView = d.f27778h;
        C41536l.m120488h(textView, "binding.title");
        this.f39787e = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView2 = d.f27777g;
        C41536l.m120488h(textView2, "binding.text");
        this.f39788f = new C18355e0(textView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView3 = d.f27775e;
        C41536l.m120488h(textView3, "binding.description");
        this.f39789g = new C18355e0(textView3, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        C41551a aVar = C41551a.f97718a;
        Integer num = null;
        this.f39790h = new C13381c((Object) null, this);
        this.f39791i = new C13382d(C13379b.SINGLE, this);
        setLayerStyle(C17786k.f49834t);
        setBackgroundResource(C17780e.selector_loyalty_card);
        int[] iArr = C17787l.f49923F7;
        C41536l.m120488h(iArr, "LoyaltyCardView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        String string = obtainStyledAttributes.getString(C17787l.f50013L7);
        String str = "";
        setTitle(string == null ? str : string);
        String string2 = obtainStyledAttributes.getString(C17787l.f49998K7);
        setText(string2 == null ? str : string2);
        String string3 = obtainStyledAttributes.getString(C17787l.f49938G7);
        setDescription(string3 != null ? string3 : str);
        int resourceId = obtainStyledAttributes.getResourceId(C17787l.f49953H7, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C17787l.f49968I7, 0);
        if (resourceId != 0) {
            setLogo(new C13378a(new Image.Resource(resourceId, (Boolean) null, 2, (DefaultConstructorMarker) null), dimensionPixelSize != 0 ? Integer.valueOf(dimensionPixelSize) : num));
        }
        setType(C13379b.f39794f.mo36151a(obtainStyledAttributes.getInt(C17787l.f49983J7, 0)));
        obtainStyledAttributes.recycle();
    }
}

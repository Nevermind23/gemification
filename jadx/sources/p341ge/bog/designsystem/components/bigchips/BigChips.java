package p341ge.bog.designsystem.components.bigchips;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.C2394j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p035c4.C2247a;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C10044x0;
import p601sg.C17777b;
import p601sg.C17779d;
import p601sg.C17780e;
import p601sg.C17787l;
import p642vh.C18355e0;
import p642vh.C18365j0;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.bigchips.BigChips */
public final class BigChips extends ConstraintLayout {

    /* renamed from: j */
    static final /* synthetic */ C40303i[] f38842j;

    /* renamed from: d */
    private final C10044x0 f38843d;

    /* renamed from: e */
    private final C41555e f38844e;

    /* renamed from: f */
    private final C41555e f38845f;

    /* renamed from: g */
    private final C18355e0 f38846g;

    /* renamed from: h */
    private final C18365j0 f38847h;

    /* renamed from: i */
    private Image f38848i;

    /* renamed from: ge.bog.designsystem.components.bigchips.BigChips$a */
    public enum C13169a {
        ICON,
        FILLED,
        LOGO
    }

    /* renamed from: ge.bog.designsystem.components.bigchips.BigChips$b */
    public /* synthetic */ class C13170b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38853a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ge.bog.designsystem.components.bigchips.BigChips$a[] r0 = p341ge.bog.designsystem.components.bigchips.BigChips.C13169a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.designsystem.components.bigchips.BigChips$a r1 = p341ge.bog.designsystem.components.bigchips.BigChips.C13169a.ICON     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ge.bog.designsystem.components.bigchips.BigChips$a r1 = p341ge.bog.designsystem.components.bigchips.BigChips.C13169a.LOGO     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ge.bog.designsystem.components.bigchips.BigChips$a r1 = p341ge.bog.designsystem.components.bigchips.BigChips.C13169a.FILLED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f38853a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.bigchips.BigChips.C13170b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.designsystem.components.bigchips.BigChips$c */
    static final class C13171c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13171c f38854d = new C13171c();

        C13171c() {
            super(1);
        }

        /* renamed from: a */
        public final C2394j invoke(C2394j jVar) {
            C41536l.m120489i(jVar, "$this$setImage");
            C2247a c = jVar.mo7219c();
            C41536l.m120488h(c, "centerCrop()");
            return (C2394j) c;
        }
    }

    /* renamed from: ge.bog.designsystem.components.bigchips.BigChips$d */
    public static final class C13172d extends C41553c {

        /* renamed from: a */
        final /* synthetic */ BigChips f38855a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13172d(Object obj, BigChips bigChips) {
            super(obj);
            this.f38855a = bigChips;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            ((Boolean) obj2).booleanValue();
            ((Boolean) obj).booleanValue();
            this.f38855a.m49599j();
        }
    }

    /* renamed from: ge.bog.designsystem.components.bigchips.BigChips$e */
    public static final class C13173e extends C41553c {

        /* renamed from: a */
        final /* synthetic */ BigChips f38856a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13173e(Object obj, BigChips bigChips) {
            super(obj);
            this.f38856a = bigChips;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C13169a aVar = (C13169a) obj2;
            C13169a aVar2 = (C13169a) obj;
            this.f38856a.m49599j();
        }
    }

    static {
        Class<BigChips> cls = BigChips.class;
        f38842j = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "active", "getActive()Z", 0)), C41520a0.m120439e(new C41539o(cls, "iconType", "getIconType()Lge/bog/designsystem/components/bigchips/BigChips$BigChipIconType;", 0)), C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "iconImageVisibility", "getIconImageVisibility()Z", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BigChips(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: i */
    private final void m49598i() {
        int i;
        int i2 = C13170b.f38853a[getIconType().ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = getResources().getDimensionPixelSize(C17779d.big_chips_icon_16);
        } else if (i2 == 3) {
            i = getResources().getDimensionPixelSize(C17779d.big_chips_icon_24);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        AppCompatImageView appCompatImageView = this.f38843d.f27721f;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        appCompatImageView.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m49599j() {
        int i;
        int i2;
        if (getActive()) {
            Context context = getContext();
            C41536l.m120488h(context, "context");
            i = C18368l.m62755d(context, C17777b.f49603w);
        } else {
            Context context2 = getContext();
            C41536l.m120488h(context2, "context");
            i = C18368l.m62755d(context2, C17777b.f49599p);
        }
        if (getActive()) {
            i2 = C17780e.shape_big_chips_active;
        } else {
            i2 = C17780e.shape_big_chips_enable;
        }
        this.f38843d.f27722g.setTextColor(i);
        setBackgroundResource(i2);
        if (getIconType() == C13169a.LOGO) {
            this.f38843d.f27721f.clearColorFilter();
        } else {
            this.f38843d.f27721f.setColorFilter(i);
        }
        m49598i();
    }

    public final boolean getActive() {
        return ((Boolean) this.f38844e.getValue(this, f38842j[0])).booleanValue();
    }

    public final Image getIconImage() {
        return this.f38848i;
    }

    public final boolean getIconImageVisibility() {
        return this.f38847h.getValue(this, f38842j[3]).booleanValue();
    }

    public final C13169a getIconType() {
        return (C13169a) this.f38845f.getValue(this, f38842j[1]);
    }

    public final CharSequence getTitle() {
        return this.f38846g.getValue(this, f38842j[2]);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(C17779d.chip_thumbnail_height), 1073741824));
    }

    public final void setActive(boolean z) {
        this.f38844e.setValue(this, f38842j[0], Boolean.valueOf(z));
    }

    public final void setIconImage(Image image) {
        boolean z;
        this.f38848i = image;
        AppCompatImageView appCompatImageView = this.f38843d.f27721f;
        C41536l.m120488h(appCompatImageView, "_set_iconImage_$lambda$2");
        C18368l.m62777z(appCompatImageView, image, C13171c.f38854d);
        if (image != null) {
            z = true;
        } else {
            z = false;
        }
        setIconImageVisibility(z);
    }

    public final void setIconImageVisibility(boolean z) {
        this.f38847h.mo46151c(this, f38842j[3], z);
    }

    public final void setIconType(C13169a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f38845f.setValue(this, f38842j[1], aVar);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f38846g.setValue(this, f38842j[2], charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BigChips(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BigChips(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C10044x0 c = C10044x0.m36841c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f38843d = c;
        C41551a aVar = C41551a.f97718a;
        this.f38844e = new C13172d(Boolean.FALSE, this);
        C13169a aVar2 = C13169a.ICON;
        this.f38845f = new C13173e(aVar2, this);
        AppCompatTextView appCompatTextView = c.f27722g;
        C41536l.m120488h(appCompatTextView, "binding.chipTitleText");
        this.f38846g = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        LayerView layerView = c.f27720e;
        C41536l.m120488h(layerView, "binding.chipCircleLayer");
        this.f38847h = new C18365j0(layerView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        int[] iArr = C17787l.f50201Y0;
        C41536l.m120488h(iArr, "BigChips");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        String nonResourceString = obtainStyledAttributes.getNonResourceString(C17787l.f50248b1);
        setTitle(nonResourceString == null ? "" : nonResourceString);
        int i2 = obtainStyledAttributes.getInt(C17787l.f50232a1, 0);
        if (i2 != 0) {
            if (i2 == 1) {
                aVar2 = C13169a.LOGO;
            } else if (i2 == 2) {
                aVar2 = C13169a.FILLED;
            } else {
                throw new IllegalStateException("Unknown icon type");
            }
        }
        setIconType(aVar2);
        setActive(obtainStyledAttributes.getBoolean(C17787l.f50216Z0, false));
        obtainStyledAttributes.recycle();
    }
}

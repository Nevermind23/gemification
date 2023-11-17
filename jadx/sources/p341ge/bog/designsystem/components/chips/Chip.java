package p341ge.bog.designsystem.components.chips;

import af1.C40303i;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.C1314o;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C9950k2;
import p601sg.C17779d;
import p601sg.C17786k;
import p601sg.C17787l;
import p629uh.C18161a;
import p629uh.C18162b;
import p629uh.C18163c;
import p629uh.C18167d;
import p642vh.C18355e0;
import ue1.C43064a;

/* renamed from: ge.bog.designsystem.components.chips.Chip */
public class Chip extends LayerView {

    /* renamed from: l */
    static final /* synthetic */ C40303i[] f39045l = {C41520a0.m120439e(new C41539o(Chip.class, "chipTitle", "getChipTitle()Ljava/lang/CharSequence;", 0))};

    /* renamed from: d */
    private C13228a f39046d;

    /* renamed from: e */
    private C9950k2 f39047e;

    /* renamed from: f */
    private final C18355e0 f39048f;

    /* renamed from: g */
    private C18163c f39049g;

    /* renamed from: h */
    private C18167d f39050h;

    /* renamed from: i */
    private boolean f39051i;

    /* renamed from: j */
    private int f39052j;

    /* renamed from: k */
    private int f39053k;

    /* renamed from: ge.bog.designsystem.components.chips.Chip$a */
    public interface C13228a {
        /* renamed from: a */
        void mo35173a(Chip chip);

        /* renamed from: b */
        void mo35174b(Chip chip);
    }

    /* renamed from: ge.bog.designsystem.components.chips.Chip$b */
    public /* synthetic */ class C13229b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39054a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                uh.d[] r0 = p629uh.C18167d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                uh.d r1 = p629uh.C18167d.CHOICE_CHIP     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                uh.d r1 = p629uh.C18167d.SELECT_CHIP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                uh.d r1 = p629uh.C18167d.REMOVABLE_CHIP     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f39054a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.chips.Chip.C13229b.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m49743c(Chip chip, View view) {
        C41536l.m120489i(chip, "this$0");
        C13228a aVar = chip.f39046d;
        if (aVar != null) {
            aVar.mo35173a(chip);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m49744d(Chip chip, View view) {
        C41536l.m120489i(chip, "this$0");
        C13228a aVar = chip.f39046d;
        if (aVar != null) {
            aVar.mo35174b(chip);
        }
    }

    /* renamed from: e */
    private final void m49745e() {
        Resources resources = getResources();
        int i = C17779d.f49644Q1;
        this.f39052j = resources.getDimensionPixelSize(i);
        this.f39053k = getResources().getDimensionPixelSize(i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C41536l.m120488h(drawableState, "states");
        boolean r = C41333m.m119793r(drawableState, 16843518);
        boolean r2 = C41333m.m119793r(drawableState, 16842910);
        boolean r3 = C41333m.m119793r(drawableState, 16842919);
        if (r) {
            C1314o.m4575q(this.f39047e.f27192f, C17786k.TextSmallButtonWhite500Left);
        } else if (r2 || r3) {
            C1314o.m4575q(this.f39047e.f27192f, C17786k.TextSmallButtonInvertComponents200Left);
        } else {
            C1314o.m4575q(this.f39047e.f27192f, C17786k.TextSmallButtonInvertComponents150Left);
        }
    }

    public final C9950k2 getBinding() {
        return this.f39047e;
    }

    public int getChipMinWidth() {
        if (this.f39050h == C18167d.CHOICE_CHIP) {
            return getResources().getDimensionPixelSize(C17779d.min_width_choice_chip_view);
        }
        return 0;
    }

    public final CharSequence getChipTitle() {
        return this.f39048f.getValue(this, f39045l[0]);
    }

    public final C18167d getChipType() {
        return this.f39050h;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        C41536l.m120487g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = this.f39052j;
        marginLayoutParams.rightMargin = this.f39053k;
        LinearLayout linearLayout = this.f39047e.f27195i;
        linearLayout.getLayoutParams();
        int i3 = C13229b.f39054a[this.f39050h.ordinal()];
        if (i3 == 1) {
            Resources resources = linearLayout.getResources();
            int i4 = C17779d.spacing_12;
            linearLayout.setPadding(resources.getDimensionPixelSize(i4), 0, linearLayout.getResources().getDimensionPixelSize(i4), 0);
        } else if (i3 == 2) {
            linearLayout.setPadding(linearLayout.getResources().getDimensionPixelSize(C17779d.f49644Q1), 0, linearLayout.getResources().getDimensionPixelSize(C17779d.spacing_12), 0);
        } else if (i3 == 3) {
            linearLayout.setPadding(linearLayout.getResources().getDimensionPixelSize(C17779d.spacing_12), 0, linearLayout.getResources().getDimensionPixelSize(C17779d.f49644Q1), 0);
        }
        this.f39047e.f27195i.setMinimumWidth(getChipMinWidth());
        super.onMeasure(i, i2);
    }

    public void setActivated(boolean z) {
        super.setActivated(z);
        this.f39047e.f27194h.setChecked(z);
        this.f39051i = false;
    }

    public final void setBinding(C9950k2 k2Var) {
        C41536l.m120489i(k2Var, "<set-?>");
        this.f39047e = k2Var;
    }

    public final void setChipTitle(CharSequence charSequence) {
        this.f39048f.setValue(this, f39045l[0], charSequence);
    }

    public final void setChipType(C18167d dVar) {
        C18163c cVar;
        C41536l.m120489i(dVar, C11755a.C11756a.f34100b);
        int i = C13229b.f39054a[dVar.ordinal()];
        if (i == 1) {
            cVar = new C18163c.C18164a(this.f39047e);
        } else if (i == 2) {
            cVar = new C18163c.C18166c(this.f39047e);
        } else if (i == 3) {
            cVar = new C18163c.C18165b(this.f39047e);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f39049g = cVar;
        this.f39050h = dVar;
    }

    public final void setEventListener$design_system_release(C13228a aVar) {
        this.f39046d = aVar;
    }

    public final void setHalfActivated(boolean z) {
        super.setActivated(false);
        this.f39051i = z;
        this.f39047e.f27194h.setHalfChecked(z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Chip(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Chip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C9950k2 d = C9950k2.m36494d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f39047e = d;
        AppCompatTextView appCompatTextView = d.f27192f;
        C41536l.m120488h(appCompatTextView, "binding.chipTitleText");
        this.f39048f = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        this.f39049g = new C18163c.C18164a(this.f39047e);
        C18167d dVar = C18167d.CHOICE_CHIP;
        this.f39050h = dVar;
        m49745e();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17787l.f49993K2);
            C41536l.m120488h(obtainStyledAttributes, "context.obtainStyledAttr…(attrs, R.styleable.Chip)");
            setChipTitle(obtainStyledAttributes.getText(C17787l.f50053O2));
            setActivated(obtainStyledAttributes.getBoolean(C17787l.f50038N2, false));
            int i2 = obtainStyledAttributes.getInt(C17787l.f50068P2, 0);
            if (i2 != 0) {
                if (i2 == 1) {
                    dVar = C18167d.SELECT_CHIP;
                } else if (i2 == 2) {
                    dVar = C18167d.REMOVABLE_CHIP;
                } else {
                    throw new IllegalStateException("Unknown feedback type");
                }
            }
            setChipType(dVar);
            int i3 = C17787l.f50008L2;
            Resources resources = getResources();
            int i4 = C17779d.f49644Q1;
            this.f39052j = obtainStyledAttributes.getDimensionPixelSize(i3, resources.getDimensionPixelSize(i4));
            this.f39053k = obtainStyledAttributes.getDimensionPixelSize(C17787l.f50023M2, getResources().getDimensionPixelSize(i4));
            obtainStyledAttributes.recycle();
        }
        setOnClickListener(new C18161a(this));
        this.f39047e.f27193g.setOnClickListener(new C18162b(this));
    }
}

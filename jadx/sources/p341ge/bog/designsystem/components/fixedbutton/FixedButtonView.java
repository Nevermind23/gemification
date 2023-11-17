package p341ge.bog.designsystem.components.fixedbutton;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p352ak.C9919g3;
import p421fi.C12916b;
import p421fi.C12917c;
import p601sg.C17787l;
import p642vh.C18354e;
import p642vh.C18355e0;
import ue1.C43064a;

/* renamed from: ge.bog.designsystem.components.fixedbutton.FixedButtonView */
public final class FixedButtonView extends LinearLayout {

    /* renamed from: m */
    static final /* synthetic */ C40303i[] f39514m;

    /* renamed from: d */
    private final C9919g3 f39515d;

    /* renamed from: e */
    private ChipGroup f39516e;

    /* renamed from: f */
    private Button f39517f;

    /* renamed from: g */
    private Button f39518g;

    /* renamed from: h */
    private Button f39519h;

    /* renamed from: i */
    private final C18355e0 f39520i;

    /* renamed from: j */
    private final C18355e0 f39521j;

    /* renamed from: k */
    private final C18354e f39522k;

    /* renamed from: l */
    private C12916b f39523l;

    /* renamed from: ge.bog.designsystem.components.fixedbutton.FixedButtonView$a */
    public /* synthetic */ class C13333a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39524a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(2:19|20)|21|23) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|23) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                fi.b[] r0 = p421fi.C12916b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                fi.b r1 = p421fi.C12916b.EMPTY_BUTTON     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                fi.b r1 = p421fi.C12916b.INFORMATION_TEXT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                fi.b r1 = p421fi.C12916b.EMPTY_BUTTON_WITH_DELETE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                fi.b r1 = p421fi.C12916b.DOUBLE_INFORMATION_TEXT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                fi.b r1 = p421fi.C12916b.INFORMATION_BUTTON_WITH_DELETE     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                fi.b r1 = p421fi.C12916b.SIGN_BUTTON     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                fi.b r1 = p421fi.C12916b.SIGN_INFORMATION_BUTTON     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                fi.b r1 = p421fi.C12916b.SIGN_BUTTON_WITH_DELETE     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                fi.b r1 = p421fi.C12916b.TEXT_BUTTON     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                fi.b r1 = p421fi.C12916b.SIGN_INFORMATION_BUTTON_WITH_DELETE     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                f39524a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.fixedbutton.FixedButtonView.C13333a.<clinit>():void");
        }
    }

    static {
        Class<FixedButtonView> cls = FixedButtonView.class;
        f39514m = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "informationText", "getInformationText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "bottomInformationText", "getBottomInformationText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "additionalText", "getAdditionalText()Ljava/lang/CharSequence;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FixedButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m50174b(FixedButtonView fixedButtonView, Chip chip, int i) {
        C41536l.m120489i(fixedButtonView, "this$0");
        C41536l.m120489i(chip, "<anonymous parameter 0>");
        fixedButtonView.setButtonState(fixedButtonView.f39523l);
    }

    /* renamed from: c */
    private final void m50175c(C12916b bVar) {
        this.f39516e.setVisibility(bVar.mo33667e());
        this.f39515d.f27029j.setVisibility(bVar.mo33669g());
        this.f39515d.f27027h.setVisibility(bVar.mo33668f());
        this.f39515d.f27024e.setVisibility(bVar.mo33665b());
        this.f39515d.f27025f.setVisibility(bVar.mo33666c());
        setButtonState(bVar);
    }

    private final void setButtonState(C12916b bVar) {
        switch (C13333a.f39524a[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.f39515d.f27028i.setEnabled(true);
                return;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                C9919g3 g3Var = this.f39515d;
                g3Var.f27028i.setEnabled(!g3Var.f27026g.getActivatedChipsIndex().isEmpty());
                return;
            default:
                return;
        }
    }

    public final Button getAdditionalButton() {
        return this.f39519h;
    }

    public final CharSequence getAdditionalText() {
        return this.f39522k.getValue(this, f39514m[2]);
    }

    public final CharSequence getBottomInformationText() {
        return this.f39521j.getValue(this, f39514m[1]);
    }

    public final Button getButton() {
        return this.f39517f;
    }

    public final ChipGroup getChipGroup() {
        return this.f39516e;
    }

    public final Button getDeleteButton() {
        return this.f39518g;
    }

    public final C12916b getFixedButtonType() {
        return this.f39523l;
    }

    public final CharSequence getInformationText() {
        return this.f39520i.getValue(this, f39514m[0]);
    }

    public final void setAdditionalText(CharSequence charSequence) {
        this.f39522k.setValue(this, f39514m[2], charSequence);
    }

    public final void setBottomInformationText(CharSequence charSequence) {
        this.f39521j.setValue(this, f39514m[1], charSequence);
    }

    public final void setFixedButtonType(C12916b bVar) {
        C41536l.m120489i(bVar, C11755a.C11756a.f34100b);
        m50175c(bVar);
        this.f39523l = bVar;
    }

    public final void setInformationText(CharSequence charSequence) {
        this.f39520i.setValue(this, f39514m[0], charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FixedButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FixedButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9919g3 d = C9919g3.m36385d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(\n        LayoutI…ontext), this, true\n    )");
        this.f39515d = d;
        ChipGroup chipGroup = d.f27026g;
        C41536l.m120488h(chipGroup, "binding.chipGroup");
        this.f39516e = chipGroup;
        Button button = d.f27028i;
        C41536l.m120488h(button, "binding.fixedButton");
        this.f39517f = button;
        Button button2 = d.f27027h;
        C41536l.m120488h(button2, "binding.deleteButton");
        this.f39518g = button2;
        Button button3 = d.f27024e;
        C41536l.m120488h(button3, "binding.additionalButton");
        this.f39519h = button3;
        AppCompatTextView appCompatTextView = d.f27029j;
        C41536l.m120488h(appCompatTextView, "binding.informationText");
        this.f39520i = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView2 = d.f27025f;
        C41536l.m120488h(appCompatTextView2, "binding.bottomInformationText");
        this.f39521j = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        Button button4 = d.f27024e;
        C41536l.m120488h(button4, "binding.additionalButton");
        this.f39522k = new C18354e(button4);
        C12916b bVar = C12916b.EMPTY_BUTTON;
        this.f39523l = bVar;
        int[] iArr = C17787l.f50316f5;
        C41536l.m120488h(iArr, "FixedButtonView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        switch (obtainStyledAttributes.getInt(C17787l.f50348h5, 0)) {
            case 0:
                break;
            case 1:
                bVar = C12916b.SIGN_BUTTON;
                break;
            case 2:
                bVar = C12916b.INFORMATION_TEXT;
                break;
            case 3:
                bVar = C12916b.SIGN_INFORMATION_BUTTON;
                break;
            case 4:
                bVar = C12916b.EMPTY_BUTTON_WITH_DELETE;
                break;
            case 5:
                bVar = C12916b.SIGN_BUTTON_WITH_DELETE;
                break;
            case 6:
                bVar = C12916b.INFORMATION_BUTTON_WITH_DELETE;
                break;
            case 7:
                bVar = C12916b.SIGN_INFORMATION_BUTTON_WITH_DELETE;
                break;
            case 8:
                bVar = C12916b.TEXT_BUTTON;
                break;
            case 9:
                bVar = C12916b.DOUBLE_INFORMATION_TEXT;
                break;
            default:
                throw new IllegalStateException("Unknown feedback type");
        }
        setFixedButtonType(bVar);
        d.f27028i.setButtonText(obtainStyledAttributes.getString(C17787l.f50332g5));
        obtainStyledAttributes.recycle();
        d.f27026g.setOnChipActivatedChangedListener(new C12917c(this));
    }
}

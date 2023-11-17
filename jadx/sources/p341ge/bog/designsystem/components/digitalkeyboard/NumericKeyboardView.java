package p341ge.bog.designsystem.components.digitalkeyboard;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.eventbus.events.AgreementTemplateEventKt;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p350ai.C9861a;
import p350ai.C9862b;
import p350ai.C9863c;
import p352ak.C9928h4;
import p601sg.C17779d;
import p601sg.C17780e;
import p601sg.C17782g;
import p601sg.C17787l;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.digitalkeyboard.NumericKeyboardView */
public final class NumericKeyboardView extends ConstraintLayout {

    /* renamed from: m */
    public static final C13319b f39428m = new C13319b((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C41217g f39429d;

    /* renamed from: e */
    private final C9928h4 f39430e;

    /* renamed from: f */
    private C43075l f39431f;

    /* renamed from: g */
    private C43064a f39432g;

    /* renamed from: h */
    private C43064a f39433h;

    /* renamed from: i */
    private boolean f39434i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Map f39435j;

    /* renamed from: k */
    private final C41217g f39436k;

    /* renamed from: l */
    private C13317a f39437l;

    /* renamed from: ge.bog.designsystem.components.digitalkeyboard.NumericKeyboardView$a */
    public enum C13317a {
        NONE(0, (int) null, 0, 6, (int) null),
        DECIMAL_POINT(1, ".", C17780e.f49664n),
        FINGERPRINT(2, (int) null, C17780e.icons_24_security_fingerprint, 2, (int) null);
        

        /* renamed from: g */
        public static final C13318a f39438g = null;

        /* renamed from: d */
        private final int f39443d;

        /* renamed from: e */
        private final String f39444e;

        /* renamed from: f */
        private final int f39445f;

        /* renamed from: ge.bog.designsystem.components.digitalkeyboard.NumericKeyboardView$a$a */
        public static final class C13318a {
            private C13318a() {
            }

            public /* synthetic */ C13318a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C13317a mo35668a(int i) {
                for (C13317a aVar : C13317a.values()) {
                    if (aVar.mo35666c() == i) {
                        return aVar;
                    }
                }
                return null;
            }
        }

        static {
            f39438g = new C13318a((DefaultConstructorMarker) null);
        }

        private C13317a(int i, String str, int i2) {
            this.f39443d = i;
            this.f39444e = str;
            this.f39445f = i2;
        }

        /* renamed from: b */
        public final int mo35665b() {
            return this.f39445f;
        }

        /* renamed from: c */
        public final int mo35666c() {
            return this.f39443d;
        }

        /* renamed from: e */
        public final String mo35667e() {
            return this.f39444e;
        }
    }

    /* renamed from: ge.bog.designsystem.components.digitalkeyboard.NumericKeyboardView$b */
    public static final class C13319b {
        private C13319b() {
        }

        public /* synthetic */ C13319b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.digitalkeyboard.NumericKeyboardView$c */
    static final class C13320c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ NumericKeyboardView f39446d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13320c(NumericKeyboardView numericKeyboardView) {
            super(0);
            this.f39446d = numericKeyboardView;
        }

        /* renamed from: b */
        public final List invoke() {
            Set<Number> keySet = this.f39446d.f39435j.keySet();
            NumericKeyboardView numericKeyboardView = this.f39446d;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(keySet, 10));
            for (Number intValue : keySet) {
                arrayList.add((Button) numericKeyboardView.findViewById(intValue.intValue()));
            }
            return arrayList;
        }
    }

    /* renamed from: ge.bog.designsystem.components.digitalkeyboard.NumericKeyboardView$d */
    static final class C13321d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Context f39447d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13321d(Context context) {
            super(0);
            this.f39447d = context;
        }

        /* renamed from: b */
        public final Vibrator invoke() {
            Object systemService = this.f39447d.getSystemService("vibrator");
            C41536l.m120487g(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            return (Vibrator) systemService;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NumericKeyboardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    private final List<Button> getNumberButtons() {
        return (List) this.f39436k.getValue();
    }

    private final Vibrator getVibrator() {
        return (Vibrator) this.f39429d.getValue();
    }

    /* renamed from: l */
    private final void m50134l() {
        List<Button> numberButtons = getNumberButtons();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(numberButtons, 10));
        for (Button button : numberButtons) {
            button.setOnClickListener(new C9861a(this, button));
            arrayList.add(C41238w.f97225a);
        }
        this.f39430e.f27062e.setOnClickListener(new C9862b(this));
        this.f39430e.f27063f.setOnClickListener(new C9863c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m50135m(NumericKeyboardView numericKeyboardView, Button button, View view) {
        C41536l.m120489i(numericKeyboardView, "this$0");
        C41536l.m120489i(button, "$button");
        String str = (String) numericKeyboardView.f39435j.get(Integer.valueOf(button.getId()));
        if (str != null) {
            numericKeyboardView.m50138p();
            C43075l lVar = numericKeyboardView.f39431f;
            if (lVar != null) {
                lVar.invoke(str);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m50136n(NumericKeyboardView numericKeyboardView, View view) {
        C43075l lVar;
        C41536l.m120489i(numericKeyboardView, "this$0");
        numericKeyboardView.m50138p();
        C43064a aVar = numericKeyboardView.f39432g;
        if (aVar != null) {
            aVar.invoke();
        }
        String e = numericKeyboardView.f39437l.mo35667e();
        if (e != null && (lVar = numericKeyboardView.f39431f) != null) {
            lVar.invoke(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m50137o(NumericKeyboardView numericKeyboardView, View view) {
        C41536l.m120489i(numericKeyboardView, "this$0");
        numericKeyboardView.m50138p();
        C43064a aVar = numericKeyboardView.f39433h;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: p */
    private final void m50138p() {
        if (this.f39434i && getVibrator().hasVibrator()) {
            getVibrator().cancel();
            if (Build.VERSION.SDK_INT >= 26) {
                getVibrator().vibrate(VibrationEffect.createOneShot(25, -1));
            } else {
                getVibrator().vibrate(25);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(C17779d.numeric_keyboard_height), 1073741824));
    }

    public final void setAdditionalButtonClickedListener(C43064a aVar) {
        C41536l.m120489i(aVar, "clickListener");
        this.f39432g = aVar;
    }

    public final void setAdditionalButtonEnabled(boolean z) {
        this.f39430e.f27062e.setEnabled(z);
    }

    public final void setAdditionalButtonType(C13317a aVar) {
        boolean z;
        C41536l.m120489i(aVar, "type");
        this.f39437l = aVar;
        AppCompatImageButton appCompatImageButton = this.f39430e.f27062e;
        C41536l.m120488h(appCompatImageButton, "binding.additionalButton");
        if (aVar != C13317a.NONE) {
            z = true;
        } else {
            z = false;
        }
        C18368l.m62751F(appCompatImageButton, z, false, 2, (Object) null);
        this.f39430e.f27062e.setImageResource(aVar.mo35665b());
    }

    public final void setBackSpaceClickedListener(C43064a aVar) {
        C41536l.m120489i(aVar, "backSpaceClickedListener");
        this.f39433h = aVar;
    }

    public void setEnabled(boolean z) {
        for (Button enabled : getNumberButtons()) {
            enabled.setEnabled(z);
        }
        super.setEnabled(z);
    }

    public final void setNumbersClickedListener(C43075l lVar) {
        C41536l.m120489i(lVar, "numberClickedListener");
        this.f39431f = lVar;
    }

    public final void setVibrationEnabled(boolean z) {
        this.f39434i = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NumericKeyboardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NumericKeyboardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        this.f39429d = C41219i.m119470b(new C13321d(context));
        C9928h4 c = C9928h4.m36418c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f39430e = c;
        this.f39435j = C41344r0.m119931m(C41233s.m119492a(Integer.valueOf(C17782g.one_button), "1"), C41233s.m119492a(Integer.valueOf(C17782g.two_button), AgreementTemplateEventKt.CONTRACT_TYPE_CREFIT_INFO_CHECK_PERMISSION_OFFERS_ID), C41233s.m119492a(Integer.valueOf(C17782g.three_button), "3"), C41233s.m119492a(Integer.valueOf(C17782g.four_button), AgreementTemplateEventKt.CONTRACT_TYPE_MBANK_PENSION_CONTRACT_ANDROID_ID), C41233s.m119492a(Integer.valueOf(C17782g.five_button), "5"), C41233s.m119492a(Integer.valueOf(C17782g.six_button), AgreementTemplateEventKt.CONTRACT_TYPE_CREFIT_INFO_CHECK_PERMISSION_APPL_ID), C41233s.m119492a(Integer.valueOf(C17782g.seven_button), "7"), C41233s.m119492a(Integer.valueOf(C17782g.eight_button), "8"), C41233s.m119492a(Integer.valueOf(C17782g.nine_button), "9"), C41233s.m119492a(Integer.valueOf(C17782g.zero_button), BankApiResponse.SUCCESSFUL_RESPONSE_CODE));
        this.f39436k = C41219i.m119470b(new C13320c(this));
        C13317a aVar = C13317a.NONE;
        this.f39437l = aVar;
        int[] iArr = C17787l.f50240a9;
        C41536l.m120488h(iArr, "NumericKeyboardView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        this.f39434i = obtainStyledAttributes.getBoolean(C17787l.f50272c9, false);
        C13317a a = C13317a.f39438g.mo35668a(obtainStyledAttributes.getInt(C17787l.f50256b9, aVar.mo35666c()));
        setAdditionalButtonType(a != null ? a : aVar);
        obtainStyledAttributes.recycle();
        m50134l();
    }
}

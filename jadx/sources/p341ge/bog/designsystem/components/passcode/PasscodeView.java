package p341ge.bog.designsystem.components.passcode;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import he1.C41217g;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p351aj.C9866c;
import p352ak.C9976n4;
import p601sg.C17776a;
import p601sg.C17779d;
import p601sg.C17787l;
import p642vh.C18355e0;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.passcode.PasscodeView */
public final class PasscodeView extends LinearLayout {

    /* renamed from: k */
    public static final C13439a f40034k = new C13439a((DefaultConstructorMarker) null);

    /* renamed from: l */
    static final /* synthetic */ C40303i[] f40035l;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9976n4 f40036d;

    /* renamed from: e */
    private int f40037e;

    /* renamed from: f */
    private final C41217g f40038f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Animation f40039g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C43075l f40040h;

    /* renamed from: i */
    private final C41555e f40041i;

    /* renamed from: j */
    private final C18355e0 f40042j;

    /* renamed from: ge.bog.designsystem.components.passcode.PasscodeView$a */
    public static final class C13439a {
        private C13439a() {
        }

        public /* synthetic */ C13439a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.passcode.PasscodeView$b */
    public enum C13440b {
        NORMAL,
        ERROR,
        LOADING,
        SUCCESS
    }

    /* renamed from: ge.bog.designsystem.components.passcode.PasscodeView$c */
    public /* synthetic */ class C13441c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40048a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                ge.bog.designsystem.components.passcode.PasscodeView$b[] r0 = p341ge.bog.designsystem.components.passcode.PasscodeView.C13440b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.designsystem.components.passcode.PasscodeView$b r1 = p341ge.bog.designsystem.components.passcode.PasscodeView.C13440b.NORMAL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ge.bog.designsystem.components.passcode.PasscodeView$b r1 = p341ge.bog.designsystem.components.passcode.PasscodeView.C13440b.ERROR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ge.bog.designsystem.components.passcode.PasscodeView$b r1 = p341ge.bog.designsystem.components.passcode.PasscodeView.C13440b.LOADING     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                ge.bog.designsystem.components.passcode.PasscodeView$b r1 = p341ge.bog.designsystem.components.passcode.PasscodeView.C13440b.SUCCESS     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f40048a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.passcode.PasscodeView.C13441c.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.designsystem.components.passcode.PasscodeView$d */
    public static final class C13442d implements Animation.AnimationListener {

        /* renamed from: d */
        final /* synthetic */ PasscodeView f40049d;

        C13442d(PasscodeView passcodeView) {
            this.f40049d = passcodeView;
        }

        public void onAnimationEnd(Animation animation) {
            this.f40049d.mo36449i();
            this.f40049d.setState(C13440b.NORMAL);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            this.f40049d.mo36451k();
        }
    }

    /* renamed from: ge.bog.designsystem.components.passcode.PasscodeView$e */
    public static final class C13443e extends C41553c {

        /* renamed from: a */
        final /* synthetic */ PasscodeView f40050a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13443e(Object obj, PasscodeView passcodeView) {
            super(obj);
            this.f40050a = passcodeView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C13440b bVar = (C13440b) obj2;
            if (((C13440b) obj) != bVar) {
                C43075l e = this.f40050a.f40040h;
                if (e != null) {
                    e.invoke(bVar);
                }
                int i = C13441c.f40048a[bVar.ordinal()];
                if (i == 1) {
                    this.f40050a.f40036d.f27317g.setVisibility(8);
                    this.f40050a.f40036d.f27316f.setVisibility(8);
                    this.f40050a.f40036d.f27315e.setVisibility(0);
                } else if (i == 2) {
                    this.f40050a.f40036d.f27317g.setVisibility(8);
                    this.f40050a.f40036d.f27316f.setVisibility(8);
                    this.f40050a.f40036d.f27315e.setVisibility(0);
                    this.f40050a.f40039g.cancel();
                    this.f40050a.f40039g.reset();
                    this.f40050a.getVibrator().cancel();
                    if (Build.VERSION.SDK_INT >= 26) {
                        this.f40050a.getVibrator().vibrate(VibrationEffect.createOneShot(25, -1));
                    } else {
                        this.f40050a.getVibrator().vibrate(25);
                    }
                    this.f40050a.f40036d.f27315e.startAnimation(this.f40050a.f40039g);
                } else if (i == 3) {
                    this.f40050a.f40036d.f27317g.setVisibility(8);
                    this.f40050a.f40036d.f27315e.setVisibility(8);
                    this.f40050a.f40036d.f27316f.setVisibility(0);
                } else if (i == 4) {
                    this.f40050a.f40036d.f27315e.setVisibility(8);
                    this.f40050a.f40036d.f27316f.setVisibility(8);
                    this.f40050a.f40036d.f27317g.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.passcode.PasscodeView$f */
    static final class C13444f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Context f40051d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13444f(Context context) {
            super(0);
            this.f40051d = context;
        }

        /* renamed from: b */
        public final Vibrator invoke() {
            Object systemService = this.f40051d.getSystemService("vibrator");
            C41536l.m120487g(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            return (Vibrator) systemService;
        }
    }

    static {
        Class<PasscodeView> cls = PasscodeView.class;
        f40035l = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "state", "getState()Lge/bog/designsystem/components/passcode/PasscodeView$State;", 0)), C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PasscodeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m50476b(PasscodeView passcodeView, View view) {
        C41536l.m120489i(passcodeView, "this$0");
        if (passcodeView.getState() == C13440b.ERROR) {
            passcodeView.mo36449i();
        }
    }

    private final C13440b getState() {
        return (C13440b) this.f40041i.getValue(this, f40035l[0]);
    }

    /* access modifiers changed from: private */
    public final Vibrator getVibrator() {
        return (Vibrator) this.f40038f.getValue();
    }

    /* access modifiers changed from: private */
    public final void setState(C13440b bVar) {
        this.f40041i.setValue(this, f40035l[0], bVar);
    }

    public final CharSequence getTitle() {
        return this.f40042j.getValue(this, f40035l[1]);
    }

    /* renamed from: h */
    public final void mo36448h() {
        if (this.f40037e < this.f40036d.f27315e.getChildCount()) {
            this.f40036d.f27315e.getChildAt(this.f40037e).setActivated(true);
            this.f40037e++;
        }
    }

    /* renamed from: i */
    public final void mo36449i() {
        LinearLayout linearLayout = this.f40036d.f27315e;
        C41536l.m120488h(linearLayout, "binding.passcodeProgress");
        int childCount = linearLayout.getChildCount();
        if (childCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt = linearLayout.getChildAt(i);
                C41536l.m120488h(childAt, "getChildAt(index)");
                childAt.setEnabled(true);
                childAt.setActivated(false);
                if (i2 >= childCount) {
                    break;
                }
                i = i2;
            }
        }
        this.f40037e = 0;
        setState(C13440b.NORMAL);
    }

    /* renamed from: j */
    public final void mo36450j() {
        int i = this.f40037e;
        if (i > 0) {
            int i2 = i - 1;
            this.f40037e = i2;
            this.f40036d.f27315e.getChildAt(i2).setActivated(false);
            setState(C13440b.NORMAL);
        }
    }

    /* renamed from: k */
    public final void mo36451k() {
        LinearLayout linearLayout = this.f40036d.f27315e;
        C41536l.m120488h(linearLayout, "binding.passcodeProgress");
        int childCount = linearLayout.getChildCount();
        if (childCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt = linearLayout.getChildAt(i);
                C41536l.m120488h(childAt, "getChildAt(index)");
                childAt.setEnabled(false);
                if (i2 >= childCount) {
                    break;
                }
                i = i2;
            }
        }
        setState(C13440b.ERROR);
    }

    /* renamed from: l */
    public final void mo36452l() {
        setState(C13440b.LOADING);
    }

    /* renamed from: m */
    public final void mo36453m() {
        setState(C13440b.SUCCESS);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(C17779d.passcode_compact_width), 1073741824), i2);
    }

    public final void setStateChangedListener(C43075l lVar) {
        C41536l.m120489i(lVar, "stateChangedListener");
        this.f40040h = lVar;
    }

    public final void setTitle(CharSequence charSequence) {
        this.f40042j.setValue(this, f40035l[1], charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PasscodeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PasscodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C9976n4 c = C9976n4.m36591c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(\n        LayoutI…from(context), this\n    )");
        this.f40036d = c;
        this.f40038f = C41219i.m119470b(new C13444f(context));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, C17776a.shake_passcode_ball);
        loadAnimation.setAnimationListener(new C13442d(this));
        this.f40039g = loadAnimation;
        C41551a aVar = C41551a.f97718a;
        this.f40041i = new C13443e(C13440b.NORMAL, this);
        AppCompatTextView appCompatTextView = c.f27318h;
        C41536l.m120488h(appCompatTextView, "binding.titleText");
        this.f40042j = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        setOrientation(1);
        setGravity(1);
        setPadding(0, 0, 0, getResources().getDimensionPixelSize(C17779d.f49642K1));
        int[] iArr = C17787l.f50015L9;
        C41536l.m120488h(iArr, "PasscodeView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setTitle(obtainStyledAttributes.getString(C17787l.f50030M9));
        obtainStyledAttributes.recycle();
        c.f27315e.setOnClickListener(new C9866c(this));
    }
}

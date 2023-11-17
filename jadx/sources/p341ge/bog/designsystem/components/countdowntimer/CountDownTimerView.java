package p341ge.bog.designsystem.components.countdowntimer;

import af1.C40303i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C0767a;
import he1.C41224m;
import he1.C41233s;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p292w.C8720a;
import p341ge.bog.designsystem.components.common.Color;
import p352ak.C9990p2;
import p601sg.C17778c;
import p642vh.C18351c0;
import p642vh.C18368l;
import p655wh.C18595a;

/* renamed from: ge.bog.designsystem.components.countdowntimer.CountDownTimerView */
public final class CountDownTimerView extends FrameLayout {

    /* renamed from: t */
    public static final C13266b f39192t = new C13266b((DefaultConstructorMarker) null);

    /* renamed from: u */
    static final /* synthetic */ C40303i[] f39193u;

    /* renamed from: d */
    private final C9990p2 f39194d;

    /* renamed from: e */
    private int f39195e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f39196f;

    /* renamed from: g */
    private C13266b.C13267a f39197g;

    /* renamed from: h */
    private int f39198h;

    /* renamed from: i */
    private int f39199i;

    /* renamed from: j */
    private final C18351c0 f39200j;

    /* renamed from: k */
    private final C18351c0 f39201k;

    /* renamed from: l */
    private final C18351c0 f39202l;

    /* renamed from: m */
    private final C18351c0 f39203m;

    /* renamed from: n */
    private final C18351c0 f39204n;

    /* renamed from: o */
    private String f39205o;

    /* renamed from: p */
    private String f39206p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final Handler f39207q;

    /* renamed from: r */
    private final Runnable f39208r;

    /* renamed from: s */
    private final C13268c f39209s;

    /* renamed from: ge.bog.designsystem.components.countdowntimer.CountDownTimerView$a */
    private enum C13265a {
        POSITIVE(r1, new Color.Attribute(r3)),
        PENDING(C17778c.f49609I, new Color.Attribute(r3)),
        WARNING(r1, new Color.Resource(r1));
        

        /* renamed from: d */
        private final int f39214d;

        /* renamed from: e */
        private final Color f39215e;

        private C13265a(int i, Color color) {
            this.f39214d = i;
            this.f39215e = color;
        }

        /* renamed from: b */
        public final int mo35424b() {
            return this.f39214d;
        }

        /* renamed from: c */
        public final Color mo35425c() {
            return this.f39215e;
        }
    }

    /* renamed from: ge.bog.designsystem.components.countdowntimer.CountDownTimerView$b */
    public static final class C13266b {

        /* renamed from: ge.bog.designsystem.components.countdowntimer.CountDownTimerView$b$a */
        public interface C13267a {
            /* renamed from: a */
            void mo35426a();
        }

        private C13266b() {
        }

        public /* synthetic */ C13266b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final C41224m m49951d(int i) {
            return C41233s.m119492a(C40440x.m117166h0(String.valueOf(i / 60), 2, '0'), C40440x.m117166h0(String.valueOf(i % 60), 2, '0'));
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final int m49952e(int i, int i2) {
            return (i * i2) / 100;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final int m49953f(int i, int i2) {
            if (i2 == 0) {
                return 0;
            }
            return (i * 100) / i2;
        }
    }

    /* renamed from: ge.bog.designsystem.components.countdowntimer.CountDownTimerView$c */
    public static final class C13268c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ CountDownTimerView f39216d;

        C13268c(CountDownTimerView countDownTimerView) {
            this.f39216d = countDownTimerView;
        }

        public void run() {
            this.f39216d.f39207q.postDelayed(this, 1000);
            CountDownTimerView countDownTimerView = this.f39216d;
            countDownTimerView.setCurrTimeSeconds(countDownTimerView.f39196f - 1);
            this.f39216d.m49941g();
        }
    }

    static {
        Class<CountDownTimerView> cls = CountDownTimerView.class;
        f39193u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "minutesOneColor", "getMinutesOneColor()Lge/bog/designsystem/components/common/Color;", 0)), C41520a0.m120439e(new C41539o(cls, "minutesTwoColor", "getMinutesTwoColor()Lge/bog/designsystem/components/common/Color;", 0)), C41520a0.m120439e(new C41539o(cls, "colonColor", "getColonColor()Lge/bog/designsystem/components/common/Color;", 0)), C41520a0.m120439e(new C41539o(cls, "secondsOneColor", "getSecondsOneColor()Lge/bog/designsystem/components/common/Color;", 0)), C41520a0.m120439e(new C41539o(cls, "secondsTwoColor", "getSecondsTwoColor()Lge/bog/designsystem/components/common/Color;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CountDownTimerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: f */
    private final void m49940f() {
        C13266b bVar = f39192t;
        C41224m a = bVar.m49951d(this.f39196f);
        setMinutesText((String) a.mo95675a());
        setSecondsText((String) a.mo95676b());
        this.f39194d.f27393i.setProgress(bVar.m49953f(this.f39196f, this.f39195e));
        int i = this.f39196f;
        if (i == this.f39199i) {
            setColorState(C13265a.WARNING);
        } else if (i == this.f39198h) {
            setColorState(C13265a.PENDING);
        } else if (i == this.f39195e) {
            setColorState(C13265a.POSITIVE);
        }
        if (this.f39196f == 0) {
            C13266b.C13267a aVar = this.f39197g;
            if (aVar != null) {
                aVar.mo35426a();
            }
            mo35420j();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m49941g() {
        this.f39194d.f27389e.setVisibility(4);
        this.f39207q.postDelayed(this.f39208r, 350);
    }

    private final Color getColonColor() {
        return this.f39202l.getValue(this, f39193u[2]);
    }

    private final Color getMinutesOneColor() {
        return this.f39200j.getValue(this, f39193u[0]);
    }

    private final Color getMinutesTwoColor() {
        return this.f39201k.getValue(this, f39193u[1]);
    }

    private final Color getSecondsOneColor() {
        return this.f39203m.getValue(this, f39193u[3]);
    }

    private final Color getSecondsTwoColor() {
        return this.f39204n.getValue(this, f39193u[4]);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m49942h(CountDownTimerView countDownTimerView) {
        C41536l.m120489i(countDownTimerView, "this$0");
        TextView textView = countDownTimerView.f39194d.f27389e;
        C41536l.m120488h(textView, "binding.colon");
        C18368l.m62751F(textView, true, false, 2, (Object) null);
    }

    private final void setColonColor(Color color) {
        this.f39202l.setValue(this, f39193u[2], color);
    }

    private final void setColorState(C13265a aVar) {
        setMinutesOneColor(aVar.mo35425c());
        setMinutesTwoColor(aVar.mo35425c());
        setColonColor(aVar.mo35425c());
        setSecondsOneColor(aVar.mo35425c());
        setSecondsTwoColor(aVar.mo35425c());
        setProgressColor(aVar.mo35424b());
    }

    /* access modifiers changed from: private */
    public final void setCurrTimeSeconds(int i) {
        this.f39196f = C8720a.m32478b(i, 0, Integer.MAX_VALUE);
        m49940f();
    }

    private final void setMinutesOneColor(Color color) {
        this.f39200j.setValue(this, f39193u[0], color);
    }

    private final void setMinutesText(String str) {
        if (!C41536l.m120484d(this.f39205o, str)) {
            this.f39205o = str;
            this.f39194d.f27391g.setText(str);
        }
    }

    private final void setMinutesTwoColor(Color color) {
        this.f39201k.setValue(this, f39193u[1], color);
    }

    private final void setProgressColor(int i) {
        this.f39194d.f27393i.setProgressTintList(ColorStateList.valueOf(C0767a.m2893c(getContext(), i)));
    }

    private final void setSecondsOneColor(Color color) {
        this.f39203m.setValue(this, f39193u[3], color);
    }

    private final void setSecondsText(String str) {
        if (!C41536l.m120484d(this.f39206p, str)) {
            this.f39206p = str;
            this.f39194d.f27395k.setText(str);
        }
    }

    private final void setSecondsTwoColor(Color color) {
        this.f39204n.setValue(this, f39193u[4], color);
    }

    public final int getStartTimeSeconds() {
        return this.f39195e;
    }

    /* renamed from: i */
    public final void mo35419i() {
        mo35420j();
        this.f39207q.postDelayed(this.f39209s, 1000);
    }

    /* renamed from: j */
    public final void mo35420j() {
        this.f39207q.removeCallbacksAndMessages((Object) null);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo35420j();
    }

    public final void setOnTimerExpiredListener(C13266b.C13267a aVar) {
        C41536l.m120489i(aVar, "listener");
        this.f39197g = aVar;
    }

    public final void setStartTimeSeconds(int i) {
        this.f39195e = i;
        setCurrTimeSeconds(i);
        C13266b bVar = f39192t;
        this.f39198h = bVar.m49952e(i, 50);
        this.f39199i = bVar.m49952e(i, 20);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CountDownTimerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CountDownTimerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C9990p2 d = C9990p2.m36641d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f39194d = d;
        this.f39196f = this.f39195e;
        TextView textView = d.f27390f;
        C41536l.m120488h(textView, "binding.minutesOne");
        this.f39200j = new C18351c0(textView);
        TextView textView2 = d.f27392h;
        C41536l.m120488h(textView2, "binding.minutesTwo");
        this.f39201k = new C18351c0(textView2);
        TextView textView3 = d.f27389e;
        C41536l.m120488h(textView3, "binding.colon");
        this.f39202l = new C18351c0(textView3);
        TextView textView4 = d.f27394j;
        C41536l.m120488h(textView4, "binding.secondsOne");
        this.f39203m = new C18351c0(textView4);
        TextView textView5 = d.f27396l;
        C41536l.m120488h(textView5, "binding.secondsTwo");
        this.f39204n = new C18351c0(textView5);
        this.f39205o = "";
        this.f39206p = "";
        this.f39207q = new Handler(Looper.getMainLooper());
        this.f39208r = new C18595a(this);
        this.f39209s = new C13268c(this);
    }
}

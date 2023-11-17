package p420fh;

import af1.C40303i;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.C0767a;
import androidx.core.view.ViewCompat;
import androidx.core.widget.C1314o;
import he1.C41233s;
import he1.C41238w;
import java.util.Map;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41555e;
import p045d.C5769a;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C10037w0;
import p434gh.C15278a;
import p601sg.C17776a;
import p601sg.C17777b;
import p601sg.C17778c;
import p601sg.C17780e;
import p601sg.C17786k;
import ue1.C43064a;
import ue1.C43079p;

/* renamed from: fh.b */
public final class C12892b extends FrameLayout {

    /* renamed from: j */
    public static final C12893a f38075j = new C12893a((DefaultConstructorMarker) null);

    /* renamed from: k */
    static final /* synthetic */ C40303i[] f38076k = {C41520a0.m120439e(new C41539o(C12892b.class, "animDuration", "getAnimDuration()J", 0))};

    /* renamed from: d */
    private final C10037w0 f38077d;

    /* renamed from: e */
    private Animation f38078e;

    /* renamed from: f */
    private Animation f38079f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Runnable f38080g;

    /* renamed from: h */
    private final C41555e f38081h;

    /* renamed from: i */
    private final Map f38082i;

    /* renamed from: fh.b$a */
    public static final class C12893a {
        private C12893a() {
        }

        public /* synthetic */ C12893a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: fh.b$b */
    private static final class C12894b {

        /* renamed from: a */
        private final int f38083a;

        /* renamed from: b */
        private final Color f38084b;

        /* renamed from: c */
        private final Color f38085c;

        /* renamed from: d */
        private final int f38086d;

        /* renamed from: e */
        private final int f38087e;

        public C12894b(int i, Color color, Color color2, int i2, int i3) {
            C41536l.m120489i(color, "iconTintColor");
            C41536l.m120489i(color2, "iconBackgroundColor");
            this.f38083a = i;
            this.f38084b = color;
            this.f38085c = color2;
            this.f38086d = i2;
            this.f38087e = i3;
        }

        /* renamed from: a */
        public final int mo33631a() {
            return this.f38087e;
        }

        /* renamed from: b */
        public final int mo33632b() {
            return this.f38083a;
        }

        /* renamed from: c */
        public final Color mo33633c() {
            return this.f38085c;
        }

        /* renamed from: d */
        public final Color mo33634d() {
            return this.f38084b;
        }

        /* renamed from: e */
        public final int mo33635e() {
            return this.f38086d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12894b)) {
                return false;
            }
            C12894b bVar = (C12894b) obj;
            return this.f38083a == bVar.f38083a && C41536l.m120484d(this.f38084b, bVar.f38084b) && C41536l.m120484d(this.f38085c, bVar.f38085c) && this.f38086d == bVar.f38086d && this.f38087e == bVar.f38087e;
        }

        public int hashCode() {
            return (((((((this.f38083a * 31) + this.f38084b.hashCode()) * 31) + this.f38085c.hashCode()) * 31) + this.f38086d) * 31) + this.f38087e;
        }

        public String toString() {
            int i = this.f38083a;
            Color color = this.f38084b;
            Color color2 = this.f38085c;
            int i2 = this.f38086d;
            int i3 = this.f38087e;
            return "FeedbackStyle(icon=" + i + ", iconTintColor=" + color + ", iconBackgroundColor=" + color2 + ", textAppearance=" + i2 + ", backgroundColor=" + i3 + ")";
        }
    }

    /* renamed from: fh.b$c */
    static final class C12895c extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C12892b f38088d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12895c(C12892b bVar) {
            super(2);
            this.f38088d = bVar;
        }

        /* renamed from: a */
        public final void mo33639a(View view, boolean z) {
            if (z) {
                C12892b bVar = this.f38088d;
                bVar.removeCallbacks(bVar.f38080g);
                return;
            }
            C12892b bVar2 = this.f38088d;
            bVar2.removeCallbacks(bVar2.f38080g);
            this.f38088d.m48745i();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo33639a((View) obj, ((Boolean) obj2).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: fh.b$d */
    static final class C12896d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C12892b f38089d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12896d(C12892b bVar) {
            super(0);
            this.f38089d = bVar;
        }

        public final void invoke() {
            this.f38089d.m48744g();
        }
    }

    /* renamed from: fh.b$e */
    public static final class C12897e implements Animation.AnimationListener {

        /* renamed from: d */
        final /* synthetic */ C12892b f38090d;

        public C12897e(C12892b bVar) {
            this.f38090d = bVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f38090d.m48744g();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: fh.b$f */
    public static final class C12898f implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C12892b f38091d;

        C12898f(C12892b bVar) {
            this.f38091d = bVar;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0027 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                java.lang.Class<fh.b$f> r0 = p420fh.C12892b.C12898f.class
                fh.b r1 = r3.f38091d     // Catch:{ Exception -> 0x0031 }
                android.view.ViewParent r1 = r1.getParent()     // Catch:{ Exception -> 0x0031 }
                if (r1 != 0) goto L_0x0014
                java.lang.String r1 = r0.getSimpleName()     // Catch:{ Exception -> 0x0031 }
                java.lang.String r2 = "getParent() returning Null"
                android.util.Log.e(r1, r2)     // Catch:{ Exception -> 0x0031 }
                goto L_0x003d
            L_0x0014:
                fh.b r1 = r3.f38091d     // Catch:{ Exception -> 0x0027 }
                android.view.ViewParent r1 = r1.getParent()     // Catch:{ Exception -> 0x0027 }
                java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup"
                kotlin.jvm.internal.C41536l.m120487g(r1, r2)     // Catch:{ Exception -> 0x0027 }
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch:{ Exception -> 0x0027 }
                fh.b r2 = r3.f38091d     // Catch:{ Exception -> 0x0027 }
                r1.removeView(r2)     // Catch:{ Exception -> 0x0027 }
                goto L_0x003d
            L_0x0027:
                java.lang.String r1 = r0.getSimpleName()     // Catch:{ Exception -> 0x0031 }
                java.lang.String r2 = "Cannot remove from parent layout"
                android.util.Log.e(r1, r2)     // Catch:{ Exception -> 0x0031 }
                goto L_0x003d
            L_0x0031:
                r1 = move-exception
                java.lang.String r0 = r0.getSimpleName()
                java.lang.String r1 = android.util.Log.getStackTraceString(r1)
                android.util.Log.e(r0, r1)
            L_0x003d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p420fh.C12892b.C12898f.run():void");
        }
    }

    /* renamed from: fh.b$g */
    public static final class C12899g implements Animation.AnimationListener {

        /* renamed from: d */
        final /* synthetic */ C12892b f38092d;

        public C12899g(C12892b bVar) {
            this.f38092d = bVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f38092d.m48745i();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: fh.b$h */
    public static final class C12900h implements Animation.AnimationListener {

        /* renamed from: d */
        final /* synthetic */ C12892b f38093d;

        public C12900h(C12892b bVar) {
            this.f38093d = bVar;
        }

        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            this.f38093d.performHapticFeedback(1);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12892b(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: e */
    private final void m48742e() {
        LayerView layerView = this.f38077d.f27686g;
        C41536l.m120488h(layerView, "binding.layerView");
        layerView.setOnTouchListener(new C12912g(layerView, new C12895c(this), new C12896d(this)));
    }

    /* renamed from: f */
    private final void m48743f() {
        try {
            this.f38079f.setAnimationListener(new C12897e(this));
            startAnimation(this.f38079f);
        } catch (Exception e) {
            Log.e(C12892b.class.getSimpleName(), Log.getStackTraceString(e));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m48744g() {
        postDelayed(new C12898f(this), 100);
    }

    private final long getAnimDuration() {
        return ((Number) this.f38081h.getValue(this, f38076k[0])).longValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m48745i() {
        C12891a aVar = new C12891a(this);
        this.f38080g = aVar;
        postDelayed(aVar, getAnimDuration());
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m48746j(C12892b bVar) {
        C41536l.m120489i(bVar, "this$0");
        bVar.m48743f();
    }

    private final void setAnimDuration(long j) {
        this.f38081h.setValue(this, f38076k[0], Long.valueOf(j));
    }

    /* renamed from: h */
    public final void mo33629h(String str, C15278a aVar, long j) {
        C41536l.m120489i(str, "message");
        C41536l.m120489i(aVar, "type");
        C12894b bVar = (C12894b) this.f38082i.get(aVar);
        if (bVar != null) {
            setAnimDuration(j);
            this.f38077d.f27684e.setImageDrawable(C5769a.m23210b(getContext(), bVar.mo33632b()));
            AppCompatImageView appCompatImageView = this.f38077d.f27684e;
            Color d = bVar.mo33634d();
            Context context = getContext();
            C41536l.m120488h(context, "context");
            appCompatImageView.setColorFilter(d.mo35260a(context));
            LayerView layerView = this.f38077d.f27685f;
            Color c = bVar.mo33633c();
            Context context2 = getContext();
            C41536l.m120488h(context2, "context");
            layerView.setBackgroundColor(c.mo35260a(context2));
            C1314o.m4575q(this.f38077d.f27687h, bVar.mo33635e());
            this.f38077d.f27686g.setBackgroundColor(C0767a.m2893c(getContext(), bVar.mo33631a()));
            this.f38077d.f27687h.setText(str);
            return;
        }
        throw new IllegalStateException("Unknown Feedback Type".toString());
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38078e.setAnimationListener((Animation.AnimationListener) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12892b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C10037w0 c = C10037w0.m36815c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(\n        LayoutI…from(context), this\n    )");
        this.f38077d = c;
        this.f38081h = C41551a.f97718a.mo96327a();
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        setHapticFeedbackEnabled(true);
        ViewCompat.m3568O0(this, 2.14748365E9f);
        Animation loadAnimation = AnimationUtils.loadAnimation(context2, C17776a.feedback_slide_in_from_top);
        C41536l.m120488h(loadAnimation, "loadAnimation(context, R…edback_slide_in_from_top)");
        this.f38078e = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context2, C17776a.feedback_slide_out_on_top);
        C41536l.m120488h(loadAnimation2, "loadAnimation(context, R…eedback_slide_out_on_top)");
        this.f38079f = loadAnimation2;
        this.f38078e.setAnimationListener(new C12900h(this));
        this.f38078e.setAnimationListener(new C12899g(this));
        setAnimation(this.f38078e);
        m48742e();
        C15278a aVar = C15278a.POSITIVE;
        int i2 = C17780e.f49647B;
        int i3 = C17777b.f49590A;
        Color.Attribute attribute = new Color.Attribute(i3);
        int i4 = C17777b.color_black_tr_25;
        Color.Attribute attribute2 = new Color.Attribute(i4);
        int i5 = C17786k.TextBody2White500Left;
        int i6 = i5;
        this.f38082i = C41344r0.m119931m(C41233s.m119492a(aVar, new C12894b(i2, attribute, attribute2, i5, C17778c.f49616R)), C41233s.m119492a(C15278a.NEGATIVE, new C12894b(C17780e.icons_24_system_error_fill, new Color.Attribute(i3), new Color.Attribute(i4), i6, C17778c.color_negative_solid_400)), C41233s.m119492a(C15278a.WARNING, new C12894b(C17780e.f49656O, new Color.Attribute(C17777b.color_black_solid_300), new Color.Attribute(i4), C17786k.TextBody2Black400Left, C17778c.f49610J)), C41233s.m119492a(C15278a.INFO, new C12894b(C17780e.f49652J, new Color.Attribute(i3), new Color.Attribute(i4), i6, C17778c.f49629m)));
    }
}

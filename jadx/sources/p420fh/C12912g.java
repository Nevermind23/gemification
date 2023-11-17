package p420fh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.github.mikephil.charting.utils.Utils;
import kotlin.jvm.internal.C41536l;
import ue1.C43064a;
import ue1.C43079p;

/* renamed from: fh.g */
public final class C12912g implements View.OnTouchListener {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final View f38109d;

    /* renamed from: e */
    private final C43079p f38110e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C43064a f38111f;

    /* renamed from: g */
    private final int f38112g;

    /* renamed from: h */
    private final int f38113h;

    /* renamed from: i */
    private final long f38114i;

    /* renamed from: j */
    private float f38115j = 1.0f;

    /* renamed from: k */
    private float f38116k;

    /* renamed from: l */
    private boolean f38117l;

    /* renamed from: m */
    private VelocityTracker f38118m;

    /* renamed from: n */
    private float f38119n;

    /* renamed from: fh.g$a */
    public static final class C12913a extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ C12912g f38120d;

        C12913a(C12912g gVar) {
            this.f38120d = gVar;
        }

        public void onAnimationEnd(Animator animator) {
            C41536l.m120489i(animator, "animation");
            this.f38120d.m48806e();
        }
    }

    /* renamed from: fh.g$b */
    public static final class C12914b extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ C12912g f38121d;

        /* renamed from: e */
        final /* synthetic */ ViewGroup.LayoutParams f38122e;

        /* renamed from: f */
        final /* synthetic */ int f38123f;

        C12914b(C12912g gVar, ViewGroup.LayoutParams layoutParams, int i) {
            this.f38121d = gVar;
            this.f38122e = layoutParams;
            this.f38123f = i;
        }

        public void onAnimationEnd(Animator animator) {
            C41536l.m120489i(animator, "animation");
            this.f38121d.f38111f.invoke();
            this.f38121d.f38109d.setAlpha(1.0f);
            this.f38121d.f38109d.setTranslationX(Utils.FLOAT_EPSILON);
            this.f38122e.height = this.f38123f;
            this.f38121d.f38109d.setLayoutParams(this.f38122e);
        }
    }

    public C12912g(View view, C43079p pVar, C43064a aVar) {
        C41536l.m120489i(view, "view");
        C41536l.m120489i(pVar, "onTouch");
        C41536l.m120489i(aVar, "onDismiss");
        this.f38109d = view;
        this.f38110e = pVar;
        this.f38111f = aVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.f38112g = viewConfiguration.getScaledTouchSlop();
        this.f38113h = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.f38114i = (long) view.getContext().getResources().getInteger(17694720);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m48806e() {
        ViewGroup.LayoutParams layoutParams = this.f38109d.getLayoutParams();
        int height = this.f38109d.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{height, 1}).setDuration(this.f38114i);
        duration.addListener(new C12914b(this, layoutParams, height));
        duration.addUpdateListener(new C12911f(layoutParams, this));
        duration.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m48807f(ViewGroup.LayoutParams layoutParams, C12912g gVar, ValueAnimator valueAnimator) {
        C41536l.m120489i(gVar, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C41536l.m120487g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.height = ((Integer) animatedValue).intValue();
        gVar.f38109d.setLayoutParams(layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010c, code lost:
        if (r13 == r3) goto L_0x0110;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C41536l.m120489i(r12, r0)
            java.lang.String r0 = "motionEvent"
            kotlin.jvm.internal.C41536l.m120489i(r13, r0)
            float r0 = r11.f38119n
            r1 = 0
            r13.offsetLocation(r1, r0)
            float r0 = r11.f38115j
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0032
            android.view.ViewGroup$LayoutParams r0 = r12.getLayoutParams()
            java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            kotlin.jvm.internal.C41536l.m120487g(r0, r2)
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r2 = r12.getHeight()
            float r2 = (float) r2
            int r3 = r0.topMargin
            float r3 = (float) r3
            float r2 = r2 + r3
            int r0 = r0.bottomMargin
            float r0 = (float) r0
            float r2 = r2 + r0
            r11.f38115j = r2
        L_0x0032:
            int r0 = r13.getActionMasked()
            r2 = 0
            if (r0 == 0) goto L_0x0158
            r3 = 3
            r4 = 0
            r5 = 1
            if (r0 == r5) goto L_0x00b7
            r6 = 2
            if (r0 == r6) goto L_0x006f
            if (r0 == r3) goto L_0x0047
            r12.performClick()
            return r2
        L_0x0047:
            android.view.VelocityTracker r13 = r11.f38118m
            if (r13 == 0) goto L_0x0157
            android.view.ViewPropertyAnimator r12 = r12.animate()
            android.view.ViewPropertyAnimator r12 = r12.translationY(r1)
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r12 = r12.alpha(r0)
            long r5 = r11.f38114i
            android.view.ViewPropertyAnimator r12 = r12.setDuration(r5)
            r12.setListener(r4)
            r13.recycle()
            r11.f38118m = r4
            r11.f38119n = r1
            r11.f38116k = r1
            r11.f38117l = r2
            goto L_0x0157
        L_0x006f:
            android.view.VelocityTracker r0 = r11.f38118m
            if (r0 == 0) goto L_0x0157
            r0.addMovement(r13)
            float r0 = r13.getRawY()
            float r4 = r11.f38116k
            float r0 = r0 - r4
            r11.f38117l = r2
            int r4 = r11.f38112g
            float r4 = (float) r4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x00a3
            r11.f38117l = r5
            android.view.ViewParent r4 = r12.getParent()
            r4.requestDisallowInterceptTouchEvent(r5)
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r13)
            int r13 = r13.getActionIndex()
            int r13 = r13 << 8
            r13 = r13 | r3
            r4.setAction(r13)
            r12.onTouchEvent(r4)
            r4.recycle()
        L_0x00a3:
            boolean r13 = r11.f38117l
            if (r13 == 0) goto L_0x0157
            r11.f38119n = r0
            int r13 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r13 <= 0) goto L_0x00ae
            goto L_0x00b3
        L_0x00ae:
            int r13 = r11.f38112g
            float r13 = (float) r13
            float r1 = r0 - r13
        L_0x00b3:
            r12.setTranslationY(r1)
            return r5
        L_0x00b7:
            android.view.VelocityTracker r0 = r11.f38118m
            if (r0 == 0) goto L_0x0157
            float r6 = r13.getRawY()
            float r7 = r11.f38116k
            float r6 = r6 - r7
            r0.addMovement(r13)
            r13 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r13)
            float r13 = r0.getXVelocity()
            float r7 = r0.getYVelocity()
            float r13 = java.lang.Math.abs(r13)
            float r8 = java.lang.Math.abs(r7)
            float r9 = java.lang.Math.abs(r6)
            float r10 = r11.f38115j
            float r3 = (float) r3
            float r10 = r10 * r3
            r3 = 10
            float r3 = (float) r3
            float r10 = r10 / r3
            int r3 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x00ef
            boolean r3 = r11.f38117l
            if (r3 == 0) goto L_0x00ef
            goto L_0x0110
        L_0x00ef:
            int r3 = r11.f38113h
            float r3 = (float) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x010f
            int r13 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r13 >= 0) goto L_0x010f
            boolean r13 = r11.f38117l
            if (r13 == 0) goto L_0x010f
            int r13 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r13 >= 0) goto L_0x0104
            r13 = r5
            goto L_0x0105
        L_0x0104:
            r13 = r2
        L_0x0105:
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x010b
            r3 = r5
            goto L_0x010c
        L_0x010b:
            r3 = r2
        L_0x010c:
            if (r13 != r3) goto L_0x010f
            goto L_0x0110
        L_0x010f:
            r5 = r2
        L_0x0110:
            if (r5 == 0) goto L_0x012c
            android.view.ViewPropertyAnimator r12 = r12.animate()
            float r13 = r11.f38115j
            float r13 = -r13
            android.view.ViewPropertyAnimator r12 = r12.translationY(r13)
            long r5 = r11.f38114i
            android.view.ViewPropertyAnimator r12 = r12.setDuration(r5)
            fh.g$a r13 = new fh.g$a
            r13.<init>(r11)
            r12.setListener(r13)
            goto L_0x014c
        L_0x012c:
            boolean r13 = r11.f38117l
            if (r13 != 0) goto L_0x0134
            int r13 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r13 <= 0) goto L_0x014c
        L_0x0134:
            android.view.ViewPropertyAnimator r13 = r12.animate()
            android.view.ViewPropertyAnimator r13 = r13.translationY(r1)
            long r5 = r11.f38114i
            android.view.ViewPropertyAnimator r13 = r13.setDuration(r5)
            r13.setListener(r4)
            ue1.p r13 = r11.f38110e
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r13.invoke(r12, r3)
        L_0x014c:
            r0.recycle()
            r11.f38118m = r4
            r11.f38119n = r1
            r11.f38116k = r1
            r11.f38117l = r2
        L_0x0157:
            return r2
        L_0x0158:
            float r0 = r13.getRawY()
            r11.f38116k = r0
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.f38118m = r0
            if (r0 == 0) goto L_0x0169
            r0.addMovement(r13)
        L_0x0169:
            ue1.p r13 = r11.f38110e
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r13.invoke(r12, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p420fh.C12912g.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}

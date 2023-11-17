package p341ge.bog.mobilebank.externallibs.materialcalendar;

import android.animation.Animator;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.github.mikephil.charting.utils.Utils;
import ge0.C24709g;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;

/* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.m */
class C23329m {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final TextView f61049a;

    /* renamed from: b */
    private C24709g f61050b = C24709g.f63600a;

    /* renamed from: c */
    private final int f61051c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final int f61052d;

    /* renamed from: e */
    private final int f61053e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Interpolator f61054f = new DecelerateInterpolator(2.0f);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f61055g = 0;

    /* renamed from: h */
    private long f61056h = 0;

    /* renamed from: i */
    private CalendarDay f61057i = null;

    /* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.m$a */
    class C23330a extends C23314a {

        /* renamed from: d */
        final /* synthetic */ CharSequence f61058d;

        /* renamed from: e */
        final /* synthetic */ int f61059e;

        C23330a(CharSequence charSequence, int i) {
            this.f61058d = charSequence;
            this.f61059e = i;
        }

        public void onAnimationCancel(Animator animator) {
            C23329m mVar = C23329m.this;
            mVar.m75443h(mVar.f61049a, 0);
            C23329m.this.f61049a.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            C23329m.this.f61049a.setText(this.f61058d);
            C23329m mVar = C23329m.this;
            mVar.m75443h(mVar.f61049a, this.f61059e);
            ViewPropertyAnimator animate = C23329m.this.f61049a.animate();
            if (C23329m.this.f61055g == 1) {
                animate.translationX(Utils.FLOAT_EPSILON);
            } else {
                animate.translationY(Utils.FLOAT_EPSILON);
            }
            animate.alpha(1.0f).setDuration((long) C23329m.this.f61052d).setInterpolator(C23329m.this.f61054f).setListener(new C23314a()).start();
        }
    }

    public C23329m(TextView textView) {
        this.f61049a = textView;
        Resources resources = textView.getResources();
        this.f61051c = TextTypeView.SEPARATOR_FULL;
        this.f61052d = resources.getInteger(17694720) / 2;
        this.f61053e = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
    }

    /* renamed from: g */
    private void m75442g(long j, CalendarDay calendarDay, boolean z) {
        int i;
        this.f61049a.animate().cancel();
        m75443h(this.f61049a, 0);
        this.f61049a.setAlpha(1.0f);
        this.f61056h = j;
        CharSequence a = this.f61050b.mo63110a(calendarDay);
        if (!z) {
            this.f61049a.setText(a);
        } else {
            int i2 = this.f61053e;
            if (this.f61057i.mo58868j(calendarDay)) {
                i = 1;
            } else {
                i = -1;
            }
            int i3 = i2 * i;
            ViewPropertyAnimator animate = this.f61049a.animate();
            if (this.f61055g == 1) {
                animate.translationX((float) (i3 * -1));
            } else {
                animate.translationY((float) (i3 * -1));
            }
            animate.alpha(Utils.FLOAT_EPSILON).setDuration((long) this.f61052d).setInterpolator(this.f61054f).setListener(new C23330a(a, i3)).start();
        }
        this.f61057i = calendarDay;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m75443h(TextView textView, int i) {
        if (this.f61055g == 1) {
            textView.setTranslationX((float) i);
        } else {
            textView.setTranslationY((float) i);
        }
    }

    /* renamed from: f */
    public void mo59081f(CalendarDay calendarDay) {
        long currentTimeMillis = System.currentTimeMillis();
        if (calendarDay != null) {
            if (TextUtils.isEmpty(this.f61049a.getText()) || currentTimeMillis - this.f61056h < ((long) this.f61051c)) {
                m75442g(currentTimeMillis, calendarDay, false);
            }
            if (calendarDay.equals(this.f61057i)) {
                return;
            }
            if (calendarDay.mo58864f() != this.f61057i.mo58864f() || calendarDay.mo58865g() != this.f61057i.mo58865g()) {
                m75442g(currentTimeMillis, calendarDay, true);
            }
        }
    }

    /* renamed from: i */
    public int mo59082i() {
        return this.f61055g;
    }

    /* renamed from: j */
    public void mo59083j(int i) {
        this.f61055g = i;
    }

    /* renamed from: k */
    public void mo59084k(CalendarDay calendarDay) {
        this.f61057i = calendarDay;
    }

    /* renamed from: l */
    public void mo59085l(C24709g gVar) {
        if (gVar == null) {
            gVar = C24709g.f63600a;
        }
        this.f61050b = gVar;
    }
}

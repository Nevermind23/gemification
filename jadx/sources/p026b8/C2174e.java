package p026b8;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: b8.e */
public class C2174e {

    /* renamed from: a */
    private long f6358a;

    /* renamed from: b */
    private long f6359b;

    /* renamed from: c */
    private TimeInterpolator f6360c;

    /* renamed from: d */
    private int f6361d;

    /* renamed from: e */
    private int f6362e;

    public C2174e(long j, long j2) {
        this.f6360c = null;
        this.f6361d = 0;
        this.f6362e = 1;
        this.f6358a = j;
        this.f6359b = j2;
    }

    /* renamed from: b */
    static C2174e m8308b(ValueAnimator valueAnimator) {
        C2174e eVar = new C2174e(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m8309f(valueAnimator));
        eVar.f6361d = valueAnimator.getRepeatCount();
        eVar.f6362e = valueAnimator.getRepeatMode();
        return eVar;
    }

    /* renamed from: f */
    private static TimeInterpolator m8309f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return C2170a.f6351b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return C2170a.f6352c;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            return C2170a.f6353d;
        }
        return interpolator;
    }

    /* renamed from: a */
    public void mo7067a(Animator animator) {
        animator.setStartDelay(mo7068c());
        animator.setDuration(mo7069d());
        animator.setInterpolator(mo7070e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(mo7072g());
            valueAnimator.setRepeatMode(mo7073h());
        }
    }

    /* renamed from: c */
    public long mo7068c() {
        return this.f6358a;
    }

    /* renamed from: d */
    public long mo7069d() {
        return this.f6359b;
    }

    /* renamed from: e */
    public TimeInterpolator mo7070e() {
        TimeInterpolator timeInterpolator = this.f6360c;
        return timeInterpolator != null ? timeInterpolator : C2170a.f6351b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2174e)) {
            return false;
        }
        C2174e eVar = (C2174e) obj;
        if (mo7068c() == eVar.mo7068c() && mo7069d() == eVar.mo7069d() && mo7072g() == eVar.mo7072g() && mo7073h() == eVar.mo7073h()) {
            return mo7070e().getClass().equals(eVar.mo7070e().getClass());
        }
        return false;
    }

    /* renamed from: g */
    public int mo7072g() {
        return this.f6361d;
    }

    /* renamed from: h */
    public int mo7073h() {
        return this.f6362e;
    }

    public int hashCode() {
        return (((((((((int) (mo7068c() ^ (mo7068c() >>> 32))) * 31) + ((int) (mo7069d() ^ (mo7069d() >>> 32)))) * 31) + mo7070e().getClass().hashCode()) * 31) + mo7072g()) * 31) + mo7073h();
    }

    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + mo7068c() + " duration: " + mo7069d() + " interpolator: " + mo7070e().getClass() + " repeatCount: " + mo7072g() + " repeatMode: " + mo7073h() + "}\n";
    }

    public C2174e(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f6361d = 0;
        this.f6362e = 1;
        this.f6358a = j;
        this.f6359b = j2;
        this.f6360c = timeInterpolator;
    }
}

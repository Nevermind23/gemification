package p048d2;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: d2.c */
public abstract class C5801c extends ValueAnimator {

    /* renamed from: d */
    private final Set f18274d = new CopyOnWriteArraySet();

    /* renamed from: e */
    private final Set f18275e = new CopyOnWriteArraySet();

    /* renamed from: f */
    private final Set f18276f = new CopyOnWriteArraySet();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18961a() {
        for (Animator.AnimatorListener onAnimationCancel : this.f18275e) {
            onAnimationCancel.onAnimationCancel(this);
        }
    }

    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f18275e.add(animatorListener);
    }

    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f18276f.add(animatorPauseListener);
    }

    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f18274d.add(animatorUpdateListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo18965b(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f18275e) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo18966c() {
        for (Animator.AnimatorPauseListener onAnimationPause : this.f18276f) {
            onAnimationPause.onAnimationPause(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo18967d() {
        for (Animator.AnimatorListener onAnimationRepeat : this.f18275e) {
            onAnimationRepeat.onAnimationRepeat(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo18968e() {
        for (Animator.AnimatorPauseListener onAnimationResume : this.f18276f) {
            onAnimationResume.onAnimationResume(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo18969f(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f18275e) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo18970g() {
        for (ValueAnimator.AnimatorUpdateListener onAnimationUpdate : this.f18274d) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void removeAllListeners() {
        this.f18275e.clear();
    }

    public void removeAllUpdateListeners() {
        this.f18274d.clear();
    }

    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f18275e.remove(animatorListener);
    }

    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f18276f.remove(animatorPauseListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f18274d.remove(animatorUpdateListener);
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}

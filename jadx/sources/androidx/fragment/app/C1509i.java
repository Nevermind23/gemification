package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.view.C1136d1;
import p085g0.C6198a;
import p085g0.C6199b;

/* renamed from: androidx.fragment.app.i */
abstract class C1509i {
    /* renamed from: a */
    private static int m5359a(Fragment fragment, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return fragment.getPopEnterAnim();
            }
            return fragment.getPopExitAnim();
        } else if (z) {
            return fragment.getEnterAnim();
        } else {
            return fragment.getExitAnim();
        }
    }

    /* renamed from: b */
    static C1510a m5360b(Context context, Fragment fragment, boolean z, boolean z2) {
        int nextTransition = fragment.getNextTransition();
        int a = m5359a(fragment, z, z2);
        boolean z3 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i = C6199b.f19206c;
            if (viewGroup.getTag(i) != null) {
                fragment.mContainer.setTag(i, (Object) null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, a);
        if (onCreateAnimation != null) {
            return new C1510a(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, a);
        if (onCreateAnimator != null) {
            return new C1510a(onCreateAnimator);
        }
        if (a == 0 && nextTransition != 0) {
            a = m5362d(context, nextTransition, z);
        }
        if (a != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(a));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, a);
                    if (loadAnimation != null) {
                        return new C1510a(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, a);
                    if (loadAnimator != null) {
                        return new C1510a(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a);
                        if (loadAnimation2 != null) {
                            return new C1510a(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private static int m5361c(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: d */
    private static int m5362d(Context context, int i, boolean z) {
        if (i != 4097) {
            if (i != 8194) {
                if (i != 8197) {
                    if (i != 4099) {
                        if (i != 4100) {
                            return -1;
                        }
                        if (z) {
                            return m5361c(context, 16842936);
                        }
                        return m5361c(context, 16842937);
                    } else if (z) {
                        return C6198a.f19200c;
                    } else {
                        return C6198a.f19201d;
                    }
                } else if (z) {
                    return m5361c(context, 16842938);
                } else {
                    return m5361c(context, 16842939);
                }
            } else if (z) {
                return C6198a.f19198a;
            } else {
                return C6198a.f19199b;
            }
        } else if (z) {
            return C6198a.f19202e;
        } else {
            return C6198a.f19203f;
        }
    }

    /* renamed from: androidx.fragment.app.i$a */
    static class C1510a {

        /* renamed from: a */
        public final Animation f4415a;

        /* renamed from: b */
        public final Animator f4416b;

        C1510a(Animation animation) {
            this.f4415a = animation;
            this.f4416b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        C1510a(Animator animator) {
            this.f4415a = null;
            this.f4416b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.i$b */
    static class C1511b extends AnimationSet implements Runnable {

        /* renamed from: d */
        private final ViewGroup f4417d;

        /* renamed from: e */
        private final View f4418e;

        /* renamed from: f */
        private boolean f4419f;

        /* renamed from: g */
        private boolean f4420g;

        /* renamed from: h */
        private boolean f4421h = true;

        C1511b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f4417d = viewGroup;
            this.f4418e = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f4421h = true;
            if (this.f4419f) {
                return !this.f4420g;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f4419f = true;
                C1136d1.m4184a(this.f4417d, this);
            }
            return true;
        }

        public void run() {
            if (this.f4419f || !this.f4421h) {
                this.f4417d.endViewTransition(this.f4418e);
                this.f4420g = true;
                return;
            }
            this.f4421h = false;
            this.f4417d.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f4421h = true;
            if (this.f4419f) {
                return !this.f4420g;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f4419f = true;
                C1136d1.m4184a(this.f4417d, this);
            }
            return true;
        }
    }
}

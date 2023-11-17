package p060e1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;

/* renamed from: e1.h */
public class C5928h extends C5936i0 {

    /* renamed from: M */
    private static final String[] f18549M = {"android:clipBounds:clip"};

    /* renamed from: e1.h$a */
    class C5929a extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ View f18550d;

        C5929a(View view) {
            this.f18550d = view;
        }

        public void onAnimationEnd(Animator animator) {
            ViewCompat.m3633y0(this.f18550d, (Rect) null);
        }
    }

    public C5928h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: A0 */
    private void m23767A0(C5989q0 q0Var) {
        View view = q0Var.f18719b;
        if (view.getVisibility() != 8) {
            Rect u = ViewCompat.m3624u(view);
            q0Var.f18718a.put("android:clipBounds:clip", u);
            if (u == null) {
                q0Var.f18718a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
    }

    /* renamed from: V */
    public String[] mo19264V() {
        return f18549M;
    }

    /* renamed from: k */
    public void mo16526k(C5989q0 q0Var) {
        m23767A0(q0Var);
    }

    /* renamed from: n */
    public void mo16527n(C5989q0 q0Var) {
        m23767A0(q0Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.graphics.Rect} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: android.graphics.Rect} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo16528r(android.view.ViewGroup r8, p060e1.C5989q0 r9, p060e1.C5989q0 r10) {
        /*
            r7 = this;
            r8 = 0
            if (r9 == 0) goto L_0x007e
            if (r10 == 0) goto L_0x007e
            java.util.Map r0 = r9.f18718a
            java.lang.String r1 = "android:clipBounds:clip"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x007e
            java.util.Map r0 = r10.f18718a
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x0018
            goto L_0x007e
        L_0x0018:
            java.util.Map r0 = r9.f18718a
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            java.util.Map r2 = r10.f18718a
            java.lang.Object r1 = r2.get(r1)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x002e
            r4 = r2
            goto L_0x002f
        L_0x002e:
            r4 = r3
        L_0x002f:
            if (r0 != 0) goto L_0x0034
            if (r1 != 0) goto L_0x0034
            return r8
        L_0x0034:
            java.lang.String r5 = "android:clipBounds:bounds"
            if (r0 != 0) goto L_0x0042
            java.util.Map r9 = r9.f18718a
            java.lang.Object r9 = r9.get(r5)
            r0 = r9
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            goto L_0x004d
        L_0x0042:
            if (r1 != 0) goto L_0x004d
            java.util.Map r9 = r10.f18718a
            java.lang.Object r9 = r9.get(r5)
            r1 = r9
            android.graphics.Rect r1 = (android.graphics.Rect) r1
        L_0x004d:
            boolean r9 = r0.equals(r1)
            if (r9 == 0) goto L_0x0054
            return r8
        L_0x0054:
            android.view.View r8 = r10.f18719b
            androidx.core.view.ViewCompat.m3633y0(r8, r0)
            e1.d0 r8 = new e1.d0
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r8.<init>(r9)
            android.view.View r9 = r10.f18719b
            android.util.Property r5 = p060e1.C5887a1.f18480c
            r6 = 2
            android.graphics.Rect[] r6 = new android.graphics.Rect[r6]
            r6[r3] = r0
            r6[r2] = r1
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofObject(r9, r5, r8, r6)
            if (r4 == 0) goto L_0x007e
            android.view.View r9 = r10.f18719b
            e1.h$a r10 = new e1.h$a
            r10.<init>(r9)
            r8.addListener(r10)
        L_0x007e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p060e1.C5928h.mo16528r(android.view.ViewGroup, e1.q0, e1.q0):android.animation.Animator");
    }
}

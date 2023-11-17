package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.session.C0125b;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;
import p009a8.C0072b;
import p009a8.C0081k;

public abstract class BottomAppBar extends Toolbar implements CoordinatorLayout.C0643b {

    /* renamed from: a0 */
    private static final int f15580a0 = C0081k.f369q;

    /* renamed from: b0 */
    private static final int f15581b0 = C0072b.motionDurationLong2;

    /* renamed from: c0 */
    private static final int f15582c0 = C0072b.motionEasingEmphasizedInterpolator;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4941a();

        /* renamed from: f */
        int f15588f;

        /* renamed from: g */
        boolean f15589g;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$a */
        class C4941a implements Parcelable.ClassLoaderCreator {
            C4941a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            boolean z;
            this.f15588f = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f15589g = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f15588f);
            parcel.writeInt(this.f15589g ? 1 : 0);
        }
    }

    /* renamed from: S */
    static /* synthetic */ void m18883S(BottomAppBar bottomAppBar) {
        throw null;
    }

    /* renamed from: T */
    static /* synthetic */ View m18884T(BottomAppBar bottomAppBar) {
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public static void m18886V(BottomAppBar bottomAppBar, View view) {
        ((CoordinatorLayout.C0647f) view.getLayoutParams()).f3218d = 17;
        throw null;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: f */
        private final Rect f15583f = new Rect();
        /* access modifiers changed from: private */

        /* renamed from: g */
        public WeakReference f15584g;

        /* renamed from: h */
        private int f15585h;

        /* renamed from: i */
        private final View.OnLayoutChangeListener f15586i = new C4940a();

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        class C4940a implements View.OnLayoutChangeListener {
            C4940a() {
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C0125b.m366a(Behavior.this.f15584g.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
        }

        /* renamed from: A */
        public /* bridge */ /* synthetic */ boolean mo3031A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            C0125b.m366a(view);
            return mo15549P(coordinatorLayout, (BottomAppBar) null, view2, view3, i, i2);
        }

        /* renamed from: O */
        public boolean mo15548O(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f15584g = new WeakReference(bottomAppBar);
            View T = BottomAppBar.m18884T(bottomAppBar);
            if (T != null && !ViewCompat.m3579V(T)) {
                BottomAppBar.m18886V(bottomAppBar, T);
                this.f15585h = ((CoordinatorLayout.C0647f) T.getLayoutParams()).bottomMargin;
                T.addOnLayoutChangeListener(this.f15586i);
                BottomAppBar.m18883S(bottomAppBar);
            }
            coordinatorLayout.mo2968C(bottomAppBar, i);
            return super.mo3046l(coordinatorLayout, bottomAppBar, i);
        }

        /* renamed from: P */
        public boolean mo15549P(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            throw null;
        }

        /* renamed from: l */
        public /* bridge */ /* synthetic */ boolean mo3046l(CoordinatorLayout coordinatorLayout, View view, int i) {
            C0125b.m366a(view);
            return mo15548O(coordinatorLayout, (BottomAppBar) null, i);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}

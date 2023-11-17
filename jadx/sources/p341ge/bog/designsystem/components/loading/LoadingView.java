package p341ge.bog.designsystem.components.loading;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.facebook.shimmer.ShimmerFrameLayout;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p601sg.C17787l;

/* renamed from: ge.bog.designsystem.components.loading.LoadingView */
public final class LoadingView extends ShimmerFrameLayout {

    /* renamed from: g */
    public static final C13375a f39779g = new C13375a((DefaultConstructorMarker) null);

    /* renamed from: ge.bog.designsystem.components.loading.LoadingView$a */
    public static final class C13375a {
        private C13375a() {
        }

        public /* synthetic */ C13375a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.loading.LoadingView$b */
    public enum C13376b {
        HORIZONTAL(0),
        VERTICAL(1);
        

        /* renamed from: e */
        public static final C13377a f39780e = null;

        /* renamed from: d */
        private final int f39784d;

        /* renamed from: ge.bog.designsystem.components.loading.LoadingView$b$a */
        public static final class C13377a {
            private C13377a() {
            }

            public /* synthetic */ C13377a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C13376b mo36132a(int i) {
                C13376b bVar;
                boolean z;
                C13376b[] values = C13376b.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        bVar = null;
                        break;
                    }
                    bVar = values[i2];
                    if (bVar.mo36131b() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    i2++;
                }
                if (bVar == null) {
                    return C13376b.VERTICAL;
                }
                return bVar;
            }
        }

        static {
            f39780e = new C13377a((DefaultConstructorMarker) null);
        }

        private C13376b(int i) {
            this.f39784d = i;
        }

        /* renamed from: b */
        public final int mo36131b() {
            return this.f39784d;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: androidx.core.widget.NestedScrollView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.widget.LinearLayout} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m50314g(int r5, int r6, boolean r7, p341ge.bog.designsystem.components.loading.LoadingView.C13376b r8) {
        /*
            r4 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            int r8 = r8.mo36131b()
            r0.setOrientation(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r2 = -2
            r8.<init>(r1, r2)
            r0.setLayoutParams(r8)
            android.content.Context r8 = r4.getContext()
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
            r3 = 1
            if (r3 > r5) goto L_0x002d
        L_0x0025:
            r8.inflate(r6, r0)
            if (r3 == r5) goto L_0x002d
            int r3 = r3 + 1
            goto L_0x0025
        L_0x002d:
            if (r7 == 0) goto L_0x0044
            androidx.core.widget.NestedScrollView r5 = new androidx.core.widget.NestedScrollView
            android.content.Context r6 = r4.getContext()
            r5.<init>(r6)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r6.<init>(r1, r2)
            r5.setLayoutParams(r6)
            r5.addView(r0)
            r0 = r5
        L_0x0044:
            r4.addView(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.loading.LoadingView.m50314g(int, int, boolean, ge.bog.designsystem.components.loading.LoadingView$b):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoadingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        if (attributeSet != null) {
            int[] iArr = C17787l.f50558u7;
            C41536l.m120488h(iArr, "LoadingView");
            boolean z = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
            int i2 = obtainStyledAttributes.getInt(C17787l.f50588w7, 2);
            Integer valueOf = Integer.valueOf(obtainStyledAttributes.getResourceId(C17787l.f50603x7, 0));
            valueOf = !(valueOf.intValue() != 0 ? true : z) ? null : valueOf;
            if (valueOf != null) {
                m50314g(i2, valueOf.intValue(), obtainStyledAttributes.getBoolean(C17787l.f50618y7, true), C13376b.f39780e.mo36132a(obtainStyledAttributes.getInt(C17787l.f50573v7, 1)));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoadingView(Context context, int i, int i2, boolean z, C13376b bVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, i2, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? C13376b.VERTICAL : bVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LoadingView(Context context, int i, int i2, boolean z, C13376b bVar) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
        C41536l.m120489i(bVar, "orientation");
        m50314g(i, i2, z, bVar);
    }
}

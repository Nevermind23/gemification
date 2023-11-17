package p341ge.bog.designsystem.components.actionsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p352ak.C10009s0;
import p601sg.C17787l;

/* renamed from: ge.bog.designsystem.components.actionsheet.ActionSheetTitle */
public final class ActionSheetTitle extends ConstraintLayout {

    /* renamed from: d */
    private C13155a f38747d;

    /* renamed from: e */
    private final C10009s0 f38748e;

    /* renamed from: ge.bog.designsystem.components.actionsheet.ActionSheetTitle$a */
    public enum C13155a {
        BASIC(0, 8, 8),
        CAPTION(0, 0, 8),
        BADGE(0, 8, 0),
        EMPTY(8, 8, 8);
        

        /* renamed from: g */
        public static final C13156a f38749g = null;

        /* renamed from: d */
        private final int f38755d;

        /* renamed from: e */
        private final int f38756e;

        /* renamed from: f */
        private final int f38757f;

        /* renamed from: ge.bog.designsystem.components.actionsheet.ActionSheetTitle$a$a */
        public static final class C13156a {
            private C13156a() {
            }

            public /* synthetic */ C13156a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C13155a mo34769a(int i) {
                C13155a aVar;
                boolean z;
                C13155a[] values = C13155a.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        aVar = null;
                        break;
                    }
                    aVar = values[i2];
                    if (aVar.ordinal() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    i2++;
                }
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalStateException("Unknown title type");
            }
        }

        static {
            f38749g = new C13156a((DefaultConstructorMarker) null);
        }

        private C13155a(int i, int i2, int i3) {
            this.f38755d = i;
            this.f38756e = i2;
            this.f38757f = i3;
        }

        /* renamed from: b */
        public final int mo34766b() {
            return this.f38756e;
        }

        /* renamed from: c */
        public final int mo34767c() {
            return this.f38757f;
        }

        /* renamed from: e */
        public final int mo34768e() {
            return this.f38755d;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ActionSheetTitle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: h */
    private final void m49540h(C13155a aVar) {
        if (aVar != null) {
            C10009s0 s0Var = this.f38748e;
            s0Var.f27492g.setVisibility(aVar.mo34768e());
            s0Var.f27490e.setVisibility(aVar.mo34766b());
            s0Var.f27491f.setVisibility(aVar.mo34767c());
        }
    }

    public final C13155a getType() {
        return this.f38747d;
    }

    public final void setCaption(String str) {
        if (str != null) {
            this.f38748e.f27490e.setText(str);
        }
    }

    public final void setItem(View view) {
        if (view != null) {
            FrameLayout frameLayout = this.f38748e.f27491f;
            frameLayout.removeAllViews();
            frameLayout.addView(view);
        }
    }

    public final void setTitle(String str) {
        if (str != null) {
            this.f38748e.f27492g.setText(str);
        }
    }

    public final void setType(C13155a aVar) {
        m49540h(aVar);
        this.f38747d = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActionSheetTitle(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActionSheetTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C10009s0 d = C10009s0.m36712d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f38748e = d;
        int[] iArr = C17787l.f50279d0;
        C41536l.m120488h(iArr, "ActionSheetTitle");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setType(C13155a.f38749g.mo34769a(obtainStyledAttributes.getInt(C17787l.f50327g0, 0)));
        setTitle(obtainStyledAttributes.getString(C17787l.f50311f0));
        setCaption(obtainStyledAttributes.getString(C17787l.f50295e0));
        obtainStyledAttributes.recycle();
    }
}

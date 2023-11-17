package p630ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.github.mikephil.charting.utils.Utils;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p601sg.C17787l;
import p630ui.C18171b;

/* renamed from: ui.a */
public final class C18168a {

    /* renamed from: c */
    public static final C18170b f51475c = new C18170b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final int f51476a;

    /* renamed from: b */
    private final C18169a f51477b;

    /* renamed from: ui.a$a */
    public static final class C18169a {

        /* renamed from: a */
        private final float f51478a;

        /* renamed from: b */
        private final float f51479b;

        /* renamed from: c */
        private final float f51480c;

        /* renamed from: d */
        private final boolean f51481d;

        /* renamed from: e */
        private final int f51482e;

        public C18169a(float f, float f2, float f3, boolean z, int i) {
            this.f51478a = f;
            this.f51479b = f2;
            this.f51480c = f3;
            this.f51481d = z;
            this.f51482e = i;
        }

        /* renamed from: a */
        public final float mo45825a() {
            return this.f51478a;
        }

        /* renamed from: b */
        public final float mo45826b() {
            return this.f51479b;
        }

        /* renamed from: c */
        public final float mo45827c() {
            return this.f51480c;
        }

        /* renamed from: d */
        public final boolean mo45828d() {
            return this.f51481d;
        }

        /* renamed from: e */
        public final int mo45829e() {
            return this.f51482e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18169a)) {
                return false;
            }
            C18169a aVar = (C18169a) obj;
            return Float.compare(this.f51478a, aVar.f51478a) == 0 && Float.compare(this.f51479b, aVar.f51479b) == 0 && Float.compare(this.f51480c, aVar.f51480c) == 0 && this.f51481d == aVar.f51481d && this.f51482e == aVar.f51482e;
        }

        public int hashCode() {
            int floatToIntBits = ((((Float.floatToIntBits(this.f51478a) * 31) + Float.floatToIntBits(this.f51479b)) * 31) + Float.floatToIntBits(this.f51480c)) * 31;
            boolean z = this.f51481d;
            if (z) {
                z = true;
            }
            return ((floatToIntBits + (z ? 1 : 0)) * 31) + this.f51482e;
        }

        public String toString() {
            float f = this.f51478a;
            float f2 = this.f51479b;
            float f3 = this.f51480c;
            boolean z = this.f51481d;
            int i = this.f51482e;
            return "Attrs(cornerRadius=" + f + ", shadowElevation=" + f2 + ", shadowAlpha=" + f3 + ", isCircle=" + z + ", cornersAt=" + i + ")";
        }
    }

    /* renamed from: ui.a$b */
    public static final class C18170b {
        private C18170b() {
        }

        public /* synthetic */ C18170b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo45833a(View view) {
            C41536l.m120489i(view, "targetView");
            view.setOutlineProvider((ViewOutlineProvider) null);
            view.setElevation(Utils.FLOAT_EPSILON);
            view.setClipToOutline(false);
        }
    }

    /* JADX INFO: finally extract failed */
    public C18168a(Context context, int i) {
        C41536l.m120489i(context, "context");
        this.f51476a = i;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, C17787l.f50192X6);
        C41536l.m120488h(obtainStyledAttributes, "context.theme.obtainStyl…ResId, R.styleable.Layer)");
        try {
            C18169a aVar = new C18169a(obtainStyledAttributes.getDimension(C17787l.f50207Y6, Utils.FLOAT_EPSILON), obtainStyledAttributes.getDimension(C17787l.f50270c7, Utils.FLOAT_EPSILON), obtainStyledAttributes.getFraction(C17787l.f50254b7, 1, 1, Utils.FLOAT_EPSILON), obtainStyledAttributes.getBoolean(C17787l.f50238a7, false), obtainStyledAttributes.getInt(C17787l.f50222Z6, 0));
            obtainStyledAttributes.recycle();
            this.f51477b = aVar;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo45824a(View view) {
        ViewOutlineProvider viewOutlineProvider;
        C41536l.m120489i(view, "targetView");
        C18169a aVar = this.f51477b;
        float a = aVar.mo45825a();
        float b = aVar.mo45826b();
        float c = aVar.mo45827c();
        boolean d = aVar.mo45828d();
        int e = aVar.mo45829e();
        if (d) {
            viewOutlineProvider = new C18171b.C18172a(c);
        } else {
            viewOutlineProvider = new C18171b.C18173b(c, a, e);
        }
        view.setOutlineProvider(viewOutlineProvider);
        view.setElevation(b);
        view.setClipToOutline(true);
    }
}

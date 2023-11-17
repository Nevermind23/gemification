package o31;

import android.view.View;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43064a;

/* renamed from: o31.t */
public final class C37617t implements View.OnClickListener {

    /* renamed from: g */
    public static final C37618a f90373g = new C37618a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final long f90374d;

    /* renamed from: e */
    private final C43064a f90375e;

    /* renamed from: f */
    private long f90376f = -1;

    /* renamed from: o31.t$a */
    public static final class C37618a {
        private C37618a() {
        }

        public /* synthetic */ C37618a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C37617t(long j, C43064a aVar) {
        C41536l.m120489i(aVar, "onClick");
        this.f90374d = j;
        this.f90375e = aVar;
    }

    /* renamed from: a */
    private final boolean m110619a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f90376f + this.f90374d >= currentTimeMillis) {
            return false;
        }
        this.f90376f = currentTimeMillis;
        return true;
    }

    public void onClick(View view) {
        if (m110619a()) {
            this.f90375e.invoke();
        }
    }
}

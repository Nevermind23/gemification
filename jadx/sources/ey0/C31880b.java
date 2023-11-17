package ey0;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ox0.C37833c;
import p341ge.bog.mobilebank.shared.helper.C34646b;

/* renamed from: ey0.b */
public enum C31880b {
    INITIAL_LOADING(0),
    FIRST_PAGE(1),
    ADDITIONAL_INFO_TO_GET(2),
    FINAL_PAGE(3),
    OTP_IN_PROGRESS(4),
    ACTION_IN_PROGRESS(5);
    

    /* renamed from: e */
    public static final C31881a f78599e = null;

    /* renamed from: d */
    private final int f78607d;

    /* renamed from: ey0.b$a */
    public static final class C31881a {
        private C31881a() {
        }

        public /* synthetic */ C31881a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        f78599e = new C31881a((DefaultConstructorMarker) null);
    }

    private C31880b(int i) {
        this.f78607d = i;
    }

    /* renamed from: b */
    public final String mo72311b() {
        boolean z;
        int i = this.f78607d;
        if (i == INITIAL_LOADING.f78607d || i == FIRST_PAGE.f78607d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C34646b.m101752f(C37833c.f90838a.mo91164z(), (Context) null, 1, (Object) null);
        }
        return C34646b.m101752f(C37833c.f90838a.mo91115A(), (Context) null, 1, (Object) null);
    }
}

package p156l6;

import android.app.Activity;
import androidx.fragment.app.C1505h;
import p182n6.C7264i;

/* renamed from: l6.f */
public class C6940f {

    /* renamed from: a */
    private final Object f20814a;

    public C6940f(Activity activity) {
        C7264i.m27903l(activity, "Activity must not be null");
        this.f20814a = activity;
    }

    /* renamed from: a */
    public final Activity mo21081a() {
        return (Activity) this.f20814a;
    }

    /* renamed from: b */
    public final C1505h mo21082b() {
        return (C1505h) this.f20814a;
    }

    /* renamed from: c */
    public final boolean mo21083c() {
        return this.f20814a instanceof Activity;
    }

    /* renamed from: d */
    public final boolean mo21084d() {
        return this.f20814a instanceof C1505h;
    }
}

package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.core.app.ActivityCompat;
import androidx.core.content.C0767a;
import androidx.core.util.C1008h;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.m */
public abstract class C1529m extends C1513j {

    /* renamed from: d */
    private final Activity f4462d;

    /* renamed from: e */
    private final Context f4463e;

    /* renamed from: f */
    private final Handler f4464f;

    /* renamed from: g */
    private final int f4465g;

    /* renamed from: h */
    final FragmentManager f4466h;

    C1529m(C1505h hVar) {
        this(hVar, hVar, new Handler(), 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Activity mo4761e() {
        return this.f4462d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Context mo4762f() {
        return this.f4463e;
    }

    /* renamed from: g */
    public Handler mo4763g() {
        return this.f4464f;
    }

    /* renamed from: h */
    public abstract void mo4696h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: i */
    public abstract Object mo4697i();

    /* renamed from: j */
    public abstract LayoutInflater mo4698j();

    /* renamed from: k */
    public void mo4764k(Fragment fragment, String[] strArr, int i) {
    }

    /* renamed from: l */
    public abstract boolean mo4699l(String str);

    /* renamed from: m */
    public void mo4765m(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            C0767a.m2903m(this.f4463e, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    /* renamed from: n */
    public void mo4766n(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i == -1) {
            ActivityCompat.m2594z(this.f4462d, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
    }

    /* renamed from: o */
    public abstract void mo4700o();

    C1529m(Activity activity, Context context, Handler handler, int i) {
        this.f4466h = new C1543w();
        this.f4462d = activity;
        this.f4463e = (Context) C1008h.m3531h(context, "context == null");
        this.f4464f = (Handler) C1008h.m3531h(handler, "handler == null");
        this.f4465g = i;
    }
}

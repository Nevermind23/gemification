package p248s7;

import com.google.android.gms.internal.measurement.C4374qf;
import com.google.android.gms.measurement.internal.C4659h4;
import com.google.android.gms.measurement.internal.C4725n4;
import java.util.concurrent.Callable;

/* renamed from: s7.l */
public final /* synthetic */ class C8258l implements Callable {

    /* renamed from: d */
    public final /* synthetic */ C4725n4 f23458d;

    /* renamed from: e */
    public final /* synthetic */ String f23459e;

    public /* synthetic */ C8258l(C4725n4 n4Var, String str) {
        this.f23458d = n4Var;
        this.f23459e = str;
    }

    public final Object call() {
        return new C4374qf("internal.appMetadata", new C4659h4(this.f23458d, this.f23459e));
    }
}

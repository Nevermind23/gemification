package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.C1565c0;
import androidx.startup.C1851a;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p019b1.C2109a;

public final class ProcessLifecycleInitializer implements C2109a {
    /* renamed from: a */
    public List mo3965a() {
        return C41341q.m119907j();
    }

    /* renamed from: c */
    public C1619q mo3966b(Context context) {
        C41536l.m120489i(context, "context");
        C1851a e = C1851a.m7225e(context);
        C41536l.m120488h(e, "getInstance(context)");
        if (e.mo6134g(ProcessLifecycleInitializer.class)) {
            C1602l.m5645a(context);
            C1565c0.C1567b bVar = C1565c0.f4566l;
            bVar.mo4858b(context);
            return bVar.mo4857a();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}

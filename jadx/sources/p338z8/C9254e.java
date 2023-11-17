package p338z8;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import p327y9.C9142b;

/* renamed from: z8.e */
public final /* synthetic */ class C9254e implements C9142b {
    public final Object get() {
        return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.m20715j("Firebase Scheduler", 0));
    }
}

package p338z8;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import p327y9.C9142b;

/* renamed from: z8.c */
public final /* synthetic */ class C9252c implements C9142b {
    public final Object get() {
        return ExecutorsRegistrar.m20726u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.m20716k("Firebase Lite", 0, ExecutorsRegistrar.m20725t())));
    }
}

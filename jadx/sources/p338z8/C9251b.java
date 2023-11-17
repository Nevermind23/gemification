package p338z8;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import p327y9.C9142b;

/* renamed from: z8.b */
public final /* synthetic */ class C9251b implements C9142b {
    public final Object get() {
        return ExecutorsRegistrar.m20726u(Executors.newFixedThreadPool(4, ExecutorsRegistrar.m20716k("Firebase Background", 10, ExecutorsRegistrar.m20714i())));
    }
}

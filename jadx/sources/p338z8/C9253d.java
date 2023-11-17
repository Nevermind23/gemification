package p338z8;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import p327y9.C9142b;

/* renamed from: z8.d */
public final /* synthetic */ class C9253d implements C9142b {
    public final Object get() {
        return ExecutorsRegistrar.m20726u(Executors.newCachedThreadPool(ExecutorsRegistrar.m20715j("Firebase Blocking", 11)));
    }
}

package p653wf;

import android.app.Application;
import kotlin.jvm.internal.C41536l;
import p391dg.C12111a;

/* renamed from: wf.d */
public final class C18574d {

    /* renamed from: a */
    public static final C18574d f52090a = new C18574d();

    /* renamed from: b */
    private static C18570b f52091b;

    private C18574d() {
    }

    /* renamed from: a */
    public final C18569a mo46428a(Application application, C18572c cVar) {
        C41536l.m120489i(application, "application");
        C41536l.m120489i(cVar, "chatConfig");
        if (f52091b == null) {
            C18570b a = C18579i.m63113f().mo46410c(application).mo46409b(new C12111a(cVar)).mo46408a();
            f52091b = a;
            C41536l.m120486f(a);
            return a.mo46407e();
        }
        throw new IllegalStateException("Chat is already created");
    }

    /* renamed from: b */
    public final C18570b mo46429b() {
        return f52091b;
    }
}

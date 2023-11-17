package p667xf;

import com.google.gson.Gson;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.chat.data.entitiy.Session;

/* renamed from: xf.t0 */
public final class C18749t0 {

    /* renamed from: a */
    private final Gson f52423a;

    /* renamed from: b */
    private Session f52424b;

    public C18749t0(Gson gson) {
        C41536l.m120489i(gson, "gson");
        this.f52423a = gson;
    }

    /* renamed from: a */
    public final Session mo46524a() {
        Session session;
        synchronized (this) {
            session = this.f52424b;
        }
        return session;
    }

    /* renamed from: b */
    public final boolean mo46525b() {
        return this.f52424b == null;
    }

    /* renamed from: c */
    public final void mo46526c() {
        synchronized (this) {
            this.f52424b = null;
            C41238w wVar = C41238w.f97225a;
        }
    }

    /* renamed from: d */
    public final void mo46527d(Session session) {
        synchronized (this) {
            this.f52424b = session;
            C41238w wVar = C41238w.f97225a;
        }
    }
}

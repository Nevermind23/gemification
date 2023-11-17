package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.jvm.internal.C41536l;

public final class RouteException extends RuntimeException {

    /* renamed from: d */
    private final IOException f98689d;

    /* renamed from: e */
    private IOException f98690e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RouteException(IOException iOException) {
        super(iOException);
        C41536l.m120489i(iOException, "firstConnectException");
        this.f98689d = iOException;
        this.f98690e = iOException;
    }

    /* renamed from: a */
    public final void mo97164a(IOException iOException) {
        C41536l.m120489i(iOException, "e");
        C41211b.m119461a(this.f98689d, iOException);
        this.f98690e = iOException;
    }

    /* renamed from: b */
    public final IOException mo97165b() {
        return this.f98689d;
    }

    /* renamed from: c */
    public final IOException mo97166c() {
        return this.f98690e;
    }
}

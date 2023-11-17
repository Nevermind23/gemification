package dg1;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.C41536l;

/* renamed from: dg1.y */
final class C40706y extends C40664a {

    /* renamed from: m */
    private final Socket f96385m;

    public C40706y(Socket socket) {
        C41536l.m120489i(socket, "socket");
        this.f96385m = socket;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public IOException mo94667v(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo94670z() {
        try {
            this.f96385m.close();
        } catch (Exception e) {
            C40692n.f96351a.log(Level.WARNING, C41536l.m120497q("Failed to close timed out socket ", this.f96385m), e);
        } catch (AssertionError e2) {
            if (C40691m.m117771c(e2)) {
                C40692n.f96351a.log(Level.WARNING, C41536l.m120497q("Failed to close timed out socket ", this.f96385m), e2);
                return;
            }
            throw e2;
        }
    }
}

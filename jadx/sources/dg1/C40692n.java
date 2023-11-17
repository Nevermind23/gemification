package dg1;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.C41536l;

/* renamed from: dg1.n */
abstract /* synthetic */ class C40692n {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Logger f96351a = Logger.getLogger("okio.Okio");

    /* renamed from: b */
    public static final boolean m117777b(AssertionError assertionError) {
        boolean z;
        C41536l.m120489i(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        if (message == null) {
            z = false;
        } else {
            z = C40440x.m117139M(message, "getsockname failed", false, 2, (Object) null);
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final C40705x m117778c(Socket socket) {
        C41536l.m120489i(socket, "<this>");
        C40706y yVar = new C40706y(socket);
        OutputStream outputStream = socket.getOutputStream();
        C41536l.m120488h(outputStream, "getOutputStream()");
        return yVar.mo94668x(new C40696q(outputStream, yVar));
    }

    /* renamed from: d */
    public static final C40707z m117779d(File file) {
        C41536l.m120489i(file, "<this>");
        return new C40690l(new FileInputStream(file), C40669a0.f96310e);
    }

    /* renamed from: e */
    public static final C40707z m117780e(InputStream inputStream) {
        C41536l.m120489i(inputStream, "<this>");
        return new C40690l(inputStream, new C40669a0());
    }

    /* renamed from: f */
    public static final C40707z m117781f(Socket socket) {
        C41536l.m120489i(socket, "<this>");
        C40706y yVar = new C40706y(socket);
        InputStream inputStream = socket.getInputStream();
        C41536l.m120488h(inputStream, "getInputStream()");
        return yVar.mo94669y(new C40690l(inputStream, yVar));
    }
}

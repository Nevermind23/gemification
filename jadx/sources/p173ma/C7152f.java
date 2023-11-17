package p173ma;

import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import p134ja.C6763a;
import p147ka.C6851h;

/* renamed from: ma.f */
public abstract class C7152f {

    /* renamed from: a */
    private static final Pattern f21172a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    /* renamed from: a */
    public static Long m27524a(HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            C6763a.m26371e().mo20804a("The content-length value is not a valid number");
            return null;
        }
    }

    /* renamed from: b */
    public static String m27525b(HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }

    /* renamed from: c */
    public static boolean m27526c(String str) {
        return str == null || !f21172a.matcher(str).matches();
    }

    /* renamed from: d */
    public static void m27527d(C6851h hVar) {
        if (!hVar.mo20909g()) {
            hVar.mo20912m();
        }
        hVar.mo20906b();
    }
}

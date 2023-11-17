package retrofit2;

import java.util.Objects;
import zh1.C43510v;

public class HttpException extends RuntimeException {

    /* renamed from: d */
    private final int f99607d;

    /* renamed from: e */
    private final String f99608e;

    /* renamed from: f */
    private final transient C43510v f99609f;

    public HttpException(C43510v vVar) {
        super(m122880b(vVar));
        this.f99607d = vVar.mo102215b();
        this.f99608e = vVar.mo102217e();
        this.f99609f = vVar;
    }

    /* renamed from: b */
    private static String m122880b(C43510v vVar) {
        Objects.requireNonNull(vVar, "response == null");
        return "HTTP " + vVar.mo102215b() + " " + vVar.mo102217e();
    }

    /* renamed from: a */
    public int mo97818a() {
        return this.f99607d;
    }
}

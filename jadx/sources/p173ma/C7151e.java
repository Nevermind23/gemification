package p173ma;

import com.google.firebase.perf.util.Timer;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import p147ka.C6851h;

/* renamed from: ma.e */
public class C7151e implements ResponseHandler {

    /* renamed from: a */
    private final ResponseHandler f21169a;

    /* renamed from: b */
    private final Timer f21170b;

    /* renamed from: c */
    private final C6851h f21171c;

    public C7151e(ResponseHandler responseHandler, Timer timer, C6851h hVar) {
        this.f21169a = responseHandler;
        this.f21170b = timer;
        this.f21171c = hVar;
    }

    public Object handleResponse(HttpResponse httpResponse) {
        this.f21171c.mo20918u(this.f21170b.mo18040d());
        this.f21171c.mo20911l(httpResponse.getStatusLine().getStatusCode());
        Long a = C7152f.m27524a(httpResponse);
        if (a != null) {
            this.f21171c.mo20916s(a.longValue());
        }
        String b = C7152f.m27525b(httpResponse);
        if (b != null) {
            this.f21171c.mo20915r(b);
        }
        this.f21171c.mo20906b();
        return this.f21169a.handleResponse(httpResponse);
    }
}

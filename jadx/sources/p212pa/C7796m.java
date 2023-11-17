package p212pa;

import java.net.URL;
import java.net.URLConnection;

/* renamed from: pa.m */
public class C7796m {

    /* renamed from: a */
    private final URL f22520a;

    public C7796m(URL url) {
        this.f22520a = url;
    }

    /* renamed from: a */
    public URLConnection mo22551a() {
        return this.f22520a.openConnection();
    }

    public String toString() {
        return this.f22520a.toString();
    }
}

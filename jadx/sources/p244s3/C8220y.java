package p244s3;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p166m3.C7088h;
import p244s3.C8188n;

/* renamed from: s3.y */
public class C8220y implements C8188n {

    /* renamed from: b */
    private static final Set f23393b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a */
    private final C8188n f23394a;

    /* renamed from: s3.y$a */
    public static class C8221a implements C8190o {
        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8220y(rVar.mo23396d(C8175h.class, InputStream.class));
        }
    }

    public C8220y(C8188n nVar) {
        this.f23394a = nVar;
    }

    /* renamed from: c */
    public C8188n.C8189a mo23326a(Uri uri, int i, int i2, C7088h hVar) {
        return this.f23394a.mo23326a(new C8175h(uri.toString()), i, i2, hVar);
    }

    /* renamed from: d */
    public boolean mo23327b(Uri uri) {
        return f23393b.contains(uri.getScheme());
    }
}

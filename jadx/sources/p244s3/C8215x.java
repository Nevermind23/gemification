package p244s3;

import android.content.ContentResolver;
import android.net.Uri;
import com.bumptech.glide.load.data.C2412a;
import com.bumptech.glide.load.data.C2415d;
import com.bumptech.glide.load.data.C2424i;
import com.bumptech.glide.load.data.C2432n;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p076f4.C6156d;
import p166m3.C7088h;
import p244s3.C8188n;

/* renamed from: s3.x */
public class C8215x implements C8188n {

    /* renamed from: b */
    private static final Set f23388b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "content", "android.resource"})));

    /* renamed from: a */
    private final C8218c f23389a;

    /* renamed from: s3.x$a */
    public static final class C8216a implements C8190o, C8218c {

        /* renamed from: a */
        private final ContentResolver f23390a;

        public C8216a(ContentResolver contentResolver) {
            this.f23390a = contentResolver;
        }

        /* renamed from: a */
        public C2415d mo23410a(Uri uri) {
            return new C2412a(this.f23390a, uri);
        }

        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8215x(this);
        }
    }

    /* renamed from: s3.x$b */
    public static class C8217b implements C8190o, C8218c {

        /* renamed from: a */
        private final ContentResolver f23391a;

        public C8217b(ContentResolver contentResolver) {
            this.f23391a = contentResolver;
        }

        /* renamed from: a */
        public C2415d mo23410a(Uri uri) {
            return new C2424i(this.f23391a, uri);
        }

        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8215x(this);
        }
    }

    /* renamed from: s3.x$c */
    public interface C8218c {
        /* renamed from: a */
        C2415d mo23410a(Uri uri);
    }

    /* renamed from: s3.x$d */
    public static class C8219d implements C8190o, C8218c {

        /* renamed from: a */
        private final ContentResolver f23392a;

        public C8219d(ContentResolver contentResolver) {
            this.f23392a = contentResolver;
        }

        /* renamed from: a */
        public C2415d mo23410a(Uri uri) {
            return new C2432n(this.f23392a, uri);
        }

        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8215x(this);
        }
    }

    public C8215x(C8218c cVar) {
        this.f23389a = cVar;
    }

    /* renamed from: c */
    public C8188n.C8189a mo23326a(Uri uri, int i, int i2, C7088h hVar) {
        return new C8188n.C8189a(new C6156d(uri), this.f23389a.mo23410a(uri));
    }

    /* renamed from: d */
    public boolean mo23327b(Uri uri) {
        return f23388b.contains(uri.getScheme());
    }
}

package p244s3;

import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.load.data.C2415d;
import com.bumptech.glide.load.data.C2423h;
import com.bumptech.glide.load.data.C2431m;
import p076f4.C6156d;
import p166m3.C7088h;
import p244s3.C8188n;

/* renamed from: s3.a */
public class C8141a implements C8188n {

    /* renamed from: c */
    private static final int f23289c = 22;

    /* renamed from: a */
    private final AssetManager f23290a;

    /* renamed from: b */
    private final C8142a f23291b;

    /* renamed from: s3.a$a */
    public interface C8142a {
        /* renamed from: a */
        C2415d mo23330a(AssetManager assetManager, String str);
    }

    /* renamed from: s3.a$b */
    public static class C8143b implements C8190o, C8142a {

        /* renamed from: a */
        private final AssetManager f23292a;

        public C8143b(AssetManager assetManager) {
            this.f23292a = assetManager;
        }

        /* renamed from: a */
        public C2415d mo23330a(AssetManager assetManager, String str) {
            return new C2423h(assetManager, str);
        }

        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8141a(this.f23292a, this);
        }
    }

    /* renamed from: s3.a$c */
    public static class C8144c implements C8190o, C8142a {

        /* renamed from: a */
        private final AssetManager f23293a;

        public C8144c(AssetManager assetManager) {
            this.f23293a = assetManager;
        }

        /* renamed from: a */
        public C2415d mo23330a(AssetManager assetManager, String str) {
            return new C2431m(assetManager, str);
        }

        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8141a(this.f23293a, this);
        }
    }

    public C8141a(AssetManager assetManager, C8142a aVar) {
        this.f23290a = assetManager;
        this.f23291b = aVar;
    }

    /* renamed from: c */
    public C8188n.C8189a mo23326a(Uri uri, int i, int i2, C7088h hVar) {
        return new C8188n.C8189a(new C6156d(uri), this.f23291b.mo23330a(this.f23290a, uri.toString().substring(f23289c)));
    }

    /* renamed from: d */
    public boolean mo23327b(Uri uri) {
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }
}

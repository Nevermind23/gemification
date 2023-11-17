package p244s3;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;
import p166m3.C7088h;
import p244s3.C8188n;

/* renamed from: s3.t */
public final class C8204t implements C8188n {

    /* renamed from: a */
    private final Context f23379a;

    /* renamed from: b */
    private final C8188n f23380b;

    /* renamed from: s3.t$a */
    private static final class C8205a implements C8190o {

        /* renamed from: a */
        private final Context f23381a;

        C8205a(Context context) {
            this.f23381a = context;
        }

        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8204t(this.f23381a, rVar.mo23396d(Integer.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: s3.t$b */
    private static final class C8206b implements C8190o {

        /* renamed from: a */
        private final Context f23382a;

        C8206b(Context context) {
            this.f23382a = context;
        }

        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8204t(this.f23382a, rVar.mo23396d(Integer.class, InputStream.class));
        }
    }

    C8204t(Context context, C8188n nVar) {
        this.f23379a = context.getApplicationContext();
        this.f23380b = nVar;
    }

    /* renamed from: e */
    public static C8190o m30934e(Context context) {
        return new C8205a(context);
    }

    /* renamed from: f */
    public static C8190o m30935f(Context context) {
        return new C8206b(context);
    }

    /* renamed from: g */
    private C8188n.C8189a m30936g(Uri uri, int i, int i2, C7088h hVar) {
        try {
            int parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            if (parseInt != 0) {
                return this.f23380b.mo23326a(Integer.valueOf(parseInt), i, i2, hVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e);
            }
            return null;
        }
    }

    /* renamed from: h */
    private C8188n.C8189a m30937h(Uri uri, int i, int i2, C7088h hVar) {
        List<String> pathSegments = uri.getPathSegments();
        String str = pathSegments.get(1);
        int identifier = this.f23379a.getResources().getIdentifier(str, pathSegments.get(0), this.f23379a.getPackageName());
        if (identifier != 0) {
            return this.f23380b.mo23326a(Integer.valueOf(identifier), i, i2, hVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }

    /* renamed from: c */
    public C8188n.C8189a mo23326a(Uri uri, int i, int i2, C7088h hVar) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return m30936g(uri, i, i2, hVar);
        }
        if (pathSegments.size() == 2) {
            return m30937h(uri, i, i2, hVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        return null;
    }

    /* renamed from: d */
    public boolean mo23327b(Uri uri) {
        if (!"android.resource".equals(uri.getScheme()) || !this.f23379a.getPackageName().equals(uri.getAuthority())) {
            return false;
        }
        return true;
    }
}

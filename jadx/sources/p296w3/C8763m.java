package p296w3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import p089g4.C6223k;
import p166m3.C7085g;
import p166m3.C7088h;
import p166m3.C7090j;
import p192o3.C7430c;

/* renamed from: w3.m */
public class C8763m implements C7090j {

    /* renamed from: b */
    public static final C7085g f24613b = C7085g.m27364e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* renamed from: a */
    private final Context f24614a;

    public C8763m(Context context) {
        this.f24614a = context.getApplicationContext();
    }

    /* renamed from: d */
    private Context m32601d(Uri uri, String str) {
        if (str.equals(this.f24614a.getPackageName())) {
            return this.f24614a;
        }
        try {
            return this.f24614a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.f24614a.getPackageName())) {
                return this.f24614a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    /* renamed from: e */
    private int m32602e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }

    /* renamed from: f */
    private int m32603f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    /* renamed from: g */
    private int m32604g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m32603f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m32602e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    /* renamed from: c */
    public C7430c mo7972b(Uri uri, int i, int i2, C7088h hVar) {
        Resources.Theme theme;
        Drawable drawable;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context d = m32601d(uri, authority);
            int g = m32604g(d, uri);
            if (((String) C6223k.m24730d(authority)).equals(this.f24614a.getPackageName())) {
                theme = (Resources.Theme) hVar.mo21312c(f24613b);
            } else {
                theme = null;
            }
            if (theme == null) {
                drawable = C8759i.m32588b(this.f24614a, d, g);
            } else {
                drawable = C8759i.m32587a(this.f24614a, g, theme);
            }
            return C8762l.m32598e(drawable);
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    /* renamed from: h */
    public boolean mo7971a(Uri uri, C7088h hVar) {
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equals("android.resource")) {
            return false;
        }
        return true;
    }
}

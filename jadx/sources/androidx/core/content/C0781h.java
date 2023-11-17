package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.content.h */
public abstract class C0781h extends ContentProvider {

    /* renamed from: f */
    private static final String[] f3400f = {"_display_name", "_size"};

    /* renamed from: g */
    private static final File f3401g = new File(C11110u2.f31950c);

    /* renamed from: h */
    private static final HashMap f3402h = new HashMap();

    /* renamed from: d */
    private C0783b f3403d;

    /* renamed from: e */
    private int f3404e;

    /* renamed from: androidx.core.content.h$a */
    static class C0782a {
        /* renamed from: a */
        static File[] m2936a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* renamed from: androidx.core.content.h$b */
    interface C0783b {
        /* renamed from: a */
        Uri mo3250a(File file);

        /* renamed from: b */
        File mo3251b(Uri uri);
    }

    /* renamed from: androidx.core.content.h$c */
    static class C0784c implements C0783b {

        /* renamed from: a */
        private final String f3405a;

        /* renamed from: b */
        private final HashMap f3406b = new HashMap();

        C0784c(String str) {
            this.f3405a = str;
        }

        /* renamed from: a */
        public Uri mo3250a(File file) {
            String str;
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry entry2 : this.f3406b.entrySet()) {
                    String path = ((File) entry2.getValue()).getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry != null) {
                    String path2 = ((File) entry.getValue()).getPath();
                    if (path2.endsWith(C11110u2.f31950c)) {
                        str = canonicalPath.substring(path2.length());
                    } else {
                        str = canonicalPath.substring(path2.length() + 1);
                    }
                    return new Uri.Builder().scheme("content").authority(this.f3405a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(str, C11110u2.f31950c)).build();
                }
                throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        /* renamed from: b */
        public File mo3251b(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = (File) this.f3406b.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                }
            } else {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3252c(String str, File file) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f3406b.put(str, file.getCanonicalFile());
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
                }
            } else {
                throw new IllegalArgumentException("Name must not be empty");
            }
        }
    }

    public C0781h() {
        this.f3404e = 0;
    }

    /* renamed from: a */
    private static File m2928a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    /* renamed from: b */
    private static Object[] m2929b(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    /* renamed from: c */
    private static String[] m2930c(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    /* renamed from: d */
    static XmlResourceParser m2931d(Context context, String str, ProviderInfo providerInfo, int i) {
        if (providerInfo != null) {
            if (providerInfo.metaData == null && i != 0) {
                Bundle bundle = new Bundle(1);
                providerInfo.metaData = bundle;
                bundle.putInt("android.support.FILE_PROVIDER_PATHS", i);
            }
            XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData != null) {
                return loadXmlMetaData;
            }
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
    }

    /* renamed from: e */
    private static C0783b m2932e(Context context, String str, int i) {
        C0783b bVar;
        HashMap hashMap = f3402h;
        synchronized (hashMap) {
            bVar = (C0783b) hashMap.get(str);
            if (bVar == null) {
                try {
                    bVar = m2935h(context, str, i);
                    hashMap.put(str, bVar);
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                } catch (XmlPullParserException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return bVar;
    }

    /* renamed from: f */
    public static Uri m2933f(Context context, String str, File file) {
        return m2932e(context, str, 0).mo3250a(file);
    }

    /* renamed from: g */
    private static int m2934g(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    /* renamed from: h */
    private static C0783b m2935h(Context context, String str, int i) {
        C0784c cVar = new C0784c(str);
        XmlResourceParser d = m2931d(context, str, context.getPackageManager().resolveContentProvider(str, 128), i);
        while (true) {
            int next = d.next();
            if (next == 1) {
                return cVar;
            }
            if (next == 2) {
                String name = d.getName();
                File file = null;
                String attributeValue = d.getAttributeValue((String) null, "name");
                String attributeValue2 = d.getAttributeValue((String) null, "path");
                if ("root-path".equals(name)) {
                    file = f3401g;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] g = C0767a.m2897g(context, (String) null);
                    if (g.length > 0) {
                        file = g[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] f = C0767a.m2896f(context);
                    if (f.length > 0) {
                        file = f[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] a = C0782a.m2936a(context);
                    if (a.length > 0) {
                        file = a[0];
                    }
                }
                if (file != null) {
                    cVar.mo3252c(attributeValue, m2928a(file, attributeValue2));
                }
            }
        }
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            String str = providerInfo.authority.split(";")[0];
            HashMap hashMap = f3402h;
            synchronized (hashMap) {
                hashMap.remove(str);
            }
            this.f3403d = m2932e(context, str, this.f3404e);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.f3403d.mo3251b(uri).delete() ? 1 : 0;
    }

    public String getType(Uri uri) {
        String mimeTypeFromExtension;
        File b = this.f3403d.mo3251b(uri);
        int lastIndexOf = b.getName().lastIndexOf(46);
        if (lastIndexOf < 0 || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(b.getName().substring(lastIndexOf + 1))) == null) {
            return "application/octet-stream";
        }
        return mimeTypeFromExtension;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate() {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(this.f3403d.mo3251b(uri), m2934g(str));
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        String str3;
        File b = this.f3403d.mo3251b(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f3400f;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str4 : strArr) {
            if ("_display_name".equals(str4)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                if (queryParameter == null) {
                    str3 = b.getName();
                } else {
                    str3 = queryParameter;
                }
                objArr[i2] = str3;
            } else if ("_size".equals(str4)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(b.length());
            }
            i2 = i;
        }
        String[] c = m2930c(strArr3, i2);
        Object[] b2 = m2929b(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(c, 1);
        matrixCursor.addRow(b2);
        return matrixCursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    protected C0781h(int i) {
        this.f3404e = i;
    }
}

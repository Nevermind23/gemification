package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.C1696i;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: androidx.profileinstaller.c */
public class C1690c {

    /* renamed from: a */
    private final AssetManager f4918a;

    /* renamed from: b */
    private final Executor f4919b;

    /* renamed from: c */
    private final C1696i.C1699c f4920c;

    /* renamed from: d */
    private final byte[] f4921d;

    /* renamed from: e */
    private final File f4922e;

    /* renamed from: f */
    private final String f4923f;

    /* renamed from: g */
    private final String f4924g;

    /* renamed from: h */
    private final String f4925h;

    /* renamed from: i */
    private boolean f4926i = false;

    /* renamed from: j */
    private C1691d[] f4927j;

    /* renamed from: k */
    private byte[] f4928k;

    public C1690c(AssetManager assetManager, Executor executor, C1696i.C1699c cVar, String str, String str2, String str3, File file) {
        this.f4918a = assetManager;
        this.f4919b = executor;
        this.f4920c = cVar;
        this.f4923f = str;
        this.f4924g = str2;
        this.f4925h = str3;
        this.f4922e = file;
        this.f4921d = m5909d();
    }

    /* renamed from: b */
    private C1690c m5907b(C1691d[] dVarArr, byte[] bArr) {
        InputStream h;
        try {
            h = m5912h(this.f4918a, this.f4925h);
            if (h != null) {
                this.f4927j = C1704n.m5989q(h, C1704n.m5987o(h, C1704n.f4956b), bArr, dVarArr);
                h.close();
                return this;
            }
            if (h != null) {
                h.close();
            }
            return null;
        } catch (FileNotFoundException e) {
            this.f4920c.mo5126a(9, e);
        } catch (IOException e2) {
            this.f4920c.mo5126a(7, e2);
        } catch (IllegalStateException e3) {
            this.f4927j = null;
            this.f4920c.mo5126a(8, e3);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: c */
    private void m5908c() {
        if (!this.f4926i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    /* renamed from: d */
    private static byte[] m5909d() {
        int i = Build.VERSION.SDK_INT;
        if (i < 24 || i > 33) {
            return null;
        }
        switch (i) {
            case 24:
            case 25:
                return C1711r.f4971e;
            case 26:
                return C1711r.f4970d;
            case 27:
                return C1711r.f4969c;
            case 28:
            case 29:
            case 30:
                return C1711r.f4968b;
            case 31:
            case 32:
            case 33:
                return C1711r.f4967a;
            default:
                return null;
        }
    }

    /* renamed from: f */
    private InputStream m5910f(AssetManager assetManager) {
        try {
            return m5912h(assetManager, this.f4924g);
        } catch (FileNotFoundException e) {
            this.f4920c.mo5126a(6, e);
            return null;
        } catch (IOException e2) {
            this.f4920c.mo5126a(7, e2);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m5911g(int i, Object obj) {
        this.f4920c.mo5126a(i, obj);
    }

    /* renamed from: h */
    private InputStream m5912h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f4920c.mo5127b(5, (Object) null);
            }
            return null;
        }
    }

    /* renamed from: j */
    private C1691d[] m5913j(InputStream inputStream) {
        try {
            C1691d[] w = C1704n.m5995w(inputStream, C1704n.m5987o(inputStream, C1704n.f4955a), this.f4923f);
            try {
                inputStream.close();
                return w;
            } catch (IOException e) {
                this.f4920c.mo5126a(7, e);
                return w;
            }
        } catch (IOException e2) {
            this.f4920c.mo5126a(7, e2);
            inputStream.close();
            return null;
        } catch (IllegalStateException e3) {
            this.f4920c.mo5126a(8, e3);
            try {
                inputStream.close();
            } catch (IOException e4) {
                this.f4920c.mo5126a(7, e4);
            }
            return null;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                this.f4920c.mo5126a(7, e5);
            }
            throw th;
        }
    }

    /* renamed from: k */
    private static boolean m5914k() {
        int i = Build.VERSION.SDK_INT;
        if (i < 24 || i > 33) {
            return false;
        }
        if (!(i == 24 || i == 25)) {
            switch (i) {
                case 31:
                case 32:
                case 33:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    private void m5915l(int i, Object obj) {
        this.f4919b.execute(new C1689b(this, i, obj));
    }

    /* renamed from: e */
    public boolean mo5132e() {
        if (this.f4921d == null) {
            m5915l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        } else if (!this.f4922e.canWrite()) {
            m5915l(4, (Object) null);
            return false;
        } else {
            this.f4926i = true;
            return true;
        }
    }

    /* renamed from: i */
    public C1690c mo5133i() {
        C1690c b;
        m5908c();
        if (this.f4921d == null) {
            return this;
        }
        InputStream f = m5910f(this.f4918a);
        if (f != null) {
            this.f4927j = m5913j(f);
        }
        C1691d[] dVarArr = this.f4927j;
        if (dVarArr == null || !m5914k() || (b = m5907b(dVarArr, this.f4921d)) == null) {
            return this;
        }
        return b;
    }

    /* renamed from: m */
    public C1690c mo5134m() {
        ByteArrayOutputStream byteArrayOutputStream;
        C1691d[] dVarArr = this.f4927j;
        byte[] bArr = this.f4921d;
        if (!(dVarArr == null || bArr == null)) {
            m5908c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                C1704n.m5962E(byteArrayOutputStream, bArr);
                if (!C1704n.m5959B(byteArrayOutputStream, bArr, dVarArr)) {
                    this.f4920c.mo5126a(5, (Object) null);
                    this.f4927j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f4928k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f4927j = null;
            } catch (IOException e) {
                this.f4920c.mo5126a(7, e);
            } catch (IllegalStateException e2) {
                this.f4920c.mo5126a(8, e2);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return this;
        throw th;
    }

    /* renamed from: n */
    public boolean mo5135n() {
        FileOutputStream fileOutputStream;
        byte[] bArr = this.f4928k;
        if (bArr == null) {
            return false;
        }
        m5908c();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                fileOutputStream = new FileOutputStream(this.f4922e);
                C1692e.m5931l(byteArrayInputStream, fileOutputStream);
                m5915l(1, (Object) null);
                fileOutputStream.close();
                byteArrayInputStream.close();
                this.f4928k = null;
                this.f4927j = null;
                return true;
            } catch (Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e) {
            m5915l(6, e);
            this.f4928k = null;
            this.f4927j = null;
            return false;
        } catch (IOException e2) {
            try {
                m5915l(7, e2);
                this.f4928k = null;
                this.f4927j = null;
                return false;
            } catch (Throwable th2) {
                this.f4928k = null;
                this.f4927j = null;
                throw th2;
            }
        } catch (Throwable th3) {
            th.addSuppressed(th3);
        }
        throw th;
    }
}

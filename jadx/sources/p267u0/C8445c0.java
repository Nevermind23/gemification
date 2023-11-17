package p267u0;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C41536l;
import p002a1.C0015a;
import p293w0.C8722b;
import p293w0.C8723c;
import p318y0.C8998i;
import p318y0.C8999j;

/* renamed from: u0.c0 */
public final class C8445c0 implements C8999j, C8476i {

    /* renamed from: d */
    private final Context f24016d;

    /* renamed from: e */
    private final String f24017e;

    /* renamed from: f */
    private final File f24018f;

    /* renamed from: g */
    private final Callable f24019g;

    /* renamed from: h */
    private final int f24020h;

    /* renamed from: i */
    private final C8999j f24021i;

    /* renamed from: j */
    private C8474h f24022j;

    /* renamed from: k */
    private boolean f24023k;

    public C8445c0(Context context, String str, File file, Callable callable, int i, C8999j jVar) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(jVar, "delegate");
        this.f24016d = context;
        this.f24017e = str;
        this.f24018f = file;
        this.f24019g = callable;
        this.f24020h = i;
        this.f24021i = jVar;
    }

    /* renamed from: c */
    private final void m31680c(File file, boolean z) {
        ReadableByteChannel readableByteChannel;
        if (this.f24017e != null) {
            readableByteChannel = Channels.newChannel(this.f24016d.getAssets().open(this.f24017e));
            C41536l.m120488h(readableByteChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.f24018f != null) {
            readableByteChannel = new FileInputStream(this.f24018f).getChannel();
            C41536l.m120488h(readableByteChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable callable = this.f24019g;
            if (callable != null) {
                try {
                    readableByteChannel = Channels.newChannel((InputStream) callable.call());
                    C41536l.m120488h(readableByteChannel, "newChannel(inputStream)");
                } catch (Exception e) {
                    throw new IOException("inputStreamCallable exception on call", e);
                }
            } else {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f24016d.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(createTempFile).getChannel();
        C41536l.m120488h(channel, "output");
        C8723c.m32488a(readableByteChannel, channel);
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            C41536l.m120488h(createTempFile, "intermediateFile");
            m31681d(createTempFile, z);
            if (!createTempFile.renameTo(file)) {
                throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
            }
            return;
        }
        throw new IOException("Failed to create directories for " + file.getAbsolutePath());
    }

    /* renamed from: d */
    private final void m31681d(File file, boolean z) {
        C8474h hVar = this.f24022j;
        if (hVar == null) {
            C41536l.m120506z("databaseConfiguration");
            hVar = null;
        }
        hVar.getClass();
    }

    /* renamed from: f */
    private final void m31682f(boolean z) {
        String databaseName = getDatabaseName();
        if (databaseName != null) {
            File databasePath = this.f24016d.getDatabasePath(databaseName);
            C8474h hVar = this.f24022j;
            C8474h hVar2 = null;
            if (hVar == null) {
                C41536l.m120506z("databaseConfiguration");
                hVar = null;
            }
            C0015a aVar = new C0015a(databaseName, this.f24016d.getFilesDir(), hVar.f24092s);
            try {
                C0015a.m105c(aVar, false, 1, (Object) null);
                if (!databasePath.exists()) {
                    C41536l.m120488h(databasePath, "databaseFile");
                    m31680c(databasePath, z);
                    aVar.mo69d();
                    return;
                }
                try {
                    C41536l.m120488h(databasePath, "databaseFile");
                    int d = C8722b.m32487d(databasePath);
                    if (d == this.f24020h) {
                        aVar.mo69d();
                        return;
                    }
                    C8474h hVar3 = this.f24022j;
                    if (hVar3 == null) {
                        C41536l.m120506z("databaseConfiguration");
                    } else {
                        hVar2 = hVar3;
                    }
                    if (hVar2.mo23743a(d, this.f24020h)) {
                        aVar.mo69d();
                        return;
                    }
                    if (this.f24016d.deleteDatabase(databaseName)) {
                        try {
                            m31680c(databasePath, z);
                        } catch (IOException e) {
                            Log.w("ROOM", "Unable to copy database file.", e);
                        }
                    } else {
                        Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                    }
                    aVar.mo69d();
                } catch (IOException e2) {
                    Log.w("ROOM", "Unable to read database version.", e2);
                    aVar.mo69d();
                }
            } catch (IOException e3) {
                throw new RuntimeException("Unable to copy database file.", e3);
            } catch (Throwable th) {
                aVar.mo69d();
                throw th;
            }
        } else {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    /* renamed from: Z0 */
    public C8998i mo23643Z0() {
        if (!this.f24023k) {
            m31682f(true);
            this.f24023k = true;
        }
        return mo23644a().mo23643Z0();
    }

    /* renamed from: a */
    public C8999j mo23644a() {
        return this.f24021i;
    }

    public synchronized void close() {
        mo23644a().close();
        this.f24023k = false;
    }

    /* renamed from: e */
    public final void mo23646e(C8474h hVar) {
        C41536l.m120489i(hVar, "databaseConfiguration");
        this.f24022j = hVar;
    }

    public String getDatabaseName() {
        return mo23644a().getDatabaseName();
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        mo23644a().setWriteAheadLoggingEnabled(z);
    }
}

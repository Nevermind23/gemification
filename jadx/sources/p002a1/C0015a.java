package p002a1;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: a1.a */
public final class C0015a {

    /* renamed from: e */
    public static final C0016a f45e = new C0016a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Map f46f = new HashMap();

    /* renamed from: a */
    private final boolean f47a;

    /* renamed from: b */
    private final File f48b;

    /* renamed from: c */
    private final Lock f49c;

    /* renamed from: d */
    private FileChannel f50d;

    /* renamed from: a1.a$a */
    public static final class C0016a {
        private C0016a() {
        }

        public /* synthetic */ C0016a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final Lock m109b(String str) {
            Lock lock;
            synchronized (C0015a.f46f) {
                Map a = C0015a.f46f;
                Object obj = a.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    a.put(str, obj);
                }
                lock = (Lock) obj;
            }
            return lock;
        }
    }

    public C0015a(String str, File file, boolean z) {
        File file2;
        C41536l.m120489i(str, "name");
        this.f47a = z;
        if (file != null) {
            file2 = new File(file, str + ".lck");
        } else {
            file2 = null;
        }
        this.f48b = file2;
        this.f49c = f45e.m109b(str);
    }

    /* renamed from: c */
    public static /* synthetic */ void m105c(C0015a aVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = aVar.f47a;
        }
        aVar.mo68b(z);
    }

    /* renamed from: b */
    public final void mo68b(boolean z) {
        this.f49c.lock();
        if (z) {
            try {
                File file = this.f48b;
                if (file != null) {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileChannel channel = new FileOutputStream(this.f48b).getChannel();
                    channel.lock();
                    this.f50d = channel;
                    return;
                }
                throw new IOException("No lock directory was provided.");
            } catch (IOException e) {
                this.f50d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
            }
        }
    }

    /* renamed from: d */
    public final void mo69d() {
        try {
            FileChannel fileChannel = this.f50d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f49c.unlock();
    }
}

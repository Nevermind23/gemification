package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.concurrent.futures.C0618d;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* renamed from: androidx.profileinstaller.q */
public abstract class C1707q {

    /* renamed from: a */
    private static final C0618d f4957a = C0618d.m2377x();

    /* renamed from: b */
    private static final Object f4958b = new Object();

    /* renamed from: c */
    private static C1710c f4959c = null;

    /* renamed from: androidx.profileinstaller.q$a */
    private static class C1708a {
        /* renamed from: a */
        static PackageInfo m6004a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0));
        }
    }

    /* renamed from: androidx.profileinstaller.q$b */
    static class C1709b {

        /* renamed from: a */
        final int f4960a;

        /* renamed from: b */
        final int f4961b;

        /* renamed from: c */
        final long f4962c;

        /* renamed from: d */
        final long f4963d;

        C1709b(int i, int i2, long j, long j2) {
            this.f4960a = i;
            this.f4961b = i2;
            this.f4962c = j;
            this.f4963d = j2;
        }

        /* renamed from: a */
        static C1709b m6005a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                C1709b bVar = new C1709b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5143b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f4960a);
                dataOutputStream.writeInt(this.f4961b);
                dataOutputStream.writeLong(this.f4962c);
                dataOutputStream.writeLong(this.f4963d);
                dataOutputStream.close();
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof C1709b)) {
                return false;
            }
            C1709b bVar = (C1709b) obj;
            if (this.f4961b == bVar.f4961b && this.f4962c == bVar.f4962c && this.f4960a == bVar.f4960a && this.f4963d == bVar.f4963d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.f4961b), Long.valueOf(this.f4962c), Integer.valueOf(this.f4960a), Long.valueOf(this.f4963d)});
        }
    }

    /* renamed from: androidx.profileinstaller.q$c */
    public static class C1710c {

        /* renamed from: a */
        final int f4964a;

        /* renamed from: b */
        private final boolean f4965b;

        /* renamed from: c */
        private final boolean f4966c;

        C1710c(int i, boolean z, boolean z2) {
            this.f4964a = i;
            this.f4966c = z2;
            this.f4965b = z;
        }
    }

    /* renamed from: a */
    private static long m6001a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return C1708a.m6004a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* renamed from: b */
    private static C1710c m6002b(int i, boolean z, boolean z2) {
        C1710c cVar = new C1710c(i, z, z2);
        f4959c = cVar;
        f4957a.mo2818t(cVar);
        return f4959c;
    }

    /* renamed from: c */
    static C1710c m6003c(Context context, boolean z) {
        boolean z2;
        boolean z3;
        C1709b bVar;
        C1709b bVar2;
        C1710c cVar;
        if (!z && (cVar = f4959c) != null) {
            return cVar;
        }
        synchronized (f4958b) {
            if (!z) {
                C1710c cVar2 = f4959c;
                if (cVar2 != null) {
                    return cVar2;
                }
            }
            int i = Build.VERSION.SDK_INT;
            int i2 = 0;
            if (i >= 28) {
                if (i != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    if (!file.exists() || length <= 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    if (!file2.exists() || length2 <= 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    try {
                        long a = m6001a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                bVar = C1709b.m6005a(file3);
                            } catch (IOException unused) {
                                return m6002b(131072, z2, z3);
                            }
                        } else {
                            bVar = null;
                        }
                        if (bVar != null && bVar.f4962c == a) {
                            int i3 = bVar.f4961b;
                            if (i3 != 2) {
                                i2 = i3;
                                if (z && z3 && i2 != 1) {
                                    i2 = 2;
                                }
                                if (bVar != null && bVar.f4961b == 2 && i2 == 1 && length < bVar.f4963d) {
                                    i2 = 3;
                                }
                                bVar2 = new C1709b(1, i2, a, length2);
                                if (bVar == null || !bVar.equals(bVar2)) {
                                    bVar2.mo5143b(file3);
                                }
                                C1710c b = m6002b(i2, z2, z3);
                                return b;
                            }
                        }
                        if (z2) {
                            i2 = 1;
                        } else if (z3) {
                            i2 = 2;
                        }
                        i2 = 2;
                        i2 = 3;
                        bVar2 = new C1709b(1, i2, a, length2);
                        try {
                            bVar2.mo5143b(file3);
                        } catch (IOException unused2) {
                            i2 = 196608;
                        }
                        C1710c b2 = m6002b(i2, z2, z3);
                        return b2;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        return m6002b(65536, z2, z3);
                    }
                }
            }
            C1710c b3 = m6002b(262144, false, false);
            return b3;
        }
    }
}

package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: androidx.profileinstaller.i */
public abstract class C1696i {

    /* renamed from: a */
    private static final C1699c f4948a = new C1697a();

    /* renamed from: b */
    static final C1699c f4949b = new C1698b();

    /* renamed from: androidx.profileinstaller.i$a */
    class C1697a implements C1699c {
        C1697a() {
        }

        /* renamed from: a */
        public void mo5126a(int i, Object obj) {
        }

        /* renamed from: b */
        public void mo5127b(int i, Object obj) {
        }
    }

    /* renamed from: androidx.profileinstaller.i$b */
    class C1698b implements C1699c {
        C1698b() {
        }

        /* renamed from: a */
        public void mo5126a(int i, Object obj) {
            String str;
            switch (i) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
                default:
                    str = "";
                    break;
            }
            if (i == 6 || i == 7 || i == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }

        /* renamed from: b */
        public void mo5127b(int i, Object obj) {
            String str;
            if (i == 1) {
                str = "DIAGNOSTIC_CURRENT_PROFILE_EXISTS";
            } else if (i == 2) {
                str = "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST";
            } else if (i == 3) {
                str = "DIAGNOSTIC_REF_PROFILE_EXISTS";
            } else if (i == 4) {
                str = "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST";
            } else if (i != 5) {
                str = "";
            } else {
                str = "DIAGNOSTIC_PROFILE_IS_COMPRESSED";
            }
            Log.d("ProfileInstaller", str);
        }
    }

    /* renamed from: androidx.profileinstaller.i$c */
    public interface C1699c {
        /* renamed from: a */
        void mo5126a(int i, Object obj);

        /* renamed from: b */
        void mo5127b(int i, Object obj);
    }

    /* renamed from: b */
    static boolean m5941b(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    /* renamed from: c */
    static void m5942c(Context context, Executor executor, C1699c cVar) {
        m5941b(context.getFilesDir());
        m5946g(executor, cVar, 11, (Object) null);
    }

    /* renamed from: d */
    static boolean m5943d(PackageInfo packageInfo, File file, C1699c cVar) {
        DataInputStream dataInputStream;
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        boolean z = false;
        if (!file2.exists()) {
            return false;
        }
        try {
            dataInputStream = new DataInputStream(new FileInputStream(file2));
            long readLong = dataInputStream.readLong();
            dataInputStream.close();
            if (readLong == packageInfo.lastUpdateTime) {
                z = true;
            }
            if (z) {
                cVar.mo5126a(2, (Object) null);
            }
            return z;
        } catch (IOException unused) {
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: f */
    static void m5945f(PackageInfo packageInfo, File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: g */
    static void m5946g(Executor executor, C1699c cVar, int i, Object obj) {
        executor.execute(new C1695h(cVar, i, obj));
    }

    /* renamed from: h */
    private static boolean m5947h(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, C1699c cVar) {
        C1690c cVar2 = new C1690c(assetManager, executor, cVar, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!cVar2.mo5132e()) {
            return false;
        }
        boolean n = cVar2.mo5133i().mo5134m().mo5135n();
        if (n) {
            m5945f(packageInfo, file);
        }
        return n;
    }

    /* renamed from: i */
    public static void m5948i(Context context) {
        m5949j(context, new C1694g(), f4948a);
    }

    /* renamed from: j */
    public static void m5949j(Context context, Executor executor, C1699c cVar) {
        m5950k(context, executor, cVar, false);
    }

    /* renamed from: k */
    static void m5950k(Context context, Executor executor, C1699c cVar, boolean z) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z2 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (z || !m5943d(packageInfo, filesDir, cVar)) {
                Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
                if (m5947h(assets, packageName, packageInfo, filesDir, name, executor, cVar) && z) {
                    z2 = true;
                }
                C1707q.m6003c(context, z2);
                return;
            }
            Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
            C1707q.m6003c(context, false);
        } catch (PackageManager.NameNotFoundException e) {
            cVar.mo5126a(7, e);
            C1707q.m6003c(context, false);
        }
    }

    /* renamed from: l */
    static void m5951l(Context context, Executor executor, C1699c cVar) {
        try {
            m5945f(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            m5946g(executor, cVar, 10, (Object) null);
        } catch (PackageManager.NameNotFoundException e) {
            m5946g(executor, cVar, 7, e);
        }
    }
}

package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.collection.ArraySet;
import androidx.core.util.C1008h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: androidx.emoji2.text.e */
public class C1378e {

    /* renamed from: n */
    private static final Object f3934n = new Object();

    /* renamed from: o */
    private static final Object f3935o = new Object();

    /* renamed from: p */
    private static volatile C1378e f3936p;

    /* renamed from: a */
    private final ReadWriteLock f3937a = new ReentrantReadWriteLock();

    /* renamed from: b */
    private final Set f3938b;

    /* renamed from: c */
    private volatile int f3939c = 3;

    /* renamed from: d */
    private final Handler f3940d;

    /* renamed from: e */
    private final C1381b f3941e;

    /* renamed from: f */
    final C1386g f3942f;

    /* renamed from: g */
    final boolean f3943g;

    /* renamed from: h */
    final boolean f3944h;

    /* renamed from: i */
    final int[] f3945i;

    /* renamed from: j */
    private final boolean f3946j;

    /* renamed from: k */
    private final int f3947k;

    /* renamed from: l */
    private final int f3948l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1383d f3949m;

    /* renamed from: androidx.emoji2.text.e$a */
    private static final class C1379a extends C1381b {

        /* renamed from: b */
        private volatile C1391h f3950b;

        /* renamed from: c */
        private volatile C1403m f3951c;

        /* renamed from: androidx.emoji2.text.e$a$a */
        class C1380a extends C1387h {
            C1380a() {
            }

            /* renamed from: a */
            public void mo3978a(Throwable th) {
                C1379a.this.f3953a.mo3992m(th);
            }

            /* renamed from: b */
            public void mo3979b(C1403m mVar) {
                C1379a.this.mo4004d(mVar);
            }
        }

        C1379a(C1378e eVar) {
            super(eVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4001a() {
            try {
                this.f3953a.f3942f.mo3976a(new C1380a());
            } catch (Throwable th) {
                this.f3953a.mo3992m(th);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public CharSequence mo4002b(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.f3950b.mo4021h(charSequence, i, i2, i3, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4003c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f3951c.mo4045e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f3953a.f3943g);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4004d(C1403m mVar) {
            if (mVar == null) {
                this.f3953a.mo3992m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f3951c = mVar;
            C1403m mVar2 = this.f3951c;
            C1388i iVar = new C1388i();
            C1383d a = this.f3953a.f3949m;
            C1378e eVar = this.f3953a;
            this.f3950b = new C1391h(mVar2, iVar, a, eVar.f3944h, eVar.f3945i);
            this.f3953a.mo3993n();
        }
    }

    /* renamed from: androidx.emoji2.text.e$b */
    private static class C1381b {

        /* renamed from: a */
        final C1378e f3953a;

        C1381b(C1378e eVar) {
            this.f3953a = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo4001a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract CharSequence mo4002b(CharSequence charSequence, int i, int i2, int i3, boolean z);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract void mo4003c(EditorInfo editorInfo);
    }

    /* renamed from: androidx.emoji2.text.e$c */
    public static abstract class C1382c {

        /* renamed from: a */
        final C1386g f3954a;

        /* renamed from: b */
        boolean f3955b;

        /* renamed from: c */
        boolean f3956c;

        /* renamed from: d */
        int[] f3957d;

        /* renamed from: e */
        Set f3958e;

        /* renamed from: f */
        boolean f3959f;

        /* renamed from: g */
        int f3960g = -16711936;

        /* renamed from: h */
        int f3961h = 0;

        /* renamed from: i */
        C1383d f3962i = new C1377d();

        protected C1382c(C1386g gVar) {
            C1008h.m3531h(gVar, "metadataLoader cannot be null.");
            this.f3954a = gVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final C1386g mo4005a() {
            return this.f3954a;
        }

        /* renamed from: b */
        public C1382c mo4006b(int i) {
            this.f3961h = i;
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.e$d */
    public interface C1383d {
        /* renamed from: a */
        boolean mo3987a(CharSequence charSequence, int i, int i2, int i3);
    }

    /* renamed from: androidx.emoji2.text.e$e */
    public static abstract class C1384e {
        /* renamed from: a */
        public void mo1789a(Throwable th) {
        }

        /* renamed from: b */
        public void mo1790b() {
        }
    }

    /* renamed from: androidx.emoji2.text.e$f */
    private static class C1385f implements Runnable {

        /* renamed from: d */
        private final List f3963d;

        /* renamed from: e */
        private final Throwable f3964e;

        /* renamed from: f */
        private final int f3965f;

        C1385f(C1384e eVar, int i) {
            this(Arrays.asList(new C1384e[]{(C1384e) C1008h.m3531h(eVar, "initCallback cannot be null")}), i, (Throwable) null);
        }

        public void run() {
            int size = this.f3963d.size();
            int i = 0;
            if (this.f3965f != 1) {
                while (i < size) {
                    ((C1384e) this.f3963d.get(i)).mo1789a(this.f3964e);
                    i++;
                }
                return;
            }
            while (i < size) {
                ((C1384e) this.f3963d.get(i)).mo1790b();
                i++;
            }
        }

        C1385f(Collection collection, int i) {
            this(collection, i, (Throwable) null);
        }

        C1385f(Collection collection, int i, Throwable th) {
            C1008h.m3531h(collection, "initCallbacks cannot be null");
            this.f3963d = new ArrayList(collection);
            this.f3965f = i;
            this.f3964e = th;
        }
    }

    /* renamed from: androidx.emoji2.text.e$g */
    public interface C1386g {
        /* renamed from: a */
        void mo3976a(C1387h hVar);
    }

    /* renamed from: androidx.emoji2.text.e$h */
    public static abstract class C1387h {
        /* renamed from: a */
        public abstract void mo3978a(Throwable th);

        /* renamed from: b */
        public abstract void mo3979b(C1403m mVar);
    }

    /* renamed from: androidx.emoji2.text.e$i */
    static class C1388i {
        C1388i() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1394i mo4008a(C1390g gVar) {
            return new C1407o(gVar);
        }
    }

    private C1378e(C1382c cVar) {
        this.f3943g = cVar.f3955b;
        this.f3944h = cVar.f3956c;
        this.f3945i = cVar.f3957d;
        this.f3946j = cVar.f3959f;
        this.f3947k = cVar.f3960g;
        this.f3942f = cVar.f3954a;
        this.f3948l = cVar.f3961h;
        this.f3949m = cVar.f3962i;
        this.f3940d = new Handler(Looper.getMainLooper());
        ArraySet arraySet = new ArraySet();
        this.f3938b = arraySet;
        Set set = cVar.f3958e;
        if (set != null && !set.isEmpty()) {
            arraySet.addAll(cVar.f3958e);
        }
        this.f3941e = new C1379a(this);
        m4736l();
    }

    /* renamed from: b */
    public static C1378e m4730b() {
        C1378e eVar;
        boolean z;
        synchronized (f3934n) {
            eVar = f3936p;
            if (eVar != null) {
                z = true;
            } else {
                z = false;
            }
            C1008h.m3532i(z, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    /* renamed from: e */
    public static boolean m4731e(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        return C1391h.m4781c(inputConnection, editable, i, i2, z);
    }

    /* renamed from: f */
    public static boolean m4732f(Editable editable, int i, KeyEvent keyEvent) {
        return C1391h.m4782d(editable, i, keyEvent);
    }

    /* renamed from: g */
    public static C1378e m4733g(C1382c cVar) {
        C1378e eVar = f3936p;
        if (eVar == null) {
            synchronized (f3934n) {
                eVar = f3936p;
                if (eVar == null) {
                    eVar = new C1378e(cVar);
                    f3936p = eVar;
                }
            }
        }
        return eVar;
    }

    /* renamed from: h */
    public static boolean m4734h() {
        return f3936p != null;
    }

    /* renamed from: j */
    private boolean m4735j() {
        return mo3989d() == 1;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: l */
    private void m4736l() {
        this.f3937a.writeLock().lock();
        try {
            if (this.f3948l == 0) {
                this.f3939c = 0;
            }
            this.f3937a.writeLock().unlock();
            if (mo3989d() == 0) {
                this.f3941e.mo4001a();
            }
        } catch (Throwable th) {
            this.f3937a.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public int mo3988c() {
        return this.f3947k;
    }

    /* renamed from: d */
    public int mo3989d() {
        this.f3937a.readLock().lock();
        try {
            return this.f3939c;
        } finally {
            this.f3937a.readLock().unlock();
        }
    }

    /* renamed from: i */
    public boolean mo3990i() {
        return this.f3946j;
    }

    /* renamed from: k */
    public void mo3991k() {
        boolean z = true;
        if (this.f3948l != 1) {
            z = false;
        }
        C1008h.m3532i(z, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (!m4735j()) {
            this.f3937a.writeLock().lock();
            try {
                if (this.f3939c != 0) {
                    this.f3939c = 0;
                    this.f3937a.writeLock().unlock();
                    this.f3941e.mo4001a();
                }
            } finally {
                this.f3937a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo3992m(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f3937a.writeLock().lock();
        try {
            this.f3939c = 2;
            arrayList.addAll(this.f3938b);
            this.f3938b.clear();
            this.f3937a.writeLock().unlock();
            this.f3940d.post(new C1385f(arrayList, this.f3939c, th));
        } catch (Throwable th2) {
            this.f3937a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo3993n() {
        ArrayList arrayList = new ArrayList();
        this.f3937a.writeLock().lock();
        try {
            this.f3939c = 1;
            arrayList.addAll(this.f3938b);
            this.f3938b.clear();
            this.f3937a.writeLock().unlock();
            this.f3940d.post(new C1385f((Collection) arrayList, this.f3939c));
        } catch (Throwable th) {
            this.f3937a.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: o */
    public CharSequence mo3994o(CharSequence charSequence) {
        int i;
        if (charSequence == null) {
            i = 0;
        } else {
            i = charSequence.length();
        }
        return mo3995p(charSequence, 0, i);
    }

    /* renamed from: p */
    public CharSequence mo3995p(CharSequence charSequence, int i, int i2) {
        return mo3996q(charSequence, i, i2, Integer.MAX_VALUE);
    }

    /* renamed from: q */
    public CharSequence mo3996q(CharSequence charSequence, int i, int i2, int i3) {
        return mo3997r(charSequence, i, i2, i3, 0);
    }

    /* renamed from: r */
    public CharSequence mo3997r(CharSequence charSequence, int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C1008h.m3532i(m4735j(), "Not initialized yet");
        C1008h.m3528e(i, "start cannot be negative");
        C1008h.m3528e(i2, "end cannot be negative");
        C1008h.m3528e(i3, "maxEmojiCount cannot be negative");
        boolean z5 = false;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        C1008h.m3525b(z, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        if (i <= charSequence.length()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1008h.m3525b(z2, "start should be < than charSequence length");
        if (i2 <= charSequence.length()) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1008h.m3525b(z3, "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                z5 = this.f3943g;
            }
            z4 = z5;
        } else {
            z4 = true;
        }
        return this.f3941e.mo4002b(charSequence, i, i2, i3, z4);
    }

    /* renamed from: s */
    public void mo3998s(C1384e eVar) {
        C1008h.m3531h(eVar, "initCallback cannot be null");
        this.f3937a.writeLock().lock();
        try {
            if (this.f3939c != 1) {
                if (this.f3939c != 2) {
                    this.f3938b.add(eVar);
                }
            }
            this.f3940d.post(new C1385f(eVar, this.f3939c));
        } finally {
            this.f3937a.writeLock().unlock();
        }
    }

    /* renamed from: t */
    public void mo3999t(C1384e eVar) {
        C1008h.m3531h(eVar, "initCallback cannot be null");
        this.f3937a.writeLock().lock();
        try {
            this.f3938b.remove(eVar);
        } finally {
            this.f3937a.writeLock().unlock();
        }
    }

    /* renamed from: u */
    public void mo4000u(EditorInfo editorInfo) {
        if (m4735j() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.f3941e.mo4003c(editorInfo);
        }
    }
}

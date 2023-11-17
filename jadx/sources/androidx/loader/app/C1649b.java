package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.SparseArrayCompat;
import androidx.core.util.C1001b;
import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1630r0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.C1645y;
import androidx.loader.app.C1647a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p163m0.C7047a;
import p176n0.C7188b;

/* renamed from: androidx.loader.app.b */
class C1649b extends C1647a {

    /* renamed from: c */
    static boolean f4669c = false;

    /* renamed from: a */
    private final C1619q f4670a;

    /* renamed from: b */
    private final C1652c f4671b;

    /* renamed from: androidx.loader.app.b$a */
    public static class C1650a extends C1644x implements C7188b.C7189a {

        /* renamed from: l */
        private final int f4672l;

        /* renamed from: m */
        private final Bundle f4673m;

        /* renamed from: n */
        private final C7188b f4674n;

        /* renamed from: o */
        private C1619q f4675o;

        /* renamed from: p */
        private C1651b f4676p;

        /* renamed from: q */
        private C7188b f4677q;

        C1650a(int i, Bundle bundle, C7188b bVar, C7188b bVar2) {
            this.f4672l = i;
            this.f4673m = bundle;
            this.f4674n = bVar;
            this.f4677q = bVar2;
            bVar.mo21543q(i, this);
        }

        /* renamed from: a */
        public void mo4968a(C7188b bVar, Object obj) {
            if (C1649b.f4669c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo4826r(obj);
                return;
            }
            if (C1649b.f4669c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            mo4823o(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public void mo4821m() {
            if (C1649b.f4669c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f4674n.mo21546t();
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public void mo4822n() {
            if (C1649b.f4669c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f4674n.mo21548u();
        }

        /* renamed from: p */
        public void mo4824p(C1645y yVar) {
            super.mo4824p(yVar);
            this.f4675o = null;
            this.f4676p = null;
        }

        /* renamed from: r */
        public void mo4826r(Object obj) {
            super.mo4826r(obj);
            C7188b bVar = this.f4677q;
            if (bVar != null) {
                bVar.mo21544r();
                this.f4677q = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public C7188b mo4969s(boolean z) {
            if (C1649b.f4669c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f4674n.mo21532b();
            this.f4674n.mo21531a();
            C1651b bVar = this.f4676p;
            if (bVar != null) {
                mo4824p(bVar);
                if (z) {
                    bVar.mo4977c();
                }
            }
            this.f4674n.mo21549v(this);
            if ((bVar == null || bVar.mo4976b()) && !z) {
                return this.f4674n;
            }
            this.f4674n.mo21544r();
            return this.f4677q;
        }

        /* renamed from: t */
        public void mo4970t(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f4672l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f4673m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f4674n);
            C7188b bVar = this.f4674n;
            bVar.mo21519g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f4676p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f4676p);
                C1651b bVar2 = this.f4676p;
                bVar2.mo4975a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(mo4972u().mo21534d(mo4814f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(mo4816h());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f4672l);
            sb.append(" : ");
            C1001b.m3508a(this.f4674n, sb);
            sb.append("}}");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public C7188b mo4972u() {
            return this.f4674n;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo4973v() {
            C1619q qVar = this.f4675o;
            C1651b bVar = this.f4676p;
            if (qVar != null && bVar != null) {
                super.mo4824p(bVar);
                mo4819k(qVar, bVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public C7188b mo4974w(C1619q qVar, C1647a.C1648a aVar) {
            C1651b bVar = new C1651b(this.f4674n, aVar);
            mo4819k(qVar, bVar);
            C1651b bVar2 = this.f4676p;
            if (bVar2 != null) {
                mo4824p(bVar2);
            }
            this.f4675o = qVar;
            this.f4676p = bVar;
            return this.f4674n;
        }
    }

    /* renamed from: androidx.loader.app.b$b */
    static class C1651b implements C1645y {

        /* renamed from: a */
        private final C7188b f4678a;

        /* renamed from: b */
        private final C1647a.C1648a f4679b;

        /* renamed from: c */
        private boolean f4680c = false;

        C1651b(C7188b bVar, C1647a.C1648a aVar) {
            this.f4678a = bVar;
            this.f4679b = aVar;
        }

        /* renamed from: a */
        public void mo4975a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f4680c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo4976b() {
            return this.f4680c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4977c() {
            if (this.f4680c) {
                if (C1649b.f4669c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f4678a);
                }
                this.f4679b.mo4964a(this.f4678a);
            }
        }

        public void onChanged(Object obj) {
            if (C1649b.f4669c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f4678a + ": " + this.f4678a.mo21534d(obj));
            }
            this.f4679b.mo4965b(this.f4678a, obj);
            this.f4680c = true;
        }

        public String toString() {
            return this.f4679b.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$c */
    static class C1652c extends C1613n0 {

        /* renamed from: f */
        private static final C1620q0.C1624b f4681f = new C1653a();

        /* renamed from: d */
        private SparseArrayCompat f4682d = new SparseArrayCompat();

        /* renamed from: e */
        private boolean f4683e = false;

        /* renamed from: androidx.loader.app.b$c$a */
        static class C1653a implements C1620q0.C1624b {
            C1653a() {
            }

            /* renamed from: a */
            public /* synthetic */ C1613n0 mo4803a(Class cls, C7047a aVar) {
                return C1630r0.m5685b(this, cls, aVar);
            }

            /* renamed from: b */
            public C1613n0 mo4804b(Class cls) {
                return new C1652c();
            }
        }

        C1652c() {
        }

        /* renamed from: fw */
        static C1652c m5750fw(C1636t0 t0Var) {
            return (C1652c) new C1620q0(t0Var, f4681f).mo4936a(C1652c.class);
        }

        /* renamed from: dw */
        public void mo4979dw(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f4682d.size() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f4682d.size(); i++) {
                    C1650a aVar = (C1650a) this.f4682d.valueAt(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f4682d.keyAt(i));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.mo4970t(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ew */
        public void mo4980ew() {
            this.f4683e = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: gw */
        public C1650a mo4981gw(int i) {
            return (C1650a) this.f4682d.get(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: hw */
        public boolean mo4982hw() {
            return this.f4683e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: iw */
        public void mo4983iw() {
            int size = this.f4682d.size();
            for (int i = 0; i < size; i++) {
                ((C1650a) this.f4682d.valueAt(i)).mo4973v();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: jw */
        public void mo4984jw(int i, C1650a aVar) {
            this.f4682d.put(i, aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: kw */
        public void mo4985kw() {
            this.f4683e = true;
        }

        /* access modifiers changed from: protected */
        public void onCleared() {
            super.onCleared();
            int size = this.f4682d.size();
            for (int i = 0; i < size; i++) {
                ((C1650a) this.f4682d.valueAt(i)).mo4969s(true);
            }
            this.f4682d.clear();
        }
    }

    C1649b(C1619q qVar, C1636t0 t0Var) {
        this.f4670a = qVar;
        this.f4671b = C1652c.m5750fw(t0Var);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private C7188b m5733e(int i, Bundle bundle, C1647a.C1648a aVar, C7188b bVar) {
        try {
            this.f4671b.mo4985kw();
            C7188b c = aVar.mo4966c(i, bundle);
            if (c != null) {
                if (c.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(c.getClass().getModifiers())) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + c);
                    }
                }
                C1650a aVar2 = new C1650a(i, bundle, c, bVar);
                if (f4669c) {
                    Log.v("LoaderManager", "  Created new loader " + aVar2);
                }
                this.f4671b.mo4984jw(i, aVar2);
                this.f4671b.mo4980ew();
                return aVar2.mo4974w(this.f4670a, aVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f4671b.mo4980ew();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo4961a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f4671b.mo4979dw(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: c */
    public C7188b mo4962c(int i, Bundle bundle, C1647a.C1648a aVar) {
        if (this.f4671b.mo4982hw()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C1650a gw = this.f4671b.mo4981gw(i);
            if (f4669c) {
                Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
            }
            if (gw == null) {
                return m5733e(i, bundle, aVar, (C7188b) null);
            }
            if (f4669c) {
                Log.v("LoaderManager", "  Re-using existing loader " + gw);
            }
            return gw.mo4974w(this.f4670a, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    /* renamed from: d */
    public void mo4963d() {
        this.f4671b.mo4983iw();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C1001b.m3508a(this.f4670a, sb);
        sb.append("}}");
        return sb.toString();
    }
}

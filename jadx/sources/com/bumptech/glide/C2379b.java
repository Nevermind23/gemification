package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.support.p013v4.media.session.C0125b;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.load.engine.C2457j;
import com.bumptech.glide.manager.C2561d;
import com.bumptech.glide.manager.C2578r;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005a4.C0045a;
import p005a4.C0048d;
import p035c4.C2256h;
import p050d4.C5823g;
import p050d4.C5825i;
import p089g4.C6223k;
import p089g4.C6224l;
import p205p3.C7674b;
import p205p3.C7676d;
import p218q3.C7877h;

/* renamed from: com.bumptech.glide.b */
public class C2379b implements ComponentCallbacks2 {

    /* renamed from: n */
    private static volatile C2379b f7536n;

    /* renamed from: o */
    private static volatile boolean f7537o;

    /* renamed from: d */
    private final C2457j f7538d;

    /* renamed from: e */
    private final C7676d f7539e;

    /* renamed from: f */
    private final C7877h f7540f;

    /* renamed from: g */
    private final C2386d f7541g;

    /* renamed from: h */
    private final C7674b f7542h;

    /* renamed from: i */
    private final C2578r f7543i;

    /* renamed from: j */
    private final C2561d f7544j;

    /* renamed from: k */
    private final List f7545k = new ArrayList();

    /* renamed from: l */
    private final C2380a f7546l;

    /* renamed from: m */
    private C2389f f7547m = C2389f.NORMAL;

    /* renamed from: com.bumptech.glide.b$a */
    public interface C2380a {
        /* renamed from: a */
        C2256h mo7698a();
    }

    C2379b(Context context, C2457j jVar, C7877h hVar, C7676d dVar, C7674b bVar, C2578r rVar, C2561d dVar2, int i, C2380a aVar, Map map, List list, List list2, C0045a aVar2, C2387e eVar) {
        this.f7538d = jVar;
        this.f7539e = dVar;
        C7674b bVar2 = bVar;
        this.f7542h = bVar2;
        this.f7540f = hVar;
        this.f7543i = rVar;
        this.f7544j = dVar2;
        C2380a aVar3 = aVar;
        this.f7546l = aVar3;
        this.f7541g = new C2386d(context, bVar2, C2392i.m9245d(this, list2, aVar2), new C5823g(), aVar3, map, list, jVar, eVar, i);
    }

    /* renamed from: a */
    static void m9203a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f7537o) {
            f7537o = true;
            try {
                m9207m(context, generatedAppGlideModule);
            } finally {
                f7537o = false;
            }
        } else {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
    }

    /* renamed from: c */
    public static C2379b m9204c(Context context) {
        if (f7536n == null) {
            GeneratedAppGlideModule d = m9205d(context.getApplicationContext());
            synchronized (C2379b.class) {
                if (f7536n == null) {
                    m9203a(context, d);
                }
            }
        }
        return f7536n;
    }

    /* renamed from: d */
    private static GeneratedAppGlideModule m9205d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context.getApplicationContext()});
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
        } catch (InstantiationException e) {
            m9209q(e);
        } catch (IllegalAccessException e2) {
            m9209q(e2);
        } catch (NoSuchMethodException e3) {
            m9209q(e3);
        } catch (InvocationTargetException e4) {
            m9209q(e4);
        }
        return null;
    }

    /* renamed from: l */
    private static C2578r m9206l(Context context) {
        C6223k.m24731e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m9204c(context).mo7690k();
    }

    /* renamed from: m */
    private static void m9207m(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        m9208n(context, new C2381c(), generatedAppGlideModule);
    }

    /* renamed from: n */
    private static void m9208n(Context context, C2381c cVar, GeneratedAppGlideModule generatedAppGlideModule) {
        C2578r.C2580b bVar;
        Context applicationContext = context.getApplicationContext();
        List emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.mo96c()) {
            emptyList = new C0048d(applicationContext).mo98b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.mo7662d().isEmpty()) {
            generatedAppGlideModule.mo7662d();
            Iterator it = emptyList.iterator();
            if (it.hasNext()) {
                C0125b.m366a(it.next());
                throw null;
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = emptyList.iterator();
            if (it2.hasNext()) {
                C0125b.m366a(it2.next());
                new StringBuilder().append("Discovered GlideModule from manifest: ");
                throw null;
            }
        }
        if (generatedAppGlideModule != null) {
            bVar = generatedAppGlideModule.mo7663e();
        } else {
            bVar = null;
        }
        cVar.mo7700b(bVar);
        Iterator it3 = emptyList.iterator();
        if (!it3.hasNext()) {
            if (generatedAppGlideModule != null) {
                generatedAppGlideModule.mo95b(applicationContext, cVar);
            }
            C2379b a = cVar.mo7699a(applicationContext, emptyList, generatedAppGlideModule);
            applicationContext.registerComponentCallbacks(a);
            f7536n = a;
            return;
        }
        C0125b.m366a(it3.next());
        throw null;
    }

    /* renamed from: q */
    private static void m9209q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: t */
    public static C2396k m9210t(Context context) {
        return m9206l(context).mo8081l(context);
    }

    /* renamed from: u */
    public static C2396k m9211u(View view) {
        return m9206l(view.getContext()).mo8082m(view);
    }

    /* renamed from: v */
    public static C2396k m9212v(Fragment fragment) {
        return m9206l(fragment.getContext()).mo8083n(fragment);
    }

    /* renamed from: w */
    public static C2396k m9213w(C1505h hVar) {
        return m9206l(hVar).mo8084o(hVar);
    }

    /* renamed from: b */
    public void mo7683b() {
        C6224l.m24733b();
        this.f7540f.mo22847b();
        this.f7539e.mo22394b();
        this.f7542h.mo22386b();
    }

    /* renamed from: e */
    public C7674b mo7684e() {
        return this.f7542h;
    }

    /* renamed from: f */
    public C7676d mo7685f() {
        return this.f7539e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C2561d mo7686g() {
        return this.f7544j;
    }

    /* renamed from: h */
    public Context mo7687h() {
        return this.f7541g.getBaseContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C2386d mo7688i() {
        return this.f7541g;
    }

    /* renamed from: j */
    public Registry mo7689j() {
        return this.f7541g.mo7709i();
    }

    /* renamed from: k */
    public C2578r mo7690k() {
        return this.f7543i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo7691o(C2396k kVar) {
        synchronized (this.f7545k) {
            if (!this.f7545k.contains(kVar)) {
                this.f7545k.add(kVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        mo7683b();
    }

    public void onTrimMemory(int i) {
        mo7696r(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo7695p(C5825i iVar) {
        synchronized (this.f7545k) {
            for (C2396k F : this.f7545k) {
                if (F.mo7738F(iVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: r */
    public void mo7696r(int i) {
        C6224l.m24733b();
        synchronized (this.f7545k) {
            for (C2396k onTrimMemory : this.f7545k) {
                onTrimMemory.onTrimMemory(i);
            }
        }
        this.f7540f.mo22841a(i);
        this.f7539e.mo22393a(i);
        this.f7542h.mo22385a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo7697s(C2396k kVar) {
        synchronized (this.f7545k) {
            if (this.f7545k.contains(kVar)) {
                this.f7545k.remove(kVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }
}

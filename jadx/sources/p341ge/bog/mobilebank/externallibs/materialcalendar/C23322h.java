package p341ge.bog.mobilebank.externallibs.materialcalendar;

import android.graphics.drawable.Drawable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.h */
public class C23322h {

    /* renamed from: a */
    private boolean f61039a = false;

    /* renamed from: b */
    private Drawable f61040b = null;

    /* renamed from: c */
    private Drawable f61041c = null;

    /* renamed from: d */
    private final LinkedList f61042d = new LinkedList();

    /* renamed from: e */
    private boolean f61043e = false;

    /* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.h$a */
    static class C23323a {

        /* renamed from: a */
        final Object f61044a;

        public C23323a(Object obj) {
            this.f61044a = obj;
        }
    }

    C23322h() {
    }

    /* renamed from: a */
    public void mo59067a(Object obj) {
        LinkedList linkedList = this.f61042d;
        if (linkedList != null) {
            linkedList.add(new C23323a(obj));
            this.f61039a = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo59068b(C23322h hVar) {
        Drawable drawable = this.f61041c;
        if (drawable != null) {
            hVar.mo59077k(drawable);
        }
        Drawable drawable2 = this.f61040b;
        if (drawable2 != null) {
            hVar.mo59075i(drawable2);
        }
        hVar.f61042d.addAll(this.f61042d);
        hVar.f61039a |= this.f61039a;
        hVar.f61043e = this.f61043e;
    }

    /* renamed from: c */
    public boolean mo59069c() {
        return this.f61043e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Drawable mo59070d() {
        return this.f61040b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Drawable mo59071e() {
        return this.f61041c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public List mo59072f() {
        return Collections.unmodifiableList(this.f61042d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo59073g() {
        return this.f61039a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo59074h() {
        this.f61040b = null;
        this.f61041c = null;
        this.f61042d.clear();
        this.f61039a = false;
        this.f61043e = false;
    }

    /* renamed from: i */
    public void mo59075i(Drawable drawable) {
        if (drawable != null) {
            this.f61040b = drawable;
            this.f61039a = true;
            return;
        }
        throw new IllegalArgumentException("Cannot be null");
    }

    /* renamed from: j */
    public void mo59076j(boolean z) {
        this.f61043e = z;
        this.f61039a = true;
    }

    /* renamed from: k */
    public void mo59077k(Drawable drawable) {
        if (drawable != null) {
            this.f61041c = drawable;
            this.f61039a = true;
            return;
        }
        throw new IllegalArgumentException("Cannot be null");
    }
}

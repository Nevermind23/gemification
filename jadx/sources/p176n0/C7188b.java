package p176n0;

import android.content.Context;
import androidx.core.util.C1001b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: n0.b */
public abstract class C7188b {

    /* renamed from: a */
    int f21332a;

    /* renamed from: b */
    C7189a f21333b;

    /* renamed from: c */
    Context f21334c;

    /* renamed from: d */
    boolean f21335d = false;

    /* renamed from: e */
    boolean f21336e = false;

    /* renamed from: f */
    boolean f21337f = true;

    /* renamed from: g */
    boolean f21338g = false;

    /* renamed from: h */
    boolean f21339h = false;

    /* renamed from: n0.b$a */
    public interface C7189a {
        /* renamed from: a */
        void mo4968a(C7188b bVar, Object obj);
    }

    public C7188b(Context context) {
        this.f21334c = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo21531a() {
        this.f21336e = true;
        mo21539j();
    }

    /* renamed from: b */
    public boolean mo21532b() {
        return mo21520k();
    }

    /* renamed from: c */
    public void mo21533c() {
        this.f21339h = false;
    }

    /* renamed from: d */
    public String mo21534d(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        C1001b.m3508a(obj, sb);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: e */
    public void mo21535e() {
    }

    /* renamed from: f */
    public void mo21536f(Object obj) {
        C7189a aVar = this.f21333b;
        if (aVar != null) {
            aVar.mo4968a(this, obj);
        }
    }

    /* renamed from: g */
    public void mo21519g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f21332a);
        printWriter.print(" mListener=");
        printWriter.println(this.f21333b);
        if (this.f21335d || this.f21338g || this.f21339h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f21335d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f21338g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f21339h);
        }
        if (this.f21336e || this.f21337f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f21336e);
            printWriter.print(" mReset=");
            printWriter.println(this.f21337f);
        }
    }

    /* renamed from: h */
    public void mo21537h() {
        mo21521m();
    }

    /* renamed from: i */
    public boolean mo21538i() {
        return this.f21336e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo21539j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract boolean mo21520k();

    /* renamed from: l */
    public void mo21540l() {
        if (this.f21335d) {
            mo21537h();
        } else {
            this.f21338g = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo21521m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo21541n() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract void mo19850o();

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo21542p() {
    }

    /* renamed from: q */
    public void mo21543q(int i, C7189a aVar) {
        if (this.f21333b == null) {
            this.f21333b = aVar;
            this.f21332a = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    /* renamed from: r */
    public void mo21544r() {
        mo21541n();
        this.f21337f = true;
        this.f21335d = false;
        this.f21336e = false;
        this.f21338g = false;
        this.f21339h = false;
    }

    /* renamed from: s */
    public void mo21545s() {
        if (this.f21339h) {
            mo21540l();
        }
    }

    /* renamed from: t */
    public final void mo21546t() {
        this.f21335d = true;
        this.f21337f = false;
        this.f21336e = false;
        mo19850o();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C1001b.m3508a(this, sb);
        sb.append(" id=");
        sb.append(this.f21332a);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public void mo21548u() {
        this.f21335d = false;
        mo21542p();
    }

    /* renamed from: v */
    public void mo21549v(C7189a aVar) {
        C7189a aVar2 = this.f21333b;
        if (aVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (aVar2 == aVar) {
            this.f21333b = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }
}

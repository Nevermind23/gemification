package com.bumptech.glide.load.engine;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p166m3.C7079a;
import p166m3.C7083e;

public final class GlideException extends Exception {

    /* renamed from: j */
    private static final StackTraceElement[] f7671j = new StackTraceElement[0];
    private static final long serialVersionUID = 1;

    /* renamed from: d */
    private final List f7672d;

    /* renamed from: e */
    private C7083e f7673e;

    /* renamed from: f */
    private C7079a f7674f;

    /* renamed from: g */
    private Class f7675g;

    /* renamed from: h */
    private String f7676h;

    /* renamed from: i */
    private Exception f7677i;

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    /* renamed from: a */
    private void m9414a(Throwable th, List list) {
        if (th instanceof GlideException) {
            for (Throwable a : ((GlideException) th).mo7819e()) {
                m9414a(a, list);
            }
            return;
        }
        list.add(th);
    }

    /* renamed from: b */
    private static void m9415b(List list, Appendable appendable) {
        try {
            m9416c(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private static void m9416c(List list, Appendable appendable) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).m9418h(appendable);
            } else {
                m9417d(th, appendable);
            }
            i = i2;
        }
    }

    /* renamed from: d */
    private static void m9417d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: h */
    private void m9418h(Appendable appendable) {
        m9417d(this, appendable);
        m9415b(mo7819e(), new C2433a(appendable));
    }

    /* renamed from: e */
    public List mo7819e() {
        return this.f7672d;
    }

    /* renamed from: f */
    public List mo7820f() {
        ArrayList arrayList = new ArrayList();
        m9414a(this, arrayList);
        return arrayList;
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    /* renamed from: g */
    public void mo7822g(String str) {
        List f = mo7820f();
        int size = f.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), (Throwable) f.get(i));
            i = i2;
        }
    }

    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f7676h);
        String str3 = "";
        if (this.f7675g != null) {
            str = ", " + this.f7675g;
        } else {
            str = str3;
        }
        sb.append(str);
        if (this.f7674f != null) {
            str2 = ", " + this.f7674f;
        } else {
            str2 = str3;
        }
        sb.append(str2);
        if (this.f7673e != null) {
            str3 = ", " + this.f7673e;
        }
        sb.append(str3);
        List<Throwable> f = mo7820f();
        if (f.isEmpty()) {
            return sb.toString();
        }
        if (f.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(f.size());
            sb.append(" root causes:");
        }
        for (Throwable th : f) {
            sb.append(10);
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo7824i(C7083e eVar, C7079a aVar) {
        mo7825k(eVar, aVar, (Class) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo7825k(C7083e eVar, C7079a aVar, Class cls) {
        this.f7673e = eVar;
        this.f7674f = aVar;
        this.f7675g = cls;
    }

    /* renamed from: l */
    public void mo7826l(Exception exc) {
        this.f7677i = exc;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public GlideException(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    public void printStackTrace(PrintStream printStream) {
        m9418h(printStream);
    }

    public GlideException(String str, List list) {
        this.f7676h = str;
        setStackTrace(f7671j);
        this.f7672d = list;
    }

    public void printStackTrace(PrintWriter printWriter) {
        m9418h(printWriter);
    }

    /* renamed from: com.bumptech.glide.load.engine.GlideException$a */
    private static final class C2433a implements Appendable {

        /* renamed from: d */
        private final Appendable f7678d;

        /* renamed from: e */
        private boolean f7679e = true;

        C2433a(Appendable appendable) {
            this.f7678d = appendable;
        }

        /* renamed from: a */
        private CharSequence m9425a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        public Appendable append(char c) {
            boolean z = false;
            if (this.f7679e) {
                this.f7679e = false;
                this.f7678d.append("  ");
            }
            if (c == 10) {
                z = true;
            }
            this.f7679e = z;
            this.f7678d.append(c);
            return this;
        }

        public Appendable append(CharSequence charSequence) {
            CharSequence a = m9425a(charSequence);
            return append(a, 0, a.length());
        }

        public Appendable append(CharSequence charSequence, int i, int i2) {
            CharSequence a = m9425a(charSequence);
            boolean z = false;
            if (this.f7679e) {
                this.f7679e = false;
                this.f7678d.append("  ");
            }
            if (a.length() > 0 && a.charAt(i2 - 1) == 10) {
                z = true;
            }
            this.f7679e = z;
            this.f7678d.append(a, i, i2);
            return this;
        }
    }
}

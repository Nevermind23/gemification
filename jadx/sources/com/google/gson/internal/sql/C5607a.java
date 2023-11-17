package com.google.gson.internal.sql;

import com.google.gson.C5624r;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import java.sql.Date;
import java.sql.Timestamp;

/* renamed from: com.google.gson.internal.sql.a */
public abstract class C5607a {

    /* renamed from: a */
    public static final boolean f17795a;

    /* renamed from: b */
    public static final DefaultDateTypeAdapter.C5505b f17796b;

    /* renamed from: c */
    public static final DefaultDateTypeAdapter.C5505b f17797c;

    /* renamed from: d */
    public static final C5624r f17798d;

    /* renamed from: e */
    public static final C5624r f17799e;

    /* renamed from: f */
    public static final C5624r f17800f;

    /* renamed from: com.google.gson.internal.sql.a$a */
    class C5608a extends DefaultDateTypeAdapter.C5505b {
        C5608a(Class cls) {
            super(cls);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Date mo18255d(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    /* renamed from: com.google.gson.internal.sql.a$b */
    class C5609b extends DefaultDateTypeAdapter.C5505b {
        C5609b(Class cls) {
            super(cls);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Timestamp mo18255d(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f17795a = z;
        if (z) {
            f17796b = new C5608a(Date.class);
            f17797c = new C5609b(Timestamp.class);
            f17798d = SqlDateTypeAdapter.f17789b;
            f17799e = SqlTimeTypeAdapter.f17791b;
            f17800f = SqlTimestampTypeAdapter.f17793b;
            return;
        }
        f17796b = null;
        f17797c = null;
        f17798d = null;
        f17799e = null;
        f17800f = null;
    }
}

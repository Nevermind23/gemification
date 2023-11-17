package com.google.android.gms.common.api;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C3860c;
import com.google.android.gms.common.internal.C3958b;
import com.google.android.gms.common.internal.C3966e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p143k6.C6824f;
import p156l6.C6935d;
import p156l6.C6946i;
import p182n6.C7249c;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.common.api.a */
public final class C3847a {

    /* renamed from: a */
    private final C3848a f12265a;

    /* renamed from: b */
    private final C3856g f12266b;

    /* renamed from: c */
    private final String f12267c;

    /* renamed from: com.google.android.gms.common.api.a$a */
    public static abstract class C3848a extends C3854e {
        /* renamed from: c */
        public C3855f mo113c(Context context, Looper looper, C7249c cVar, Object obj, C3860c.C3862b bVar, C3860c.C3863c cVar2) {
            return mo115d(context, looper, cVar, obj, bVar, cVar2);
        }

        /* renamed from: d */
        public C3855f mo115d(Context context, Looper looper, C7249c cVar, Object obj, C6935d dVar, C6946i iVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    public interface C3849b {
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    public static class C3850c {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    public interface C3851d {

        /* renamed from: T2 */
        public static final C3852a f12268T2 = new C3852a((C6824f) null);

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        public static final class C3852a implements C3853b {
            /* synthetic */ C3852a(C6824f fVar) {
            }
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        public interface C3853b extends C3851d {
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
    public static abstract class C3854e {
        /* renamed from: a */
        public List mo114a(Object obj) {
            return Collections.emptyList();
        }

        /* renamed from: b */
        public int mo11917b() {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$f */
    public interface C3855f extends C3849b {
        /* renamed from: b */
        void mo11918b();

        /* renamed from: c */
        boolean mo11919c();

        /* renamed from: d */
        boolean mo11920d();

        /* renamed from: e */
        void mo11921e(String str);

        /* renamed from: f */
        boolean mo11922f();

        /* renamed from: g */
        String mo11923g();

        /* renamed from: h */
        void mo11924h(C3958b.C3961c cVar);

        /* renamed from: i */
        boolean mo11925i();

        /* renamed from: k */
        boolean mo7052k();

        /* renamed from: m */
        Set mo11926m();

        /* renamed from: n */
        void mo11927n(C3966e eVar, Set set);

        /* renamed from: o */
        void mo11928o(C3958b.C3963e eVar);

        /* renamed from: p */
        void mo11929p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        /* renamed from: q */
        int mo7053q();

        /* renamed from: r */
        Feature[] mo11930r();

        /* renamed from: t */
        String mo11931t();

        /* renamed from: u */
        Intent mo11932u();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    public static final class C3856g extends C3850c {
    }

    public C3847a(String str, C3848a aVar, C3856g gVar) {
        C7264i.m27903l(aVar, "Cannot construct an Api with a null ClientBuilder");
        C7264i.m27903l(gVar, "Cannot construct an Api with a null ClientKey");
        this.f12267c = str;
        this.f12265a = aVar;
        this.f12266b = gVar;
    }

    /* renamed from: a */
    public final C3848a mo11913a() {
        return this.f12265a;
    }

    /* renamed from: b */
    public final C3850c mo11914b() {
        return this.f12266b;
    }

    /* renamed from: c */
    public final C3854e mo11915c() {
        return this.f12265a;
    }

    /* renamed from: d */
    public final String mo11916d() {
        return this.f12267c;
    }
}

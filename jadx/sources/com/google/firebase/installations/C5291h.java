package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p011aa.C0095d;
import p041ca.C2286a;
import p041ca.C2287b;

/* renamed from: com.google.firebase.installations.h */
public final class C5291h {

    /* renamed from: b */
    public static final long f16926b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    private static final Pattern f16927c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    private static C5291h f16928d;

    /* renamed from: a */
    private final C2286a f16929a;

    private C5291h(C2286a aVar) {
        this.f16929a = aVar;
    }

    /* renamed from: c */
    public static C5291h m20893c() {
        return m20894d(C2287b.m8754b());
    }

    /* renamed from: d */
    public static C5291h m20894d(C2286a aVar) {
        if (f16928d == null) {
            f16928d = new C5291h(aVar);
        }
        return f16928d;
    }

    /* renamed from: g */
    static boolean m20895g(String str) {
        return f16927c.matcher(str).matches();
    }

    /* renamed from: h */
    static boolean m20896h(String str) {
        return str.contains(":");
    }

    /* renamed from: a */
    public long mo17512a() {
        return this.f16929a.mo7326a();
    }

    /* renamed from: b */
    public long mo17513b() {
        return TimeUnit.MILLISECONDS.toSeconds(mo17512a());
    }

    /* renamed from: e */
    public long mo17514e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean mo17515f(C0095d dVar) {
        if (!TextUtils.isEmpty(dVar.mo130b()) && dVar.mo137h() + dVar.mo131c() >= mo17513b() + f16926b) {
            return false;
        }
        return true;
    }
}

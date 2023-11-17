package p139k2;

import com.google.gson.Gson;
import java.lang.reflect.Type;
import p152l2.C6870d;
import p316xa.C8982a;

/* renamed from: k2.a */
public final class C6774a extends C6870d.C6871a {

    /* renamed from: a */
    private final Gson f20359a;

    public C6774a(Gson gson) {
        this.f20359a = gson;
    }

    /* renamed from: a */
    public C6870d mo20822a(Type type) {
        return new C6775b(this.f20359a, this.f20359a.mo18175q(C8982a.get(type)));
    }
}

package p139k2;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import of1.C41884e0;
import p152l2.C6870d;

/* renamed from: k2.b */
final class C6775b implements C6870d {

    /* renamed from: a */
    private final Gson f20360a;

    /* renamed from: b */
    private final TypeAdapter f20361b;

    C6775b(Gson gson, TypeAdapter typeAdapter) {
        this.f20360a = gson;
        this.f20361b = typeAdapter;
    }

    /* renamed from: b */
    public Object mo20823a(C41884e0 e0Var) {
        try {
            return this.f20361b.mo18185b(this.f20360a.mo18177t(e0Var.mo96794k()));
        } finally {
            e0Var.close();
        }
    }
}

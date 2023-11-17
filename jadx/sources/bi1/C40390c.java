package bi1;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import of1.C41884e0;
import p328ya.C9143a;
import p328ya.C9145b;
import zh1.C43455h;

/* renamed from: bi1.c */
final class C40390c implements C43455h {

    /* renamed from: a */
    private final Gson f95973a;

    /* renamed from: b */
    private final TypeAdapter f95974b;

    C40390c(Gson gson, TypeAdapter typeAdapter) {
        this.f95973a = gson;
        this.f95974b = typeAdapter;
    }

    /* renamed from: b */
    public Object mo94450a(C41884e0 e0Var) {
        C9143a t = this.f95973a.mo18177t(e0Var.mo96794k());
        try {
            Object b = this.f95974b.mo18185b(t);
            if (t.mo18348n0() == C9145b.END_DOCUMENT) {
                return b;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            e0Var.close();
        }
    }
}

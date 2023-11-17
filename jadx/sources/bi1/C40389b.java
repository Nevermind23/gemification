package bi1;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import dg1.C40672b;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import of1.C41872c0;
import of1.C41937x;
import p328ya.C9146c;
import zh1.C43455h;

/* renamed from: bi1.b */
final class C40389b implements C43455h {

    /* renamed from: c */
    private static final C41937x f95969c = C41937x.m121708e("application/json; charset=UTF-8");

    /* renamed from: d */
    private static final Charset f95970d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final Gson f95971a;

    /* renamed from: b */
    private final TypeAdapter f95972b;

    C40389b(Gson gson, TypeAdapter typeAdapter) {
        this.f95971a = gson;
        this.f95972b = typeAdapter;
    }

    /* renamed from: b */
    public C41872c0 mo94450a(Object obj) {
        C40672b bVar = new C40672b();
        C9146c u = this.f95971a.mo18179u(new OutputStreamWriter(bVar.mo94718U(), f95970d));
        this.f95972b.mo18186d(u, obj);
        u.close();
        return C41872c0.m121331d(f95969c, bVar.mo94743n0());
    }
}

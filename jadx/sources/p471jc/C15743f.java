package p471jc;

import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p443hc.C15476f;
import p443hc.C15478h;
import p443hc.C15480j;

/* renamed from: jc.f */
public final class C15743f {

    /* renamed from: a */
    private C15478h f44625a;

    /* renamed from: b */
    private C15476f f44626b;

    /* renamed from: c */
    private C15480j f44627c;

    /* renamed from: d */
    private int f44628d = -1;

    /* renamed from: e */
    private C15738b f44629e;

    /* renamed from: b */
    public static boolean m56719b(int i) {
        return i >= 0 && i < 8;
    }

    /* renamed from: a */
    public C15738b mo43126a() {
        return this.f44629e;
    }

    /* renamed from: c */
    public void mo43127c(C15476f fVar) {
        this.f44626b = fVar;
    }

    /* renamed from: d */
    public void mo43128d(int i) {
        this.f44628d = i;
    }

    /* renamed from: e */
    public void mo43129e(C15738b bVar) {
        this.f44629e = bVar;
    }

    /* renamed from: f */
    public void mo43130f(C15478h hVar) {
        this.f44625a = hVar;
    }

    /* renamed from: g */
    public void mo43131g(C15480j jVar) {
        this.f44627c = jVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(BogInputLayout.INPUT_NORMAL_STATE);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f44625a);
        sb.append("\n ecLevel: ");
        sb.append(this.f44626b);
        sb.append("\n version: ");
        sb.append(this.f44627c);
        sb.append("\n maskPattern: ");
        sb.append(this.f44628d);
        if (this.f44629e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f44629e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}

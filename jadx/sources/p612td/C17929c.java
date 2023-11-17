package p612td;

import android.content.res.TypedArray;
import p458id.C15607g;

/* renamed from: td.c */
public class C17929c {

    /* renamed from: a */
    private C17928b f51025a = null;

    public C17929c(TypedArray typedArray) {
        try {
            this.f51025a = (C17928b) Class.forName(typedArray.getString(C15607g.f44371k)).newInstance();
        } catch (Exception unused) {
            this.f51025a = new C17930d();
        }
    }

    /* renamed from: a */
    public C17928b mo45604a() {
        return this.f51025a;
    }
}

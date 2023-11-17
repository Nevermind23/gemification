package p244s3;

import com.bumptech.glide.load.data.C2415d;
import java.util.Collections;
import java.util.List;
import p089g4.C6223k;
import p166m3.C7083e;
import p166m3.C7088h;

/* renamed from: s3.n */
public interface C8188n {

    /* renamed from: s3.n$a */
    public static class C8189a {

        /* renamed from: a */
        public final C7083e f23349a;

        /* renamed from: b */
        public final List f23350b;

        /* renamed from: c */
        public final C2415d f23351c;

        public C8189a(C7083e eVar, C2415d dVar) {
            this(eVar, Collections.emptyList(), dVar);
        }

        public C8189a(C7083e eVar, List list, C2415d dVar) {
            this.f23349a = (C7083e) C6223k.m24730d(eVar);
            this.f23350b = (List) C6223k.m24730d(list);
            this.f23351c = (C2415d) C6223k.m24730d(dVar);
        }
    }

    /* renamed from: a */
    C8189a mo23326a(Object obj, int i, int i2, C7088h hVar);

    /* renamed from: b */
    boolean mo23327b(Object obj);
}

package com.google.protobuf;

import com.google.protobuf.C5679h1;

/* renamed from: com.google.protobuf.a0 */
public class C5629a0 {

    /* renamed from: a */
    private final C5630a f17827a;

    /* renamed from: b */
    private final Object f17828b;

    /* renamed from: c */
    private final Object f17829c;

    /* renamed from: com.google.protobuf.a0$a */
    static class C5630a {

        /* renamed from: a */
        public final C5679h1.C5681b f17830a;

        /* renamed from: b */
        public final Object f17831b;

        /* renamed from: c */
        public final C5679h1.C5681b f17832c;

        /* renamed from: d */
        public final Object f17833d;

        public C5630a(C5679h1.C5681b bVar, Object obj, C5679h1.C5681b bVar2, Object obj2) {
            this.f17830a = bVar;
            this.f17831b = obj;
            this.f17832c = bVar2;
            this.f17833d = obj2;
        }
    }

    private C5629a0(C5679h1.C5681b bVar, Object obj, C5679h1.C5681b bVar2, Object obj2) {
        this.f17827a = new C5630a(bVar, obj, bVar2, obj2);
        this.f17828b = obj;
        this.f17829c = obj2;
    }

    /* renamed from: b */
    static int m22438b(C5630a aVar, Object obj, Object obj2) {
        return C5699n.m22895b(aVar.f17830a, 1, obj) + C5699n.m22895b(aVar.f17832c, 2, obj2);
    }

    /* renamed from: d */
    public static C5629a0 m22439d(C5679h1.C5681b bVar, Object obj, C5679h1.C5681b bVar2, Object obj2) {
        return new C5629a0(bVar, obj, bVar2, obj2);
    }

    /* renamed from: e */
    static void m22440e(CodedOutputStream codedOutputStream, C5630a aVar, Object obj, Object obj2) {
        C5699n.m22905u(codedOutputStream, aVar.f17830a, 1, obj);
        C5699n.m22905u(codedOutputStream, aVar.f17832c, 2, obj2);
    }

    /* renamed from: a */
    public int mo18520a(int i, Object obj, Object obj2) {
        return CodedOutputStream.m22319O(i) + CodedOutputStream.m22351z(m22438b(this.f17827a, obj, obj2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C5630a mo18521c() {
        return this.f17827a;
    }
}

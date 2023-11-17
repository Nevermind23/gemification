package com.google.protobuf;

import com.google.protobuf.C5677h0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.protobuf.a */
public abstract class C5627a implements C5677h0 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.a$a */
    public static abstract class C5628a implements C5677h0.C5678a {
        /* renamed from: l */
        protected static void m22435l(Iterable iterable, List list) {
            C5716s.m22990a(iterable);
            if (iterable instanceof C5731x) {
                List a0 = ((C5731x) iterable).mo18578a0();
                C5731x xVar = (C5731x) list;
                int size = list.size();
                for (Object next : a0) {
                    if (next == null) {
                        String str = "Element at index " + (xVar.size() - size) + " is null.";
                        for (int size2 = xVar.size() - 1; size2 >= size; size2--) {
                            xVar.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (next instanceof C5648f) {
                        xVar.mo18580f((C5648f) next);
                    } else {
                        xVar.add((String) next);
                    }
                }
            } else if (iterable instanceof C5713q0) {
                list.addAll((Collection) iterable);
            } else {
                m22436m(iterable, list);
            }
        }

        /* renamed from: m */
        private static void m22436m(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object next : iterable) {
                if (next == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(next);
            }
        }

        /* renamed from: n */
        protected static UninitializedMessageException m22437n(C5677h0 h0Var) {
            return new UninitializedMessageException(h0Var);
        }
    }

    /* renamed from: i */
    protected static void m22431i(Iterable iterable, List list) {
        C5628a.m22435l(iterable, list);
    }

    /* renamed from: m */
    private String m22432m(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public abstract int mo18518l(C5728v0 v0Var);

    /* renamed from: n */
    public byte[] mo18519n() {
        try {
            byte[] bArr = new byte[mo18704d()];
            CodedOutputStream X = CodedOutputStream.m22326X(bArr);
            mo18706g(X);
            X.mo18491c();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(m22432m("byte array"), e);
        }
    }
}

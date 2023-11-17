package com.google.protobuf;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: com.google.protobuf.h1 */
public abstract class C5679h1 {

    /* renamed from: a */
    static final int f17904a = m22754c(1, 3);

    /* renamed from: b */
    static final int f17905b = m22754c(1, 4);

    /* renamed from: c */
    static final int f17906c = m22754c(2, 0);

    /* renamed from: d */
    static final int f17907d = m22754c(3, 2);

    /* renamed from: com.google.protobuf.h1$b */
    public enum C5681b {
        DOUBLE(C5686c.DOUBLE, 1),
        FLOAT(C5686c.FLOAT, 5),
        INT64(r1, 0),
        UINT64(r1, 0),
        INT32(r2, 0),
        FIXED64(r1, 1),
        FIXED32(r2, 5),
        BOOL(C5686c.BOOLEAN, 0),
        STRING(C5686c.STRING, 2) {
        },
        GROUP(r8, 3) {
        },
        MESSAGE(r8, 2) {
        },
        BYTES(C5686c.BYTE_STRING, 2) {
        },
        UINT32(r2, 0),
        ENUM(C5686c.ENUM, 0),
        SFIXED32(r2, 5),
        SFIXED64(r1, 1),
        SINT32(r2, 0),
        SINT64(r1, 0);
        

        /* renamed from: d */
        private final C5686c f17927d;

        /* renamed from: e */
        private final int f17928e;

        /* renamed from: b */
        public C5686c mo18708b() {
            return this.f17927d;
        }

        /* renamed from: c */
        public int mo18709c() {
            return this.f17928e;
        }

        private C5681b(C5686c cVar, int i) {
            this.f17927d = cVar;
            this.f17928e = i;
        }
    }

    /* renamed from: com.google.protobuf.h1$c */
    public enum C5686c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(Utils.FLOAT_EPSILON)),
        DOUBLE(Double.valueOf(Utils.DOUBLE_EPSILON)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(C5648f.f17856e),
        ENUM((String) null),
        MESSAGE((String) null);
        

        /* renamed from: d */
        private final Object f17939d;

        private C5686c(Object obj) {
            this.f17939d = obj;
        }
    }

    /* renamed from: a */
    public static int m22752a(int i) {
        return i >>> 3;
    }

    /* renamed from: b */
    public static int m22753b(int i) {
        return i & 7;
    }

    /* renamed from: c */
    static int m22754c(int i, int i2) {
        return (i << 3) | i2;
    }
}

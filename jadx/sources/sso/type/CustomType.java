package sso.type;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p217q2.C7850l;

public enum CustomType implements C7850l {
    ;

    /* renamed from: sso.type.CustomType$ID */
    static final class C42925ID extends CustomType {
        C42925ID(String str, int i) {
            super(str, i, (DefaultConstructorMarker) null);
        }

        public String className() {
            return "kotlin.String";
        }

        public String typeName() {
            return "ID";
        }
    }

    static final class LONG extends CustomType {
        LONG(String str, int i) {
            super(str, i, (DefaultConstructorMarker) null);
        }

        public String className() {
            return "java.math.BigDecimal";
        }

        public String typeName() {
            return "Long";
        }
    }
}
